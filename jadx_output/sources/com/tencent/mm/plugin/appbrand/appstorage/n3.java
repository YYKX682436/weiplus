package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class n3 extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.y8 f76282d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f76283e = new java.util.HashMap();

    public n3(com.tencent.mm.plugin.appbrand.appcache.y8 y8Var) {
        this.f76282d = y8Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 b17 = b(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (b17 != j1Var) {
            return b17;
        }
        if (str.length() == 0) {
            return j1Var;
        }
        java.lang.String b18 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        if (!b18.substring(b18.length() - 1).equals("/")) {
            b18 = b18.concat("/");
        }
        java.util.Iterator it = this.f76282d.j().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info) it.next()).f75389e.startsWith(b18)) {
                return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            }
        }
        return b17;
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.j1 b(java.lang.String str) {
        java.io.InputStream c17 = this.f76282d.c(str);
        if (c17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(c17);
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    public final void c(java.lang.String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgFileSystem", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            if (!str.equals("")) {
                if (str.endsWith("/")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgFileSystem", "updateDirAccessTimeRecord: file = [%s] is illegal", str);
                    break;
                }
                str = str.substring(0, str.lastIndexOf("/"));
                if (str.equals("")) {
                    arrayList.add("/");
                } else {
                    arrayList.add(str.concat("/"));
                }
            } else {
                break;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            ((java.util.HashMap) this.f76283e).put(str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        if (!z17) {
            if (isdir(str) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                return null;
            }
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.y5.a(this.f76282d, str);
        if (android.text.TextUtils.isEmpty(a17)) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        this.f76282d.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return readDir(str, new ik1.b0());
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 b17 = b(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (b17 == j1Var) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_FILE;
        }
        java.lang.String b18 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info> j17 = this.f76282d.j();
        java.lang.String quote = java.util.regex.Pattern.quote(b18);
        for (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info : j17) {
            if (wxaPkg$Info.f75389e.startsWith(b18)) {
                java.lang.String replaceFirst = wxaPkg$Info.f75389e.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var = new com.tencent.mm.plugin.appbrand.appstorage.h1();
                    h1Var.f76193a = replaceFirst;
                    b0Var.f291824a = b0Var.f291824a == null ? new java.util.LinkedList() : (java.util.List) b0Var.f291824a;
                    ((java.util.List) b0Var.f291824a).add(h1Var);
                }
            }
        }
        return b0Var.f291824a == null ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        long available;
        java.nio.ByteBuffer byteBuffer;
        java.io.InputStream c17 = this.f76282d.c(str);
        if (c17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        try {
            if (j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                try {
                    available = c17.available() - j17;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaPkgFileSystem", e17, "readFile", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.t8.v1(c17);
                    return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                }
            } else {
                available = j18;
            }
            com.tencent.mm.plugin.appbrand.appstorage.j1 a17 = a(j17, available, c17.available());
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            if ((j17 == 0 && available == ((long) c17.available())) && (c17 instanceof nf.a)) {
                byteBuffer = java.nio.ByteBuffer.allocateDirect(c17.available());
                byteBuffer.put(((nf.a) c17).f336572d);
            } else {
                byte[] c18 = ik1.f.c(c17, j17, available);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c18.length);
                allocateDirect.put(java.nio.ByteBuffer.wrap(c18));
                byteBuffer = allocateDirect;
            }
            byteBuffer.rewind();
            b0Var.f291824a = byteBuffer;
            c(str);
            return j1Var;
        } finally {
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        this.f76282d.close();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = this.f76282d;
        java.io.InputStream c17 = y8Var.c(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (c17 != null) {
            y8Var.q().fillAnother(fileStructStat);
            try {
                fileStructStat.st_size = c17.available();
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgFileSystem", "stat(), %s stream.available fail", str);
            }
            return j1Var;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 b17 = b(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (b17 != j1Var2 || access(str) != j1Var) {
            return j1Var2;
        }
        y8Var.q().fillAnother(fileStructStat);
        fileStructStat.makeItIsDir();
        fileStructStat.st_size = 0L;
        java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) this.f76283e).get(str);
        if (l17 == null) {
            return j1Var;
        }
        fileStructStat.st_atime = l17.longValue();
        return j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgFileSystem", "statDir: path = [%s] is illegal", str);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = this.f76282d;
        y8Var.getClass();
        for (java.lang.String str2 : new java.util.LinkedList(y8Var.f76072h.keySet())) {
            if (str2.startsWith(str)) {
                com.tencent.mm.plugin.appbrand.appstorage.h2 h2Var = new com.tencent.mm.plugin.appbrand.appstorage.h2(str2);
                java.lang.String name = stat(str2, h2Var).name();
                if (name.equals("OK")) {
                    list.add(h2Var);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WxaPkgFileSystem", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        java.io.InputStream c17 = this.f76282d.c(str);
        if (c17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        try {
            try {
                int available = c17.available();
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return readFile(str, 0L, available, b0Var);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaPkgFileSystem", e17, "readFile", new java.lang.Object[0]);
                com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
            throw th6;
        }
    }
}

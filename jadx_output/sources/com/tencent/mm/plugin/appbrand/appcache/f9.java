package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class f9 extends com.tencent.mm.plugin.appbrand.appstorage.y0 implements com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f75535d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.a4[] f75536e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f75537f = new java.util.HashMap();

    public f9(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f75535d = appBrandRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        try {
            b().k(str);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        boolean d17 = b().d(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var3 = !d17 ? j1Var : j1Var2;
        if (j1Var3 == j1Var) {
            if (str.length() == 0) {
                return j1Var;
            }
            java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
            if (!b17.substring(b17.length() - 1).equals("/")) {
                b17 = b17.concat("/");
            }
            java.util.List<java.lang.String> e17 = b().e();
            if (e17 == null) {
                e17 = java.util.Collections.emptyList();
            }
            java.util.Iterator<java.lang.String> it = e17.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    next = "";
                }
                if (next.startsWith(b17)) {
                    return j1Var2;
                }
            }
        }
        return j1Var3;
    }

    public final com.tencent.mm.plugin.appbrand.appcache.a4 b() {
        com.tencent.mm.plugin.appbrand.appcache.a4[] a4VarArr = this.f75536e;
        com.tencent.mm.plugin.appbrand.appcache.a4 a4Var = a4VarArr[0];
        if (a4Var == null || com.tencent.mm.plugin.appbrand.appcache.z3.f76088a == a4Var) {
            synchronized (a4VarArr) {
                com.tencent.mm.plugin.appbrand.appcache.a4[] a4VarArr2 = this.f75536e;
                com.tencent.mm.plugin.appbrand.appcache.a4 a4Var2 = a4VarArr2[0];
                if (a4Var2 == null || com.tencent.mm.plugin.appbrand.appcache.z3.f76088a == a4Var2) {
                    a4VarArr2[0] = com.tencent.mm.plugin.appbrand.appcache.la.o(this.f75535d, false);
                }
            }
        }
        return this.f75536e[0];
    }

    public final void c(java.lang.String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        while (!str.equals("")) {
            if (str.endsWith("/")) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
                return;
            }
            str = str.substring(0, str.lastIndexOf("/"));
            boolean equals = str.equals("");
            java.util.Map map = this.f75537f;
            if (equals) {
                ((java.util.HashMap) map).put("/", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            } else {
                ((java.util.HashMap) map).put(str.concat("/"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        if (!z17) {
            if (isdir(str) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                return null;
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = b().openReadPartialInfo(str);
        if (openReadPartialInfo == null) {
            return null;
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.y5.a(openReadPartialInfo.f76043d, openReadPartialInfo.f76045f);
        if (android.text.TextUtils.isEmpty(a17)) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return readDir(str, new ik1.b0());
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = b().openReadPartialInfo(str);
        if (openReadPartialInfo != null) {
            return new com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info(openReadPartialInfo.f76044e, openReadPartialInfo.f76045f, openReadPartialInfo.f76046g, openReadPartialInfo.f76047h);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        boolean d17 = b().d(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if ((!d17 ? j1Var : j1Var2) == j1Var2) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_FILE;
        }
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        java.util.List<java.lang.String> e17 = b().e();
        if (e17 == null) {
            return j1Var;
        }
        java.lang.String quote = java.util.regex.Pattern.quote(b17);
        java.util.Iterator<java.lang.String> it = e17.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if ((next == null ? "" : next).startsWith(b17)) {
                java.lang.String replaceFirst = next.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var = new com.tencent.mm.plugin.appbrand.appstorage.h1();
                    h1Var.f76193a = replaceFirst;
                    b0Var.f291824a = b0Var.f291824a == null ? new java.util.LinkedList() : (java.util.List) b0Var.f291824a;
                    ((java.util.List) b0Var.f291824a).add(h1Var);
                }
            }
        }
        return b0Var.f291824a == null ? j1Var : j1Var2;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        long available;
        java.nio.ByteBuffer byteBuffer;
        java.io.InputStream i17 = b().i(str);
        if (i17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        try {
            if (j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                try {
                    available = i17.available() - j17;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.t8.v1(i17);
                    return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                }
            } else {
                available = j18;
            }
            com.tencent.mm.plugin.appbrand.appstorage.j1 a17 = a(j17, available, i17.available());
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            if ((j17 == 0 && available == ((long) i17.available())) && (i17 instanceof nf.a)) {
                byteBuffer = java.nio.ByteBuffer.allocateDirect(i17.available());
                byteBuffer.put(((nf.a) i17).f336572d);
            } else {
                byte[] c17 = ik1.f.c(i17, j17, available);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c17.length);
                allocateDirect.put(java.nio.ByteBuffer.wrap(c17));
                byteBuffer = allocateDirect;
            }
            byteBuffer.rewind();
            b0Var.f291824a = byteBuffer;
            c(str);
            return j1Var;
        } finally {
            com.tencent.mm.sdk.platformtools.t8.v1(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return com.tencent.mm.plugin.appbrand.appstorage.l1.e(getAbsoluteFile(str, false).o(), b0Var, str2, j17, j18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        com.tencent.mm.plugin.appbrand.appcache.a4[] a4VarArr = this.f75536e;
        com.tencent.mm.plugin.appbrand.appcache.a4 a4Var = a4VarArr[0];
        if (a4Var == null || com.tencent.mm.plugin.appbrand.appcache.z3.f76088a == a4Var) {
            synchronized (a4VarArr) {
                com.tencent.mm.plugin.appbrand.appcache.a4 a4Var2 = this.f75536e[0];
                if (a4Var2 != null && com.tencent.mm.plugin.appbrand.appcache.z3.f76088a != a4Var2) {
                }
                return;
            }
        }
        this.f75536e[0].close();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        com.tencent.mm.plugin.appbrand.appcache.y8 l17;
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = b().openReadPartialInfo(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (openReadPartialInfo != null) {
            openReadPartialInfo.f76043d.q().fillAnother(fileStructStat);
            fileStructStat.st_size = openReadPartialInfo.f76047h;
            return j1Var;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        boolean d17 = b().d(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if ((!d17 ? j1Var2 : j1Var) != j1Var2 || (l17 = b().l(str)) == null) {
            return j1Var2;
        }
        l17.q().fillAnother(fileStructStat);
        fileStructStat.makeItIsDir();
        fileStructStat.st_size = 0L;
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) this.f75537f).get(str);
        if (l18 == null) {
            return j1Var;
        }
        fileStructStat.st_atime = l18.longValue();
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
            com.tencent.mars.xlog.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: path = [%s] is illegal", str);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        for (java.lang.String str2 : b().e()) {
            if (str2 != null && str2.startsWith(str)) {
                com.tencent.mm.plugin.appbrand.appstorage.h2 h2Var = new com.tencent.mm.plugin.appbrand.appstorage.h2(str2);
                java.lang.String name = stat(str2, h2Var).name();
                if (name.equals("OK")) {
                    list.add(h2Var);
                } else {
                    com.tencent.mars.xlog.Log.w("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        java.io.InputStream i17 = b().i(str);
        if (i17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        try {
            try {
                int available = i17.available();
                com.tencent.mm.sdk.platformtools.t8.v1(i17);
                return readFile(str, 0L, available, b0Var);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                com.tencent.mm.sdk.platformtools.t8.v1(i17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(i17);
            throw th6;
        }
    }
}

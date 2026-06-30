package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229490d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b[] f229491e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f229492f = new java.util.HashMap();

    public d(java.lang.String str, java.lang.String pkgPath) {
        this.f229490d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c();
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        if (sVar.f229530d) {
            return;
        }
        sVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.q(sVar, pkgPath));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: access */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49300xab27b564(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b17 = b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        if (b17 != j1Var) {
            return b17;
        }
        if (str.length() == 0) {
            return j1Var;
        }
        java.lang.String b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        if (!b18.substring(b18.length() - 1).equals("/")) {
            b18 = b18.concat("/");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c();
        sVar.getClass();
        java.util.List<java.lang.String> list = (java.util.List) sVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.p(sVar));
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        for (java.lang.String str2 : list) {
            if (str2 == null) {
                str2 = "";
            }
            if (str2.startsWith(b18)) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
            }
        }
        return b17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b(java.lang.String str) {
        return !(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(str) != null) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b[] bVarArr = this.f229491e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b[] bVarArr2 = this.f229491e;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s(this.f229490d);
                }
            }
        }
        return this.f229491e[0];
    }

    public final void d(java.lang.String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        while (!str.equals("")) {
            if (str.endsWith("/")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
                return;
            }
            str = str.substring(0, str.lastIndexOf("/"));
            boolean equals = str.equals("");
            java.util.Map map = this.f229492f;
            if (equals) {
                ((java.util.HashMap) map).put("/", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            } else {
                ((java.util.HashMap) map).put(str.concat("/"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609(java.lang.String str, boolean z17) {
        if (!z17) {
            if (mo49303x5fd6f23(str) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true));
        if (a17 == null) {
            return null;
        }
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y5.a(a17.f229477a, a17.f229479c);
        if (android.text.TextUtils.isEmpty(a18)) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.r6(a18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: isdir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23(java.lang.String str) {
        return mo49305x40654317(str, new ik1.b0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: openReadPartialInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 mo49304xc00e82af(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true));
        if (a17 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46(a17.f229478b, a17.f229479c, a17.f229480d, a17.f229481e);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49305x40654317(java.lang.String str, ik1.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b17 = b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (b17 == j1Var) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_IS_FILE;
        }
        java.lang.String b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c();
        sVar.getClass();
        java.util.List<java.lang.String> list = (java.util.List) sVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.p(sVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        if (list == null) {
            return j1Var2;
        }
        java.lang.String quote = java.util.regex.Pattern.quote(b18);
        for (java.lang.String str2 : list) {
            if ((str2 == null ? "" : str2).startsWith(b18)) {
                java.lang.String replaceFirst = str2.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1();
                    h1Var.f157726a = replaceFirst;
                    b0Var.f373357a = b0Var.f373357a == null ? new java.util.LinkedList() : (java.util.List) b0Var.f373357a;
                    ((java.util.List) b0Var.f373357a).add(h1Var);
                }
            }
        }
        return b0Var.f373357a == null ? j1Var2 : j1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49306xcc440832(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        long available;
        java.nio.ByteBuffer byteBuffer;
        boolean z17 = true;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(b17);
        java.io.InputStream c17 = a17 != null ? a17.f229477a.c(a17.f229479c) : null;
        if (c17 == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        if (j18 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            try {
                available = c17.available() - j17;
            } catch (java.lang.Exception e17) {
                e = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e, "readFile", new java.lang.Object[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                throw th;
            }
        } else {
            available = j18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a18 = a(j17, available, c17.available());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (a18 != j1Var) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
            return a18;
        }
        if (j17 != 0 || available != c17.available()) {
            z17 = false;
        }
        if (z17 && (c17 instanceof nf.a)) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(c17.available());
            byteBuffer.put(((nf.a) c17).f418105d);
        } else {
            byte[] c18 = ik1.f.c(c17, j17, available);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c18.length);
            allocateDirect.put(java.nio.ByteBuffer.wrap(c18));
            byteBuffer = allocateDirect;
        }
        byteBuffer.rewind();
        b0Var.f373357a = byteBuffer;
        try {
            try {
                d(b17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return j1Var;
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e, "readFile", new java.lang.Object[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
            throw th;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readZipEntry */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49308xa09c5587(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.e(mo49301x1d537609(str, false).o(), b0Var, str2, j17, j18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b[] bVarArr = this.f229491e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                if (this.f229491e[0] == null) {
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) this.f229491e[0];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushPkgMergeDirReader", "close, customName:" + sVar.f229527a + ", hash:" + sVar.hashCode());
        sVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.m(sVar));
        sVar.f229530d = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: stat */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49310x360654(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685) {
        boolean z17 = true;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (a17 != null) {
            a17.f229477a.q().m49607x15990000(c11700x155a0685);
            c11700x155a0685.f33490x8ecf5f1f = a17.f229481e;
            return j1Var;
        }
        if (!b17.endsWith("/")) {
            b17 = b17.concat("/");
        }
        if (!b17.startsWith("/")) {
            b17 = "/".concat(b17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b18 = b(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        if (b18 == j1Var2) {
            java.lang.String b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(b17, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c();
            sVar.getClass();
            if (b19 != null && b19.length() != 0) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = z17 ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) sVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.n(sVar, b19));
            if (y8Var != null) {
                y8Var.q().m49607x15990000(c11700x155a0685);
                c11700x155a0685.m49610xc97826ca();
                c11700x155a0685.f33490x8ecf5f1f = 0L;
                java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) this.f229492f).get(b19);
                if (l17 == null) {
                    return j1Var;
                }
                c11700x155a0685.f33486x4a239f50 = l17.longValue();
                return j1Var;
            }
        }
        return j1Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: statDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49311x8eeb7599(java.lang.String str, java.util.List list) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "statDir: path = [%s] is illegal", str);
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_PERMISSION_DENIED;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c();
        sVar.getClass();
        for (java.lang.String str2 : (java.util.List) sVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.p(sVar))) {
            if (str2 != null && str2.startsWith(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2(str2);
                java.lang.String name = mo49310x360654(str2, h2Var).name();
                if (name.equals("OK")) {
                    list.add(h2Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832(java.lang.String str, ik1.b0 b0Var) {
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) c()).a(b17);
        java.io.InputStream c17 = a17 != null ? a17.f229477a.c(a17.f229479c) : null;
        try {
            if (c17 == null) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
            }
            try {
                int available = c17.available();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return mo49306xcc440832(b17, 0L, available, b0Var);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
            throw th6;
        }
    }
}

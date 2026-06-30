package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j implements jc3.k0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f229532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String instanceName, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List bizNameList) {
        super(instanceName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n3 n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizNameList, "bizNameList");
        this.f229532s = new java.util.concurrent.CopyOnWriteArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229503g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushPublicServiceFileSystem", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList e17 = e();
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f229504h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var);
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String str2 = this.f229503g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o17, "/".concat(str2));
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        java.lang.String o18 = r6Var2.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(o18, "files/");
        if (!r6Var3.m()) {
            r6Var3.J();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(r6Var3.o(), "wxfile://usr");
        j3Var.f157760f = ((java.lang.Number) ((jz5.n) this.f229505i).mo141623x754a37bb()).longValue();
        java.lang.String o19 = r6Var2.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o19, "getAbsolutePath(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(o19, "objects/");
        if (!r6Var4.m()) {
            r6Var4.J();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1(r6Var4.o(), "default_obfuscation_key", "wxfile://");
        n1Var.f157813i = g();
        linkedList.add(j3Var);
        linkedList.add(n1Var);
        e17.addAll(linkedList);
        if (str != null && b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n3.class) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(str);
            if (y8Var.a()) {
                n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n3(y8Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushPublicServiceFileSystem", "getPkgFileSystem readInfo error calculateMD5:" + com.p314xaae8f345.mm.vfs.w6.p(str));
                n3Var = null;
            }
            if (n3Var != null) {
                e().add(n3Var);
            }
        } else if (u1Var != null && b(u1Var.getClass()) == null) {
            e().add(u1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class);
        if (n1Var2 != null) {
            n1Var2.c();
        }
        super.mo49302x33ebcb90();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "file system established instanceName:" + instanceName + ",pkgPath:" + str + ",assetsFS:" + u1Var);
        java.util.Iterator it = bizNameList.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str3 + " fs");
            if (jc3.u0.f380531c.contains(str3)) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f229532s;
                java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                copyOnWriteArrayList.add(lowerCase);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str3 + " not exist");
            }
        }
    }

    @Override // jc3.k0
    public void J(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
    }

    @Override // jc3.k0
    public void Vf(java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customName, "customName");
    }

    @Override // jc3.k0
    public java.lang.String X3(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mDummyFS = this.f229517f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mDummyFS, "mDummyFS");
            return mDummyFS;
        }
        java.lang.String i17 = i(path);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a, i17, null, null, null, null, 16, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 a17 = super.a(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "findAppropriateFileSystem(...)");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: canRenameFile */
    public boolean mo49615x4d74a9ca(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path)) {
            return false;
        }
        java.lang.String i17 = i(path);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) ? com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a, i17, null, null, null, null, 16, null).mo49615x4d74a9ca(f(path)) : super.mo49615x4d74a9ca(path);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: canSaveToLocal */
    public boolean mo49616x4d737b83(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path)) {
            return false;
        }
        java.lang.String i17 = i(path);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) ? com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a, i17, null, null, null, null, 16, null).mo49616x4d737b83(f(path)) : super.mo49615x4d74a9ca(path);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l
    public java.lang.String f(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String d17 = d(path);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i(d17))) {
            return d17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        int L = r26.n0.L(d17, "://", 0, false, 6, null);
        if (L == -1) {
            return null;
        }
        java.lang.String substring = d17.substring(L + 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return r26.i0.t(substring, "\u0000", "", false);
    }

    public final java.lang.String i(java.lang.String str) {
        java.net.URI uri;
        java.lang.String d17 = d(str);
        java.lang.String str2 = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            try {
                uri = new java.net.URI(d17);
            } catch (java.lang.Throwable th6) {
                if (d17.length() > 50) {
                    d17 = d17.substring(0, 50);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "substring(...)");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushPublicServiceFileSystem", th6, "Not supported uri format!!! ".concat(d17), new java.lang.Object[0]);
                uri = null;
            }
            java.lang.String scheme = uri != null ? uri.getScheme() : null;
            if (scheme == null) {
                scheme = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(scheme)) {
                java.lang.String s07 = r26.n0.s0(scheme, "-", scheme);
                java.util.Iterator it = this.f229532s.iterator();
                while (it.hasNext()) {
                    if (s07.equals((java.lang.String) it.next())) {
                        str2 = scheme;
                    }
                }
            }
        }
        return str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
        java.util.Iterator it = this.f229532s.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(kVar, str, null, null, null, null, 16, null).mo49302x33ebcb90();
        }
        super.mo49302x33ebcb90();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        java.util.Iterator it = this.f229532s.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(kVar, str, null, null, null, null, 16, null).mo49309x41012807();
        }
        super.mo49309x41012807();
    }

    @Override // jc3.k0
    public void s7(java.lang.String instanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        super.mo49309x41012807();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class);
        if (n1Var != null) {
            n1Var.b();
            e().remove(n1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: saveFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499(com.p314xaae8f345.mm.vfs.r6 srcFile, java.lang.String specifiedPath, ik1.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcFile, "srcFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specifiedPath, "specifiedPath");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(specifiedPath)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NOT_SUPPORTED;
        }
        java.lang.String i17 = i(specifiedPath);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            return super.mo49631x84702499(srcFile, specifiedPath, b0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a, i17, null, null, null, null, 16, null).mo49631x84702499(srcFile, f(specifiedPath), b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49631x84702499, "saveFile(...)");
        return mo49631x84702499;
    }
}

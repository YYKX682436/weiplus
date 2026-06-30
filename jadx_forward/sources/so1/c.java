package so1;

/* loaded from: classes15.dex */
public final class c implements ro1.g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f491763a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f491764b;

    @Override // ro1.g
    public boolean a(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return com.p314xaae8f345.mm.vfs.w6.g(o17, true) || !com.p314xaae8f345.mm.vfs.w6.j(o17);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x010c  */
    @Override // ro1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(po1.d r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so1.c.b(po1.d):boolean");
    }

    @Override // ro1.g
    public ro1.f c(java.lang.String remotePath, java.lang.String localPath, ro1.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskChannel", "copyUDisk2Local remotePath = " + remotePath + ", localPath = " + localPath);
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath);
        if (!r6Var2.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "Failed to get remotePath(" + remotePath + ')');
            return ro1.f.f479514g;
        }
        if (r6Var2.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "remotePath=" + remotePath + " is a directory");
            return ro1.f.f479515h;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskChannel", "copyUDisk2Local remoteUri = %s, localPath = %s", r6Var2, localPath);
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(localPath));
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var3.s();
        if ((s17 != null && (s17.m() || s17.J())) || (s17 != null && s17.m())) {
            return so1.h.f491772a.a(r6Var2, r6Var3, dVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "[copyUDisk2Local] Parent=" + s17 + " is not exist and can't create");
        return ro1.f.f479517m;
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 d(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, filePath);
        if (!r6Var2.m()) {
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
        a0Var.f297309e = r6Var2.o();
        a0Var.f297310f = r6Var2.y();
        a0Var.f297311g = r6Var2.C();
        a0Var.f297312h = r6Var2.B();
        a0Var.f297313i = r6Var2.B();
        a0Var.f297308d = r6Var2.m82467xfb82e301();
        return a0Var;
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0 e(java.lang.String parentPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentPath, "parentPath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, parentPath);
        if (!r6Var2.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "dirDoc is not exist, parentPath = %s", parentPath);
            return null;
        }
        if (!r6Var2.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "dirDoc is not directory");
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0 b0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
        a0Var.f297309e = parentPath;
        a0Var.f297310f = r6Var2.y();
        a0Var.f297311g = r6Var2.C();
        a0Var.f297312h = r6Var2.B();
        a0Var.f297313i = r6Var2.B();
        a0Var.f297308d = r6Var2.m82467xfb82e301();
        java.util.LinkedList linkedList = b0Var.f297331d;
        linkedList.add(a0Var);
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var2.G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : G) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
                a0Var2.f297309e = parentPath + '/' + r6Var3.m82467xfb82e301();
                a0Var2.f297310f = r6Var3.y();
                a0Var2.f297311g = r6Var3.C();
                a0Var2.f297312h = r6Var3.B();
                a0Var2.f297313i = r6Var3.B();
                a0Var2.f297308d = r6Var3.m82467xfb82e301();
                linkedList.add(a0Var2);
            }
        }
        return b0Var;
    }

    @Override // ro1.g
    public boolean f() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var != null) {
            return r6Var.m();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
        throw null;
    }

    @Override // ro1.g
    public java.io.InputStream g(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath);
        if (!r6Var2.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "path(" + r6Var2 + ") not exists.");
            return null;
        }
        java.lang.Exception e17 = null;
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                try {
                    java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "openRead(...)");
                    return C;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectUtils", "openRead(" + r6Var2 + ") failed, tryCount=" + i17 + '.');
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DirectDiskChannel", th6, "openRead(" + r6Var2 + ") failed.", new java.lang.Object[0]);
                return null;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        throw e17;
    }

    @Override // ro1.g
    public java.io.OutputStream h(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath);
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var2.s();
        if ((s17 == null || !(s17.m() || s17.J())) && (s17 == null || !s17.m())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "[openDocumentAsOutputStream] Parent=" + s17 + " is not exist and can't create");
            return null;
        }
        java.lang.Exception e17 = null;
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                try {
                    java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(H, "openWrite(...)");
                    return H;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectUtils", "openWrite(" + r6Var2 + ") failed, tryCount=" + i17 + '.');
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DirectDiskChannel", th6, "openWrite(" + r6Var2 + ") failed.", new java.lang.Object[0]);
                return null;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        throw e17;
    }

    @Override // ro1.g
    public boolean i(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return com.p314xaae8f345.mm.vfs.w6.h(o17) || !com.p314xaae8f345.mm.vfs.w6.j(o17);
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x j() {
        com.p314xaae8f345.mm.vfs.o2 g17;
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        long w17 = r6Var.w();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = this.f491764b;
        if (r6Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.z2 M = r6Var2.M();
        long j17 = 0;
        if (M.a() && (g17 = M.f294799a.g(M.f294800b)) != null) {
            j17 = g17.f294638d;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x();
        xVar.f297540d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypePortableDisk;
        xVar.f297543g = j17;
        xVar.f297542f = w17;
        xVar.f297541e = j17 - w17;
        xVar.f297544h = false;
        return xVar;
    }

    @Override // ro1.g
    public ro1.f k(java.lang.String localPath, java.lang.String remotePath, ro1.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, remotePath);
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(localPath));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskChannel", "copyLocal2UDisk, localPath=" + localPath + ", localLength=" + r6Var3.C() + ", remotePath=" + remotePath);
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var2.s();
        if ((s17 != null && (s17.m() || s17.J())) || (s17 != null && s17.m())) {
            return so1.h.f491772a.a(r6Var3, r6Var2, dVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DirectDiskChannel", "[copyLocal2UDisk] Parent=" + s17 + " is not exist and can't create");
        return ro1.f.f479517m;
    }

    @Override // ro1.g
    public java.util.ArrayList l(java.util.ArrayList dirPaths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPaths, "dirPaths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dirPaths.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f491764b;
            if (r6Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
                throw null;
            }
            long m17 = m(new com.p314xaae8f345.mm.vfs.r6(r6Var, str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskChannel", "getDirSize, path = " + str + ", size=" + m17 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            arrayList.add(java.lang.Long.valueOf(m17));
        }
        return arrayList;
    }

    public final long m(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (!r6Var.y()) {
            return r6Var.C();
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var2);
                j17 += m(r6Var2);
            }
        }
        return j17;
    }

    @Override // ro1.g
    /* renamed from: uninit */
    public boolean mo162784xcde67f29() {
        return true;
    }
}

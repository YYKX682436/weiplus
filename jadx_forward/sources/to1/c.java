package to1;

/* loaded from: classes15.dex */
public final class c implements ro1.g {

    /* renamed from: a, reason: collision with root package name */
    public to1.k f502438a;

    /* renamed from: b, reason: collision with root package name */
    public to1.r f502439b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f502440c = jz5.h.b(to1.b.f502437d);

    @Override // ro1.g
    public boolean a(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "deleteUDiskPath ".concat(remotePath));
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        kVar.f502454b.d(-1);
        kVar.f502455c.d(-1);
        if (kVar.f502453a.b(remotePath, true)) {
            return true;
        }
        to1.k kVar2 = this.f502438a;
        if (kVar2 != null) {
            return kVar2.a(remotePath, false) == null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0115  */
    @Override // ro1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(po1.d r9) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: to1.c.b(po1.d):boolean");
    }

    @Override // ro1.g
    public ro1.f c(java.lang.String remotePath, java.lang.String localPath, ro1.d dVar) {
        java.io.InputStream inputStream;
        java.lang.Throwable th6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "copyUDisk2Local remotePath = " + remotePath + ", localPath = " + localPath);
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(remotePath, false);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SAFUDiskChannel", "Failed to get remotePath(" + remotePath + ')');
            return ro1.f.f479514g;
        }
        android.net.Uri remoteUri = a17.f502469a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "copyUDisk2Local remoteUri = %s, localPath = %s", remoteUri, localPath);
        java.io.File file = new java.io.File(localPath);
        file.delete();
        if (a17.f502470b) {
            return ro1.f.f479515h;
        }
        to1.i iVar = to1.i.f502448a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteUri, "remoteUri");
        try {
            java.io.InputStream c17 = iVar.c(remoteUri);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SAFUtils", "inputStream = " + c17 + ", outputStream = null");
                return ro1.f.f479516i;
            }
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    to1.i.a(iVar, c17, fileOutputStream, dVar, 0, 8, null);
                    file.getAbsolutePath();
                    ro1.f fVar = ro1.f.f479512e;
                    try {
                        vz5.b.a(fileOutputStream, null);
                        vz5.b.a(c17, null);
                        return fVar;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        inputStream = c17;
                        th6 = th;
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th8) {
                            vz5.b.a(inputStream, th6);
                            throw th8;
                        }
                    }
                } catch (java.lang.Throwable th9) {
                    inputStream = c17;
                    try {
                        throw th9;
                    } catch (java.lang.Throwable th10) {
                        try {
                            vz5.b.a(fileOutputStream, th9);
                            throw th10;
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            th6 = th;
                            throw th6;
                        }
                    }
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                inputStream = c17;
            }
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SAFUtils", e17, "Fail to copy. remoteUri=" + remoteUri + ", local=" + file.getAbsolutePath(), new java.lang.Object[0]);
            return ro1.f.f479514g;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SAFUtils", e18, "Fail to copy. remoteUri=" + remoteUri + ", local=" + file.getAbsolutePath(), new java.lang.Object[0]);
            return ro1.f.f479513f;
        }
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 d(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(filePath, false);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SAFUDiskChannel", "dirDoc == null, parentPath = %s", filePath);
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
        a0Var.f297309e = a17.f502469a.getPath();
        a0Var.f297310f = a17.f502470b;
        a0Var.f297311g = a17.f502471c;
        a0Var.f297312h = 0L;
        a0Var.f297313i = 0L;
        a0Var.f297308d = a17.e();
        return a0Var;
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0 e(java.lang.String parentPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentPath, "parentPath");
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(parentPath, false);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SAFUDiskChannel", "dirDoc == null, parentPath = %s", parentPath);
            return null;
        }
        boolean z17 = a17.f502470b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SAFUDiskChannel", "dirDoc is not directory");
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0 b0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b0();
        to1.o f17 = a17.f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
        a0Var.f297309e = parentPath;
        a0Var.f297310f = z17;
        a0Var.f297311g = f17.f502460a;
        long j17 = f17.f502461b;
        a0Var.f297312h = j17;
        a0Var.f297313i = j17;
        a0Var.f297308d = a17.e();
        java.util.LinkedList linkedList = b0Var.f297331d;
        linkedList.add(a0Var);
        java.util.Iterator it = ((java.util.ArrayList) a17.g()).iterator();
        while (it.hasNext()) {
            to1.r rVar = (to1.r) it.next();
            to1.o f18 = rVar.f();
            java.lang.String e17 = rVar.e();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
            a0Var2.f297309e = parentPath + '/' + e17;
            a0Var2.f297310f = rVar.f502470b;
            a0Var2.f297311g = f18.f502460a;
            long j18 = f18.f502461b;
            a0Var2.f297312h = j18;
            a0Var2.f297313i = j18;
            a0Var2.f297308d = e17;
            linkedList.add(a0Var2);
        }
        return b0Var;
    }

    @Override // ro1.g
    public boolean f() {
        to1.r rVar = this.f502439b;
        return (rVar == null || to1.r.f502467d.b(rVar.f502469a) == null) ? false : true;
    }

    @Override // ro1.g
    public java.io.InputStream g(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(remotePath, false);
        if (a17 == null || a17.f502470b) {
            return null;
        }
        to1.i iVar = to1.i.f502448a;
        android.net.Uri uri = a17.f502469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return iVar.c(uri);
    }

    @Override // ro1.g
    public java.io.OutputStream h(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(remotePath, true);
        if (a17 == null || a17.f502470b) {
            return null;
        }
        to1.i iVar = to1.i.f502448a;
        android.net.Uri uri = a17.f502469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return iVar.d(uri);
    }

    @Override // ro1.g
    public boolean i(java.lang.String remotePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "deleteUDiskPath ".concat(remotePath));
        to1.k kVar = this.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        kVar.f502455c.m77803xc84af884(remotePath);
        if (!kVar.f502453a.b(remotePath, false)) {
            to1.k kVar2 = this.f502438a;
            if (kVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
                throw null;
            }
            if (!(kVar2.a(remotePath, false) == null)) {
                return false;
            }
        }
        return true;
    }

    @Override // ro1.g
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x j() {
        to1.k kVar;
        xn1.k kVar2 = new xn1.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "[getDiskInfo] start openAsFd st=" + kVar2);
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        try {
            kVar = this.f502438a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SAFUDiskChannel", e17, "Fail to get fd", new java.lang.Object[0]);
        }
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r rVar = kVar.f502453a;
        rVar.getClass();
        to1.i iVar = to1.i.f502448a;
        android.net.Uri uri = rVar.f502469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        assetFileDescriptor = to1.i.f502449b.openAssetFileDescriptor(uri, "a+", null);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y yVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypePortableDisk;
        if (assetFileDescriptor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "Fail to open parcelFd, using fake info. st=" + kVar2);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x();
            xVar.f297540d = yVar;
            xVar.f297543g = 0L;
            xVar.f297542f = 0L;
            xVar.f297541e = 0L;
            xVar.f297544h = n();
            return xVar;
        }
        android.system.StructStatVfs fstatvfs = android.system.Os.fstatvfs(assetFileDescriptor.getFileDescriptor());
        long j17 = fstatvfs.f_bfree;
        long j18 = fstatvfs.f_bsize;
        long j19 = j17 * j18;
        long j27 = fstatvfs.f_blocks * j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "getDiskInfo, st=" + kVar2);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x xVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x();
        xVar2.f297540d = yVar;
        xVar2.f297543g = j27;
        xVar2.f297542f = j19;
        xVar2.f297541e = j27 - j19;
        xVar2.f297544h = n();
        return xVar2;
    }

    @Override // ro1.g
    public ro1.f k(java.lang.String localPath, java.lang.String remotePath, ro1.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remotePath, "remotePath");
        return (ro1.f) bm5.v1.a("copyLocal2UDisk", new to1.a(localPath, remotePath, this, dVar));
    }

    @Override // ro1.g
    public java.util.ArrayList l(java.util.ArrayList dirPaths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPaths, "dirPaths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dirPaths.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            to1.k kVar = this.f502438a;
            if (kVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
                throw null;
            }
            long m17 = m(kVar.a(str, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "getDirSize, path = " + str + ", size=" + m17 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            arrayList.add(java.lang.Long.valueOf(m17));
        }
        return arrayList;
    }

    public final long m(to1.r rVar) {
        long j17 = 0;
        if ((rVar == null) || !rVar.f502470b) {
            if (rVar != null) {
                return rVar.f502471c;
            }
            return 0L;
        }
        java.util.Iterator it = rVar.g().iterator();
        while (it.hasNext()) {
            j17 += m((to1.r) it.next());
        }
        return j17;
    }

    public boolean n() {
        boolean z17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f502440c).mo141623x754a37bb()).getInt("StreamModeEnable", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "Check if support stream transport mode = %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ro1.g
    /* renamed from: uninit */
    public boolean mo162784xcde67f29() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", "uninit");
        return true;
    }
}

package wl2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f528585a = g();

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl2.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int b(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        if (xVar != null && (linkedList = xVar.f299139x) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u) obj).m117632xb5884f29(), c())) {
                    break;
                }
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u) obj;
            if (uVar != null) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(uVar.m117633x754a37bb(), 0);
            }
        }
        return 0;
    }

    public abstract java.lang.String c();

    public abstract int d();

    public abstract java.lang.String e();

    public final java.lang.String f(java.lang.String unZipPath, java.lang.String folder, java.lang.String file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unZipPath, "unZipPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(folder, "folder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(unZipPath);
        sb6.append('/');
        sb6.append(folder);
        sb6.append('/');
        sb6.append(wo.w0.q() ? "arm64-v8a" : "armeabi-v7a");
        sb6.append('/');
        sb6.append(file);
        return sb6.toString();
    }

    public abstract java.lang.String g();

    public final boolean h(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path));
        return r6Var.A() && r6Var.m() && r6Var.C() > 0;
    }

    public abstract boolean i(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar);

    public final wl2.b j(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        java.lang.String c17 = xVar.c();
        if (c17 == null || c17.length() == 0) {
            return new wl2.b(false, "postPath empty");
        }
        java.lang.String str = xVar.c() + "/lib_ktv_so";
        boolean i17 = i(xVar);
        java.lang.String str2 = this.f528585a;
        if (i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "loadResource file exit, unZipPath: " + str);
            return l(xVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "loadResource secondUnZip");
        java.lang.String m117639xfb83cc9b = xVar.m117639xfb83cc9b();
        if (m117639xfb83cc9b == null) {
            m117639xfb83cc9b = "";
        }
        wl2.e.a(m117639xfb83cc9b, str);
        if (!i(xVar)) {
            return new wl2.b(false, "unZipFail_".concat(str));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "loadResource file second exit, unZipPath: ".concat(str));
        return l(xVar);
    }

    public final jz5.l k(java.lang.String soFilePath) {
        java.lang.String str = this.f528585a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soFilePath, "soFilePath");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loadSo soPathDir: ".concat(soFilePath));
            com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
            com.p314xaae8f345.cso.C2941xefde02d2.h(soFilePath);
            return new jz5.l(java.lang.Boolean.TRUE, "");
        } catch (java.lang.Throwable th6) {
            java.lang.String message = th6.getMessage();
            java.lang.String str2 = message != null ? message : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "loadSoError: " + jz5.f0.f384359a);
            return new jz5.l(java.lang.Boolean.FALSE, str2);
        }
    }

    public abstract wl2.b l(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar);
}

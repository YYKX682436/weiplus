package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.g1 f150604a = new com.p314xaae8f345.mm.p874xaefb6cc9.g1();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0132, code lost:
    
        if (r26.i0.p(r4, r6, true) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p874xaefb6cc9.e1 a(java.lang.String r23, java.lang.String r24, int r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p874xaefb6cc9.g1.a(java.lang.String, java.lang.String, int, int, java.lang.String):com.tencent.mm.minigame.e1");
    }

    public final long b(java.lang.String moduleName, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f> list;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        if (c11829x68027553 == null || (list = c11829x68027553.f158985o) == null) {
            return 0L;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(moduleName, c11830xcf46aa1f.f158997d)) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 : c11830xcf46aa1f.f159004n) {
                    if (c11831x52cc1bc5.f159007d == 51 && (i17 = c11831x52cc1bc5.f159009f) > 0) {
                        return i17;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVAModulePkgPathHelper", "getModuleSizeFromWxaVersionInfo: module " + moduleName + " not found in WxaVersionInfo");
        return 0L;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, java.lang.String packageName, com.p314xaae8f345.mm.p874xaefb6cc9.f1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = service.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t37);
        com.p314xaae8f345.mm.p874xaefb6cc9.e1 d17 = d(t37, packageName);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "getPkgPathAsync: not found locally, exec GetWVAModulePkgPathTask for ".concat(packageName));
            new com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b(false, service, packageName, callback).d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "getPkgPathAsync: found locally, pkgPath=" + d17.f150596b);
            callback.a(d17);
        }
    }

    public final com.p314xaae8f345.mm.p874xaefb6cc9.e1 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String packageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        ph1.h hVar = runtime.R;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: modularizingHelper is null, appId=" + runtime.f156336n);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e f17 = hVar.f(packageName);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: module not found for ".concat(packageName));
            return null;
        }
        java.lang.String str = f17.f33455xe121c411;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: pkgPath is empty for ".concat(packageName));
            return null;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: file not exists at " + str);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "getPkgPathFromLocal: found pkgPath=" + str + " for " + packageName + ", version=" + f17.f33456x1c82a56c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return new com.p314xaae8f345.mm.p874xaefb6cc9.e1(true, str, f17.f33456x1c82a56c, f17.m49198x1ef07bb7(), false, 16, null);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f157586a;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.class) {
            interfaceC11702x4ae7c33 = f157586a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM", "getCurrentAcceptedCommLibReader [%s], stacktrace=%s", interfaceC11702x4ae7c33, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return interfaceC11702x4ae7c33;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.class) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = f157586a;
                if (interfaceC11702x4ae7c332 != null) {
                    try {
                        interfaceC11702x4ae7c332.close();
                    } catch (java.lang.Throwable th6) {
                        if (interfaceC11702x4ae7c332 != null) {
                            try {
                                interfaceC11702x4ae7c332.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                }
                if (interfaceC11702x4ae7c332 != null) {
                    interfaceC11702x4ae7c332.close();
                }
            } catch (java.lang.Exception unused) {
            }
            f157586a = interfaceC11702x4ae7c33;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM", "setCurrentUsingVersion wx.version:%s(%d)", interfaceC11702x4ae7c33.W0(), java.lang.Integer.valueOf(interfaceC11702x4ae7c33.i()));
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w7.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w7) ((fs.n) qVar.get())).J1(interfaceC11702x4ae7c33);
            }
        }
    }
}

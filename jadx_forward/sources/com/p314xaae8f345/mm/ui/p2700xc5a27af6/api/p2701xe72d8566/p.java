package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f290074a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f290075b;

    public void a(java.lang.String callbackProcess, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackProcess, "callbackProcess");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl setCallback, callbackProcess: ".concat(callbackProcess));
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.n nVar = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.n(this, callbackProcess, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                nVar.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(nVar);
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isRegister", z17);
        bundle.putString("callbackProcess", callbackProcess);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.q.class, null);
    }
}

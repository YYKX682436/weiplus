package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

@j95.b
/* loaded from: classes8.dex */
public final class t extends i95.w implements ct.d3 {
    public void Ai(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotService", "registerScreenShotCallback, failed: callback is null");
            return;
        }
        if (bool != null ? bool.booleanValue() : true) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.b(context, f7Var);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.a(context, f7Var);
        }
    }

    public void Bi(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        Di(context, f7Var, java.lang.Boolean.TRUE);
    }

    public void Di(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotService", "unregisterScreenShotCallback, failed: callback is null");
            return;
        }
        if (bool != null ? bool.booleanValue() : true) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.d(context, f7Var);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.a(context, null);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "onAccountInitialized, register reporter");
        r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274391c = com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.s.f290081a;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "onAccountReleased, unregister reporter");
        r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274391c = null;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274392d = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p();
    }

    public void wi(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        Ai(context, f7Var, java.lang.Boolean.TRUE);
    }
}

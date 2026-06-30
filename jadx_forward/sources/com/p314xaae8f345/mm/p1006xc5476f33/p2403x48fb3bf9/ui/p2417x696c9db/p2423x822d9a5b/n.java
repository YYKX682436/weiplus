package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.ref.WeakReference f265747v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f265748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(dp1.x floatBallPageAdapter, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        super(floatBallPageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatBallPageAdapter, "floatBallPageAdapter");
        this.f265747v = new java.lang.ref.WeakReference(c22633x83752a59);
        b(56, "AudioPanelFloatBall");
        t().f174619f = 30;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAudioFloatBallHelper", "WebViewAudioFloatBallHelper %s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void A(boolean z17, int i17) {
        this.f265748w = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean k0() {
        android.content.Intent mo54480x1e885992 = this.f174772n.mo54480x1e885992();
        return mo54480x1e885992 != null && mo54480x1e885992.getIntExtra("key_enter_float_ball_type", -1) == 56;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        d();
        super.x();
    }
}

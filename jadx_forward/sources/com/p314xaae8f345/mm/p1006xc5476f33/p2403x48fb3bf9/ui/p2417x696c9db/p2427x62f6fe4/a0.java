package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class a0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267273d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267273d = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267273d;
        java.lang.String str = viewOnClickListenerC19428xb021cc2c.f267240d;
        android.view.ViewGroup viewGroup = viewOnClickListenerC19428xb021cc2c.f267244h;
        if (viewGroup != null && (viewTreeObserver2 = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        android.view.ViewGroup viewGroup2 = viewOnClickListenerC19428xb021cc2c.f267244h;
        java.lang.Integer valueOf = viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getHeight()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        if (valueOf.intValue() <= 0) {
            android.view.ViewGroup viewGroup3 = viewOnClickListenerC19428xb021cc2c.f267244h;
            if (viewGroup3 == null || (viewTreeObserver = viewGroup3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a0(viewOnClickListenerC19428xb021cc2c));
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = viewOnClickListenerC19428xb021cc2c.C;
        android.view.View view = viewOnClickListenerC19428xb021cc2c.f267247n;
        if (s4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.view.View view2 = viewOnClickListenerC19428xb021cc2c.f267241e;
            android.view.ViewGroup viewGroup4 = viewOnClickListenerC19428xb021cc2c.f267244h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup4);
            view.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.b4(s4Var, new android.view.GestureDetector(s4Var.f292227a, new com.p314xaae8f345.mm.ui.p2740x696c9db.k4(s4Var)), view, view2, viewGroup4, null));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = viewOnClickListenerC19428xb021cc2c.C;
        if (s4Var2 != null) {
            s4Var2.f292226J = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.u(viewOnClickListenerC19428xb021cc2c);
        }
        if (s4Var2 != null) {
            s4Var2.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.v(viewOnClickListenerC19428xb021cc2c);
        }
        if (s4Var2 != null) {
            s4Var2.H = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.w(viewOnClickListenerC19428xb021cc2c);
        }
        if (s4Var2 != null) {
            s4Var2.I = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x(viewOnClickListenerC19428xb021cc2c);
        }
        if (view != null) {
            view.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.y.f267366d);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var3 = viewOnClickListenerC19428xb021cc2c.C;
        if (s4Var3 != null) {
            android.view.ViewGroup viewGroup5 = viewOnClickListenerC19428xb021cc2c.f267244h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup5);
            s4Var3.c(viewGroup5, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.z(viewOnClickListenerC19428xb021cc2c));
        }
    }
}

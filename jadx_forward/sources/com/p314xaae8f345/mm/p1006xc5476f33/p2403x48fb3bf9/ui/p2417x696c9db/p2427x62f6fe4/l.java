package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes3.dex */
public final class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f267331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267332e;

    public l(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267331d = view;
        this.f267332e = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f267331d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean c17 = fp.h.c(24);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267332e;
        if (c17) {
            android.content.Context context = viewOnClickListenerC19428xb021cc2c.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            if (((android.app.Activity) context).isInMultiWindowMode()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.b(viewOnClickListenerC19428xb021cc2c);
                return;
            }
        }
        int c18 = com.p314xaae8f345.mm.ui.bl.c(viewOnClickListenerC19428xb021cc2c.getContext());
        int f17 = i65.a.f(viewOnClickListenerC19428xb021cc2c.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int i17 = f17 * 3;
        int i18 = f17 * 4;
        int i19 = f17 * 7;
        int max = java.lang.Math.max(c18 - i17, 0);
        int i27 = f17 * 2;
        viewOnClickListenerC19428xb021cc2c.f267245i.setPadding(max, i27, max - f17, i27);
        android.view.View view = viewOnClickListenerC19428xb021cc2c.A;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = i65.a.h(viewOnClickListenerC19428xb021cc2c.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            view.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewOnClickListenerC19428xb021cc2c.f267248o.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(3);
        layoutParams4.setMargins(i18, i17, 0, i17);
        layoutParams4.addRule(15);
        viewOnClickListenerC19428xb021cc2c.f267248o.setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = viewOnClickListenerC19428xb021cc2c.f267249p.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.removeRule(3);
        layoutParams6.setMargins(0, i17, i18, i17);
        layoutParams6.addRule(15);
        viewOnClickListenerC19428xb021cc2c.f267249p.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = viewOnClickListenerC19428xb021cc2c.f267252r.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
        layoutParams8.removeRule(3);
        layoutParams8.setMargins(0, i17, i18, i17);
        layoutParams8.addRule(15);
        viewOnClickListenerC19428xb021cc2c.f267252r.setLayoutParams(layoutParams8);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750 = viewOnClickListenerC19428xb021cc2c.f267261z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19737x80a67750);
        android.view.ViewGroup.LayoutParams layoutParams9 = c19737x80a67750.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
        layoutParams10.addRule(1, com.p314xaae8f345.mm.R.id.ozv);
        layoutParams10.addRule(0, com.p314xaae8f345.mm.R.id.f569090p00);
        layoutParams10.addRule(15);
        layoutParams10.setMargins(i19, i17, i19, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a677502 = viewOnClickListenerC19428xb021cc2c.f267261z;
        if (c19737x80a677502 == null) {
            return;
        }
        c19737x80a677502.setLayoutParams(layoutParams10);
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class t5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f281500a;

    public t5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var) {
        this.f281500a = c6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f281500a.f280406d.f280113d.f542241c.a(sb5.s0.class));
        jbVar.getClass();
        jbVar.f280803o = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        jbVar.f280803o.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        jbVar.f280803o.addAnimation(translateAnimation);
        jbVar.f280803o.addAnimation(alphaAnimation);
        jbVar.f280803o.setDuration(300L);
        jbVar.f280803o.setFillBefore(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = jbVar.f280796e;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.startAnimation(jbVar.f280803o);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onHide */
    public void mo50890xc39a57c1() {
        this.f281500a.f280406d.o0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onShow */
    public void mo50891xc39f557c() {
        this.f281500a.f280406d.o0();
    }
}

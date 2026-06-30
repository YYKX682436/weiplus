package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class of implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pf f228811a;

    public of(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pf pfVar) {
        this.f228811a = pfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pf pfVar = this.f228811a;
        if (b17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.up.a(pfVar.f228850b, com.p314xaae8f345.mm.R.C30867xcad56011.f573947gj5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = pfVar.f228849a.f226818p;
        if (c19088xa4b300c1 != null) {
            c19088xa4b300c1.a(pfVar.f228850b, null, null, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f228811a.f228850b.f227860n.setVisibility(0);
    }
}

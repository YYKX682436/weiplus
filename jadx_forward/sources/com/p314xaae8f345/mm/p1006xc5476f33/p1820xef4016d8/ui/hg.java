package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hg implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ig f228529a;

    public hg(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ig igVar) {
        this.f228529a = igVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ig igVar = this.f228529a;
        if (b17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.up.a(igVar.f228562b.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573947gj5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = igVar.f228561a.f226818p;
        if (c19088xa4b300c1 != null) {
            c19088xa4b300c1.a(igVar.f228562b, null, null, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

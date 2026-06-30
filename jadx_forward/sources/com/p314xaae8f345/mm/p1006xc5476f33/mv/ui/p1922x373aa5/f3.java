package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class f3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233360d;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233360d = c16693xf5eb90b6;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 && i17 >= c22848x6ddd90cf.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return;
        }
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233512d.f233500d;
        int mo67219x51e8b0a = kl3.t.g().a().mo67219x51e8b0a();
        if (j17 >= mo67219x51e8b0a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvCommentView", "invalid time, position:" + i17 + ", currentPosTime:" + j17 + ", duration:" + mo67219x51e8b0a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "onItemClick position:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233360d;
        c16693xf5eb90b6.f233229v = true;
        c16693xf5eb90b6.f();
        c16693xf5eb90b6.m67334xad7e37ad(false);
        c16693xf5eb90b6.c(c16693xf5eb90b6.f233228u, i17);
        c16693xf5eb90b6.f233233z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.z2 eventListener = c16693xf5eb90b6.getEventListener();
        if (eventListener != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1) eventListener;
            int i18 = (int) ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233512d.f233500d;
            b21.m.h(i18);
            if (b21.m.c()) {
                b21.m.g();
            } else {
                b21.r b17 = b21.m.b();
                if (b17 != null) {
                    b17.D = i18;
                }
                kl3.t.g().d(b17);
            }
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(j1Var.f232748b, 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f452583u = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.Q6(j1Var.f232747a, 51);
        }
    }
}

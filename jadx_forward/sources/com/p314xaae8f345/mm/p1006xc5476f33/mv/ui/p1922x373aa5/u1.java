package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class u1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 f233492d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36) {
        this.f233492d = c16689xafe4de36;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        rm3.a aVar;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 && i17 >= c22848x6ddd90cf.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return;
        }
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463182o;
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463183p;
        if (str == null) {
            str = "";
        }
        if (0 == j17 || (aVar = this.f233492d.f233194g) == null) {
            return;
        }
        aVar.c(j17, str);
    }
}

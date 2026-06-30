package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f213408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f213409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f213410f;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176, float f17, float f18) {
        this.f213408d = c15258xcd50c176;
        this.f213409e = f17;
        this.f213410f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float m61718x13e6369;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f213408d;
        if (c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().d() < c15258xcd50c176.getLimitLine()) {
            c15258xcd50c176.m61722x390676d5().m61637x8d36fca1(false);
            return;
        }
        float f17 = c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().f(c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().g(c15258xcd50c176.getLimitLine() - 1, Float.MAX_VALUE));
        float drawSize = c15258xcd50c176.m61722x390676d5().getDrawSize();
        if (f17 < drawSize) {
            f17 = drawSize;
        }
        float a17 = c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().a(c15258xcd50c176.getLimitLine() - 1);
        float e17 = c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().e(c15258xcd50c176.getLimitLine() - 1);
        if (e17 == -1.0f) {
            e17 = c15258xcd50c176.m61719xd4a087b5().getBottom();
            a17 = c15258xcd50c176.m61719xd4a087b5().getTop();
        }
        float f18 = this.f213409e;
        float f19 = this.f213410f;
        if (f18 > 0.0f) {
            float f27 = f18 - f19;
            if (f17 > f27) {
                f17 = f27;
            }
        }
        c15258xcd50c176.m61722x390676d5().m61637x8d36fca1(true);
        boolean z17 = c15258xcd50c176.f212422n;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15220xab944c78 m61722x390676d5 = c15258xcd50c176.m61722x390676d5();
            m61722x390676d5.f212384y0.set(c15258xcd50c176.getCollapseTextViewAlwaysAlignRight() ? (f18 - f19) - c15258xcd50c176.m61722x390676d5().getDrawSize() : f17 - c15258xcd50c176.m61722x390676d5().getDrawSize(), a17, f18, e17);
            if (m61722x390676d5.enableFade) {
                m61722x390676d5.postInvalidate();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15220xab944c78 m61722x390676d52 = c15258xcd50c176.m61722x390676d5();
            m61722x390676d52.f212384y0.set(f17 - c15258xcd50c176.m61722x390676d5().getDrawSize(), a17, f18, e17);
            if (m61722x390676d52.enableFade) {
                m61722x390676d52.postInvalidate();
            }
        }
        c15258xcd50c176.m61736x774085db((f18 - f17) - f19);
        float collapseTextViewRight = c15258xcd50c176.getCollapseTextViewRight();
        c15258xcd50c176.m61736x774085db(0.0f < collapseTextViewRight ? collapseTextViewRight : 0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = c15258xcd50c176.m61719xd4a087b5().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (z17) {
            m61718x13e6369 = c15258xcd50c176.m61718x13e6369();
            layoutParams2.setMarginEnd((int) m61718x13e6369);
        } else {
            layoutParams2.setMarginEnd((int) c15258xcd50c176.getCollapseTextViewRight());
        }
        c15258xcd50c176.m61719xd4a087b5().setLayoutParams(layoutParams2);
        c15258xcd50c176.m61719xd4a087b5().setPadding((int) c15258xcd50c176.m61722x390676d5().getDrawSize(), 0, 0, 0);
        c15258xcd50c176.e();
    }
}

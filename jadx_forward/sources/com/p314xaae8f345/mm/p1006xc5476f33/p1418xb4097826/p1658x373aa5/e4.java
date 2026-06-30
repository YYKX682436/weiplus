package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f213510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f213511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f213512f;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176, float f17, float f18) {
        this.f213510d = c15258xcd50c176;
        this.f213511e = f17;
        this.f213512f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float m61718x13e6369;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f213510d;
        c15258xcd50c176.m61736x774085db(this.f213512f - ((c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().f(c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().g(c15258xcd50c176.getLimitLine() - 1, Float.MAX_VALUE)) + this.f213511e) + c15258xcd50c176.m61719xd4a087b5().m84162x74f59ea8().measureText("…")));
        float collapseTextViewRight = c15258xcd50c176.getCollapseTextViewRight();
        if (0.0f >= collapseTextViewRight) {
            collapseTextViewRight = 0.0f;
        }
        c15258xcd50c176.m61736x774085db(collapseTextViewRight);
        android.view.ViewGroup.LayoutParams layoutParams = c15258xcd50c176.m61719xd4a087b5().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (c15258xcd50c176.f212422n) {
            m61718x13e6369 = c15258xcd50c176.m61718x13e6369();
            layoutParams2.setMarginEnd((int) m61718x13e6369);
        } else {
            layoutParams2.setMarginEnd((int) c15258xcd50c176.getCollapseTextViewRight());
        }
        c15258xcd50c176.m61719xd4a087b5().setLayoutParams(layoutParams2);
        c15258xcd50c176.e();
    }
}

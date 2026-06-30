package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes.dex */
public final class q0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f203426e;

    /* renamed from: f, reason: collision with root package name */
    public final float f203427f;

    public q0(boolean z17, int i17, float f17) {
        this.f203426e = i17;
        this.f203427f = f17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dvo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.j item = (vp2.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ryg);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        int i19 = this.f203426e;
        layoutParams.width = i19;
        layoutParams.height = (int) (this.f203427f * i19);
        p17.setLayoutParams(layoutParams);
    }
}

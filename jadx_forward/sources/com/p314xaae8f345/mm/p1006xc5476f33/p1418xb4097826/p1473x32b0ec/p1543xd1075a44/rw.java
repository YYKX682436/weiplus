package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class rw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 f201224d;

    public rw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248) {
        this.f201224d = c14407x4ca0b248;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b m57929x351a7652 = this.f201224d.m57929x351a7652();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m57929x351a7652, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        m57929x351a7652.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m57929x351a7652, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f201224d.f199218s = 0;
        this.f201224d.c();
    }
}

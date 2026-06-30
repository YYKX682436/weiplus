package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class co implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7 f199548d;

    public co(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7 abstractC14403x128da8a7) {
        this.f199548d = abstractC14403x128da8a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b m57918x351a7652 = this.f199548d.m57918x351a7652();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m57918x351a7652, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        m57918x351a7652.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m57918x351a7652, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f199548d.f199197i = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7.b(this.f199548d);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rk0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 f195689d;

    public rk0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 vk0Var) {
        this.f195689d = vk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 vk0Var = this.f195689d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 u17 = vk0Var.u1();
        int mo1894x7e414b06 = vk0Var.t1().mo1894x7e414b06() - 1;
        if (mo1894x7e414b06 < 0) {
            mo1894x7e414b06 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$onAddedInViewPager$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        u17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$onAddedInViewPager$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        vk0Var.f196324w = 0;
    }
}

package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f296319d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296320e;

    public x(int i17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296319d = i17;
        this.f296320e = c22949xf1deaba4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296320e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f296319d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22949xf1deaba4, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2$SmoothScrollToPosition", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c22949xf1deaba4.e0(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22949xf1deaba4, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2$SmoothScrollToPosition", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}

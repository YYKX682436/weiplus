package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class ns implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f216883e;

    public ns(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        this.f216882d = s0Var;
        this.f216883e = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = this.f216882d.o();
        int i17 = this.f216883e.f217151s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveVideoView$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        o17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(o17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveVideoView$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class et implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f215831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f215832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.c0 f215833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f215834g;

    public et(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, dw2.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        this.f215831d = i17;
        this.f215832e = c1163xf1deaba4;
        this.f215833f = c0Var;
        this.f215834g = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f215831d;
        if (i17 > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f215832e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$resetLiveRecyclerViewState$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$resetLiveRecyclerViewState$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            dw2.c0 c0Var = this.f215833f;
            if (c0Var != null) {
                c0Var.y("FinderHDRVideoOrientationUIC", false, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f215834g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f215832e;
        c1163xf1deaba42.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dt(ptVar, c1163xf1deaba42));
    }
}

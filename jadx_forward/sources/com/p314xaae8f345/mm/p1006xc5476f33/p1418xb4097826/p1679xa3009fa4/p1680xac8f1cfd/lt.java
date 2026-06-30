package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f216615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f216616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.c0 f216617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216618g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f216619h;

    public lt(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, dw2.c0 c0Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        this.f216615d = i17;
        this.f216616e = c1163xf1deaba4;
        this.f216617f = c0Var;
        this.f216618g = view;
        this.f216619h = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f216615d;
        if (i17 > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f216616e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$restoreRecyclerView$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$restoreRecyclerView$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            dw2.c0 c0Var = this.f216617f;
            if (c0Var != null) {
                c0Var.y("FinderHDRVideoOrientationUIC", false, true);
            }
        }
        android.view.View view = this.f216618g;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kt(this.f216619h, this.f216616e));
        }
    }
}

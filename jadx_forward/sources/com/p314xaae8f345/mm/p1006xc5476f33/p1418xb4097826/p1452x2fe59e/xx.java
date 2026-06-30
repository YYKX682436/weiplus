package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f192654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f192655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f192656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f192657g;

    public xx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, boolean z17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, long j17) {
        this.f192654d = pzVar;
        this.f192655e = z17;
        this.f192656f = c1162x665295de;
        this.f192657g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f192654d;
        in5.n0 T0 = pzVar.T0();
        if (T0 == null || (s0Var = (in5.s0) in5.n0.Y(T0, pzVar.f190306x0.hashCode(), false, 2, null)) == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!s0Var.f3639x46306858.getGlobalVisibleRect(rect) || rect.height() <= 0) {
            return;
        }
        boolean z17 = this.f192655e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
            if (ctVar != null && (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) != null) {
                m56655x4905e9fa.mo7976xc291bbd2(0, rect.height());
            }
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f192656f;
            if (c1162x665295de != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(1);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "[hideSearchBar] to hide search bar. delay=" + this.f192657g + " isSmooth=" + z17 + " height=" + rect.height());
    }
}

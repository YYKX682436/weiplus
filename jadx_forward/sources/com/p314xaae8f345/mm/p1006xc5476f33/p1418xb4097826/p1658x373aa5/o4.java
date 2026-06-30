package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f214296e;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa) {
        this.f214295d = c15260x406bbe1b;
        this.f214296e = c13920xa5f564aa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var;
        android.view.View f17;
        int[] c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDataSetChanged position:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214295d;
        sb6.append(c15260x406bbe1b.f212448s);
        sb6.append(", lastPosition:");
        sb6.append(c15260x406bbe1b.getLastSnappedPosition());
        sb6.append(" newList.size:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = this.f214296e;
        sb6.append(c13920xa5f564aa.size());
        sb6.append(' ');
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(c13920xa5f564aa);
        sb6.append(j5Var != null ? hc2.b0.f(j5Var, true) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderColumnFrameLayout", sb6.toString());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c15260x406bbe1b.m61759x4905e9fa().getLayoutManager();
        if (layoutManager != null && (f17 = (y1Var = c15260x406bbe1b.f212439g).f(layoutManager)) != null && (c17 = y1Var.c(layoutManager, f17)) != null && (c17[0] != 0 || c17[1] != 0)) {
            c15260x406bbe1b.m61759x4905e9fa().scrollBy(c17[0], c17[1]);
        }
        c15260x406bbe1b.getColumnFeedSelectorAdapter().d(false);
    }
}

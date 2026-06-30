package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f190651d;

    public tz(java.lang.ref.WeakReference rHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rHelper, "rHelper");
        this.f190651d = rHelper;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTimelinePresenterHelper", "PoiUpdateTask run!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00) this.f190651d.get();
        if (g00Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTimelinePresenterHelper", "PoiUpdateTask run but Helper is null!");
            return;
        }
        g00Var.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz tzVar = g00Var.f188341m;
        if (tzVar != null) {
            g00Var.e().mo50300x3fa464aa(tzVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e17 = g00Var.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz tzVar2 = g00Var.f188341m;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.f188328p;
        e17.mo50297x7c4d7ca2(tzVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.f188327o);
    }
}

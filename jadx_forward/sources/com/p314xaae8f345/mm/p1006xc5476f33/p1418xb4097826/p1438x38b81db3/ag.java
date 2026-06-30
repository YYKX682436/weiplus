package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ag implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f184416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184417f;

    public ag(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar, in5.s0 s0Var) {
        this.f184415d = z17;
        this.f184416e = qgVar;
        this.f184417f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f184415d;
        in5.s0 s0Var = this.f184417f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f184416e;
        if (z17) {
            qgVar.r(s0Var, false, true);
        } else {
            qgVar.r(s0Var, true, true);
        }
    }
}

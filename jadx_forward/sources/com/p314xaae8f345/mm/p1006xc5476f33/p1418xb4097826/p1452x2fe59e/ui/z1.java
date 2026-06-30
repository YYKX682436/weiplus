package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2 f192320d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2 d2Var) {
        this.f192320d = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2 d2Var = this.f192320d;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 a17 = d2Var.a(d2Var);
        if (a17 == null) {
            return;
        }
        d2Var.f191460g = a17;
        if (a17.getOverCallback() != null) {
            return;
        }
        a17.m82562xefb63abb(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y1());
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258323e;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var, java.lang.String str) {
        this.f258323e = h2Var;
        this.f258322d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.a aVar = this.f258323e.f258092b;
        if (aVar != null) {
            java.lang.String str = this.f258322d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar;
            if (d0Var.f257909g != null) {
                d0Var.L = str;
                d0Var.f257909g.e4(str);
            }
        }
    }
}

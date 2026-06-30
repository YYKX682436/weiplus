package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class i1 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231533d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var) {
        this.f231533d = v0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231533d;
        v0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - v0Var.f231713w;
        sj3.e4 e4Var = sj3.e4.Talking;
        if (currentTimeMillis >= 45000 && this.f231533d.f231709s != e4Var) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.g1(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var2 = this.f231533d;
        if (v0Var2.f231709s == e4Var) {
            v0Var2.f231714x++;
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h1(this));
        }
    }
}

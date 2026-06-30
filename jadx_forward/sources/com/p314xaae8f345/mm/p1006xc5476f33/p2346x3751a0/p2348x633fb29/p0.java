package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f258310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258312f;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var, int i17, int i18) {
        this.f258312f = g1Var;
        this.f258310d = i17;
        this.f258311e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3 k3Var = this.f258312f.f258067z;
        if (k3Var != null) {
            k3Var.Q(this.f258310d, this.f258311e);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class r1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f169276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f169277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f169278d;

    public r1(java.lang.String str, int i17, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, l81.v0 v0Var) {
        this.f169275a = str;
        this.f169276b = i17;
        this.f169277c = atomicBoolean;
        this.f169278d = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s0
    public void a() {
        l81.v0 v0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindRemoteService onRemoteProcessDied(");
        java.lang.String str = this.f169275a;
        sb6.append(str);
        sb6.append("), id:");
        sb6.append(this.f169276b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        if (!this.f169277c.getAndSet(true) && (v0Var = this.f169278d) != null) {
            l81.v0.b(v0Var, -5, null, 2, null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(str, this);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258309g;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f258309g = h2Var;
        this.f258306d = z17;
        this.f258307e = str;
        this.f258308f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f258306d, this.f258307e);
        this.f258309g.b(this.f258307e, this.f258306d, false, this.f258308f);
    }
}

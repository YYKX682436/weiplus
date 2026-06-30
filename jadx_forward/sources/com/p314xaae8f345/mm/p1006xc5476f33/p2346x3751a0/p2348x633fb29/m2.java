package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258284g;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f258284g = h2Var;
        this.f258281d = z17;
        this.f258282e = str;
        this.f258283f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f258281d, this.f258282e);
        this.f258284g.b(this.f258282e, this.f258281d, false, this.f258283f);
    }
}

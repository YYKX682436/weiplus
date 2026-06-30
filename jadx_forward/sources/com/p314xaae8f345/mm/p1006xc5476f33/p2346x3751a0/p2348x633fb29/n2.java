package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258301g;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f258301g = h2Var;
        this.f258298d = z17;
        this.f258299e = str;
        this.f258300f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f258298d, this.f258299e);
        this.f258301g.b(this.f258299e, this.f258298d, false, this.f258300f);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i f269953g;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i iVar, java.lang.String str, int i17, int i18) {
        this.f269953g = iVar;
        this.f269950d = str;
        this.f269951e = i17;
        this.f269952f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f269953g.g(this.f269950d, this.f269951e, this.f269952f);
    }
}

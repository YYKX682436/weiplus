package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee f269933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a f269934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269938i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f269939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269940n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269941o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f269942p;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee c19541x2b0e01ee, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, int i18) {
        this.f269933d = c19541x2b0e01ee;
        this.f269934e = aVar;
        this.f269935f = i17;
        this.f269936g = str;
        this.f269937h = str2;
        this.f269938i = str3;
        this.f269939m = j17;
        this.f269940n = str4;
        this.f269941o = str5;
        this.f269942p = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.b0(this);
        int i17 = this.f269935f;
        java.lang.String str = this.f269936g;
        if (i17 == 1) {
            xz4.i.a().c(str, b0Var);
            return;
        }
        xz4.i a17 = xz4.i.a();
        int i18 = this.f269935f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f269937h;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f269938i;
        if (str3 == null) {
            str3 = "";
        }
        long j17 = this.f269939m;
        java.lang.String str4 = this.f269940n;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = this.f269941o;
        if (str5 == null) {
            str5 = "";
        }
        a17.f(i18, str, "", str2, str3, j17, str4, "", str5, this.f269942p, b0Var);
    }
}

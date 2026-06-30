package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1 f169388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f169390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169392h;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1 j1Var, int i17, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f169388d = j1Var;
        this.f169389e = i17;
        this.f169390f = z17;
        this.f169391g = str;
        this.f169392h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7122xaa5bd9fc wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1.wi(this.f169388d, this.f169389e);
            boolean z17 = this.f169390f;
            java.lang.String str = this.f169391g;
            java.lang.String str2 = this.f169392h;
            wi6.f144417k = z17 ? 1L : 0L;
            wi6.f144419m = wi6.b("ModelName", str, true);
            wi6.f144420n = wi6.b("ManuFacturer", str2, true);
            wi6.k();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }
}

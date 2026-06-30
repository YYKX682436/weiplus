package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f271115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f271116h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271117i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f271118m;

    public h(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p pVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, boolean z17) {
        this.f271112d = str;
        this.f271113e = str2;
        this.f271114f = str3;
        this.f271115g = i17;
        this.f271116h = i18;
        this.f271117i = str4;
        this.f271118m = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(this.f271112d);
        java.lang.String str = this.f271113e;
        java.lang.String str2 = this.f271114f;
        int i17 = this.f271115g;
        int i18 = this.f271116h;
        java.lang.String str3 = this.f271117i;
        if (e17 == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
            n0Var.f68783xe47531de = i17;
            n0Var.f68773x5efdd21f = str2;
            long j17 = i18;
            n0Var.f68791x44eeb14 = j17;
            n0Var.f68794x9383c60a = str3;
            n0Var.f68788xd2f45e28 = str;
            l0Var.g(n0Var, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 51L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 45L);
            return;
        }
        int i19 = e17.f68783xe47531de;
        boolean z17 = this.f271118m;
        if (i19 >= i17) {
            if (z17 && i19 == i17) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.x.a(e17, true, true);
                return;
            }
            return;
        }
        e17.f68783xe47531de = i17;
        e17.f68773x5efdd21f = str2;
        e17.f68791x44eeb14 = i18;
        e17.f68794x9383c60a = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68788xd2f45e28)) {
            e17.f68788xd2f45e28 = str;
        }
        l0Var.g(e17, true);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.x.a(e17, true, z17);
    }
}

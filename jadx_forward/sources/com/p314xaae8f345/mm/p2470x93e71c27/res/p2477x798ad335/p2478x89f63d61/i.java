package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f271123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271124h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p f271125i;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p pVar, int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        this.f271125i = pVar;
        this.f271120d = i17;
        this.f271121e = i18;
        this.f271122f = str;
        this.f271123g = i19;
        this.f271124h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f271120d;
        int i18 = this.f271121e;
        java.lang.String str = this.f271122f;
        int i19 = this.f271123g;
        java.lang.String str2 = this.f271124h;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p pVar = this.f271125i;
        pVar.getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, i18);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(c17);
        if (e17 == null) {
            return;
        }
        boolean z17 = e17.f68779xcef2f7da;
        e17.f68779xcef2f7da = false;
        l0Var.g(e17, true);
        if (i19 != com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l0Var.f271218d;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventFileCached: get null eventThread ");
        } else {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.j(pVar, i17, i18, str, i19, z17, str2));
        }
    }
}

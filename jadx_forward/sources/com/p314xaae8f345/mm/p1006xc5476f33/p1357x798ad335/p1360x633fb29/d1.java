package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f178548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f178549f;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var, h02.a aVar, long j17) {
        this.f178549f = f1Var;
        this.f178547d = aVar;
        this.f178548e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        h02.a aVar = this.f178547d;
        int m37766x958b0444 = c4446x11b6e6e0 != null ? c4446x11b6e6e0.m37766x958b0444(aVar.f68411x238eb002) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "resumeDownloadTask: " + m37766x958b0444);
        aVar.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
        aVar.f68439x5ab9b1b4 = 1;
        aVar.f68438x1bb3427e = aVar.f68413xf432b5ad;
        long j17 = this.f178548e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var = this.f178549f;
        if (m37766x958b0444 != 0) {
            aVar.f68441x10a0fed7 = 4;
            aVar.f68416x1c571ead = 202;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
            f1Var.f178745a.c(j17, aVar.f68416x1c571ead, false);
            return;
        }
        aVar.f68441x10a0fed7 = 1;
        aVar.f68416x1c571ead = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
        f1Var.f178745a.h(j17, aVar.f68419xf1e9b966);
        long j18 = aVar.f68443x78351860;
        if (j18 != 0) {
            long j19 = aVar.f68413xf432b5ad / j18;
        }
    }
}

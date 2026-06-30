package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class i7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 f157125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m81.b f157127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] f157128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f157129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f157130f;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var, java.lang.String str, m81.b bVar, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] vVarArr, java.util.concurrent.CountDownLatch countDownLatch, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f157125a = a9Var;
        this.f157126b = str;
        this.f157127c = bVar;
        this.f157128d = vVarArr;
        this.f157129e = countDownLatch;
        this.f157130f = r6Var;
    }

    public final void a(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var = this.f157125a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppCoreDownloadPerformer", "notifyFail for urlKey:%s, errCode:%d, errMsg:%s", a9Var.f(), java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(a9Var, (java.lang.Exception) null, 0, 3);
        vVar.f271265j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
        this.f157128d[0] = vVar;
        this.f157129e.countDown();
    }
}

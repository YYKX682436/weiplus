package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class c0 implements org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f156994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 f156996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m81.b f156998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] f156999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f157000g;

    public c0(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var, java.lang.String str2, m81.b bVar, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v[] vVarArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f156994a = r6Var;
        this.f156995b = str;
        this.f156996c = a9Var;
        this.f156997d = str2;
        this.f156998e = bVar;
        this.f156999f = vVarArr;
        this.f157000g = countDownLatch;
    }

    public final void a(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.Exception exc) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(this.f156996c, exc, abstractC29564x6974077e != null ? abstractC29564x6974077e.mo153682xea30509d() : 0, 3);
        vVar.f271265j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        this.f156999f[0] = vVar;
        this.f157000g.countDown();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onCanceled */
    public void mo49258x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(this.f156996c, (java.lang.Exception) null, 0, 4);
        vVar.f271265j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        this.f156999f[0] = vVar;
        this.f157000g.countDown();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onFailed */
    public void mo49259x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        a(abstractC29564x6974077e, abstractC29501x119930f2);
        this.f156994a.l();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
    /* renamed from: onSucceeded */
    public void mo49260x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e info, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean z17 = info.mo153682xea30509d() == 200 || info.mo153682xea30509d() == 206;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChromiumCronetPerformer", "onCronetTaskCompleted, succeed:%b, statusCode:%d, urlKey:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(info.mo153682xea30509d()), this.f156995b);
        if (!z17) {
            a(info, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var = this.f156996c;
        a9Var.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v("AppBrandWxaPkgDownloader", a9Var.f(), a9Var.f156968i, a9Var.e(), -1L, null, 2, null);
        m81.b bVar = this.f156998e;
        java.lang.String str = bVar.f271247c;
        java.lang.String str2 = this.f156997d;
        if (!u46.l.c(str2, str)) {
            com.p314xaae8f345.mm.vfs.w6.w(str2, bVar.f271247c);
        }
        info.mo153684xb7ab1854();
        bm5.f1.a();
        this.f156999f[0] = vVar;
        android.os.Bundle bundle = vVar.f271265j;
        bundle.putInt("RESPONSE_KEY_DNS_TYPE", 0);
        bundle.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.mo153684xb7ab1854(), "h2")) {
            bundle.putBoolean("RESPONSE_KEY_USE_HTTP2", true);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.mo153684xb7ab1854(), "h3")) {
            bundle.putBoolean("RESPONSE_KEY_USE_HTTP3", true);
        }
        this.f157000g.countDown();
    }
}

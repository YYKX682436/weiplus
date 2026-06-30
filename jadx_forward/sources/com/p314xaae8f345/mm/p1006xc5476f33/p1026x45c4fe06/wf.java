package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class wf extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8 {
    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8
    /* renamed from: onCanceled */
    public void mo53305x9dc2a798(long j17) {
        java.lang.Object remove;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173963b) {
            remove = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173964c.remove(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf xfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf) remove;
        if (xfVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7 i7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7) xfVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var = i7Var.f157125a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeAppCoreDownloadPerformer", "notifyTimeout for urlKey:%s", a9Var.f());
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(a9Var, (java.lang.Exception) null, 0, 4);
            vVar.f271265j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
            i7Var.f157128d[0] = vVar;
            i7Var.f157129e.countDown();
        }
        m83380xb1e0e51a(j17);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8
    /* renamed from: onFailed */
    public void mo53306x428b6afc(long j17, long j18, java.lang.String errMsg) {
        java.lang.Object remove;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173963b) {
            remove = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173964c.remove(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf xfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf) remove;
        if (xfVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7 i7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7) xfVar;
            i7Var.a(j18, errMsg);
            i7Var.f157130f.l();
        }
        m83380xb1e0e51a(j17);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8
    /* renamed from: onProgress */
    public void mo53307x696ee52c(long j17, long j18, long j19) {
        java.lang.Object obj;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173963b) {
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173964c.get(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf xfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf) obj;
        if (xfVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7 i7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7) xfVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c9 c9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c9) i7Var.f157125a.f271269g;
            if (c9Var != null) {
                long j27 = j19 > j18 ? j18 : j19;
                c9Var.d(i7Var.f157125a.f(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f(j18 <= 0 ? 0 : a06.d.b(e06.p.e((((float) j27) * 100.0f) / ((float) j18), 0.0f, 100.0f)), j27, j18));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8
    /* renamed from: onSuccess */
    public void mo53308xe05b4124(long j17, long j18, java.lang.String negotiatedProtocol) {
        java.lang.Object remove;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(negotiatedProtocol, "negotiatedProtocol");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173963b) {
            remove = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173964c.remove(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf xfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xf) remove;
        if (xfVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7 i7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i7) xfVar;
            boolean z17 = j18 == 200 || j18 == 206;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var = i7Var.f157125a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppCoreDownloadPerformer", "onSuccess, succeed:%b, statusCode:%d, key:%s, proto:%s", valueOf, valueOf2, a9Var.f(), negotiatedProtocol);
            if (z17) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v("AppBrandWxaPkgDownloader", a9Var.f(), a9Var.f156968i, a9Var.e(), -1L, null, 2, null);
                m81.b bVar = i7Var.f157127c;
                java.lang.String str = bVar.f271247c;
                java.lang.String str2 = i7Var.f157126b;
                if (!u46.l.c(str2, str)) {
                    com.p314xaae8f345.mm.vfs.w6.w(str2, bVar.f271247c);
                }
                i7Var.f157128d[0] = vVar;
                android.os.Bundle bundle = vVar.f271265j;
                bundle.putInt("RESPONSE_KEY_DNS_TYPE", 0);
                bundle.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(negotiatedProtocol, "h2")) {
                    bundle.putBoolean("RESPONSE_KEY_USE_HTTP2", true);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(negotiatedProtocol, "h3")) {
                    bundle.putBoolean("RESPONSE_KEY_USE_HTTP3", true);
                }
                i7Var.f157129e.countDown();
            } else {
                i7Var.a(j18, "Download failed with status code: " + j18);
            }
        }
        m83380xb1e0e51a(j17);
    }
}

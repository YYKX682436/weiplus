package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class of implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f190172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf f190173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f190174f;

    public of(byte[] bArr, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar, java.lang.ref.WeakReference weakReference) {
        this.f190172d = bArr;
        this.f190173e = ufVar;
        this.f190174f = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f190172d;
        java.lang.String str = bArr != null ? new java.lang.String(bArr, r26.c.f450398a) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar = this.f190173e;
        ufVar.j();
        boolean z17 = true;
        if (str != null && r26.n0.B(str, "TencentStreamSEI", false)) {
            return;
        }
        if (!(str == null || str.length() == 0)) {
            try {
                cl0.g gVar = new cl0.g(str);
                int optInt = gVar.optInt("wxT");
                if (optInt != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.mo15082x48bce8a4("d"))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf.a(ufVar, optInt, gVar, this.f190174f);
                }
            } catch (java.lang.Exception unused) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        try {
            r45.fa4 fa4Var = new r45.fa4();
            if (bArr != null) {
                try {
                    fa4Var.mo11468x92b714fd(bArr);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ufVar.j(), "handleSeiMessage seiData wxt:" + fa4Var.f455676d);
            ufVar.f190701n.d(fa4Var);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(ufVar.j(), "handleSeiMessage seiData Exception:" + e18.getMessage() + " seiMessage:" + str);
        }
    }
}

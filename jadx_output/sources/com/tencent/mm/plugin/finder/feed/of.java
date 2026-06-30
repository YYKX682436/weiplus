package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class of implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f108639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uf f108640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f108641f;

    public of(byte[] bArr, com.tencent.mm.plugin.finder.feed.uf ufVar, java.lang.ref.WeakReference weakReference) {
        this.f108639d = bArr;
        this.f108640e = ufVar;
        this.f108641f = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f108639d;
        java.lang.String str = bArr != null ? new java.lang.String(bArr, r26.c.f368865a) : null;
        com.tencent.mm.plugin.finder.feed.uf ufVar = this.f108640e;
        ufVar.j();
        boolean z17 = true;
        if (str != null && r26.n0.B(str, "TencentStreamSEI", false)) {
            return;
        }
        if (!(str == null || str.length() == 0)) {
            try {
                cl0.g gVar = new cl0.g(str);
                int optInt = gVar.optInt("wxT");
                if (optInt != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(gVar.optString("d"))) {
                    com.tencent.mm.plugin.finder.feed.uf.a(ufVar, optInt, gVar, this.f108641f);
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
                    fa4Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            com.tencent.mars.xlog.Log.i(ufVar.j(), "handleSeiMessage seiData wxt:" + fa4Var.f374143d);
            ufVar.f109168n.d(fa4Var);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w(ufVar.j(), "handleSeiMessage seiData Exception:" + e18.getMessage() + " seiMessage:" + str);
        }
    }
}

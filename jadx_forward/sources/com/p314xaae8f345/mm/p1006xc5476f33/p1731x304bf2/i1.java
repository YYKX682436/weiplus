package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public final class i1 implements vz4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220993b;

    public i1(java.lang.String str, java.lang.String str2) {
        this.f220992a = str;
        this.f220993b = str2;
    }

    @Override // vz4.j
    public void a(java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.GameLiteAppStoreService", "fetchLastLitePkg failed. errorMsg:" + errorMsg + " LiteApp pkgid:" + this.f220992a + ", AppId:" + this.f220993b);
    }

    @Override // vz4.j
    /* renamed from: onSuccess */
    public void mo64503xe05b4124(java.lang.String str) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.GameLiteAppStoreService", "fetchLastLitePkg success. LiteAppAppId:" + str);
        r53.f.H(this.f220992a, this.f220993b, null);
    }
}

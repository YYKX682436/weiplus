package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes7.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f157426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.String str, long j17) {
        super(0);
        this.f157425d = str;
        this.f157426e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f157425d;
        k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str, "appInfo");
        k91.j5 u07 = n17 != null ? n17.u0() : null;
        if (u07 != null) {
            boolean b17 = u07.b();
            long j17 = this.f157426e;
            if (b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WAGAME username:" + str + ", timestamp:" + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170362t);
            } else if (u07.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload FAKE NATIVE username:" + str + ", timestamp:" + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170362t);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WASERVICE username:" + str + ", timestamp:" + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170362t);
            }
        }
        return jz5.f0.f384359a;
    }
}

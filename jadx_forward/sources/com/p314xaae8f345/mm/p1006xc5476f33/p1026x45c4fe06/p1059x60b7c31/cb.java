package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class cb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f161726c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb f161729f;

    public cb(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb ebVar) {
        this.f161724a = str;
        this.f161725b = str2;
        this.f161726c = i17;
        this.f161727d = lVar;
        this.f161728e = i18;
        this.f161729f = ebVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 r6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "preDownload appId:" + this.f161724a + " moduleName:" + this.f161725b + " scene:" + this.f161726c + " result:" + r6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 r6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_AllPkgDownloaded;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb ebVar = this.f161729f;
        int i17 = this.f161728e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161727d;
        if (r6Var == r6Var2 || r6Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_AllPkgDownloadedPrevious || r6Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_NoNeedGetCode) {
            lVar.a(i17, ebVar.o("ok"));
        } else {
            lVar.a(i17, ebVar.o("fail"));
        }
    }
}

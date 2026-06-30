package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.t f161800c;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.t tVar) {
        this.f161798a = lVar;
        this.f161799b = i17;
        this.f161800c = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12050xe3c5ace1 c12050xe3c5ace1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12050xe3c5ace1) abstractC11888x1a859600;
        if (c12050xe3c5ace1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = c12050xe3c5ace1.f161741d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.t tVar = this.f161800c;
        this.f161798a.a(this.f161799b, i17 == 0 ? tVar.o("ok") : tVar.o("fail:internal error"));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0 f170127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0 z0Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f170126e = str;
        this.f170127f = z0Var;
        this.f170128g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.y0(this.f170126e, this.f170127f, this.f170128g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f170125d;
        java.lang.String str = this.f170126e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170130h.get(str);
                java.lang.String str2 = v0Var != null ? v0Var.f170116b : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: savePath=" + str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0 z0Var = this.f170127f;
                java.lang.String str3 = this.f170128g;
                this.f170125d = 1;
                obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.C(z0Var, str3, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: download success, posterTaskId=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170129g.a(str, bitmap);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: download failed, posterTaskId=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170129g.a(str, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: exception occurred, posterTaskId=" + str, e17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170129g.a(str, null);
        }
        return jz5.f0.f384359a;
    }
}

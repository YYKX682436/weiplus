package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f195946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195949h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f195950i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vg2.m f195951m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, int i17, java.lang.String str, ce2.i iVar, vg2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195946e = hVar;
        this.f195947f = hmVar;
        this.f195948g = i17;
        this.f195949h = str;
        this.f195950i = iVar;
        this.f195951m = mVar;
        this.f195952n = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tk(this.f195946e, interfaceC29045xdcb5ca57, this.f195947f, this.f195948g, this.f195949h, this.f195950i, this.f195951m, this.f195952n);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tk) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195945d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f195947f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hmVar.f194364r, "AIGC gift image upload completed. " + this.f195948g + ", " + this.f195949h);
            this.f195945d = 1;
            if (hmVar.M1(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qk(this.f195950i, this.f195951m, this.f195952n));
        return jz5.f0.f384359a;
    }
}

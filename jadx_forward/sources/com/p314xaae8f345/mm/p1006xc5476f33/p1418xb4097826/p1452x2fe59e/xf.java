package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class xf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f192593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ag f192594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f192597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ag agVar, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f192593d = hVar;
        this.f192594e = agVar;
        this.f192595f = str;
        this.f192596g = str2;
        this.f192597h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xf(this.f192593d, interfaceC29045xdcb5ca57, this.f192594e, this.f192595f, this.f192596g, this.f192597h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xf xfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xfVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ix1 ix1Var = (r45.ix1) ((xg2.i) this.f192593d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f192594e.f187819d, "getSongPlayDetailInfo success sdkUserId: " + this.f192595f + " songUniqueId: " + this.f192596g);
        this.f192597h.f391656d = ix1Var.f458919d;
        return jz5.f0.f384359a;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f233528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f233529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.p314xaae8f345.mm.p944x882e457a.f fVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f233528d = fVar;
        this.f233529e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.y3(this.f233528d, this.f233529e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.y3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType: ");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f233528d;
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f152148a) : null);
        sb6.append(", errCode: ");
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f152149b) : null);
        sb6.append(", errMsg: ");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MusicMvTabMyPostFragment", sb6.toString());
        this.f233529e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}

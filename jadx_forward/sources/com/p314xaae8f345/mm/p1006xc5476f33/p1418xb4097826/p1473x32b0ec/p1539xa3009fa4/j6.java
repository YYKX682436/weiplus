package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f198699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198697e = b8Var;
        this.f198698f = i17;
        this.f198699g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j6(this.f198697e, this.f198698f, this.f198699g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f198696d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198697e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b8Var.f198476n = az2.c.a(az2.f.f97658d, b8Var.m80379x76847179(), null, 0L, null, 10, null);
            az2.f fVar = b8Var.f198476n;
            if (fVar != null) {
                fVar.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j2 j2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j2.f197112a;
            this.f198696d = 1;
            obj = j2Var.a(this.f198698f, this.f198699g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        wl2.b bVar = (wl2.b) obj;
        az2.f fVar2 = b8Var.f198476n;
        if (fVar2 != null) {
            fVar2.b();
        }
        boolean z17 = bVar.f528578a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            b8Var.h7();
            return f0Var;
        }
        db5.t7.m(b8Var.m80379x76847179(), b8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkq));
        return f0Var;
    }
}

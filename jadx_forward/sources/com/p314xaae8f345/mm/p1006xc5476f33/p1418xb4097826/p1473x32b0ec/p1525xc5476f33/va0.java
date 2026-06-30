package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class va0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f196231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0 f196232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0 wa0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196232e = wa0Var;
        this.f196233f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va0 va0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va0(this.f196232e, this.f196233f, interfaceC29045xdcb5ca57);
        va0Var.f196231d = obj;
        return va0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va0 va0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        va0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        cl0.g b17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f196231d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0 wa0Var = this.f196232e;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = wa0Var.f196441y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        cl0.g gVar = new cl0.g(this.f196233f);
        int optInt = gVar.optInt("wxT");
        hn0.u uVar = hn0.u.f363970e;
        if (optInt == 2 && (b17 = gVar.b("subtitle")) != null) {
            int optInt2 = b17.optInt("index_eng");
            int optInt3 = b17.optInt("index_chn");
            int optInt4 = b17.optInt("duration");
            java.lang.String mo15082x48bce8a4 = b17.mo15082x48bce8a4("chn");
            java.lang.String mo15082x48bce8a42 = b17.mo15082x48bce8a4("eng");
            zl2.r4.f555483a.M2("FinderLiveSubtitlePlugin", "msg:\n " + b17 + '}');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0.u1(wa0Var, mo15082x48bce8a4, optInt3, optInt4, 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa0.u1(wa0Var, mo15082x48bce8a42, optInt2, optInt4, 2);
            ((mm2.n6) wa0Var.P0(mm2.n6.class)).f410828h = true;
        }
        wa0Var.f196441y = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ua0(wa0Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}

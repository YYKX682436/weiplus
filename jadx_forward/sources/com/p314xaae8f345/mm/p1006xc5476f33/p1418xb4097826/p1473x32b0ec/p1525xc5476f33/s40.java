package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f195752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f195753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 f195754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, cm2.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195752d = hVar;
        this.f195753e = d0Var;
        this.f195754f = z40Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s40(this.f195752d, interfaceC29045xdcb5ca57, this.f195753e, this.f195754f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s40 s40Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s40) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s40Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cm2.d0 d0Var = this.f195753e;
        r45.v42 v42Var = d0Var.f124868v;
        v42Var.set(4, java.lang.Integer.valueOf(v42Var.m75939xb282bd08(4) == 0 ? 1 : 0));
        int m75939xb282bd08 = d0Var.f124868v.m75939xb282bd08(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var = this.f195754f;
        if (m75939xb282bd08 == 1) {
            android.content.Context context = z40Var.f196814d;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8l));
        }
        z40Var.a(d0Var);
        z40Var.getClass();
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(d0Var.f124918d));
        qc2Var.set(1, d0Var.f124919e);
        r45.v42 v42Var2 = d0Var.f124868v;
        qc2Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(v42Var2.mo14344x5f01b1f6()));
        qc2Var.set(3, java.lang.Boolean.valueOf(v42Var2.m75939xb282bd08(4) == 1));
        qc2Var.set(4, d0Var.f124929r);
        qc2Var.set(5, ((mm2.f6) z40Var.f196815e.a(mm2.f6.class)).N);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z40Var.f196818h, "[updateSyncExtra]  hidden_state = " + qc2Var.m75933x41a8a7f2(3) + ", extBUf = " + qc2Var.m75934xbce7f2f(1) + ", current_promoting_id = " + qc2Var.m75942xfb822ef2(0));
        dk2.ef.f314925k.h(10, qc2Var);
        return jz5.f0.f384359a;
    }
}

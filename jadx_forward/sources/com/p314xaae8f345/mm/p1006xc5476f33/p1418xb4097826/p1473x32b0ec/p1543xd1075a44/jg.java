package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f200289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f200290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200289d = hVar;
        this.f200290e = bhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jg(this.f200289d, interfaceC29045xdcb5ca57, this.f200290e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jg jgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jgVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.bq1 bq1Var = (r45.bq1) ((xg2.i) this.f200289d).f535926b;
        int size = bq1Var.m75941xfb821914(1).size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f200290e;
        if (size > 0) {
            bhVar.f199426x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572088ye);
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var != null && (list = n2Var.f410816n) != null) {
                java.util.LinkedList m75941xfb821914 = bq1Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCustom_gifts(...)");
                ((java.util.ArrayList) list).addAll(m75941xfb821914);
            }
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 != null) {
                n2Var2.f410817o = (r45.gg1) bq1Var.m75936x14adae67(2);
            }
        } else {
            bhVar.f199426x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573058de1);
        }
        return jz5.f0.f384359a;
    }
}

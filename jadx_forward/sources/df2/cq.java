package df2;

/* loaded from: classes3.dex */
public final class cq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.gq f311439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(df2.gq gqVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311439d = gqVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.cq(this.f311439d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.cq cqVar = (df2.cq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cqVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.gq gqVar = this.f311439d;
        r45.fu1 fu1Var = gqVar.f311771n;
        if ((fu1Var == null || (m75941xfb821914 = fu1Var.m75941xfb821914(1)) == null || !(m75941xfb821914.isEmpty() ^ true)) ? false : true) {
            r45.fu1 fu1Var2 = gqVar.f311771n;
            if (fu1Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et a76 = gqVar.a7();
                if (a76 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(a76, null, false, 0, 7, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et a77 = gqVar.a7();
                if (a77 != null) {
                    java.util.LinkedList m75941xfb8219142 = fu1Var2.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getItem_list(...)");
                    a77.K = m75941xfb8219142;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vs) ((jz5.n) a77.U).mo141623x754a37bb()).m8146xced61ae5();
                    a77.k0();
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30) gqVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30.class);
            if (r30Var != null) {
                r30Var.v1(null);
            }
        }
        return jz5.f0.f384359a;
    }
}

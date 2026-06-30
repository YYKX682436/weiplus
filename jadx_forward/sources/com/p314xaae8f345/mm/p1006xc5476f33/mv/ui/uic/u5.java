package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f233011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.l f233012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var, fm3.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f233011e = z5Var;
        this.f233012f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u5(this.f233011e, this.f233012f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f233010d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t5 t5Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t5(this.f233012f, null);
            this.f233010d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, t5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk4.a aVar2 = (dk4.a) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (aVar2 == null) {
            return f0Var;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        rw2.k kVar = new rw2.k(aVar2);
        kVar.f392604a = 80;
        kVar.f392605b = 120;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f233011e;
        kVar.f392609f = (z5Var.f233116v * ((float) z5Var.f233114t)) / (((z5Var.C * 1.0f) / 120) * 80);
        kVar.f();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4 P6 = z5Var.P6();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        P6.f233060e = new rw2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4 P62 = z5Var.P6();
        java.util.List c17 = kz5.b0.c(kVar);
        P62.getClass();
        java.util.ArrayList arrayList = P62.f233059d;
        arrayList.clear();
        arrayList.addAll(c17);
        P62.m8146xced61ae5();
        return f0Var;
    }
}

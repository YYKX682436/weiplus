package xm3;

/* loaded from: classes4.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f536851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.d f536852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f536853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, xm3.d dVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536851d = c16718x7059cefe;
        this.f536852e = dVar;
        this.f536853f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xm3.h0(this.f536851d, this.f536852e, this.f536853f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xm3.h0 h0Var = (xm3.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f536851d;
        java.util.ArrayList arrayList = c16718x7059cefe.f233599p;
        xm3.d dVar = this.f536852e;
        if (arrayList.contains(dVar)) {
            c16718x7059cefe.f233599p.remove(dVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            c16718x7059cefe.f233599p.add(dVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.m(c16718x7059cefe, xm3.i.f536855e, false, 2, null);
        } else {
            if (this.f536853f) {
                c16718x7059cefe.f233599p.add(dVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.m(c16718x7059cefe, xm3.i.f536854d, false, 2, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16718x7059cefe.c(), "submitUpdate not find item: " + dVar.v());
        }
        return jz5.f0.f384359a;
    }
}

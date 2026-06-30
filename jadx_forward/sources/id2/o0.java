package id2;

/* loaded from: classes.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, id2.v1 v1Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372231d = hVar;
        this.f372232e = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.o0(this.f372231d, interfaceC29045xdcb5ca57, this.f372232e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.o0 o0Var = (id2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.qp1 qp1Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f372231d).f535914b;
        id2.v1 v1Var = this.f372232e;
        java.lang.String str = v1Var.f372367d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] failed, pb = ");
        rm0.j jVar = aVar2.f535912a;
        sb6.append((jVar == null || (fVar = jVar.f478960h) == null) ? null : pm0.b0.g(fVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        rm0.j jVar2 = aVar2.f535912a;
        if (jVar2 != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = jVar2.f478960h;
            r45.mf2 mf2Var = fVar2 instanceof r45.mf2 ? (r45.mf2) fVar2 : null;
            if (mf2Var != null && (qp1Var = (r45.qp1) mf2Var.m75936x14adae67(3)) != null) {
                hz2.d dVar = hz2.d.f367846a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jVar2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jVar2);
                dVar.j(jVar2.f478957e, jVar2.f478958f, qp1Var);
                return jz5.f0.f384359a;
            }
        }
        pm0.v.X(new id2.s0(v1Var));
        return jz5.f0.f384359a;
    }
}

package qf2;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f443945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.q3 q3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443944d = hVar;
        this.f443945e = q3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.i3(this.f443944d, interfaceC29045xdcb5ca57, this.f443945e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.i3 i3Var = (qf2.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f443944d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePayMicControl", "applyPayMicRequest fail : " + aVar2);
        rm0.j jVar = aVar2.f535912a;
        qf2.q3 q3Var = this.f443945e;
        if (jVar != null && (str = jVar.f478959g) != null) {
            if (str.length() > 0) {
                db5.t7.m123883x26a183b(q3Var.O6(), str, 0).show();
            }
        }
        q3Var.b7();
        return jz5.f0.f384359a;
    }
}

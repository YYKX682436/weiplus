package mz0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f414415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(mz0.b2 b2Var, dz0.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414414e = b2Var;
        this.f414415f = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.b1 b1Var = new mz0.b1(this.f414414e, this.f414415f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        b1Var.f414413d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        b1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f414413d, "maas error", new java.lang.Object[0]);
        this.f414414e.f7().dismiss();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f = oy0.a.f431366a;
        if (c6710xe2d6917f != null) {
            c6710xe2d6917f.f140502d = 2;
        }
        if (c6710xe2d6917f != null) {
            c6710xe2d6917f.f140510l = c6710xe2d6917f.b("failReason", java.lang.String.valueOf(4), true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f2 = oy0.a.f431366a;
        if (c6710xe2d6917f2 != null) {
            c6710xe2d6917f2.k();
        }
        oy0.a.f431366a = null;
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) this.f414415f).r7(com.p314xaae8f345.mm.R.C30867xcad56011.m6j);
        return jz5.f0.f384359a;
    }
}

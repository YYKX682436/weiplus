package id2;

/* loaded from: classes.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, id2.u3 u3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372096d = hVar;
        this.f372097e = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.f2(this.f372096d, interfaceC29045xdcb5ca57, this.f372097e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.f2 f2Var = (id2.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f372096d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", "createNotice: getLivePrepare error: " + aVar2);
        rm0.j jVar = aVar2.f535912a;
        id2.u3 u3Var = this.f372097e;
        if (jVar == null || (string = jVar.f478959g) == null) {
            string = u3Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        db5.t7.g(u3Var.m80379x76847179(), string);
        return jz5.f0.f384359a;
    }
}

package zl2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f555575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555575d = hVar;
        this.f555576e = context;
        this.f555577f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.z0(this.f555575d, interfaceC29045xdcb5ca57, this.f555576e, this.f555577f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zl2.z0 z0Var = (zl2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f555575d).f535914b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkGiftLegalArgeement] cgi failed， errcode:");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478958f) : null);
        sb6.append("， errType:");
        rm0.j jVar2 = aVar2.f535912a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f478957e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        if (zl2.q4.f555466a.E()) {
            db5.t7.m123883x26a183b(this.f555576e, "cgi failed", 0).show();
        }
        this.f555577f.u();
        return jz5.f0.f384359a;
    }
}

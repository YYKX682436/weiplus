package df2;

/* loaded from: classes.dex */
public final class vx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f313174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cy f313175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f313176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.cy cyVar, az2.f fVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313174d = hVar;
        this.f313175e = cyVar;
        this.f313176f = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.vx(this.f313174d, interfaceC29045xdcb5ca57, this.f313175e, this.f313176f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.vx vxVar = (df2.vx) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vxVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f313174d).f535914b;
        df2.cy cyVar = this.f313175e;
        java.lang.String str = cyVar.f311448m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showAlertDialog cgi failed. ");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478958f) : null);
        sb6.append(", ");
        rm0.j jVar2 = aVar2.f535912a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f478957e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        this.f313176f.b();
        db5.t7.m123883x26a183b(cyVar.O6(), cyVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq), 0).show();
        return jz5.f0.f384359a;
    }
}

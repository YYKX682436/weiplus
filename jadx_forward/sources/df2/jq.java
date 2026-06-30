package df2;

/* loaded from: classes.dex */
public final class jq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ar f312027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.ar arVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312026d = hVar;
        this.f312027e = arVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.jq(this.f312026d, interfaceC29045xdcb5ca57, this.f312027e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.jq jqVar = (df2.jq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jqVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.wk1 wk1Var = (r45.wk1) ((xg2.i) this.f312026d).f535926b;
        df2.ar arVar = this.f312027e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(arVar.f311270m, "followAttend success");
        if (arVar.e7((r45.lv1) wk1Var.m75936x14adae67(2))) {
            df2.ar arVar2 = this.f312027e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(arVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.hq(arVar2, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}

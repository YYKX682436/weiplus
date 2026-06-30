package pk2;

/* loaded from: classes.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f437071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f437073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437071d = hVar;
        this.f437072e = str;
        this.f437073f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.a2(this.f437071d, interfaceC29045xdcb5ca57, this.f437072e, this.f437073f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pk2.a2 a2Var = (pk2.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", "createNotice: getLivePrepare error: " + ((xg2.a) ((xg2.b) this.f437071d).f535914b) + ", source=" + this.f437072e);
        db5.t7.m123882x26a183b(this.f437073f, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
        return jz5.f0.f384359a;
    }
}

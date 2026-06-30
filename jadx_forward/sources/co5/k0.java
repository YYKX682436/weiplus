package co5;

/* loaded from: classes11.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f125386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r f125387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f125388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f125389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r rVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f125386d = context;
        this.f125387e = rVar;
        this.f125388f = j17;
        this.f125389g = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new co5.k0(this.f125386d, this.f125387e, this.f125388f, this.f125389g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        co5.k0 k0Var = (co5.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f125386d);
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        u1Var.g(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn));
        u1Var.u(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gv_));
        u1Var.n(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kct));
        u1Var.j(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        u1Var.a(false);
        u1Var.l(new co5.h0(u1Var, this.f125387e, this.f125388f));
        u1Var.i(new co5.j0(u1Var, this.f125387e, this.f125388f, this.f125389g));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}

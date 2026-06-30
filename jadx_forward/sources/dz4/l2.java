package dz4;

/* loaded from: classes11.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f326874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f326875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d f326876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(dz4.u2 u2Var, android.app.Activity activity, com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326874d = u2Var;
        this.f326875e = activity;
        this.f326876f = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz4.l2(this.f326874d, this.f326875e, this.f326876f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dz4.l2 l2Var = (dz4.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar = this.f326876f;
        dz4.u2.a(this.f326874d, this.f326875e, dVar.f298286h[3] ? dVar.f298284f : "");
        return jz5.f0.f384359a;
    }
}

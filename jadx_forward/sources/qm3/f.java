package qm3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm3.a f446309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.i f446310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f446311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f446312g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qm3.a aVar, qm3.i iVar, kp4.a aVar2, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446309d = aVar;
        this.f446310e = iVar;
        this.f446311f = aVar2;
        this.f446312g = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qm3.f(this.f446309d, this.f446310e, this.f446311f, this.f446312g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qm3.f fVar = (qm3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm5.k kVar = this.f446309d.f446292a;
        if (kVar == null) {
            kVar = this.f446310e.f446317a.a(this.f446311f, null);
            this.f446309d.f446292a = kVar;
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(this.f446310e.f446319c)) {
            kVar.mo122875x5cd39ffa();
        }
        kp4.a aVar2 = this.f446311f;
        kVar.mo122876x76500f83(aVar2.f392604a, aVar2.f392605b);
        kVar.a(this.f446312g, new qm3.e(this.f446310e, this.f446309d, this.f446311f));
        return jz5.f0.f384359a;
    }
}

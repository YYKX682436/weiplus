package v14;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.k0 f514093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f514094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f514096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v14.p f514097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514098i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f514099m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kv.k0 k0Var, boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, v14.p pVar, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514093d = k0Var;
        this.f514094e = z17;
        this.f514095f = str;
        this.f514096g = bitmap;
        this.f514097h = pVar;
        this.f514098i = str2;
        this.f514099m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v14.m(this.f514093d, this.f514094e, this.f514095f, this.f514096g, this.f514097h, this.f514098i, this.f514099m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        v14.m mVar = (v14.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((com.p314xaae8f345.mm.p943x351df9c2.y0) this.f514093d).b(1, new v14.l(this.f514095f, this.f514096g, this.f514097h, this.f514098i, this.f514099m), this.f514094e);
        return jz5.f0.f384359a;
    }
}

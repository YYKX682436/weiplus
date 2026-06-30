package ci5;

/* loaded from: classes12.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123281h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123283m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, sf3.g gVar, ci5.q qVar, mf3.k kVar, sf3.g gVar2, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123278e = str;
        this.f123279f = gVar;
        this.f123280g = qVar;
        this.f123281h = kVar;
        this.f123282i = gVar2;
        this.f123283m = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ci5.m(this.f123278e, this.f123279f, this.f123280g, this.f123281h, this.f123282i, this.f123283m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ci5.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123277d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            ci5.l lVar = new ci5.l(this.f123278e, this.f123279f, this.f123280g, this.f123281h, this.f123282i, this.f123283m, null);
            this.f123277d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

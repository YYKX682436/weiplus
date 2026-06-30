package qf2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.l f443966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f443967g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443968h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f443969i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f443970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, qf2.l lVar, long j18, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443965e = j17;
        this.f443966f = lVar;
        this.f443967g = j18;
        this.f443968h = i17;
        this.f443969i = i18;
        this.f443970m = i19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.k(this.f443965e, this.f443966f, this.f443967g, this.f443968h, this.f443969i, this.f443970m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443964d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f443964d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f443965e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f443966f.c7(this.f443967g, this.f443968h, this.f443969i, this.f443970m);
        return jz5.f0.f384359a;
    }
}

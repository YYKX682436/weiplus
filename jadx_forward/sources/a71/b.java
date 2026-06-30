package a71;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f83430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83432g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83433h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83434i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83430e = jVar;
        this.f83431f = i17;
        this.f83432g = str;
        this.f83433h = str2;
        this.f83434i = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a71.b(this.f83430e, this.f83431f, this.f83432g, this.f83433h, this.f83434i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a71.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83429d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a71.a aVar2 = new a71.a(this.f83431f, this.f83432g, this.f83433h, this.f83434i);
            this.f83429d = 1;
            if (this.f83430e.a(aVar2, this) == aVar) {
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

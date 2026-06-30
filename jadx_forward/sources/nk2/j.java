package nk2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f419535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f419537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f419538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f419539i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f419540m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f419541n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f419542o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, java.lang.String str, long j18, long j19, int i17, int i18, int i19, org.json.JSONArray jSONArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419535e = j17;
        this.f419536f = str;
        this.f419537g = j18;
        this.f419538h = j19;
        this.f419539i = i17;
        this.f419540m = i18;
        this.f419541n = i19;
        this.f419542o = jSONArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nk2.j(this.f419535e, this.f419536f, this.f419537g, this.f419538h, this.f419539i, this.f419540m, this.f419541n, this.f419542o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419534d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            lu5.a aVar2 = lu5.a.f402990f;
            nk2.i iVar = new nk2.i(this.f419535e, this.f419536f, this.f419537g, this.f419538h, this.f419539i, this.f419540m, this.f419541n, this.f419542o, null);
            this.f419534d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(aVar2, iVar, this) == aVar) {
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

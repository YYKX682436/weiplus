package nk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f419513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f419514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f419515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f419516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f419517i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419518m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f419519n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419520o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f419521p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f419522q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f419523r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.a aVar, long j17, long j18, long j19, float f17, java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419513e = aVar;
        this.f419514f = j17;
        this.f419515g = j18;
        this.f419516h = j19;
        this.f419517i = f17;
        this.f419518m = str;
        this.f419519n = jSONArray;
        this.f419520o = str2;
        this.f419521p = i17;
        this.f419522q = i18;
        this.f419523r = i19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nk2.h(this.f419513e, this.f419514f, this.f419515g, this.f419516h, this.f419517i, this.f419518m, this.f419519n, this.f419520o, this.f419521p, this.f419522q, this.f419523r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419512d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            lu5.a aVar2 = lu5.a.f402990f;
            nk2.g gVar = new nk2.g(this.f419514f, this.f419515g, this.f419516h, this.f419517i, this.f419518m, this.f419519n, this.f419520o, this.f419521p, this.f419522q, this.f419523r, null);
            this.f419512d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(aVar2, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yz5.a aVar3 = this.f419513e;
        if (aVar3 != null) {
            aVar3.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}

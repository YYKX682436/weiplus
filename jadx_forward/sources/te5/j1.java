package te5;

/* loaded from: classes9.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f500222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f500223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oi3.g f500225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500226i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f500228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f500229o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(te5.l1 l1Var, android.content.Context context, java.lang.String str, oi3.g gVar, java.lang.String str2, java.lang.String str3, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500222e = l1Var;
        this.f500223f = context;
        this.f500224g = str;
        this.f500225h = gVar;
        this.f500226i = str2;
        this.f500227m = str3;
        this.f500228n = z17;
        this.f500229o = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te5.j1(this.f500222e, this.f500223f, this.f500224g, this.f500225h, this.f500226i, this.f500227m, this.f500228n, this.f500229o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500221d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            te5.l1 l1Var = this.f500222e;
            android.content.Context context = this.f500223f;
            java.lang.String str = this.f500224g;
            oi3.g gVar = this.f500225h;
            int m75939xb282bd08 = gVar.m75939xb282bd08(gVar.f427150d + 4);
            java.lang.String str2 = this.f500226i;
            java.lang.String str3 = this.f500227m;
            boolean z17 = this.f500228n;
            int i18 = this.f500229o;
            this.f500221d = 1;
            obj = l1Var.ij(context, str, m75939xb282bd08, str2, str3, z17, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}

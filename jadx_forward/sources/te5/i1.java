package te5;

/* loaded from: classes5.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f500210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f500211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f500212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f500213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f500214i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f500215m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f500216n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f500217o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f500218p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(te5.l1 l1Var, android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500210e = l1Var;
        this.f500211f = context;
        this.f500212g = list;
        this.f500213h = z3Var;
        this.f500214i = z17;
        this.f500215m = z18;
        this.f500216n = z19;
        this.f500217o = z27;
        this.f500218p = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te5.i1(this.f500210e, this.f500211f, this.f500212g, this.f500213h, this.f500214i, this.f500215m, this.f500216n, this.f500217o, this.f500218p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500209d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            te5.l1 l1Var = this.f500210e;
            android.content.Context context = this.f500211f;
            java.util.List list = this.f500212g;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f500213h;
            boolean z17 = this.f500214i;
            boolean z18 = this.f500215m;
            boolean z19 = this.f500216n;
            boolean z27 = this.f500217o;
            int i18 = this.f500218p;
            this.f500209d = 1;
            obj = l1Var.mj(context, list, z3Var, z17, z18, z19, z27, i18, this);
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

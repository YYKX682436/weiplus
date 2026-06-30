package qg5;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f444713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.r f444715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f444716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f444717i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f444718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f444719n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f444720o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qg5.l0 l0Var, java.util.List list, qg5.r rVar, boolean z17, boolean z18, boolean z19, boolean z27, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444713e = l0Var;
        this.f444714f = list;
        this.f444715g = rVar;
        this.f444716h = z17;
        this.f444717i = z18;
        this.f444718m = z19;
        this.f444719n = z27;
        this.f444720o = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.t(this.f444713e, this.f444714f, this.f444715g, this.f444716h, this.f444717i, this.f444718m, this.f444719n, this.f444720o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444712d;
        qg5.r rVar = this.f444715g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oy.j jVar = (oy.j) ((jz5.n) this.f444713e.f444589r).mo141623x754a37bb();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.util.List list = this.f444714f;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = rVar.f444684b;
            boolean z17 = this.f444716h;
            boolean z18 = this.f444717i;
            boolean z19 = this.f444718m;
            boolean z27 = this.f444719n;
            int i18 = this.f444720o;
            this.f444712d = 1;
            obj = ((te5.l1) jVar).mj(context, list, z3Var, z17, z18, z19, z27, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list2 = (java.util.List) obj;
        if (list2.size() != rVar.f444685c.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsStagingFeatureService", "PlainText list size mismatch, plainTextListSize=" + list2.size() + ", recordSize=" + rVar.f444685c.size());
        }
        for (jz5.l lVar : kz5.n0.a1(list2, rVar.f444685c)) {
            ((p3325xe03a0797.p3326xc267989b.a0) ((c01.ob) lVar.f384367e).f118908c).U((java.lang.String) lVar.f384366d);
        }
        return jz5.f0.f384359a;
    }
}

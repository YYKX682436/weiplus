package ep1;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f337174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp1.b f337176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pv.y f337177h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337178i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f337180n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qn5.a f337181o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ep1.k kVar, android.view.View view, fp1.b bVar, pv.y yVar, android.graphics.Point point, android.graphics.Point point2, int i17, qn5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f337174e = kVar;
        this.f337175f = view;
        this.f337176g = bVar;
        this.f337177h = yVar;
        this.f337178i = point;
        this.f337179m = point2;
        this.f337180n = i17;
        this.f337181o = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ep1.j(this.f337174e, this.f337175f, this.f337176g, this.f337177h, this.f337178i, this.f337179m, this.f337180n, this.f337181o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep1.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f337173d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ep1.k kVar = this.f337174e;
            android.view.View view = this.f337175f;
            fp1.b bVar = this.f337176g;
            this.f337173d = 1;
            ep1.k.a(kVar, view, bVar, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new ep1.i(this.f337177h, this.f337178i, this.f337179m, this.f337176g, this.f337174e, this.f337180n, this.f337175f, this.f337181o));
        return f0Var;
    }
}

package ez;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339235e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339236f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f339237g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f339238h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f339239i;

    /* renamed from: m, reason: collision with root package name */
    public int f339240m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f339241n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339242o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339243p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339244q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f339241n = dVar;
        this.f339242o = str;
        this.f339243p = str2;
        this.f339244q = str3;
        this.f339245r = str4;
        this.f339246s = str5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ez.c(this.f339241n, this.f339242o, this.f339243p, this.f339244q, this.f339245r, this.f339246s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f339240m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f339241n;
            java.lang.String str = this.f339242o;
            java.lang.String str2 = this.f339243p;
            java.lang.String str3 = this.f339244q;
            java.lang.String str4 = this.f339245r;
            java.lang.String str5 = this.f339246s;
            this.f339234d = dVar;
            this.f339235e = str;
            this.f339236f = str2;
            this.f339237g = str3;
            this.f339238h = str4;
            this.f339239i = str5;
            this.f339240m = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            gm0.j1.d().g(new bt3.i0(dVar, str, str2, str3, str4, str5, false, new ez.b(rVar)));
            obj = rVar.j();
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

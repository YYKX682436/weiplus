package af5;

/* loaded from: classes9.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f86133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f86134f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f86135g;

    /* renamed from: h, reason: collision with root package name */
    public int f86136h;

    /* renamed from: i, reason: collision with root package name */
    public int f86137i;

    /* renamed from: m, reason: collision with root package name */
    public int f86138m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86139n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86140o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gk0.k f86141p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gk0.h f86142q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 f86143r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f86144s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f86145t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f86146u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f86147v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, gk0.k kVar, gk0.h hVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, int i17, int i18, android.widget.ImageView imageView, android.widget.ImageView imageView2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86140o = str;
        this.f86141p = kVar;
        this.f86142q = hVar;
        this.f86143r = c22073xa4763271;
        this.f86144s = i17;
        this.f86145t = i18;
        this.f86146u = imageView;
        this.f86147v = imageView2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        af5.n nVar = new af5.n(this.f86140o, this.f86141p, this.f86142q, this.f86143r, this.f86144s, this.f86145t, this.f86146u, this.f86147v, interfaceC29045xdcb5ca57);
        nVar.f86139n = obj;
        return nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        int i17;
        int i18;
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f86138m;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f86139n;
            i95.m c17 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, this.f86140o, this.f86141p, null, null, 8, null);
            x66.l("Common_HttpParams", this.f86142q);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f86139n = y0Var;
            this.f86132d = x66;
            c22073xa4763271 = this.f86143r;
            this.f86133e = c22073xa4763271;
            android.widget.ImageView imageView3 = this.f86146u;
            this.f86134f = imageView3;
            android.widget.ImageView imageView4 = this.f86147v;
            this.f86135g = imageView4;
            int i27 = this.f86144s;
            this.f86136h = i27;
            int i28 = this.f86145t;
            this.f86137i = i28;
            this.f86138m = 1;
            java.lang.Object a17 = Ni.a(x66, this);
            if (a17 == aVar) {
                return aVar;
            }
            imageView = imageView3;
            obj = a17;
            imageView2 = imageView4;
            i17 = i27;
            i18 = i28;
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = this.f86137i;
            i17 = this.f86136h;
            imageView2 = (android.widget.ImageView) this.f86135g;
            imageView = (android.widget.ImageView) this.f86134f;
            c22073xa4763271 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271) this.f86133e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271.g(c22073xa4763271, bitmap, i17, i18, new af5.l(c22073xa4763271, imageView, imageView2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromNetwork] load from network, bitmap is null");
            c22073xa4763271.post(new af5.m(c22073xa4763271, imageView, imageView2));
        }
        return jz5.f0.f384359a;
    }
}

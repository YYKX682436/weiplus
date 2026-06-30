package af5;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86149d;

    /* renamed from: e, reason: collision with root package name */
    public int f86150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f86152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86153h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 f86154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86151f = str;
        this.f86152g = i17;
        this.f86153h = i18;
        this.f86154i = c22073xa4763271;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new af5.o(this.f86151f, this.f86152g, this.f86153h, this.f86154i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        int m80078x4af8d645;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86150e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gk0.h hVar = new gk0.h(this.f86151f);
            gk0.k kVar = new gk0.k(0, 0);
            java.lang.String Bi = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar);
            i95.m c17 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, Bi, kVar, null, null, 8, null);
            x66.l("Common_HttpParams", hVar);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f86149d = "[loadThumbFromNetwork] ";
            this.f86150e = 1;
            obj = Ni.a(x66, this);
            if (obj == aVar) {
                return aVar;
            }
            str = "[loadThumbFromNetwork] ";
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f86149d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", str + "bitmap is null");
            return null;
        }
        if (!bitmap.isRecycled()) {
            m80078x4af8d645 = this.f86154i.m80078x4af8d645();
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.R(bitmap, this.f86152g, this.f86153h, m80078x4af8d645);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", str + "bitmap is recycled");
        return null;
    }
}

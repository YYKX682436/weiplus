package af5;

/* loaded from: classes9.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 f86164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.g f86165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f86166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86167h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, z01.g gVar, android.widget.ImageView imageView, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86164e = c22073xa4763271;
        this.f86165f = gVar;
        this.f86166g = imageView;
        this.f86167h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new af5.r(this.f86164e, this.f86165f, this.f86166g, this.f86167h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86163d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271 = this.f86164e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f86163d = 1;
            obj = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271.i(c22073xa4763271, this.f86165f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271.f286146i;
        c22073xa4763271.getClass();
        android.widget.ImageView imageView = this.f86166g;
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is recycled");
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(imageView)) {
                imageView.post(new af5.u(c22073xa4763271, imageView));
            } else {
                imageView.addOnAttachStateChangeListener(new af5.t(imageView, c22073xa4763271, imageView));
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
        this.f86167h.mo146xb9724478(java.lang.Boolean.TRUE);
        return jz5.f0.f384359a;
    }
}

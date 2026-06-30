package af5;

/* loaded from: classes9.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 f86124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f86125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f86126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        super(1);
        this.f86124d = c22073xa4763271;
        this.f86125e = imageView;
        this.f86126f = imageView2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271 = this.f86124d;
        c22073xa4763271.post(new af5.k(c22073xa4763271, (android.graphics.Bitmap) obj, this.f86125e, this.f86126f));
        return jz5.f0.f384359a;
    }
}

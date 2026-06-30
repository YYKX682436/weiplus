package pr3;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f439515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr3.c f439516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 f439517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(float f17, pr3.c cVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 c21496xac9ac3d0) {
        super(3);
        this.f439515d = f17;
        this.f439516e = cVar;
        this.f439517f = c21496xac9ac3d0;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d imageView = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) obj2;
        java.lang.String str = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoItemConvert", "imageView: " + imageView + ", path: " + str);
        imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str, this.f439515d));
        imageView.setVisibility(0);
        imageView.setOnClickListener(new pr3.l(this.f439516e, this.f439517f, intValue));
        return jz5.f0.f384359a;
    }
}

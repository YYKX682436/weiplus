package x92;

/* loaded from: classes3.dex */
public final class k implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x92.l f534234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f534235c;

    public k(java.lang.String str, x92.l lVar, android.widget.ImageView imageView) {
        this.f534233a = str;
        this.f534234b = lVar;
        this.f534235c = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new x92.j(this.f534234b, this.f534235c));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicCoverUIC", "[handleActivityProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f534233a);
        }
    }
}

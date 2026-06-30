package ca3;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.Marker f39776a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f39777b;

    /* renamed from: c, reason: collision with root package name */
    public double f39778c;

    /* renamed from: d, reason: collision with root package name */
    public double f39779d;

    /* renamed from: e, reason: collision with root package name */
    public double f39780e;

    /* renamed from: f, reason: collision with root package name */
    public double f39781f;

    /* renamed from: g, reason: collision with root package name */
    public double f39782g;

    /* renamed from: h, reason: collision with root package name */
    public double f39783h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39784i;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f39777b = imageView;
        imageView.setImageResource(com.tencent.mm.R.drawable.db8);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
    }

    public final double a(double d17, double d18, double d19, double d27) {
        if (!(d17 == 0.0d)) {
            if (!(d18 == 0.0d)) {
                return (java.lang.Math.atan2(d19 - d17, d27 - d18) * 180) / 3.141592d;
            }
        }
        return 0.0d;
    }
}

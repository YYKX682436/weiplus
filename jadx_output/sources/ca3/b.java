package ca3;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f39785a;

    /* renamed from: b, reason: collision with root package name */
    public int f39786b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.Marker f39787c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f39788d;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f39785a = "MarkerPoint";
        this.f39786b = -1;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f39788d = imageView;
        imageView.setImageResource(com.tencent.mm.R.drawable.db9);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
    }
}

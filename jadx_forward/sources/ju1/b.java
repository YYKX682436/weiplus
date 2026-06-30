package ju1;

/* loaded from: classes10.dex */
public final class b implements ju1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f383227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f383229c;

    public b(android.graphics.Bitmap bitmap, java.lang.String str, android.content.Context context, android.widget.ImageView imageView) {
        this.f383227a = bitmap;
        this.f383228b = context;
        this.f383229c = imageView;
    }

    public void a(int i17) {
        android.graphics.Bitmap bitmap = this.f383227a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(np0.a.a(bitmap));
        android.content.Context context = this.f383228b;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        int i18 = i17 & 16777215;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{(-16777216) | i18, i18 | 436207616});
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, gradientDrawable, colorDrawable});
        android.widget.ImageView imageView = this.f383229c;
        if (imageView != null) {
            imageView.setImageDrawable(layerDrawable);
        }
    }
}

package a01;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f369a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f370b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f371c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f372d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f374f;

    public d(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f369a = container;
        this.f370b = "MMSurfaceViewSwitchHelper";
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        imageView.setTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        this.f371c = imageView;
    }

    public final void a() {
        jz5.f0 f0Var;
        if (this.f369a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
            pm0.v.X(new a01.b(this));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(b(), "dismissCoverBitmap ignore captureBitmap:" + this.f373e + '.');
        }
        this.f373e = null;
    }

    public final java.lang.String b() {
        return this.f370b + '.' + this.f374f;
    }

    public final void c(android.view.View view, android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap != null) {
            pm0.v.X(new a01.c(this, str, bitmap, view));
            return;
        }
        com.tencent.mars.xlog.Log.w(b(), "showCoverBitmapInternal " + str + " return for null.");
    }
}

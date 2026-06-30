package a01;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f81902a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f81903b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f81904c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f81905d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f81906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81907f;

    public d(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f81902a = container;
        this.f81903b = "MMSurfaceViewSwitchHelper";
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        imageView.setTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        this.f81904c = imageView;
    }

    public final void a() {
        jz5.f0 f0Var;
        if (this.f81902a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
            pm0.v.X(new a01.b(this));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "dismissCoverBitmap ignore captureBitmap:" + this.f81906e + '.');
        }
        this.f81906e = null;
    }

    public final java.lang.String b() {
        return this.f81903b + '.' + this.f81907f;
    }

    public final void c(android.view.View view, android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap != null) {
            pm0.v.X(new a01.c(this, str, bitmap, view));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "showCoverBitmapInternal " + str + " return for null.");
    }
}

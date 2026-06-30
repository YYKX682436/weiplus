package gm2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f355035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355036b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f355037c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f355038d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f355039e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f355040f;

    /* renamed from: g, reason: collision with root package name */
    public final int f355041g;

    public v1(int i17, int i18, android.graphics.Bitmap swipeBitmap, android.graphics.Bitmap topLightBitmap, android.graphics.Bitmap bottomLightBitmap, android.graphics.Bitmap bitmap, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeBitmap, "swipeBitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topLightBitmap, "topLightBitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomLightBitmap, "bottomLightBitmap");
        this.f355035a = i17;
        this.f355036b = i18;
        this.f355037c = swipeBitmap;
        this.f355038d = topLightBitmap;
        this.f355039e = bottomLightBitmap;
        this.f355040f = bitmap;
        this.f355041g = i19;
    }

    /* renamed from: equals */
    public boolean m131860xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.v1)) {
            return false;
        }
        gm2.v1 v1Var = (gm2.v1) obj;
        return this.f355035a == v1Var.f355035a && this.f355036b == v1Var.f355036b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355037c, v1Var.f355037c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355038d, v1Var.f355038d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355039e, v1Var.f355039e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355040f, v1Var.f355040f) && this.f355041g == v1Var.f355041g;
    }

    /* renamed from: hashCode */
    public int m131861x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f355035a) * 31) + java.lang.Integer.hashCode(this.f355036b)) * 31) + this.f355037c.hashCode()) * 31) + this.f355038d.hashCode()) * 31) + this.f355039e.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f355040f;
        return ((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Integer.hashCode(this.f355041g);
    }

    /* renamed from: toString */
    public java.lang.String m131862x9616526c() {
        return "FgParams(animtionTime=" + this.f355035a + ", animationInterval=" + this.f355036b + ", swipeBitmap=" + this.f355037c + ", topLightBitmap=" + this.f355038d + ", bottomLightBitmap=" + this.f355039e + ", lightBitmap=" + this.f355040f + ", lightAnimLevel=" + this.f355041g + ')';
    }
}

package cn2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f125071a;

    public i(android.graphics.Bitmap bitmap) {
        this.f125071a = bitmap;
    }

    /* renamed from: equals */
    public boolean m15343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn2.i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125071a, ((cn2.i) obj).f125071a);
    }

    /* renamed from: hashCode */
    public int m15344x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f125071a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m15345x9616526c() {
        return "LightStarConfig(bitmap=" + this.f125071a + ')';
    }
}

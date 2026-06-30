package hp0;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f364442a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f364443b;

    /* renamed from: c, reason: collision with root package name */
    public int f364444c;

    public e(int i17, int i18, java.lang.Object obj) {
        this.f364442a = i18;
        this.f364443b = obj;
    }

    public final boolean a() {
        java.lang.Object obj = this.f364443b;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof android.graphics.Bitmap)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
        return !((android.graphics.Bitmap) obj).isRecycled();
    }
}

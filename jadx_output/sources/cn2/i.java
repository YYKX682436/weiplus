package cn2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f43538a;

    public i(android.graphics.Bitmap bitmap) {
        this.f43538a = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn2.i) && kotlin.jvm.internal.o.b(this.f43538a, ((cn2.i) obj).f43538a);
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f43538a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public java.lang.String toString() {
        return "LightStarConfig(bitmap=" + this.f43538a + ')';
    }
}

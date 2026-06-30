package by0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f117865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.Buffer f117866b;

    public i(android.graphics.Bitmap bitmap, java.nio.Buffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f117865a = bitmap;
        this.f117866b = buffer;
    }

    /* renamed from: equals */
    public boolean m13567xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by0.i)) {
            return false;
        }
        by0.i iVar = (by0.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f117865a, iVar.f117865a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f117866b, iVar.f117866b);
    }

    /* renamed from: hashCode */
    public int m13568x8cdac1b() {
        return (this.f117865a.hashCode() * 31) + this.f117866b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m13569x9616526c() {
        return "BufferResult(bitmap=" + this.f117865a + ", buffer=" + this.f117866b + ')';
    }
}

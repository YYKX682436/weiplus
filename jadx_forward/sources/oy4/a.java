package oy4;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f431584a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.Buffer f431585b;

    public a(android.graphics.Bitmap bitmap, java.nio.Buffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f431584a = bitmap;
        this.f431585b = buffer;
    }

    /* renamed from: equals */
    public boolean m157436xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4.a)) {
            return false;
        }
        oy4.a aVar = (oy4.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431584a, aVar.f431584a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431585b, aVar.f431585b);
    }

    /* renamed from: hashCode */
    public int m157437x8cdac1b() {
        return (this.f431584a.hashCode() * 31) + this.f431585b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157438x9616526c() {
        return "BufferResult(bitmap=" + this.f431584a + ", buffer=" + this.f431585b + ')';
    }
}

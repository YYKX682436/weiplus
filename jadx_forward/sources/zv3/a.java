package zv3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f557960a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557961b;

    public a(android.graphics.Bitmap bitmap, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f557960a = bitmap;
        this.f557961b = j17;
    }

    /* renamed from: equals */
    public boolean m179780xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv3.a)) {
            return false;
        }
        zv3.a aVar = (zv3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557960a, aVar.f557960a) && this.f557961b == aVar.f557961b;
    }

    /* renamed from: hashCode */
    public int m179781x8cdac1b() {
        return (this.f557960a.hashCode() * 31) + java.lang.Long.hashCode(this.f557961b);
    }

    /* renamed from: toString */
    public java.lang.String m179782x9616526c() {
        return "FrameInfo(bitmap=" + this.f557960a + ", frameDuration=" + this.f557961b + ')';
    }
}

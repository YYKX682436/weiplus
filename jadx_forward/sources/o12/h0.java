package o12;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f423687a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f423688b;

    public h0(long j17, android.graphics.Bitmap bitmap, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bitmap = (i17 & 2) != 0 ? null : bitmap;
        this.f423687a = j17;
        this.f423688b = bitmap;
    }

    /* renamed from: equals */
    public boolean m150416xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12.h0)) {
            return false;
        }
        o12.h0 h0Var = (o12.h0) obj;
        return this.f423687a == h0Var.f423687a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423688b, h0Var.f423688b);
    }

    /* renamed from: hashCode */
    public int m150417x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f423687a) * 31;
        android.graphics.Bitmap bitmap = this.f423688b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m150418x9616526c() {
        return "Frame(time=" + this.f423687a + ", bitmap=" + this.f423688b + ')';
    }
}

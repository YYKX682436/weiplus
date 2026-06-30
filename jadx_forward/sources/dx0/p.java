package dx0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f326000a;

    /* renamed from: b, reason: collision with root package name */
    public final int f326001b;

    public p(android.graphics.Bitmap bitmap, int i17) {
        this.f326000a = bitmap;
        this.f326001b = i17;
    }

    /* renamed from: equals */
    public boolean m126405xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0.p)) {
            return false;
        }
        dx0.p pVar = (dx0.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326000a, pVar.f326000a) && this.f326001b == pVar.f326001b;
    }

    /* renamed from: hashCode */
    public int m126406x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f326000a;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + java.lang.Integer.hashCode(this.f326001b);
    }

    /* renamed from: toString */
    public java.lang.String m126407x9616526c() {
        return "ThumbnailBitmapInfo(thumbnail=" + this.f326000a + ", orinentation=" + this.f326001b + ')';
    }
}

package zx4;

/* loaded from: classes8.dex */
public final class n extends zx4.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f558700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f558701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f558702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Bitmap bitmap, int i17, int i18) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f558700a = bitmap;
        this.f558701b = i17;
        this.f558702c = i18;
    }

    /* renamed from: equals */
    public boolean m179874xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4.n)) {
            return false;
        }
        zx4.n nVar = (zx4.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558700a, nVar.f558700a) && this.f558701b == nVar.f558701b && this.f558702c == nVar.f558702c;
    }

    /* renamed from: hashCode */
    public int m179875x8cdac1b() {
        return (((this.f558700a.hashCode() * 31) + java.lang.Integer.hashCode(this.f558701b)) * 31) + java.lang.Integer.hashCode(this.f558702c);
    }

    /* renamed from: toString */
    public java.lang.String m179876x9616526c() {
        return "Success(bitmap=" + this.f558700a + ", width=" + this.f558701b + ", height=" + this.f558702c + ')';
    }
}

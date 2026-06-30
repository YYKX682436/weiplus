package hu3;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f366746a;

    /* renamed from: b, reason: collision with root package name */
    public int f366747b;

    /* renamed from: c, reason: collision with root package name */
    public int f366748c;

    /* renamed from: d, reason: collision with root package name */
    public int f366749d;

    public w0(int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f366746a = i17;
        this.f366747b = i18;
        this.f366748c = i19;
        this.f366749d = i27;
    }

    /* renamed from: equals */
    public boolean m134163xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.w0)) {
            return false;
        }
        hu3.w0 w0Var = (hu3.w0) obj;
        return this.f366746a == w0Var.f366746a && this.f366747b == w0Var.f366747b && this.f366748c == w0Var.f366748c && this.f366749d == w0Var.f366749d;
    }

    /* renamed from: hashCode */
    public int m134164x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f366746a) * 31) + java.lang.Integer.hashCode(this.f366747b)) * 31) + java.lang.Integer.hashCode(this.f366748c)) * 31) + java.lang.Integer.hashCode(this.f366749d);
    }

    /* renamed from: toString */
    public java.lang.String m134165x9616526c() {
        return "VideoFrameInfo(width=" + this.f366746a + ", height=" + this.f366747b + ", rowStride=" + this.f366748c + ", pixelStride=" + this.f366749d + ')';
    }
}

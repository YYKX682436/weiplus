package c01;

/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f118944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118947d;

    public r2(int i17, int i18, int i19, int i27) {
        this.f118944a = i17;
        this.f118945b = i18;
        this.f118946c = i19;
        this.f118947d = i27;
    }

    /* renamed from: equals */
    public boolean m13912xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c01.r2)) {
            return false;
        }
        c01.r2 r2Var = (c01.r2) obj;
        return this.f118944a == r2Var.f118944a && this.f118945b == r2Var.f118945b && this.f118946c == r2Var.f118946c && this.f118947d == r2Var.f118947d;
    }

    /* renamed from: hashCode */
    public int m13913x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f118944a) * 31) + java.lang.Integer.hashCode(this.f118945b)) * 31) + java.lang.Integer.hashCode(this.f118946c)) * 31) + java.lang.Integer.hashCode(this.f118947d);
    }

    /* renamed from: toString */
    public java.lang.String m13914x9616526c() {
        return "EditorExtraUIParams(marginLeft=" + this.f118944a + ", marginTop=" + this.f118945b + ", marginRight=" + this.f118946c + ", marginBottom=" + this.f118947d + ')';
    }
}

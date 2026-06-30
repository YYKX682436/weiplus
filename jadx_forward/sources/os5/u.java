package os5;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f429825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429827c;

    public u(int i17, int i18, int i19) {
        this.f429825a = i17;
        this.f429826b = i18;
        this.f429827c = i19;
    }

    /* renamed from: equals */
    public boolean m156997xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os5.u)) {
            return false;
        }
        os5.u uVar = (os5.u) obj;
        return this.f429825a == uVar.f429825a && this.f429826b == uVar.f429826b && this.f429827c == uVar.f429827c;
    }

    /* renamed from: hashCode */
    public int m156998x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f429825a) * 31) + java.lang.Integer.hashCode(this.f429826b)) * 31) + java.lang.Integer.hashCode(this.f429827c);
    }

    /* renamed from: toString */
    public java.lang.String m156999x9616526c() {
        return "ShowBoxConfig(textSize=" + this.f429825a + ", tagHeight=" + this.f429826b + ", paddingHorizontal=" + this.f429827c + ')';
    }
}

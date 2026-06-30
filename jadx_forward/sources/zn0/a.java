package zn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f555824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f555825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f555826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f555827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f555828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f555829f;

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f555824a = i17;
        this.f555825b = i18;
        this.f555826c = i19;
        this.f555827d = i27;
        this.f555828e = i28;
        this.f555829f = i29;
    }

    /* renamed from: equals */
    public boolean m179174xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.a)) {
            return false;
        }
        zn0.a aVar = (zn0.a) obj;
        return this.f555824a == aVar.f555824a && this.f555825b == aVar.f555825b && this.f555826c == aVar.f555826c && this.f555827d == aVar.f555827d && this.f555828e == aVar.f555828e && this.f555829f == aVar.f555829f;
    }

    /* renamed from: hashCode */
    public int m179175x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f555824a) * 31) + java.lang.Integer.hashCode(this.f555825b)) * 31) + java.lang.Integer.hashCode(this.f555826c)) * 31) + java.lang.Integer.hashCode(this.f555827d)) * 31) + java.lang.Integer.hashCode(this.f555828e)) * 31) + java.lang.Integer.hashCode(this.f555829f);
    }

    /* renamed from: toString */
    public java.lang.String m179176x9616526c() {
        return "NormalFocusModel(micWidth=" + this.f555824a + ", micHeight=" + this.f555825b + ", offestMargin=" + this.f555826c + ", micRightMargin=" + this.f555827d + ", micTopMargin=" + this.f555828e + ", micMargin=" + this.f555829f + ')';
    }
}

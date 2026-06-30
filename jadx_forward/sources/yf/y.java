package yf;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f543004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f543005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f543006c;

    public y(int i17, int i18, int i19) {
        this.f543004a = i17;
        this.f543005b = i18;
        this.f543006c = i19;
    }

    /* renamed from: equals */
    public boolean m176963xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.y)) {
            return false;
        }
        yf.y yVar = (yf.y) obj;
        return this.f543004a == yVar.f543004a && this.f543005b == yVar.f543005b && this.f543006c == yVar.f543006c;
    }

    /* renamed from: hashCode */
    public int m176964x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f543004a) * 31) + java.lang.Integer.hashCode(this.f543005b)) * 31) + java.lang.Integer.hashCode(this.f543006c);
    }

    /* renamed from: toString */
    public java.lang.String m176965x9616526c() {
        return "Color(colorR=" + this.f543004a + ", colorG=" + this.f543005b + ", colorB=" + this.f543006c + ')';
    }
}

package lf3;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f399855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399856b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f399857c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f399858d;

    public k(int i17, int i18, boolean z17, boolean z18) {
        this.f399855a = i17;
        this.f399856b = i18;
        this.f399857c = z17;
        this.f399858d = z18;
    }

    /* renamed from: equals */
    public boolean m145708xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3.k)) {
            return false;
        }
        lf3.k kVar = (lf3.k) obj;
        return this.f399855a == kVar.f399855a && this.f399856b == kVar.f399856b && this.f399857c == kVar.f399857c && this.f399858d == kVar.f399858d;
    }

    /* renamed from: hashCode */
    public int m145709x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f399855a) * 31) + java.lang.Integer.hashCode(this.f399856b)) * 31) + java.lang.Boolean.hashCode(this.f399857c)) * 31) + java.lang.Boolean.hashCode(this.f399858d);
    }

    /* renamed from: toString */
    public java.lang.String m145710x9616526c() {
        return "ImageParserInfo(width=" + this.f399855a + ", height=" + this.f399856b + ", isHorizontalLong=" + this.f399857c + ", isVerticalLong=" + this.f399858d + ')';
    }
}

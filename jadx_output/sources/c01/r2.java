package c01;

/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f37411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37412b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37414d;

    public r2(int i17, int i18, int i19, int i27) {
        this.f37411a = i17;
        this.f37412b = i18;
        this.f37413c = i19;
        this.f37414d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c01.r2)) {
            return false;
        }
        c01.r2 r2Var = (c01.r2) obj;
        return this.f37411a == r2Var.f37411a && this.f37412b == r2Var.f37412b && this.f37413c == r2Var.f37413c && this.f37414d == r2Var.f37414d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f37411a) * 31) + java.lang.Integer.hashCode(this.f37412b)) * 31) + java.lang.Integer.hashCode(this.f37413c)) * 31) + java.lang.Integer.hashCode(this.f37414d);
    }

    public java.lang.String toString() {
        return "EditorExtraUIParams(marginLeft=" + this.f37411a + ", marginTop=" + this.f37412b + ", marginRight=" + this.f37413c + ", marginBottom=" + this.f37414d + ')';
    }
}

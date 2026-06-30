package xk5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f536598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536599b;

    public a(int i17, int i18) {
        this.f536598a = i17;
        this.f536599b = i18;
    }

    /* renamed from: equals */
    public boolean m175647xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk5.a)) {
            return false;
        }
        xk5.a aVar = (xk5.a) obj;
        return this.f536598a == aVar.f536598a && this.f536599b == aVar.f536599b;
    }

    /* renamed from: hashCode */
    public int m175648x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f536598a) * 31) + java.lang.Integer.hashCode(this.f536599b);
    }

    /* renamed from: toString */
    public java.lang.String m175649x9616526c() {
        return "ViewRootImplWindowInfo(privateFlags=" + this.f536598a + ", insetsFlagAppearance=" + this.f536599b + ')';
    }
}

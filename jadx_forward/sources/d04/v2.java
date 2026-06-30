package d04;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f307061a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f307062b;

    public v2(int i17, java.lang.String scanTabTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanTabTitle, "scanTabTitle");
        this.f307061a = i17;
        this.f307062b = scanTabTitle;
    }

    /* renamed from: equals */
    public boolean m123306xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04.v2)) {
            return false;
        }
        d04.v2 v2Var = (d04.v2) obj;
        return this.f307061a == v2Var.f307061a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307062b, v2Var.f307062b);
    }

    /* renamed from: hashCode */
    public int m123307x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f307061a) * 31) + this.f307062b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123308x9616526c() {
        return "ScanTabInfo(scanTabId=" + this.f307061a + ", scanTabTitle=" + this.f307062b + ')';
    }
}

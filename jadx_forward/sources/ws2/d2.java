package ws2;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f530558a;

    public d2(boolean z17, boolean z18, boolean z19) {
        this.f530558a = z19;
    }

    /* renamed from: equals */
    public boolean m174394xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws2.d2)) {
            return false;
        }
        ws2.d2 d2Var = (ws2.d2) obj;
        d2Var.getClass();
        return this.f530558a == d2Var.f530558a;
    }

    /* renamed from: hashCode */
    public int m174395x8cdac1b() {
        return (((java.lang.Boolean.hashCode(false) * 31) + java.lang.Boolean.hashCode(false)) * 31) + java.lang.Boolean.hashCode(this.f530558a);
    }

    /* renamed from: toString */
    public java.lang.String m174396x9616526c() {
        return "HasToast(first=false, second=false, third=" + this.f530558a + ')';
    }
}

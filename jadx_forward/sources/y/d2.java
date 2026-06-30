package y;

/* loaded from: classes16.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f539861a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f539862b;

    public d2(java.lang.String title, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f539861a = title;
        this.f539862b = z17;
    }

    /* renamed from: equals */
    public boolean m176202xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.d2)) {
            return false;
        }
        y.d2 d2Var = (y.d2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539861a, d2Var.f539861a) && this.f539862b == d2Var.f539862b;
    }

    /* renamed from: hashCode */
    public int m176203x8cdac1b() {
        return (this.f539861a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f539862b);
    }

    /* renamed from: toString */
    public java.lang.String m176204x9616526c() {
        return "MicConditionInfo(title=" + this.f539861a + ", checked=" + this.f539862b + ')';
    }
}

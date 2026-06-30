package xs;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f537779a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f537780b;

    public e1(java.lang.String midReadOnlyPath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(midReadOnlyPath, "midReadOnlyPath");
        this.f537779a = midReadOnlyPath;
        this.f537780b = z17;
    }

    /* renamed from: equals */
    public boolean m175824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.e1)) {
            return false;
        }
        xs.e1 e1Var = (xs.e1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537779a, e1Var.f537779a) && this.f537780b == e1Var.f537780b;
    }

    /* renamed from: hashCode */
    public int m175825x8cdac1b() {
        return (this.f537779a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f537780b);
    }

    /* renamed from: toString */
    public java.lang.String m175826x9616526c() {
        return "MediaGroupImgAttachResult(midReadOnlyPath=" + this.f537779a + ", isMidShown=" + this.f537780b + ')';
    }
}

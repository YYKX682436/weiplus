package s2;

/* loaded from: classes14.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f483756a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f483757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f483758c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.h0 f483759d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f483760e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f483761f;

    public g0(boolean z17, boolean z18, boolean z19, s2.h0 securePolicy, boolean z27, boolean z28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        securePolicy = (i17 & 8) != 0 ? s2.h0.Inherit : securePolicy;
        z27 = (i17 & 16) != 0 ? true : z27;
        z28 = (i17 & 32) != 0 ? true : z28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(securePolicy, "securePolicy");
        this.f483756a = z17;
        this.f483757b = z18;
        this.f483758c = z19;
        this.f483759d = securePolicy;
        this.f483760e = z27;
        this.f483761f = z28;
    }

    /* renamed from: equals */
    public boolean m163652xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2.g0)) {
            return false;
        }
        s2.g0 g0Var = (s2.g0) obj;
        return this.f483756a == g0Var.f483756a && this.f483757b == g0Var.f483757b && this.f483758c == g0Var.f483758c && this.f483759d == g0Var.f483759d && this.f483760e == g0Var.f483760e && this.f483761f == g0Var.f483761f;
    }

    /* renamed from: hashCode */
    public int m163653x8cdac1b() {
        boolean z17 = this.f483757b;
        return (((((((((((((java.lang.Boolean.hashCode(z17) * 31) + java.lang.Boolean.hashCode(this.f483756a)) * 31) + java.lang.Boolean.hashCode(z17)) * 31) + java.lang.Boolean.hashCode(this.f483758c)) * 31) + this.f483759d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f483760e)) * 31) + java.lang.Boolean.hashCode(this.f483761f)) * 31) + java.lang.Boolean.hashCode(false);
    }
}

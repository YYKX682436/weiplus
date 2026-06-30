package t21;

/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f496594a;

    /* renamed from: b, reason: collision with root package name */
    public int f496595b;

    public x1(boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 2 : i17;
        this.f496594a = z17;
        this.f496595b = i17;
    }

    /* renamed from: equals */
    public boolean m165722xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t21.x1)) {
            return false;
        }
        t21.x1 x1Var = (t21.x1) obj;
        return this.f496594a == x1Var.f496594a && this.f496595b == x1Var.f496595b;
    }

    /* renamed from: hashCode */
    public int m165723x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f496594a) * 31) + java.lang.Integer.hashCode(this.f496595b);
    }

    /* renamed from: toString */
    public java.lang.String m165724x9616526c() {
        return "ParallelParam(enableParallel=" + this.f496594a + ", maxParallelSize=" + this.f496595b + ')';
    }
}

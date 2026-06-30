package dk2;

/* loaded from: classes3.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.c04 f315957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f315958b;

    public z7(r45.c04 wishConfig, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishConfig, "wishConfig");
        this.f315957a = wishConfig;
        this.f315958b = z17;
    }

    /* renamed from: equals */
    public boolean m124695xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.z7)) {
            return false;
        }
        dk2.z7 z7Var = (dk2.z7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315957a, z7Var.f315957a) && this.f315958b == z7Var.f315958b;
    }

    /* renamed from: hashCode */
    public int m124696x8cdac1b() {
        return (this.f315957a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f315958b);
    }

    /* renamed from: toString */
    public java.lang.String m124697x9616526c() {
        return "FinderLiveInteractionWishInfo(wishConfig=" + this.f315957a + ", enableFlag=" + this.f315958b + ')';
    }
}

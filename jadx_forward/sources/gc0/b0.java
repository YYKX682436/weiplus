package gc0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f351632a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f351633b;

    public b0(java.lang.String talker, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f351632a = talker;
        this.f351633b = str;
    }

    /* renamed from: equals */
    public boolean m131199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0.b0)) {
            return false;
        }
        gc0.b0 b0Var = (gc0.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351632a, b0Var.f351632a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351633b, b0Var.f351633b);
    }

    /* renamed from: hashCode */
    public int m131200x8cdac1b() {
        int hashCode = this.f351632a.hashCode() * 31;
        java.lang.String str = this.f351633b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m131201x9616526c() {
        return "RecommendProfile(talker=" + this.f351632a + ", nickname=" + this.f351633b + ')';
    }
}

package fm3;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.es4 f345557a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345558b;

    public a0(r45.es4 response, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f345557a = response;
        this.f345558b = j17;
    }

    /* renamed from: equals */
    public boolean m129752xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.a0)) {
            return false;
        }
        fm3.a0 a0Var = (fm3.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345557a, a0Var.f345557a) && this.f345558b == a0Var.f345558b;
    }

    /* renamed from: hashCode */
    public int m129753x8cdac1b() {
        return (this.f345557a.hashCode() * 31) + java.lang.Long.hashCode(this.f345558b);
    }

    /* renamed from: toString */
    public java.lang.String m129754x9616526c() {
        return "MusicMvRecommendListCache(response=" + this.f345557a + ", timestamp=" + this.f345558b + ')';
    }
}

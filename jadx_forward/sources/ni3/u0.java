package ni3;

/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final cw2.wa f419276a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419277b;

    public u0(cw2.wa mediaSource, java.lang.String action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f419276a = mediaSource;
        this.f419277b = action;
    }

    /* renamed from: equals */
    public boolean m149683xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.u0)) {
            return false;
        }
        ni3.u0 u0Var = (ni3.u0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419276a, u0Var.f419276a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419277b, u0Var.f419277b);
    }

    /* renamed from: hashCode */
    public int m149684x8cdac1b() {
        return (this.f419276a.hashCode() * 31) + this.f419277b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149685x9616526c() {
        return "PlayFeed(mediaSource=" + this.f419276a + ", action=" + this.f419277b + ')';
    }
}

package so2;

/* loaded from: classes2.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public so2.r4 f492169a;

    /* renamed from: b, reason: collision with root package name */
    public long f492170b;

    /* renamed from: c, reason: collision with root package name */
    public so2.v4 f492171c;

    /* renamed from: d, reason: collision with root package name */
    public int f492172d;

    /* renamed from: e, reason: collision with root package name */
    public long f492173e;

    /* renamed from: f, reason: collision with root package name */
    public sr2.u f492174f;

    public u4(so2.r4 showState, long j17, so2.v4 postState, int i17, long j18, sr2.u source, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        showState = (i18 & 1) != 0 ? so2.r4.f492108e : showState;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        postState = (i18 & 4) != 0 ? so2.v4.f492204d : postState;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        j18 = (i18 & 16) != 0 ? 0L : j18;
        source = (i18 & 32) != 0 ? sr2.u.f493260e : source;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showState, "showState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postState, "postState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f492169a = showState;
        this.f492170b = j17;
        this.f492171c = postState;
        this.f492172d = i17;
        this.f492173e = j18;
        this.f492174f = source;
    }

    /* renamed from: equals */
    public boolean m164953xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.u4)) {
            return false;
        }
        so2.u4 u4Var = (so2.u4) obj;
        return this.f492169a == u4Var.f492169a && this.f492170b == u4Var.f492170b && this.f492171c == u4Var.f492171c && this.f492172d == u4Var.f492172d && this.f492173e == u4Var.f492173e && this.f492174f == u4Var.f492174f;
    }

    /* renamed from: hashCode */
    public int m164954x8cdac1b() {
        return (((((((((this.f492169a.hashCode() * 31) + java.lang.Long.hashCode(this.f492170b)) * 31) + this.f492171c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492172d)) * 31) + java.lang.Long.hashCode(this.f492173e)) * 31) + this.f492174f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164955x9616526c() {
        return "showState:" + this.f492169a + " localId:" + this.f492170b + " postState:" + this.f492171c + " progress:" + this.f492172d;
    }
}

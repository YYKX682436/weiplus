package qb2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442805a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442806b;

    /* renamed from: c, reason: collision with root package name */
    public final long f442807c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442808d;

    /* renamed from: e, reason: collision with root package name */
    public final long f442809e;

    public r(java.lang.String source, java.lang.String sql, long j17, java.lang.String currentThread, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentThread, "currentThread");
        this.f442805a = source;
        this.f442806b = sql;
        this.f442807c = j17;
        this.f442808d = currentThread;
        this.f442809e = j18;
    }

    public final void a() {
        if (this.f442807c >= 16 || r26.n0.B(this.f442805a, "reportSize", true) || r26.n0.B(this.f442805a, "enterFinderConversationPage", true)) {
            ((ku5.t0) ku5.t0.f394148d).a(new qb2.q(this));
        }
    }

    /* renamed from: equals */
    public boolean m159719xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb2.r)) {
            return false;
        }
        qb2.r rVar = (qb2.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442805a, rVar.f442805a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442806b, rVar.f442806b) && this.f442807c == rVar.f442807c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442808d, rVar.f442808d) && this.f442809e == rVar.f442809e;
    }

    /* renamed from: hashCode */
    public int m159720x8cdac1b() {
        return (((((((this.f442805a.hashCode() * 31) + this.f442806b.hashCode()) * 31) + java.lang.Long.hashCode(this.f442807c)) * 31) + this.f442808d.hashCode()) * 31) + java.lang.Long.hashCode(this.f442809e);
    }

    /* renamed from: toString */
    public java.lang.String m159721x9616526c() {
        return "source:" + this.f442805a + ", sql:" + this.f442806b + ", duration:" + this.f442807c + ", currentThread:" + this.f442808d + ", tableSize:" + this.f442809e;
    }
}

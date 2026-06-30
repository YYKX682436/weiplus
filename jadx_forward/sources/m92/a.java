package m92;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406500a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f406501b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f406502c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f406503d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hz0 f406504e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hz0 f406505f;

    /* renamed from: g, reason: collision with root package name */
    public int f406506g;

    /* renamed from: h, reason: collision with root package name */
    public int f406507h;

    /* renamed from: i, reason: collision with root package name */
    public int f406508i;

    /* renamed from: j, reason: collision with root package name */
    public int f406509j;

    /* renamed from: k, reason: collision with root package name */
    public r45.fa0 f406510k;

    public a(java.lang.String clientId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        this.f406500a = clientId;
        this.f406501b = "";
        this.f406502c = "";
        this.f406503d = "";
    }

    /* renamed from: equals */
    public boolean m147062xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m92.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406500a, ((m92.a) obj).f406500a);
    }

    /* renamed from: hashCode */
    public int m147063x8cdac1b() {
        return this.f406500a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147064x9616526c() {
        return "CreateFinderAccountArgs(clientId=" + this.f406500a + ')';
    }
}

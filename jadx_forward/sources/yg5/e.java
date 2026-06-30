package yg5;

/* loaded from: classes10.dex */
public final class e extends yg5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f543881d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f543882e;

    /* renamed from: f, reason: collision with root package name */
    public final int f543883f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f543884g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f543885h;

    public e(java.lang.String _uniqueId, java.lang.String groupUniqueId, int i17, java.lang.CharSequence name, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_uniqueId, "_uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupUniqueId, "groupUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f543881d = _uniqueId;
        this.f543882e = groupUniqueId;
        this.f543883f = i17;
        this.f543884g = name;
        this.f543885h = z17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof yg5.e)) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543881d, other.n())) {
            return this.f543883f == other.mo177164x3662b71a() && this.f543885h == ((yg5.e) other).f543885h;
        }
        return false;
    }

    @Override // yg5.f, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // yg5.f
    /* renamed from: getPriority */
    public int mo177164x3662b71a() {
        return this.f543883f;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 1;
    }

    @Override // yg5.f
    public java.lang.String n() {
        return this.f543881d;
    }
}

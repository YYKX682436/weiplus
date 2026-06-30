package yg5;

/* loaded from: classes10.dex */
public final class d extends yg5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f543876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f543877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f543878f;

    /* renamed from: g, reason: collision with root package name */
    public final yg5.a f543879g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f543880h;

    public d(java.lang.String _uniqueId, int i17, java.lang.CharSequence charSequence, yg5.a selectMode, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_uniqueId, "_uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectMode, "selectMode");
        this.f543876d = _uniqueId;
        this.f543877e = i17;
        this.f543878f = charSequence;
        this.f543879g = selectMode;
        this.f543880h = lVar;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof yg5.d)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543876d, other.n());
    }

    @Override // yg5.f, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // yg5.f
    /* renamed from: getPriority */
    public int mo177164x3662b71a() {
        return this.f543877e;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // yg5.f
    public java.lang.String n() {
        return this.f543876d;
    }
}

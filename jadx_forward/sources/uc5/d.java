package uc5;

/* loaded from: classes10.dex */
public abstract class d extends xm3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f508008g;

    /* renamed from: d, reason: collision with root package name */
    public uc5.c f508009d;

    /* renamed from: e, reason: collision with root package name */
    public uc5.r0 f508010e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f508011f;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[._a-zA-Z0-9]+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        f508008g = compile;
    }

    public d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f508009d = uc5.a.f508002a;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        uc5.d other = (uc5.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return compareTo(other) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508009d, other.f508009d);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return getClass().getName().hashCode();
    }

    @Override // xm3.a, xm3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public uc5.d y0() {
        java.lang.Object newInstance = getClass().getConstructor(com.p314xaae8f345.mm.p2621x8fb0427b.f9.class).newInstance(p());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type Item of com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryBaseItem");
        uc5.d dVar = (uc5.d) newInstance;
        uc5.c cVar = this.f508009d;
        uc5.c cVar2 = uc5.a.f508002a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, cVar2)) {
            if (!(cVar instanceof uc5.b)) {
                throw new jz5.j();
            }
            cVar2 = new uc5.b(((uc5.b) cVar).f508004a);
        }
        dVar.f508009d = cVar2;
        dVar.f508010e = this.f508010e;
        return dVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc5.d other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(other.p().T1(), p().T1());
        return j17 != 0 ? j17 : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(other.p().m124847x74d37ac6(), p().m124847x74d37ac6());
    }

    public abstract com.p314xaae8f345.mm.p2621x8fb0427b.f9 p();

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f508011f;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = p().Q0() + '#' + p().m124847x74d37ac6();
        this.f508011f = str2;
        return str2;
    }
}

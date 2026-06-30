package i06;

/* loaded from: classes15.dex */
public final class w3 implements p3321xbce91901.jvm.p3324x21ffc6bd.p {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f368312h = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.w3.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.w3.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final f26.o0 f368313d;

    /* renamed from: e, reason: collision with root package name */
    public final i06.c4 f368314e;

    /* renamed from: f, reason: collision with root package name */
    public final i06.c4 f368315f;

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f368316g;

    public w3(f26.o0 type, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f368313d = type;
        i06.c4 c4Var = null;
        i06.c4 c4Var2 = aVar instanceof i06.c4 ? (i06.c4) aVar : null;
        if (c4Var2 != null) {
            c4Var = c4Var2;
        } else if (aVar != null) {
            c4Var = i06.f4.a(aVar);
        }
        this.f368314e = c4Var;
        this.f368315f = i06.f4.a(new i06.v3(this));
        this.f368316g = i06.f4.a(new i06.u3(this, aVar));
    }

    /* renamed from: equals */
    public boolean m134412xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof i06.w3) {
            i06.w3 w3Var = (i06.w3) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368313d, w3Var.f368313d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i(), w3Var.i()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h(), w3Var.h())) {
                return true;
            }
        }
        return false;
    }

    public final f06.e f(f26.o0 o0Var) {
        f26.o0 mo128949xfb85f7b0;
        o06.j i17 = o0Var.w0().i();
        if (!(i17 instanceof o06.g)) {
            if (i17 instanceof o06.e2) {
                return new i06.y3(null, (o06.e2) i17);
            }
            if (i17 instanceof o06.d2) {
                throw new jz5.k("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        java.lang.Class k17 = i06.o4.k((o06.g) i17);
        if (k17 == null) {
            return null;
        }
        if (!k17.isArray()) {
            if (f26.z2.f(o0Var)) {
                return new i06.k1(k17);
            }
            java.lang.Class cls = (java.lang.Class) u06.i.f505039b.get(k17);
            if (cls != null) {
                k17 = cls;
            }
            return new i06.k1(k17);
        }
        f26.l2 l2Var = (f26.l2) kz5.n0.B0(o0Var.u0());
        if (l2Var == null || (mo128949xfb85f7b0 = l2Var.mo128949xfb85f7b0()) == null) {
            return new i06.k1(k17);
        }
        f06.e f17 = f(mo128949xfb85f7b0);
        if (f17 != null) {
            return new i06.k1(java.lang.reflect.Array.newInstance((java.lang.Class<?>) xz5.a.b(h06.b.a(f17)), 0).getClass());
        }
        throw new i06.a4("Cannot determine classifier for array element type: " + this);
    }

    public java.util.List h() {
        f06.v vVar = f368312h[1];
        java.lang.Object mo152xb9724478 = this.f368316g.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (java.util.List) mo152xb9724478;
    }

    /* renamed from: hashCode */
    public int m134413x8cdac1b() {
        int m128970x8cdac1b = this.f368313d.m128970x8cdac1b() * 31;
        f06.e i17 = i();
        return ((m128970x8cdac1b + (i17 != null ? i17.hashCode() : 0)) * 31) + h().hashCode();
    }

    public f06.e i() {
        f06.v vVar = f368312h[0];
        return (f06.e) this.f368315f.mo152xb9724478();
    }

    public java.lang.reflect.Type j() {
        i06.c4 c4Var = this.f368314e;
        if (c4Var != null) {
            return (java.lang.reflect.Type) c4Var.mo152xb9724478();
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m134414x9616526c() {
        return i06.j4.f368203a.d(this.f368313d);
    }

    public /* synthetic */ w3(f26.o0 o0Var, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(o0Var, (i17 & 2) != 0 ? null : aVar);
    }
}

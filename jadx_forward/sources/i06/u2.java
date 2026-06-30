package i06;

/* loaded from: classes16.dex */
public final class u2 implements f06.o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f368290h = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.u2.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.u2.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final i06.k0 f368291d;

    /* renamed from: e, reason: collision with root package name */
    public final int f368292e;

    /* renamed from: f, reason: collision with root package name */
    public final f06.n f368293f;

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f368294g;

    public u2(i06.k0 callable, int i17, f06.n kind, yz5.a computeDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callable, "callable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(computeDescriptor, "computeDescriptor");
        this.f368291d = callable;
        this.f368292e = i17;
        this.f368293f = kind;
        this.f368294g = i06.f4.a(computeDescriptor);
        i06.f4.a(new i06.s2(this));
    }

    public static final java.lang.reflect.Type f(i06.u2 u2Var, java.lang.reflect.Type... typeArr) {
        u2Var.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new i06.r2(typeArr) : (java.lang.reflect.Type) kz5.z.l0(typeArr);
        }
        throw new xz5.b("Expected at least 1 type for compound type");
    }

    /* renamed from: equals */
    public boolean m134407xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof i06.u2) {
            i06.u2 u2Var = (i06.u2) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368291d, u2Var.f368291d)) {
                if (this.f368292e == u2Var.f368292e) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: getName */
    public java.lang.String m134408xfb82e301() {
        o06.x0 h17 = h();
        o06.x0 x0Var = h17 instanceof o06.l2 ? (o06.l2) h17 : null;
        if (x0Var == null || ((r06.s1) x0Var).e().i0()) {
            return null;
        }
        n16.g mo132800xfb82e301 = ((r06.v) x0Var).mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        if (mo132800xfb82e301.f415703e) {
            return null;
        }
        return mo132800xfb82e301.h();
    }

    public final o06.l1 h() {
        f06.v vVar = f368290h[0];
        java.lang.Object mo152xb9724478 = this.f368294g.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (o06.l1) mo152xb9724478;
    }

    /* renamed from: hashCode */
    public int m134409x8cdac1b() {
        return (this.f368291d.hashCode() * 31) + java.lang.Integer.hashCode(this.f368292e);
    }

    public f06.w i() {
        f26.o0 mo132802xfb85f7b0 = h().mo132802xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
        return new i06.w3(mo132802xfb85f7b0, new i06.t2(this));
    }

    public boolean j() {
        o06.l1 h17 = h();
        o06.l2 l2Var = h17 instanceof o06.l2 ? (o06.l2) h17 : null;
        if (l2Var != null) {
            return v16.f.a(l2Var);
        }
        return false;
    }

    public boolean k() {
        o06.l1 h17 = h();
        return (h17 instanceof o06.l2) && ((r06.s1) ((o06.l2) h17)).f450059p != null;
    }

    /* renamed from: toString */
    public java.lang.String m134410x9616526c() {
        java.lang.String b17;
        i06.j4 j4Var = i06.j4.f368203a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int ordinal = this.f368293f.ordinal();
        if (ordinal == 0) {
            sb6.append("instance parameter");
        } else if (ordinal == 1) {
            sb6.append("extension receiver parameter");
        } else if (ordinal == 2) {
            sb6.append("parameter #" + this.f368292e + ' ' + m134408xfb82e301());
        }
        sb6.append(" of ");
        o06.d l17 = this.f368291d.l();
        if (l17 instanceof o06.o1) {
            b17 = j4Var.c((o06.o1) l17);
        } else {
            if (!(l17 instanceof o06.n0)) {
                throw new java.lang.IllegalStateException(("Illegal callable: " + l17).toString());
            }
            b17 = j4Var.b((o06.n0) l17);
        }
        sb6.append(b17);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

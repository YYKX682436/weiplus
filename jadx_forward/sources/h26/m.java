package h26;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final h26.m f359907a = new h26.m();

    /* renamed from: b, reason: collision with root package name */
    public static final o06.v0 f359908b = h26.f.f359863d;

    /* renamed from: c, reason: collision with root package name */
    public static final h26.a f359909c;

    /* renamed from: d, reason: collision with root package name */
    public static final f26.o0 f359910d;

    /* renamed from: e, reason: collision with root package name */
    public static final f26.o0 f359911e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f359912f;

    static {
        h26.b[] bVarArr = h26.b.f359860d;
        java.lang.String format = java.lang.String.format("<Error class: %s>", java.util.Arrays.copyOf(new java.lang.Object[]{"unknown class"}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        f359909c = new h26.a(n16.g.m(format));
        f359910d = c(h26.l.f359892n, new java.lang.String[0]);
        f359911e = c(h26.l.A, new java.lang.String[0]);
        f359912f = kz5.o1.c(new h26.g());
    }

    public static final h26.h a(h26.i kind, boolean z17, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        return z17 ? new h26.n(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length)) : new h26.h(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final h26.h b(h26.i kind, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        return a(kind, false, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final h26.j c(h26.l kind, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        kz5.p0 p0Var = kz5.p0.f395529d;
        java.lang.String[] formatParams2 = (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length);
        h26.m mVar = f359907a;
        mVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams2, "formatParams");
        return mVar.e(kind, p0Var, mVar.d(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams2, formatParams2.length)), (java.lang.String[]) java.util.Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final boolean f(o06.m mVar) {
        if (mVar != null) {
            h26.m mVar2 = f359907a;
            mVar2.getClass();
            if (!(mVar instanceof h26.a)) {
                o06.m e17 = mVar.e();
                mVar2.getClass();
                if ((e17 instanceof h26.a) || mVar == f359908b) {
                }
            }
            return true;
        }
        return false;
    }

    public final h26.k d(h26.l kind, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        return new h26.k(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public final h26.j e(h26.l kind, java.util.List arguments, f26.c2 typeConstructor, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConstructor, "typeConstructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        return new h26.j(typeConstructor, b(h26.i.f359872h, typeConstructor.toString()), kind, arguments, false, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }
}

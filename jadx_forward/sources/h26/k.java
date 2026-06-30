package h26;

/* loaded from: classes16.dex */
public final class k implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final h26.l f359883a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f359884b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f359885c;

    public k(h26.l kind, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        this.f359883a = kind;
        this.f359884b = formatParams;
        h26.b[] bVarArr = h26.b.f359860d;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        java.lang.String format = java.lang.String.format(kind.f359905d, java.util.Arrays.copyOf(copyOf, copyOf.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format("[Error type: %s]", java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        this.f359885c = format2;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return kz5.p0.f395529d;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return kz5.p0.f395529d;
    }

    @Override // f26.c2
    public l06.o h() {
        jz5.g gVar = l06.i.f396415f;
        return (l06.i) ((jz5.n) l06.i.f396415f).mo141623x754a37bb();
    }

    @Override // f26.c2
    public o06.j i() {
        h26.m.f359907a.getClass();
        return h26.m.f359909c;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m132808x9616526c() {
        return this.f359885c;
    }
}

package i06;

/* loaded from: classes16.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final i06.j4 f368203a = new i06.j4();

    /* renamed from: b, reason: collision with root package name */
    public static final q16.s f368204b = q16.s.f441313a;

    public final void a(java.lang.StringBuilder sb6, o06.b bVar) {
        o06.r1 g17 = i06.o4.g(bVar);
        o06.r1 c07 = bVar.c0();
        if (g17 != null) {
            f26.o0 mo132802xfb85f7b0 = ((r06.g) g17).mo132802xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
            sb6.append(d(mo132802xfb85f7b0));
            sb6.append(".");
        }
        boolean z17 = (g17 == null || c07 == null) ? false : true;
        if (z17) {
            sb6.append("(");
        }
        if (c07 != null) {
            f26.o0 mo132802xfb85f7b02 = ((r06.g) c07).mo132802xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b02, "getType(...)");
            sb6.append(d(mo132802xfb85f7b02));
            sb6.append(".");
        }
        if (z17) {
            sb6.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String b(o06.n0 descriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("fun ");
        i06.j4 j4Var = f368203a;
        j4Var.a(sb6, descriptor);
        q16.s sVar = f368204b;
        n16.g mo132800xfb82e301 = ((r06.v) descriptor).mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        sb6.append(sVar.u(mo132800xfb82e301, true));
        java.util.List W = descriptor.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
        kz5.n0.f0(W, sb6, ", ", "(", ")", 0, null, i06.h4.f368189d, 48, null);
        sb6.append(": ");
        f26.o0 mo132801x3df4e080 = descriptor.mo132801x3df4e080();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo132801x3df4e080);
        sb6.append(j4Var.d(mo132801x3df4e080));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String c(o06.o1 descriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(descriptor.v() ? "var " : "val ");
        i06.j4 j4Var = f368203a;
        j4Var.a(sb6, descriptor);
        q16.s sVar = f368204b;
        n16.g mo132800xfb82e301 = descriptor.mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        sb6.append(sVar.u(mo132800xfb82e301, true));
        sb6.append(": ");
        f26.o0 mo132802xfb85f7b0 = descriptor.mo132802xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
        sb6.append(j4Var.d(mo132802xfb85f7b0));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(f26.o0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return f368204b.v(type);
    }
}

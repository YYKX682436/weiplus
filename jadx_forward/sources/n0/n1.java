package n0;

/* loaded from: classes14.dex */
public abstract class n1 {
    public static final void a(n0.i3[] values, yz5.p content, n0.o oVar, int i17) {
        p0.f f07;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1390796515);
        p0.f k17 = y0Var.k(null);
        y0Var.R(201, n0.e1.f415026b);
        y0Var.R(203, n0.e1.f415028d);
        n0.u0 u0Var = new n0.u0(values, k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(u0Var, 2);
        p0.f fVar = (p0.f) u0Var.mo149xb9724478(y0Var, 1);
        y0Var.o(false);
        if (y0Var.L) {
            f07 = y0Var.f0(k17, fVar);
            y0Var.H = true;
            z17 = false;
        } else {
            n0.j4 j4Var = y0Var.E;
            java.lang.Object f17 = j4Var.f(j4Var.f415107f, 0);
            if (f17 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p0.f fVar2 = (p0.f) f17;
            n0.j4 j4Var2 = y0Var.E;
            java.lang.Object f18 = j4Var2.f(j4Var2.f415107f, 1);
            if (f18 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p0.f fVar3 = (p0.f) f18;
            if (y0Var.v() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar3, fVar)) {
                y0Var.f415305m += y0Var.E.m();
                z17 = false;
                f07 = fVar2;
            } else {
                f07 = y0Var.f0(k17, fVar);
                z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f07, fVar2);
            }
        }
        if (z17 && !y0Var.L) {
            y0Var.f415314v.put(java.lang.Integer.valueOf(y0Var.E.f415107f), f07);
        }
        boolean z18 = y0Var.f415315w;
        n0.h2 h2Var = y0Var.f415316x;
        h2Var.b(z18 ? 1 : 0);
        y0Var.f415315w = z17;
        y0Var.I = f07;
        y0Var.P(202, n0.e1.f415027c, false, f07);
        content.mo149xb9724478(y0Var, java.lang.Integer.valueOf((i17 >> 3) & 14));
        y0Var.o(false);
        y0Var.o(false);
        y0Var.f415315w = h2Var.a() != 0;
        y0Var.I = null;
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new n0.m1(values, content, i17);
    }

    public static n0.h3 b(n0.r4 policy, yz5.a defaultFactory, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            policy = n0.h5.f415062a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultFactory, "defaultFactory");
        return new n0.c2(policy, defaultFactory);
    }

    public static final n0.h3 c(yz5.a defaultFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultFactory, "defaultFactory");
        return new n0.f5(defaultFactory);
    }
}

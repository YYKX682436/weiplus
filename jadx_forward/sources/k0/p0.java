package k0;

/* loaded from: classes14.dex */
public final class p0 extends k0.j {

    /* renamed from: h, reason: collision with root package name */
    public final g2.e0 f384488h;

    /* renamed from: i, reason: collision with root package name */
    public final j0.d5 f384489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(g2.e0 currentValue, g2.v offsetMapping, j0.d5 d5Var, k0.i1 state) {
        super(currentValue.f349226a, currentValue.f349227b, d5Var != null ? d5Var.f377798a : null, offsetMapping, state, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentValue, "currentValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetMapping, "offsetMapping");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f384488h = currentValue;
        this.f384489i = d5Var;
    }

    public final java.util.List x(yz5.l or6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(or6, "or");
        if (!a2.m1.b(this.f384464f)) {
            return kz5.c0.i(new g2.a("", 0), new g2.b0(a2.m1.f(this.f384464f), a2.m1.f(this.f384464f)));
        }
        g2.d dVar = (g2.d) or6.mo146xb9724478(this);
        if (dVar != null) {
            return kz5.b0.c(dVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(j0.d5 r6, int r7) {
        /*
            r5 = this;
            s1.z r0 = r6.f377799b
            if (r0 == 0) goto L11
            s1.z r1 = r6.f377800c
            r2 = 0
            if (r1 == 0) goto Lf
            r3 = 0
            r4 = 2
            d1.g r2 = s1.y.a(r1, r0, r3, r4, r2)
        Lf:
            if (r2 != 0) goto L13
        L11:
            d1.g r2 = d1.g.f307161e
        L13:
            g2.e0 r0 = r5.f384488h
            long r0 = r0.f349227b
            int r0 = a2.m1.c(r0)
            g2.v r1 = r5.f384462d
            g2.t r1 = (g2.t) r1
            r1.getClass()
            a2.k1 r6 = r6.f377798a
            d1.g r0 = r6.c(r0)
            float r3 = r2.f307164c
            float r4 = r2.f307162a
            float r3 = r3 - r4
            float r4 = r2.f307165d
            float r2 = r2.f307163b
            float r4 = r4 - r2
            long r2 = d1.l.a(r3, r4)
            float r2 = d1.k.b(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r7 = r0.f307163b
            float r7 = r7 + r2
            float r0 = r0.f307162a
            long r2 = d1.f.a(r0, r7)
            int r6 = r6.l(r2)
            r1.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.p0.y(j0.d5, int):int");
    }
}

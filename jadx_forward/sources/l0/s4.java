package l0;

/* loaded from: classes14.dex */
public final class s4 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f396048a;

    /* renamed from: b, reason: collision with root package name */
    public final float f396049b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d2 f396050c;

    public s4(boolean z17, float f17, d0.d2 paddingValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paddingValues, "paddingValues");
        this.f396048a = z17;
        this.f396049b = f17;
        this.f396050c = paddingValues;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return g(measurables, i17, l0.r4.f396035d);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return f(uVar, measurables, i17, l0.n4.f395931d);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return f(uVar, measurables, i17, l0.q4.f396025d);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        s1.o1 o1Var;
        s1.o1 o1Var2;
        java.lang.Object obj3;
        int i17;
        java.lang.Object obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        d0.e2 e2Var = (d0.e2) this.f396050c;
        int G = measure.G(e2Var.f306642b);
        int G2 = measure.G(e2Var.f306644d);
        int G3 = measure.G(l0.m4.f395915c);
        long a17 = p2.c.a(j17, 0, 0, 0, 0, 10, null);
        java.util.Iterator it = measurables.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1.c0.a((s1.r0) obj), "Leading")) {
                break;
            }
        }
        s1.r0 r0Var = (s1.r0) obj;
        s1.o1 m17 = r0Var != null ? r0Var.m(a17) : null;
        int e17 = l0.h4.e(m17) + 0;
        java.util.Iterator it6 = measurables.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1.c0.a((s1.r0) obj2), "Trailing")) {
                break;
            }
        }
        s1.r0 r0Var2 = (s1.r0) obj2;
        if (r0Var2 != null) {
            o1Var = m17;
            o1Var2 = r0Var2.m(p2.d.f(a17, -e17, 0));
        } else {
            o1Var = m17;
            o1Var2 = null;
        }
        int i18 = -G2;
        int i19 = -(e17 + l0.h4.e(o1Var2));
        long f17 = p2.d.f(a17, i19, i18);
        java.util.Iterator it7 = measurables.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it7.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1.c0.a((s1.r0) obj3), "Label")) {
                break;
            }
        }
        s1.r0 r0Var3 = (s1.r0) obj3;
        s1.o1 m18 = r0Var3 != null ? r0Var3.m(f17) : null;
        if (m18 != null) {
            i17 = m18.s(s1.d.f483533b);
            if (i17 == Integer.MIN_VALUE) {
                i17 = m18.f483584e;
            }
        } else {
            i17 = 0;
        }
        int max = java.lang.Math.max(i17, G);
        long f18 = p2.d.f(p2.c.a(j17, 0, 0, 0, 0, 11, null), i19, m18 != null ? (i18 - G3) - max : (-G) - G2);
        java.util.Iterator it8 = measurables.iterator();
        while (it8.hasNext()) {
            s1.r0 r0Var4 = (s1.r0) it8.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1.c0.a(r0Var4), "TextField")) {
                s1.o1 m19 = r0Var4.m(f18);
                long a18 = p2.c.a(f18, 0, 0, 0, 0, 14, null);
                java.util.Iterator it9 = measurables.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it9.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1.c0.a((s1.r0) obj4), "Hint")) {
                        break;
                    }
                }
                s1.r0 r0Var5 = (s1.r0) obj4;
                s1.o1 m27 = r0Var5 != null ? r0Var5.m(a18) : null;
                int max2 = java.lang.Math.max(l0.h4.e(o1Var) + java.lang.Math.max(m19.f483583d, java.lang.Math.max(l0.h4.e(m18), l0.h4.e(m27))) + l0.h4.e(o1Var2), p2.c.j(j17));
                int c17 = l0.m4.c(m19.f483584e, m18 != null, max, l0.h4.d(o1Var), l0.h4.d(o1Var2), l0.h4.d(m27), j17, measure.mo7005x9a59d0b2(), this.f396050c);
                return s1.v0.b(measure, max2, c17, null, new l0.p4(m18, G, i17, max2, c17, m19, m27, o1Var, o1Var2, this, max, G3, measure), 4, null);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        return g(measurables, i17, l0.o4.f395948d);
    }

    public final int f(s1.u uVar, java.util.List list, int i17, yz5.p pVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        for (java.lang.Object obj5 : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj5), "TextField")) {
                int intValue = ((java.lang.Number) pVar.mo149xb9724478(obj5, java.lang.Integer.valueOf(i17))).intValue();
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj2), "Label")) {
                        break;
                    }
                }
                s1.t tVar = (s1.t) obj2;
                int intValue2 = tVar != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj3), "Trailing")) {
                        break;
                    }
                }
                s1.t tVar2 = (s1.t) obj3;
                int intValue3 = tVar2 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar2, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj4), "Leading")) {
                        break;
                    }
                }
                s1.t tVar3 = (s1.t) obj4;
                int intValue4 = tVar3 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar3, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it8.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                s1.t tVar4 = (s1.t) obj;
                return l0.m4.c(intValue, intValue2 > 0, intValue2, intValue4, intValue3, tVar4 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar4, java.lang.Integer.valueOf(i17))).intValue() : 0, l0.h4.f395757a, uVar.mo7005x9a59d0b2(), this.f396050c);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(java.util.List list, int i17, yz5.p pVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        for (java.lang.Object obj5 : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj5), "TextField")) {
                int intValue = ((java.lang.Number) pVar.mo149xb9724478(obj5, java.lang.Integer.valueOf(i17))).intValue();
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj2), "Label")) {
                        break;
                    }
                }
                s1.t tVar = (s1.t) obj2;
                int intValue2 = tVar != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj3), "Trailing")) {
                        break;
                    }
                }
                s1.t tVar2 = (s1.t) obj3;
                int intValue3 = tVar2 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar2, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) obj4), "Leading")) {
                        break;
                    }
                }
                s1.t tVar3 = (s1.t) obj4;
                int intValue4 = tVar3 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar3, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it8.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0.h4.c((s1.t) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                s1.t tVar4 = (s1.t) obj;
                return java.lang.Math.max(intValue4 + java.lang.Math.max(intValue, java.lang.Math.max(intValue2, tVar4 != null ? ((java.lang.Number) pVar.mo149xb9724478(tVar4, java.lang.Integer.valueOf(i17))).intValue() : 0)) + intValue3, p2.c.j(l0.h4.f395757a));
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

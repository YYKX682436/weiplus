package b16;

/* loaded from: classes16.dex */
public final class o1 extends r06.f {

    /* renamed from: q, reason: collision with root package name */
    public final a16.l f17221q;

    /* renamed from: r, reason: collision with root package name */
    public final e16.v f17222r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o1(a16.l r12, e16.v r13, int r14, o06.m r15) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "javaTypeParameter"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.o.g(r15, r0)
            a16.d r0 = r12.f649a
            e26.c0 r2 = r0.f615a
            a16.h r4 = new a16.h
            r1 = 0
            r4.<init>(r12, r13, r1)
            r1 = r13
            u06.l0 r1 = (u06.l0) r1
            java.lang.reflect.TypeVariable r1 = r1.f423514a
            java.lang.String r1 = r1.getName()
            n16.g r5 = n16.g.k(r1)
            f26.d3 r6 = f26.d3.f259143f
            r7 = 0
            o06.x1 r9 = o06.x1.f342004a
            o06.c2 r10 = r0.f627m
            r1 = r11
            r3 = r15
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f17221q = r12
            r11.f17222r = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.o1.<init>(a16.l, e16.v, int, o06.m):void");
    }

    @Override // r06.q
    public java.util.List s0(java.util.List bounds) {
        f26.o0 a17;
        kotlin.jvm.internal.o.g(bounds, "bounds");
        a16.l lVar = this.f17221q;
        f16.y0 y0Var = lVar.f649a.f632r;
        y0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(bounds, 10));
        java.util.Iterator it = bounds.iterator();
        while (it.hasNext()) {
            f26.o0 o0Var = (f26.o0) it.next();
            f16.x0 x0Var = f16.x0.f258783d;
            kotlin.jvm.internal.o.g(o0Var, "<this>");
            if (!f26.z2.c(o0Var, x0Var) && (a17 = y0Var.a(new f16.c1(this, false, lVar, x06.c.f451215i, false, 16, null), o0Var, kz5.p0.f313996d, null, false)) != null) {
                o0Var = a17;
            }
            arrayList.add(o0Var);
        }
        return arrayList;
    }

    @Override // r06.q
    public java.util.List u0() {
        java.lang.reflect.Type[] bounds = ((u06.l0) this.f17222r).f423514a.getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(bounds.length);
        for (java.lang.reflect.Type type : bounds) {
            arrayList.add(new u06.z(type));
        }
        u06.z zVar = (u06.z) kz5.n0.B0(arrayList);
        java.util.List list = arrayList;
        if (kotlin.jvm.internal.o.b(zVar != null ? zVar.f423535a : null, java.lang.Object.class)) {
            list = kz5.p0.f313996d;
        }
        boolean isEmpty = list.isEmpty();
        a16.l lVar = this.f17221q;
        if (isEmpty) {
            f26.z0 f17 = lVar.f649a.f629o.h().f();
            kotlin.jvm.internal.o.f(f17, "getAnyType(...)");
            f26.z0 p17 = lVar.f649a.f629o.h().p();
            kotlin.jvm.internal.o.f(p17, "getNullableAnyType(...)");
            return kz5.b0.c(f26.r0.a(f17, p17));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.f653e.e((e16.j) it.next(), c16.b.a(f26.x2.f259236e, false, false, this, 3, null)));
        }
        return arrayList2;
    }
}

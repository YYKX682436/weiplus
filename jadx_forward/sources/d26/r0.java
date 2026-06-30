package d26;

/* loaded from: classes16.dex */
public final class r0 extends r06.f {

    /* renamed from: q, reason: collision with root package name */
    public final b26.t f307579q;

    /* renamed from: r, reason: collision with root package name */
    public final i16.s1 f307580r;

    /* renamed from: s, reason: collision with root package name */
    public final d26.a f307581s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(b26.t r12, i16.s1 r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            b26.q r0 = r12.f99048a
            e26.c0 r2 = r0.f99016a
            o06.m r3 = r12.f99050c
            int r1 = p06.k.Z0
            p06.k r4 = p06.i.f432298a
            int r1 = r13.f369263h
            k16.g r5 = r12.f99049b
            n16.g r5 = b26.t0.b(r5, r1)
            i16.r1 r1 = r13.f369265m
            java.lang.String r6 = "getVariance(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r6)
            int r1 = r1.ordinal()
            if (r1 == 0) goto L3b
            r6 = 1
            if (r1 == r6) goto L38
            r6 = 2
            if (r1 != r6) goto L32
            f26.d3 r1 = f26.d3.f340676f
            goto L3d
        L32:
            jz5.j r12 = new jz5.j
            r12.<init>()
            throw r12
        L38:
            f26.d3 r1 = f26.d3.f340678h
            goto L3d
        L3b:
            f26.d3 r1 = f26.d3.f340677g
        L3d:
            r6 = r1
            boolean r7 = r13.f369264i
            o06.x1 r9 = o06.x1.f423537a
            o06.b2 r10 = o06.b2.f423461a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f307579q = r12
            r11.f307580r = r13
            d26.a r12 = new d26.a
            e26.c0 r13 = r0.f99016a
            d26.q0 r14 = new d26.q0
            r14.<init>(r11)
            r12.<init>(r13, r14)
            r11.f307581s = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.r0.<init>(b26.t, i16.s1, int):void");
    }

    @Override // p06.b, p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        return this.f307581s;
    }

    @Override // r06.q
    public java.util.List u0() {
        b26.t tVar = this.f307579q;
        k16.k typeTable = tVar.f99051d;
        i16.s1 s1Var = this.f307580r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        java.util.List list = s1Var.f369266n;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            java.util.List<java.lang.Integer> list2 = s1Var.f369267o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getUpperBoundIdList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (java.lang.Integer num : list2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return kz5.b0.c(v16.f.e(this).n());
        }
        b26.j1 j1Var = tVar.f99055h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(j1Var.g((i16.l1) it.next()));
        }
        return arrayList2;
    }
}

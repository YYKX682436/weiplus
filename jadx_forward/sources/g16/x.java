package g16;

/* loaded from: classes15.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f349202b = kz5.o1.c(h16.b.f359755h);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f349203c = kz5.z.D0(new h16.b[]{h16.b.f359756i, h16.b.f359759o});

    /* renamed from: d, reason: collision with root package name */
    public static final m16.g f349204d;

    /* renamed from: e, reason: collision with root package name */
    public static final m16.g f349205e;

    /* renamed from: a, reason: collision with root package name */
    public b26.q f349206a;

    static {
        new m16.g(1, 1, 2);
        f349204d = new m16.g(1, 1, 11);
        f349205e = new m16.g(1, 1, 13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (g16.x.f349203c.contains(r1.f359762a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y16.s a(o06.d1 r13, g16.q0 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "descriptor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r1)
            java.lang.String r1 = "kotlinClass"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r1)
            r1 = r14
            t06.g r1 = (t06.g) r1
            h16.c r1 = r1.f496070b
            java.lang.String[] r2 = r1.f359764c
            if (r2 != 0) goto L17
            java.lang.String[] r2 = r1.f359765d
        L17:
            r3 = 0
            if (r2 == 0) goto L25
            h16.b r4 = r1.f359762a
            java.util.Set r5 = g16.x.f349203c
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 != 0) goto L29
            return r3
        L29:
            java.lang.String[] r4 = r1.f359766e
            if (r4 != 0) goto L2e
            return r3
        L2e:
            jz5.l r0 = m16.j.h(r2, r4)     // Catch: java.lang.Throwable -> L33 p16.z -> L35
            goto L65
        L33:
            r0 = move-exception
            goto L4f
        L35:
            r2 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r0 = r14
            t06.g r0 = (t06.g) r0     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L33
            r5.append(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L33
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L33
        L4f:
            b26.q r2 = r12.c()
            b26.s r2 = r2.f99018c
            r2.getClass()
            m16.g r2 = r1.f359763b
            m16.g r4 = r12.e()
            boolean r2 = r2.b(r4)
            if (r2 != 0) goto Lad
            r0 = r3
        L65:
            if (r0 != 0) goto L68
            return r3
        L68:
            java.lang.Object r2 = r0.f384366d
            m16.h r2 = (m16.h) r2
            java.lang.Object r0 = r0.f384367e
            i16.o0 r0 = (i16.o0) r0
            g16.b0 r10 = new g16.b0
            b26.f0 r7 = r12.d(r14)
            boolean r8 = r12.f(r14)
            d26.y r9 = r12.b(r14)
            r3 = r10
            r4 = r14
            r5 = r0
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            d26.m0 r14 = new d26.m0
            m16.g r7 = r1.f359763b
            b26.q r9 = r12.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "scope for "
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r3 = " in "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            g16.w r11 = g16.w.f349201d
            r3 = r14
            r4 = r13
            r8 = r10
            r10 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.x.a(o06.d1, g16.q0):y16.s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (((r4 & 32) != 0) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d26.y b(g16.q0 r4) {
        /*
            r3 = this;
            b26.q r0 = r3.c()
            b26.s r0 = r0.f99018c
            r0.getClass()
            t06.g r4 = (t06.g) r4
            h16.c r4 = r4.f496070b
            int r4 = r4.f359768g
            r0 = r4 & 64
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L25
            r0 = r4 & 32
            if (r0 == 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L2b
            d26.y r4 = d26.y.f307603e
            goto L46
        L2b:
            r0 = r4 & 16
            if (r0 == 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L3e
            r4 = r4 & 32
            if (r4 == 0) goto L3a
            r4 = r1
            goto L3b
        L3a:
            r4 = r2
        L3b:
            if (r4 != 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r1 == 0) goto L44
            d26.y r4 = d26.y.f307604f
            goto L46
        L44:
            d26.y r4 = d26.y.f307602d
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.x.b(g16.q0):d26.y");
    }

    public final b26.q c() {
        b26.q qVar = this.f349206a;
        if (qVar != null) {
            return qVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("components");
        throw null;
    }

    public final b26.f0 d(g16.q0 q0Var) {
        c().f99018c.getClass();
        t06.g gVar = (t06.g) q0Var;
        if (gVar.f496070b.f359763b.b(e())) {
            return null;
        }
        h16.c cVar = gVar.f496070b;
        m16.g gVar2 = cVar.f359763b;
        m16.g gVar3 = m16.g.f404425g;
        m16.g e17 = e();
        m16.g e18 = e();
        boolean z17 = cVar.f359763b.f404427f;
        e18.getClass();
        m16.g gVar4 = z17 ? gVar3 : m16.g.f404426h;
        gVar4.getClass();
        int i17 = e18.f384958b;
        int i18 = gVar4.f384958b;
        if (i18 > i17 || (i18 >= i17 && gVar4.f384959c > e18.f384959c)) {
            e18 = gVar4;
        }
        return new b26.f0(gVar2, gVar3, e17, e18, gVar.b(), gVar.a());
    }

    public final m16.g e() {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c().f99018c, "<this>");
        return m16.g.f404425g;
    }

    public final boolean f(g16.q0 q0Var) {
        c().f99018c.getClass();
        c().f99018c.getClass();
        h16.c cVar = ((t06.g) q0Var).f496070b;
        return ((cVar.f359768g & 2) != 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f359763b, f349204d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (g16.x.f349202b.contains(r1.f359762a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b26.i g(g16.q0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "kotlinClass"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            r1 = r8
            t06.g r1 = (t06.g) r1
            h16.c r1 = r1.f496070b
            java.lang.String[] r2 = r1.f359764c
            if (r2 != 0) goto L12
            java.lang.String[] r2 = r1.f359765d
        L12:
            r3 = 0
            if (r2 == 0) goto L20
            h16.b r4 = r1.f359762a
            java.util.Set r5 = g16.x.f349202b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L20
            goto L21
        L20:
            r2 = r3
        L21:
            if (r2 != 0) goto L24
            return r3
        L24:
            java.lang.String[] r4 = r1.f359766e
            m16.g r1 = r1.f359763b
            if (r4 != 0) goto L2b
            return r3
        L2b:
            jz5.l r0 = m16.j.f(r2, r4)     // Catch: java.lang.Throwable -> L30 p16.z -> L32
            goto L60
        L30:
            r0 = move-exception
            goto L4c
        L32:
            r2 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = r8
            t06.g r0 = (t06.g) r0     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L30
            r5.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L30
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L30
            throw r4     // Catch: java.lang.Throwable -> L30
        L4c:
            b26.q r2 = r7.c()
            b26.s r2 = r2.f99018c
            r2.getClass()
            m16.g r2 = r7.e()
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L82
            r0 = r3
        L60:
            if (r0 != 0) goto L63
            return r3
        L63:
            java.lang.Object r2 = r0.f384366d
            m16.h r2 = (m16.h) r2
            java.lang.Object r0 = r0.f384367e
            i16.o r0 = (i16.o) r0
            g16.s0 r3 = new g16.s0
            b26.f0 r4 = r7.d(r8)
            boolean r5 = r7.f(r8)
            d26.y r6 = r7.b(r8)
            r3.<init>(r8, r4, r5, r6)
            b26.i r8 = new b26.i
            r8.<init>(r2, r0, r1, r3)
            return r8
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.x.g(g16.q0):b26.i");
    }
}

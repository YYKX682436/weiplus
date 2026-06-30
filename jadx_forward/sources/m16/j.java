package m16;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m16.j f404432a = new m16.j();

    /* renamed from: b, reason: collision with root package name */
    public static final p16.l f404433b;

    static {
        p16.l lVar = new p16.l();
        lVar.a(l16.r.f396625a);
        lVar.a(l16.r.f396626b);
        lVar.a(l16.r.f396627c);
        lVar.a(l16.r.f396628d);
        lVar.a(l16.r.f396629e);
        lVar.a(l16.r.f396630f);
        lVar.a(l16.r.f396631g);
        lVar.a(l16.r.f396632h);
        lVar.a(l16.r.f396633i);
        lVar.a(l16.r.f396634j);
        lVar.a(l16.r.f396635k);
        lVar.a(l16.r.f396636l);
        lVar.a(l16.r.f396637m);
        lVar.a(l16.r.f396638n);
        f404433b = lVar;
    }

    public static final boolean d(i16.u0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        k16.c cVar = m16.c.f404420a;
        k16.c cVar2 = m16.c.f404420a;
        java.lang.Object f17 = proto.f(l16.r.f396629e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getExtension(...)");
        java.lang.Boolean c17 = cVar2.c(((java.lang.Number) f17).intValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    public static final jz5.l f(java.lang.String[] data, java.lang.String[] strings) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strings, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m16.a.b(data));
        m16.h g17 = f404432a.g(byteArrayInputStream, strings);
        p16.d dVar = (p16.d) i16.o.R;
        dVar.getClass();
        p16.h hVar = new p16.h(byteArrayInputStream);
        p16.h0 h0Var = (p16.h0) dVar.a(hVar, f404433b);
        try {
            hVar.a(0);
            dVar.b(h0Var);
            return new jz5.l(g17, (i16.o) h0Var);
        } catch (p16.z e17) {
            e17.f432904d = h0Var;
            throw e17;
        }
    }

    public static final jz5.l h(java.lang.String[] data, java.lang.String[] strings) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strings, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m16.a.b(data));
        m16.h g17 = f404432a.g(byteArrayInputStream, strings);
        p16.d dVar = (p16.d) i16.o0.f369193r;
        dVar.getClass();
        p16.h hVar = new p16.h(byteArrayInputStream);
        p16.h0 h0Var = (p16.h0) dVar.a(hVar, f404433b);
        try {
            hVar.a(0);
            dVar.b(h0Var);
            return new jz5.l(g17, (i16.o0) h0Var);
        } catch (p16.z e17) {
            e17.f432904d = h0Var;
            throw e17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m16.e a(i16.r r17, k16.g r18, k16.k r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            java.lang.String r3 = "nameResolver"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            java.lang.String r3 = "typeTable"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            p16.u r3 = l16.r.f396625a
            java.lang.String r4 = "constructorSignature"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.lang.Object r3 = k16.i.a(r0, r3)
            l16.g r3 = (l16.g) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L37
            int r6 = r3.f396566e
            r6 = r6 & r5
            if (r6 != r5) goto L2d
            r6 = r5
            goto L2e
        L2d:
            r6 = r4
        L2e:
            if (r6 == 0) goto L37
            int r6 = r3.f396567f
            java.lang.String r6 = r1.mo141776x2fec8307(r6)
            goto L39
        L37:
            java.lang.String r6 = "<init>"
        L39:
            if (r3 == 0) goto L4b
            int r7 = r3.f396566e
            r8 = 2
            r7 = r7 & r8
            if (r7 != r8) goto L42
            r4 = r5
        L42:
            if (r4 == 0) goto L4b
            int r0 = r3.f396568g
            java.lang.String r0 = r1.mo141776x2fec8307(r0)
            goto L92
        L4b:
            java.util.List r0 = r0.f369239h
            java.lang.String r3 = "getValueParameterList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r0, r3)
            r7.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r0.next()
            i16.y1 r3 = (i16.y1) r3
            m16.j r4 = m16.j.f404432a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            i16.l1 r3 = k16.j.e(r3, r2)
            java.lang.String r3 = r4.e(r3, r1)
            if (r3 != 0) goto L7e
            r0 = 0
            return r0
        L7e:
            r7.add(r3)
            goto L61
        L82:
            java.lang.String r8 = ""
            java.lang.String r9 = "("
            java.lang.String r10 = ")V"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            java.lang.String r0 = kz5.n0.g0(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L92:
            m16.e r1 = new m16.e
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m16.j.a(i16.r, k16.g, k16.k):m16.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m16.d b(i16.u0 r7, k16.g r8, k16.k r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r0 = "nameResolver"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "typeTable"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            p16.u r0 = l16.r.f396628d
            java.lang.String r1 = "propertySignature"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.Object r0 = k16.i.a(r7, r0)
            l16.j r0 = (l16.j) r0
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            int r2 = r0.f396580e
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L29
            r2 = r3
            goto L2a
        L29:
            r2 = r4
        L2a:
            if (r2 == 0) goto L2f
            l16.d r0 = r0.f396581f
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L35
            if (r10 == 0) goto L35
            return r1
        L35:
            if (r0 == 0) goto L44
            int r10 = r0.f396555e
            r10 = r10 & r3
            if (r10 != r3) goto L3e
            r10 = r3
            goto L3f
        L3e:
            r10 = r4
        L3f:
            if (r10 == 0) goto L44
            int r10 = r0.f396556f
            goto L46
        L44:
            int r10 = r7.f369298i
        L46:
            if (r0 == 0) goto L59
            int r2 = r0.f396555e
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L4f
            goto L50
        L4f:
            r3 = r4
        L50:
            if (r3 == 0) goto L59
            int r7 = r0.f396557g
            java.lang.String r7 = r8.mo141776x2fec8307(r7)
            goto L64
        L59:
            i16.l1 r7 = k16.j.d(r7, r9)
            java.lang.String r7 = r6.e(r7, r8)
            if (r7 != 0) goto L64
            return r1
        L64:
            m16.d r9 = new m16.d
            java.lang.String r8 = r8.mo141776x2fec8307(r10)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m16.j.b(i16.u0, k16.g, k16.k, boolean):m16.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[LOOP:0: B:18:0x0068->B:20:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m16.e c(i16.j0 r18, k16.g r19, k16.k r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            java.lang.String r3 = "nameResolver"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            java.lang.String r3 = "typeTable"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            p16.u r3 = l16.r.f396626b
            java.lang.String r4 = "methodSignature"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.lang.Object r3 = k16.i.a(r0, r3)
            l16.g r3 = (l16.g) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L33
            int r6 = r3.f396566e
            r6 = r6 & r5
            if (r6 != r5) goto L2d
            r6 = r5
            goto L2e
        L2d:
            r6 = r4
        L2e:
            if (r6 == 0) goto L33
            int r6 = r3.f396567f
            goto L35
        L33:
            int r6 = r0.f369062i
        L35:
            if (r3 == 0) goto L4a
            int r7 = r3.f396566e
            r8 = 2
            r7 = r7 & r8
            if (r7 != r8) goto L3e
            r4 = r5
        L3e:
            if (r4 == 0) goto L4a
            int r0 = r3.f396568g
            java.lang.String r0 = r1.mo141776x2fec8307(r0)
            r2 = r17
            goto Lce
        L4a:
            i16.l1 r3 = k16.j.b(r0, r2)
            java.util.List r3 = kz5.c0.j(r3)
            java.util.List r4 = r0.f369071u
            java.lang.String r5 = "getValueParameterList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r8 = kz5.d0.q(r4, r7)
            r5.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L68:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r4.next()
            i16.y1 r8 = (i16.y1) r8
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            i16.l1 r8 = k16.j.e(r8, r2)
            r5.add(r8)
            goto L68
        L7f:
            java.util.List r3 = kz5.n0.t0(r3, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = kz5.d0.q(r3, r7)
            r8.<init>(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L92:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r3.next()
            i16.l1 r4 = (i16.l1) r4
            m16.j r7 = m16.j.f404432a
            java.lang.String r4 = r7.e(r4, r1)
            if (r4 != 0) goto La8
            return r5
        La8:
            r8.add(r4)
            goto L92
        Lac:
            i16.l1 r0 = k16.j.c(r0, r2)
            r2 = r17
            java.lang.String r0 = r2.e(r0, r1)
            if (r0 != 0) goto Lb9
            return r5
        Lb9:
            java.lang.String r9 = ""
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 56
            r16 = 0
            java.lang.String r3 = kz5.n0.g0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r3.concat(r0)
        Lce:
            m16.e r3 = new m16.e
            java.lang.String r1 = r1.mo141776x2fec8307(r6)
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m16.j.c(i16.j0, k16.g, k16.k):m16.e");
    }

    public final java.lang.String e(i16.l1 l1Var, k16.g gVar) {
        if ((l1Var.f369115f & 16) == 16) {
            return m16.b.b(gVar.a(l1Var.f369121o));
        }
        return null;
    }

    public final m16.h g(java.io.InputStream inputStream, java.lang.String[] strArr) {
        l16.q qVar = (l16.q) ((p16.d) l16.q.f396618n).c(inputStream, f404433b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(qVar, "parseDelimitedFrom(...)");
        return new m16.h(qVar, strArr);
    }
}

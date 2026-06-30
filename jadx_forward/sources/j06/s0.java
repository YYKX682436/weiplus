package j06;

/* loaded from: classes16.dex */
public abstract class s0 {
    public static final java.lang.Object a(java.lang.Object obj, o06.d descriptor) {
        f26.o0 c17;
        java.lang.Class g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        return (((descriptor instanceof o06.o1) && r16.m.d((o06.m2) descriptor)) || (c17 = c(descriptor)) == null || (g17 = g(c17)) == null) ? obj : d(g17, descriptor).invoke(obj, new java.lang.Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final j06.k b(j06.k r5, o06.d r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "descriptor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            boolean r0 = r16.m.a(r6)
            r1 = 1
            if (r0 != 0) goto Lac
            java.util.List r0 = r6.p0()
            java.lang.String r2 = "getContextReceiverParameters(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            boolean r2 = r0.isEmpty()
            r3 = 0
            java.lang.String r4 = "getType(...)"
            if (r2 == 0) goto L24
            goto L45
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            o06.r1 r2 = (o06.r1) r2
            r06.g r2 = (r06.g) r2
            f26.o0 r2 = r2.mo132802xfb85f7b0()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            boolean r2 = r16.m.f(r2)
            if (r2 == 0) goto L28
            r0 = r1
            goto L46
        L45:
            r0 = r3
        L46:
            if (r0 != 0) goto Lac
            java.util.List r0 = r6.W()
            java.lang.String r2 = "getValueParameters(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L58
            goto L79
        L58:
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            o06.l2 r2 = (o06.l2) r2
            r06.t1 r2 = (r06.t1) r2
            f26.o0 r2 = r2.mo132802xfb85f7b0()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            boolean r2 = r16.m.f(r2)
            if (r2 == 0) goto L5c
            r0 = r1
            goto L7a
        L79:
            r0 = r3
        L7a:
            if (r0 != 0) goto Lac
            f26.o0 r0 = r6.mo132801x3df4e080()
            if (r0 == 0) goto L96
            f26.c2 r0 = r0.w0()
            o06.j r0 = r0.i()
            if (r0 == 0) goto L91
            boolean r0 = r16.m.b(r0)
            goto L92
        L91:
            r0 = r3
        L92:
            if (r0 != r1) goto L96
            r0 = r1
            goto L97
        L96:
            r0 = r3
        L97:
            if (r0 != 0) goto Lac
            f26.o0 r0 = c(r6)
            if (r0 == 0) goto La7
            boolean r0 = r16.m.f(r0)
            if (r0 != r1) goto La7
            r0 = r1
            goto La8
        La7:
            r0 = r3
        La8:
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            r1 = r3
        Lac:
            if (r1 == 0) goto Lb4
            j06.r0 r0 = new j06.r0
            r0.<init>(r6, r5, r7)
            r5 = r0
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.s0.b(j06.k, o06.d, boolean):j06.k");
    }

    public static final f26.o0 c(o06.d dVar) {
        o06.r1 c07 = dVar.c0();
        o06.r1 Z = dVar.Z();
        if (c07 != null) {
            return ((r06.g) c07).mo132802xfb85f7b0();
        }
        if (Z != null) {
            if (dVar instanceof o06.l) {
                return ((r06.g) Z).mo132802xfb85f7b0();
            }
            o06.m e17 = dVar.e();
            o06.g gVar = e17 instanceof o06.g ? (o06.g) e17 : null;
            if (gVar != null) {
                return gVar.k();
            }
        }
        return null;
    }

    public static final java.lang.reflect.Method d(java.lang.Class cls, o06.d descriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new java.lang.Class[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new i06.a4("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final java.util.List e(f26.z0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.util.List f17 = f(f26.r2.a(type));
        if (f17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f17, 10));
        java.util.Iterator it = f17.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((java.lang.String) it.next()));
        }
        o06.j i17 = type.w0().i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        java.lang.Class k17 = i06.o4.k((o06.g) i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(k17.getDeclaredMethod((java.lang.String) it6.next(), new java.lang.Class[0]));
        }
        return arrayList2;
    }

    public static final java.util.List f(f26.z0 z0Var) {
        java.util.Collection c17;
        if (!r16.m.g(z0Var)) {
            return null;
        }
        o06.j i17 = z0Var.w0().i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i18 = v16.f.f514134a;
        o06.j2 d07 = ((o06.g) i17).d0();
        o06.w0 w0Var = d07 instanceof o06.w0 ? (o06.w0) d07 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (jz5.l lVar : w0Var.f423534a) {
            n16.g gVar = (n16.g) lVar.f384366d;
            java.util.List f17 = f((f26.z0) lVar.f384367e);
            if (f17 != null) {
                c17 = new java.util.ArrayList(kz5.d0.q(f17, 10));
                java.util.Iterator it = f17.iterator();
                while (it.hasNext()) {
                    c17.add(gVar.i() + '-' + ((java.lang.String) it.next()));
                }
            } else {
                c17 = kz5.b0.c(gVar.i());
            }
            kz5.h0.u(arrayList, c17);
        }
        return arrayList;
    }

    public static final java.lang.Class g(f26.o0 o0Var) {
        java.lang.Class h17 = h(o0Var.w0().i());
        if (h17 == null) {
            return null;
        }
        if (!f26.z2.f(o0Var)) {
            return h17;
        }
        f26.o0 h18 = r16.m.h(o0Var);
        if (h18 == null || f26.z2.f(h18) || l06.o.H(h18)) {
            return null;
        }
        return h17;
    }

    public static final java.lang.Class h(o06.m mVar) {
        if (!(mVar instanceof o06.g) || !r16.m.b(mVar)) {
            return null;
        }
        o06.g gVar = (o06.g) mVar;
        java.lang.Class k17 = i06.o4.k(gVar);
        if (k17 != null) {
            return k17;
        }
        throw new i06.a4("Class object for the class " + gVar.mo132800xfb82e301() + " cannot be found (classId=" + v16.f.f((o06.j) mVar) + ')');
    }
}

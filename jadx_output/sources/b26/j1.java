package b26;

/* loaded from: classes16.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final b26.t f17449a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.j1 f17450b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f17451c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f17452d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f17453e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f17454f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f17455g;

    public j1(b26.t c17, b26.j1 j1Var, java.util.List typeParameterProtos, java.lang.String debugName, java.lang.String containerPresentableName) {
        java.util.Map linkedHashMap;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.o.g(debugName, "debugName");
        kotlin.jvm.internal.o.g(containerPresentableName, "containerPresentableName");
        this.f17449a = c17;
        this.f17450b = j1Var;
        this.f17451c = debugName;
        this.f17452d = containerPresentableName;
        b26.q qVar = c17.f17515a;
        this.f17453e = ((e26.u) qVar.f17483a).d(new b26.d1(this));
        this.f17454f = ((e26.u) qVar.f17483a).d(new b26.f1(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kz5.q0.f314001d;
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = typeParameterProtos.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i16.s1 s1Var = (i16.s1) it.next();
                linkedHashMap.put(java.lang.Integer.valueOf(s1Var.f287729g), new d26.r0(this.f17449a, s1Var, i17));
                i17++;
            }
        }
        this.f17455g = linkedHashMap;
    }

    public static final java.util.List e(i16.l1 l1Var, b26.j1 j1Var) {
        java.util.List list = l1Var.f287583g;
        kotlin.jvm.internal.o.f(list, "getArgumentList(...)");
        i16.l1 a17 = k16.j.a(l1Var, j1Var.f17449a.f17518d);
        java.util.List e17 = a17 != null ? e(a17, j1Var) : null;
        if (e17 == null) {
            e17 = kz5.p0.f313996d;
        }
        return kz5.n0.t0(list, e17);
    }

    public static final o06.g h(b26.j1 j1Var, i16.l1 l1Var, int i17) {
        n16.b a17 = b26.t0.a(j1Var.f17449a.f17516b, i17);
        java.util.List z17 = q26.h0.z(q26.h0.o(q26.y.d(l1Var, new b26.h1(j1Var)), b26.i1.f17448d));
        int f17 = q26.h0.f(q26.y.d(a17, b26.g1.f17441d));
        while (z17.size() < f17) {
            z17.add(0);
        }
        return j1Var.f17449a.f17515a.f17494l.a(a17, z17);
    }

    public final f26.z0 a(f26.o0 o0Var, f26.o0 o0Var2) {
        l06.o e17 = j26.c.e(o0Var);
        p06.k annotations = o0Var.getAnnotations();
        f26.o0 f17 = l06.j.f(o0Var);
        java.util.List d17 = l06.j.d(o0Var);
        java.util.List S = kz5.n0.S(l06.j.g(o0Var), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(S, 10));
        java.util.Iterator it = S.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26.l2) it.next()).getType());
        }
        return l06.j.b(e17, annotations, f17, d17, arrayList, null, o0Var2, true).A0(o0Var.x0());
    }

    public final java.util.List b() {
        return kz5.n0.S0(this.f17455g.values());
    }

    public final o06.e2 c(int i17) {
        o06.e2 e2Var = (o06.e2) this.f17455g.get(java.lang.Integer.valueOf(i17));
        if (e2Var != null) {
            return e2Var;
        }
        b26.j1 j1Var = this.f17450b;
        if (j1Var != null) {
            return j1Var.c(i17);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f26.z0 d(i16.l1 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b26.j1.d(i16.l1, boolean):f26.z0");
    }

    public final f26.r1 f(java.util.List list, p06.k annotations, f26.c2 c2Var, o06.m mVar) {
        f26.r1 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f26.t) ((f26.p1) it.next())).getClass();
            kotlin.jvm.internal.o.g(annotations, "annotations");
            if (annotations.isEmpty()) {
                f26.r1.f259214e.getClass();
                b17 = f26.r1.f259215f;
            } else {
                b17 = f26.r1.f259214e.b(kz5.b0.c(new f26.o(annotations)));
            }
            arrayList.add(b17);
        }
        return f26.r1.f259214e.b(kz5.d0.r(arrayList));
    }

    public final f26.o0 g(i16.l1 proto) {
        i16.l1 a17;
        kotlin.jvm.internal.o.g(proto, "proto");
        if (!((proto.f287582f & 2) == 2)) {
            return d(proto, true);
        }
        b26.t tVar = this.f17449a;
        java.lang.String string = tVar.f17516b.getString(proto.f287585i);
        f26.z0 d17 = d(proto, true);
        k16.k typeTable = tVar.f17518d;
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        int i17 = proto.f287582f;
        if ((i17 & 4) == 4) {
            a17 = proto.f287586m;
        } else {
            a17 = (i17 & 8) == 8 ? typeTable.a(proto.f287587n) : null;
        }
        kotlin.jvm.internal.o.d(a17);
        return tVar.f17515a.f17492j.a(proto, string, d17, d(a17, true));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f17451c);
        b26.j1 j1Var = this.f17450b;
        if (j1Var == null) {
            str = "";
        } else {
            str = ". Child of " + j1Var.f17451c;
        }
        sb6.append(str);
        return sb6.toString();
    }
}

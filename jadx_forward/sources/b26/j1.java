package b26;

/* loaded from: classes16.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final b26.t f98982a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.j1 f98983b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f98984c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98985d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f98986e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f98987f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f98988g;

    public j1(b26.t c17, b26.j1 j1Var, java.util.List typeParameterProtos, java.lang.String debugName, java.lang.String containerPresentableName) {
        java.util.Map linkedHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameterProtos, "typeParameterProtos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugName, "debugName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerPresentableName, "containerPresentableName");
        this.f98982a = c17;
        this.f98983b = j1Var;
        this.f98984c = debugName;
        this.f98985d = containerPresentableName;
        b26.q qVar = c17.f99048a;
        this.f98986e = ((e26.u) qVar.f99016a).d(new b26.d1(this));
        this.f98987f = ((e26.u) qVar.f99016a).d(new b26.f1(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kz5.q0.f395534d;
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = typeParameterProtos.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i16.s1 s1Var = (i16.s1) it.next();
                linkedHashMap.put(java.lang.Integer.valueOf(s1Var.f369262g), new d26.r0(this.f98982a, s1Var, i17));
                i17++;
            }
        }
        this.f98988g = linkedHashMap;
    }

    public static final java.util.List e(i16.l1 l1Var, b26.j1 j1Var) {
        java.util.List list = l1Var.f369116g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getArgumentList(...)");
        i16.l1 a17 = k16.j.a(l1Var, j1Var.f98982a.f99051d);
        java.util.List e17 = a17 != null ? e(a17, j1Var) : null;
        if (e17 == null) {
            e17 = kz5.p0.f395529d;
        }
        return kz5.n0.t0(list, e17);
    }

    public static final o06.g h(b26.j1 j1Var, i16.l1 l1Var, int i17) {
        n16.b a17 = b26.t0.a(j1Var.f98982a.f99049b, i17);
        java.util.List z17 = q26.h0.z(q26.h0.o(q26.y.d(l1Var, new b26.h1(j1Var)), b26.i1.f98981d));
        int f17 = q26.h0.f(q26.y.d(a17, b26.g1.f98974d));
        while (z17.size() < f17) {
            z17.add(0);
        }
        return j1Var.f98982a.f99048a.f99027l.a(a17, z17);
    }

    public final f26.z0 a(f26.o0 o0Var, f26.o0 o0Var2) {
        l06.o e17 = j26.c.e(o0Var);
        p06.k mo9601xa083c1ee = o0Var.mo9601xa083c1ee();
        f26.o0 f17 = l06.j.f(o0Var);
        java.util.List d17 = l06.j.d(o0Var);
        java.util.List S = kz5.n0.S(l06.j.g(o0Var), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(S, 10));
        java.util.Iterator it = S.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26.l2) it.next()).mo128949xfb85f7b0());
        }
        return l06.j.b(e17, mo9601xa083c1ee, f17, d17, arrayList, null, o0Var2, true).A0(o0Var.x0());
    }

    public final java.util.List b() {
        return kz5.n0.S0(this.f98988g.values());
    }

    public final o06.e2 c(int i17) {
        o06.e2 e2Var = (o06.e2) this.f98988g.get(java.lang.Integer.valueOf(i17));
        if (e2Var != null) {
            return e2Var;
        }
        b26.j1 j1Var = this.f98983b;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
            if (annotations.mo324x7aab3243()) {
                f26.r1.f340747e.getClass();
                b17 = f26.r1.f340748f;
            } else {
                b17 = f26.r1.f340747e.b(kz5.b0.c(new f26.o(annotations)));
            }
            arrayList.add(b17);
        }
        return f26.r1.f340747e.b(kz5.d0.r(arrayList));
    }

    public final f26.o0 g(i16.l1 proto) {
        i16.l1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        if (!((proto.f369115f & 2) == 2)) {
            return d(proto, true);
        }
        b26.t tVar = this.f98982a;
        java.lang.String mo141776x2fec8307 = tVar.f99049b.mo141776x2fec8307(proto.f369118i);
        f26.z0 d17 = d(proto, true);
        k16.k typeTable = tVar.f99051d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = proto.f369115f;
        if ((i17 & 4) == 4) {
            a17 = proto.f369119m;
        } else {
            a17 = (i17 & 8) == 8 ? typeTable.a(proto.f369120n) : null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return tVar.f99048a.f99025j.a(proto, mo141776x2fec8307, d17, d(a17, true));
    }

    /* renamed from: toString */
    public java.lang.String m9686x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f98984c);
        b26.j1 j1Var = this.f98983b;
        if (j1Var == null) {
            str = "";
        } else {
            str = ". Child of " + j1Var.f98984c;
        }
        sb6.append(str);
        return sb6.toString();
    }
}

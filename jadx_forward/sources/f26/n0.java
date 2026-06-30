package f26;

/* loaded from: classes16.dex */
public final class n0 implements f26.c2, i26.h {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f340730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashSet f340731b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340732c;

    public n0(java.util.Collection typesToIntersect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(typesToIntersect);
        this.f340731b = linkedHashSet;
        this.f340732c = linkedHashSet.hashCode();
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return this.f340731b;
    }

    public final f26.z0 b() {
        f26.r1.f340747e.getClass();
        return f26.r0.g(f26.r1.f340748f, this, kz5.p0.f395529d, false, y16.h0.f540474c.a("member scope for intersection type", this.f340731b), new f26.j0(this));
    }

    public final java.lang.String c(yz5.l getProperTypeRelatedToStringify) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return kz5.n0.g0(kz5.n0.F0(this.f340731b, new f26.k0(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new f26.m0(getProperTypeRelatedToStringify), 24, null);
    }

    public f26.n0 d(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        java.util.LinkedHashSet linkedHashSet = this.f340731b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedHashSet, 10));
        java.util.Iterator it = linkedHashSet.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            arrayList.add(((f26.o0) it.next()).y0(kotlinTypeRefiner));
            z17 = true;
        }
        f26.n0 n0Var = null;
        if (z17) {
            f26.o0 o0Var = this.f340730a;
            n0Var = new f26.n0(new f26.n0(arrayList).f340731b, o0Var != null ? o0Var.y0(kotlinTypeRefiner) : null);
        }
        return n0Var == null ? this : n0Var;
    }

    /* renamed from: equals */
    public boolean m128964xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f26.n0) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340731b, ((f26.n0) obj).f340731b);
        }
        return false;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return kz5.p0.f395529d;
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o h17 = ((f26.o0) this.f340731b.iterator().next()).w0().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getBuiltIns(...)");
        return h17;
    }

    /* renamed from: hashCode */
    public int m128965x8cdac1b() {
        return this.f340732c;
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m128966x9616526c() {
        return c(f26.l0.f340722d);
    }

    public n0(java.util.Collection collection, f26.o0 o0Var) {
        this(collection);
        this.f340730a = o0Var;
    }
}

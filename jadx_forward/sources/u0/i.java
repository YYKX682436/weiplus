package u0;

/* loaded from: classes14.dex */
public final class i implements u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f504971d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f504972e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f504973f;

    /* renamed from: g, reason: collision with root package name */
    public n0.j3 f504974g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f504975h;

    public i(int i17, boolean z17) {
        this.f504971d = i17;
        this.f504972e = z17;
    }

    @Override // yz5.r
    public /* bridge */ /* synthetic */ java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return h(obj, obj2, (n0.o) obj3, ((java.lang.Number) obj4).intValue());
    }

    @Override // yz5.v
    public /* bridge */ /* synthetic */ java.lang.Object D(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return d(obj, obj2, obj3, obj4, obj5, obj6, (n0.o) obj7, ((java.lang.Number) obj8).intValue());
    }

    @Override // yz5.t
    public /* bridge */ /* synthetic */ java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return f(obj, obj2, obj3, obj4, (n0.o) obj5, ((java.lang.Number) obj6).intValue());
    }

    @Override // yz5.u
    public /* bridge */ /* synthetic */ java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return e(obj, obj2, obj3, obj4, obj5, (n0.o) obj6, ((java.lang.Number) obj7).intValue());
    }

    @Override // yz5.b
    public /* bridge */ /* synthetic */ java.lang.Object V(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (n0.o) obj9, ((java.lang.Number) obj10).intValue());
    }

    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = i17 | (y0Var.e(this) ? u0.j.a(2, 8) : u0.j.a(1, 8));
        java.lang.Object obj9 = this.f504973f;
        if (obj9 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj9, 10);
        java.lang.Object V = ((yz5.b) obj9).V(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i17);
        }
        return V;
    }

    public java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = i17 | (y0Var.e(this) ? u0.j.a(2, 6) : u0.j.a(1, 6));
        java.lang.Object obj7 = this.f504973f;
        if (obj7 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj7, 8);
        java.lang.Object D = ((yz5.v) obj7).D(obj, obj2, obj3, obj4, obj5, obj6, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.g(this, obj, obj2, obj3, obj4, obj5, obj6, i17);
        }
        return D;
    }

    public java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = i17 | (y0Var.e(this) ? u0.j.a(2, 5) : u0.j.a(1, 5));
        java.lang.Object obj6 = this.f504973f;
        if (obj6 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj6, 7);
        java.lang.Object K = ((yz5.u) obj6).K(obj, obj2, obj3, obj4, obj5, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.f(this, obj, obj2, obj3, obj4, obj5, i17);
        }
        return K;
    }

    public java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = (y0Var.e(this) ? u0.j.a(2, 4) : u0.j.a(1, 4)) | i17;
        java.lang.Object obj5 = this.f504973f;
        if (obj5 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj5, 6);
        java.lang.Object J2 = ((yz5.t) obj5).J(obj, obj2, obj3, obj4, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.e(this, obj, obj2, obj3, obj4, i17);
        }
        return J2;
    }

    public java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = (y0Var.e(this) ? u0.j.a(2, 3) : u0.j.a(1, 3)) | i17;
        java.lang.Object obj4 = this.f504973f;
        if (obj4 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj4, 5);
        java.lang.Object v17 = ((yz5.s) obj4).v(obj, obj2, obj3, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.d(this, obj, obj2, obj3, i17);
        }
        return v17;
    }

    public java.lang.Object h(java.lang.Object obj, java.lang.Object obj2, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = (y0Var.e(this) ? u0.j.a(2, 2) : u0.j.a(1, 2)) | i17;
        java.lang.Object obj3 = this.f504973f;
        if (obj3 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj3, 4);
        java.lang.Object C = ((yz5.r) obj3).C(obj, obj2, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.c(this, obj, obj2, i17);
        }
        return C;
    }

    public java.lang.Object i(java.lang.Object obj, n0.o c17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        int a17 = (y0Var.e(this) ? u0.j.a(2, 1) : u0.j.a(1, 1)) | i17;
        java.lang.Object obj2 = this.f504973f;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj2, 3);
        java.lang.Object mo147xb9724478 = ((yz5.q) obj2).mo147xb9724478(obj, y0Var, java.lang.Integer.valueOf(a17));
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new u0.b(this, obj, i17);
        }
        return mo147xb9724478;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int a17;
        n0.o c17 = (n0.o) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n0.y0 y0Var = (n0.y0) c17;
        y0Var.V(this.f504971d);
        j(y0Var);
        if (y0Var.e(this)) {
            a17 = u0.j.a(2, 0);
        } else {
            a17 = u0.j.a(1, 0);
        }
        int i17 = intValue | a17;
        java.lang.Object obj3 = this.f504973f;
        if (obj3 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj3, 2);
            java.lang.Object mo149xb9724478 = ((yz5.p) obj3).mo149xb9724478(y0Var, java.lang.Integer.valueOf(i17));
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(this, 2);
                ((n0.l3) q17).f415141d = this;
            }
            return mo149xb9724478;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    public final void j(n0.o oVar) {
        n0.y0 y0Var;
        n0.l3 t17;
        if (!this.f504972e || (t17 = (y0Var = (n0.y0) oVar).t()) == null) {
            return;
        }
        y0Var.getClass();
        t17.f415139b |= 1;
        if (u0.j.d(this.f504974g, t17)) {
            this.f504974g = t17;
            return;
        }
        java.util.List list = this.f504975h;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f504975h = arrayList;
            arrayList.add(t17);
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (u0.j.d((n0.j3) arrayList2.get(i17), t17)) {
                arrayList2.set(i17, t17);
                return;
            }
        }
        arrayList2.add(t17);
    }

    public final void k(java.lang.Object block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504973f, block)) {
            return;
        }
        boolean z17 = this.f504973f == null;
        this.f504973f = block;
        if (z17 || !this.f504972e) {
            return;
        }
        n0.j3 j3Var = this.f504974g;
        if (j3Var != null) {
            n0.l3 l3Var = (n0.l3) j3Var;
            n0.j1 j1Var = l3Var.f415138a;
            if (j1Var != null) {
                j1Var.l(l3Var, null);
            }
            this.f504974g = null;
        }
        java.util.List list = this.f504975h;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                n0.l3 l3Var2 = (n0.l3) ((n0.j3) arrayList.get(i17));
                n0.j1 j1Var2 = l3Var2.f415138a;
                if (j1Var2 != null) {
                    j1Var2.l(l3Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // yz5.s
    public /* bridge */ /* synthetic */ java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return g(obj, obj2, obj3, (n0.o) obj4, ((java.lang.Number) obj5).intValue());
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return i(obj, (n0.o) obj2, ((java.lang.Number) obj3).intValue());
    }
}

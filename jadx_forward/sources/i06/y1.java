package i06;

/* loaded from: classes15.dex */
public final class y1 extends i06.k0 implements p3321xbce91901.jvm.p3324x21ffc6bd.k, f06.g, yz5.a, yz5.l, yz5.b, yz5.c, yz5.d, yz5.e, yz5.f, yz5.g, yz5.h, yz5.i, yz5.j, yz5.k, yz5.p, yz5.m, yz5.n, yz5.o, yz5.q, yz5.r, yz5.s, yz5.t, yz5.u, yz5.v, yz5.w {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f368326s = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.y1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: m, reason: collision with root package name */
    public final i06.u1 f368327m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f368328n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f368329o;

    /* renamed from: p, reason: collision with root package name */
    public final i06.c4 f368330p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f368331q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f368332r;

    public y1(i06.u1 u1Var, java.lang.String str, java.lang.String str2, o06.n0 n0Var, java.lang.Object obj) {
        this.f368327m = u1Var;
        this.f368328n = str2;
        this.f368329o = obj;
        this.f368330p = new i06.c4(n0Var, new i06.x1(this, str));
        jz5.i iVar = jz5.i.f384363e;
        this.f368331q = jz5.h.a(iVar, new i06.v1(this));
        this.f368332r = jz5.h.a(iVar, new i06.w1(this));
    }

    public static final j06.j0 p(i06.y1 y1Var, java.lang.reflect.Constructor constructor, o06.n0 descriptor, boolean z17) {
        boolean z18;
        if (!z17) {
            y1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
            o06.f fVar = descriptor instanceof o06.f ? (o06.f) descriptor : null;
            if (fVar != null) {
                r06.j0 j0Var = (r06.j0) fVar;
                if (!o06.f0.e(j0Var.mo9617x61f71b08())) {
                    r06.r rVar = (r06.r) fVar;
                    o06.g D = rVar.D();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "getConstructedClass(...)");
                    if (!r16.m.e(D) && !r16.i.r(rVar.D())) {
                        java.util.List W = j0Var.W();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
                        if (!W.isEmpty()) {
                            java.util.Iterator it = W.iterator();
                            while (it.hasNext()) {
                                f26.o0 mo132802xfb85f7b0 = ((r06.t1) ((o06.l2) it.next())).mo132802xfb85f7b0();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
                                if (w16.b.a(mo132802xfb85f7b0)) {
                                    z18 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z18 = false;
            if (z18) {
                if (y1Var.o()) {
                    return new j06.l(constructor, j06.s0.a(y1Var.f368329o, y1Var.l()));
                }
                return new j06.m(constructor);
            }
        }
        if (y1Var.o()) {
            return new j06.n(constructor, j06.s0.a(y1Var.f368329o, y1Var.l()));
        }
        return new j06.o(constructor);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4);
    }

    @Override // yz5.v
    public java.lang.Object D(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // yz5.b
    public java.lang.Object V(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    /* renamed from: equals */
    public boolean m134416xb2c87fbf(java.lang.Object obj) {
        i06.y1 b17 = i06.o4.b(obj);
        return b17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368327m, b17.f368327m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9624xfb82e301(), b17.mo9624xfb82e301()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368328n, b17.f368328n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368329o, b17.f368329o);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.k
    /* renamed from: getArity */
    public int mo134417x7429f927() {
        return j06.k0.a(i());
    }

    @Override // f06.c
    /* renamed from: getName */
    public java.lang.String mo9624xfb82e301() {
        java.lang.String h17 = ((r06.v) l()).mo132800xfb82e301().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        return h17;
    }

    /* renamed from: hashCode */
    public int m134418x8cdac1b() {
        return (((this.f368327m.hashCode() * 31) + mo9624xfb82e301().hashCode()) * 31) + this.f368328n.hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return (j06.k) this.f368331q.mo141623x754a37bb();
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return mo128633x2e7a5e(new java.lang.Object[0]);
    }

    @Override // f06.g
    /* renamed from: isExternal */
    public boolean mo128652x64310b15() {
        return l().mo123388x64310b15();
    }

    @Override // f06.g
    /* renamed from: isInfix */
    public boolean mo128653x7ae3ddc6() {
        return l().mo150371x7ae3ddc6();
    }

    @Override // f06.g
    /* renamed from: isInline */
    public boolean mo128654xe19a9463() {
        return l().mo123389xe19a9463();
    }

    @Override // f06.g
    /* renamed from: isOperator */
    public boolean mo128655xb2e1cfee() {
        return l().mo150372xb2e1cfee();
    }

    @Override // f06.c
    /* renamed from: isSuspend */
    public boolean mo128642x6f0de7b2() {
        return l().mo123390x6f0de7b2();
    }

    @Override // i06.k0
    public i06.u1 j() {
        return this.f368327m;
    }

    @Override // i06.k0
    public j06.k k() {
        return (j06.k) this.f368332r.mo141623x754a37bb();
    }

    @Override // i06.k0
    public boolean o() {
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368329o, p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad);
    }

    @Override // i06.k0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o06.n0 l() {
        f06.v vVar = f368326s[0];
        java.lang.Object mo152xb9724478 = this.f368330p.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (o06.n0) mo152xb9724478;
    }

    /* renamed from: toString */
    public java.lang.String m134419x9616526c() {
        return i06.j4.f368203a.b(l());
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return mo128633x2e7a5e(obj, obj2, obj3, obj4, obj5);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return mo128633x2e7a5e(obj);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return mo128633x2e7a5e(obj, obj2);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return mo128633x2e7a5e(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y1(i06.u1 r8, o06.n0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "descriptor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r0 = r9
            r06.v r0 = (r06.v) r0
            n16.g r0 = r0.mo132800xfb82e301()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "asString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            i06.k4 r0 = i06.k4.f368219a
            i06.t r0 = r0.c(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.y1.<init>(i06.u1, o06.n0):void");
    }
}

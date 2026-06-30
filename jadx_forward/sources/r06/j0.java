package r06;

/* loaded from: classes16.dex */
public abstract class j0 extends r06.w implements o06.n0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.util.Collection E;
    public volatile yz5.a F;
    public final o06.n0 G;
    public final o06.c H;
    public o06.n0 I;

    /* renamed from: J */
    public java.util.Map f449990J;

    /* renamed from: h */
    public java.util.List f449991h;

    /* renamed from: i */
    public java.util.List f449992i;

    /* renamed from: m */
    public f26.o0 f449993m;

    /* renamed from: n */
    public java.util.List f449994n;

    /* renamed from: o */
    public o06.r1 f449995o;

    /* renamed from: p */
    public o06.r1 f449996p;

    /* renamed from: q */
    public o06.t0 f449997q;

    /* renamed from: r */
    public o06.g0 f449998r;

    /* renamed from: s */
    public boolean f449999s;

    /* renamed from: t */
    public boolean f450000t;

    /* renamed from: u */
    public boolean f450001u;

    /* renamed from: v */
    public boolean f450002v;

    /* renamed from: w */
    public boolean f450003w;

    /* renamed from: x */
    public boolean f450004x;

    /* renamed from: y */
    public boolean f450005y;

    /* renamed from: z */
    public boolean f450006z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o06.m mVar, o06.n0 n0Var, p06.k kVar, n16.g gVar, o06.c cVar, o06.x1 x1Var) {
        super(mVar, kVar, gVar, x1Var);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (gVar == null) {
            G(2);
            throw null;
        }
        if (cVar == null) {
            G(3);
            throw null;
        }
        if (x1Var == null) {
            G(4);
            throw null;
        }
        this.f449998r = o06.f0.f423482i;
        this.f449999s = false;
        this.f450000t = false;
        this.f450001u = false;
        this.f450002v = false;
        this.f450003w = false;
        this.f450004x = false;
        this.f450005y = false;
        this.f450006z = false;
        this.A = false;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = null;
        this.F = null;
        this.I = null;
        this.f449990J = null;
        this.G = n0Var == null ? this : n0Var;
        this.H = cVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i18 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i17) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i17) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new java.lang.IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [r06.s1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o06.l2] */
    public static java.util.List w0(o06.n0 containingDeclaration, java.util.List list, f26.v2 v2Var, boolean z17, boolean z18, boolean[] zArr) {
        if (list == null) {
            G(30);
            throw null;
        }
        if (v2Var == null) {
            G(31);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r47 = (o06.l2) it.next();
            r06.t1 t1Var = (r06.t1) r47;
            f26.o0 mo132802xfb85f7b0 = t1Var.mo132802xfb85f7b0();
            f26.d3 d3Var = f26.d3.f340677g;
            f26.o0 k17 = v2Var.k(mo132802xfb85f7b0, d3Var);
            r06.s1 s1Var = (r06.s1) r47;
            f26.o0 o0Var = s1Var.f450059p;
            f26.o0 k18 = o0Var == null ? null : v2Var.k(o0Var, d3Var);
            if (k17 == null) {
                return null;
            }
            if ((k17 != t1Var.mo132802xfb85f7b0() || o0Var != k18) && zArr != null) {
                zArr[0] = true;
            }
            r06.h0 h0Var = r47 instanceof r06.r1 ? new r06.h0((java.util.List) ((jz5.n) ((r06.r1) r47).f450051r).mo141623x754a37bb()) : null;
            o06.l2 l2Var = z17 ? null : r47;
            int i17 = s1Var.f450055i;
            p06.k annotations = ((p06.b) r47).mo9601xa083c1ee();
            n16.g name = ((r06.v) r47).mo132800xfb82e301();
            boolean s07 = s1Var.s0();
            boolean z19 = s1Var.f450057n;
            boolean z27 = s1Var.f450058o;
            o06.x1 source = z18 ? ((r06.w) r47).mo9602x2fa78b11() : o06.x1.f423537a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            arrayList.add(h0Var == null ? new r06.s1(containingDeclaration, l2Var, i17, annotations, name, k17, s07, z19, z27, k18, source) : new r06.r1(containingDeclaration, l2Var, i17, annotations, name, k17, s07, z19, z27, k18, source, h0Var));
        }
        return arrayList;
    }

    public void A0(boolean z17) {
        this.C = z17;
    }

    public java.lang.Object B(o06.a aVar) {
        java.util.Map map = this.f449990J;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void B0(boolean z17) {
        this.D = z17;
    }

    public void C0(f26.o0 o0Var) {
        if (o0Var != null) {
            this.f449993m = o0Var;
        } else {
            G(11);
            throw null;
        }
    }

    public void M(java.util.Collection collection) {
        if (collection == null) {
            G(17);
            throw null;
        }
        this.E = collection;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).N()) {
                this.A = true;
                return;
            }
        }
    }

    @Override // o06.n0
    public boolean N() {
        return this.A;
    }

    public o06.m0 O() {
        return y0(f26.v2.f340764b);
    }

    @Override // o06.b
    public java.util.List W() {
        java.util.List list = this.f449992i;
        if (list != null) {
            return list;
        }
        G(19);
        throw null;
    }

    @Override // o06.b
    public o06.r1 Z() {
        return this.f449996p;
    }

    @Override // r06.w, r06.v, o06.m
    public o06.n0 a() {
        o06.n0 n0Var = this.G;
        o06.n0 a17 = n0Var == this ? this : n0Var.a();
        if (a17 != null) {
            return a17;
        }
        G(20);
        throw null;
    }

    @Override // o06.b
    public o06.r1 c0() {
        return this.f449995o;
    }

    @Override // o06.r0
    public boolean e0() {
        return this.f450005y;
    }

    @Override // o06.r0
    public o06.t0 f() {
        o06.t0 t0Var = this.f449997q;
        if (t0Var != null) {
            return t0Var;
        }
        G(15);
        throw null;
    }

    @Override // o06.b
    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        return this.f449993m;
    }

    @Override // o06.b
    /* renamed from: getTypeParameters */
    public java.util.List mo132803xb121b9ba() {
        java.util.List list = this.f449991h;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    @Override // o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 g0Var = this.f449998r;
        if (g0Var != null) {
            return g0Var;
        }
        G(16);
        throw null;
    }

    @Override // o06.d, o06.b
    public java.util.Collection i() {
        yz5.a aVar = this.F;
        if (aVar != null) {
            this.E = (java.util.Collection) aVar.mo152xb9724478();
            this.F = null;
        }
        java.util.Collection collection = this.E;
        if (collection == null) {
            collection = java.util.Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        G(14);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return this.D;
    }

    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return this.f450001u;
    }

    @Override // o06.n0
    /* renamed from: isInfix */
    public boolean mo150371x7ae3ddc6() {
        if (this.f450000t) {
            return true;
        }
        java.util.Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).mo150371x7ae3ddc6()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isInline */
    public boolean mo123389xe19a9463() {
        return this.f450002v;
    }

    @Override // o06.n0
    /* renamed from: isOperator */
    public boolean mo150372xb2e1cfee() {
        if (this.f449999s) {
            return true;
        }
        java.util.Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).mo150372xb2e1cfee()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSuspend */
    public boolean mo123390x6f0de7b2() {
        return this.B;
    }

    @Override // o06.d
    public o06.c j() {
        o06.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        G(21);
        throw null;
    }

    @Override // o06.r0
    public boolean l0() {
        return this.f450004x;
    }

    @Override // o06.n0
    public o06.n0 o0() {
        return this.I;
    }

    @Override // o06.b
    public java.util.List p0() {
        java.util.List list = this.f449994n;
        if (list != null) {
            return list;
        }
        G(13);
        throw null;
    }

    public boolean r() {
        return this.f450003w;
    }

    @Override // o06.n0
    public boolean r0() {
        return this.f450006z;
    }

    public o06.n0 s0(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        o06.n0 mo132797x59bc66e = O().f(mVar).n(t0Var).h(g0Var).k(cVar).e(z17).mo132797x59bc66e();
        if (mo132797x59bc66e != null) {
            return mo132797x59bc66e;
        }
        G(26);
        throw null;
    }

    public abstract r06.j0 u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var);

    public o06.n0 v0(r06.i0 i0Var) {
        r06.i1 i1Var;
        o06.r1 r1Var;
        f26.o0 k17;
        if (i0Var == null) {
            G(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        p06.k a17 = i0Var.f449981s != null ? p06.m.a(mo9601xa083c1ee(), i0Var.f449981s) : mo9601xa083c1ee();
        o06.m mVar = i0Var.f449964b;
        o06.n0 n0Var = i0Var.f449967e;
        o06.c cVar = i0Var.f449968f;
        n16.g gVar = i0Var.f449974l;
        o06.x1 mo9602x2fa78b11 = i0Var.f449977o ? ((r06.w) (n0Var != null ? n0Var : a())).mo9602x2fa78b11() : o06.x1.f423537a;
        if (mo9602x2fa78b11 == null) {
            G(27);
            throw null;
        }
        r06.j0 u07 = u0(mVar, n0Var, cVar, gVar, a17, mo9602x2fa78b11);
        java.util.List list = i0Var.f449980r;
        if (list == null) {
            list = mo132803xb121b9ba();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        f26.v2 c17 = f26.z.c(list, i0Var.f449963a, u07, arrayList, zArr);
        if (c17 == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!i0Var.f449970h.isEmpty()) {
            java.util.Iterator it = i0Var.f449970h.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r06.g gVar2 = (r06.g) ((o06.r1) it.next());
                f26.o0 k18 = c17.k(gVar2.mo132802xfb85f7b0(), f26.d3.f340677g);
                if (k18 == null) {
                    return null;
                }
                int i18 = i17 + 1;
                arrayList2.add(r16.h.b(u07, k18, ((z16.f) gVar2.mo150378x754a37bb()).a(), gVar2.mo9601xa083c1ee(), i17));
                zArr[0] = zArr[0] | (k18 != gVar2.mo132802xfb85f7b0());
                i17 = i18;
            }
        }
        o06.r1 r1Var2 = i0Var.f449971i;
        if (r1Var2 != null) {
            f26.o0 k19 = c17.k(((r06.g) r1Var2).mo132802xfb85f7b0(), f26.d3.f340677g);
            if (k19 == null) {
                return null;
            }
            r06.i1 i1Var2 = new r06.i1(u07, new z16.d(u07, k19, i0Var.f449971i.mo150378x754a37bb()), ((p06.b) i0Var.f449971i).mo9601xa083c1ee());
            zArr[0] = (k19 != ((r06.g) i0Var.f449971i).mo132802xfb85f7b0()) | zArr[0];
            i1Var = i1Var2;
        } else {
            i1Var = null;
        }
        o06.r1 r1Var3 = i0Var.f449972j;
        if (r1Var3 != null) {
            o06.r1 d17 = ((r06.g) r1Var3).d(c17);
            if (d17 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (d17 != i0Var.f449972j);
            r1Var = d17;
        } else {
            r1Var = null;
        }
        java.util.List w07 = w0(u07, i0Var.f449969g, c17, i0Var.f449978p, i0Var.f449977o, zArr);
        if (w07 == null || (k17 = c17.k(i0Var.f449973k, f26.d3.f340678h)) == null) {
            return null;
        }
        boolean z17 = zArr[0] | (k17 != i0Var.f449973k);
        zArr[0] = z17;
        if (!z17 && i0Var.f449985w) {
            return this;
        }
        u07.x0(i1Var, r1Var, arrayList2, arrayList, w07, k17, i0Var.f449965c, i0Var.f449966d);
        u07.f449999s = this.f449999s;
        u07.f450000t = this.f450000t;
        u07.f450001u = this.f450001u;
        u07.f450002v = this.f450002v;
        u07.f450003w = this.f450003w;
        u07.B = this.B;
        u07.f450004x = this.f450004x;
        u07.f450005y = this.f450005y;
        u07.A0(this.C);
        u07.f450006z = i0Var.f449979q;
        u07.A = i0Var.f449982t;
        java.lang.Boolean bool = i0Var.f449984v;
        u07.B0(bool != null ? bool.booleanValue() : this.D);
        if (!i0Var.f449983u.isEmpty() || this.f449990J != null) {
            java.util.Map map = i0Var.f449983u;
            java.util.Map map2 = this.f449990J;
            if (map2 != null) {
                for (java.util.Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                u07.f449990J = java.util.Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                u07.f449990J = map;
            }
        }
        if (i0Var.f449976n || this.I != null) {
            o06.n0 n0Var2 = this.I;
            if (n0Var2 == null) {
                n0Var2 = this;
            }
            u07.I = n0Var2.d(c17);
        }
        if (i0Var.f449975m && !a().i().isEmpty()) {
            if (i0Var.f449963a.e()) {
                yz5.a aVar = this.F;
                if (aVar != null) {
                    u07.F = aVar;
                } else {
                    u07.M(i());
                }
            } else {
                u07.F = new r06.g0(this, c17);
            }
        }
        return u07;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.l(this, obj);
    }

    public r06.j0 x0(o06.r1 r1Var, o06.r1 r1Var2, java.util.List list, java.util.List list2, java.util.List list3, f26.o0 o0Var, o06.t0 t0Var, o06.g0 g0Var) {
        if (list == null) {
            G(5);
            throw null;
        }
        if (list2 == null) {
            G(6);
            throw null;
        }
        if (list3 == null) {
            G(7);
            throw null;
        }
        if (g0Var == null) {
            G(8);
            throw null;
        }
        this.f449991h = kz5.n0.S0(list2);
        this.f449992i = kz5.n0.S0(list3);
        this.f449993m = o0Var;
        this.f449997q = t0Var;
        this.f449998r = g0Var;
        this.f449995o = r1Var;
        this.f449996p = r1Var2;
        this.f449994n = list;
        for (int i17 = 0; i17 < list2.size(); i17++) {
            o06.e2 e2Var = (o06.e2) list2.get(i17);
            if (e2Var.mo150355x7498cf1c() != i17) {
                throw new java.lang.IllegalStateException(e2Var + " index is " + e2Var.mo150355x7498cf1c() + " but position is " + i17);
            }
        }
        for (int i18 = 0; i18 < list3.size(); i18++) {
            o06.l2 l2Var = (o06.l2) list3.get(i18);
            if (((r06.s1) l2Var).f450055i != i18 + 0) {
                throw new java.lang.IllegalStateException(l2Var + "index is " + ((r06.s1) l2Var).f450055i + " but position is " + i18);
            }
        }
        return this;
    }

    public r06.i0 y0(f26.v2 v2Var) {
        if (v2Var != null) {
            return new r06.i0(this, v2Var.g(), e(), f(), mo9617x61f71b08(), j(), W(), p0(), this.f449995o, mo132801x3df4e080(), null);
        }
        G(24);
        throw null;
    }

    public void z0(o06.a aVar, java.lang.Object obj) {
        if (this.f449990J == null) {
            this.f449990J = new java.util.LinkedHashMap();
        }
        this.f449990J.put(aVar, obj);
    }

    @Override // o06.a2
    public o06.n0 d(f26.v2 v2Var) {
        if (v2Var != null) {
            if (v2Var.h()) {
                return this;
            }
            r06.i0 y07 = y0(v2Var);
            y07.f449967e = a();
            y07.f449977o = true;
            y07.f449985w = true;
            return y07.mo132797x59bc66e();
        }
        G(22);
        throw null;
    }
}

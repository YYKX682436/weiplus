package d26;

/* loaded from: classes16.dex */
public final class x extends r06.e implements o06.m {
    public final e26.y A;
    public final b26.v0 B;
    public final p06.k C;

    /* renamed from: h, reason: collision with root package name */
    public final i16.o f307586h;

    /* renamed from: i, reason: collision with root package name */
    public final k16.a f307587i;

    /* renamed from: m, reason: collision with root package name */
    public final o06.x1 f307588m;

    /* renamed from: n, reason: collision with root package name */
    public final n16.b f307589n;

    /* renamed from: o, reason: collision with root package name */
    public final o06.t0 f307590o;

    /* renamed from: p, reason: collision with root package name */
    public final o06.g0 f307591p;

    /* renamed from: q, reason: collision with root package name */
    public final o06.h f307592q;

    /* renamed from: r, reason: collision with root package name */
    public final b26.t f307593r;

    /* renamed from: s, reason: collision with root package name */
    public final y16.t f307594s;

    /* renamed from: t, reason: collision with root package name */
    public final d26.j f307595t;

    /* renamed from: u, reason: collision with root package name */
    public final o06.u1 f307596u;

    /* renamed from: v, reason: collision with root package name */
    public final d26.n f307597v;

    /* renamed from: w, reason: collision with root package name */
    public final o06.m f307598w;

    /* renamed from: x, reason: collision with root package name */
    public final e26.y f307599x;

    /* renamed from: y, reason: collision with root package name */
    public final e26.x f307600y;

    /* renamed from: z, reason: collision with root package name */
    public final e26.x f307601z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b26.t outerContext, i16.o classProto, k16.g nameResolver, k16.a metadataVersion, o06.x1 sourceElement) {
        super(outerContext.f99048a.f99016a, b26.t0.a(nameResolver, classProto.f369176h).j());
        o06.h hVar;
        y16.t tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerContext, "outerContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classProto, "classProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceElement, "sourceElement");
        this.f307586h = classProto;
        this.f307587i = metadataVersion;
        this.f307588m = sourceElement;
        this.f307589n = b26.t0.a(nameResolver, classProto.f369176h);
        b26.z0 z0Var = b26.z0.f99082a;
        this.f307590o = z0Var.a((i16.l0) k16.f.f384970e.c(classProto.f369175g));
        this.f307591p = b26.b1.a(z0Var, (i16.h2) k16.f.f384969d.c(classProto.f369175g));
        i16.n nVar = (i16.n) k16.f.f384971f.c(classProto.f369175g);
        switch (nVar == null ? -1 : b26.y0.f99080b[nVar.ordinal()]) {
            case 1:
                hVar = o06.h.f423493d;
                break;
            case 2:
                hVar = o06.h.f423494e;
                break;
            case 3:
                hVar = o06.h.f423495f;
                break;
            case 4:
                hVar = o06.h.f423496g;
                break;
            case 5:
                hVar = o06.h.f423497h;
                break;
            case 6:
            case 7:
                hVar = o06.h.f423498i;
                break;
            default:
                hVar = o06.h.f423493d;
                break;
        }
        this.f307592q = hVar;
        java.util.List list = classProto.f369178m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getTypeParameterList(...)");
        i16.v1 v1Var = classProto.K;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v1Var, "getTypeTable(...)");
        k16.k kVar = new k16.k(v1Var);
        k16.l lVar = k16.m.f384995a;
        i16.g2 g2Var = classProto.M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g2Var, "getVersionRequirementTable(...)");
        b26.t a17 = outerContext.a(this, list, nameResolver, kVar, lVar.a(g2Var), metadataVersion);
        this.f307593r = a17;
        o06.h hVar2 = o06.h.f423495f;
        b26.q qVar = a17.f99048a;
        if (hVar == hVar2) {
            java.lang.Boolean c17 = k16.f.f384978m.c(classProto.f369175g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
            tVar = new y16.z(qVar.f99016a, this, c17.booleanValue() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f99034s.a(), java.lang.Boolean.TRUE));
        } else {
            tVar = y16.r.f540506b;
        }
        this.f307594s = tVar;
        this.f307595t = new d26.j(this);
        this.f307596u = o06.u1.f423526e.a(this, qVar.f99016a, ((g26.v) qVar.f99032q).f349548c, new d26.t(this));
        this.f307597v = hVar == hVar2 ? new d26.n(this) : null;
        o06.m mVar = outerContext.f99050c;
        this.f307598w = mVar;
        this.f307599x = ((e26.u) qVar.f99016a).e(new d26.u(this));
        this.f307600y = ((e26.u) qVar.f99016a).b(new d26.s(this));
        ((e26.u) qVar.f99016a).e(new d26.p(this));
        this.f307601z = ((e26.u) qVar.f99016a).b(new d26.v(this));
        this.A = ((e26.u) qVar.f99016a).e(new d26.w(this));
        k16.g gVar = a17.f99049b;
        k16.k kVar2 = a17.f99051d;
        d26.x xVar = mVar instanceof d26.x ? (d26.x) mVar : null;
        this.B = new b26.v0(classProto, gVar, kVar2, sourceElement, xVar != null ? xVar.B : null);
        this.C = !k16.f.f384968c.c(classProto.f369175g).booleanValue() ? p06.i.f432298a : new d26.s0(qVar.f99016a, new d26.o(this));
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        o06.u1 u1Var = this.f307596u;
        u1Var.getClass();
        v16.f.j(u1Var.f423528a);
        return (y16.s) e26.b0.a(u1Var.f423531d, u1Var, o06.u1.f423527f[0]);
    }

    @Override // o06.g
    public java.util.Collection S() {
        return (java.util.Collection) ((e26.o) this.f307600y).mo152xb9724478();
    }

    @Override // o06.g
    public java.util.Collection T() {
        return (java.util.Collection) ((e26.o) this.f307601z).mo152xb9724478();
    }

    @Override // o06.g
    public o06.j2 d0() {
        return (o06.j2) this.A.mo152xb9724478();
    }

    @Override // o06.m
    public o06.m e() {
        return this.f307598w;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return this.f307590o;
    }

    @Override // r06.e, o06.g
    public java.util.List f0() {
        b26.t tVar = this.f307593r;
        k16.k typeTable = tVar.f99051d;
        i16.o oVar = this.f307586h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        java.util.List list = oVar.f369184s;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            java.util.List<java.lang.Integer> list2 = oVar.f369185t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getContextReceiverTypeIdList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (java.lang.Integer num : list2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list = arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f26.o0 g17 = tVar.f99055h.g((i16.l1) it.next());
            o06.r1 R = R();
            z16.b bVar = new z16.b(this, g17, null, null);
            int i17 = p06.k.Z0;
            arrayList2.add(new r06.i1(R, bVar, p06.i.f432298a));
        }
        return arrayList2;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f307595t;
    }

    @Override // o06.g
    public boolean g0() {
        return k16.f.f384971f.c(this.f307586h.f369175g) == i16.n.COMPANION_OBJECT;
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        return this.C;
    }

    @Override // o06.p
    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        return this.f307588m;
    }

    @Override // o06.g, o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        return this.f307591p;
    }

    @Override // o06.g
    public boolean h0() {
        java.lang.Boolean c17 = k16.f.f384977l.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        java.lang.Boolean c17 = k16.f.f384974i.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g
    /* renamed from: isInline */
    public boolean mo9618xe19a9463() {
        int i17;
        java.lang.Boolean c17 = k16.f.f384976k.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        if (!c17.booleanValue()) {
            return false;
        }
        k16.a aVar = this.f307587i;
        int i18 = aVar.f384958b;
        return i18 < 1 || (i18 <= 1 && ((i17 = aVar.f384959c) < 4 || (i17 <= 4 && aVar.f384960d <= 1)));
    }

    @Override // o06.g
    public o06.h j() {
        return this.f307592q;
    }

    @Override // o06.g
    public boolean k0() {
        java.lang.Boolean c17 = k16.f.f384976k.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue() && this.f307587i.a(1, 4, 2);
    }

    @Override // o06.r0
    public boolean l0() {
        java.lang.Boolean c17 = k16.f.f384975j.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        return this.f307593r.f99055h.b();
    }

    @Override // o06.g
    public y16.s m0() {
        return this.f307594s;
    }

    @Override // o06.k
    public boolean p() {
        java.lang.Boolean c17 = k16.f.f384972g.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g
    public o06.f s() {
        return (o06.f) this.f307599x.mo152xb9724478();
    }

    @Override // o06.g
    public boolean t0() {
        java.lang.Boolean c17 = k16.f.f384973h.c(this.f307586h.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    /* renamed from: toString */
    public java.lang.String m123395x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deserialized ");
        sb6.append(l0() ? "expect " : "");
        sb6.append("class ");
        sb6.append(mo132800xfb82e301());
        return sb6.toString();
    }

    public final d26.h u0() {
        g26.l kotlinTypeRefiner = ((g26.v) this.f307593r.f99048a.f99032q).f349548c;
        o06.u1 u1Var = this.f307596u;
        u1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        v16.f.j(u1Var.f423528a);
        return (d26.h) ((y16.s) e26.b0.a(u1Var.f423531d, u1Var, o06.u1.f423527f[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r2 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f26.z0 v0(n16.g r8) {
        /*
            r7 = this;
            d26.h r0 = r7.u0()
            w06.d r1 = w06.d.f523485m
            java.util.Collection r8 = r0.c(r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L14:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r8.next()
            r5 = r4
            o06.o1 r5 = (o06.o1) r5
            o06.r1 r5 = r5.c0()
            r6 = 1
            if (r5 != 0) goto L2a
            r5 = r6
            goto L2b
        L2a:
            r5 = r1
        L2b:
            if (r5 == 0) goto L14
            if (r2 == 0) goto L30
            goto L35
        L30:
            r3 = r4
            r2 = r6
            goto L14
        L33:
            if (r2 != 0) goto L36
        L35:
            r3 = r0
        L36:
            o06.o1 r3 = (o06.o1) r3
            if (r3 == 0) goto L3e
            f26.o0 r0 = r3.mo132802xfb85f7b0()
        L3e:
            f26.z0 r0 = (f26.z0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.x.v0(n16.g):f26.z0");
    }
}

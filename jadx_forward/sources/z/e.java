package z;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f550163a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f550164b;

    /* renamed from: c, reason: collision with root package name */
    public final z.r f550165c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f550166d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f550167e;

    /* renamed from: f, reason: collision with root package name */
    public final z.i1 f550168f;

    /* renamed from: g, reason: collision with root package name */
    public final z.p1 f550169g;

    /* renamed from: h, reason: collision with root package name */
    public final z.w f550170h;

    /* renamed from: i, reason: collision with root package name */
    public final z.w f550171i;

    /* renamed from: j, reason: collision with root package name */
    public final z.w f550172j;

    /* renamed from: k, reason: collision with root package name */
    public final z.w f550173k;

    public e(java.lang.Object obj, z.w2 typeConverter, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        this.f550163a = typeConverter;
        this.f550164b = obj2;
        this.f550165c = new z.r(typeConverter, obj, null, 0L, 0L, false, 60, null);
        this.f550166d = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f550167e = n0.s4.c(obj, null, 2, null);
        this.f550168f = new z.i1();
        this.f550169g = new z.p1(0.0f, 0.0f, obj2, 3, null);
        z.w wVar = (z.w) ((z.x2) typeConverter).f550406a.mo146xb9724478(obj);
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.e(i17, Float.NEGATIVE_INFINITY);
        }
        this.f550170h = wVar;
        z.w wVar2 = (z.w) ((z.x2) this.f550163a).f550406a.mo146xb9724478(obj);
        int b18 = wVar2.b();
        for (int i18 = 0; i18 < b18; i18++) {
            wVar2.e(i18, Float.POSITIVE_INFINITY);
        }
        this.f550171i = wVar2;
        this.f550172j = wVar;
        this.f550173k = wVar2;
    }

    public static final java.lang.Object a(z.e eVar, java.lang.Object obj) {
        z.w wVar = eVar.f550170h;
        z.w wVar2 = eVar.f550172j;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar2, wVar);
        z.w wVar3 = eVar.f550173k;
        if (b17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar3, eVar.f550171i)) {
            return obj;
        }
        z.x2 x2Var = (z.x2) eVar.f550163a;
        z.w wVar4 = (z.w) x2Var.f550406a.mo146xb9724478(obj);
        int b18 = wVar4.b();
        boolean z17 = false;
        for (int i17 = 0; i17 < b18; i17++) {
            if (wVar4.a(i17) < wVar2.a(i17) || wVar4.a(i17) > wVar3.a(i17)) {
                wVar4.e(i17, e06.p.e(wVar4.a(i17), wVar2.a(i17), wVar3.a(i17)));
                z17 = true;
            }
        }
        return z17 ? x2Var.f550407b.mo146xb9724478(wVar4) : obj;
    }

    public static final void b(z.e eVar) {
        z.r rVar = eVar.f550165c;
        rVar.f550345f.d();
        rVar.f550346g = Long.MIN_VALUE;
        ((n0.q4) eVar.f550166d).mo148714x53d8522f(java.lang.Boolean.FALSE);
    }

    public static java.lang.Object c(z.e eVar, java.lang.Object obj, z.p pVar, java.lang.Object obj2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj3) {
        z.p animationSpec = (i17 & 2) != 0 ? eVar.f550169g : pVar;
        java.lang.Object mo146xb9724478 = (i17 & 4) != 0 ? ((z.x2) eVar.f550163a).f550407b.mo146xb9724478(eVar.f550165c.f550345f) : obj2;
        yz5.l lVar2 = (i17 & 8) != 0 ? null : lVar;
        java.lang.Object d17 = eVar.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        z.w2 typeConverter = eVar.f550163a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        return z.i1.a(eVar.f550168f, null, new z.b(eVar, mo146xb9724478, new z.a2(animationSpec, typeConverter, d17, obj, (z.w) ((z.x2) typeConverter).f550406a.mo146xb9724478(mo146xb9724478)), eVar.f550165c.f550346g, lVar2, null), interfaceC29045xdcb5ca57, 1, null);
    }

    public final java.lang.Object d() {
        return this.f550165c.mo128745x754a37bb();
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.f550166d.mo128745x754a37bb()).booleanValue();
    }

    public final java.lang.Object f(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17 = z.i1.a(this.f550168f, null, new z.c(this, obj, null), interfaceC29045xdcb5ca57, 1, null);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    public /* synthetic */ e(java.lang.Object obj, z.w2 w2Var, java.lang.Object obj2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, w2Var, (i17 & 4) != 0 ? null : obj2);
    }
}

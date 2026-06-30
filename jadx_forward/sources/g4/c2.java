package g4;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349755d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349756e;

    /* renamed from: f, reason: collision with root package name */
    public int f349757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f349758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.a1 f349759h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f349760i;

    /* renamed from: m, reason: collision with root package name */
    public int f349761m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, g4.y2 y2Var, g4.a1 a1Var) {
        super(3, interfaceC29045xdcb5ca57);
        this.f349758g = y2Var;
        this.f349759h = a1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.c2 c2Var = new g4.c2(continuation, this.f349758g, this.f349759h);
        c2Var.f349755d = create;
        c2Var.f349756e = obj2;
        return c2Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        int intValue;
        g4.z2 z2Var;
        java.lang.Object obj2;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j b2Var;
        g4.a1 a1Var = this.f349759h;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349757f;
        g4.y2 y2Var = this.f349758g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f349755d;
                intValue = ((java.lang.Number) this.f349756e).intValue();
                z2Var = y2Var.f350167e;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = z2Var.f350184a;
                this.f349755d = kVar;
                this.f349756e = z2Var;
                this.f349760i = dVar;
                this.f349761m = intValue;
                this.f349757f = 1;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
                java.lang.Object b17 = kVar2.b(null, this);
                obj2 = kVar2;
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return jz5.f0.f384359a;
                }
                intValue = this.f349761m;
                java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f349760i;
                z2Var = (g4.z2) this.f349756e;
                kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f349755d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                obj2 = obj3;
            }
            g4.c3 c3Var = z2Var.f350185b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3Var.f349772k.b(a1Var), g4.x0.f350137b)) {
                b2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.p(new g4.t0[0]);
            } else {
                if (!(c3Var.f349772k.b(a1Var) instanceof g4.v0)) {
                    c3Var.f(a1Var, g4.x0.f350138c);
                }
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
                b2Var = new g4.b2(p3325xe03a0797.p3326xc267989b.p3328x30012e.l.j(y2Var.f350163a, intValue == 0 ? 0 : 1), intValue);
            }
            this.f349755d = null;
            this.f349756e = null;
            this.f349760i = null;
            this.f349757f = 2;
            if (b2Var.a(kVar, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f384359a;
        } finally {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
        }
    }
}

package a0;

/* loaded from: classes14.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81593d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.s2 f81595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.j2 f81596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f81597h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p2.f f81598i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f81599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f81600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81601o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81602p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81603q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81604r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81605s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81606t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(a0.s2 s2Var, a0.j2 j2Var, android.view.View view, p2.f fVar, float f17, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.e5 e5Var4, n0.v2 v2Var, n0.e5 e5Var5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81595f = s2Var;
        this.f81596g = j2Var;
        this.f81597h = view;
        this.f81598i = fVar;
        this.f81599m = f17;
        this.f81600n = i2Var;
        this.f81601o = e5Var;
        this.f81602p = e5Var2;
        this.f81603q = e5Var3;
        this.f81604r = e5Var4;
        this.f81605s = v2Var;
        this.f81606t = e5Var5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a0.a2 a2Var = new a0.a2(this.f81595f, this.f81596g, this.f81597h, this.f81598i, this.f81599m, this.f81600n, this.f81601o, this.f81602p, this.f81603q, this.f81604r, this.f81605s, this.f81606t, interfaceC29045xdcb5ca57);
        a2Var.f81594e = obj;
        return a2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        a0.r2 r2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81593d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f81594e;
            a0.s2 s2Var = this.f81595f;
            a0.j2 j2Var = this.f81596g;
            android.view.View view = this.f81597h;
            p2.f fVar = this.f81598i;
            a0.r2 a17 = s2Var.a(j2Var, view, fVar, this.f81599m);
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
            a0.t2 t2Var = (a0.t2) a17;
            android.widget.Magnifier magnifier = t2Var.f81831a;
            long a18 = p2.r.a(magnifier.getWidth(), magnifier.getHeight());
            yz5.l lVar = (yz5.l) this.f81601o.mo128745x754a37bb();
            if (lVar != null) {
                lVar.mo146xb9724478(new p2.k(fVar.e(p2.r.b(a18))));
            }
            g0Var.f391654d = a18;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(this.f81600n, new a0.y1(t2Var, null)), y0Var);
            try {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j f17 = n0.s4.f(new a0.z1(t2Var, this.f81598i, this.f81602p, this.f81603q, this.f81604r, this.f81605s, this.f81606t, g0Var, this.f81601o));
                this.f81594e = t2Var;
                this.f81593d = 1;
                java.lang.Object a19 = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.b) f17).a(v26.j0.f514548d, this);
                if (a19 != aVar) {
                    a19 = f0Var;
                }
                if (a19 == aVar) {
                    return aVar;
                }
                r2Var = t2Var;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r2Var = t2Var;
                ((a0.t2) r2Var).f81831a.dismiss();
                throw th;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r2Var = (a0.r2) this.f81594e;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                ((a0.t2) r2Var).f81831a.dismiss();
                throw th;
            }
        }
        ((a0.t2) r2Var).f81831a.dismiss();
        return f0Var;
    }
}

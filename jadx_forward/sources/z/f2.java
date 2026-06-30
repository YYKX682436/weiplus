package z;

/* loaded from: classes14.dex */
public final class f2 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.w2 f550185d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f550186e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f550187f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f550188g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f550189h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f550190i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f550191m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f550192n;

    /* renamed from: o, reason: collision with root package name */
    public z.w f550193o;

    /* renamed from: p, reason: collision with root package name */
    public final z.k0 f550194p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550195q;

    public f2(z.l2 l2Var, java.lang.Object obj, z.w initialVelocityVector, z.w2 typeConverter, java.lang.String label) {
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocityVector, "initialVelocityVector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        this.f550195q = l2Var;
        this.f550185d = typeConverter;
        n0.v2 c17 = n0.s4.c(obj, null, 2, null);
        this.f550186e = c17;
        n0.v2 c18 = n0.s4.c(z.q.c(0.0f, 0.0f, null, 7, null), null, 2, null);
        this.f550187f = c18;
        this.f550188g = n0.s4.c(new z.a2((z.k0) ((n0.q4) c18).mo128745x754a37bb(), typeConverter, obj, ((n0.q4) c17).mo128745x754a37bb(), initialVelocityVector), null, 2, null);
        this.f550189h = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f550190i = n0.s4.c(0L, null, 2, null);
        this.f550191m = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f550192n = n0.s4.c(obj, null, 2, null);
        this.f550193o = initialVelocityVector;
        java.lang.Float f17 = (java.lang.Float) z.f4.f550197a.get(typeConverter);
        if (f17 != null) {
            float floatValue = f17.floatValue();
            z.w wVar = (z.w) ((z.x2) typeConverter).f550406a.mo146xb9724478(obj);
            int b17 = wVar.b();
            for (int i17 = 0; i17 < b17; i17++) {
                wVar.e(i17, floatValue);
            }
            obj2 = ((z.x2) this.f550185d).f550407b.mo146xb9724478(wVar);
        } else {
            obj2 = null;
        }
        this.f550194p = z.q.c(0.0f, 0.0f, obj2, 3, null);
    }

    public static void c(z.f2 f2Var, java.lang.Object obj, boolean z17, int i17, java.lang.Object obj2) {
        if ((i17 & 1) != 0) {
            obj = f2Var.mo128745x754a37bb();
        }
        java.lang.Object obj3 = obj;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        ((n0.q4) f2Var.f550188g).mo148714x53d8522f(new z.a2(z17 ? ((z.k0) ((n0.q4) f2Var.f550187f).mo128745x754a37bb()) instanceof z.p1 ? (z.k0) ((n0.q4) f2Var.f550187f).mo128745x754a37bb() : f2Var.f550194p : (z.k0) ((n0.q4) f2Var.f550187f).mo128745x754a37bb(), f2Var.f550185d, obj3, ((n0.q4) f2Var.f550186e).mo128745x754a37bb(), f2Var.f550193o));
        z.l2 l2Var = f2Var.f550195q;
        ((n0.q4) l2Var.f550260g).mo148714x53d8522f(java.lang.Boolean.TRUE);
        if (!l2Var.e()) {
            return;
        }
        java.util.ListIterator listIterator = l2Var.f550261h.listIterator();
        long j17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                ((n0.q4) l2Var.f550260g).mo148714x53d8522f(java.lang.Boolean.FALSE);
                return;
            }
            z.f2 f2Var2 = (z.f2) s0Var.next();
            j17 = java.lang.Math.max(j17, f2Var2.b().f550110h);
            long j18 = l2Var.f550264k;
            ((n0.q4) f2Var2.f550192n).mo148714x53d8522f(f2Var2.b().e(j18));
            f2Var2.f550193o = f2Var2.b().g(j18);
        }
    }

    public final z.a2 b() {
        return (z.a2) this.f550188g.mo128745x754a37bb();
    }

    public final void d(java.lang.Object obj, java.lang.Object obj2, z.k0 animationSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        ((n0.q4) this.f550186e).mo148714x53d8522f(obj2);
        ((n0.q4) this.f550187f).mo148714x53d8522f(animationSpec);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b().f550105c, obj) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b().f550106d, obj2)) {
            return;
        }
        c(this, obj, false, 2, null);
    }

    public final void e(java.lang.Object obj, z.k0 animationSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        n0.v2 v2Var = this.f550186e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((n0.q4) v2Var).mo128745x754a37bb(), obj);
        n0.v2 v2Var2 = this.f550191m;
        if (!b17 || ((java.lang.Boolean) ((n0.q4) v2Var2).mo128745x754a37bb()).booleanValue()) {
            ((n0.q4) v2Var).mo148714x53d8522f(obj);
            ((n0.q4) this.f550187f).mo148714x53d8522f(animationSpec);
            n0.v2 v2Var3 = this.f550189h;
            c(this, null, !((java.lang.Boolean) ((n0.q4) v2Var3).mo128745x754a37bb()).booleanValue(), 1, null);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((n0.q4) v2Var3).mo148714x53d8522f(bool);
            ((n0.q4) this.f550190i).mo148714x53d8522f(java.lang.Long.valueOf(((java.lang.Number) ((n0.q4) this.f550195q.f550258e).mo128745x754a37bb()).longValue()));
            ((n0.q4) v2Var2).mo148714x53d8522f(bool);
        }
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return this.f550192n.mo128745x754a37bb();
    }
}

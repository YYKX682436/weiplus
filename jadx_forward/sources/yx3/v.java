package yx3;

/* loaded from: classes10.dex */
public final class v {
    public int A;
    public int B;
    public boolean C;
    public java.lang.String D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public dk4.a f549474a;

    /* renamed from: b, reason: collision with root package name */
    public vx3.i f549475b;

    /* renamed from: c, reason: collision with root package name */
    public yx3.k f549476c;

    /* renamed from: d, reason: collision with root package name */
    public dk4.a f549477d;

    /* renamed from: e, reason: collision with root package name */
    public vx3.c f549478e;

    /* renamed from: f, reason: collision with root package name */
    public long f549479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f549480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f549481h;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f549484k;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f549486m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f549487n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f549488o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f549489p;

    /* renamed from: q, reason: collision with root package name */
    public ao4.b f549490q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f549491r;

    /* renamed from: s, reason: collision with root package name */
    public long f549492s;

    /* renamed from: t, reason: collision with root package name */
    public long f549493t;

    /* renamed from: u, reason: collision with root package name */
    public long f549494u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f549495v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f549496w;

    /* renamed from: x, reason: collision with root package name */
    public long f549497x;

    /* renamed from: y, reason: collision with root package name */
    public vx3.g f549498y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f549499z;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f549482i = jz5.h.b(yx3.p.f549452d);

    /* renamed from: j, reason: collision with root package name */
    public float f549483j = -1.0f;

    /* renamed from: l, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f549485l = p3325xe03a0797.p3326xc267989b.z0.b();

    static {
        vx3.e[] eVarArr = vx3.e.f522809d;
    }

    public v() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        this.f549487n = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p0Var));
        this.f549489p = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p0Var));
        this.f549495v = true;
        this.f549496w = "";
        this.f549498y = vx3.g.f522812f;
        this.f549499z = "";
        this.D = "";
        vx3.e[] eVarArr = vx3.e.f522809d;
    }

    public static final long a(yx3.v vVar) {
        return ((java.lang.Number) ((jz5.n) vVar.f549482i).mo141623x754a37bb()).longValue();
    }

    public final void b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f549488o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f549488o = null;
        if (this.f549476c != null) {
            if (!mx3.f0.i()) {
                f(false);
            }
            try {
                yx3.k kVar = this.f549476c;
                if (kVar != null) {
                    kVar.k();
                }
                yx3.k kVar2 = this.f549476c;
                if (kVar2 != null) {
                    kVar2.h();
                }
                this.f549476c = null;
                this.f549477d = null;
                this.f549474a = null;
                this.f549478e = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "Player destroyed");
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f549476c = null;
                throw th6;
            }
            this.f549476c = null;
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        try {
            vx3.c cVar = this.f549478e;
            if ((cVar != null ? cVar.f522803a : null) == vx3.d.f522806d) {
                e(true);
            }
            yx3.k kVar = this.f549476c;
            if (kVar != null) {
                kVar.i(this.f549481h);
            }
            yx3.k kVar2 = this.f549476c;
            if (kVar2 != null) {
                kVar2.f();
            }
        } catch (java.lang.Exception unused) {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r2 != null ? r2.f316015s : null) == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(vx3.b r19) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx3.v.d(vx3.b):void");
    }

    public final void e(boolean z17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f549486m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f549486m = null;
        this.f549486m = p3325xe03a0797.p3326xc267989b.l.d(this.f549487n, null, null, new yx3.q(z17, null), 3, null);
    }

    public final void f(boolean z17) {
        int i17;
        int i18;
        if (mx3.f0.i()) {
            return;
        }
        int i19 = z17 ? 0 : fp.h.c(21) ? 3 : 2;
        if (z17 && (i18 = wo.v1.f529356c.f529121J) > -1) {
            i19 = i18;
        } else if (!z17 && (i17 = wo.v1.f529356c.I) > -1) {
            i19 = i17;
        }
        ym1.e eVar = ym1.f.f544667h;
        if (i19 != eVar.b().f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "set AudioManager mode: %s", java.lang.Integer.valueOf(i19));
            xm1.h.y(eVar.b(), i19, null, 2, null);
        }
    }
}

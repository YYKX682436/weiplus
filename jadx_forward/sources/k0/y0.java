package k0;

/* loaded from: classes14.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0.h5 f384508a;

    /* renamed from: d, reason: collision with root package name */
    public j0.c5 f384511d;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q1 f384513f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c4 f384514g;

    /* renamed from: h, reason: collision with root package name */
    public k1.a f384515h;

    /* renamed from: i, reason: collision with root package name */
    public c1.d0 f384516i;

    /* renamed from: k, reason: collision with root package name */
    public long f384518k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f384519l;

    /* renamed from: m, reason: collision with root package name */
    public long f384520m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f384521n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f384522o;

    /* renamed from: p, reason: collision with root package name */
    public g2.e0 f384523p;

    /* renamed from: q, reason: collision with root package name */
    public final j0.l3 f384524q;

    /* renamed from: b, reason: collision with root package name */
    public g2.v f384509b = g2.u.f349281a;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f384510c = k0.s0.f384493d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f384512e = n0.s4.c(new g2.e0((java.lang.String) null, 0, (a2.m1) null, 7, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null), null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f384517j = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);

    public y0(j0.h5 h5Var) {
        this.f384508a = h5Var;
        long j17 = d1.e.f307156b;
        this.f384518k = j17;
        this.f384520m = j17;
        this.f384521n = n0.s4.c(null, null, 2, null);
        this.f384522o = n0.s4.c(null, null, 2, null);
        this.f384523p = new g2.e0((java.lang.String) null, 0L, (a2.m1) null, 7, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
        this.f384524q = new k0.x0(this);
    }

    public static final void a(k0.y0 y0Var, d1.e eVar) {
        ((n0.q4) y0Var.f384522o).mo148714x53d8522f(eVar);
    }

    public static final void b(k0.y0 y0Var, j0.u1 u1Var) {
        ((n0.q4) y0Var.f384521n).mo148714x53d8522f(u1Var);
    }

    public static final void c(k0.y0 y0Var, g2.e0 e0Var, int i17, int i18, boolean z17, k0.v adjustment) {
        long a17;
        j0.d5 d5Var;
        g2.v vVar = y0Var.f384509b;
        long j17 = e0Var.f349227b;
        int i19 = a2.m1.f82315c;
        ((g2.t) vVar).getClass();
        g2.v vVar2 = y0Var.f384509b;
        long j18 = e0Var.f349227b;
        int c17 = a2.m1.c(j18);
        ((g2.t) vVar2).getClass();
        long a18 = a2.n1.a((int) (j17 >> 32), c17);
        j0.c5 c5Var = y0Var.f384511d;
        a2.k1 k1Var = (c5Var == null || (d5Var = c5Var.f377772g) == null) ? null : d5Var.f377798a;
        a2.m1 m1Var = a2.m1.b(a18) ? null : new a2.m1(a18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adjustment, "adjustment");
        if (k1Var != null) {
            a17 = a2.n1.a(i17, i18);
            if (m1Var != null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(adjustment, k0.u.f384496b)) {
                a17 = adjustment.a(k1Var, a17, -1, z17, m1Var);
            }
        } else {
            a17 = a2.n1.a(0, 0);
        }
        ((g2.t) y0Var.f384509b).getClass();
        g2.v vVar3 = y0Var.f384509b;
        int c18 = a2.m1.c(a17);
        ((g2.t) vVar3).getClass();
        long a19 = a2.n1.a((int) (a17 >> 32), c18);
        if (a2.m1.a(a19, j18)) {
            return;
        }
        k1.a aVar = y0Var.f384515h;
        if (aVar != null) {
            ((k1.b) aVar).a(9);
        }
        y0Var.f384510c.mo146xb9724478(y0Var.e(e0Var.f349226a, a19));
        j0.c5 c5Var2 = y0Var.f384511d;
        if (c5Var2 != null) {
            ((n0.q4) c5Var2.f377775j).mo148714x53d8522f(java.lang.Boolean.valueOf(k0.c1.b(y0Var, true)));
        }
        j0.c5 c5Var3 = y0Var.f384511d;
        if (c5Var3 == null) {
            return;
        }
        ((n0.q4) c5Var3.f377776k).mo148714x53d8522f(java.lang.Boolean.valueOf(k0.c1.b(y0Var, false)));
    }

    public final void d(boolean z17) {
        if (a2.m1.b(j().f349227b)) {
            return;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q1 q1Var = this.f384513f;
        if (q1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l) q1Var).b(g2.f0.a(j()));
        }
        if (z17) {
            int e17 = a2.m1.e(j().f349227b);
            this.f384510c.mo146xb9724478(e(j().f349226a, a2.n1.a(e17, e17)));
            m(j0.v1.None);
        }
    }

    public final g2.e0 e(a2.d dVar, long j17) {
        return new g2.e0(dVar, j17, (a2.m1) null, 4, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
    }

    public final void f() {
        if (a2.m1.b(j().f349227b)) {
            return;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q1 q1Var = this.f384513f;
        if (q1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l) q1Var).b(g2.f0.a(j()));
        }
        a2.d a17 = g2.f0.c(j(), j().f349226a.f82214d.length()).a(g2.f0.b(j(), j().f349226a.f82214d.length()));
        int f17 = a2.m1.f(j().f349227b);
        this.f384510c.mo146xb9724478(e(a17, a2.n1.a(f17, f17)));
        m(j0.v1.None);
        j0.h5 h5Var = this.f384508a;
        if (h5Var != null) {
            h5Var.f377857f = true;
        }
    }

    public final void g(d1.e eVar) {
        j0.v1 v1Var;
        int e17;
        if (!a2.m1.b(j().f349227b)) {
            j0.c5 c5Var = this.f384511d;
            j0.d5 d5Var = c5Var != null ? c5Var.f377772g : null;
            if (eVar == null || d5Var == null) {
                e17 = a2.m1.e(j().f349227b);
            } else {
                g2.v vVar = this.f384509b;
                e17 = d5Var.b(eVar.f307160a, true);
                ((g2.t) vVar).getClass();
            }
            this.f384510c.mo146xb9724478(g2.e0.a(j(), null, a2.n1.a(e17, e17), null, 5, null));
        }
        if (eVar != null) {
            if (j().f349226a.f82214d.length() > 0) {
                v1Var = j0.v1.Cursor;
                m(v1Var);
                k();
            }
        }
        v1Var = j0.v1.None;
        m(v1Var);
        k();
    }

    public final void h() {
        c1.d0 d0Var;
        j0.c5 c5Var = this.f384511d;
        boolean z17 = false;
        if (c5Var != null && !c5Var.b()) {
            z17 = true;
        }
        if (z17 && (d0Var = this.f384516i) != null) {
            d0Var.a();
        }
        this.f384523p = j();
        j0.c5 c5Var2 = this.f384511d;
        if (c5Var2 != null) {
            c5Var2.f377774i = true;
        }
        m(j0.v1.Selection);
    }

    public final long i(boolean z17) {
        int c17;
        g2.e0 j17 = j();
        if (z17) {
            long j18 = j17.f349227b;
            int i17 = a2.m1.f82315c;
            c17 = (int) (j18 >> 32);
        } else {
            c17 = a2.m1.c(j17.f349227b);
        }
        j0.c5 c5Var = this.f384511d;
        j0.d5 d5Var = c5Var != null ? c5Var.f377772g : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d5Var);
        ((g2.t) this.f384509b).getClass();
        boolean g17 = a2.m1.g(j().f349227b);
        a2.k1 textLayoutResult = d5Var.f377798a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textLayoutResult, "textLayoutResult");
        return d1.f.a(k0.m1.a(textLayoutResult, c17, z17, g17), textLayoutResult.d(textLayoutResult.f(c17)));
    }

    public final g2.e0 j() {
        return (g2.e0) this.f384512e.mo128745x754a37bb();
    }

    public final void k() {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c4 c4Var = this.f384514g;
        if ((c4Var != null ? ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c1) c4Var).f92063d : null) != p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e4.Shown || c4Var == null) {
            return;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c1 c1Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c1) c4Var;
        c1Var.f92063d = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e4.Hidden;
        android.view.ActionMode actionMode = c1Var.f92061b;
        if (actionMode != null) {
            actionMode.finish();
        }
        c1Var.f92061b = null;
    }

    public final void l() {
        a2.d a17;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q1 q1Var = this.f384513f;
        if (q1Var == null || (a17 = ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l) q1Var).a()) == null) {
            return;
        }
        a2.d a18 = g2.f0.c(j(), j().f349226a.f82214d.length()).a(a17).a(g2.f0.b(j(), j().f349226a.f82214d.length()));
        int f17 = a2.m1.f(j().f349227b) + a17.length();
        this.f384510c.mo146xb9724478(e(a18, a2.n1.a(f17, f17)));
        m(j0.v1.None);
        j0.h5 h5Var = this.f384508a;
        if (h5Var != null) {
            h5Var.f377857f = true;
        }
    }

    public final void m(j0.v1 v1Var) {
        j0.c5 c5Var = this.f384511d;
        if (c5Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v1Var, "<set-?>");
            ((n0.q4) c5Var.f377773h).mo148714x53d8522f(v1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.y0.n():void");
    }
}

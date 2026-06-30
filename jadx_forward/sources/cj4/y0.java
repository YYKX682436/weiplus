package cj4;

/* loaded from: classes11.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f123587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123588f;

    public y0(cj4.i1 i1Var, android.content.Context context, mj4.h hVar) {
        this.f123586d = i1Var;
        this.f123587e = context;
        this.f123588f = hVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        di4.i.f314315a.f(false);
        int itemId = menuItem.getItemId();
        bw5.jn0 jn0Var = bw5.jn0.STATUS_UNKNOWN;
        bi4.o1 o1Var = bi4.o1.f102608a;
        qj4.s sVar = qj4.s.f445491a;
        android.content.Context context = this.f123587e;
        mj4.h hVar = this.f123588f;
        cj4.i1 i1Var = this.f123586d;
        if (itemId == com.p314xaae8f345.mm.R.id.jgy) {
            i1Var.getClass();
            bi4.k1 k1Var = i1Var.f123475d;
            if (hVar != null) {
                new bi4.d1();
                bi4.d1 z17 = i1Var.z(true);
                z17.f436482s = 1;
                z17.f436483t = en1.a.a();
                mj4.k kVar = (mj4.k) hVar;
                z17.E = kVar.l();
                z17.f436489z = bk4.i.a().H();
                z17.L = sVar.f(k1Var.f102600g, i1Var.g()).f110589d;
                o1Var.a(context, z17, null);
                ej4.e0.f334877c.a(kVar.l());
                java.lang.String a17 = en1.a.a();
                long j17 = z17.f436475i;
                bw5.jn0 a18 = bw5.jn0.a(z17.L);
                bw5.jn0 jn0Var2 = a18 == null ? jn0Var : a18;
                java.lang.String str = z17.f436474h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                sVar.u(new qj4.l(a17, true, j17, null, str, jn0Var2, null, 72, null));
            }
            if (bi4.v1.i()) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402().e();
            }
            qj4.s.m(sVar, this.f123587e, 35L, null, this.f123588f, 0L, 0L, 0L, 0L, null, null, k1Var.f102600g, 1012, null);
            return;
        }
        if (itemId != com.p314xaae8f345.mm.R.id.jhb) {
            if (itemId != com.p314xaae8f345.mm.R.id.jgq) {
                if (itemId == com.p314xaae8f345.mm.R.id.f567438ug1) {
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new cj4.x0(hVar, context, null), 2, null);
                    return;
                }
                return;
            }
            if (bi4.v1.i()) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402().e();
            }
            if (hVar != null) {
                mj4.k kVar2 = (mj4.k) hVar;
                ej4.a aVar = new ej4.a(kVar2.l(), 1);
                cj4.i1.s(i1Var, 5967);
                gm0.j1.d().g(aVar);
                i1Var.S = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574894jv4), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574894jv4), false, false, new cj4.t0(aVar, i1Var));
                qj4.s.m(sVar, context, 33L, null, kVar2, 0L, 0L, 0L, 0L, null, null, i1Var.f123475d.f102600g, 1012, null);
                return;
            }
            return;
        }
        if (bi4.v1.i()) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402().e();
        }
        i1Var.getClass();
        new android.os.Bundle();
        bi4.d1 z18 = i1Var.z(false);
        z18.f436475i = sVar.c(i1Var.g(), false, i1Var.R != null);
        z18.L = sVar.f(i1Var.f123475d.f102600g, i1Var.g()).f110589d;
        o1Var.a(context, z18, null);
        qj4.s.l(sVar, 16L, null, null, 0L, null, 0L, 62, null);
        java.lang.String a19 = en1.a.a();
        long j18 = z18.f436475i;
        bw5.jn0 a27 = bw5.jn0.a(z18.L);
        bw5.jn0 jn0Var3 = a27 == null ? jn0Var : a27;
        java.lang.String str2 = z18.f436474h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        sVar.u(new qj4.l(a19, true, j18, null, str2, jn0Var3, null, 72, null));
        qj4.s.m(sVar, this.f123587e, 32L, null, this.f123588f, 0L, 0L, 0L, 0L, null, null, r2.f102600g, 1012, null);
    }
}

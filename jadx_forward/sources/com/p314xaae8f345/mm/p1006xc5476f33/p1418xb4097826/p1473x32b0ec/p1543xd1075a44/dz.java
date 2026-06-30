package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class dz extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199702e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f199703f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f199704g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f199705h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f199706i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f199707m;

    /* renamed from: n, reason: collision with root package name */
    public long f199708n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ry f199709o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f199710p;

    /* renamed from: q, reason: collision with root package name */
    public int f199711q;

    /* renamed from: r, reason: collision with root package name */
    public dk2.xf f199712r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199713s;

    /* renamed from: t, reason: collision with root package name */
    public long f199714t;

    public static final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar) {
        android.content.Context context;
        r45.q63 q63Var;
        if (dzVar.f199714t != 0) {
            return;
        }
        dzVar.f199714t = java.lang.System.currentTimeMillis();
        dk2.xf xfVar = dzVar.f199712r;
        if (xfVar != null) {
            android.view.View view = dzVar.f199702e;
            if (view == null || (context = view.getContext()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context2 = context;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dzVar.f199713s;
            if (lVar != null) {
                mm2.e1 e1Var = (mm2.e1) lVar.P0(mm2.e1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = dzVar.f199713s;
                if (lVar2 != null) {
                    mm2.c1 c1Var = (mm2.c1) lVar2.P0(mm2.c1.class);
                    r45.n52 n52Var = new r45.n52();
                    r45.fr1 fr1Var = c1Var.M2;
                    n52Var.set(0, (fr1Var == null || (q63Var = (r45.q63) fr1Var.m75936x14adae67(7)) == null) ? null : q63Var.m75945x2fec8307(1));
                    n52Var.set(1, java.lang.Integer.valueOf(dzVar.f199711q));
                    r45.xq1 xq1Var = c1Var.C2;
                    n52Var.set(2, xq1Var != null ? xq1Var.m75945x2fec8307(2) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "doPayment " + c1Var.f410413s3 + ' ' + dzVar.f199711q + ' ' + n52Var.m75945x2fec8307(0) + ' ' + n52Var.m75945x2fec8307(2));
                    android.widget.ProgressBar progressBar = dzVar.f199707m;
                    if (!(progressBar != null && progressBar.getVisibility() == 0) && c1Var.f410413s3 < dzVar.f199711q) {
                        dzVar.f199714t = 0L;
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bz(dzVar));
                        return;
                    }
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                    r4Var.h3(context2, true);
                    long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
                    long j17 = e1Var.f410516m;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(n52Var.mo14344x5f01b1f6());
                    kz5.p0 p0Var = kz5.p0.f395529d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar3 = dzVar.f199713s;
                    java.lang.String str = lVar3 != null ? ((mm2.e1) lVar3.P0(mm2.e1.class)).f410526w : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar4 = dzVar.f199713s;
                    dk2.xf.d(xfVar, context2, m75942xfb822ef2, j17, null, 0, 0, null, "", 2, b17, p0Var, null, null, str, lVar4 != null ? ((mm2.e1) lVar4.P0(mm2.e1.class)).f410518o : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sy(context2, n52Var, dzVar), 6144, null);
                }
            }
        }
    }

    public static final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar, boolean z17) {
        android.view.View view = dzVar.f199702e;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = dzVar.f293331d;
            if (y1Var != null) {
                y1Var.r(true);
            }
            dk2.xf xfVar = dzVar.f199712r;
            if (xfVar != null) {
                js4.k a17 = dk2.xf.a(xfVar, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, z17 ? 12 : 11, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yy(dzVar), 4, null);
                if (a17 != null) {
                    ((ns4.s) a17).f421181m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zy(dzVar);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.da9, (android.view.ViewGroup) null, false);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.enx).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ty(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kso);
        if (textView != null) {
            hc2.o.a(textView, true);
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.eyz);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vy(this, context));
        }
        this.f199703f = inflate.findViewById(com.p314xaae8f345.mm.R.id.f1m);
        this.f199705h = inflate.findViewById(com.p314xaae8f345.mm.R.id.f1k);
        this.f199704g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f1o);
        this.f199706i = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.f1l);
        this.f199707m = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.f1n);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f1l).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wy(this));
        this.f199702e = inflate;
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void g() {
        this.f199714t = 0L;
        android.view.View view = this.f199702e;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kso) : null;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.f199711q));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f199708n = currentTimeMillis;
        dk2.xf xfVar = this.f199712r;
        if (xfVar != null) {
            ((dk2.r4) xfVar).T(currentTimeMillis, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cz(this));
        }
    }
}

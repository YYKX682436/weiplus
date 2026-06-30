package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f69870a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69871b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69872c;

    /* renamed from: d, reason: collision with root package name */
    public int f69873d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f69874e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f69875f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f69876g;

    /* renamed from: h, reason: collision with root package name */
    public az0.d f69877h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f69878i;

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f69879j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f69880k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f69881l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f69882m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f69883n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.mj_template.sns.compose.widget.m5 f69884o;

    /* renamed from: p, reason: collision with root package name */
    public final f0.r1 f69885p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f69886q;

    /* renamed from: r, reason: collision with root package name */
    public final int f69887r;

    /* renamed from: s, reason: collision with root package name */
    public final int f69888s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f69889t;

    /* renamed from: u, reason: collision with root package name */
    public float f69890u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f69891v;

    /* renamed from: w, reason: collision with root package name */
    public final float f69892w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f69893x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f69894y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.mj_template.sns.compose.widget.c7 f69895z;

    public c1(kotlinx.coroutines.y0 scope, dz0.g recommendInfoHolder, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(recommendInfoHolder, "recommendInfoHolder");
        this.f69870a = scope;
        this.f69871b = z17;
        this.f69872c = z18;
        this.f69874e = com.tencent.mm.mj_template.sns.compose.widget.x0.f70311d;
        this.f69875f = com.tencent.mm.mj_template.sns.compose.widget.w0.f70293d;
        this.f69876g = new com.tencent.mm.mj_template.sns.compose.widget.y0(null);
        this.f69878i = com.tencent.mm.mj_template.sns.compose.widget.v0.f70271d;
        this.f69879j = n0.s4.c(kz5.p0.f313996d, null, 2, null);
        this.f69880k = "";
        this.f69881l = "";
        n0.v2 c17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f69882m = c17;
        this.f69883n = c17;
        this.f69885p = new f0.r1(0, 0);
        this.f69886q = g4.w.a(kotlinx.coroutines.flow.l.i(new g4.x1(new g4.g3(new kz0.g(recommendInfoHolder, z17), null), null, new g4.h3(10, 8, false, 0, 0, 0, 60, null), null).f268608c), scope);
        this.f69887r = 3;
        this.f69888s = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        this.f69890u = 0;
        this.f69892w = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aat)));
    }

    public final void a(com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "doTemplateSelectNonBlocking: " + m5Var.f70077a);
        az0.d dVar = this.f69877h;
        if (dVar != null) {
            az0.d.b(dVar, null, 1, null);
        }
        az0.d dVar2 = this.f69877h;
        if (dVar2 != null) {
            ((dz0.k0) dVar2).f(m5Var, lVar);
        }
    }

    public final float b() {
        if (p2.h.a(this.f69890u, 0)) {
            this.f69890u = (((ym5.x.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x) - (i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aaq)) * ((this.f69887r + 2) - 1))) / 3.0f) * 16.0f) / 9.0f;
        }
        return this.f69890u;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onClosed");
        az0.d dVar = this.f69877h;
        if (dVar != null) {
            az0.d.b(dVar, null, 1, null);
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f69884o;
        com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var != null ? m5Var.f70078b : null;
        if (rVar != null) {
            rVar.b(false);
        }
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(this.f69880k);
        if (a17 != null) {
            com.tencent.mm.mj_template.sns.compose.widget.r rVar2 = a17.f70078b;
            if (!rVar2.a()) {
                rVar2.b(true);
            }
        }
        this.f69874e.invoke();
        this.f69891v = true;
    }
}

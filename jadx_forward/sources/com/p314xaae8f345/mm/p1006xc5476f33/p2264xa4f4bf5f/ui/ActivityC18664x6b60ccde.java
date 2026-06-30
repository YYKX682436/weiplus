package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity */
/* loaded from: classes10.dex */
public final class ActivityC18664x6b60ccde extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255211d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xf(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255212e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.wf(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f255213f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ag(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f255214g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uf(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f255215h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.vf(this));

    /* renamed from: i, reason: collision with root package name */
    public al5.a0 f255216i;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571097d00;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        al5.a0 a0Var;
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.yf(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        if (byteArrayExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusPreviewFinderActivity", "finderObj bytes == null");
            finish();
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var).getClass();
        al5.a0 a0Var2 = null;
        ya2.b2 h17 = m76760x76845fea != null ? ya2.d.h(m76760x76845fea, null, false, 3, null) : null;
        java.lang.String m176700xe5e0d2a0 = h17 != null ? h17.m176700xe5e0d2a0() : null;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255212e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        zy2.v8.c(lVar, (android.widget.ImageView) mo141623x754a37bb, m176700xe5e0d2a0 == null ? "" : m176700xe5e0d2a0, null, 4, null);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f255213f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setText(h17 != null ? h17.w0() : "");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ai(h17);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f255215h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        zy2.tb.a(m1Var, (android.widget.ImageView) mo141623x754a37bb3, Ai, 0, 4, null);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f255214g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.Button) mo141623x754a37bb4).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zf(this));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        pj4.j0 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.f(c19792x256d2725);
        pj4.t tVar = new pj4.t();
        tVar.f436821d = 0;
        tVar.f436822e = 4;
        tVar.f436824g = c01.id.e();
        bi4.r0 a17 = sj4.z0.f490441a.a(f17.f436672d);
        if (a17 != null) {
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) this.f255211d).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            a0Var2 = a17.A1("finder@inner", (android.widget.FrameLayout) mo141623x754a37bb5, f17, tVar);
        }
        this.f255216i = a0Var2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        if ((mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) && (a0Var = this.f255216i) != null) {
            a0Var.J0((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo55332x76847179);
        }
        al5.a0 a0Var3 = this.f255216i;
        if (a0Var3 == null || a0Var3.f87395d) {
            return;
        }
        a0Var3.j();
        a0Var3.h();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        al5.a0 a0Var = this.f255216i;
        if (a0Var == null || !a0Var.f87395d) {
            return;
        }
        a0Var.i();
        a0Var.g();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        al5.a0 a0Var = this.f255216i;
        if (a0Var == null || a0Var.f87395d) {
            return;
        }
        a0Var.j();
        a0Var.h();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI */
/* loaded from: classes7.dex */
public final class ActivityC16457xffd292c extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f229660g = kz5.c0.i(new vd3.f(), new vd3.d(), new lq0.d());

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f229661d;

    /* renamed from: e, reason: collision with root package name */
    public iq0.c f229662e;

    /* renamed from: f, reason: collision with root package name */
    public jq0.b f229663f;

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c) {
        activityC16457xffd292c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "stop");
        iq0.c cVar = activityC16457xffd292c.f229662e;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
        }
        jq0.b bVar = activityC16457xffd292c.f229663f;
        if (bVar != null) {
            hq0.b0 b0Var = bVar.f382579a;
            if (b0Var != null) {
                b0Var.mo133869x88fbd074();
            }
            hq0.b0 b0Var2 = bVar.f382579a;
            if (b0Var2 != null) {
                b0Var2.mo123041x5cd39ffa();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.doh;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicSclCommonStarterDemoUI");
        mo54448x9c8c0d33(new ke3.g(this));
        this.f229661d = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.r5k);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ngb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new ke3.a(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.j2h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.Button) findViewById2).setOnClickListener(new ke3.b(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rdq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.Button) findViewById3).setOnClickListener(new ke3.c(this));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nja);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new ke3.d(this));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.cki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        ((android.widget.Button) findViewById5).setOnClickListener(new ke3.e(this));
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.r8o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        ((android.widget.Button) findViewById6).setOnClickListener(new ke3.f(this));
    }
}

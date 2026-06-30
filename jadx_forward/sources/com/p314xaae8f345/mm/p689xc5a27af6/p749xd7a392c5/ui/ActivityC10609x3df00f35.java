package com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/forward/ui/PreviewProfileUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "q50/k", "feature-forward_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.forward.ui.PreviewProfileUI */
/* loaded from: classes.dex */
public final class ActivityC10609x3df00f35 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elw;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ul5.k m78511x9f88d943;
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(this);
        if (a17 != null && (m78511x9f88d943 = a17.m78511x9f88d943()) != null) {
            m78511x9f88d943.mo82166x35ae8153(mo78508x85b50c3c());
        }
        mo78578x8b18f126(mo78508x85b50c3c());
        mo54448x9c8c0d33(new q50.l(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = getIntent().getStringExtra("Chat_User");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) h0Var.f391656d, true);
        rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String d17 = n17.d1();
        ((c01.w1) eVar).getClass();
        mo54450xbf7c1df6(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(n17) + mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n79, java.lang.Integer.valueOf(c01.v1.o(d17))));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv1.e eVar2 = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String str = (java.lang.String) h0Var.f391656d;
        ((c01.w1) eVar2).getClass();
        java.util.List<java.lang.String> m17 = c01.v1.m(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0((java.lang.String) h0Var.f391656d);
        if (m17 == null) {
            return;
        }
        for (java.lang.String str2 : m17) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = (java.lang.String) h0Var.f391656d;
            ((sg3.a) v0Var).getClass();
            arrayList.add(c01.a2.f(str2, str3));
        }
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.bgk);
        gridView.setAdapter((android.widget.ListAdapter) new q50.k(this, m17, arrayList));
        gridView.setSelector(new android.graphics.drawable.ColorDrawable(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e)));
        gridView.setOnItemClickListener(new q50.m(m17, h0Var, z07, this));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/BindGuardianUI;", "Lcom/tencent/mm/ui/MMActivity;", "Luh4/i0;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI */
/* loaded from: classes.dex */
public final class ActivityC18572xa5ae0822 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements uh4.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f254360h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f254361d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f254362e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.x0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f254363f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.g1(this));

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f254364g = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae0822, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) activityC18572xa5ae0822.findViewById(com.p314xaae8f345.mm.R.id.dhj);
        textView.setVisibility(0);
        if (str == null) {
            str = activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        textView.setText(str);
    }

    public final void U6(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b & (-65));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574857jr2));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c01.z1.r());
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f254364g;
        if (z3Var != null) {
            arrayList.add(z3Var.d1());
        }
        intent.putExtra("block_contact", kz5.n0.g0(arrayList, ",", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d1.f254497d, 30, null));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, z17 ? 102 : 101);
    }

    public final void V6() {
        if (this.f254364g == null) {
            android.widget.Button button = (android.widget.Button) ((jz5.n) this.f254361d).mo141623x754a37bb();
            button.setVisibility(0);
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.h1(this));
        } else if (c01.e2.a0()) {
            android.widget.Button button2 = (android.widget.Button) ((jz5.n) this.f254362e).mo141623x754a37bb();
            button2.setVisibility(0);
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.i1(this));
        } else {
            android.widget.Button button3 = (android.widget.Button) ((jz5.n) this.f254363f).mo141623x754a37bb();
            button3.setVisibility(0);
            button3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k1(button3, this));
        }
        if (this.f254364g == null) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.jrb);
            ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.aiu)).setVisibility(8);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o3_)).setVisibility(8);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f254364g;
        objArr[0] = z3Var != null ? z3Var.g2() : null;
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574858jr3, objArr));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.aiu)).setVisibility(0);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gvg);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f254364g;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, z3Var2 != null ? z3Var2.d1() : null, null);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gvj);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f254364g;
        textView2.setText(z3Var3 != null ? z3Var3.g2() : null);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cy9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if ((i17 == 101 || i17 == 102) && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, "", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, null);
            Q.show();
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhj)).setVisibility(8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            int i19 = i17 != 101 ? 1 : 0;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f254364g;
            pq5.g l17 = new vh4.e1(stringExtra, i19, z3Var != null ? z3Var.d1() : null).l();
            l17.f(this);
            l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a1(Q, this, stringExtra, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.b1(this));
        V6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this);
    }

    @Override // uh4.i0
    /* renamed from: onDataChanged */
    public void mo13777xf050804b() {
        this.f254364g = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this);
        super.onDestroy();
    }
}

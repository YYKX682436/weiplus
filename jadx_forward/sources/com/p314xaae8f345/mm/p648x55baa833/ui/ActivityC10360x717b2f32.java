package com.p314xaae8f345.mm.p648x55baa833.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeResultUI */
/* loaded from: classes.dex */
public class ActivityC10360x717b2f32 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f145414o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f145415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145416e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f145417f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f145418g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f145419h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145420i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145421m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145422n;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5.class);
        intent.addFlags(67108864);
        intent.putExtra("finish_self", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void U6(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            return;
        }
        java.lang.String f27 = n17.f2();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f145418g, str, null);
        this.f145419h.setVisibility(0);
        this.f145419h.setText(f27);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569951sr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i6t);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.fa(this));
        this.f145417f = findViewById(com.p314xaae8f345.mm.R.id.otm);
        this.f145418g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.otl);
        this.f145419h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otn);
        this.f145420i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otj);
        this.f145421m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otk);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.h1y);
        this.f145415d = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.ga(this));
        this.f145415d.setVisibility(0);
        java.lang.String str = this.f145422n.f69107x5be1edb3;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) > 0) {
            U6(str);
        } else {
            ((c01.k7) c01.n8.a()).g(str, this.f145416e, 30, new com.p314xaae8f345.mm.p648x55baa833.ui.ia(this, str));
        }
        int w07 = this.f145422n.w0();
        this.f145420i.setVisibility(0);
        this.f145420i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574439i71, java.lang.Integer.valueOf(w07)));
        this.f145415d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6w);
        this.f145421m.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("chatroom");
        this.f145416e = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", stringExtra);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145416e);
        this.f145422n = z07;
        if (z07 == null) {
            T6();
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }
}

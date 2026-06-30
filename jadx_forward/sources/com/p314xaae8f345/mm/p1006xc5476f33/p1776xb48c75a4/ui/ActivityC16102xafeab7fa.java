package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI */
/* loaded from: classes9.dex */
public class ActivityC16102xafeab7fa extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f223867u = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f223868f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f223869g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f223870h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f223871i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f223872m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f223873n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f223874o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f223875p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.CheckBox f223876q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f223877r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f223878s = "";

    /* renamed from: t, reason: collision with root package name */
    public boolean f223879t = false;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16102xafeab7fa.f223793d, "do check payer");
        r73.a aVar = new r73.a();
        aVar.K(activityC16102xafeab7fa);
        activityC16102xafeab7fa.m83099x5406100e(aVar, true);
    }

    public final void W6(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "go to card manager: %s", str);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344.class);
        intent.putExtra("key_card_no", str);
        intent.putExtra("key_scene", 0);
        intent.putExtra("key_is_create", z17);
        intent.putExtra("key_card_type", str2);
        startActivityForResult(intent, 3);
    }

    public final void X6(android.content.Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("key_create_succ", false);
        java.lang.String stringExtra = intent.getStringExtra("key_card_no");
        java.lang.String stringExtra2 = intent.getStringExtra("key_card_type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "create succ: %s", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            W6(stringExtra, true, stringExtra2);
            if (this.f223879t) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24522, 1, 2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223872m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566805h44);
        this.f223870h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.h4d);
        this.f223869g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h4c);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.h4a);
        this.f223871i = button;
        com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4e);
        this.f223873n = textView;
        if (textView != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4i);
        if (textView2 != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView2);
        }
        this.f223875p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h48);
        this.f223876q = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.h47);
        this.f223874o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h49);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566806h45);
        this.f223868f = linearLayout;
        linearLayout.setOnClickListener(new v73.p0(this));
        this.f223871i.setOnClickListener(new v73.q0(this));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f223869g.setImageResource(com.p314xaae8f345.mm.R.raw.f79487x34a774cd);
            this.f223876q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.agk);
        } else {
            this.f223869g.setImageResource(com.p314xaae8f345.mm.R.raw.f79486xedd8267b);
            this.f223876q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.agj);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "get payer list");
            r73.f fVar = new r73.f();
            fVar.K(this);
            m83099x5406100e(fVar, false);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        m83090x14f40144(2725);
        m83090x14f40144(2618);
        m83090x14f40144(2926);
        X6(getIntent());
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "get payer list");
        r73.f fVar = new r73.f();
        fVar.K(this);
        m83099x5406100e(fVar, true);
        mo54450xbf7c1df6("");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2725);
        m83121xf6ff5b27(2618);
        m83121xf6ff5b27(2926);
        if (this.f223879t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24522, 1, 3);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "on new intent");
        X6(intent);
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof r73.f) {
            r73.f fVar = (r73.f) m1Var;
            fVar.O(new v73.r0(this, fVar));
            if (fVar.f295565m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 1L, 1L);
            }
            if (fVar.f295564i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 1L, 1L);
            }
        } else if (m1Var instanceof r73.a) {
            r73.a aVar = (r73.a) m1Var;
            aVar.O(new v73.s0(this, aVar));
            if (aVar.f295565m && aVar.f474696r.f472201f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "do realname guide");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
                u73.h.i(this, bundle, aVar.f474696r.f472201f, true);
            }
        } else if (m1Var instanceof r73.b) {
            r73.b bVar = (r73.b) m1Var;
            bVar.O(new v73.l0(this, bVar));
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.v0.class);
    }
}

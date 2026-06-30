package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI */
/* loaded from: classes12.dex */
public class ActivityC10372xd653ffea extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4, com.p314xaae8f345.mm.ui.p2690x38b72420.n4 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f145504d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f145505e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f145506f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f145507g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0 f145508h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.e5 f145509i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.kd f145510m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145511n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145512o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145513p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashSet f145514q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f145515r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public boolean f145516s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f145517t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f145518u;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        return this.f145504d;
    }

    public android.widget.BaseAdapter T6() {
        return this.f145510m;
    }

    public java.util.HashSet U6() {
        return new java.util.HashSet();
    }

    public java.util.HashSet V6() {
        return new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return null;
    }

    public void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f145512o = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", stringExtra);
        this.f145511n = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f145512o);
        getIntent().getIntExtra("from_scene", 0);
        this.f145513p = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f145516s = getIntent().getBooleanExtra("is_show_owner", true);
        this.f145517t = getIntent().getBooleanExtra("is_mulit_select_mode", false);
        this.f145514q = new java.util.HashSet();
    }

    public boolean X6() {
        return this.f145517t;
    }

    public boolean Y6() {
        return !(this instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d);
    }

    public java.util.List Z6() {
        return this.f145511n.A0();
    }

    public void a7(android.view.View view, int i17, long j17) {
    }

    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        if (V6().contains(str)) {
            return;
        }
        boolean contains = this.f145514q.contains(str);
        java.util.Map map = this.f145515r;
        if (contains) {
            ((java.util.HashMap) map).remove(str);
            this.f145514q.remove(str);
            imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
            linearLayout.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String str2 = null;
        if (view != null) {
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.vcb);
            if (tag instanceof java.lang.String) {
                str2 = (java.lang.String) tag;
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            ((java.util.HashMap) map).put(str, str2);
        }
        this.f145514q.add(str);
        imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
        linearLayout.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.TRUE);
    }

    public boolean c7() {
        return !(this instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.n4
    public void d4(java.lang.String str, int i17, boolean z17) {
        runOnUiThread(new com.p314xaae8f345.mm.p648x55baa833.ui.ad(this, str, i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str = this.f145513p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        mo54450xbf7c1df6(str);
        this.f145504d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        this.f145506f = findViewById(com.p314xaae8f345.mm.R.id.mjj);
        this.f145507g = findViewById(com.p314xaae8f345.mm.R.id.mjl);
        this.f145518u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145511n;
        this.f145510m = new com.p314xaae8f345.mm.p648x55baa833.ui.kd(this, this, a3Var, this.f145512o, a3Var.f69107x5be1edb3);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!(this instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10363x24719672)) {
            hashSet.add(c01.z1.r());
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.e5 e5Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.e5(this, this.f145512o, 0, X6(), hashSet);
        this.f145509i = e5Var;
        e5Var.f288584i = this;
        this.f145504d.setAdapter((android.widget.ListAdapter) T6());
        com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0 c10371xec3c2bd0 = (com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0) findViewById(com.p314xaae8f345.mm.R.id.jft);
        this.f145508h = c10371xec3c2bd0;
        c10371xec3c2bd0.m79298x40d747ee(new com.p314xaae8f345.mm.p648x55baa833.ui.vc(this));
        if (Y6()) {
            this.f145508h.setVisibility(0);
        } else {
            this.f145508h.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.mjh);
        this.f145505e = c22621x7603e017;
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p648x55baa833.ui.xc(this));
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145510m;
        android.view.View view = kdVar.f145825o.f145507g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gm0.j1.e().j(new com.p314xaae8f345.mm.p648x55baa833.ui.dd(kdVar));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.yc(this));
        if (c7()) {
            this.f145504d.setOnItemClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.zc(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectMemberUI", "[onCreate]");
        W6();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f145509i.k();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(sn.c.class);
    }

    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }
}

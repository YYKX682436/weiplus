package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI */
/* loaded from: classes15.dex */
public class ActivityC16724xf2604f0a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int D = 0;
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 f233621e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f233622f;

    /* renamed from: g, reason: collision with root package name */
    public an3.f f233623g;

    /* renamed from: h, reason: collision with root package name */
    public an3.f f233624h;

    /* renamed from: i, reason: collision with root package name */
    public an3.g f233625i;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f233630q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f233631r;

    /* renamed from: t, reason: collision with root package name */
    public int f233633t;

    /* renamed from: v, reason: collision with root package name */
    public i11.e f233635v;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m0 f233638y;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f233620d = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f233626m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f233627n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public boolean f233628o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f233629p = 1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f233632s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f233634u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f233636w = false;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f233637x = null;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f233639z = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);
    public boolean B = false;
    public final i11.c C = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.f0(this);

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b) {
            if (c5672xb6c0812b == null) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.s(this));
            return false;
        }
    }

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a, android.widget.ImageView imageView, java.lang.String str) {
        activityC16724xf2604f0a.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NearbyFriend", "setImgBmp url is empty");
            return;
        }
        imageView.setImageBitmap(null);
        o11.f fVar = new o11.f();
        fVar.f423616g = g83.a.a();
        fVar.f423611b = true;
        fVar.f423628s = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public final void U6() {
        this.f233636w = false;
        this.f233620d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.h69), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.d0(this));
        this.B = false;
        i11.e eVar = this.f233635v;
        if (eVar != null) {
            ((i11.h) eVar).l(this.C, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        }
    }

    public final void V6() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= ((java.util.LinkedList) this.f233626m).size()) {
                break;
            }
            if (!(((r45.b64) ((java.util.LinkedList) this.f233626m).get(i19)).f452089m == 10000)) {
                linkedList.add((r45.b64) ((java.util.LinkedList) this.f233626m).get(i19));
            }
            i19++;
        }
        ((java.util.LinkedList) this.f233626m).clear();
        this.f233626m = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearbyFriend", "insertPoiItemList()");
        boolean z17 = !this.f233626m.isEmpty();
        java.util.HashMap hashMap = (java.util.HashMap) this.f233627n;
        for (java.lang.String str : hashMap.keySet()) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0) hashMap.get(str);
                if (!l0Var.f233708m && ((i17 = l0Var.f233698c) < 1 || l0Var.f233705j < i17)) {
                    if (l0Var.f233706k < l0Var.f233699d) {
                        java.util.List list = this.f233626m;
                        int i27 = l0Var.f233697b;
                        int size = (i27 < 0 || i27 > ((java.util.LinkedList) list).size()) ? ((java.util.LinkedList) this.f233626m).size() : l0Var.f233697b + i18;
                        java.lang.String str2 = l0Var.f233696a;
                        java.lang.String str3 = l0Var.f233702g;
                        java.lang.String str4 = l0Var.f233700e;
                        java.lang.String str5 = l0Var.f233701f;
                        java.lang.String str6 = l0Var.f233704i;
                        an3.c cVar = new an3.c();
                        cVar.f452089m = 10000;
                        cVar.f452083d = str2;
                        cVar.f452102z = str3;
                        cVar.f452088i = str5;
                        cVar.f452084e = str4;
                        cVar.f452085f = str6;
                        ((java.util.LinkedList) list).add(size, cVar);
                        i18++;
                    }
                }
            }
        }
    }

    public final void W6() {
        if (m25.a.c()) {
            android.view.View view = this.f233637x;
            android.view.View view2 = null;
            if (view != null) {
                this.f233622f.removeHeaderView(view);
                this.f233637x = null;
            }
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.c6_, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9z);
            gm0.j1.b().c();
            int f17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f();
            if (f17 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571224a1, f17, java.lang.Integer.valueOf(f17)));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567396jd0);
                com.p314xaae8f345.mm.p2621x8fb0427b.t8 P0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).P0();
                if (P0 != null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, P0.f66514x49f69af2, null);
                }
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.g0(this));
                view2 = inflate;
            }
            this.f233637x = view2;
            if (view2 != null) {
                this.f233622f.addHeaderView(view2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570874c66;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f233622f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.k5q);
        this.f233621e = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0(this, this);
        android.widget.ListView listView = this.f233622f;
        if (this.f233630q == null) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
            this.f233630q = linearLayout;
            linearLayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            ((android.widget.LinearLayout) this.f233630q).setGravity(17);
        }
        this.f233632s = true;
        listView.addHeaderView(this.f233630q);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LBSShowBindPhone");
        if (d17 != null && d17.length() > 0) {
            try {
                this.f233633t = java.lang.Integer.valueOf(d17).intValue();
            } catch (java.lang.Exception unused) {
                this.f233633t = 0;
            }
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str != null && str.length() > 0) {
            this.f233633t = 0;
        }
        if (this.f233633t > 0) {
            this.f233622f.addHeaderView(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16720x4d2f27b4(this));
        }
        this.f233622f.setAdapter((android.widget.ListAdapter) this.f233621e);
        this.f233622f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.h0(this));
        this.f233622f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.i0(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.j0(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.k0(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.w(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2009 && i18 == -1) {
                finish();
                return;
            }
            return;
        }
        if (i18 == -1) {
            this.f233628o = false;
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int P;
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(11);
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h6j);
        gm0.j1.d().a(148, this);
        gm0.j1.d().a(376, this);
        gm0.j1.d().a(1087, this);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f233635v = i11.h.e();
        mo43517x10010bd5();
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6b);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6a);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6_);
        getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8h);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(16386, null), 1);
        this.f233629p = j17;
        if (j17 == 3) {
            m78593xdc70a1e1(0, com.p314xaae8f345.mm.R.raw.f79507xeac913cb);
        } else if (j17 == 4) {
            m78593xdc70a1e1(0, com.p314xaae8f345.mm.R.raw.f79506x511a318a);
        } else {
            m78593xdc70a1e1(0, 0);
            this.f233629p = 1;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f308702t;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            U6();
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var, f0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.c0(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_nearby_ad, "", true), "lbsads", null);
            if (d17 != null && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".lbsads.$count"), 0)) > 0) {
                int i17 = 0;
                while (true) {
                    map = this.f233627n;
                    if (i17 >= P) {
                        break;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".lbsads.lbsad");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0(null);
                    l0Var.f233696a = (java.lang.String) d17.get(sb7 + ".$id");
                    l0Var.f233697b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$pos"), 0);
                    l0Var.f233698c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$close_times"), 0);
                    l0Var.f233699d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$show_times"), Integer.MAX_VALUE);
                    l0Var.f233700e = (java.lang.String) d17.get(sb7 + ".name");
                    l0Var.f233701f = (java.lang.String) d17.get(sb7 + ".desc");
                    l0Var.f233702g = (java.lang.String) d17.get(sb7 + ".icon");
                    l0Var.f233703h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".jump.$type"), 0);
                    l0Var.f233704i = (java.lang.String) d17.get(sb7 + ".jump");
                    ((java.util.HashMap) map).put(l0Var.f233696a, l0Var);
                    i17++;
                }
                java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, null);
                for (java.lang.String str : (m17 != null ? (java.lang.String) m17 : "").split("\\|")) {
                    java.lang.String[] split = str.split(":");
                    if (split.length == 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0) ((java.util.HashMap) map).get(split[0]);
                        if (l0Var2 != null) {
                            l0Var2.f233705j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
                            l0Var2.f233706k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        bb5.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
        gm0.j1.d().q(148, this);
        gm0.j1.d().q(376, this);
        gm0.j1.d().q(1087, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f233620d;
        if (u3Var != null && u3Var.isShowing()) {
            this.f233620d.dismiss();
        }
        i11.e eVar = this.f233635v;
        if (eVar != null) {
            ((i11.h) eVar).m(this.C);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var = this.f233621e;
        if (q0Var != null && (gVar = q0Var.f233733e) != null) {
            gVar.a();
            q0Var.f233733e = null;
        }
        if (((java.util.LinkedList) this.f233626m).size() > 0) {
            java.lang.String str = "";
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var : ((java.util.HashMap) this.f233627n).values()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("|");
                sb6.append(l0Var.f233696a);
                sb6.append(":");
                sb6.append(l0Var.f233705j);
                sb6.append(":");
                int i17 = l0Var.f233706k + 1;
                l0Var.f233706k = i17;
                sb6.append(i17);
                str = sb6.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17431, l0Var.f233696a, java.lang.Integer.valueOf(l0Var.f233707l + 1));
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        i11.e eVar = this.f233635v;
        if (eVar != null) {
            ((i11.h) eVar).m(this.C);
        }
        this.f233639z.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        this.f233621e.notifyDataSetChanged();
        gm0.j1.b().c();
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() == 0) {
            this.f233622f.removeHeaderView(null);
        }
        this.f233639z.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f233620d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f233620d = null;
        }
        if (m1Var.mo808xfb85f7b0() != 148) {
            if (m1Var.mo808xfb85f7b0() == 376) {
                an3.g gVar = (an3.g) m1Var;
                if (((r45.h64) gVar.f90404e.f152243a.f152217a).f457404d != 1) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f233620d;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    this.f233620d = null;
                }
                if (i17 != 0 || i18 != 0 || (str2 = gVar.f90405f) == null) {
                    db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.h6k, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.b0(this));
                    return;
                }
                java.lang.String str4 = gVar.f90406g;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.M1(str4);
                z3Var.X1(str2);
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(z3Var.d1())) {
                    Bi.h0(z3Var);
                }
                gm0.j1.u().c().w(143873, str2);
                gm0.j1.u().c().w(143874, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.k(intent, 1, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f233620d;
        if (u3Var3 != null) {
            u3Var3.dismiss();
            this.f233620d = null;
        }
        an3.f fVar = (an3.f) m1Var;
        int I = fVar.I();
        if (this.f233623g == null && (I == 1 || I == 3 || I == 4)) {
            return;
        }
        if ((I == 1 || I == 3 || I == 4) && this.f233628o) {
            return;
        }
        if (this.f233624h == null && I == 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearbyFriend", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.mo808xfb85f7b0() != 148) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            if (I == 1 || I == 3 || I == 4) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k5s);
                textView.setVisibility(0);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.e(this);
                tm.a b17 = (str == null || str.length() <= 0) ? null : tm.a.b(str);
                if (b17 != null && (str3 = b17.f501932b) != null && str3.length() > 0) {
                    textView.setText(b17.f501932b);
                } else if (i18 == -2001) {
                    textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574151h60));
                } else {
                    textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574154h63));
                }
                this.f233622f.setVisibility(8);
                this.f233623g = null;
            }
            if (fVar.I() == 2) {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h5x, 1).show();
                this.f233624h = null;
                return;
            }
            return;
        }
        if (I == 1 || I == 3 || I == 4) {
            java.util.List H = fVar.H();
            this.f233626m = H;
            if (H == null || ((java.util.LinkedList) H).size() == 0) {
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.k5s);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f233622f.setVisibility(8);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.e(this);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int i19 = 0;
                for (r45.b64 b64Var : this.f233626m) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(b64Var.f452083d)) {
                        linkedList.add(i19, b64Var);
                        i19++;
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b64Var.f452083d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b64Var.f452088i)) {
                        linkedList.add(b64Var);
                    }
                }
                ((java.util.LinkedList) this.f233626m).clear();
                this.f233626m = linkedList;
                if (linkedList.size() == 0) {
                    android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.k5s);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f233622f.setVisibility(8);
                } else {
                    android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.k5s);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    V6();
                    this.f233621e.notifyDataSetChanged();
                    if (this.f233621e.getCount() > 0) {
                        this.f233622f.setSelection(0);
                    }
                    this.f233622f.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.z(this));
                }
            }
            int i27 = this.f233629p;
            if (i27 == 3) {
                m78593xdc70a1e1(0, com.p314xaae8f345.mm.R.raw.f79507xeac913cb);
            } else if (i27 == 4) {
                m78593xdc70a1e1(0, com.p314xaae8f345.mm.R.raw.f79506x511a318a);
            } else {
                m78593xdc70a1e1(0, 0);
                this.f233629p = 1;
            }
            this.f233628o = true;
            this.f233623g = null;
        }
        if (fVar.I() == 2) {
            db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5y), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.a0(this));
            this.f233624h = null;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = fVar.f90402e;
        if (((r45.g64) oVar.f152244b.f152233a).f456454h == 1) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6m);
            int i28 = ((r45.g64) oVar.f152244b.f152233a).f456455i;
            if (this.f233630q != null) {
                android.view.View view = this.f233631r;
                if (view == null) {
                    android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.c6a, null);
                    this.f233631r = inflate;
                    this.f233630q.addView(inflate);
                    this.f233631r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.x(this));
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ((android.widget.TextView) this.f233631r.findViewById(com.p314xaae8f345.mm.R.id.k5y)).setText(string);
                if (i28 != 0) {
                    ((android.widget.TextView) this.f233631r.findViewById(com.p314xaae8f345.mm.R.id.k5x)).setText(java.lang.String.format(getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571218w, i28, java.lang.Integer.valueOf(i28)), new java.lang.Object[0]));
                }
            }
        } else {
            android.view.View view2 = this.f233631r;
            if (view2 != null && this.f233630q != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f233634u = true;
    }
}

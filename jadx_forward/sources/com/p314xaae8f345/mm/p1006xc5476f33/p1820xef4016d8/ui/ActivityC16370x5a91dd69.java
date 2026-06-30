package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI */
/* loaded from: classes9.dex */
public class ActivityC16370x5a91dd69 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public static final /* synthetic */ int I = 0;
    public java.lang.String C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 H;

    /* renamed from: g, reason: collision with root package name */
    public int f227687g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f227688h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f227689i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227690m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f227691n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f227692o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f227693p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f227694q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227695r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f227696s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f227697t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f227698u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 f227699v;

    /* renamed from: w, reason: collision with root package name */
    public int f227700w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f227701x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f227702y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Map f227703z = new java.util.HashMap();
    public boolean A = true;
    public boolean B = false;
    public int D = -1;
    public java.util.List E = new java.util.ArrayList();
    public java.lang.String F = "";
    public java.lang.String G = "";

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69) {
        java.util.List list = activityC16370x5a91dd69.f227701x;
        if (list != null) {
            ((java.util.LinkedList) list).clear();
        }
        java.util.Map map = activityC16370x5a91dd69.f227703z;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        activityC16370x5a91dd69.f227700w = 0;
        java.util.ArrayList arrayList = activityC16370x5a91dd69.f227702y;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void W6() {
        this.B = true;
        int i17 = this.f227700w;
        if (i17 == 0) {
            this.F = "";
        }
        m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6(11, i17, this.f227687g, this.C, "v1.0", this.F));
    }

    public final void X6() {
        this.f227696s.setVisibility(8);
        android.view.View findViewById = this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f227687g == 1) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gly));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227690m, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnn, c01.z1.l()));
            this.f227693p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gns);
            this.f227699v = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a7(mo55332x76847179());
            this.f227696s.setVisibility(0);
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.glw));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227690m, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnb, c01.z1.l()));
            this.f227693p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gnc);
            this.f227699v = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.h6(mo55332x76847179());
            android.view.View findViewById2 = this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2w);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f227688h.setAdapter((android.widget.ListAdapter) this.f227699v);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f227689i, c01.z1.r(), 0.0f);
        android.widget.TextView textView = this.f227695r;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.C;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnd, objArr));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.buq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j6(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m6(this));
        this.f227697t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567328j33);
        this.f227688h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e) findViewById(com.p314xaae8f345.mm.R.id.f567331j36);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buo, (android.view.ViewGroup) null);
        this.f227698u = inflate;
        this.f227688h.addHeaderView(inflate);
        this.f227689i = (android.widget.ImageView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2q);
        this.f227690m = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2t);
        this.f227691n = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2p);
        this.f227692o = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2u);
        this.f227693p = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2v);
        this.f227694q = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2r);
        this.f227695r = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2y);
        this.f227696s = (android.widget.TextView) this.f227698u.findViewById(com.p314xaae8f345.mm.R.id.j2x);
        this.f227688h.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.n6(this));
        this.f227688h.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p6(this));
        this.f227688h.m79055xb7d2c730(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q6(this));
        this.f227689i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.r6(this));
        X6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560893xf));
        m78554x41d7d42(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560882x3));
        this.f227687g = getIntent().getIntExtra("key_type", 2);
        mo43517x10010bd5();
        W6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(this.f227687g == 1 ? 8 : 9), 0, 0, 0, 1);
        gb3.p.f351575a.a(15);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.H;
        if (j0Var != null && j0Var.isShowing()) {
            this.H.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "get record list success");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6 a6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a6) m1Var;
                java.util.LinkedList linkedList = a6Var.f226698h.f227010m;
                this.F = a6Var.f226701n;
                this.G = a6Var.f226702o;
                if (this.f227700w == 0) {
                    this.E = a6Var.f226699i;
                    this.C = a6Var.f226700m;
                    android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567325j30);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j2z);
                    if (((java.util.ArrayList) this.E).size() > 1) {
                        imageView.setVisibility(0);
                        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s6(this));
                    }
                    this.f227695r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnd, this.C));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var = a6Var.f226698h;
                if (n4Var != null) {
                    if (this.f227687g == 1) {
                        this.f227691n.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(n4Var.f227007g / 100.0d));
                        java.lang.String str2 = n4Var.f227006f + "";
                        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnr, str2);
                        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560880x2));
                        int indexOf = string.indexOf(str2);
                        android.text.SpannableString spannableString = new android.text.SpannableString(string);
                        spannableString.setSpan(foregroundColorSpan, indexOf, str2.length() + indexOf, 33);
                        this.f227696s.setText(spannableString);
                    } else {
                        this.f227691n.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(n4Var.f227005e / 100.0d));
                        this.f227692o.setText(n4Var.f227004d + "");
                        this.f227694q.setText(n4Var.f227008h + "");
                    }
                }
                java.util.List list = this.f227701x;
                if (linkedList != null) {
                    for (int i19 = 0; i19 < linkedList.size(); i19++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 o4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4) linkedList.get(i19);
                        ((java.util.LinkedList) list).add((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4) linkedList.get(i19));
                        this.f227702y.add(o4Var.f227042t);
                        java.util.HashMap hashMap = (java.util.HashMap) this.f227703z;
                        if (!hashMap.containsKey(o4Var.f227042t)) {
                            hashMap.put(o4Var.f227042t, 1);
                        }
                    }
                    this.f227700w += linkedList.size();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var2 = a6Var.f226698h;
                    this.A = n4Var2 == null || n4Var2.f227009i == 1;
                    this.B = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 i6Var = this.f227699v;
                    if (list == null) {
                        i6Var.getClass();
                        i6Var.f228550d = new java.util.LinkedList();
                    } else {
                        i6Var.f228550d = list;
                    }
                    i6Var.notifyDataSetChanged();
                }
                if (list == null || ((java.util.LinkedList) list).size() == 0) {
                    this.f227697t.setVisibility(0);
                } else {
                    this.f227697t.setVisibility(8);
                }
                if (this.A) {
                    this.f227688h.g();
                } else {
                    this.f227688h.b();
                }
                return true;
            }
            this.G = null;
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b6) {
            int i27 = this.D;
            this.D = -1;
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 item = this.f227699v.getItem(i27);
                if (item != null) {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.glk, 0).show();
                    this.f227699v.f228550d.remove(item);
                    this.f227699v.notifyDataSetChanged();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyMyRecordUI", "can't found local record");
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.v6.class);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onScreenShot");
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f227702y);
        int i17 = this.f227687g;
        if (i17 == 1) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_record_send_page", linkedList, 0);
        } else if (i17 == 2) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_record_receive_page", linkedList, 0);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI */
/* loaded from: classes8.dex */
public class ActivityC11369x8a612b2b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, android.widget.AdapterView.OnItemClickListener, p61.l3, kv.e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f154600u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f154601d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f154602e;

    /* renamed from: f, reason: collision with root package name */
    public p61.o3 f154603f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154604g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154606i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154607m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154608n;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f154610p;

    /* renamed from: q, reason: collision with root package name */
    public r61.o1 f154611q;

    /* renamed from: t, reason: collision with root package name */
    public int f154614t;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154605h = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f154609o = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f154612r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f154613s = new java.util.HashMap();

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b, p61.u3 u3Var, java.util.ArrayList arrayList) {
        activityC11369x8a612b2b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] success:%s", u3Var);
        if (u3Var == p61.u3.SUCCESS && !activityC11369x8a612b2b.f154609o) {
            activityC11369x8a612b2b.f154611q = new r61.o1(arrayList, activityC11369x8a612b2b.f154614t, activityC11369x8a612b2b.f154613s, activityC11369x8a612b2b.f154607m);
            gm0.j1.d().g(activityC11369x8a612b2b.f154611q);
            return;
        }
        if (u3Var == p61.u3.NO_CONTACT) {
            activityC11369x8a612b2b.V6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "Google Contact is Empty.");
            activityC11369x8a612b2b.W6(true);
            return;
        }
        if (u3Var != p61.u3.ACCESS_DEDY) {
            if (activityC11369x8a612b2b.f154609o) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI unknow error");
            activityC11369x8a612b2b.V6();
            android.content.Intent intent = new android.content.Intent(activityC11369x8a612b2b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC11369x8a612b2b, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11369x8a612b2b.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC11369x8a612b2b, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11369x8a612b2b.finish();
            return;
        }
        activityC11369x8a612b2b.V6();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(activityC11369x8a612b2b)) {
            activityC11369x8a612b2b.W6(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI No Login or network unavaile.");
        android.content.Intent intent2 = new android.content.Intent(activityC11369x8a612b2b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(activityC11369x8a612b2b, arrayList3.toArray(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11369x8a612b2b.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(activityC11369x8a612b2b, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11369x8a612b2b.finish();
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        p61.o3 o3Var = this.f154603f;
        if (o3Var != null) {
            o3Var.notifyDataSetChanged();
        }
    }

    public final void U6(r61.s0 s0Var, r61.s0 s0Var2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(s0Var.f65887x58397040);
        r61.n1 n1Var = new r61.n1(arrayList);
        gm0.j1.d().g(n1Var);
        if (s0Var2 == null) {
            n1Var.f474455g = s0Var.f65889xb2c2ce0c;
            s0Var.f65886xba0f6d59 = 0;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().J0(s0Var);
        } else {
            n1Var.f474455g = s0Var2.f65889xb2c2ce0c;
            s0Var2.f65886xba0f6d59 = 0;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().J0(s0Var2);
        }
        this.f154603f.q();
    }

    public final void V6() {
        android.app.ProgressDialog progressDialog = this.f154610p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f154610p.dismiss();
    }

    public final void W6(boolean z17) {
        this.f154601d.setVisibility(0);
        this.f154601d.setText(!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqw) : z17 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqp) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqo));
    }

    public final void X6() {
        android.app.ProgressDialog progressDialog = this.f154610p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f154610p = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new p61.t3(this));
        }
    }

    public final void Y6() {
        if (this.f154605h) {
            this.f154607m = (java.lang.String) gm0.j1.u().c().l(208901, null);
        } else {
            this.f154607m = (java.lang.String) gm0.j1.u().c().l(208902, null);
            this.f154608n = (java.lang.String) gm0.j1.u().c().l(208904, null);
        }
        if (android.text.TextUtils.isEmpty(this.f154607m) || (!this.f154605h && android.text.TextUtils.isEmpty(this.f154608n))) {
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.class);
            finish();
        } else if (!this.f154605h) {
            X6();
            new p61.w3(this, this.f154608n).execute(new java.lang.Void[0]);
        } else {
            this.f154609o = false;
            X6();
            new p61.v3(this, this, this.f154607m, null).execute(new java.lang.Void[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bi_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fqq);
        mo54448x9c8c0d33(new p61.p3(this));
        this.f154601d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dez);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.gq8);
        this.f154602e = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f154603f);
        this.f154602e.setOnItemClickListener(this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        c9Var.f291857i = new p61.q3(this);
        m78489xd6d59aa8(true, c9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 2005) {
            if (i18 == -1) {
                this.f154605h = intent.getBooleanExtra("gpservices", false);
                Y6();
            } else {
                this.f154605h = intent.getBooleanExtra("gpservices", false);
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(208903, null);
        this.f154606i = str;
        if (android.text.TextUtils.isEmpty(str)) {
            finish();
        }
        this.f154614t = getIntent().getIntExtra("enter_scene", 0);
        p61.o3 o3Var = new p61.o3(this, this.f154606i);
        this.f154603f = o3Var;
        o3Var.f433869q = this;
        mo43517x10010bd5();
        boolean b17 = r61.r0.b(this);
        this.f154605h = b17;
        if (b17) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111);
        } else {
            Y6();
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.u0 Di = m61.k.Di();
        Di.f474496d.A("GoogleFriend", " delete from GoogleFriend");
        l75.a1 a1Var = Di.f474497e;
        a1Var.b(5, a1Var, "");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.u0 Di = m61.k.Di();
        Di.f474496d.A("GoogleFriend", " delete from GoogleFriend");
        l75.a1 a1Var = Di.f474497e;
        a1Var.b(5, a1Var, "");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (this.f154603f != null) {
            r61.s0 s0Var = (r61.s0) this.f154603f.getItem(i17 - this.f154602e.getHeaderViewsCount());
            if (s0Var != null) {
                java.lang.String str = s0Var.f65898xdec927b;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if ((n17 == null || !n17.r2()) && android.text.TextUtils.isEmpty(s0Var.f65893x21f9b213)) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb.class);
                    intent.putExtra("friend_type", 2);
                    intent.putExtra("friend_user_name", str);
                    intent.putExtra("friend_num", s0Var.f65887x58397040);
                    intent.putExtra("friend_nick", s0Var.f65890x5db248a9);
                    intent.putExtra("friend_weixin_nick", s0Var.f65893x21f9b213);
                    intent.putExtra("friend_googleID", s0Var.f65888x9c77cab9);
                    intent.putExtra("friend_googleItemID", s0Var.f65889xb2c2ce0c);
                    intent.putExtra("friend_scene", 58);
                    intent.putExtra("Contact_Scene", 58);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "jumpToProfile", "(Lcom/tencent/mm/plugin/account/friend/model/GoogleFriendInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "jumpToProfile", "(Lcom/tencent/mm/plugin/account/friend/model/GoogleFriendInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_User", str);
                    intent2.putExtra("Contact_Nick", s0Var.f65893x21f9b213);
                    intent2.putExtra("Contact_ShowFMessageList", true);
                    intent2.putExtra("verify_gmail", s0Var.f65887x58397040);
                    intent2.putExtra("profileName", s0Var.f65890x5db248a9);
                    intent2.putExtra("Contact_Source_FMessage", 58);
                    intent2.putExtra("Contact_Scene", 58);
                    if (str != null && str.length() > 0) {
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent2, mo55332x76847179());
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de, this);
        gm0.j1.d().a(489, this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.a(this, android.os.Looper.getMainLooper());
        p61.o3 o3Var = this.f154603f;
        if (o3Var != null) {
            o3Var.q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = android.text.TextUtils.isEmpty(str) ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (i17 == 0 && i18 == 0) {
            if (mo808xfb85f7b0 == 30 || mo808xfb85f7b0 == 137) {
                if (this.f154603f != null) {
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    m61.k.Di().L0(null, 1);
                    this.f154603f.q();
                }
            } else if (mo808xfb85f7b0 == 488) {
                r45.f74 f74Var = (r45.f74) ((r61.o1) m1Var).f474463d.f152244b.f152233a;
                synchronized (this) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "handleListGoogleContactCGIResponse Count:%d", java.lang.Integer.valueOf(f74Var.f455607d));
                    p61.o3 o3Var = this.f154603f;
                    if (o3Var != null) {
                        o3Var.q();
                    }
                }
            } else if (mo808xfb85f7b0 != 489) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
            } else if (this.f154603f != null) {
                r61.n1 n1Var = (r61.n1) m1Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", java.lang.Integer.valueOf(((r45.r04) n1Var.f474452d.f152244b.f152233a).f465932d));
                java.lang.String str2 = n1Var.f474455g;
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().L0(str2, 1);
                this.f154603f.q();
            }
        } else if (mo808xfb85f7b0 == 30 || mo808xfb85f7b0 == 137) {
            if (i18 == -87) {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572486bc5), "");
            } else if ((i18 == -24 || i18 == -101) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                dp.a.m125854x26a183b(this, str, 1).show();
            }
            if (this.f154603f != null) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().L0(null, 2);
                this.f154603f.q();
            }
        } else if (mo808xfb85f7b0 == 488) {
            W6(false);
        } else if (mo808xfb85f7b0 != 489) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
        } else if (this.f154603f != null) {
            r61.n1 n1Var2 = (r61.n1) m1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", java.lang.Integer.valueOf(((r45.r04) n1Var2.f474452d.f152244b.f152233a).f465932d));
            java.lang.String str3 = n1Var2.f474455g;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().L0(str3, 1);
            this.f154603f.q();
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de, this);
        gm0.j1.d().q(489, this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.j(this);
    }
}

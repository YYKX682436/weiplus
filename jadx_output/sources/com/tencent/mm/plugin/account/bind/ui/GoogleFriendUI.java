package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes8.dex */
public class GoogleFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, android.widget.AdapterView.OnItemClickListener, p61.l3, kv.e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f73067u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f73068d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f73069e;

    /* renamed from: f, reason: collision with root package name */
    public p61.o3 f73070f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73071g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73073i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73074m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73075n;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f73077p;

    /* renamed from: q, reason: collision with root package name */
    public r61.o1 f73078q;

    /* renamed from: t, reason: collision with root package name */
    public int f73081t;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73072h = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f73076o = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f73079r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f73080s = new java.util.HashMap();

    public static void T6(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI, p61.u3 u3Var, java.util.ArrayList arrayList) {
        googleFriendUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] success:%s", u3Var);
        if (u3Var == p61.u3.SUCCESS && !googleFriendUI.f73076o) {
            googleFriendUI.f73078q = new r61.o1(arrayList, googleFriendUI.f73081t, googleFriendUI.f73080s, googleFriendUI.f73074m);
            gm0.j1.d().g(googleFriendUI.f73078q);
            return;
        }
        if (u3Var == p61.u3.NO_CONTACT) {
            googleFriendUI.V6();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "Google Contact is Empty.");
            googleFriendUI.W6(true);
            return;
        }
        if (u3Var != p61.u3.ACCESS_DEDY) {
            if (googleFriendUI.f73076o) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI unknow error");
            googleFriendUI.V6();
            android.content.Intent intent = new android.content.Intent(googleFriendUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(googleFriendUI, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            googleFriendUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(googleFriendUI, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            googleFriendUI.finish();
            return;
        }
        googleFriendUI.V6();
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(googleFriendUI)) {
            googleFriendUI.W6(false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI No Login or network unavaile.");
        android.content.Intent intent2 = new android.content.Intent(googleFriendUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(googleFriendUI, arrayList3.toArray(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        googleFriendUI.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(googleFriendUI, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        googleFriendUI.finish();
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        p61.o3 o3Var = this.f73070f;
        if (o3Var != null) {
            o3Var.notifyDataSetChanged();
        }
    }

    public final void U6(r61.s0 s0Var, r61.s0 s0Var2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(s0Var.field_googlegmail);
        r61.n1 n1Var = new r61.n1(arrayList);
        gm0.j1.d().g(n1Var);
        if (s0Var2 == null) {
            n1Var.f392922g = s0Var.field_googleitemid;
            s0Var.field_googlecgistatus = 0;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().J0(s0Var);
        } else {
            n1Var.f392922g = s0Var2.field_googleitemid;
            s0Var2.field_googlecgistatus = 0;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().J0(s0Var2);
        }
        this.f73070f.q();
    }

    public final void V6() {
        android.app.ProgressDialog progressDialog = this.f73077p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f73077p.dismiss();
    }

    public final void W6(boolean z17) {
        this.f73068d.setVisibility(0);
        this.f73068d.setText(!com.tencent.mars.comm.NetStatusUtil.isConnected(this) ? getString(com.tencent.mm.R.string.fqw) : z17 ? getString(com.tencent.mm.R.string.fqp) : getString(com.tencent.mm.R.string.fqo));
    }

    public final void X6() {
        android.app.ProgressDialog progressDialog = this.f73077p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f73077p = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new p61.t3(this));
        }
    }

    public final void Y6() {
        if (this.f73072h) {
            this.f73074m = (java.lang.String) gm0.j1.u().c().l(208901, null);
        } else {
            this.f73074m = (java.lang.String) gm0.j1.u().c().l(208902, null);
            this.f73075n = (java.lang.String) gm0.j1.u().c().l(208904, null);
        }
        if (android.text.TextUtils.isEmpty(this.f73074m) || (!this.f73072h && android.text.TextUtils.isEmpty(this.f73075n))) {
            startActivity(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.class);
            finish();
        } else if (!this.f73072h) {
            X6();
            new p61.w3(this, this.f73075n).execute(new java.lang.Void[0]);
        } else {
            this.f73076o = false;
            X6();
            new p61.v3(this, this, this.f73074m, null).execute(new java.lang.Void[0]);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bi_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.fqq);
        setBackBtn(new p61.p3(this));
        this.f73068d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dez);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gq8);
        this.f73069e = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f73070f);
        this.f73069e.setOnItemClickListener(this);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        c9Var.f210324i = new p61.q3(this);
        addSearchMenu(true, c9Var);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 2005) {
            if (i18 == -1) {
                this.f73072h = intent.getBooleanExtra("gpservices", false);
                Y6();
            } else {
                this.f73072h = intent.getBooleanExtra("gpservices", false);
                finish();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(208903, null);
        this.f73073i = str;
        if (android.text.TextUtils.isEmpty(str)) {
            finish();
        }
        this.f73081t = getIntent().getIntExtra("enter_scene", 0);
        p61.o3 o3Var = new p61.o3(this, this.f73073i);
        this.f73070f = o3Var;
        o3Var.f352336q = this;
        initView();
        boolean b17 = r61.r0.b(this);
        this.f73072h = b17;
        if (b17) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS);
        } else {
            Y6();
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.u0 Di = m61.k.Di();
        Di.f392963d.A("GoogleFriend", " delete from GoogleFriend");
        l75.a1 a1Var = Di.f392964e;
        a1Var.b(5, a1Var, "");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.u0 Di = m61.k.Di();
        Di.f392963d.A("GoogleFriend", " delete from GoogleFriend");
        l75.a1 a1Var = Di.f392964e;
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
        if (this.f73070f != null) {
            r61.s0 s0Var = (r61.s0) this.f73070f.getItem(i17 - this.f73069e.getHeaderViewsCount());
            if (s0Var != null) {
                java.lang.String str = s0Var.field_username;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if ((n17 == null || !n17.r2()) && android.text.TextUtils.isEmpty(s0Var.field_nickname)) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.class);
                    intent.putExtra("friend_type", 2);
                    intent.putExtra("friend_user_name", str);
                    intent.putExtra("friend_num", s0Var.field_googlegmail);
                    intent.putExtra("friend_nick", s0Var.field_googlename);
                    intent.putExtra("friend_weixin_nick", s0Var.field_nickname);
                    intent.putExtra("friend_googleID", s0Var.field_googleid);
                    intent.putExtra("friend_googleItemID", s0Var.field_googleitemid);
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
                    intent2.putExtra("Contact_Nick", s0Var.field_nickname);
                    intent2.putExtra("Contact_ShowFMessageList", true);
                    intent2.putExtra("verify_gmail", s0Var.field_googlegmail);
                    intent2.putExtra("profileName", s0Var.field_googlename);
                    intent2.putExtra("Contact_Source_FMessage", 58);
                    intent2.putExtra("Contact_Scene", 58);
                    if (str != null && str.length() > 0) {
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, getContext());
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, this);
        gm0.j1.d().a(489, this);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.a(this, android.os.Looper.getMainLooper());
        p61.o3 o3Var = this.f73070f;
        if (o3Var != null) {
            o3Var.q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = android.text.TextUtils.isEmpty(str) ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        int type = m1Var.getType();
        if (i17 == 0 && i18 == 0) {
            if (type == 30 || type == 137) {
                if (this.f73070f != null) {
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    m61.k.Di().L0(null, 1);
                    this.f73070f.q();
                }
            } else if (type == 488) {
                r45.f74 f74Var = (r45.f74) ((r61.o1) m1Var).f392930d.f70711b.f70700a;
                synchronized (this) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "handleListGoogleContactCGIResponse Count:%d", java.lang.Integer.valueOf(f74Var.f374074d));
                    p61.o3 o3Var = this.f73070f;
                    if (o3Var != null) {
                        o3Var.q();
                    }
                }
            } else if (type != 489) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
            } else if (this.f73070f != null) {
                r61.n1 n1Var = (r61.n1) m1Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", java.lang.Integer.valueOf(((r45.r04) n1Var.f392919d.f70711b.f70700a).f384399d));
                java.lang.String str2 = n1Var.f392922g;
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().L0(str2, 1);
                this.f73070f.q();
            }
        } else if (type == 30 || type == 137) {
            if (i18 == -87) {
                db5.e1.s(this, getString(com.tencent.mm.R.string.f490953bc5), "");
            } else if ((i18 == -24 || i18 == -101) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                dp.a.makeText(this, str, 1).show();
            }
            if (this.f73070f != null) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                m61.k.Di().L0(null, 2);
                this.f73070f.q();
            }
        } else if (type == 488) {
            W6(false);
        } else if (type != 489) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
        } else if (this.f73070f != null) {
            r61.n1 n1Var2 = (r61.n1) m1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", java.lang.Integer.valueOf(((r45.r04) n1Var2.f392919d.f70711b.f70700a).f384399d));
            java.lang.String str3 = n1Var2.f392922g;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Di().L0(str3, 1);
            this.f73070f.q();
        }
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, this);
        gm0.j1.d().q(489, this);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.j(this);
    }
}

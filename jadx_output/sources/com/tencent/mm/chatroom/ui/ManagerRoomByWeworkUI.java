package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class ManagerRoomByWeworkUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int I = 0;
    public android.widget.LinearLayout A;
    public androidx.recyclerview.widget.RecyclerView B;
    public android.widget.LinearLayout C;
    public android.widget.ImageView D;
    public androidx.recyclerview.widget.LinearLayoutManager E;
    public com.tencent.mm.chatroom.ui.q4 F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63796d;

    /* renamed from: e, reason: collision with root package name */
    public int f63797e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63798f;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f63808s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f63809t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f63810u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f63811v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f63812w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f63813x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f63814y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f63815z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f63799g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f63800h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f63801i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f63802m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f63803n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public int f63804o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f63805p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f63806q = 0;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63807r = null;
    public int G = 0;
    public int H = 0;

    public static void T6(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeGuideFlowStruct groupUpgradeGuideFlowStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeGuideFlowStruct();
        groupUpgradeGuideFlowStruct.f58396d = groupUpgradeGuideFlowStruct.b("Roomid", str, true);
        groupUpgradeGuideFlowStruct.f58397e = i17;
        groupUpgradeGuideFlowStruct.f58398f = i18;
        groupUpgradeGuideFlowStruct.f58399g = i19;
        groupUpgradeGuideFlowStruct.k();
    }

    public static void U6(java.lang.String str, com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || cdnImageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "username or avatarIv null");
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cdnImageView, str, null);
        }
    }

    public static void X6(android.content.Context context, java.lang.String str, android.widget.TextView textView, android.widget.TextView textView2, boolean z17) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.CharSequence bj6 = ((ke0.e) xVar).bj(context, c01.a2.e(str), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        if (z17) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            bj6 = com.tencent.mm.pluginsdk.ui.span.c0.a(context, bj6, com.tencent.mm.R.raw.open_im_title_logo);
        }
        textView.setText(bj6);
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).d1());
        if (wi6 == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(context.getString(com.tencent.mm.R.string.k4y, wi6 + ""));
    }

    public void V6(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeSelectGroupStruct groupUpgradeSelectGroupStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeSelectGroupStruct();
        groupUpgradeSelectGroupStruct.f58408d = this.G;
        groupUpgradeSelectGroupStruct.f58409e = this.H;
        com.tencent.mm.chatroom.ui.q4 q4Var = this.F;
        groupUpgradeSelectGroupStruct.f58410f = q4Var == null ? 0L : q4Var.f64446m;
        groupUpgradeSelectGroupStruct.f58411g = q4Var != null ? q4Var.f64447n : 0L;
        groupUpgradeSelectGroupStruct.f58412h = i17;
        java.lang.String str = this.f63798f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        groupUpgradeSelectGroupStruct.f58413i = groupUpgradeSelectGroupStruct.b("TicketId", str, true);
        groupUpgradeSelectGroupStruct.f58414j = this.f63806q;
        groupUpgradeSelectGroupStruct.k();
    }

    public final boolean W6() {
        java.util.List P0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q());
        java.util.HashSet hashSet = new java.util.HashSet(this.f63801i);
        java.util.Iterator it = ((java.util.ArrayList) P0).iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void Y6(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f63807r;
        if (u3Var == null) {
            this.f63807r = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490468vx), true, z17, new com.tencent.mm.chatroom.ui.o4(this, m1Var));
        } else {
            if (u3Var.isShowing()) {
                return;
            }
            this.f63807r.show();
        }
    }

    public final void Z6() {
        if (this.f63797e != 3) {
            this.f63808s.setVisibility(0);
            this.f63809t.setVisibility(8);
            return;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wework_select_other_room_switch, 1) == 1) && W6() && ((java.util.ArrayList) this.f63799g).size() == 0 && ((java.util.ArrayList) this.f63801i).size() == 0) {
            this.f63808s.setVisibility(8);
            this.f63809t.setVisibility(0);
            return;
        }
        this.f63808s.setVisibility(0);
        this.f63809t.setVisibility(8);
        com.tencent.mm.chatroom.ui.q4 q4Var = this.F;
        if (q4Var == null || q4Var.f64444h <= 0) {
            this.f63808s.setEnabled(false);
        } else {
            this.f63808s.setEnabled(true);
        }
    }

    public final boolean a7() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wework_select_other_room_switch, 1) == 1) || !W6()) {
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            return false;
        }
        if (((java.util.ArrayList) this.f63799g).size() == 0 && ((java.util.ArrayList) this.f63801i).size() == 0) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488409si;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f63800h;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.storage.z3) it.next()).d1(), stringExtra)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onActivityResult contain");
                    return;
                }
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(stringExtra, true);
            arrayList.add(n17);
            ((java.util.ArrayList) this.f63801i).add(stringExtra);
            this.f63802m.put(n17.d1(), java.lang.Boolean.TRUE);
            this.F.notifyDataSetChanged();
            a7();
            com.tencent.mm.chatroom.ui.q4 q4Var = this.F;
            q4Var.f64447n++;
            q4Var.f64444h++;
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.root_view);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.cgc);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487502ot1);
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.auq);
            if (nestedScrollView != null) {
                nestedScrollView.post(new com.tencent.mm.ui.tools.i8(findViewById, findViewById3, this, 48, findViewById2, 0.0f, nestedScrollView, false));
            }
            Z6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        setMMTitle("");
        this.f63796d = getIntent().getStringExtra("RoomInfo_Id");
        this.f63797e = getIntent().getIntExtra("upgrade_openim_room_from_scene", 0);
        this.f63798f = getIntent().getStringExtra("ticket");
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "mFromScene:%s", java.lang.Integer.valueOf(this.f63797e));
        if (this.f63797e == 3) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f63798f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "mTicket is null");
                finish();
                z17 = false;
            }
            z17 = true;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f63796d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "mRoomId is null");
                finish();
                z17 = false;
            }
            z17 = true;
        }
        if (z17) {
            gm0.j1.d().a(3553, this);
            gm0.j1.d().a(3927, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doFetchCollectPubFill() roomId:%s", this.f63796d);
            kn.r rVar = this.f63797e == 3 ? new kn.r(this.f63798f, true) : new kn.r(this.f63796d);
            gm0.j1.d().g(rVar);
            Y6(rVar, this.f63797e != 3);
            setMMTitle("");
            hideActionbarLine();
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
            setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
            setBackBtn(new com.tencent.mm.chatroom.ui.k4(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(3553, this);
        gm0.j1.d().q(3927, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        int i18 = this.f63797e;
        if (i18 != 3) {
            T6(this.f63796d, i18, 0, 0);
        } else {
            V6(0);
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        java.util.List list;
        java.util.List list2;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        int i19 = 0;
        if (this.f63797e != 3 || (m1Var instanceof kn.r)) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f63807r;
            if (u3Var2 != null && u3Var2.isShowing()) {
                this.f63807r.dismiss();
            }
        } else {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom %s", ((kn.d0) m1Var).f309386g);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            int i27 = this.f63804o + 1;
            this.f63804o = i27;
            if (i27 == this.f63805p && (u3Var = this.f63807r) != null && u3Var.isShowing()) {
                this.f63807r.dismiss();
            }
        }
        java.util.List list3 = this.f63799g;
        java.util.HashMap hashMap = this.f63803n;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof kn.r) {
                r45.ca3 ca3Var = ((kn.r) m1Var).f309450f;
                if (ca3Var == null) {
                    ca3Var = null;
                }
                if (ca3Var == null) {
                    db5.t7.makeText(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.k4u) : str, 0).show();
                    finish();
                    return;
                }
                super.initView();
                this.f63808s = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487513ou4);
                this.f63809t = (android.widget.Button) findViewById(com.tencent.mm.R.id.mj6);
                this.f63810u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bhd);
                this.f63811v = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.bgj);
                this.f63812w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483626bh5);
                this.f63813x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483930ci1);
                this.f63814y = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.chj);
                this.f63815z = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485188gu5);
                this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bgr);
                this.B = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.a5b);
                this.C = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.mj8);
                this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mj7);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.cgc);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f63808s.setOnClickListener(new com.tencent.mm.chatroom.ui.l4(this));
                int i28 = this.f63797e;
                if (i28 == 1 || i28 == 2) {
                    this.A.setVisibility(0);
                    this.f63815z.setVisibility(8);
                    U6(this.f63796d, this.f63811v);
                    java.lang.String str2 = this.f63796d;
                    android.widget.TextView textView = this.f63812w;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(n17.P0()) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1()) == 0 ? getString(com.tencent.mm.R.string.f492480gt1) : getString(com.tencent.mm.R.string.f492133fc0, getString(com.tencent.mm.R.string.f492480gt1), java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1()))) : getString(com.tencent.mm.R.string.f492133fc0, n17.f2(), java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1())));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, string, i65.a.h(this, com.tencent.mm.R.dimen.f479568k));
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.a(this, bj6, com.tencent.mm.R.raw.open_im_title_logo));
                } else if (i28 == 3) {
                    this.A.setVisibility(8);
                    this.f63815z.setVisibility(0);
                    com.tencent.mm.chatroom.ui.m4 m4Var = new com.tencent.mm.chatroom.ui.m4(this);
                    this.C.setOnClickListener(m4Var);
                    this.f63809t.setOnClickListener(m4Var);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) c01.e2.j();
                    if (arrayList2.size() != 0) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            list = this.f63801i;
                            list2 = this.f63800h;
                            if (!hasNext) {
                                break;
                            }
                            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
                            if (c01.e2.F(z3Var.d1())) {
                                com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(z3Var.d1());
                                if (z07 == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "initContactList %s member is null", z3Var.d1());
                                } else if (z07.field_memberCount < c01.v1.q() && com.tencent.mm.sdk.platformtools.t8.D0(z07.field_roomowner, c01.z1.r())) {
                                    ((java.util.ArrayList) list2).add(z3Var);
                                    ((java.util.ArrayList) list).add(z3Var.d1());
                                    ((java.util.ArrayList) list3).add(z3Var.d1());
                                }
                            }
                        }
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
                        int size = arrayList3.size();
                        this.G = size;
                        if (size == 0) {
                            java.util.List<java.lang.String> c17 = o13.n.c();
                            java.util.HashSet hashSet = new java.util.HashSet(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q()));
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            for (java.lang.String str3 : c17) {
                                if (linkedList.size() >= 5) {
                                    break;
                                } else if (hashSet.contains(str3) && !c01.e2.E(str3)) {
                                    linkedList.add(str3);
                                }
                            }
                            java.util.Iterator it6 = ((java.util.ArrayList) g95.e.f269801a.f(linkedList)).iterator();
                            while (it6.hasNext()) {
                                com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) it6.next();
                                arrayList3.add(z3Var2);
                                ((java.util.ArrayList) list).add(z3Var2.d1());
                                ((java.util.ArrayList) list3).add(z3Var2.d1());
                            }
                            this.G = arrayList3.size();
                        }
                        this.f63806q = ((java.util.ArrayList) ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q())).size() - this.G;
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
                        this.E = linearLayoutManager;
                        linearLayoutManager.Q(1);
                        this.B.setLayoutManager(this.E);
                        this.B.N(new com.tencent.mm.chatroom.ui.r4(getContext(), 0.5f, 96.0f));
                        com.tencent.mm.chatroom.ui.q4 q4Var = new com.tencent.mm.chatroom.ui.q4(getContext(), list2, this.f63802m, list3, new com.tencent.mm.chatroom.ui.n4(this));
                        this.F = q4Var;
                        this.B.setAdapter(q4Var);
                        this.B.setNestedScrollingEnabled(false);
                        this.F.notifyDataSetChanged();
                        if (((java.util.ArrayList) list2).size() != 0) {
                            z17 = true;
                            if (!z17 && !a7()) {
                                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484228dg2);
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                arrayList4.add(0);
                                java.util.Collections.reverse(arrayList4);
                                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                                yj0.a.f(findViewById2, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487513ou4);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(8);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(findViewById3, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                this.f63815z.setVisibility(8);
                            }
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        android.view.View findViewById22 = findViewById(com.tencent.mm.R.id.f484228dg2);
                        java.util.ArrayList arrayList42 = new java.util.ArrayList();
                        arrayList42.add(0);
                        java.util.Collections.reverse(arrayList42);
                        yj0.a.d(findViewById22, arrayList42.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById22.setVisibility(((java.lang.Integer) arrayList42.get(0)).intValue());
                        yj0.a.f(findViewById22, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById32 = findViewById(com.tencent.mm.R.id.f487513ou4);
                        java.util.ArrayList arrayList52 = new java.util.ArrayList();
                        arrayList52.add(8);
                        java.util.Collections.reverse(arrayList52);
                        yj0.a.d(findViewById32, arrayList52.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById32.setVisibility(((java.lang.Integer) arrayList52.get(0)).intValue());
                        yj0.a.f(findViewById32, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f63815z.setVisibility(8);
                    }
                }
                Z6();
                this.f63810u.setText(ca3Var.f371398g);
                android.widget.TextView textView2 = this.f63813x;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String str4 = ca3Var.f371395d;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                textView2.setText(((ke0.e) xVar2).hj(context, str4 == null ? "" : str4, (int) this.f63813x.getTextSize(), 1, null));
                java.util.LinkedList linkedList2 = ca3Var.f371396e;
                if (linkedList2 != null && linkedList2.size() > 0) {
                    this.f63814y.removeAllViews();
                    android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
                    java.util.Iterator it7 = linkedList2.iterator();
                    int i29 = 0;
                    while (it7.hasNext()) {
                        java.lang.String str5 = (java.lang.String) it7.next();
                        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488411sk, (android.view.ViewGroup) this.f63814y, false);
                        i29++;
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.klr)).setText(i29 + ".");
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut)).setText(str5);
                        this.f63814y.addView(inflate);
                    }
                }
                androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.root_view);
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.cgc);
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f487502ot1);
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.auq);
                if (nestedScrollView == null) {
                    return;
                }
                nestedScrollView.post(new com.tencent.mm.ui.tools.i8(findViewById4, findViewById6, this, 48, findViewById5, 0.0f, nestedScrollView, false));
                return;
            }
            if (m1Var instanceof kn.d0) {
                kn.d0 d0Var = (kn.d0) m1Var;
                r45.lt6 lt6Var = d0Var.f309385f;
                if (lt6Var == null) {
                    lt6Var = null;
                }
                int i37 = this.f63797e;
                if (i37 != 3) {
                    if (lt6Var == null) {
                        db5.t7.makeText(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.k4u) : str, 0).show();
                        T6(this.f63796d, this.f63797e, 2, 4);
                        finish();
                        return;
                    }
                    T6(this.f63796d, i37, 1, 0);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(this, com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI.class);
                    intent.putExtra("RoomInfo_Id", this.f63796d);
                    java.lang.String str6 = lt6Var.f379822d;
                    if (str6 == null) {
                        str6 = "";
                    }
                    intent.putExtra("popup_wording", str6);
                    intent.putExtra("upgrade_openim_room_from_scene", this.f63797e);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(intent);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList6.get(0));
                    yj0.a.f(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    super.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
                    return;
                }
                java.lang.String str7 = d0Var.f309386g;
                if (lt6Var != null) {
                    hashMap.put(str7, java.lang.Boolean.TRUE);
                } else {
                    hashMap.put(str7, java.lang.Boolean.FALSE);
                }
            }
        } else if (m1Var instanceof kn.r) {
            db5.t7.makeText(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.k4u) : str, 0).show();
            finish();
            return;
        } else if (m1Var instanceof kn.d0) {
            int i38 = this.f63797e;
            if (i38 != 3) {
                T6(this.f63796d, i38, 2, 4);
                db5.t7.makeText(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.k4u) : str, 0).show();
                return;
            }
            hashMap.put(((kn.d0) m1Var).f309386g, java.lang.Boolean.FALSE);
        }
        if (this.f63797e == 3 && (m1Var instanceof kn.d0) && this.f63804o == this.f63805p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom finish");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                    arrayList7.add((java.lang.String) entry.getKey());
                } else {
                    arrayList8.add((java.lang.String) entry.getKey());
                }
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(this, com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI.class);
            intent2.putExtra("upgrade_openim_room_from_scene", this.f63797e);
            intent2.putExtra("wework_upgrade_success_list", arrayList7);
            intent2.putExtra("wework_upgrade_fail_list", arrayList8);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(intent2);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList9.get(0));
            yj0.a.f(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            super.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it8 = arrayList7.iterator();
            int i39 = 0;
            while (it8.hasNext()) {
                java.lang.String str8 = (java.lang.String) it8.next();
                if (((java.util.ArrayList) list3).contains(str8)) {
                    i19++;
                } else {
                    i39++;
                }
                sb6.append(str8);
                sb6.append("|");
            }
            if (sb6.length() - 1 >= 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeResultStruct groupUpgradeResultStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeResultStruct();
            groupUpgradeResultStruct.f58402d = i19;
            com.tencent.mm.chatroom.ui.q4 q4Var2 = this.F;
            groupUpgradeResultStruct.f58403e = q4Var2 == null ? 0L : q4Var2.f64446m - i19;
            groupUpgradeResultStruct.f58404f = i39;
            groupUpgradeResultStruct.f58405g = q4Var2 != null ? q4Var2.f64447n - i39 : 0L;
            groupUpgradeResultStruct.f58406h = groupUpgradeResultStruct.b("sucRoomList", sb6.toString(), true);
            java.lang.String str9 = this.f63798f;
            if (str9 == null) {
                str9 = "";
            }
            groupUpgradeResultStruct.f58407i = groupUpgradeResultStruct.b("ticketId", str9, true);
            groupUpgradeResultStruct.k();
        }
    }
}

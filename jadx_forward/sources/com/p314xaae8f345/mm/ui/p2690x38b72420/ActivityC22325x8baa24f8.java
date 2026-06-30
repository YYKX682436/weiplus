package com.p314xaae8f345.mm.ui.p2690x38b72420;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.ui.contact.SelectContactUI */
/* loaded from: classes11.dex */
public class ActivityC22325x8baa24f8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: m2, reason: collision with root package name */
    public static final /* synthetic */ int f288069m2 = 0;
    public boolean A1;
    public java.lang.String B1;
    public android.app.ProgressDialog C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f288070J;
    public dn.h J1;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public dn.h N1;
    public boolean O1;
    public java.util.List P;
    public boolean P1;
    public java.util.List Q;
    public java.util.List R;
    public java.util.List S;
    public java.lang.String T1;
    public int U;
    public java.lang.String U1;
    public boolean V;
    public java.lang.String V1;
    public java.lang.String W;
    public java.lang.String X;
    public int Y;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 Z;
    public int Z1;

    /* renamed from: h2, reason: collision with root package name */
    public int f288078h2;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f288082l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.RelativeLayout f288084p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f288085p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.LinearLayout f288086x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ProgressBar f288087x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f288088y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f288089y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.Button f288090z1;
    public final java.util.Map T = new java.util.HashMap();
    public int C1 = 0;
    public int D1 = 0;
    public java.util.ArrayList E1 = null;
    public long F1 = -1;
    public boolean G1 = false;
    public boolean H1 = false;
    public android.util.Pair I1 = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(-1, ""), java.lang.Boolean.FALSE);
    public boolean K1 = false;
    public boolean L1 = false;
    public java.util.List M1 = new java.util.ArrayList();
    public boolean Q1 = true;
    public boolean R1 = false;
    public boolean S1 = false;
    public java.lang.String W1 = "";
    public java.lang.String X1 = java.util.UUID.randomUUID().toString();
    public long Y1 = 0;

    /* renamed from: a2, reason: collision with root package name */
    public java.lang.String f288071a2 = null;

    /* renamed from: b2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f288072b2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.contact.SelectContactUI.1
        {
            this.f39173x3fe91575 = 1734631819;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b c5887xfade37b) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b c5887xfade37b2 = c5887xfade37b;
            if (c5887xfade37b2 != null) {
                am.dq dqVar = c5887xfade37b2.f136195g;
                long j17 = dqVar.f88021a;
                if (j17 != 0) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", valueOf, activityC22325x8baa24f8.I1.first, java.lang.Boolean.valueOf(dqVar.f88022b));
                    if (dqVar.f88021a == ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) activityC22325x8baa24f8.I1.first).f231013d) {
                        if (dqVar.f88022b) {
                            activityC22325x8baa24f8.O7();
                        } else {
                            activityC22325x8baa24f8.L7(0, "send record error", dqVar.f88023c);
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: c2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.ma f288073c2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.ma(this, null);

    /* renamed from: d2, reason: collision with root package name */
    public long f288074d2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    public long f288075e2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.animation.ObjectAnimator f288076f2 = null;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f288077g2 = false;

    /* renamed from: i2, reason: collision with root package name */
    public final java.util.HashMap f288079i2 = new java.util.HashMap();

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.HashMap f288080j2 = new java.util.HashMap();

    /* renamed from: k2, reason: collision with root package name */
    public final dn.k f288081k2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.y9(this);

    /* renamed from: l2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.la f288083l2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.la();

    public static boolean w7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        boolean z17;
        java.util.ArrayList C7 = activityC22325x8baa24f8.C7(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(activityC22325x8baa24f8.D, 8192));
        C7.remove(c01.z1.r());
        if (!(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(activityC22325x8baa24f8.D, 4096) && C7.size() > 1)) {
            java.util.ArrayList E7 = activityC22325x8baa24f8.E7(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(activityC22325x8baa24f8.D, 8192));
            a14.a a17 = a14.a.a();
            a17.getClass();
            long size = E7.size();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6872xac0d44e3 c6872xac0d44e3 = a17.f82115a;
            c6872xac0d44e3.f141893g = size;
            c6872xac0d44e3.f141906t = c6872xac0d44e3.b("InvitedUsrs", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(E7, ";"), true);
            return activityC22325x8baa24f8.H7(E7, true);
        }
        if (!activityC22325x8baa24f8.O1) {
            activityC22325x8baa24f8.O1 = true;
            java.util.ArrayList C72 = activityC22325x8baa24f8.C7(false);
            C72.remove(c01.z1.r());
            if (C72.size() == 1) {
                activityC22325x8baa24f8.O1 = false;
                activityC22325x8baa24f8.finish();
                activityC22325x8baa24f8.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", (java.lang.String) C72.get(0)));
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                if (!z18) {
                    java.util.Iterator it = C72.iterator();
                    while (it.hasNext()) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it.next())) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z18 || z17) {
                    activityC22325x8baa24f8.z7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", C72));
                } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f()) {
                    activityC22325x8baa24f8.O1 = false;
                    gm0.j1.i();
                    gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OPENIM_SELECT_ALERT_ID_BOOLEAN, false);
                    activityC22325x8baa24f8.O1 = true;
                    activityC22325x8baa24f8.z7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", C72));
                } else {
                    db5.e1.t(activityC22325x8baa24f8, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3w), "", null);
                    activityC22325x8baa24f8.O1 = false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "Create the chatroom");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean A2(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.util.List list = this.S;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return ((java.util.LinkedList) this.S).contains(dVar.f288383s);
    }

    public final boolean A7(java.util.List list, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        if (getIntent().getBooleanExtra("Add_SendCard", false)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.W)) {
                this.W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",");
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.X)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "send card occur error: send:%s | receive:%s", this.W, this.X);
                    return false;
                }
                this.X = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",");
            }
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.X);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("be_send_card_name", this.W);
            intent.putExtra("received_card_name", this.X);
            intent.putExtra("Is_Chatroom", R4);
            setResult(-1, intent);
            finish();
        } else {
            if (getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "sns post who can see scene,users=%s", list.toString());
                java.util.ArrayList E7 = E7(false);
                E7.remove(c01.z1.r());
                java.util.Iterator it = list.iterator();
                boolean z18 = false;
                while (it.hasNext()) {
                    java.lang.String str8 = (java.lang.String) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8) && !E7.contains(str8) && !c01.z1.r().equals(str8) && (n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str8, true)) != null && ((int) n17.E2) != 0 && n17.r2()) {
                        J7(str8, null);
                        E7.add(str8);
                        z18 = true;
                    }
                }
                if (z18) {
                    M7();
                    b7().notifyDataSetChanged();
                } else if (z17) {
                    java.util.ArrayList E72 = E7(false);
                    E72.remove(c01.z1.r());
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(E72, ",");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(E72)) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("Select_Contact", c17);
                        intent2.putExtra("Select_Conv_User", c17);
                        intent2.putExtra("Select_Contact", c17);
                        intent2.putExtra("Select_Contacts_To_Create_New_Label", c17);
                        setResult(-1, intent2);
                        finish();
                    } else if (getIntent().getBooleanExtra("snsUploadWhoCanSssToShowSaveLabel", true)) {
                        db5.e1.K(mo55332x76847179(), true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9s), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9r), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9q), new com.p314xaae8f345.mm.ui.p2690x38b72420.q9(this, c17), new com.p314xaae8f345.mm.ui.p2690x38b72420.r9(this, c17));
                    } else {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("Select_Contact", c17);
                        intent3.putExtra("Select_Conv_User", c17);
                        intent3.putExtra("Select_Contact", c17);
                        setResult(-1, intent3);
                        finish();
                    }
                }
            } else if (getIntent().getBooleanExtra("recommend_friends", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "Recommend Friends");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.String str9 = this.X;
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    java.lang.String str10 = (java.lang.String) it6.next();
                    java.lang.String b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str10, null);
                    if (w11.t1.a(str9)) {
                        w11.r1 a17 = w11.s1.a(str9);
                        a17.g(str9);
                        a17.e(b17);
                        a17.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str10) ? 66 : 42);
                        a17.b();
                    } else {
                        w11.r1 a18 = w11.s1.a(str9);
                        a18.g(str9);
                        a18.e(b17);
                        a18.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str10) ? 66 : 42);
                        a18.f523664f = 0;
                        a18.f523667i = 4;
                        a18.a().a();
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, mo55332x76847179, null, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11003, str9, 3, java.lang.Integer.valueOf(list.size()));
                mo55332x76847179.setResult(-1);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2690x38b72420.cb(mo55332x76847179), 2000L);
            } else if (this.R1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "From Group choose");
                this.R1 = false;
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    java.lang.String str11 = (java.lang.String) it7.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "userName isNull Or Nil");
                    } else {
                        gm0.j1.i();
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str11);
                        if (q17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "contact is null");
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17.Q0()) && q17.r2() && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.V1) || !str11.equals(this.V1))) {
                            if (!((java.util.LinkedList) this.R).contains(str11)) {
                                J7(str11, null);
                            }
                        }
                    }
                }
                M7();
                y7();
                D7().notifyDataSetChanged();
            } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 16384)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "return the result");
                android.content.Intent intent4 = new android.content.Intent();
                java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",");
                intent4.putExtra("Select_Contact", c18);
                intent4.putExtra("Select_Conv_User", c18);
                intent4.putExtra("Select_Contact", c18);
                if (b7() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.h0) {
                    android.database.Cursor cursor = ((com.p314xaae8f345.mm.ui.p2690x38b72420.h0) b7()).f288282z;
                    intent4.putExtra("show_all_select_contact_count", cursor != null ? ((android.database.MergeCursor) cursor).getCount() : 0);
                }
                dn.h hVar = this.J1;
                if (hVar != null || this.N1 != null) {
                    com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo localHistoryInfo = new com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo();
                    if (hVar != null) {
                        localHistoryInfo.f145250d = hVar.f69522xf9dbbe9c;
                        localHistoryInfo.f145251e = hVar.f69502xf11df5f5;
                        localHistoryInfo.f145252f = hVar.f69526x419c9c3d;
                        localHistoryInfo.f145253g = (int) hVar.f69523x17c343e7;
                        localHistoryInfo.f145254h = this.D1;
                    }
                    dn.h hVar2 = this.N1;
                    if (hVar2 != null) {
                        localHistoryInfo.f145255i = hVar2.f69522xf9dbbe9c;
                        localHistoryInfo.f145256m = hVar2.f69502xf11df5f5;
                        localHistoryInfo.f145257n = hVar2.f69526x419c9c3d;
                        localHistoryInfo.f145258o = (int) hVar2.f69523x17c343e7;
                        localHistoryInfo.f145259p = this.D1;
                    }
                    intent4.putExtra("select_record_msg_info", localHistoryInfo);
                    android.util.Pair pair = this.I1;
                    intent4.putExtra("select_record_fake_msg_id", (pair == null || (obj = pair.first) == null) ? 0L : ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) obj).f231013d);
                }
                intent4.putExtra("label_source", this.U1);
                intent4.putExtra("Is_Chatroom", this.f288078h2 == 1);
                intent4.putExtra("scene_from", 13);
                setResult(-1, intent4);
                finish();
            } else if (getIntent().getBooleanExtra("shareImage", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "Share Image");
                java.util.ArrayList E73 = E7(true);
                E73.remove(c01.z1.r());
                if (E73.size() > 0) {
                    this.C = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqx), true, false, null);
                    gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2690x38b72420.na(this, E73, null));
                }
            } else if (getIntent().getBooleanExtra("key_select_contact_come_from_pocket_money", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "come from pocketMoney scene need special deal");
                com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b6 = (com.p314xaae8f345.mm.ui.C21431x397c46b6) getIntent().getParcelableExtra("key_select_contact_pocket_money_info");
                java.lang.String str12 = "";
                com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c = "";
                com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288165d = null;
                com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b = c21431x397c46b6;
                if (list == null || list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SelectPocketMoneyHelper", "usernameList is empty");
                } else {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c = (java.lang.String) kz5.n0.X(list);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288165d = this;
                    if (com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "pocketMoneyInfo is null, return normal result");
                        java.lang.String str13 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c;
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("Select_Conv_User", str13);
                        intent5.putExtra("pocket_money_result_status", -100);
                        setResult(-1, intent5);
                        finish();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "[startForwardHalfPage] start entryInfo: " + com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b);
                        l15.c cVar = new l15.c();
                        cVar.q(new v05.b());
                        v05.b k17 = cVar.k();
                        if (k17 != null) {
                            k17.set(k17.f513848e + 78, new b15.b());
                        }
                        v05.b k18 = cVar.k();
                        if (k18 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b62 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b62 == null || (str7 = c21431x397c46b62.f278570d) == null) {
                                str7 = "";
                            }
                            k18.set(k18.f449898d + 2, str7);
                        }
                        v05.b k19 = cVar.k();
                        if (k19 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b63 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b63 == null || (str6 = c21431x397c46b63.f278571e) == null) {
                                str6 = "";
                            }
                            k19.set(k19.f449898d + 3, str6);
                        }
                        v05.b k27 = cVar.k();
                        if (k27 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b64 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b64 == null || (str5 = c21431x397c46b64.f278573g) == null) {
                                str5 = "";
                            }
                            k27.set(k27.f513848e + 12, str5);
                        }
                        v05.b k28 = cVar.k();
                        if (k28 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b65 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b65 == null || (str4 = c21431x397c46b65.f278574h) == null) {
                                str4 = "";
                            }
                            k28.set(k28.f513848e + 11, str4);
                        }
                        v05.b k29 = cVar.k();
                        if (k29 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b66 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b66 == null || (str3 = c21431x397c46b66.f278572f) == null) {
                                str3 = "";
                            }
                            k29.set(k29.f513848e + 14, str3);
                        }
                        v05.b k37 = cVar.k();
                        if (k37 != null) {
                            k37.set(k37.f449898d + 6, 110);
                        }
                        v05.b k38 = cVar.k();
                        b15.b bVar = k38 != null ? (b15.b) k38.m75936x14adae67(k38.f513848e + 78) : null;
                        if (bVar != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b67 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b67 == null || (str2 = c21431x397c46b67.f278575i) == null) {
                                str2 = "";
                            }
                            bVar.j(str2);
                        }
                        v05.b k39 = cVar.k();
                        b15.b bVar2 = k39 != null ? (b15.b) k39.m75936x14adae67(k39.f513848e + 78) : null;
                        if (bVar2 != null) {
                            com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b68 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288163b;
                            if (c21431x397c46b68 != null && (str = c21431x397c46b68.f278576m) != null) {
                                str12 = str;
                            }
                            bVar2.k(str12);
                        }
                        vd5.b bVar3 = new vd5.b();
                        bVar3.k(cVar);
                        com.p314xaae8f345.mm.ui.p2690x38b72420.ab abVar = com.p314xaae8f345.mm.ui.p2690x38b72420.ab.f288129a;
                        com.p314xaae8f345.mm.ui.p2690x38b72420.za zaVar = com.p314xaae8f345.mm.ui.p2690x38b72420.za.f288809d;
                        n13.t tVar = new n13.t();
                        tVar.f415667b = abVar;
                        tVar.f415669d = zaVar;
                        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(this, bVar3, com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c, tVar);
                    }
                }
            } else if (list.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "Launch ChattingUI: users=%s", list.toString());
                finish();
                android.content.Intent intent6 = new android.content.Intent();
                intent6.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                intent6.putExtra("Chat_User", (java.lang.String) list.get(0));
                intent6.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent6);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                I7(3);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "unkown action: User=%s", list.toString());
            }
        }
        return true;
    }

    public final void B7(boolean z17) {
        if (this.Y == 1) {
            m78500x43e00957(1, z17);
        } else {
            this.f288090z1.setEnabled(z17);
        }
    }

    public final java.util.ArrayList C7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : this.R) {
            if (z17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it = n17.iterator();
                    while (it.hasNext()) {
                        hashSet.add((java.lang.String) it.next());
                    }
                }
            }
        }
        hashSet.addAll(this.Q);
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 D7() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 a5Var = this.f287981f;
        if (a5Var != null) {
            return a5Var;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6 = Z6();
        this.f287979d.setAdapter((android.widget.ListAdapter) Z6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "getInitAdapter is null");
        return Z6;
    }

    public final java.util.ArrayList E7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : this.R) {
            if (z17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it = n17.iterator();
                    while (it.hasNext()) {
                        hashSet.add((java.lang.String) it.next());
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final dn.m F7(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f323319e = true;
        mVar.f323320f = this.f288081k2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
        mVar.f69601xaca5bdda = g17;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 0;
        mVar.f69584x89a4c0cf = 0;
        this.f288079i2.put(g17, str);
        java.util.HashMap hashMap = this.f288080j2;
        java.lang.String str2 = mVar.f69601xaca5bdda;
        hashMap.put(str2, new com.p314xaae8f345.mm.ui.p2690x38b72420.oa(this, str2, mVar.f69595x6d25b0d9, z17));
        return mVar;
    }

    public final boolean G7(java.util.List list) {
        return H7(list, false);
    }

    public final boolean H7(java.util.List list, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "handleSelect %s", list);
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 65536)) {
            return A7(list, z17);
        }
        if (list != null) {
            int i17 = 0;
            if (list.size() == 1) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = (java.lang.String) list.get(0);
                ((sg3.a) v0Var).getClass();
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieu, c01.a2.e(str2));
            } else if (list.size() > 1) {
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572087yd);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                while (true) {
                    if (i17 >= list.size()) {
                        break;
                    }
                    if (i17 == 3) {
                        sb6.append("...");
                        break;
                    }
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = (java.lang.String) list.get(i17);
                    ((sg3.a) v0Var2).getClass();
                    sb6.append(c01.a2.e(str3));
                    if (i17 < list.size() - 1) {
                        sb6.append(string);
                    }
                    i17++;
                }
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieu, sb6.toString());
            }
            this.P1 = true;
            db5.e1.H(mo55332x76847179(), str, null, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.j9(this, list, z17), new com.p314xaae8f345.mm.ui.p2690x38b72420.k9(this));
            return this.P1;
        }
        str = null;
        this.P1 = true;
        db5.e1.H(mo55332x76847179(), str, null, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.j9(this, list, z17), new com.p314xaae8f345.mm.ui.p2690x38b72420.k9(this));
        return this.P1;
    }

    public final void I7(int i17) {
        if (this.f288077g2) {
            return;
        }
        this.f288077g2 = true;
        int i18 = 0;
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            int i19 = this.A;
            int i27 = i19 != 2 ? i19 != 3 ? i19 != 7 ? 0 : 1 : 2 : 3;
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            int i38 = 0;
            for (java.lang.String str : this.R) {
                java.util.Map map = this.T;
                if (((java.util.HashMap) map).containsKey(str)) {
                    int intValue = ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue();
                    if (intValue == 0) {
                        i18++;
                    } else if (intValue == 1) {
                        i28++;
                    } else if (intValue == 2) {
                        i29++;
                    } else if (intValue == 3) {
                        i37++;
                    } else if (intValue == 4) {
                        i38++;
                    }
                }
            }
            b7().m();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17535, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(b7().m()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.Q);
            linkedList.addAll(this.R);
            com.p314xaae8f345.mm.ui.p2690x38b72420.j6.a(linkedList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0113, code lost:
    
        if (r0 != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J7(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.J7(java.lang.String, java.lang.String):void");
    }

    public final void K7() {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2690x38b72420.p9(this));
    }

    public final void L7(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "triggerErrorCallback errCode:%s errMsg:%s", objArr);
        this.H1 = true;
        this.L1 = true;
        this.G1 = false;
        this.K1 = false;
        K7();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2690x38b72420.aa(this, str2));
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f82120f;
        if (a18 > j17) {
            a17.f82115a.f141905s = a18 - j17;
        }
        a14.a.a().f82123i++;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            ((java.util.LinkedList) this.R).remove(str);
            if (b7() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.i6) {
                this.f287983h.m75362x652b8d61().setText(((com.p314xaae8f345.mm.ui.p2690x38b72420.i6) b7()).x());
            } else if (b7() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.h0) {
                D7().s();
            } else {
                b7().notifyDataSetChanged();
            }
            M7();
        }
    }

    public final void M7() {
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            java.util.List list = this.R;
            if (this.f287989q != null && list != null) {
                u7(((java.util.LinkedList) list).size());
            }
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64) || ((java.util.LinkedList) this.R).size() <= 0) {
            if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64) && com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 4194304)) {
                N7(android.text.TextUtils.isEmpty(this.f288071a2) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) : this.f288071a2);
                B7(true);
                return;
            } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64) && com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 262144) && ((java.util.LinkedList) this.R).size() == 0) {
                N7(android.text.TextUtils.isEmpty(this.f288071a2) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) : this.f288071a2);
                B7(false);
                return;
            } else {
                N7(android.text.TextUtils.isEmpty(this.f288071a2) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) : this.f288071a2);
                B7(true);
                return;
            }
        }
        N7((android.text.TextUtils.isEmpty(this.f288071a2) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) : this.f288071a2) + "(" + ((java.util.LinkedList) this.R).size() + ")");
        int intExtra = getIntent().getIntExtra("min_limit_num", 0);
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 262144)) {
            B7(true);
        } else if (((java.util.LinkedList) this.R).size() >= intExtra) {
            B7(true);
        } else {
            B7(false);
        }
    }

    public final void N7(java.lang.String str) {
        if (this.Y == 1) {
            mo60878xf6b21fea(1, str);
        } else {
            this.f288090z1.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O7() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.O7():void");
    }

    public final java.util.List P7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.a() || list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public synchronized com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var;
        i0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        i0Var.f288295b = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 16);
        i0Var.f288294a = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 32);
        i0Var.f288298e = getIntent().getBooleanExtra("create_group_recommend", false);
        i0Var.f288296c = !com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 4);
        i0Var.f288297d = !com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1);
        i0Var.f288299f = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 128);
        i0Var.f288300g = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1048576);
        boolean d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 256);
        i0Var.f288304k = d17;
        if (d17) {
            i0Var.f288305l = getIntent().getStringExtra("custom_contact");
        }
        if (i0Var.f288299f) {
            this.S1 = true;
            i0Var.f288301h = getIntent().getStringExtra("wechat_sport_contact");
            i0Var.f288302i = getIntent().getStringExtra("wechat_sport_recent_like");
            this.T1 = i0Var.f288301h;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f()) {
            i0Var.f288303j = "@all.contact.without.chatroom.without.openim";
        } else {
            i0Var.f288303j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        int i17 = this.A;
        if (i17 == 6 || i17 == 5) {
            i0Var.f288303j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        if (getIntent().getBooleanExtra("KBlockOpenImFav", false)) {
            i0Var.f288303j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.h0(this, this.Q, this.R, this.S, this.P, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1), com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64), i0Var, this.U == 15, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        if (this.S1) {
            return new com.p314xaae8f345.mm.ui.p2690x38b72420.h5(this, this.P, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64), this.T1);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            return new com.p314xaae8f345.mm.ui.p2690x38b72420.i6(this, this.Q, this.R, this.P, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64), this.A);
        }
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.P, com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64), this.A, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false) ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b7() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = super.b7();
        if (b76 != null) {
            return b76;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6 = Z6();
        this.f287981f = Z6;
        this.f287979d.setAdapter((android.widget.ListAdapter) Z6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "getAdapter is null");
        return Z6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(131072);
        if (!getIntent().getBooleanExtra("without_openim", false)) {
            arrayList.add(131081);
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1)) {
            arrayList.add(131076);
            arrayList.add(2097171);
            arrayList.add(2097173);
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 4)) {
            arrayList.add(131075);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        return iArr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return this.E;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.mil;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            return;
        }
        if (item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1) {
            if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 16384)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "handleClickNonSelect, return the result");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Contact", "");
                intent.putExtra("Select_Conv_User", "");
                intent.putExtra("Select_Contact", "");
                setResult(-1, intent);
                finish();
                return;
            }
            return;
        }
        if (!(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) || (z3Var = (aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "ClickUser=%s", d17);
        if (p5(item)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "handleItemClick() isItemAlwaysCheck");
            return;
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{d17}));
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(d17) && getIntent().getBooleanExtra("create_group_recommend", false)) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent2.addFlags(67108864);
            intent2.putExtra("Chat_User", d17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/SelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            I7(3);
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 131072) || ((java.util.LinkedList) this.R).size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            J7(d17, item.f288381q);
        } else if (!((java.util.LinkedList) this.Q).contains(d17)) {
            Y6();
            if (((java.util.LinkedList) this.R).contains(d17)) {
                this.f287983h.d(d17);
                ((java.util.LinkedList) this.R).remove(d17);
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra("too_many_member_tip_string");
                java.lang.String stringExtra2 = getIntent().getStringExtra("too_many_member_tip_ok_string");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    stringExtra = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)));
                }
                java.lang.String str = stringExtra;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    db5.e1.t(mo55332x76847179(), str, "", new com.p314xaae8f345.mm.ui.p2690x38b72420.u9(this));
                } else {
                    db5.e1.E(mo55332x76847179(), str, "", stringExtra2, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.v9(this));
                }
            }
        }
        M7();
        y7();
        D7();
        D7().notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View view;
        super.mo43517x10010bd5();
        this.f288084p0 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.mjt);
        this.f288086x0 = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.mjs);
        this.f288090z1 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g6_);
        this.f288088y0 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mjv);
        this.f288082l1 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mjx);
        this.f288085p1 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mju);
        this.f288087x1 = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lpj);
        this.f288089y1 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mjw);
        this.f288086x0.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.ca(this));
        this.f288082l1.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.da(this));
        a14.a.f82114n = new a14.a();
        a14.a a17 = a14.a.a();
        java.lang.String str = this.B1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6872xac0d44e3 c6872xac0d44e3 = a17.f82115a;
        c6872xac0d44e3.f141890d = c6872xac0d44e3.b("RoomId", str, true);
        c6872xac0d44e3.f141912z = c01.e2.E(str) ? 1 : 0;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.B1) || c01.e2.E(this.B1) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D2(this.B1) <= 0) {
            this.f288086x0.setVisibility(8);
            a14.a.a().f82115a.f141891e = 0;
        } else {
            this.f288086x0.setVisibility(0);
            a14.a.a().f82115a.f141891e = 1;
        }
        if (this.Y == 2) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
            this.Z = f5Var;
            f5Var.f291933e = this;
        }
        if (getIntent().getBooleanExtra("KForceDarkMode", false)) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575471a3);
            mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            t7();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null && (view = c19642xb279030.f271320g) != null) {
                view.setBackgroundColor(c19642xb279030.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w));
            }
            this.f287979d.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w);
            if (m78511x9f88d943() != null) {
                m78511x9f88d943().mo82162xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w));
            }
            this.f287980e.m78863x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
            this.f287980e.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560596oq));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        this.D = intent.getIntExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a);
        this.E = getIntent().getStringExtra("titile");
        this.F = getIntent().getStringExtra("sub_title");
        this.U = getIntent().getIntExtra("list_type", -1);
        this.Q1 = getIntent().getBooleanExtra("show_too_many_member", true);
        this.U1 = getIntent().getStringExtra("label_source");
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 256)) {
            ((java.util.ArrayList) c01.e2.j()).size();
        }
        this.V = getIntent().getBooleanExtra("Add_SendCard", false);
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_friends", false);
        if (this.V || booleanExtra) {
            java.lang.String stringExtra = getIntent().getStringExtra("be_send_card_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.W = stringExtra;
            java.lang.String stringExtra2 = getIntent().getStringExtra("received_card_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.X = stringExtra2;
        }
        getIntent().getBooleanExtra("Forbid_SelectChatRoom", false);
        this.A1 = getIntent().getBooleanExtra("is_select_record_msg_mode", false);
        this.Y = getIntent().getIntExtra("menu_mode", 1);
        java.lang.String stringExtra3 = getIntent().getStringExtra("chatroomName");
        this.B1 = stringExtra3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = stringExtra3 != null ? stringExtra3 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "mRoomId：%s", objArr);
        this.P = new java.util.ArrayList();
        this.R = new java.util.LinkedList();
        this.Q = new java.util.LinkedList();
        this.S = new java.util.LinkedList();
        java.lang.String stringExtra4 = getIntent().getStringExtra("always_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
            ((java.util.LinkedList) this.Q).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra4.split(",")));
        }
        java.lang.String stringExtra5 = getIntent().getStringExtra("already_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
            ((java.util.LinkedList) this.R).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
        }
        java.lang.String stringExtra6 = getIntent().getStringExtra("exclude_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra6)) {
            ((java.util.LinkedList) this.S).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra6.split(",")));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra7 = getIntent().getStringExtra("block_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra7)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra7.split(",")));
        }
        java.util.HashSet hashSet2 = new java.util.HashSet(hashSet);
        hashSet2.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet2.addAll(c01.e2.i());
        hashSet2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 268435456)) {
            hashSet2.add(c01.z1.r());
        }
        if (this.V) {
            hashSet2.removeAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        }
        ((java.util.ArrayList) this.P).addAll(com.p314xaae8f345.mm.p2621x8fb0427b.z3.u3());
        ((java.util.ArrayList) this.P).addAll(hashSet2);
        y7();
        this.W1 = "SelectContactUI-" + this.U;
        this.Z1 = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f288071a2 = getIntent().getStringExtra("menu_label");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean n7() {
        return !this.S1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        java.util.List list2;
        super.onActivityResult(i17, i18, intent);
        this.f288078h2 = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        switch (i17) {
            case 0:
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    return;
                }
                G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{stringExtra}));
                return;
            case 1:
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
                this.R1 = intent.getBooleanExtra("Select_From_Group", false);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    return;
                }
                G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
                return;
            case 2:
                if (intent != null) {
                    java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                        return;
                    }
                    G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{stringExtra3}));
                    return;
                }
                return;
            case 3:
                java.lang.String stringExtra4 = intent.getStringExtra("Select_Contact");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra4);
                if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
                    G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{stringExtra4}));
                    return;
                }
                for (java.lang.String str : stringExtra4.split(",")) {
                    if (((java.util.LinkedList) this.R).add(str)) {
                        this.f287983h.d(str);
                    }
                }
                M7();
                b7().notifyDataSetChanged();
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                long currentTimeMillis = s0Var.B().f142769J + (java.lang.System.currentTimeMillis() - this.f288074d2);
                s0Var.B().f142769J = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "setSelectFriGroupDuration %d", java.lang.Long.valueOf(currentTimeMillis));
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                if (!getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
                    for (java.lang.String str2 : this.R) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
                        if (str2 != null) {
                            c19642xb279030.g(str2, false, false);
                        } else {
                            c19642xb279030.getClass();
                        }
                    }
                    ((java.util.LinkedList) this.R).clear();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                        ((java.util.LinkedList) this.R).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(",")));
                    }
                    java.util.Iterator it = this.R.iterator();
                    while (it.hasNext()) {
                        this.f287983h.a((java.lang.String) it.next(), false);
                    }
                    M7();
                    return;
                }
                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra5.split(","));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it6 = P1.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    if (c01.v1.B(str3)) {
                        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                        java.util.List n17 = c01.v1.n(str3);
                        if (n17 != null) {
                            java.util.Iterator it7 = n17.iterator();
                            while (it7.hasNext()) {
                                hashSet.add((java.lang.String) it7.next());
                            }
                        }
                    } else {
                        hashSet.add(str3);
                    }
                }
                arrayList.addAll(hashSet);
                if (getIntent().getBooleanExtra("without_openim", false)) {
                    java.util.Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        if (((java.lang.String) it8.next()).contains("openim")) {
                            it8.remove();
                        }
                    }
                }
                if (!arrayList.isEmpty() && (list = this.S) != null && !list.isEmpty()) {
                    arrayList.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.contact.SelectContactUI$$a
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((java.util.LinkedList) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.this.S).contains((java.lang.String) obj);
                        }
                    });
                }
                G7(arrayList);
                return;
            case 5:
                if (intent != null) {
                    java.lang.String stringExtra6 = intent.getStringExtra("Select_Contact");
                    java.lang.String stringExtra7 = intent.getStringExtra("Cancel_Select_Contact");
                    java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra6) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra6, ",");
                    java.util.List O12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra7) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra7, ",");
                    if (O1 != null) {
                        if (this.f287983h != null) {
                            for (java.lang.String str4 : O1) {
                                if (!((java.util.LinkedList) this.R).contains(str4)) {
                                    this.f287983h.d(str4);
                                }
                            }
                        }
                        ((java.util.LinkedList) this.R).addAll(O1);
                    }
                    if (O12 != null) {
                        if (this.f287983h != null) {
                            java.util.Iterator it9 = O12.iterator();
                            while (it9.hasNext()) {
                                this.f287983h.d((java.lang.String) it9.next());
                            }
                        }
                        this.R.removeAll(O12);
                    }
                    b7().notifyDataSetChanged();
                    if (getIntent().getBooleanExtra("Add_SendCard", false)) {
                        G7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{stringExtra6}));
                    }
                }
                M7();
                return;
            case 6:
                if (intent != null) {
                    int intExtra = intent.getIntExtra("select_record_msg_num", 0);
                    this.C1 = intExtra;
                    this.D1 = intExtra;
                    this.E1 = intent.getStringArrayListExtra("key_selected_record_msg_list");
                    this.J1 = null;
                    this.N1 = null;
                    this.H1 = false;
                    this.L1 = false;
                    if (this.C1 == 0) {
                        this.G1 = false;
                        this.K1 = false;
                        K7();
                    } else {
                        this.G1 = true;
                        this.K1 = true;
                        this.F1 = intent.getLongExtra("select_record_min_msg_id", -1L);
                        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g() > 0 && com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g() < this.C1) {
                            this.D1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
                        }
                        K7();
                        a14.a.a().f82120f = c01.id.a();
                        this.M1 = new java.util.ArrayList(com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287734a);
                        android.util.Pair i19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.i(this, "msginfo@fakeuser", true, this.B1);
                        this.I1 = i19;
                        if (((java.lang.Boolean) i19.second).booleanValue()) {
                            O7();
                        } else {
                            this.f288072b2.mo48813x58998cd();
                        }
                    }
                    a14.a.a().f82115a.f141895i = this.D1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", java.lang.Integer.valueOf(this.C1), java.lang.Integer.valueOf(this.D1), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) this.I1.first).f231013d), this.I1.second);
                    return;
                }
                return;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                long currentTimeMillis2 = s0Var2.B().K + (java.lang.System.currentTimeMillis() - this.f288075e2);
                s0Var2.B().K = currentTimeMillis2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "setSelectFriLabelDuration %d", java.lang.Long.valueOf(currentTimeMillis2));
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator<java.lang.String> it10 = stringArrayListExtra.iterator();
                while (it10.hasNext()) {
                    java.lang.String next = it10.next();
                    java.util.List j17 = ((b93.b) c93.a.a()).j(next);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "select label:%s count:%d", next, java.lang.Integer.valueOf(j17.size()));
                    sb6.append(next);
                    sb6.append("|");
                    sb6.append(j17.size());
                    sb6.append(";");
                    arrayList2.addAll(j17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                s0Var3.B().F = stringArrayListExtra.size();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 B = s0Var3.B();
                B.G = B.b("SelectFriLabelList", sb6.toString(), true);
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_select_label_id_list_from_search");
                if (stringArrayListExtra2 != null) {
                    int size = stringArrayListExtra2.size();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0 = s0Var3.f246492l;
                    if (c6969xa989d0b0 != null) {
                        int i27 = c6969xa989d0b0.N + size;
                        c6969xa989d0b0.N = i27;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportHelper", "addSearchLabelCntOfSelectFri: newCount=%d", java.lang.Integer.valueOf(i27));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
                if (!arrayList2.isEmpty() && (list2 = this.S) != null && !list2.isEmpty()) {
                    arrayList2.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.contact.SelectContactUI$$b
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((java.util.LinkedList) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.this.S).contains((java.lang.String) obj);
                        }
                    });
                }
                G7(arrayList2);
                M7();
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030;
        this.Y1 = c01.id.c();
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "create!");
        c01.d9.e().a(30, this);
        c01.d9.e().a(138, this);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F)) {
            mo54449x3f86539a(this.F);
        }
        this.V1 = c01.z1.r();
        int i17 = 0;
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            if (this.Y == 1) {
                this.f288084p0.setVisibility(8);
                if (this.f287979d != null) {
                    this.f288084p0.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.ea(this));
                }
                m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2690x38b72420.l9(this), null, getIntent().getBooleanExtra("KForceDarkMode", false) ? com.p314xaae8f345.mm.ui.fb.FINDER_LIVE : com.p314xaae8f345.mm.ui.fb.GREEN);
            } else {
                this.f288084p0.setVisibility(0);
                if (this.f287979d != null) {
                    this.f288084p0.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.ea(this));
                }
                this.f288090z1.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.o9(this));
            }
        }
        M7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.ba(this));
        if (this.U != 15 && (c19642xb279030 = this.f287983h) != null) {
            c19642xb279030.e(this.R);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            int i18 = this.A;
            if (i18 == 2) {
                i17 = 3;
            } else if (i18 == 3) {
                i17 = 2;
            } else if (i18 == 7) {
                i17 = 1;
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.j6.f288492a = i17;
        }
        if (m78511x9f88d943() != null) {
            m78511x9f88d943().mo82162xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f288072b2.mo48814x2efc64();
        c01.d9.e().q(30, this);
        c01.d9.e().q(138, this);
        I7(1);
        com.p314xaae8f345.mm.ui.p2690x38b72420.j6.f288493b = null;
        com.p314xaae8f345.mm.ui.p2690x38b72420.j6.f288494c = null;
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.Z;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.Z;
        if (f5Var != null) {
            f5Var.f();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.X1)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6783xcc9bb806 c6783xcc9bb806 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6783xcc9bb806();
        c6783xcc9bb806.f141150d = c6783xcc9bb806.b("Type", this.W1, true);
        c6783xcc9bb806.f141151e = c6783xcc9bb806.b("SessionId", this.X1, true);
        c6783xcc9bb806.f141153g = 0L;
        c6783xcc9bb806.f141152f = c01.id.c() - this.Y1;
        c6783xcc9bb806.k();
        c6783xcc9bb806.o();
        this.X1 = "";
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.C = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(this) && !com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            if (i17 == 0 && i18 == 0) {
                if (m1Var.mo808xfb85f7b0() != 138) {
                    return;
                }
                b7().notifyDataSetChanged();
            } else if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.Z;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!dVar.d() || !(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) dVar;
        if (aVar.B == null) {
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965)) {
            return aVar.B.y2();
        }
        return ((java.util.LinkedList) this.Q).contains(aVar.B.d1());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void q7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11225, 1, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(E7(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 8192)));
        hashSet.addAll(this.Q);
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("block_contact", getIntent().getStringExtra("block_contact"));
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 64)) {
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16384, 64, 131072));
            if (this.U == 14) {
                intent.putExtra("max_limit_num", getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
            }
        } else {
            intent.putExtra("list_attr", 16384);
        }
        startActivityForResult(intent, 3);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String str;
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 256)) {
            if (this.G == null) {
                this.G = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.fa(this), getString(this.U == 14 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571458fo : com.p314xaae8f345.mm.R.C30867xcad56011.f571442f5));
            }
            this.G.setVisibility(i17);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432)) {
            if (this.M == null) {
                this.M = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.ga(this), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbv));
            }
            this.M.setVisibility(i17);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 67108864)) {
            if (this.N == null) {
                this.N = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.ha(this), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbu));
            }
            this.N.setVisibility(i17);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 512)) {
            if (this.H == null) {
                this.H = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.ia(this), getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfx));
            }
            this.H.setVisibility(i17);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1024)) {
            if (this.I == null) {
                this.I = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.d9(this), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571443f6));
            }
            this.I.setVisibility(i17);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 2048)) {
            if (this.K == null) {
                this.K = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.e9(this), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571455fj));
            }
            this.K.setVisibility(i17);
            android.widget.TextView textView3 = this.K;
            textView3.setTextSize(i65.a.q(textView3.getContext()) * 16.0f);
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 524288)) {
            if (this.f288070J == null) {
                int intExtra = getIntent().getIntExtra("topstory_import_type", 0);
                int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571447fa;
                int i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f_;
                if (intExtra == 1) {
                    java.util.List L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).L0(5L);
                    r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(L0) ? 0 : ((java.util.ArrayList) L0).size();
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(L0, ",");
                } else if (intExtra == 2) {
                    java.util.List b17 = k35.c.b();
                    r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17) ? 0 : ((java.util.ArrayList) b17).size();
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(b17, ",");
                    i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f571445f8;
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571446f9;
                } else {
                    str = "";
                }
                android.widget.TextView x76 = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.g9(this, i18, r7, str), getString(i19));
                this.f288070J = x76;
                x76.setTag(java.lang.Integer.valueOf(r7));
            }
            java.lang.Object tag = this.f288070J.getTag();
            if (!(tag instanceof java.lang.Integer) || ((java.lang.Integer) tag).intValue() <= 0) {
                this.f288070J.setVisibility(8);
            } else {
                this.f288070J.setVisibility(i17);
            }
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
            if (this.L == null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).Q();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "setOpenIMHeaderView %s", java.lang.Integer.valueOf(linkedList.size()));
                if (linkedList.size() != 0) {
                    this.L = x7(listView, new com.p314xaae8f345.mm.ui.p2690x38b72420.i9(this), "");
                    java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
                    this.L.setVisibility(i17);
                    this.L.setText(Ni);
                }
            }
            android.widget.TextView textView4 = this.L;
            if (textView4 != null) {
                textView4.setVisibility(i17);
            }
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) && (textView2 = this.L) != null) {
            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 2048)) {
            android.widget.TextView textView5 = this.K;
            if (textView5 != null) {
                textView5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 1024)) {
            android.widget.TextView textView6 = this.I;
            if (textView6 != null) {
                textView6.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 512)) {
            android.widget.TextView textView7 = this.H;
            if (textView7 != null) {
                textView7.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.D, 256) || (textView = this.G) == null) {
            return;
        }
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(cj5.z2.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        if (dVar.d() && (str2 = dVar.f288383s) != null) {
            return ((java.util.LinkedList) this.R).contains(str2);
        }
        if (dVar.f288372h && (str = dVar.f288383s) != null) {
            return ((java.util.LinkedList) this.R).contains(str);
        }
        if (dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1) {
            return this.R.isEmpty();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "height:%s", java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f288076f2;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f288076f2.cancel();
        }
        if (i17 > 0) {
            if (this.f288084p0.getTranslationY() != 0.0f) {
                this.f288084p0.setTranslationY(0.0f);
            }
            this.f288076f2 = android.animation.ObjectAnimator.ofFloat(this.f288084p0, "translationY", 0.0f, -i17);
        } else {
            android.widget.RelativeLayout relativeLayout = this.f288084p0;
            this.f288076f2 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "translationY", relativeLayout.getTranslationY(), 0.0f);
        }
        this.f288076f2.setDuration(200L);
        this.f288076f2.setInterpolator(new y3.b());
        this.f288076f2.addUpdateListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.h9(this));
        this.f288076f2.start();
    }

    public final android.widget.TextView x7(android.widget.ListView listView, android.view.View.OnClickListener onClickListener, java.lang.String str) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) null);
        inflate.setOnClickListener(onClickListener);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
        textView.setText(str);
        listView.addHeaderView(inflate);
        return textView;
    }

    public final void y7() {
        if (this.Q1) {
            int i17 = this.U;
            if (i17 == 1 || i17 == 0) {
                java.util.List list = this.Q;
                int size = list != null ? ((java.util.LinkedList) list).size() : 0;
                java.util.List list2 = this.R;
                this.f288083l2.a(this, size + (list2 != null ? ((java.util.LinkedList) list2).size() : 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatRoomInviteStartCount"), 0));
            }
        }
    }

    public final void z7(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar) {
        aVar.f273781d = new com.p314xaae8f345.mm.ui.p2690x38b72420.s9(this, aVar);
        aVar.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573921gb2), true, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.t9(this, aVar));
        I7(2);
    }
}

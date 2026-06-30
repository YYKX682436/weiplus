package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomStillNotifyMessageManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI */
/* loaded from: classes11.dex */
public final class ActivityC10359x5d5d51f0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f145403q = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145411n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f145413p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f145404d = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.q9(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f145405e = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.p9(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f145406f = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.o9(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f145407g = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.s9(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f145408h = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.y9(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f145409i = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.r9(this));

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f145410m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f145412o = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.z9(this));

    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 V6() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.a3) ((jz5.n) this.f145409i).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10384xdee394bd W6() {
        return (com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10384xdee394bd) ((jz5.n) this.f145407g).mo141623x754a37bb();
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f145408h).mo141623x754a37bb();
    }

    public final void Y6() {
        boolean K = c01.v1.K(X6());
        boolean J2 = c01.v1.J(X6());
        boolean I = c01.v1.I(X6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "ChatroomMuteRefine updateNotifyRefine: " + K + ", " + J2 + ", " + I);
        jz5.g gVar = this.f145412o;
        ((android.content.SharedPreferences) ((jz5.n) gVar).mo141623x754a37bb()).edit().putBoolean("still_notify_message_at_me_pref", K).commit();
        ((android.content.SharedPreferences) ((jz5.n) gVar).mo141623x754a37bb()).edit().putBoolean("still_notify_message_at_all_pref", J2).commit();
        ((android.content.SharedPreferences) ((jz5.n) gVar).mo141623x754a37bb()).edit().putBoolean("still_notify_message_announcement_pref", I).commit();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f81565do;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        super.onActivityResult(i17, i18, intent);
        if (intent != null && i18 == -1) {
            if (i17 == 0) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String str = stringExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", X6(), java.lang.Integer.valueOf(i17), str);
                java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (java.lang.String str2 : strArr) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        linkedList.add(str2);
                    }
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.Iterator it = this.f145410m.iterator();
                while (it.hasNext()) {
                    linkedList2.add((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next());
                }
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                    if (n17 != null) {
                        linkedList2.add(n17);
                        un.l lVar = (un.l) m80391xac8f1cfd(un.l.class);
                        java.lang.String d17 = n17.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        boolean r27 = n17.r2();
                        lVar.getClass();
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
                        jz5.l[] lVarArr = new jz5.l[4];
                        lVarArr[0] = new jz5.l("chat_name", lVar.O6());
                        lVarArr[1] = new jz5.l("chatroom_info_sid", lVar.P6());
                        lVarArr[2] = new jz5.l("target_username", d17);
                        lVarArr[3] = new jz5.l("if_friend", r27 ? "1" : "0");
                        ((cy1.a) rVar).Cj("add_follow_member", m158354x19263085, kz5.c1.k(lVarArr), 34574);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoomStillNotifyMessageManagerUI", "addRoomFollowMember: user not found " + str3);
                    }
                }
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    linkedList3.add(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it7.next()).d1());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] newUsernameList:" + linkedList3);
                this.f145411n = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, false, null);
                pq5.g l17 = new kn.c(X6(), linkedList3).l();
                l17.f(this);
                l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.t9(this, linkedList2));
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(intent == null);
        objArr[1] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.ya4 ya4Var;
        java.util.LinkedList<r45.az> linkedList;
        java.util.List A0;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("only_show_special_follow", false)) {
            com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
            gaVar.C0(gaVar.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6h));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("still_notify_message_at_me_pref", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("still_notify_message_at_all_pref", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("still_notify_message_announcement_pref", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "only show special follow");
        } else {
            com.p314xaae8f345.mm.ui.ga gaVar2 = this.f39322x2305be9;
            gaVar2.C0(gaVar2.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574437og4));
        }
        super.mo43517x10010bd5();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 V6 = V6();
        java.util.ArrayList followedList = this.f145410m;
        if (V6 != null && (ya4Var = V6.f69097x5eaef643) != null && (linkedList = ya4Var.f472460e) != null) {
            for (r45.az azVar : linkedList) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(azVar.f451905d)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.a3 V62 = V6();
                    if ((V62 == null || (A0 = V62.A0()) == null || !A0.contains(azVar.f451905d)) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[updateRoomFollowMember] watchMember: " + azVar.f451905d);
                        followedList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(azVar.f451905d, true));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.n9 n9Var = new com.p314xaae8f345.mm.p648x55baa833.ui.n9(this);
        com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10384xdee394bd W6 = W6();
        if (W6 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 V63 = V6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followedList, "followedList");
            java.util.ArrayList arrayList = W6.P;
            arrayList.clear();
            arrayList.addAll(followedList);
            W6.Q = V63;
            W6.R = n9Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] roomId:");
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = W6.Q;
            sb6.append(a3Var != null ? a3Var.f69088x37548063 : null);
            sb6.append(", followedList: ");
            sb6.append(followedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", sb6.toString());
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10384xdee394bd W62 = W6();
        if (W62 != null) {
            W62.S = new com.p314xaae8f345.mm.p648x55baa833.ui.m9(this);
        }
        Y6();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.u9(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f145413p) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145404d).mo141623x754a37bb();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c21541x1c1b08fe != null && c21541x1c1b08fe.N());
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145405e).mo141623x754a37bb();
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(c21541x1c1b08fe2 != null && c21541x1c1b08fe2.N());
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145406f).mo141623x754a37bb();
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(c21541x1c1b08fe3 != null && c21541x1c1b08fe3.N());
            boolean booleanValue = valueOf.booleanValue();
            boolean booleanValue2 = valueOf2.booleanValue();
            boolean booleanValue3 = valueOf3.booleanValue();
            int i17 = !booleanValue ? 1 : 0;
            if (!booleanValue2) {
                i17 |= 2;
            }
            if (!booleanValue3) {
                i17 |= 4;
            }
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(X6()).h(X6(), 0, i17).b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ChatroomMuteRefine opNeedNotify: 0x");
            r26.a.a(16);
            java.lang.String num = java.lang.Integer.toString(i17, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "toString(...)");
            sb6.append(num);
            sb6.append(", roomName:");
            sb6.append(X6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p648x55baa833.ui.v9(this, booleanValue, booleanValue2, booleanValue3), w11.h2.f523583f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        if (c21560x1fce98fb != null && (str = c21560x1fce98fb.f279313q) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "onPreferenceTreeClick: ".concat(str));
            int hashCode = str.hashCode();
            if (hashCode != -1805407402) {
                if (hashCode != 893847076) {
                    if (hashCode == 1512874101 && str.equals("still_notify_message_at_me_pref")) {
                        un.l lVar = (un.l) m80391xac8f1cfd(un.l.class);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145404d).mo141623x754a37bb();
                        lVar.R6(c21541x1c1b08fe != null && c21541x1c1b08fe.N(), un.i.f510817f);
                    }
                } else if (str.equals("still_notify_message_announcement_pref")) {
                    un.l lVar2 = (un.l) m80391xac8f1cfd(un.l.class);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145406f).mo141623x754a37bb();
                    lVar2.R6(c21541x1c1b08fe2 != null && c21541x1c1b08fe2.N(), un.i.f510819h);
                }
            } else if (str.equals("still_notify_message_at_all_pref")) {
                un.l lVar3 = (un.l) m80391xac8f1cfd(un.l.class);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f145405e).mo141623x754a37bb();
                lVar3.R6(c21541x1c1b08fe3 != null && c21541x1c1b08fe3.N(), un.i.f510818g);
            }
            if (str.equals("still_notify_message_at_me_pref") || str.equals("still_notify_message_at_all_pref") || str.equals("still_notify_message_announcement_pref")) {
                this.f145413p = true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f145413p = false;
        Y6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(un.l.class);
    }
}

package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomStillNotifyMessageManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RoomStillNotifyMessageManagerUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f63870q = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63878n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63880p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f63871d = jz5.h.b(new com.tencent.mm.chatroom.ui.q9(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f63872e = jz5.h.b(new com.tencent.mm.chatroom.ui.p9(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f63873f = jz5.h.b(new com.tencent.mm.chatroom.ui.o9(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f63874g = jz5.h.b(new com.tencent.mm.chatroom.ui.s9(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f63875h = jz5.h.b(new com.tencent.mm.chatroom.ui.y9(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f63876i = jz5.h.b(new com.tencent.mm.chatroom.ui.r9(this));

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f63877m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f63879o = jz5.h.b(new com.tencent.mm.chatroom.ui.z9(this));

    public final com.tencent.mm.storage.a3 V6() {
        return (com.tencent.mm.storage.a3) ((jz5.n) this.f63876i).getValue();
    }

    public final com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference W6() {
        return (com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference) ((jz5.n) this.f63874g).getValue();
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f63875h).getValue();
    }

    public final void Y6() {
        boolean K = c01.v1.K(X6());
        boolean J2 = c01.v1.J(X6());
        boolean I = c01.v1.I(X6());
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "ChatroomMuteRefine updateNotifyRefine: " + K + ", " + J2 + ", " + I);
        jz5.g gVar = this.f63879o;
        ((android.content.SharedPreferences) ((jz5.n) gVar).getValue()).edit().putBoolean("still_notify_message_at_me_pref", K).commit();
        ((android.content.SharedPreferences) ((jz5.n) gVar).getValue()).edit().putBoolean("still_notify_message_at_all_pref", J2).commit();
        ((android.content.SharedPreferences) ((jz5.n) gVar).getValue()).edit().putBoolean("still_notify_message_announcement_pref", I).commit();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f32do;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
                com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", X6(), java.lang.Integer.valueOf(i17), str);
                java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (java.lang.String str2 : strArr) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        linkedList.add(str2);
                    }
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.Iterator it = this.f63877m.iterator();
                while (it.hasNext()) {
                    linkedList2.add((com.tencent.mm.storage.z3) it.next());
                }
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                    if (n17 != null) {
                        linkedList2.add(n17);
                        un.l lVar = (un.l) component(un.l.class);
                        java.lang.String d17 = n17.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        boolean r27 = n17.r2();
                        lVar.getClass();
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
                        jz5.l[] lVarArr = new jz5.l[4];
                        lVarArr[0] = new jz5.l("chat_name", lVar.O6());
                        lVarArr[1] = new jz5.l("chatroom_info_sid", lVar.P6());
                        lVarArr[2] = new jz5.l("target_username", d17);
                        lVarArr[3] = new jz5.l("if_friend", r27 ? "1" : "0");
                        ((cy1.a) rVar).Cj("add_follow_member", activity, kz5.c1.k(lVarArr), 34574);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RoomStillNotifyMessageManagerUI", "addRoomFollowMember: user not found " + str3);
                    }
                }
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    linkedList3.add(((com.tencent.mm.storage.z3) it7.next()).d1());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] newUsernameList:" + linkedList3);
                this.f63878n = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gga), true, false, null);
                pq5.g l17 = new kn.c(X6(), linkedList3).l();
                l17.f(this);
                l17.h(new com.tencent.mm.chatroom.ui.t9(this, linkedList2));
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(intent == null);
        objArr[1] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.w("MicroMsg.RoomStillNotifyMessageManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.ya4 ya4Var;
        java.util.LinkedList<r45.az> linkedList;
        java.util.List A0;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("only_show_special_follow", false)) {
            com.tencent.mm.ui.ga gaVar = this.mController;
            gaVar.C0(gaVar.f208672u.getString(com.tencent.mm.R.string.i6h));
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("still_notify_message_at_me_pref", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("still_notify_message_at_all_pref", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("still_notify_message_announcement_pref", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "only show special follow");
        } else {
            com.tencent.mm.ui.ga gaVar2 = this.mController;
            gaVar2.C0(gaVar2.f208672u.getString(com.tencent.mm.R.string.f492904og4));
        }
        super.initView();
        com.tencent.mm.storage.a3 V6 = V6();
        java.util.ArrayList followedList = this.f63877m;
        if (V6 != null && (ya4Var = V6.field_localChatRoomWatchMembers) != null && (linkedList = ya4Var.f390927e) != null) {
            for (r45.az azVar : linkedList) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(azVar.f370372d)) {
                    com.tencent.mm.storage.a3 V62 = V6();
                    if ((V62 == null || (A0 = V62.A0()) == null || !A0.contains(azVar.f370372d)) ? false : true) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "[updateRoomFollowMember] watchMember: " + azVar.f370372d);
                        followedList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(azVar.f370372d, true));
                    }
                }
            }
        }
        com.tencent.mm.chatroom.ui.n9 n9Var = new com.tencent.mm.chatroom.ui.n9(this);
        com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference W6 = W6();
        if (W6 != null) {
            com.tencent.mm.storage.a3 V63 = V6();
            kotlin.jvm.internal.o.g(followedList, "followedList");
            java.util.ArrayList arrayList = W6.P;
            arrayList.clear();
            arrayList.addAll(followedList);
            W6.Q = V63;
            W6.R = n9Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] roomId:");
            com.tencent.mm.storage.a3 a3Var = W6.Q;
            sb6.append(a3Var != null ? a3Var.field_chatroomname : null);
            sb6.append(", followedList: ");
            sb6.append(followedList);
            com.tencent.mars.xlog.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", sb6.toString());
        }
        com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference W62 = W6();
        if (W62 != null) {
            W62.S = new com.tencent.mm.chatroom.ui.m9(this);
        }
        Y6();
        setBackBtn(new com.tencent.mm.chatroom.ui.u9(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f63880p) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63871d).getValue();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(checkBoxPreference != null && checkBoxPreference.N());
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63872e).getValue();
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(checkBoxPreference2 != null && checkBoxPreference2.N());
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63873f).getValue();
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(checkBoxPreference3 != null && checkBoxPreference3.N());
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
            kotlin.jvm.internal.o.f(num, "toString(...)");
            sb6.append(num);
            sb6.append(", roomName:");
            sb6.append(X6());
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.chatroom.ui.v9(this, booleanValue, booleanValue2, booleanValue3), w11.h2.f442050f);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        if (preference != null && (str = preference.f197780q) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "onPreferenceTreeClick: ".concat(str));
            int hashCode = str.hashCode();
            if (hashCode != -1805407402) {
                if (hashCode != 893847076) {
                    if (hashCode == 1512874101 && str.equals("still_notify_message_at_me_pref")) {
                        un.l lVar = (un.l) component(un.l.class);
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63871d).getValue();
                        lVar.R6(checkBoxPreference != null && checkBoxPreference.N(), un.i.f429284f);
                    }
                } else if (str.equals("still_notify_message_announcement_pref")) {
                    un.l lVar2 = (un.l) component(un.l.class);
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63873f).getValue();
                    lVar2.R6(checkBoxPreference2 != null && checkBoxPreference2.N(), un.i.f429286h);
                }
            } else if (str.equals("still_notify_message_at_all_pref")) {
                un.l lVar3 = (un.l) component(un.l.class);
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63872e).getValue();
                lVar3.R6(checkBoxPreference3 != null && checkBoxPreference3.N(), un.i.f429285g);
            }
            if (str.equals("still_notify_message_at_me_pref") || str.equals("still_notify_message_at_all_pref") || str.equals("still_notify_message_announcement_pref")) {
                this.f63880p = true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63880p = false;
        Y6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(un.l.class);
    }
}

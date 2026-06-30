package com.tencent.mm.chatroom.ui;

@java.lang.Deprecated
/* loaded from: classes11.dex */
public class RoomInfoDetailUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f63843d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f63844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63845f;

    /* renamed from: g, reason: collision with root package name */
    public int f63846g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f63847h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.preference.SignaturePreference f63848i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f63849m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f63850n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f63851o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f63852p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63853q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f63854r = false;

    public static void V6(com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI, android.app.ProgressDialog progressDialog) {
        c01.w9.h(roomInfoDetailUI.f63847h.d1(), new com.tencent.mm.chatroom.ui.a9(roomInfoDetailUI, progressDialog));
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String d17 = roomInfoDetailUI.f63847h.d1();
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(d17, 15);
    }

    public final boolean W6() {
        return (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p).field_chatroomdataflag & 2) == 0;
    }

    public final void X6() {
        if (this.f63843d) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f63845f, 0);
            int i17 = this.f63846g;
            if (i17 == 0) {
                setTitleMuteIconVisibility(0);
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f63849m;
                if (checkBoxPreference != null) {
                    checkBoxPreference.O(true);
                    sharedPreferences.edit().putBoolean("room_msg_notify", true).commit();
                }
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f63851o;
                if (checkBoxPreference2 != null) {
                    checkBoxPreference2.O(W6());
                }
            } else if (i17 == 1) {
                setTitleMuteIconVisibility(8);
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = this.f63849m;
                if (checkBoxPreference3 != null) {
                    checkBoxPreference3.O(false);
                    sharedPreferences.edit().putBoolean("room_msg_notify", false).commit();
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f63844e).m("room_show_msg_count", this.f63846g == 1);
        }
    }

    public final void Y6() {
        if (this.f63847h == null || this.f63848i == null) {
            return;
        }
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
        java.lang.String str = z07 == null ? "" : z07.field_selfDisplayName;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = c01.z1.l();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f63848i.H("");
            return;
        }
        com.tencent.mm.chatroom.ui.preference.SignaturePreference signaturePreference = this.f63848i;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str.length() <= 0) {
            str = getString(com.tencent.mm.R.string.iy8);
        }
        ((ke0.e) xVar).getClass();
        signaturePreference.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494916bi;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i77);
        this.f63844e = getPreferenceScreen();
        this.f63845f = getPackageName() + "_preferences";
        this.f63843d = getIntent().getBooleanExtra("Is_Chatroom", true);
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f63852p = stringExtra;
        if (stringExtra == null) {
            this.f63852p = getIntent().getStringExtra("Single_Chat_Talker");
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f63852p, true);
        this.f63847h = n17;
        if (this.f63843d) {
            this.f63846g = n17.T;
            this.f63848i = (com.tencent.mm.chatroom.ui.preference.SignaturePreference) ((com.tencent.mm.ui.base.preference.h0) this.f63844e).h("room_name");
            this.f63849m = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f63844e).h("room_msg_notify");
            this.f63851o = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f63844e).h("room_show_msg_count");
            this.f63850n = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f63844e).h("room_msg_show_username");
            this.f63851o.f197785v = false;
        } else {
            this.f63846g = 1;
        }
        setBackBtn(new com.tencent.mm.chatroom.ui.v8(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            return;
        }
        if (i17 == 1) {
            if (i18 == -1) {
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        if (i17 == 2 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Contact_Nick");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.lang.String r17 = c01.z1.r();
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
            if (z07 == null) {
                z07 = new com.tencent.mm.storage.a3();
            }
            z07.field_chatroomname = this.f63852p;
            z07.field_selfDisplayName = stringExtra;
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z07, new java.lang.String[0]);
            r45.on4 on4Var = new r45.on4();
            on4Var.f382378d = this.f63852p;
            on4Var.f382379e = r17;
            on4Var.f382380f = stringExtra;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(48, on4Var));
            Y6();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f63854r) {
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z07, new java.lang.String[0]);
            java.lang.String r17 = c01.z1.r();
            int i17 = z07.field_isShowname > 0 ? 1 : 0;
            r45.pn4 pn4Var = new r45.pn4();
            pn4Var.f383228d = this.f63852p;
            pn4Var.f383229e = r17;
            pn4Var.f383230f = 1;
            pn4Var.f383231g = i17;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(49, pn4Var));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("room_name")) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.tencent.mm.ui.r2.class);
            intent.putExtra("Contact_mode_name_type", 4);
            java.lang.String r17 = c01.z1.r();
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
            intent.putExtra("Contact_Nick", z07 == null ? "" : z07.field_selfDisplayName);
            intent.putExtra("Contact_User", r17);
            intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
            intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
            getContext().startActivityForResult(intent, 2);
        }
        if (str.equals("room_msg_show_username")) {
            com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
            z08.field_isShowname = (z08.field_isShowname > 0 ? 1 : 0) ^ 1;
            this.f63854r = true;
        }
        if (str.equals("room_msg_notify")) {
            this.f63846g = this.f63846g == 0 ? 1 : 0;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new mn.a(this.f63852p, this.f63846g, 0));
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f63852p, true);
            this.f63847h = n17;
            n17.J2(this.f63846g);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f63852p, this.f63847h);
            X6();
            this.f63847h = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f63852p, true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63844e).notifyDataSetChanged();
        }
        if (str.equals("room_set_chatting_background")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("isApplyToAll", false);
            intent2.putExtra(dm.i4.COL_USERNAME, this.f63847h.d1());
            j45.l.n(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent2, 1);
        }
        if (str.equals("room_clear_chatting_history")) {
            db5.e1.e(this, this.f63843d ? getString(com.tencent.mm.R.string.fc9) : getString(com.tencent.mm.R.string.fc7, this.f63847h.g2()), new java.lang.String[]{getString(com.tencent.mm.R.string.f492886i46)}, null, new com.tencent.mm.chatroom.ui.z8(this));
        }
        if (str.equals("room_placed_to_the_top")) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f63845f, 0);
            if (this.f63847h != null) {
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f63847h.d1())) {
                    c01.e2.B0(this.f63847h.d1(), true, true);
                } else {
                    c01.e2.t0(this.f63847h.d1(), true, true);
                }
                sharedPreferences.edit().putBoolean("room_placed_to_the_top", ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f63847h.d1())).commit();
            }
        }
        if ("room_show_msg_count".equals(str)) {
            boolean z17 = !W6();
            com.tencent.mm.storage.a3 z09 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63852p);
            if (z17) {
                if (z09.I0(z09.f193744b2)) {
                    z09.t0();
                }
                z09.field_chatroomdataflag = (z09.f193744b2.f330240e & (-3)) | 0;
            } else {
                if (z09.I0(z09.f193744b2)) {
                    z09.t0();
                }
                z09.field_chatroomdataflag = (z09.f193744b2.f330240e & (-3)) | 2;
            }
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z09, new java.lang.String[0]);
            java.lang.String r18 = c01.z1.r();
            r45.pn4 pn4Var = new r45.pn4();
            pn4Var.f383228d = this.f63852p;
            pn4Var.f383229e = r18;
            pn4Var.f383230f = 2;
            pn4Var.f383231g = z17 ? 2 : 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(49, pn4Var));
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f63851o;
            if (checkBoxPreference != null) {
                checkBoxPreference.O(z17);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f63844e).notifyDataSetChanged();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        Y6();
        if (this.f63847h != null && this.f63850n != null) {
            com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f63852p);
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f63845f, 0);
            if (W0.field_isShowname > 0) {
                this.f63850n.O(true);
                sharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
            } else {
                this.f63850n.O(false);
                sharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f63844e).notifyDataSetChanged();
    }
}

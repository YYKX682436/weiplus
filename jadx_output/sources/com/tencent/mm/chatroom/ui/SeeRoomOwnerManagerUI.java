package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class SeeRoomOwnerManagerUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63954d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63955e;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494922bo;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f492889i52);
        setBackBtn(new com.tencent.mm.chatroom.ui.ec(this));
        this.f63955e = getIntent().getStringExtra("RoomInfo_Id");
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63955e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.storage.a3 z07 = a17.z0(str);
        this.f63954d = z07;
        if (z07 != null) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
            preferenceTitleCategory.J(com.tencent.mm.R.string.f492907i72);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).d(preferenceTitleCategory, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomOwnerManagerUI", "[onCreate] owner:%s", this.f63954d.field_roomowner);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f63954d.field_roomowner, true);
            com.tencent.mm.chatroom.ui.fc fcVar = new com.tencent.mm.chatroom.ui.fc(this, getContext(), n17);
            fcVar.C(n17.d1());
            fcVar.i().putString(dm.i4.COL_USERNAME, n17.d1());
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String g27 = n17.g2();
            ((ke0.e) xVar).getClass();
            fcVar.L(com.tencent.mm.pluginsdk.ui.span.c0.i(context, g27));
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).d(fcVar, -1);
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory2 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
            preferenceTitleCategory2.J(com.tencent.mm.R.string.i58);
            boolean z18 = false;
            for (java.lang.String str2 : this.f63954d.A0()) {
                if (this.f63954d.G0(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomOwnerManagerUI", "[resetData] Room Manager:%s", str2);
                    if (!z18) {
                        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).d(preferenceTitleCategory2, -1);
                        z18 = true;
                    }
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    com.tencent.mm.chatroom.ui.gc gcVar = new com.tencent.mm.chatroom.ui.gc(this, getContext(), n18);
                    gcVar.C(str2);
                    gcVar.i().putString(dm.i4.COL_USERNAME, n18.d1());
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    androidx.appcompat.app.AppCompatActivity context2 = getContext();
                    java.lang.String g28 = n18.g2();
                    ((ke0.e) xVar2).getClass();
                    gcVar.L(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, g28));
                    ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).d(gcVar, -1);
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.storage.ya z07;
        if (!(preference instanceof com.tencent.mm.ui.base.preference.NormalIconPreference)) {
            return false;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(preference.i().getString(dm.i4.COL_USERNAME), true);
        java.lang.String d17 = n17.d1();
        java.lang.String g27 = n17.g2();
        java.lang.String P0 = n17.P0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g27) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            g27 = z07.field_conRemark;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        intent.putExtra("Contact_RemarkName", g27);
        com.tencent.mm.storage.a3 a3Var = this.f63954d;
        if (a3Var != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
        }
        intent.putExtra("Contact_Nick", P0);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", this.f63955e);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
        if (n18 != null && ((int) n18.E2) > 0 && n18.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = d17;
            setLocalQQMobileEvent.e();
        }
        if (n18 != null && n18.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n18.d1() + ",14");
        }
        intent.putExtra("Contact_Scene", 96);
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", this.f63955e);
        j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return false;
    }
}

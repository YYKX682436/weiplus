package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes9.dex */
public class q0 implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f235117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r35.a f235121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f235122g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, java.lang.String str2, r35.a aVar, long j17) {
        this.f235116a = i17;
        this.f235117b = abstractActivityC21394xb3d2c0cf;
        this.f235118c = z3Var;
        this.f235119d = str;
        this.f235120e = str2;
        this.f235121f = aVar;
        this.f235122g = j17;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        boolean a07 = c01.e2.a0();
        int i18 = this.f235116a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f235117b;
        if (a07 && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && i18 != 14 && i18 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtx));
            return true;
        }
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("room_name");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235118c;
        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || c01.e2.k() < Ni) ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.class : com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        if (i18 == 14 || i18 == 8) {
            intent.putExtra("Contact_RoomNickname", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_RoomNickname"));
        } else if (i18 == 17) {
            intent.putExtra("key_msg_id", abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("key_msg_id", 0L));
        }
        intent.putExtra("Contact_Scene", i18);
        intent.putExtra("room_name", stringExtra);
        intent.putExtra("source_from_user_name", this.f235119d);
        intent.putExtra("source_from_nick_name", this.f235120e);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        intent.putExtra("k_add_friend_verify_record_client_msg_id", this.f235121f.M);
        intent.putExtra("key_msg_id", this.f235122g);
        intent.putExtra("key_msg_talker", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_msg_talker"));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f235117b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList.toArray(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal$19", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$19", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

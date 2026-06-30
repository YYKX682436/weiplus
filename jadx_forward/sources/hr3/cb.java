package hr3;

/* loaded from: classes11.dex */
public class cb implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f364984c;

    public cb(hr3.eb ebVar, java.lang.String str, java.lang.String str2) {
        this.f364984c = ebVar;
        this.f364982a = str;
        this.f364983b = str2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        int i18;
        boolean a07 = c01.e2.a0();
        hr3.eb ebVar = this.f364984c;
        if (a07 && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && (i18 = ebVar.f365053f.N) != 14 && i18 != 30) {
            uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ebVar.f365053f.K1;
            c0Var.na(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtx));
            return true;
        }
        java.lang.String stringExtra = ebVar.f365053f.K1.getIntent().getStringExtra("room_name");
        android.content.Intent intent = new android.content.Intent(ebVar.f365053f.K1, (java.lang.Class<?>) ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(ebVar.f365053f.L.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.class : com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class));
        intent.putExtra("Contact_User", ebVar.f365053f.L.d1());
        intent.putExtra("Contact_Nick", ebVar.f365053f.L.P0());
        intent.putExtra("Contact_RemarkName", ebVar.f365053f.L.w0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = ebVar.f365053f;
        int i19 = c16861xdcf09668.N;
        if (i19 == 14 || i19 == 8) {
            intent.putExtra("Contact_RoomNickname", c16861xdcf09668.K1.getIntent().getStringExtra("Contact_RoomNickname"));
        }
        intent.putExtra("Contact_Scene", ebVar.f365053f.N);
        intent.putExtra("room_name", stringExtra);
        intent.putExtra("source_from_user_name", this.f364982a);
        intent.putExtra("source_from_nick_name", this.f364983b);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        ebVar.f365053f.K1.startActivityForResult(intent, 0);
        return true;
    }
}

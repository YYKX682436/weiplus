package t61;

/* loaded from: classes9.dex */
public class b implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t61.c f497517a;

    public b(t61.c cVar) {
        this.f497517a = cVar;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        t61.c cVar = this.f497517a;
        intent.putExtra("Contact_User", cVar.f497518d.f497527g.f474533a.f67922xdd77ad16);
        intent.putExtra("Contact_Nick", cVar.f497518d.f497527g.f474533a.f67923x21f9b213);
        intent.putExtra("Contact_Scene", 17);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", cVar.f497518d.f497527g.f474533a.f67928x11bb99f1);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        j45.l.j(cVar.f497519e.f497520a.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(cVar.f497518d.f497527g.f474533a.f67922xdd77ad16) || Ni != 1) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(cVar.f497518d.f497527g.f474533a.f67922xdd77ad16) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, null);
        return true;
    }
}

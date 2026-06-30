package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class t5 implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u5 f224547a;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u5 u5Var) {
        this.f224547a = u5Var;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u5 u5Var = this.f224547a;
        intent.putExtra("Contact_User", u5Var.f224559d.f224266s);
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("AntispamTicket", str3);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        j45.l.j(u5Var.f224559d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(u5Var.f224559d.f224266s) || Ni != 1) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(u5Var.f224559d.f224266s) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, null);
        return true;
    }
}

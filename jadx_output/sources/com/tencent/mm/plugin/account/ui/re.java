package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class re implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.in5 f74169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f74170e;

    public re(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI, r45.in5 in5Var) {
        this.f74170e = regAffiliateAccountUI;
        this.f74169d = in5Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f74170e;
        regAffiliateAccountUI.f73555n.dismiss();
        if (i17 == 0 && i18 == 0) {
            r45.jn5 jn5Var = (r45.jn5) oVar.f70711b.f70700a;
            int i19 = regAffiliateAccountUI.f73556o;
            if (i19 == 0 || i19 == 1) {
                c01.uc ucVar = c01.uc.f37514c;
                ucVar.b(c01.z1.r(), jn5Var.f377971d);
                ucVar.g(c01.z1.r(), c01.z1.q());
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("login_weixin_username", jn5Var.f377971d);
                hashMap.put("login_user_name", jn5Var.f377971d);
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                java.lang.String i27 = com.tencent.mm.modelavatar.d1.Ai().i(jn5Var.f377971d, false, false);
                com.tencent.mm.vfs.w6.w(lp0.b.j() + "temp.avatar", i27);
                hashMap.put("last_avatar_path", i27);
                hashMap.put("last_logout_no_pwd_ticket", jn5Var.f377972e);
                hashMap.put("last_login_nick_name", this.f74169d.f377172d);
                hashMap.put("last_login_uin", new kk.v(jn5Var.f377973f).toString());
                ucVar.g(jn5Var.f377971d, hashMap);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("SWITCH_TO_USERNAME", jn5Var.f377971d);
            intent.putExtra("Contact_Finder_Buffer", x51.j1.e(jn5Var.f377974g, new byte[0]));
            regAffiliateAccountUI.setResult(-1, intent);
            regAffiliateAccountUI.finish();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, regAffiliateAccountUI.f73558q, wo.w0.k(), 0, 3, 1006, 10602, null, java.lang.Integer.valueOf(regAffiliateAccountUI.f73556o));
        } else {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(regAffiliateAccountUI.getContext(), null, null);
            }
        }
        return 0;
    }
}

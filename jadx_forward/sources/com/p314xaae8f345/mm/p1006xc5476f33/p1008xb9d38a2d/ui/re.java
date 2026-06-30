package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class re implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.in5 f155702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 f155703e;

    public re(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648, r45.in5 in5Var) {
        this.f155703e = activityC11459xde004648;
        this.f155702d = in5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648 = this.f155703e;
        activityC11459xde004648.f155088n.dismiss();
        if (i17 == 0 && i18 == 0) {
            r45.jn5 jn5Var = (r45.jn5) oVar.f152244b.f152233a;
            int i19 = activityC11459xde004648.f155089o;
            if (i19 == 0 || i19 == 1) {
                c01.uc ucVar = c01.uc.f119047c;
                ucVar.b(c01.z1.r(), jn5Var.f459504d);
                ucVar.g(c01.z1.r(), c01.z1.q());
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("login_weixin_username", jn5Var.f459504d);
                hashMap.put("login_user_name", jn5Var.f459504d);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                java.lang.String i27 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(jn5Var.f459504d, false, false);
                com.p314xaae8f345.mm.vfs.w6.w(lp0.b.j() + "temp.avatar", i27);
                hashMap.put("last_avatar_path", i27);
                hashMap.put("last_logout_no_pwd_ticket", jn5Var.f459505e);
                hashMap.put("last_login_nick_name", this.f155702d.f458705d);
                hashMap.put("last_login_uin", new kk.v(jn5Var.f459506f).m143587x9616526c());
                ucVar.g(jn5Var.f459504d, hashMap);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("SWITCH_TO_USERNAME", jn5Var.f459504d);
            intent.putExtra("Contact_Finder_Buffer", x51.j1.e(jn5Var.f459507g, new byte[0]));
            activityC11459xde004648.setResult(-1, intent);
            activityC11459xde004648.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, activityC11459xde004648.f155091q, wo.w0.k(), 0, 3, 1006, 10602, null, java.lang.Integer.valueOf(activityC11459xde004648.f155089o));
        } else {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(activityC11459xde004648.mo55332x76847179(), null, null);
            }
        }
        return 0;
    }
}

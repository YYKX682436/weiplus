package kf3;

/* loaded from: classes8.dex */
public class b2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388855a;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679) {
        this.f388855a = activityC16488xbf7e6679;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void C() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void a() {
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
        j45.l.j(this.f388855a, "subapp", ".ui.openapi.AddAppUI", new android.content.Intent(), null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574014gt2), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void c(int i17) {
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enable_send_as_file", false);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(activityC16488xbf7e6679, 1, 1, 3, 3, false, intent);
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(lp0.b.m());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e66792 = this.f388855a;
        if (!F) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (!(m18.a() ? m18.f294799a.r(m18.f294800b) : false)) {
                dp.a.m125854x26a183b(activityC16488xbf7e66792, activityC16488xbf7e66792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b69), 1).show();
                return;
            }
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16488xbf7e66792.mo55332x76847179();
        ((sb0.f) jVar).getClass();
        boolean a18 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activityC16488xbf7e66792.mo55332x76847179());
        if (a18) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.f230072v;
            activityC16488xbf7e66792.d7();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void e() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void g() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void h(int i17, long j17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574014gt2), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void j() {
        qk.z zVar = new qk.z();
        zVar.f445688a = 13;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(this.f388855a, zVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void k(int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.f230072v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        activityC16488xbf7e6679.getClass();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(activityC16488xbf7e6679, "android.permission.CAMERA", 18, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activityC16488xbf7e6679);
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 1, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(1, i17);
            java.lang.String str = activityC16488xbf7e6679.f230074e;
            kk.l lVar = t21.w2.f496589c;
            java.lang.String a18 = t21.c3.a(str);
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, a18, true);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a18, true);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16528xd9aafd63.f230352f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(rj6, tj6, c11120x15dce88d, c11120x15dce88d.f152728h * 1000, 1);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_ignore_remux_without_edit, false)) {
                g17.f237202d = 2;
            }
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.Map map = c10402x5bc41468.f146312h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            g17.f237210o = c10402x5bc41468;
            if (fj6) {
                ut3.m.f512715a.d(activityC16488xbf7e6679, 9, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, g17, 0);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.k(activityC16488xbf7e6679, 8, new android.content.Intent(), 1, activityC16488xbf7e6679.f230074e, 0, "");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void l(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gta), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void m() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574014gt2), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574014gt2), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void p() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtg), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtb), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void s() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void t() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void u(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388855a;
        dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gti), 0).show();
    }
}

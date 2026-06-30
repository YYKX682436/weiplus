package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657 f252873d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657 activityC18439x36286657) {
        this.f252873d = activityC18439x36286657;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$1");
        g4Var.clear();
        java.lang.String stringExtra = this.f252873d.getIntent().getStringExtra("key_ws_detail_username");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            pc4.d dVar = pc4.d.f434943a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserExpireTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).j("KVWsUserTimeKey");
            r45.rb6 rb6Var = new r45.rb6();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(j17)) {
                rb6Var.mo11468x92b714fd(j17);
            }
            java.util.LinkedList entries = rb6Var.f466239d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entries, "entries");
            java.util.Iterator it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.sb6) obj).f467150d, stringExtra)) {
                        break;
                    }
                }
            }
            r45.sb6 sb6Var = (r45.sb6) obj;
            long j18 = sb6Var != null ? sb6Var.f467151e : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserExpireTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            xa4.b bVar = xa4.b.f534354a;
            if (j18 == 0) {
                g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.okn);
                bVar.g("view_exp", 1);
            } else if (currentTimeMillis >= j18) {
                pc4.d dVar2 = pc4.d.f434943a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1);
                byte[] j19 = J2.j("KVWsUserTimeKey");
                r45.rb6 rb6Var2 = new r45.rb6();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(j19)) {
                    rb6Var2.mo11468x92b714fd(j19);
                }
                java.util.ListIterator listIterator = rb6Var2.f466239d.listIterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listIterator, "listIterator(...)");
                while (true) {
                    if (!listIterator.hasNext()) {
                        J2.H("KVWsUserTimeKey", rb6Var2.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        break;
                    }
                    r45.sb6 sb6Var2 = (r45.sb6) listIterator.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sb6Var2.f467150d, stringExtra)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "[wsAvoidFold] updateIsNotFirstTime update: userName: " + sb6Var2.f467150d + " isNotFirstTime old:" + sb6Var2.f467152f + " new:true}");
                        sb6Var2.f467152f = true;
                        J2.H("KVWsUserTimeKey", rb6Var2.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        break;
                    }
                }
                g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.okm);
                bVar.g("view_exp", 2);
            } else {
                g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.okj);
                bVar.g("view_exp", 3);
            }
            bVar.g("view_exp", 4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$1");
    }
}

package f14;

@j95.b
/* loaded from: classes9.dex */
public class j extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f340220e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.z0 f340221d = new f14.i(this);

    public static void wi() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_APPLY_LINK_STRING, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262157, false);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_CLIENT_VERSION_INT, java.lang.Integer.valueOf(o45.wf.f424562g))).intValue();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L)).longValue();
        if (intValue <= o45.wf.f424562g || longValue < java.lang.System.currentTimeMillis()) {
            wi();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset flavorBlueCV: " + ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FLAVOR_BLUE_CLIENT_VERSION_INT, 0)).intValue() + ",CLIENT_VERSION:" + o45.wf.f424562g);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(14, null));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("updateNotificationShowDetail_" + gm0.m.i()).getBoolean("notification_show_detail", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "prevCV:%s, uploadStatus:%s", java.lang.Integer.valueOf(q17), java.lang.Boolean.valueOf(z17));
        if (q17 == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
        }
        if (gm0.j1.b().f354777g.f354790a) {
            gm0.j1.u().c().w(34, java.lang.Integer.valueOf(c01.z1.n() & (-1048577) & (-4194305)));
            r45.u85 u85Var = new r45.u85();
            u85Var.f468669d = 1048576;
            u85Var.f468670e = 0;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
            r45.u85 u85Var2 = new r45.u85();
            u85Var2.f468669d = 4194304;
            u85Var2.f468670e = 0;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "set void default open");
            if (!new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreSetting", "sys notification disable！");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 18L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "is update from %s", java.lang.Integer.valueOf(gm0.j1.b().f354777g.f354791b));
            java.util.HashSet hashSet = (java.util.HashSet) c01.uc.f119047c.d();
            if (hashSet.size() == 2) {
                java.lang.String[] strArr = new java.lang.String[2];
                java.util.Iterator it = hashSet.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    strArr[i17] = c01.uc.f119047c.c((java.lang.String) it.next(), "login_user_name");
                    i17++;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr[0], strArr[1]) && strArr[0].equals(strArr[1])) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreSetting", "old dirty data!!!");
                    c01.uc ucVar = c01.uc.f119047c;
                    ucVar.i(strArr[0]);
                    ucVar.i(strArr[1]);
                }
            }
            if (q17 != 0 && !z17 && c01.z1.e() == 1) {
                boolean a17 = ip.b.a();
                int p17 = c01.z1.p();
                int i18 = !a17 ? p17 | 2048 : p17 & (-2049);
                int i19 = a17 ? 2 : 1;
                r45.p53 p53Var = new r45.p53();
                p53Var.f464294d = 10;
                p53Var.f464295e = i19;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                gm0.j1.u().c().w(7, java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "upload Notification show detail: %s", java.lang.Boolean.valueOf(a17));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
            }
        } else if (q17 != 0 && !z17 && c01.z1.e() == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1 && (c01.z1.p() & 32) == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f340221d);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5.f291932x = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_keyboard_version_switch, 1);
        com.p314xaae8f345.mm.ui.p2740x696c9db.b5.f291831b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_keyboard_apply_windowinsets_switch, 1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294011b = j62.e.g().i("clicfg_open_wesnackbar_and", 1, false, true) == 1;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + java.lang.System.currentTimeMillis());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f340221d);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
    }
}

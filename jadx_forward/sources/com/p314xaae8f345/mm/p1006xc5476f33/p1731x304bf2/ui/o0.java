package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba f223222d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba activityC15949x2763f3ba) {
        this.f223222d = activityC15949x2763f3ba;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.Class<lt.i0> cls;
        java.lang.String str2;
        byte[] D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_index_4");
        if (D0 == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m0(this));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n0(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x1(D0, false)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba activityC15949x2763f3ba = this.f223222d;
        wi6.a(activityC15949x2763f3ba);
        java.util.LinkedList e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.e(activityC15949x2763f3ba);
        boolean z17 = r53.f.f474186a;
        java.lang.Class<lt.i0> cls2 = lt.i0.class;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(e17)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                ((kt.c) ((lt.i0) i95.n0.c(cls2))).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str3);
                if (h17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67384x996f3ea)) {
                    linkedList.add(str3);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                zo3.p.Ui().c(linkedList);
            }
        }
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e3(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.e(activityC15949x2763f3ba), activityC15949x2763f3ba.f222234m, activityC15949x2763f3ba.f222235n, activityC15949x2763f3ba.f222236o, activityC15949x2763f3ba.f222232h));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15949x2763f3ba.mo55332x76847179();
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.String str4 = "game_center_pref";
        android.content.SharedPreferences sharedPreferences = mo55332x76847179.getSharedPreferences("game_center_pref", 0);
        java.lang.String string = sharedPreferences.getString("download_app_id_time_map", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            str = "game_center_pref";
        } else {
            java.lang.String[] split = string.split(",");
            java.lang.String str5 = new java.lang.String();
            int length = split.length;
            int i17 = 0;
            while (i17 < length) {
                java.lang.String str6 = split[i17];
                java.lang.String[] split2 = str6.split("-");
                java.lang.String str7 = split2[0];
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    ((kt.c) ((lt.i0) i95.n0.c(cls2))).getClass();
                    if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(mo55332x76847179, str7)) {
                        cls = cls2;
                        str2 = str4;
                        if (currentTimeMillis - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split2[1], 0L) < 86400) {
                            str5 = str5 + str6 + ",";
                        } else {
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str7);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", java.lang.Integer.valueOf(q17.f178496f), java.lang.Long.valueOf(q17.f178494d));
                            int i18 = q17.f178496f;
                            if (i18 == 2) {
                                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q17.f178494d);
                            } else if ((i18 == 0 || i18 == 4) && com.p314xaae8f345.mm.vfs.w6.j(q17.f178497g)) {
                                com.p314xaae8f345.mm.vfs.w6.h(q17.f178497g);
                            }
                        }
                        i17++;
                        cls2 = cls;
                        str4 = str2;
                    }
                }
                cls = cls2;
                str2 = str4;
                i17++;
                cls2 = cls;
                str4 = str2;
            }
            str = str4;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                if (str5.charAt(str5.length() - 1) == ',') {
                    str5 = str5.substring(0, str5.length() - 1);
                }
                sharedPreferences.edit().putString("download_app_id_time_map", str5.toString()).apply();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str, 0).edit().putString("game_center_pref_lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()).commit();
        r53.b.f474173a.b();
    }
}

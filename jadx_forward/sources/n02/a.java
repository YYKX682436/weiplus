package n02;

/* loaded from: classes8.dex */
public class a implements vz.k1 {
    @Override // vz.k1
    public void Z(int i17, long j17) {
        boolean z17;
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178865a;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && (z17 = c17.f68423x7e6ed12a) && i17 != 9) {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.f178788a;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadNotificationManager", "updateNotification not from download app");
            } else if (!c17.f68405x56e99a7c || c17.f68441x10a0fed7 == 3) {
                long j18 = c17.f68443x78351860;
                int i18 = j18 > 0 ? (int) ((c17.f68413xf432b5ad * 100) / j18) : 0;
                z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
                java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.f178788a;
                java.util.HashMap hashMap = (java.util.HashMap) map2;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(c17.f68411x238eb002);
                if (l17 == null) {
                    l17 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    hashMap.put(c17.f68411x238eb002, l17);
                }
                k0Var.D.when = l17.longValue();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68428x579b8428)) {
                    k0Var.f(c17.f68418xf1e8cfcc);
                } else {
                    k0Var.f(c17.f68428x579b8428);
                }
                int i19 = c17.f68441x10a0fed7;
                if (i19 == 1) {
                    k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    boolean z18 = i18 == 0;
                    k0Var.f551003n = 100;
                    k0Var.f551004o = i18;
                    k0Var.f551005p = z18;
                    if (c17.f68431x4651c731) {
                        k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cem) + "·" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cek));
                    } else {
                        k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cek));
                    }
                    k0Var.h(2, true);
                    k0Var.f550996g = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.b(c17.f68404x28d45f97);
                } else if (i19 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.a(c17.f68411x238eb002);
                } else if (i19 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.a(c17.f68411x238eb002);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68428x579b8428)) {
                        k0Var2.f(c17.f68418xf1e8cfcc);
                    } else {
                        k0Var2.f(c17.f68428x579b8428);
                    }
                    k0Var2.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                    k0Var2.d(true);
                    android.content.Intent intent = new android.content.Intent();
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    intent.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13219x837298b0.class);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 3);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178491o, c17.f68419xf1e9b966);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178492p, c17.f68426x4b6e68b9);
                    intent.putExtra("downloadId", c17.f68408x32b20428);
                    k0Var2.f550996g = android.app.PendingIntent.getBroadcast(context2, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
                    if (c17.f68431x4651c731) {
                        k0Var2.e(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bri));
                    } else if (c17.f68405x56e99a7c) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68428x579b8428)) {
                            k0Var2.f(c17.f68418xf1e8cfcc + " · " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cef));
                        } else {
                            k0Var2.f(c17.f68428x579b8428 + " · " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cef));
                        }
                        k0Var2.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cee));
                    } else {
                        k0Var2.e(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cej));
                    }
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(k0Var2.b(), true);
                } else if (i19 == 4) {
                    k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                    k0Var.d(true);
                    k0Var.f550996g = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.b(c17.f68404x28d45f97);
                    int i27 = c17.f68416x1c571ead;
                    if (i27 == 806 || i27 == 802) {
                        k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.haw));
                    } else {
                        long j19 = c17.f68408x32b20428;
                        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178649a;
                        if (!(java.lang.System.currentTimeMillis() - j19 <= 259200000)) {
                            k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hat));
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                            k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hau));
                        } else {
                            k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hav));
                        }
                    }
                    k0Var.f550996g = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.b(c17.f68404x28d45f97);
                } else if (i19 != 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.a(c17.f68411x238eb002);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.a(c17.f68411x238eb002);
                }
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.f178790c) {
                    java.util.Map map3 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.b.f178789b;
                    java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map3).get(c17.f68411x238eb002);
                    if (num == null) {
                        ((java.util.HashMap) map3).put(c17.f68411x238eb002, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(k0Var.b(), true)));
                    } else {
                        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(num.intValue(), k0Var.b(), true);
                    }
                    if (c17.f68441x10a0fed7 == 4) {
                        ((java.util.HashMap) map3).remove(c17.f68411x238eb002);
                        ((java.util.HashMap) map2).remove(c17.f68411x238eb002);
                    }
                }
            }
        }
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178870f.iterator();
        while (it.hasNext()) {
            ((r02.t0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s) it.next())).a(i17, j17);
        }
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.u.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it6;
            if (!fVar.hasNext()) {
                return;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((n02.e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.u) ((fs.n) qVar.get()))).Z(i17, j17);
            }
        }
    }
}

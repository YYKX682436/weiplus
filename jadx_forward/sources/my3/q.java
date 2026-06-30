package my3;

@j95.b
/* loaded from: classes13.dex */
public final class q extends i95.w implements fy3.e {

    /* renamed from: h, reason: collision with root package name */
    public int f414358h;

    /* renamed from: p, reason: collision with root package name */
    public boolean f414363p;

    /* renamed from: q, reason: collision with root package name */
    public int f414364q;

    /* renamed from: s, reason: collision with root package name */
    public fy3.f f414366s;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2037x7643c6b5.C17253x84d010ab f414372y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f414354d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f414355e = "";

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f414356f = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);

    /* renamed from: g, reason: collision with root package name */
    public ky3.b f414357g = new ky3.b();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f414359i = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Intent f414360m = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2037x7643c6b5.ServiceC17254x6e17a839.class);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f414361n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ly3.n f414362o = new ly3.n();

    /* renamed from: r, reason: collision with root package name */
    public fy3.i f414365r = fy3.i.f348778d;

    /* renamed from: t, reason: collision with root package name */
    public final my3.i f414367t = new my3.i(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f414368u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new my3.o(this), false);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f414369v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new my3.e(this), false);

    /* renamed from: w, reason: collision with root package name */
    public final my3.e0 f414370w = new my3.e0(new my3.g(this));

    /* renamed from: x, reason: collision with root package name */
    public final fy3.g f414371x = new my3.k(this);

    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.plugin.rtos.service.RtosServiceImpl$webWXLogoutListener$1] */
    public q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "RtosServiceImpl init");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f414372y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5953x3869d184>(a0Var) { // from class: com.tencent.mm.plugin.rtos.service.RtosServiceImpl$webWXLogoutListener$1
            {
                this.f39173x3fe91575 = 1984026996;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5953x3869d184 c5953x3869d184) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5953x3869d184 event = c5953x3869d184;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebWXLogout deviceTypeId ");
                am.is isVar = event.f136252g;
                sb6.append(isVar.f88503a);
                sb6.append(" bound ");
                my3.q qVar = my3.q.this;
                sb6.append(qVar.f414363p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", sb6.toString());
                if (isVar.f88503a != 31) {
                    return false;
                }
                qVar.Zi(3);
                return false;
            }
        };
    }

    public static final void Ai(my3.q qVar, java.lang.String str, java.lang.String str2) {
        qVar.getClass();
        java.lang.String k17 = gm0.j1.b().k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "rtosLogin scanMac:" + str + " ticket:" + str2 + " username:" + k17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "username or ticket is empty");
            qVar.fj(0, 7);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66875xa013b0d5, k17);
            bundle.putString("ticket", str2);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, bundle, iy3.k.class, new my3.j(qVar, str, k17));
        }
    }

    public static final void Bi(my3.q qVar, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putString;
        android.content.SharedPreferences.Editor putString2;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "saveRtosBindInfo mac:%s username:%s", str, str2);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, str)) != null && (putString2 = putString.putString(dm.i4.f66875xa013b0d5, str2)) != null) {
            putString2.commit();
        }
        qVar.f414354d = str;
        qVar.f414355e = str2;
    }

    public static final void Di(my3.q qVar, fy3.g gVar) {
        my3.e0 e0Var = qVar.f414370w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startAndBindService");
        java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f414359i;
        reentrantLock.lock();
        try {
            qVar.Ri(fy3.i.f348781g);
            if (!e0Var.f414333e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "start service count = " + qVar.f414364q);
                if (qVar.f414364q == 0) {
                    qVar.f414368u.c(300000L, 300000L);
                }
                qVar.f414364q++;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.Intent intent = qVar.f414360m;
                context.startService(intent);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.bindService(intent, e0Var, 1);
                if (gVar != null) {
                    qVar.f414361n.add(gVar);
                }
                qVar.f414369v.c(60000L, 60000L);
            } else if (gVar != null) {
                ((my3.k) gVar).a();
            }
            ky3.b bVar = qVar.f414357g;
            if (bVar.f395148b == 0) {
                bVar.f395148b = java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Rtos.RtosServiceImpl", e17, "tryStartService fail.", new java.lang.Object[0]);
            qVar.Ri(fy3.i.f348779e);
        }
        reentrantLock.unlock();
    }

    public static final void wi(my3.q qVar, int i17) {
        ky3.b bVar = qVar.f414357g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ky3.b bVar2 = qVar.f414357g;
        bVar.f395149c = currentTimeMillis - bVar2.f395148b;
        bVar2.f395148b = 0L;
        bVar2.f395150d = i17;
        bVar2.f395147a = 0;
        qVar.hj(bVar2);
    }

    public final void Ni() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putBoolean;
        android.content.SharedPreferences.Editor edit2;
        android.content.SharedPreferences.Editor putBoolean2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "autoCheckNeedStartUp");
        Ri(fy3.i.f348778d);
        ly3.m mVar = ly3.m.f403806a;
        java.lang.String str = ly3.m.f403807b;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            java.lang.String str2 = ly3.m.f403808c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResFileUtil", "moveSoRes " + str2 + " result " + com.p314xaae8f345.mm.vfs.w6.v(str, str2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResFileUtil", str + " not exists, ignore");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResFileUtil", "begin checkOldSo");
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(ly3.m.f403808c, true);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (!x1Var.f294769f) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name:");
                    java.lang.String str3 = x1Var.f294765b;
                    sb6.append(str3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResFileUtil", sb6.toString());
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "libwechat_rtos_service.so") && x1Var.f294766c > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResFileUtil", "so too big so delete, result=" + x1Var.b(true));
                    }
                }
            }
        }
        ky3.b bVar = this.f414357g;
        boolean z17 = false;
        bVar.f395147a = 0;
        bVar.f395148b = 0L;
        bVar.f395149c = 0L;
        bVar.f395150d = 0;
        bVar.f395151e = 0;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_rtos_account", 0);
        boolean z18 = sharedPreferences != null && sharedPreferences.getBoolean("had_inserted_notification", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "storeMac:" + this.f414354d + ", username:" + this.f414355e);
        if (!(this.f414355e.length() > 0)) {
            if (!(this.f414354d.length() > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "no username or mac");
                java.lang.String path = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/.alita/users/ac.db";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path));
                if (r6Var.m()) {
                    if (java.lang.System.currentTimeMillis() - r6Var.B() <= 259200000) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "user had not user rtos beyond 3 days");
                } else if (!Ui() && !z18) {
                    if (sharedPreferences != null && (edit2 = sharedPreferences.edit()) != null && (putBoolean2 = edit2.putBoolean("had_inserted_notification", true)) != null) {
                        putBoolean2.commit();
                    }
                    cj();
                    Ri(fy3.i.f348779e);
                }
                oj();
                return;
            }
        }
        if (Ui()) {
            bj();
            return;
        }
        if (!z18) {
            if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("had_inserted_notification", true)) != null) {
                putBoolean.commit();
            }
            cj();
        }
        Ri(fy3.i.f348779e);
    }

    public final void Ri(fy3.i status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "changeRtosLoginStatus " + this.f414365r + " -> " + status);
        this.f414365r = status;
    }

    public boolean Ui() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            boolean z17 = b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.BLUETOOTH_SCAN") == 0;
            boolean z18 = b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.BLUETOOTH_ADVERTISE") == 0;
            r2 = b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.BLUETOOTH_CONNECT") == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "SDK_INT >= 31 hasScan:" + z17 + " hasAdvertise:" + z18 + " hasConnect:" + r2);
        }
        return r2;
    }

    public void Vi() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor remove;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "cleanRtosBindUserName");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (remove = edit.remove(dm.i4.f66875xa013b0d5)) != null) {
            remove.commit();
        }
        this.f414355e = "";
    }

    public void Zi(int i17) {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor remove;
        android.content.SharedPreferences.Editor remove2;
        android.content.SharedPreferences.Editor remove3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "clearRtosBindInfo");
        Ri(fy3.i.f348778d);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (remove = edit.remove(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb)) != null && (remove2 = remove.remove(dm.i4.f66875xa013b0d5)) != null && (remove3 = remove2.remove("had_inserted_notification")) != null) {
            remove3.commit();
        }
        this.f414354d = "";
        this.f414355e = "";
        rk0.c.a("MicroMsg.Rtos.UnbindReport", "reportUnbindReason: " + i17, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), 0);
    }

    public final void aj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "closeRtos errorCode " + i17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 0);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, bundle, iy3.i.class, new my3.f(this));
    }

    public final void bj() {
        Ri(fy3.i.f348780f);
        ly3.n nVar = this.f414362o;
        nVar.getClass();
        my3.i callback = this.f414367t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResMgr", "manualCheckSoRes");
        nVar.f403810b.j(callback);
    }

    public final void cj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "insertNotificationToWeixin");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.j1(2);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.m124850x7650bebc(1);
        f9Var.u1("weixin");
        f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575177n30));
        c01.w9.x(f9Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("weixin");
        if (p17 != null) {
            p17.l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575177n30));
            p17.Y1(p17.d1() + 1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "weixin");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575177n30));
            l4Var.b2("weixin");
            l4Var.Y1(1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
        }
    }

    public final void fj(int i17, int i18) {
        Ri(fy3.i.f348779e);
        fy3.f fVar = this.f414366s;
        if (fVar != null) {
            oy3.t tVar = (oy3.t) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onGetIlinkDeviceOauthTicket errorType:" + i17 + " errorCode:" + i18);
            if (i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = tVar.f431577a;
                activityC17256xc70b42d4.f240140y = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onGetTicketFailEvent");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("error_type", i17);
                bundle.putInt(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, bundle, iy3.w.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.U6(activityC17256xc70b42d4, activityC17256xc70b42d4.f240140y);
            }
        }
    }

    public void hj(ky3.b p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        this.f414357g = p17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, java.lang.Integer.valueOf(p17.f395147a), java.lang.Long.valueOf(p17.f395149c), java.lang.Integer.valueOf(p17.f395150d), java.lang.Integer.valueOf(p17.f395151e));
    }

    public final void ij(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startConnectWatch mac:" + str + " avatar:" + str2 + ", isFromScan: " + z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, str);
        bundle.putString("avatar", str2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, bundle, iy3.d.class, new my3.l(z17, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r1.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList ignore. empty list.");
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList " + r1.size());
        r0 = new com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1(r1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList list " + r0.f240117d.size() + " username " + r12.f414355e + ", mac:" + r12.f414354d + " code " + r12.f414357g.f395150d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cd, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12.f414355e) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12.f414354d) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        r1 = r12.f414357g.f395150d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dc, code lost:
    
        if (r1 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r1 != 10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, r0, iy3.z.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r11.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r2 = r11.getInt(r11.getColumnIndex("orderIndex"));
        r3 = r11.getString(r11.getColumnIndex("quickMsg"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, "getString(...)");
        r1.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63(r2, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r11.moveToNext() != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mj() {
        /*
            r12 = this;
            ny3.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r9 = "orderIndex ASC"
            r11 = 0
            l75.k0 r2 = r0.f422974d     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = "RtosQuickReplyInfo"
            r4 = 0
            r7 = 0
            r8 = 0
            r10 = 2
            android.database.Cursor r11 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r11 == 0) goto L4d
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r0 == 0) goto L4d
        L26:
            com.tencent.mm.plugin.rtos.model.RtosQuickReply r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReply     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r2 = "orderIndex"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            int r2 = r11.getInt(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = "quickMsg"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r4 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r1.add(r0)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r0 != 0) goto L26
        L4d:
            if (r11 == 0) goto L64
            goto L61
        L50:
            r0 = move-exception
            goto Lea
        L53:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0)     // Catch: java.lang.Throwable -> L50
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L64
        L61:
            r11.close()
        L64:
            boolean r0 = r1.isEmpty()
            java.lang.String r2 = "MicroMsg.Rtos.RtosServiceImpl"
            if (r0 == 0) goto L76
            java.lang.String r0 = "syncQuickReplyList ignore. empty list."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "syncQuickReplyList "
            r0.<init>(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            com.tencent.mm.plugin.rtos.model.RtosQuickReplyList r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReplyList
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "syncQuickReplyList list "
            r1.<init>(r3)
            java.util.ArrayList r3 = r0.f240117d
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = " username "
            r1.append(r3)
            java.lang.String r3 = r12.f414355e
            r1.append(r3)
            java.lang.String r3 = ", mac:"
            r1.append(r3)
            java.lang.String r3 = r12.f414354d
            r1.append(r3)
            java.lang.String r3 = " code "
            r1.append(r3)
            ky3.b r3 = r12.f414357g
            int r3 = r3.f395150d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r1 = r12.f414355e
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto Le9
            java.lang.String r1 = r12.f414354d
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto Le9
            ky3.b r1 = r12.f414357g
            int r1 = r1.f395150d
            r2 = 1
            if (r1 == r2) goto Le2
            r2 = 10
            if (r1 != r2) goto Le9
        Le2:
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e
            java.lang.Class<iy3.z> r2 = iy3.z.class
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(r1, r0, r2)
        Le9:
            return
        Lea:
            if (r11 == 0) goto Lef
            r11.close()
        Lef:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: my3.q.mj():void");
    }

    public final void nj(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66875xa013b0d5, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "tryAutoLogin mac:" + str + " username:" + str2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, bundle, iy3.l.class, new my3.p(this, str, str2));
    }

    public void oj() {
        this.f414369v.d();
        my3.e0 e0Var = this.f414370w;
        if (e0Var.f414333e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "tryStopService");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(this.f414360m);
            if (this.f414363p) {
                this.f414363p = false;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(e0Var);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onAccountInitialized");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_rtos_account", 0);
        java.lang.String string = sharedPreferences != null ? sharedPreferences.getString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, "") : null;
        if (string == null) {
            string = "";
        }
        this.f414354d = string;
        java.lang.String string2 = sharedPreferences != null ? sharedPreferences.getString(dm.i4.f66875xa013b0d5, "") : null;
        this.f414355e = string2 != null ? string2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "storeMac " + this.f414354d + ", storeUsername " + this.f414355e);
        Ni();
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onAccountReleased");
        mo48814x2efc64();
        oj();
    }
}

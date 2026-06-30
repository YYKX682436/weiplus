package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes14.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f, android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g f258689d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b f258690e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f258691f;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f258693h;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f258695m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f258696n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f258698p;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f258702t;

    /* renamed from: y, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f258707y;

    /* renamed from: g, reason: collision with root package name */
    public boolean f258692g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f258694i = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f258697o = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f258699q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f258700r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f258701s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f258703u = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f258704v = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.l(this);

    /* renamed from: w, reason: collision with root package name */
    public int f258705w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f258706x = false;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, boolean z18, boolean z19) {
        this.f258702t = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", vq4.n0.d(i17), z3Var.d1(), java.lang.Boolean.valueOf(z17));
        this.f258695m = z3Var;
        this.f258689d = gVar;
        this.f258696n = z17;
        this.f258698p = z18;
        this.f258702t = z19;
        z1(0, i17);
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.NewVoipSmallWindow");
        this.f258693h = newWakeLock;
        yj0.a.c(newWakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        newWakeLock.acquire();
        yj0.a.f(newWakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void H5(int i17, java.lang.String str) {
        if (i17 == 235) {
            return;
        }
        if (i17 == 233) {
            gq4.v.Bi().f258091a.f257944a.f258065x.M1.f258259m = 1;
        } else if (i17 == 237) {
            u11.c.i();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public android.content.Context J4() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void K(int i17) {
        int i18 = this.f258705w;
        if (i18 != -1 && i18 != i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai = gq4.v.Ai();
            if (Ai.f258520a != null && !Ai.f258523d) {
                ((ku5.t0) ku5.t0.f394148d).A("showIcon");
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.c1(Ai, i17), "showIcon");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = this.f258689d;
        if (gVar != null) {
            gVar.K(i17);
        }
        this.f258705w = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void M4(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "uninit");
        if (this.f258703u) {
            return;
        }
        this.f258703u = true;
        if (-1 != this.f258699q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f258700r ? 2 : 3);
            objArr[1] = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f258699q) / 1000);
            objArr[2] = java.lang.Integer.valueOf(this.f258702t ? 1 : 2);
            g0Var.d(11620, objArr);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f258693h;
        if (wakeLock != null && wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "release waklock");
            android.os.PowerManager.WakeLock wakeLock2 = this.f258693h;
            yj0.a.c(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
        b(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f258691f;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "uninit..cancel notification..");
        android.os.PowerManager.WakeLock wakeLock3 = this.f258707y;
        if (wakeLock3 == null || !wakeLock3.isHeld()) {
            return;
        }
        android.os.PowerManager.WakeLock wakeLock4 = this.f258707y;
        yj0.a.c(wakeLock4, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock4.release();
        yj0.a.f(wakeLock4, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f258707y = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void Q2(boolean z17) {
        gq4.v.Ai().c(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void W2() {
        gq4.v.Ai().c(false);
    }

    public java.lang.String a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = this.f258697o;
        int i17 = (int) (currentTimeMillis - j17);
        if (j17 == -1) {
            i17 = 0;
        }
        java.lang.String format = i17 >= 3600 ? java.lang.String.format(java.util.Locale.US, "%d:%02d:%02d", java.lang.Integer.valueOf(i17 / 3600), java.lang.Integer.valueOf((i17 % 3600) / 60), java.lang.Integer.valueOf(i17 % 60)) : i17 >= 600 ? java.lang.String.format(java.util.Locale.US, "%d:%02d", java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)) : java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(format) ? "00:00" : format;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "removeSmallView isFinish: %b", java.lang.Boolean.valueOf(z17));
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(40);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f258691f;
        if (b4Var != null) {
            b4Var.d();
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai = gq4.v.Ai();
            if (Ai.f258520a != null) {
                Ai.f258523d = true;
                ((ku5.t0) ku5.t0.f394148d).A("showIcon");
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.y0(Ai));
            } else {
                Ai.a(true);
            }
        } else {
            gq4.v.Ai().a(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258690e;
        if (abstractC18931xc27fcc5b == null || z17) {
            return;
        }
        abstractC18931xc27fcc5b.j();
        if (this.f258690e.getParent() != null) {
            ((android.view.ViewGroup) this.f258690e.getParent()).removeAllViews();
        }
        this.f258690e = null;
    }

    public void c(final yz5.l lVar) {
        java.lang.String str = gq4.v.Bi().f258091a.f257964u;
        boolean z17 = gq4.v.Bi().f258091a.f257965v;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.NewVoipSmallWindow", "null talkName");
        } else {
            ((y03.e) i95.n0.c(y03.e.class)).d8(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, z17, new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.k$$d
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    android.content.Intent intent = (android.content.Intent) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k.this;
                    kVar.getClass();
                    if (intent == null) {
                        return null;
                    }
                    intent.putExtra("Voip_CallRoomKey", gq4.v.Bi().n());
                    intent.putExtra("Voip_Call_From", 3);
                    intent.putExtra("Voip_User", kVar.f258695m.d1());
                    intent.putExtra("Voip_Outcall", kVar.f258698p);
                    intent.putExtra("Voip_VideoCall", kVar.f258696n);
                    intent.putExtra("Voip_Is_Talking", kVar.f258706x);
                    lVar.mo146xb9724478(intent);
                    return null;
                }
            });
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "setVideoTalkingView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258690e;
        if (abstractC18931xc27fcc5b != null) {
            abstractC18931xc27fcc5b.mo72916x231a26f4(this.f258694i);
            this.f258690e.mo72913xee293109(this.f258697o);
            this.f258690e.mo72918x41815e0a(this.f258689d);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            float p17 = gq4.v.Bi().p(true);
            int height = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
            this.f258690e.h((int) (height * p17), height);
            this.f258690e.setOnClickListener(this.f258704v);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "now add to view..");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "steve: showMiniSmallView decMode:%d, beautyCmd:%d", 0, 0);
        }
    }

    public final void e(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "showMini");
        gq4.v.Ai().d(intent, this.f258696n, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.o(this, intent));
        if (gq4.v.Bi().f258105o) {
            return;
        }
        gq4.v.Bi().f258105o = true;
        if (java.lang.System.currentTimeMillis() - gm0.j1.u().c().s(327950, 0L) > 86400000) {
            gm0.j1.u().c().A(327950, java.lang.System.currentTimeMillis());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n#client.version=");
            sb6.append(o45.wf.f424562g);
            sb6.append("\n#accinfo.revision=");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            sb6.append("\n#accinfo.build=");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c);
            sb6.append(":");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b);
            sb6.append(":");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b);
            sb6.append("\n");
            java.util.Date date = new java.util.Date();
            sb6.append("#accinfo.uploadTime=" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(date));
            sb6.append("\n#accinfo.content:\n");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
            intent2.setAction("uncatch_exception");
            intent2.putExtra("exceptionWriteSdcard", false);
            intent2.putExtra("exceptionPid", android.os.Process.myPid());
            c01.b9 b9Var = c01.b9.f118602c;
            java.lang.String a17 = b9Var.a("login_weixin_username", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                a17 = b9Var.a("login_user_name", "never_login_crash");
            }
            intent2.putExtra("userName", a17);
            intent2.putExtra("tag", "float_window_permission");
            intent2.putExtra("exceptionMsg", android.util.Base64.encodeToString((sb6.toString() + "have not permission to showing floating window\n").getBytes(), 2));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void e4(java.lang.String str) {
    }

    public void f(android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "showNotification..show notification..tickContent:" + str + ",title:" + str2 + ",content:" + str3 + ",breathEffect:" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("breathEffect ");
        sb6.append(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.Voip.NewVoipSmallWindow", sb6.toString(), new java.lang.Object[0]);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(str);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(str2);
        k0Var.e(str3);
        k0Var.f550996g = activity;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.h(2, true);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(40, vq4.p0.a(k0Var), false);
    }

    public final void g() {
        int i17 = this.f258694i;
        if (i17 == 261 || i17 == 7 || i17 == 260 || i17 == 6) {
            this.f258706x = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f258691f;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("timerCounter", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.n(this), true);
            this.f258691f = b4Var2;
            b4Var2.c(1000L, 1000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void k() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void o5(long j17) {
        this.f258697o = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258690e;
        if (abstractC18931xc27fcc5b != null) {
            abstractC18931xc27fcc5b.mo72913xee293109(j17);
            return;
        }
        int i17 = this.f258694i;
        if (261 == i17 || 7 == i17) {
            final java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdl);
            c(new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.k$$b
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    java.lang.String str = string;
                    android.content.Intent intent = (android.content.Intent) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k.this;
                    kVar.getClass();
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d17 = kVar.f258695m.d1();
                    ((sg3.a) v0Var).getClass();
                    kVar.f(intent, str, c01.a2.e(d17), str, false);
                    return null;
                }
            });
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    /* renamed from: setScreenEnable */
    public void mo72878x1aec5e91(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.NewVoipSmallWindow", "setScreenEnable: " + z17);
        if (!z17) {
            if (this.f258707y == null) {
                this.f258707y = ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).newWakeLock(32, "wechat:screen small-window-lock");
            }
            if (this.f258707y.isHeld()) {
                return;
            }
            android.os.PowerManager.WakeLock wakeLock = this.f258707y;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            return;
        }
        android.os.PowerManager.WakeLock wakeLock2 = this.f258707y;
        if (wakeLock2 == null || !wakeLock2.isHeld()) {
            return;
        }
        android.os.PowerManager.WakeLock wakeLock3 = this.f258707y;
        yj0.a.c(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock3.release();
        yj0.a.f(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f258707y = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai = gq4.v.Ai();
        if (Ai.f258520a == null || Ai.f258523d) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).A("showIcon");
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a1(Ai), "showIcon");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void v1() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void y(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258690e;
        if (abstractC18931xc27fcc5b != null) {
            abstractC18931xc27fcc5b.e(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void z(boolean z17) {
        gq4.v.Ai().e(z17);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z1(final int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = vq4.n0.d(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.Voip.NewVoipSmallWindow"
            java.lang.String r2 = "newState: %s "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            int r0 = r4.f258694i
            if (r6 != r0) goto L1a
            java.lang.String r5 = "state unchange"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            return
        L1a:
            r4.f258694i = r6
            r2 = -1
            r0 = 1
            switch(r6) {
                case 0: goto L4e;
                case 1: goto L2a;
                case 2: goto L4e;
                case 3: goto L2a;
                case 4: goto L4e;
                case 5: goto L2a;
                case 6: goto L4e;
                case 7: goto L2a;
                case 8: goto L26;
                default: goto L22;
            }
        L22:
            switch(r6) {
                case 256: goto L4e;
                case 257: goto L2a;
                case 258: goto L4e;
                case 259: goto L2a;
                case 260: goto L4e;
                case 261: goto L2a;
                case 262: goto L26;
                default: goto L25;
            }
        L25:
            goto L81
        L26:
            r4.b(r0)
            goto L81
        L2a:
            r4.g()
            boolean r6 = r4.f258701s
            if (r6 != 0) goto L81
            java.lang.String r6 = "showVoiceTalking"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            r4.f258701s = r0
            long r0 = r4.f258699q
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L45
            long r0 = java.lang.System.currentTimeMillis()
            r4.f258699q = r0
        L45:
            com.tencent.mm.plugin.voip.widget.k$$a r6 = new com.tencent.mm.plugin.voip.widget.k$$a
            r6.<init>(r5)
            r4.c(r6)
            goto L81
        L4e:
            r4.g()
            boolean r5 = r4.f258700r
            if (r5 != 0) goto L81
            java.lang.String r5 = "showVideoTalking"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            r4.f258700r = r0
            long r5 = r4.f258699q
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L69
            long r5 = java.lang.System.currentTimeMillis()
            r4.f258699q = r5
        L69:
            com.tencent.mm.plugin.voip.ui.g r5 = r4.f258689d
            if (r5 == 0) goto L70
            r5.d()
        L70:
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r6 = 2131779016(0x7f105dc8, float:1.9189577E38)
            java.lang.String r5 = r5.getString(r6)
            com.tencent.mm.plugin.voip.widget.k$$c r6 = new com.tencent.mm.plugin.voip.widget.k$$c
            r6.<init>()
            r4.c(r6)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k.z1(int, int):void");
    }
}

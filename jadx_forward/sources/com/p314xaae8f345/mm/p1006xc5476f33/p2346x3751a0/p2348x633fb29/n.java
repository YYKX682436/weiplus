package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public abstract class n {

    /* renamed from: d, reason: collision with root package name */
    public final jq4.y f258286d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f258287e;

    /* renamed from: f, reason: collision with root package name */
    public final vx3.i f258288f;

    /* renamed from: g, reason: collision with root package name */
    public final yx3.k f258289g;

    /* renamed from: h, reason: collision with root package name */
    public final ao4.b f258290h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f258291i;

    /* renamed from: m, reason: collision with root package name */
    public wu5.c f258292m;

    /* renamed from: n, reason: collision with root package name */
    public r45.r27 f258293n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f258294o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f258295p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f258296q;

    public n(jq4.y floatCardManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatCardManager, "floatCardManager");
        this.f258286d = floatCardManager;
        vx3.c cVar = new vx3.c(vx3.d.f522806d, 0, true);
        vx3.i b17 = vx3.l.E.b();
        dk4.a aVar = b17.f522817a;
        if (aVar != null) {
            aVar.f316008l = true;
        }
        this.f258288f = b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayer", "create ringtonePlayer, mediaInfo:" + aVar + ", soundInfo:" + cVar + ", isOutCall:false");
        this.f258289g = aVar.f316001e ? new yx3.j(aVar, cVar, false) : new yx3.x(aVar, cVar, false);
        this.f258290h = new ao4.b();
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n nVar, int i17) {
        r45.r27 r27Var = nVar.f258293n;
        if (r27Var == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) nVar).y(i17, r27Var);
    }

    public final boolean a(r45.r27 roomInfo) {
        boolean z17;
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        if (this.f258293n != null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) this;
        c0Var.f257899t.mo48813x58998cd();
        c0Var.f257900u.mo48813x58998cd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptIncomingCal, roomInfo:");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o.a(roomInfo));
        sb6.append(" and ");
        r45.r27 r27Var = this.f258293n;
        sb6.append(r27Var != null ? java.lang.Integer.valueOf(r27Var.f466028m) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", sb6.toString());
        this.f258293n = roomInfo;
        java.lang.String str = roomInfo.f466027i;
        r45.r27 r27Var2 = c0Var.f258293n;
        boolean z18 = r27Var2 != null && r27Var2.f466028m == 0;
        wu5.c cVar = this.f258292m;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f258289g.g(0L);
        this.f258289g.f();
        this.f258290h.a(this.f258288f.i(), null);
        this.f258290h.b();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f258292m = t0Var.z(jVar, 8000L, false);
        wu5.c cVar2 = this.f258291i;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k(this);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        this.f258291i = t0Var2.z(kVar, 70000L, false);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        jq4.y yVar = this.f258286d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        long j17 = roomInfo.f466023e;
        int i17 = roomInfo.f466022d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        jq4.y.y(yVar, context, intent, j17, i17, z18, str, false, 3, 64, null);
        java.lang.Object systemService = context.getSystemService("keyguard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        java.lang.Object systemService2 = context.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        java.lang.ref.WeakReference i18 = com.p314xaae8f345.mm.app.w.INSTANCE.i();
        boolean isKeyguardLocked = ((android.app.KeyguardManager) systemService).isKeyguardLocked();
        boolean isInteractive = ((android.os.PowerManager) systemService2).isInteractive();
        boolean z19 = (i18 != null ? (android.app.Activity) i18.get() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "check if show notification, isKeyguardLocked:" + isKeyguardLocked + ", isScreenOn:" + isInteractive + ", isVideoActivityForeground:" + z19 + ", hasWindowFocus:" + ((i18 == null || (activity = (android.app.Activity) i18.get()) == null) ? false : activity.hasWindowFocus()));
        if (!isKeyguardLocked || isInteractive || z19) {
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "show incoming call notification");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(context, "com.tencent.mm.ui.LauncherUI");
            intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            intent2.addFlags(67108864);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(context, 0, intent2, fp.g0.a(134217728));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p943x351df9c2.g.b(str, false, 20, null);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (e17 == null) {
                e17 = "";
            }
            java.lang.String string = context.getResources().getString(z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.kdd : com.p314xaae8f345.mm.R.C30867xcad56011.kdi, e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z2.k0 k0Var = new z2.k0(context, n25.a.b());
            z17 = true;
            k0Var.f550999j = 1;
            k0Var.f551008s = "call";
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f550996g = activity2;
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.j(b17);
            k0Var.f(e17);
            k0Var.e(string);
            k0Var.h(2, true);
            k0Var.h(16, true);
            android.app.Notification b18 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "build(...)");
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).n(49, b18, true);
        }
        c0Var.s(roomInfo);
        return z17;
    }

    public final boolean e(boolean z17) {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) this).u()) {
            return false;
        }
        boolean j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAcceptIncomingCall, isVideoCalling:");
        sb6.append(z17);
        sb6.append(", hasPermission:");
        sb6.append(j17);
        sb6.append(", inviteInfo:");
        r45.r27 r27Var = this.f258293n;
        sb6.append(r27Var != null ? com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o.a(r27Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", sb6.toString());
        return this.f258293n == null && j17;
    }

    public final boolean k() {
        r45.r27 r27Var = this.f258293n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "checkStartAcceptVoIP, roomInfo:" + r27Var + ", hasCleanVoipMgr:" + this.f258294o + ", hasReleaseCamera:" + this.f258295p);
        if (r27Var != null && this.f258296q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) this;
            if (c0Var.f258294o && c0Var.f258295p) {
                c0Var.z(r27Var);
                p();
                return true;
            }
        }
        return false;
    }

    public final void m() {
        r45.r27 r27Var = this.f258293n;
        if (r27Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "onAccept, roomInfo:" + com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o.a(r27Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) this;
        if (!gq4.v.Bi().f258091a.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "directly accept");
            jq4.z0.c(this.f258286d, false, false, false, 3, null);
            q();
            c0Var.z(r27Var);
            r45.r27 r27Var2 = this.f258293n;
            if (r27Var2 != null) {
                c0Var.y(2, r27Var2);
            }
            p();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.u(i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.k_t));
        u1Var.j(i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l(this));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.k_s);
        u1Var.k(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.m(this, r27Var));
        this.f258287e = u1Var.s();
        r45.r27 r27Var3 = this.f258293n;
        if (r27Var3 == null) {
            return;
        }
        c0Var.y(7, r27Var3);
    }

    public final void o(int i17) {
        r45.r27 r27Var = this.f258293n;
        if (r27Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "onCancelInvite, roomId:" + i17);
        if (r27Var.f466022d == i17 || i17 == 0) {
            q();
            jq4.z0.c(this.f258286d, false, false, false, 3, null);
            p();
        }
    }

    public abstract void p();

    public final void q() {
        this.f258289g.k();
        this.f258290h.c();
    }
}

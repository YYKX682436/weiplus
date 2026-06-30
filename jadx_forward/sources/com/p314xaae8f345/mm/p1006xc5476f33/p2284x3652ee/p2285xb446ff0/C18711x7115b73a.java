package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/audiopush/TingAudioPushConfigLogic;", "", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic */
/* loaded from: classes11.dex */
public final class C18711x7115b73a extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int N = 0;
    public final jz5.g A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public cv.v0 F;
    public java.lang.Integer G;
    public final jz5.g H;
    public bw5.c2 I;

    /* renamed from: J, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f256171J;
    public final p3325xe03a0797.p3326xc267989b.y0 K;
    public final java.util.List L;
    public final java.util.List M;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f256172a = "MicroMsg.TingAudioPush.ConfigLogic";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f256173b = "ting_listen_audio_push_last_get_time";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f256174c = "ting_listen_outdoor_audio_push_last_get_time";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f256175d = "ting_listen_audio_push_config";

    /* renamed from: e, reason: collision with root package name */
    public final long f256176e = 20;

    /* renamed from: f, reason: collision with root package name */
    public final long f256177f = 21;

    /* renamed from: g, reason: collision with root package name */
    public final long f256178g = 22;

    /* renamed from: h, reason: collision with root package name */
    public final long f256179h = 23;

    /* renamed from: i, reason: collision with root package name */
    public final long f256180i = 30;

    /* renamed from: j, reason: collision with root package name */
    public final long f256181j = 31;

    /* renamed from: k, reason: collision with root package name */
    public final long f256182k = 32;

    /* renamed from: l, reason: collision with root package name */
    public final long f256183l = 33;

    /* renamed from: m, reason: collision with root package name */
    public final long f256184m = 41;

    /* renamed from: n, reason: collision with root package name */
    public final long f256185n = 42;

    /* renamed from: o, reason: collision with root package name */
    public final long f256186o = 45;

    /* renamed from: p, reason: collision with root package name */
    public final long f256187p = 46;

    /* renamed from: q, reason: collision with root package name */
    public final long f256188q = 90;

    /* renamed from: r, reason: collision with root package name */
    public final long f256189r = 91;

    /* renamed from: s, reason: collision with root package name */
    public final long f256190s = 92;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f256191t;

    /* renamed from: u, reason: collision with root package name */
    public final tk4.c0 f256192u;

    /* renamed from: v, reason: collision with root package name */
    public long f256193v;

    /* renamed from: w, reason: collision with root package name */
    public long f256194w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f256195x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f256196y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f256197z;

    public C18711x7115b73a() {
        jz5.g b17 = jz5.h.b(tk4.c.f501495d);
        this.f256191t = b17;
        this.f256192u = new tk4.c0();
        this.f256196y = jz5.h.b(tk4.d.f501505d);
        this.f256197z = jz5.h.b(tk4.e.f501506d);
        this.A = jz5.h.b(tk4.f.f501507d);
        this.H = jz5.h.b(tk4.b.f501493d);
        this.f256171J = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
        this.K = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new tk4.a(this));
        }
        this.F = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        java.lang.Object mo141623x754a37bb = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        this.E = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b((android.content.Context) mo141623x754a37bb);
        this.L = kz5.c0.i("android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.STATE_CHANGE", io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        this.M = kz5.c0.i("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.action.SHORTCUT_ACTION", "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED", "android.intent.action.HEADSET_PLUG");
    }

    public final void a(bw5.d2 d2Var) {
        int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ting_audio_push_view_jump_square, 0) == 1 ? 1 : 0;
        bw5.xa0 xa0Var = new bw5.xa0();
        xa0Var.f116571u = d2Var.v();
        boolean[] zArr = xa0Var.S;
        zArr[15] = true;
        xa0Var.f116561h = d2Var.f107820n[3] ? d2Var.f107815f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        zArr[5] = true;
        bw5.pp0 pp0Var = new bw5.pp0();
        pp0Var.f113318h = xa0Var;
        pp0Var.E[5] = true;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("focusListId", "3008");
        byte[] mo14344x5f01b1f6 = pp0Var.mo14344x5f01b1f6();
        if (mo14344x5f01b1f6 == null) {
            mo14344x5f01b1f6 = new byte[0];
        }
        linkedHashMap.put("focusListContext", mo14344x5f01b1f6);
        linkedHashMap.put("audioReadParamsNative", java.lang.Boolean.TRUE);
        linkedHashMap.put("inAudio", 1);
        linkedHashMap.put("player_expand", java.lang.Integer.valueOf(i17 ^ 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:24:0x006e, B:26:0x007a, B:31:0x0086, B:32:0x008c, B:34:0x0093, B:35:0x009d), top: B:23:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:24:0x006e, B:26:0x007a, B:31:0x0086, B:32:0x008c, B:34:0x0093, B:35:0x009d), top: B:23:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.b(boolean):boolean");
    }

    public final boolean c() {
        if (android.os.Build.VERSION.SDK_INT < 26 || !((java.lang.Boolean) ((jz5.n) this.f256196y).mo141623x754a37bb()).booleanValue()) {
            return false;
        }
        boolean z17 = this.C;
        java.lang.String str = this.f256172a;
        if (z17 || this.B || this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isFeatureAvailable false, scene blocked, isInShareScene:" + this.C + ", isInPayScene:" + this.B + ", isInTingApp:" + this.D);
            return false;
        }
        jz5.g gVar = this.A;
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isFeatureAvailable false, isTeenMode:" + ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120 c4679x33de8120 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495;
        if (!c4679x33de8120.mo40975xf7b3660d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isFeatureAvailable false, isForeground:" + c4679x33de8120.mo40975xf7b3660d());
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
        c6973x5d0a81b7.f142835d = this.f256176e;
        c6973x5d0a81b7.k();
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isFloatPermissionGranted false");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b72.f142835d = this.f256189r;
            c6973x5d0a81b72.k();
            return false;
        }
        if ((c01.z1.i() & 2147483648L) == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "MM_STATUS_LISTEN_AUDIO_CONFIG_CLOSE closed!");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b73 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
        c6973x5d0a81b73.f142835d = this.f256190s;
        c6973x5d0a81b73.k();
        return false;
    }

    public final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) this.f256197z).mo141623x754a37bb()).booleanValue();
    }

    public final void e(java.lang.Integer num) {
        cv.v0 Bi = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        cv.v0 v0Var = this.F;
        java.lang.Integer num2 = this.G;
        this.F = Bi;
        if (num != null) {
            this.G = java.lang.Integer.valueOf(num.intValue());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPushStatusChange onConnectedDeviceMayChange may changed: current: ");
        sb6.append(Bi.f304050b);
        sb6.append(" , ");
        sb6.append(num);
        sb6.append(", last: ");
        sb6.append(v0Var != null ? v0Var.f304050b : null);
        sb6.append(", ");
        sb6.append(num2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f256172a, sb6.toString());
        boolean z17 = false;
        if (v0Var != null && Bi.f304049a == v0Var.f304049a) {
            z17 = true;
        }
        if (z17 && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(num, num2) || num == null)) {
            return;
        }
        f(num);
    }

    public final void f(java.lang.Integer num) {
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        bw5.y40 y40Var = new bw5.y40();
        boolean[] zArr = y40Var.f116901f;
        int i17 = 0;
        int i18 = 2;
        if (num != null) {
            y40Var.f116900e = num.intValue();
            zArr[2] = true;
        } else {
            int i19 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f304049a;
            if (i19 == 1) {
                y40Var.f116900e = 0;
                zArr[2] = true;
            } else if (i19 == 2) {
                y40Var.f116900e = 0;
                zArr[2] = true;
            }
        }
        if (m40061x1de3608b != null) {
            int hashCode = m40061x1de3608b.hashCode();
            if (hashCode != 1621) {
                if (hashCode != 1652) {
                    if (hashCode != 1683) {
                        if (hashCode != 1714) {
                            if (hashCode == 2664213 && m40061x1de3608b.equals("WIFI")) {
                                i17 = 1;
                            }
                        } else if (m40061x1de3608b.equals("5G")) {
                            i17 = 5;
                        }
                    } else if (m40061x1de3608b.equals("4G")) {
                        i17 = 4;
                    }
                } else if (m40061x1de3608b.equals("3G")) {
                    i17 = 3;
                }
            } else if (m40061x1de3608b.equals("2G")) {
                i17 = 2;
            }
        }
        y40Var.f116899d = i17;
        zArr[1] = true;
        java.lang.String str = "audioPushStatusChange real hasChanged " + m40061x1de3608b + ' ' + y40Var.f116900e;
        java.lang.String str2 = this.f256172a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (b(true) && d()) {
            gm4.a.f355090a.i(this.f256174c, (int) (java.lang.System.currentTimeMillis() / 1000));
            this.f256194w = java.lang.System.currentTimeMillis();
            if (this.I == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
                c6973x5d0a81b7.f142835d = this.f256178g;
                c6973x5d0a81b7.k();
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
                c6973x5d0a81b72.f142835d = this.f256179h;
                c6973x5d0a81b72.k();
                i18 = 4;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "audioPushStatusChange networkStatusChangeGetConfigAndPush " + i18 + ", " + y40Var.f116899d + ", " + y40Var.f116900e);
            new tk4.d0(i18, y40Var).l().K(new tk4.j(this, true));
        }
    }

    public final void g(bw5.d2 d2Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f256172a, "onPlayCategory, id:" + d2Var.b().c());
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2101, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554425, null);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d2Var.c());
        lp0Var.g(d2Var.c().m13170xcc16feb8());
        if (z17) {
            a(d2Var);
        }
        i95.m c17 = i95.n0.c(qk.g9.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        qk.g9.Ye((qk.g9) c17, lp0Var, null, d2Var.b(), null, eVar, 10, null);
    }

    public final void h(bw5.d2 d2Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f256172a, "onPlayListenItem, id:" + d2Var.c().m13170xcc16feb8());
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d2Var.c());
        lp0Var.g(d2Var.c().m13170xcc16feb8());
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        eVar.f373639c = 2101;
        if (z17) {
            a(d2Var);
        }
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        java.lang.String b17 = lp0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getClientId(...)");
        ((rk4.z8) g9Var).qj(b17, lp0Var, eVar);
    }

    public final void i(bw5.d2 d2Var, long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
        c6973x5d0a81b7.f142835d = j17;
        c6973x5d0a81b7.f142836e = c6973x5d0a81b7.b("PushType", d2Var.f107820n[1] ? d2Var.f107813d : "", true);
        c6973x5d0a81b7.f142838g = c6973x5d0a81b7.b("PushTitle", d2Var.b().m12637xfb82e301(), true);
        bw5.o50 b17 = d2Var.b();
        c6973x5d0a81b7.f142839h = c6973x5d0a81b7.b("PushDesc", b17.L1[36] ? b17.Q : "", true);
        c6973x5d0a81b7.f142837f = c6973x5d0a81b7.b("UniqueId", d2Var.v(), true);
        c6973x5d0a81b7.k();
    }

    public final java.util.Map j(bw5.d2 d2Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currscene", 2101);
        java.lang.String c17 = d2Var.b().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getCategoryId(...)");
        hashMap.put("actioncategoryid", c17);
        java.lang.String m13170xcc16feb8 = d2Var.c().m13170xcc16feb8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13170xcc16feb8, "getListenId(...)");
        hashMap.put("actionlistenid", m13170xcc16feb8);
        java.lang.String str = d2Var.f107820n[1] ? d2Var.f107813d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getConfigType(...)");
        hashMap.put("config_type", str);
        hashMap.put(ya.b.f77470xbd76cf60, java.lang.Integer.valueOf(d2Var.f107818i));
        return hashMap;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3325xe03a0797.p3326xc267989b.l.d(this.K, null, null, new tk4.g(this, intent, null), 3, null);
    }
}

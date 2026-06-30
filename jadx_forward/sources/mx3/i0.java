package mx3;

/* loaded from: classes10.dex */
public final class i0 {

    /* renamed from: a */
    public static final mx3.i0 f414110a;

    /* renamed from: b */
    public static java.lang.String f414111b = "";

    /* renamed from: c */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f414112c;

    /* renamed from: d */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f414113d;

    /* renamed from: e */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f414114e;

    /* renamed from: f */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f414115f;

    /* renamed from: g */
    public static final p3325xe03a0797.p3326xc267989b.y0 f414116g;

    /* renamed from: h */
    public static p3325xe03a0797.p3326xc267989b.r2 f414117h;

    /* renamed from: i */
    public static java.lang.String f414118i;

    /* renamed from: j */
    public static final java.util.HashSet f414119j;

    /* renamed from: k */
    public static volatile boolean f414120k;

    static {
        mx3.i0 i0Var = new mx3.i0();
        f414110a = i0Var;
        f414112c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_ringtone_manager"));
        f414113d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_exclusive_manager"));
        f414114e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_ringtone_params"));
        f414115f = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_ringtone_new_calling_info"));
        f414116g = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));
        f414118i = "";
        f414119j = new java.util.HashSet();
    }

    public static final vx3.i d(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String string = f414110a.e().getString(username, "");
        if (string == null || r26.n0.N(string)) {
            return null;
        }
        return new vx3.a(null, null, 0L, 7, null).a(string).f522794d;
    }

    public static final vx3.i f() {
        java.lang.String string = f414110a.e().getString(c01.z1.r(), "");
        vx3.k kVar = vx3.l.E;
        return (string == null || r26.n0.N(string)) ? kVar.b() : kVar.f(string);
    }

    public static final java.util.List g() {
        java.util.ArrayList arrayList;
        mx3.i0 i0Var = f414110a;
        java.lang.String[] b17 = i0Var.e().b();
        if (b17 != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c01.z1.r())) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String string = i0Var.e().getString((java.lang.String) it.next(), null);
                if (string != null) {
                    vx3.a a17 = new vx3.a(null, null, 0L, 7, null).a(string);
                    java.lang.String str2 = a17.f522795e;
                    if (str2 == null || r26.n0.N(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneManager", "getVoipExclusiveList find invalid empty username!!!");
                    } else {
                        arrayList2.add(a17);
                    }
                }
            }
        }
        java.util.Collections.sort(arrayList2, java.util.Collections.reverseOrder());
        return arrayList2;
    }

    public static final java.lang.String h(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.lang.String str = j(toUser).f522828l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneManager", "getVoipRingtoneChannelInUse toUser:" + toUser + " channelId:" + str);
        return str;
    }

    public static final vx3.i i(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(toUser, c01.z1.r())) {
            toUser = "";
        }
        java.lang.String c17 = f414110a.c("voip_ringtone_channel_".concat(toUser));
        n();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = f414112c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mmkv, "mmkv");
        java.lang.String string = mmkv.getString(c17, null);
        if (string == null) {
            return null;
        }
        return vx3.l.E.f(string);
    }

    public static final vx3.i j(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        f414118i = toUser;
        vx3.i i17 = i(toUser);
        if (i17 != null) {
            i17.f522829m = vx3.g.f522815i;
        } else {
            i17 = null;
        }
        if (!(i17 != null && i17.a())) {
            i17 = null;
        }
        vx3.i i18 = i("");
        if (i18 != null) {
            i18.f522829m = vx3.g.f522814h;
        } else {
            i18 = null;
        }
        vx3.i iVar = i18 != null && i18.a() ? i18 : null;
        vx3.i b17 = vx3.l.E.b();
        java.lang.String a17 = n25.b.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getVoipChannelId(...)");
        b17.f522828l = a17;
        b17.f522829m = vx3.g.f522813g;
        return i17 == null ? iVar == null ? b17 : iVar : i17;
    }

    public static final void k(java.lang.String toUser, vx3.i iVar) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneManager", "resetVoipRingtoneInfo toUser:".concat(toUser));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(toUser, c01.z1.r())) {
            toUser = "";
        }
        vx3.i i17 = i(toUser);
        java.lang.String h17 = h(toUser);
        if (iVar == null) {
            com.p314xaae8f345.mm.vfs.w6.h(i17 != null ? i17.h() : null);
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_notification_channel_id_reuse, false);
        if ((i17 != null ? i17.f522828l : null) != null && fj6 && iVar != null) {
            java.lang.String str3 = i17.f522828l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            iVar.f522828l = str3;
        }
        java.lang.String c17 = f414110a.c("voip_ringtone_channel_".concat(toUser));
        if (iVar != null) {
            java.lang.String str4 = c17 + java.lang.System.currentTimeMillis();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
            iVar.f522828l = str4;
            iVar.f522835s = java.lang.System.currentTimeMillis();
            n();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = f414112c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mmkv, "mmkv");
            mmkv.putString(c17, iVar.n());
        } else {
            n();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv2 = f414112c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mmkv2, "mmkv");
            mmkv2.remove(c17);
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(6).setContentType(2).build();
            xa0.j jVar = (xa0.j) i95.n0.c(xa0.j.class);
            if (i17 == null || (str = i17.f522828l) == null) {
                str = "";
            }
            if (iVar == null || (str2 = iVar.f522828l) == null) {
                str2 = "";
            }
            java.lang.String h18 = iVar != null ? iVar.h() : "";
            ((wa0.e) jVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginNotification", "resetVoipRingtoneChannel toUser:" + toUser + " originChannelId:" + str + " newChannelId:" + str2 + " ringtonePath:" + h18);
            if (i18 >= 26) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                if (notificationManager != null) {
                    android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(h17);
                    boolean shouldVibrate = notificationChannel != null ? notificationChannel.shouldVibrate() : true;
                    if (notificationManager.getNotificationChannel(str) != null) {
                        notificationManager.deleteNotificationChannel(str);
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hc7);
                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hc6);
                    if (n17 != null && n17.f2() != null) {
                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574183hc5, n17.f2());
                        string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574182hc4, n17.f2());
                    }
                    if (h18.isEmpty()) {
                        return;
                    }
                    android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(str2, string, 4);
                    notificationChannel2.setDescription(string2);
                    notificationChannel2.enableLights(true);
                    notificationChannel2.setLightColor(-16711936);
                    notificationChannel2.enableVibration(shouldVibrate);
                    notificationChannel2.setLockscreenVisibility(0);
                    android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(h18)));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.grantUriPermission("com.android.systemui", b17, 1);
                    notificationChannel2.setSound(b17, build);
                    mo3.g.wi(notificationManager, notificationChannel2);
                }
            }
        }
    }

    public static final void l(java.lang.String username, vx3.i iVar, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        mx3.i0 i0Var = f414110a;
        if (iVar == null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, c01.z1.r())) {
                f414119j.remove(username);
            }
            i0Var.e().remove(username);
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, c01.z1.r())) {
                i0Var.e().putString(c01.z1.r(), iVar.n());
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = i0Var.e();
            cl0.g gVar = new cl0.g();
            gVar.h("info", iVar.n());
            gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, username);
            gVar.p("order", j17);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            e17.putString(username, gVar2);
        }
    }

    public static /* synthetic */ void m(java.lang.String str, vx3.i iVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        l(str, iVar, j17);
    }

    public static final synchronized void n() {
        synchronized (mx3.i0.class) {
            if (f414120k) {
                return;
            }
            try {
                if (gm0.j1.b().n()) {
                    f414118i = "";
                    java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
                    f414111b = r26.p0.E0(a17, 16);
                    mx3.i0 i0Var = f414110a;
                    f414112c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_ringtone_manager"));
                    f414114e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_ringtone_params"));
                    f414113d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i0Var.c("mmkv_exclusive_manager"));
                    f414120k = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RingtoneManager", th6, "", new java.lang.Object[0]);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(3:16|17|18))(7:47|48|(1:50)(1:73)|51|(5:53|(1:70)(1:57)|(2:64|65)|66|(1:68)(1:69))|71|72)|19|(6:21|(1:23)(1:31)|(1:25)(1:30)|(1:27)|28|29)(4:32|(1:34)(1:46)|35|(4:37|(1:39)(1:43)|40|(1:42)(1:12))(2:44|45))))|76|6|7|(0)(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneManager", "cacheRingtone fail:" + r0.getLocalizedMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:11:0x0036, B:17:0x0053, B:19:0x00ff, B:21:0x0103, B:27:0x011d, B:28:0x0120, B:30:0x0119, B:31:0x0114, B:32:0x0123, B:35:0x012f, B:37:0x013b, B:40:0x0149, B:44:0x015b, B:48:0x006e, B:51:0x007c, B:53:0x0080, B:55:0x0086, B:59:0x0091, B:61:0x009d, B:64:0x00ac, B:66:0x00c5), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:11:0x0036, B:17:0x0053, B:19:0x00ff, B:21:0x0103, B:27:0x011d, B:28:0x0120, B:30:0x0119, B:31:0x0114, B:32:0x0123, B:35:0x012f, B:37:0x013b, B:40:0x0149, B:44:0x015b, B:48:0x006e, B:51:0x007c, B:53:0x0080, B:55:0x0086, B:59:0x0091, B:61:0x009d, B:64:0x00ac, B:66:0x00c5), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, vx3.i r19, boolean r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx3.i0.a(java.lang.String, vx3.i, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(vx3.i ringtone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtone, "ringtone");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) systemService).getNotificationChannel(ringtone.f522828l);
                if (notificationChannel == null) {
                    return false;
                }
                android.net.Uri sound = notificationChannel.getSound();
                java.lang.String path = sound.getPath();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path != null ? r26.p0.F0(path, 36) : null, r26.p0.F0(ringtone.h(), 36))) {
                    java.lang.String path2 = sound.getPath();
                    if (!(path2 != null && r26.i0.n(path2, "phonering.mp3", false))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneManager", "find user modify channel! sound path:" + sound.getPath() + ", ringtone path:" + ringtone.h());
                        return true;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneManager", "checkIfChannelModifiedByUser error:" + e17.getLocalizedMessage());
            }
        }
        return false;
    }

    public final java.lang.String c(java.lang.String str) {
        return f414111b + '#' + str;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        n();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 exclusiveMMKv = f414113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exclusiveMMKv, "exclusiveMMKv");
        return exclusiveMMKv;
    }
}

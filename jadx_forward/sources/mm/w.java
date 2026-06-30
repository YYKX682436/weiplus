package mm;

/* loaded from: classes12.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f410075a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f410076b;

    /* renamed from: c, reason: collision with root package name */
    public static long f410077c;

    /* renamed from: d, reason: collision with root package name */
    public static final mm.y f410078d = new mm.y("push-notify");

    /* renamed from: e, reason: collision with root package name */
    public static final mm.y f410079e = new mm.y("receive-notify");

    /* renamed from: f, reason: collision with root package name */
    public static final mm.y f410080f = new mm.y("net-scene");

    /* renamed from: g, reason: collision with root package name */
    public static final mm.y f410081g = new mm.y("net-sync");

    /* renamed from: h, reason: collision with root package name */
    public static final mm.y f410082h = new mm.y("net-minSync");

    /* renamed from: i, reason: collision with root package name */
    public static final mm.y f410083i = new mm.y("net-syncCmd");

    /* renamed from: j, reason: collision with root package name */
    public static final mm.y f410084j = new mm.y("msg-type");

    /* renamed from: k, reason: collision with root package name */
    public static final mm.y f410085k = new mm.y("msg-appType");

    /* renamed from: l, reason: collision with root package name */
    public static final mm.y f410086l = new mm.y("msg-xmlType");

    /* renamed from: m, reason: collision with root package name */
    public static final mm.y f410087m = new mm.y("msg-action");

    /* renamed from: n, reason: collision with root package name */
    public static final mm.y f410088n = new mm.y("msg-mute");

    /* renamed from: o, reason: collision with root package name */
    public static final mm.y f410089o = new mm.y("msg-empty");

    /* renamed from: p, reason: collision with root package name */
    public static final mm.y f410090p = new mm.y("msg-notify");

    /* renamed from: q, reason: collision with root package name */
    public static final mm.y f410091q = new mm.y("msg-notifyClick");

    /* renamed from: r, reason: collision with root package name */
    public static m3.a f410092r = new mm.C29151x36a40b();

    /* renamed from: s, reason: collision with root package name */
    public static m3.a f410093s = new mm.C29151x36a40b();

    /* renamed from: t, reason: collision with root package name */
    public static m3.a f410094t = new mm.C29152x36a40c();

    /* renamed from: u, reason: collision with root package name */
    public static final r.a f410095u = new mm.C29153x36a40d();

    public static void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f410078d.a();
            f410079e.a();
            f410080f.a();
            f410081g.a();
            f410082h.a();
            f410083i.a();
            f410084j.a();
            f410085k.a();
            f410086l.a();
            f410087m.a();
            f410088n.a();
            f410089o.a();
            f410090p.a();
            f410091q.a();
        }
    }

    public static long b(mm.y yVar, long j17, java.util.Map map, int i17) {
        synchronized (yVar) {
            java.util.Map map2 = yVar.f410102b;
            long j18 = 0;
            if (map2.isEmpty()) {
                return 0L;
            }
            mm.C29154x36a40e c29154x36a40e = new mm.C29154x36a40e();
            java.util.ArrayList arrayList = new java.util.ArrayList(map2.entrySet());
            java.util.Collections.sort(arrayList, c29154x36a40e);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            java.lang.String str = yVar.f410101a;
            int i18 = 0;
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String valueOf = java.lang.String.valueOf(entry2.getKey());
                int intValue = ((java.lang.Integer) entry2.getValue()).intValue();
                j18 += intValue;
                i18++;
                if (i17 <= 0 || i18 < i17) {
                    map.put(str + "-" + i18 + "-key", valueOf);
                    map.put(str + "-" + i18 + "-val", java.lang.Integer.valueOf(intValue));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append("-@-");
                    sb6.append(valueOf);
                    map.put(sb6.toString(), java.lang.Integer.valueOf(intValue));
                }
            }
            double p17 = uh.i.p((j18 * 1.0d) / j17, 2);
            map.put(str + "-count", java.lang.Long.valueOf(j18));
            map.put(str + "-countAvg", java.lang.Double.valueOf(p17));
            return j18;
        }
    }

    public static void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "#load");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("notify-inspect.bin");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mm.y yVar = f410078d;
        sb6.append(yVar.f410101a);
        sb6.append("-count");
        yVar.f410103c = M.getLong(sb6.toString(), 0L);
        yVar.f410106f = M.getLong(yVar.f410101a + "-during", 0L);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        mm.y yVar2 = f410080f;
        sb7.append(yVar2.f410101a);
        sb7.append("-count");
        yVar2.f410103c = M.getLong(sb7.toString(), 0L);
        yVar2.f410106f = M.getLong(yVar2.f410101a + "-during", 0L);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        mm.y yVar3 = f410084j;
        sb8.append(yVar3.f410101a);
        sb8.append("-count");
        yVar3.f410103c = M.getLong(sb8.toString(), 0L);
        yVar3.f410106f = M.getLong(yVar3.f410101a + "-during", 0L);
        f410077c = M.getLong("light-push-during", 0L);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        if (f410075a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }
    }

    public static void e(java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgAction: act=" + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            mm.y yVar = f410087m;
            if (yVar.b() || !f410076b) {
                yVar.c(str);
            }
        }
    }

    public static void f(java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgActionMute: reason=" + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            e("mute");
            mm.y yVar = f410088n;
            if (yVar.b() || !f410076b) {
                yVar.c(str);
            }
        }
    }

    public static void g(android.content.Intent intent, java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgNotifySend: from=" + str);
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            e("sendNotify");
            intent.putExtra("MainUI_User_Last_Msg_BgNotify_From", str);
        }
    }

    public static void h(java.lang.String str, final r45.b50 b50Var) {
        d("MicroMsg.NotifyPowerInspector", "netSynCmd: cmd=" + b50Var.f452063d + ", from=" + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            mm.y yVar = f410083i;
            if (yVar.b() || !f410076b) {
                yVar.c(java.lang.String.valueOf(b50Var.f452063d));
            }
            if (b50Var.f452063d == 5) {
                ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: mm.w$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            r45.j4 j4Var = (r45.j4) new r45.j4().mo11468x92b714fd(x51.j1.d(r45.b50.this.f452064e));
                            int i17 = j4Var.f459093g;
                            mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddMsgType: type=" + i17);
                            mm.y yVar2 = mm.w.f410084j;
                            if (yVar2.b() || !mm.w.f410076b) {
                                yVar2.c(java.lang.String.valueOf(i17));
                            }
                            if (j4Var.f459093g == 49) {
                                java.lang.String hexString = java.lang.Integer.toHexString(((java.lang.Integer) ((mm.C29153x36a40d) mm.w.f410095u).mo1850x58b836e(j4Var)).intValue() & (-50));
                                mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddAppMsgType: type=" + hexString);
                                mm.y yVar3 = mm.w.f410085k;
                                if (yVar3.b() || !mm.w.f410076b) {
                                    yVar3.c(hexString);
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotifyPowerInspector", "parse cmd fail: " + th6.getMessage());
                        }
                    }
                });
            }
        }
    }

    public static void i(int i17) {
        d("MicroMsg.NotifyPowerInspector", "notePushNetScene: func=" + i17);
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            f410093s.mo3938xab27b508(java.lang.Integer.valueOf(i17));
        }
    }

    public static void j(int i17) {
        d("MicroMsg.NotifyPowerInspector", "receiveNotify: func=" + i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            mm.y yVar = f410079e;
            if (yVar.b() || !f410076b) {
                yVar.c(java.lang.String.valueOf(i17));
            }
        }
    }

    public static void k(long j17, boolean z17) {
        boolean z18;
        long j18;
        long j19;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        mm.y yVar = f410078d;
        long b17 = b(yVar, j17, linkedHashMap, 5);
        long b18 = b(f410079e, j17, linkedHashMap, 5);
        mm.y yVar2 = f410080f;
        long b19 = b(yVar2, j17, linkedHashMap, 5);
        long b27 = b(f410081g, j17, linkedHashMap, 5);
        long b28 = b(f410082h, j17, linkedHashMap, 5);
        long b29 = b(f410083i, j17, linkedHashMap, 5);
        mm.y yVar3 = f410084j;
        long b37 = b(yVar3, j17, linkedHashMap, 5);
        long b38 = b(f410085k, j17, linkedHashMap, 5);
        long b39 = b(f410086l, j17, linkedHashMap, 5);
        long b47 = b(f410087m, j17, linkedHashMap, 0);
        long b48 = b(f410088n, j17, linkedHashMap, 0);
        long b49 = b(f410089o, j17, linkedHashMap, 5);
        long b57 = b(f410090p, j17, linkedHashMap, 5);
        long b58 = b(f410091q, j17, linkedHashMap, 5);
        double d17 = j17;
        double d18 = (b17 * 1.0d) / d17;
        if (d18 >= 15.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "#overHeat");
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18 || f410075a) {
            boolean z19 = z18;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j27 = currentTimeMillis - (j17 * 60000);
            long j28 = 0;
            long j29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("notify_power_light_push_on_ms", 0L);
            long j37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("notify_power_light_push_off_ms", 0L);
            if (j37 > j29 || j29 <= 0) {
                j18 = b18;
                j19 = j37;
            } else {
                j18 = b18;
                j19 = currentTimeMillis;
            }
            if (j29 > 0 && j29 < j19 && j27 <= j19 && currentTimeMillis >= j29) {
                long max = java.lang.Math.max(j27, j29);
                long min = java.lang.Math.min(currentTimeMillis, j19);
                if (min > max) {
                    long j38 = min - max;
                    if (j38 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                        j28 = java.lang.Math.max(1L, j38 / 60000);
                    }
                }
            }
            java.lang.String str = z17 ? "reportBgNotifyPoll" : "reportBgNotify";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(": minute=");
            sb6.append(j17);
            sb6.append(", lightPushMn=");
            sb6.append(j28);
            sb6.append(", pushNotifyCount=");
            sb6.append(b17);
            sb6.append(", receiveNotifyCount=");
            long j39 = j18;
            sb6.append(j39);
            sb6.append(", netSceneCount=");
            sb6.append(b19);
            sb6.append(", netSyncCount=");
            sb6.append(b27);
            sb6.append(", netMinSyncCount=");
            sb6.append(b28);
            sb6.append(", netSyncCmdCount=");
            sb6.append(b29);
            sb6.append(", addMsgTypeCount=");
            sb6.append(b37);
            sb6.append(", addAppMsgTypeCount=");
            sb6.append(b38);
            sb6.append(", addXmlMsgTypeCount=");
            sb6.append(b39);
            sb6.append(", addMsgActionCount=");
            sb6.append(b47);
            sb6.append(", addMsgMuteCount=");
            sb6.append(b48);
            sb6.append(", addMsgEmptyCount=");
            sb6.append(b49);
            sb6.append(", addMsgNotifyCount=");
            sb6.append(b57);
            sb6.append(", addMsgNotifyClickCount=");
            sb6.append(b58);
            sb6.append(", addictedNotifyDuringMs=");
            sb6.append(yVar.f410105e);
            sb6.append(", addictedNetDuringMs=");
            sb6.append(yVar2.f410105e);
            sb6.append(", addictedMsgDuringMs=");
            sb6.append(yVar3.f410105e);
            d("MicroMsg.NotifyPowerInspector", sb6.toString());
            linkedHashMap.put("trace-more", java.lang.Boolean.valueOf(f410075a));
            linkedHashMap.put("trace-addicted", java.lang.Boolean.valueOf(f410076b));
            linkedHashMap.put("minute", java.lang.Long.valueOf(j17));
            linkedHashMap.put("minute-lightPush", java.lang.Long.valueOf(j28));
            linkedHashMap.put("msg-addictNtf-during", java.lang.Long.valueOf(yVar.f410105e));
            linkedHashMap.put("msg-addictNtf-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar.f410105e * 1.0d) / d17, 2)));
            linkedHashMap.put("msg-addictNet-during", java.lang.Long.valueOf(yVar2.f410105e));
            linkedHashMap.put("msg-addictNet-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar2.f410105e * 1.0d) / d17, 2)));
            linkedHashMap.put("msg-addictMsg-during", java.lang.Long.valueOf(yVar3.f410105e));
            linkedHashMap.put("msg-addictMsg-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar3.f410105e * 1.0d) / d17, 2)));
            ap.a.a(1, (z17 ? "NotifySyncCounterPoll" : "NotifySyncCounter").concat(z19 ? "Exception" : ""), null, linkedHashMap, java.lang.String.valueOf(uh.i.p(d18, 2)), java.lang.String.valueOf(uh.i.p((j39 * 1.0d) / d17, 2)), java.lang.String.valueOf(uh.i.p((b27 * 1.0d) / d17, 2)), java.lang.String.valueOf(uh.i.p((b28 * 1.0d) / d17, 2)));
        }
    }

    public static void l(m3.a aVar) {
        f410094t = aVar;
    }

    public static void m(m3.a aVar) {
        f410093s = aVar;
    }

    public static void n(m3.a aVar) {
        f410092r = aVar;
    }
}

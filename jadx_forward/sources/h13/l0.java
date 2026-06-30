package h13;

@j95.b
/* loaded from: classes10.dex */
public final class l0 extends i95.w implements f13.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f359674d;

    /* renamed from: f, reason: collision with root package name */
    public long f359676f;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f359675e = new jz5.l(0L, "");

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f359677g = jz5.h.b(h13.h0.f359665d);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f359678h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f359679i = new java.util.concurrent.ConcurrentLinkedQueue();

    public static boolean Ui(h13.l0 l0Var, android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "isSilentMode ringMode=" + audioManager.getRingerMode() + " RING_MODE_NORMAL=2");
        return audioManager.getRingerMode() != 2;
    }

    public static boolean Vi(h13.l0 l0Var, android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "isVibrateMode ringMode=" + audioManager.getRingerMode() + " RINGER_MODE_SILENT=0");
        return audioManager.getRingerMode() > 0;
    }

    public long Ai(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        j13.a aVar = j13.a.f378710d;
        java.lang.String forcePushId = username.concat("@wxcontact");
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "getExpiredTime(" + forcePushId + ')');
        i13.j jVar = new i13.j();
        jVar.f66499xaeadb4bb = forcePushId;
        if (aVar.get(jVar, new java.lang.String[0])) {
            return jVar.f66497xc9a553ad;
        }
        return 0L;
    }

    public final java.util.ArrayList Bi() {
        j13.a.f378710d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "getList()");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        android.database.Cursor D = j13.a.f378711e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ExpiredTime>?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())}, null, null, "ExpiredTime Desc", 2);
        if (D != null) {
            try {
                D.moveToFirst();
                while (!D.isAfterLast()) {
                    i13.j jVar = new i13.j();
                    jVar.mo9015xbf5d97fd(D);
                    if (jVar.f66499xaeadb4bb != null) {
                        Bi.m(jVar.f66503x11b86abb);
                        arrayList.add(jVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "add List:%s", jVar);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f378712f;
                        java.lang.String field_ForcePushId = jVar.f66499xaeadb4bb;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
                        concurrentHashMap.put(field_ForcePushId, jVar);
                    }
                    D.moveToNext();
                }
                vz5.b.a(D, null);
            } finally {
            }
        }
        return arrayList;
    }

    public final java.lang.String Di(java.lang.String str) {
        return ".sysmsg" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if ((r2.f66500xda05eaf7 == 1) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if ((r5.f66500xda05eaf7 == 1) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "forcePushId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            j13.a r0 = j13.a.f378710d
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isNeedNotify("
            r0.<init>(r1)
            r0.append(r15)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ForceNotifyStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = j13.a.f378712f
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L4f
            java.lang.Object r2 = r0.get(r15)
            i13.j r2 = (i13.j) r2
            if (r2 == 0) goto L4f
            long r0 = c01.id.a()
            long r5 = r2.f66497xc9a553ad
            int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r15 < 0) goto L40
            r15 = r3
            goto L41
        L40:
            r15 = r4
        L41:
            if (r15 != 0) goto L4d
            int r15 = r2.f66500xda05eaf7
            if (r15 != r3) goto L49
            r15 = r3
            goto L4a
        L49:
            r15 = r4
        L4a:
            if (r15 == 0) goto L4d
            goto La3
        L4d:
            r3 = r4
            goto La3
        L4f:
            l75.k0 r5 = j13.a.f378711e
            java.lang.String r6 = "ForceNotifyData"
            java.lang.String r2 = "*"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            java.lang.String r8 = "ForcePushId=?"
            java.lang.String[] r9 = new java.lang.String[]{r15}
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            android.database.Cursor r2 = r5.D(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto Laf
            boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            if (r5 == 0) goto La5
            i13.j r5 = new i13.j     // Catch: java.lang.Throwable -> L9d
            r5.<init>()     // Catch: java.lang.Throwable -> L9d
            r5.mo9015xbf5d97fd(r2)     // Catch: java.lang.Throwable -> L9d
            r0.put(r15, r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "[isNeedNotify] forcePushId:%s %s"
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r5}     // Catch: java.lang.Throwable -> L9d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r15)     // Catch: java.lang.Throwable -> L9d
            long r0 = c01.id.a()     // Catch: java.lang.Throwable -> L9d
            long r7 = r5.f66497xc9a553ad     // Catch: java.lang.Throwable -> L9d
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 < 0) goto L90
            r15 = r3
            goto L91
        L90:
            r15 = r4
        L91:
            if (r15 != 0) goto L9f
            int r15 = r5.f66500xda05eaf7     // Catch: java.lang.Throwable -> L9d
            if (r15 != r3) goto L99
            r15 = r3
            goto L9a
        L99:
            r15 = r4
        L9a:
            if (r15 == 0) goto L9f
            goto La0
        L9d:
            r15 = move-exception
            goto La9
        L9f:
            r3 = r4
        La0:
            vz5.b.a(r2, r6)
        La3:
            r4 = r3
            goto Laf
        La5:
            vz5.b.a(r2, r6)
            goto Laf
        La9:
            throw r15     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            vz5.b.a(r2, r15)
            throw r0
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h13.l0.Ni(java.lang.String):boolean");
    }

    public final boolean Ri() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((android.app.KeyguardManager) systemService).inKeyguardRestrictedInputMode();
    }

    public final void Zi(i13.j info, boolean z17) {
        boolean d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (z17) {
            j13.a aVar = j13.a.f378710d;
            aVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "set(" + info.f66499xaeadb4bb + ')');
            if (j13.a.f378711e.m("ForceNotifyData", "UserName", info.mo9763xeb27878e()) >= 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f378712f;
                java.lang.String field_ForcePushId = info.f66499xaeadb4bb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
                concurrentHashMap.put(field_ForcePushId, info);
                aVar.m145262xf35bbb4();
                java.lang.String field_ForcePushId2 = info.f66499xaeadb4bb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId2, "field_ForcePushId");
                bn0.g.f104312a.k(field_ForcePushId2, new bn0.b(field_ForcePushId2, info.f66495x81959a6e, info.f66497xc9a553ad, info.f66500xda05eaf7, info.f66501x2253a77f));
                d17 = true;
            } else {
                d17 = false;
            }
        } else {
            java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.c());
            java.lang.String field_ForcePushId3 = info.f66499xaeadb4bb;
            this.f359675e = new jz5.l(valueOf, field_ForcePushId3);
            j13.a aVar2 = j13.a.f378710d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId3, "field_ForcePushId");
            d17 = aVar2.d(field_ForcePushId3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[onNewXmlReceived] ret:%s isAdd:%s info:%s", java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(z17), info);
    }

    public final void aj(i13.o item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_lock_phone_notification_switch, 0) > 0;
        boolean Ri = Ri();
        if (Ri && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[onReceiveLiveForcePush] phone is locking and cloud switch is not enable , noticeId=" + item.f368842s);
        } else {
            i13.n.f368830c.a().a(item);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(pm0.v.Z(item.f368835i), item.f368837n, 0, true, false, "", null);
            if (Ri) {
                hj(false);
            } else {
                ij();
            }
        }
    }

    public i13.o bj(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = "";
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "general_string", null);
        if (d17 != null && (str2 = (java.lang.String) d17.get(".general_string")) != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.lang.String optString = jSONObject.optString("feed_id");
                java.lang.String optString2 = jSONObject.optString("nonce_id");
                java.lang.String optString3 = jSONObject.optString("live_id");
                java.lang.String optString4 = jSONObject.optString("force_push_info");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                boolean z17 = true;
                if (optString4.length() == 0) {
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString4);
                java.lang.String optString5 = jSONObject2.optString("forcePushId");
                java.lang.String optString6 = jSONObject2.optString("userIcon");
                java.lang.String optString7 = jSONObject2.optString("extinfo");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString7);
                if (optString7.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    return null;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString7);
                java.lang.String optString8 = jSONObject3.optString("auth_icon_url", "");
                java.lang.String optString9 = jSONObject3.optString("nickname", "");
                java.lang.String optString10 = jSONObject3.optString("notify_wording", "");
                java.lang.String optString11 = jSONObject2.optString("subject");
                java.lang.String str4 = optString11 == null ? "" : optString11;
                java.lang.String optString12 = jSONObject2.optString("noticeId");
                if (optString12 != null) {
                    str3 = optString12;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "parseLiveForcePushItem forcePushId:" + optString5 + ", noticeId:" + str3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString9);
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.few);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                return new i13.o(optString5, optString6, optString9, string, optString, optString3, optString2, optString10, optString8, str4, null, str3, null, 0, null);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public void cj(boolean z17) {
        this.f359674d = z17;
    }

    public void fj(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            j13.a.f378710d.m145262xf35bbb4();
            return;
        }
        r45.i4 i4Var = new r45.i4();
        i4Var.f458249d = str.concat("@wxcontact");
        i4Var.f458250e = 10800;
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(213, i4Var));
        j13.a aVar = j13.a.f378710d;
        java.lang.String ForcePushId = i4Var.f458249d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ForcePushId, "ForcePushId");
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "set(" + str + ", " + ForcePushId + ')');
        i13.j jVar = new i13.j();
        jVar.f66503x11b86abb = str;
        jVar.f66499xaeadb4bb = ForcePushId;
        long c17 = c01.id.c();
        jVar.f66495x81959a6e = c17;
        jVar.f66497xc9a553ad = c17 + 10800000;
        boolean z17 = true;
        jVar.f66500xda05eaf7 = 1;
        if (j13.a.f378711e.m("ForceNotifyData", "UserName", jVar.mo9763xeb27878e()) >= 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f378712f;
            java.lang.String field_ForcePushId = jVar.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
            concurrentHashMap.put(field_ForcePushId, jVar);
            aVar.m145262xf35bbb4();
            java.lang.String field_ForcePushId2 = jVar.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId2, "field_ForcePushId");
            bn0.g.f104312a.k(field_ForcePushId2, new bn0.b(field_ForcePushId2, jVar.f66495x81959a6e, jVar.f66497xc9a553ad, jVar.f66500xda05eaf7, jVar.f66501x2253a77f));
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[setting] " + str + " ret:%s", java.lang.Boolean.valueOf(z17));
    }

    public final void hj(boolean z17) {
        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "clazzName:ForceNotifyShowUI topActivityName:" + n07);
        if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ForceNotifyShowUI", n07)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "showNotifyActivity add to pendingQueue");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "showNotifyActivity first show");
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965.class);
        intent.addFlags(268435456);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[notifyShow]");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ij() {
        i13.c cVar = (i13.c) i13.n.f368830c.a().f368832a.poll();
        if (cVar != null) {
            k13.n0 n0Var = k13.l1.I;
            n0Var.a().f(cVar);
            n0Var.a().c();
        }
    }

    public void wi(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            j13.a.f378710d.m145262xf35bbb4();
            return;
        }
        r45.fc0 fc0Var = new r45.fc0();
        fc0Var.f455727d = str;
        fc0Var.f455728e = i17;
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(214, fc0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[delete] ".concat(str));
    }
}

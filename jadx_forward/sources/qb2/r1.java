package qb2;

/* loaded from: classes8.dex */
public final class r1 implements zy2.s7 {

    /* renamed from: b, reason: collision with root package name */
    public int f442814b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f442816d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f442821i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f442822j;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f442813a = jz5.h.b(new qb2.n1(this));

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f442815c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("FinderGlobalPushNewXmlConsumer");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f442817e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f442818f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderGlobalPushNewXmlConsumerHandler");

    /* renamed from: g, reason: collision with root package name */
    public final qb2.b1 f442819g = new qb2.b1(this);

    /* renamed from: h, reason: collision with root package name */
    public long f442820h = -1;

    public r1() {
        com.p314xaae8f345.mm.app.w.INSTANCE.a(new qb2.w0(this));
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new qb2.y0(this));
        }
    }

    public static final boolean a(qb2.r1 r1Var, long j17) {
        r1Var.getClass();
        return (j17 & c01.z1.j()) != 0;
    }

    public static /* synthetic */ void i(qb2.r1 r1Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            concurrentHashMap = r1Var.j();
        }
        r1Var.h(concurrentHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r6 = this;
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r1 = 0
            boolean r0 = iq.b.l(r0, r1)
            int r2 = r6.f442814b
            r3 = 1
            if (r2 > 0) goto L11
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r2 = r1
            goto L12
        L11:
            r2 = r3
        L12:
            if (r2 == 0) goto L9d
            if (r0 != 0) goto L9d
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            boolean r0 = r0.U0()
            if (r0 == 0) goto L9d
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r0 = i95.n0.c(r0)
            zy2.c9 r0 = (zy2.c9) r0
            java.lang.Class<ws5.g> r2 = ws5.g.class
            i95.m r2 = i95.n0.c(r2)
            ws5.g r2 = (ws5.g) r2
            wo2.k r2 = (wo2.k) r2
            java.util.Set r4 = r2.f529622i
            int r4 = r4.size()
            if (r4 <= 0) goto L3a
            r4 = r3
            goto L3b
        L3a:
            r4 = r1
        L3b:
            if (r4 != 0) goto L4d
            java.util.Set r2 = r2.f529621h
            int r2 = r2.size()
            if (r2 <= 0) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L4b
            goto L4d
        L4b:
            r2 = r1
            goto L4e
        L4d:
            r2 = r3
        L4e:
            com.tencent.mm.plugin.finder.service.l3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) r0
            java.util.Set r4 = r0.f207665r
            int r4 = r4.size()
            if (r4 <= 0) goto L5a
            r4 = r3
            goto L5b
        L5a:
            r4 = r1
        L5b:
            boolean r5 = r0.f207654d
            if (r5 == 0) goto L67
            boolean r0 = r0.Vi()
            if (r0 == 0) goto L67
            r0 = r3
            goto L68
        L67:
            r0 = r1
        L68:
            if (r2 != 0) goto L6e
            if (r4 != 0) goto L6e
            if (r0 == 0) goto L6f
        L6e:
            r1 = r3
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[checkInFinder] isInNearby="
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = ", isFinderForeground="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", isHomeFromFinderTask="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", finderSceneCount="
            r3.append(r0)
            int r0 = r6.f442814b
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "Finder.GlobalPushNewXmlConsumer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r2 = r1
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qb2.r1.b():boolean");
    }

    public final void c(long j17, qb2.c1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        boolean z17 = true;
        if (this.f442822j && source != qb2.c1.f442718h && source != qb2.c1.f442714d) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            if (this.f442820h == -1) {
                this.f442820h = uptimeMillis;
            }
            long j18 = uptimeMillis - this.f442820h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!(j18 > ((long) 2) * ((long) ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209150b7).mo141623x754a37bb()).r()).intValue()))) {
                return;
            } else {
                this.f442822j = false;
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!iq.b.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false) && !iq.b.H() && !this.f442821i && !this.f442816d) {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f442818f;
            qb2.b1 b1Var = this.f442819g;
            n3Var.mo50300x3fa464aa(b1Var);
            b1Var.getClass();
            b1Var.f442711d = source;
            if (j17 > 0) {
                n3Var.mo50297x7c4d7ca2(b1Var, j17);
            } else {
                n3Var.mo50293x3498a0(b1Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", "[checkPendTaskToRun] Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms source=" + source + " delayMs=" + j17 + " isCurrentSensitiveScene=" + z17 + '[' + this.f442821i + ']');
    }

    public final android.content.Intent d(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, long j18, int i17, long j19, java.lang.String str5, int i18, int i19) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Finder.GlobalPushNewXmlConsumer", true);
        intent.putExtra("KEY_SESSION_ID", str);
        intent.putExtra("KEY_REPORT_EXT_INFO", str2);
        intent.putExtra("KEY_PUSH_CTRL_FLAG", j18);
        intent.putExtra("KEY_PUSH_DEMOTION_FLAG", j19);
        intent.putExtra("KEY_TASK_ID", str3);
        intent.putExtra("KEY_OBJECT_ID", j17);
        intent.putExtra("KEY_OBJECT_NONCE_ID", str4);
        intent.putExtra("KEY_PUSH_RETURN_TO", i17);
        intent.putExtra("KEY_UDF_KV", str5);
        intent.putExtra("KEY_JUMP_TYPE_CODE", i18);
        intent.putExtra("KEY_PUSH_LEVEL", i19);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("taskId", str3);
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e.class);
        return intent;
    }

    public final android.content.Intent e(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, int i17, long j18, long j19, int i18, java.lang.String str6, int i19, int i27) {
        android.content.Intent d17 = d(str, str2, str3, j17, str4, j18, i18, j19, str6, i19, i27);
        d17.putExtra("KEY_ROUTE_TYPE", 0);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(29, 2, 20, d17);
        d17.putExtra("KEY_BY_PASS_INFO_TYPE", i17);
        d17.putExtra("KEY_BY_PASS_INFO", str5);
        d17.putExtra("KEY_OBJECT_ID", j17);
        d17.putExtra("KEY_OBJECT_NONCE_ID", str4);
        d17.putExtra("KEY_TARGET_TAB_TYPE", 4);
        d17.putExtra("KEY_SOURCE_TYPE", 2);
        d17.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
        d17.putExtra("KEY_FINDER_IS_NEED_REFRESH_TAB", true);
        d17.putExtra("FROM_SCENE_KEY", 5);
        return d17;
    }

    public final void f(java.lang.String str, java.util.Map map, int i17, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.Object obj = map.get(".sysmsg.content.object_id");
        java.lang.String str5 = (java.lang.String) obj;
        if (!(!(str5 == null || str5.length() == 0))) {
            obj = null;
        }
        java.lang.String str6 = (java.lang.String) obj;
        java.lang.String str7 = str6 == null ? "" : str6;
        long Z = pm0.v.Z(str7);
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.content.nonce_id");
        java.lang.String str9 = str8 == null ? "" : str8;
        java.lang.String str10 = (java.lang.String) map.get(".sysmsg.content.title");
        if (str10 == null) {
            str10 = "";
        }
        java.lang.String str11 = (java.lang.String) map.get(".sysmsg.content.body");
        java.lang.String str12 = str11 == null ? "" : str11;
        java.lang.String str13 = (java.lang.String) map.get(".sysmsg.content.image_url");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.jump_to"), 0);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.fail_return_to"), 0);
        java.lang.String str14 = (java.lang.String) map.get(".sysmsg.content.bypass_info");
        java.lang.String str15 = str14 == null ? "" : str14;
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.action_type"), 0);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(".sysmsg.content.demotion_flag"));
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(".sysmsg.content.ctrl_flag"));
        int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.bypass_type"), 0);
        int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.auth_icon_type"), 0);
        int D15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.alert_display_time"), 0);
        int i18 = f0Var.f391649d != 2 ? 1 : 2;
        java.lang.String str16 = (java.lang.String) map.get(".sysmsg.content.jump_info");
        byte[] decode = android.util.Base64.decode(str16 != null ? str16 : "", 0);
        if (!(!(decode == null || decode.length == 0))) {
            decode = null;
        }
        if (decode != null) {
            if (f0Var.f391649d != 6) {
                f0Var.f391649d = 10000;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            c19786x6a1e28622.mo11468x92b714fd(decode);
            c19786x6a1e2862 = c19786x6a1e28622;
        } else {
            c19786x6a1e2862 = null;
        }
        if (str10.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.GlobalPushNewXmlConsumer", "title is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23669, str, "return", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "12", java.lang.Integer.valueOf(D12), java.lang.Integer.valueOf(f0Var.f391649d));
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        boolean z18 = (E12 & 1) != 0;
        boolean z19 = (E12 & 128) != 0;
        if (str13 == null || str13.length() == 0) {
            l(str9, str7, Z, f0Var.f391649d, str15, D13, str, string, str10, str12, null, z18, z19, E1, E12, D1, D14, D15, str2, i18, i17, z17, str3, str4, c19786x6a1e2862);
            return;
        }
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str13, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411496q));
        qb2.g1 g1Var2 = new qb2.g1(a17);
        b17.getClass();
        b17.f529406d = g1Var2;
        b17.f529412j = new qb2.j1(a17);
        b17.f529411i = new qb2.k1(a17);
        b17.a();
        p3325xe03a0797.p3326xc267989b.l.f(null, new qb2.l1(a17, this, str9, str7, Z, f0Var, str15, D13, str, string, str10, str12, z18, z19, E1, E12, D1, D14, D15, str2, i18, i17, z17, str3, str4, c19786x6a1e2862, D12, null), 1, null);
    }

    public final boolean g(java.lang.String str) {
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        qb2.a1 a1Var = (qb2.a1) j().get(str);
        int i17 = a1Var != null ? a1Var.f442693a : 0;
        boolean z17 = a1Var != null ? a1Var.f442694b : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", "[cancel] taskId=" + str + " notificationId=" + i17 + " isInnerPush=" + z17);
        if (z17) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).l("notification-" + i17);
        } else if (notificationManager != null) {
            notificationManager.cancel(i17);
        }
        u();
        return j().remove(str) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.concurrent.ConcurrentHashMap r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb2.r1.h(java.util.concurrent.ConcurrentHashMap):void");
    }

    public final java.util.concurrent.ConcurrentHashMap j() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f442813a).mo141623x754a37bb();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:1|(27:2|3|4|(2:271|272)|6|(1:8)(1:270)|9|10|11|12|(1:14)|15|(1:17)(1:266)|18|(1:20)(1:265)|21|(1:23)(1:264)|24|(1:26)(1:263)|(1:(1:(1:262)(1:261))(1:258))(1:29)|30|(1:32)(1:255)|33|(2:253|254)(1:35)|36|(2:40|41)|42)|(29:246|(2:248|(1:250))|252|47|48|49|50|(3:232|233|(2:237|(10:239|53|54|(1:58)|59|(1:230)(2:63|(10:65|66|67|68|69|(1:71)(1:93)|72|73|74|(2:76|77)(2:79|80)))|97|98|99|(10:224|66|67|68|69|(0)(0)|72|73|74|(0)(0))(11:104|105|106|(1:108)(1:221)|109|110|111|112|113|114|(3:116|117|118)(2:119|(2:124|(1:(1:(3:143|(1:208)(1:147)|(2:149|150)(2:(2:152|(2:154|155))(1:207)|(1:(2:161|162)(1:(2:164|165)(1:(2:167|168)(1:(2:170|171)(1:(2:173|174)(3:175|(1:(2:178|179)(1:180))|(7:186|(1:188)(2:203|(1:205)(1:206))|(4:(1:191)(1:201)|192|193|194)(1:202)|195|196|84|(4:86|(1:88)(1:91)|89|90)(1:92))(2:184|185)))))))(2:158|159)))(2:141|142))(2:134|135))(2:127|128))(2:122|123))))))|52|53|54|(2:56|58)|59|(0)|230|97|98|99|(1:102)|224|66|67|68|69|(0)(0)|72|73|74|(0)(0))|46|47|48|49|50|(0)|52|53|54|(0)|59|(0)|230|97|98|99|(0)|224|66|67|68|69|(0)(0)|72|73|74|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(56:1|2|3|4|(2:271|272)|6|(1:8)(1:270)|9|10|11|12|(1:14)|15|(1:17)(1:266)|18|(1:20)(1:265)|21|(1:23)(1:264)|24|(1:26)(1:263)|(1:(1:(1:262)(1:261))(1:258))(1:29)|30|(1:32)(1:255)|33|(2:253|254)(1:35)|36|(2:40|41)|42|(29:246|(2:248|(1:250))|252|47|48|49|50|(3:232|233|(2:237|(10:239|53|54|(1:58)|59|(1:230)(2:63|(10:65|66|67|68|69|(1:71)(1:93)|72|73|74|(2:76|77)(2:79|80)))|97|98|99|(10:224|66|67|68|69|(0)(0)|72|73|74|(0)(0))(11:104|105|106|(1:108)(1:221)|109|110|111|112|113|114|(3:116|117|118)(2:119|(2:124|(1:(1:(3:143|(1:208)(1:147)|(2:149|150)(2:(2:152|(2:154|155))(1:207)|(1:(2:161|162)(1:(2:164|165)(1:(2:167|168)(1:(2:170|171)(1:(2:173|174)(3:175|(1:(2:178|179)(1:180))|(7:186|(1:188)(2:203|(1:205)(1:206))|(4:(1:191)(1:201)|192|193|194)(1:202)|195|196|84|(4:86|(1:88)(1:91)|89|90)(1:92))(2:184|185)))))))(2:158|159)))(2:141|142))(2:134|135))(2:127|128))(2:122|123))))))|52|53|54|(2:56|58)|59|(0)|230|97|98|99|(1:102)|224|66|67|68|69|(0)(0)|72|73|74|(0)(0))|46|47|48|49|50|(0)|52|53|54|(0)|59|(0)|230|97|98|99|(0)|224|66|67|68|69|(0)(0)|72|73|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0e66, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0e69, code lost:
    
        r6 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0e6e, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0e71, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01eb, code lost:
    
        if (q() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0e5f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e64, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0e61, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0e62, code lost:
    
        r6 = r57;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0d36 A[Catch: all -> 0x0e5f, TryCatch #12 {all -> 0x0e5f, blocks: (B:74:0x0d2c, B:76:0x0d36, B:79:0x0dca), top: B:73:0x0d2c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0dca A[Catch: all -> 0x0e5f, TRY_LEAVE, TryCatch #12 {all -> 0x0e5f, blocks: (B:74:0x0d2c, B:76:0x0d36, B:79:0x0dca), top: B:73:0x0d2c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0d28  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p944x882e457a.q0 k(java.lang.String r56, java.util.Map r57, com.p314xaae8f345.mm.p944x882e457a.p0 r58, java.lang.String r59) {
        /*
            Method dump skipped, instructions count: 3766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb2.r1.k(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0, java.lang.String):com.tencent.mm.modelbase.q0");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r31, java.lang.String r32, long r33, int r35, java.lang.String r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, android.graphics.Bitmap r42, boolean r43, boolean r44, long r45, long r47, int r49, int r50, int r51, java.lang.String r52, int r53, int r54, boolean r55, java.lang.String r56, java.lang.String r57, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 r58) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb2.r1.l(java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, boolean, boolean, long, long, int, int, int, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, com.tencent.mm.protocal.protobuf.FinderJumpInfo):void");
    }

    public final void m(qb2.z0 z0Var) {
        this.f442817e.add(z0Var);
        java.util.Map map = z0Var.f442852b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String str = (java.lang.String) z0Var.f442852b.get(".sysmsg.content.task_id");
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.zj0 zj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.zj0();
        zj0Var.f69186x88be67a1 = str;
        java.lang.String str2 = z0Var.f442851a;
        zj0Var.f69188x5334f55 = str2 != null ? str2 : "";
        zj0Var.f69190x33f8556f = jSONObject2;
        zj0Var.f69187x8fc77036 = z0Var.f442854d;
        zj0Var.f69185xac3be4e = c01.id.c();
        zj0Var.f69189x2262335f = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewXmlDataLogic", "insertNewXmlData data: " + zj0Var + ", success: " + ((c61.l7) i95.n0.c(c61.l7.class)).jk().mo880xb970c2b9(zj0Var));
    }

    public final boolean n() {
        return (c01.z1.j() & 2305843009213693952L) == 0;
    }

    public final boolean o() {
        return (c01.z1.j() & 34359738368L) != 0;
    }

    public final boolean p() {
        return (c01.z1.j() & 9007199254740992L) != 0;
    }

    public final boolean q() {
        return (c01.z1.j() & 70368744177664L) != 0;
    }

    public final boolean r() {
        return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_APP_PUSH_SETTING_SHOW_BOOLEAN, false);
    }

    public final void s(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, boolean z17, boolean z18, int i18, int i19, int i27, boolean z19) {
        i13.c t1Var;
        if (i27 == 2) {
            t1Var = new qb2.s1("notification-" + i17, str, str2, bitmap, i18, i19 * 1000, z17, z18, intent);
        } else {
            t1Var = new qb2.t1("notification-" + i17, str, str2, bitmap, i18, i19 * 1000, z17, z18, intent);
        }
        if (!z19) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f(t1Var);
            ((k13.g) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).c();
            return;
        }
        k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
        l1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new k13.h1(l1Var, t1Var));
    }

    public final qb2.z0 t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.zj0 zj0Var) {
        java.util.HashMap linkedHashMap;
        java.lang.String str = zj0Var.f69188x5334f55;
        if (str.length() == 0) {
            str = null;
        }
        java.lang.String field_valuesJSON = zj0Var.f69190x33f8556f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_valuesJSON, "field_valuesJSON");
        if (field_valuesJSON.length() == 0) {
            linkedHashMap = new java.util.LinkedHashMap();
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(field_valuesJSON);
                linkedHashMap = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    linkedHashMap.put(next, jSONObject.get(next).toString());
                }
            } catch (java.lang.Exception unused) {
                linkedHashMap = new java.util.LinkedHashMap();
            }
        }
        return new qb2.z0(str, linkedHashMap, null, zj0Var.f69187x8fc77036);
    }

    public final void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : j().entrySet()) {
            sb6.append((java.lang.String) entry.getKey());
            sb6.append("=");
            sb6.append(((qb2.a1) entry.getValue()).f442693a);
            sb6.append("@");
            sb6.append(((qb2.a1) entry.getValue()).f442694b ? 1 : 0);
            sb6.append(";");
        }
        this.f442815c.putString("HITORY_NOTIFICATION_RECORD", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", "[updateHistoryNotificationListRecord] " + ((java.lang.Object) sb6));
    }
}

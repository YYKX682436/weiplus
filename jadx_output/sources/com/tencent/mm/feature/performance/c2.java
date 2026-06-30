package com.tencent.mm.feature.performance;

@j95.b(dependencies = {lh.k.class, ob0.o2.class, com.tencent.mm.feature.performance.api.a.class, ob0.f.class})
/* loaded from: classes12.dex */
public class c2 extends i95.w implements ob0.h3 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile sp3.b f67534g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f67535d = new com.tencent.mm.feature.performance.j2(this);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f67536e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f67537f;

    public c2() {
        this.f67536e = com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.j() || com.tencent.mm.sdk.platformtools.x2.s();
        this.f67537f = 0L;
    }

    public ob0.s2 Ai(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "getBizMemoryStat %s", str);
        return new com.tencent.mm.plugin.performance.watchdogs.i(str, j17);
    }

    public final void Bi() {
        ((ku5.t0) ku5.t0.f312615d).k(this.f67535d, 300000L);
    }

    public final void Di() {
        boolean z17 = true;
        boolean f17 = ih.a.f(e42.d0.clicfg_matrix_memory_mallopt_purge, true);
        boolean f18 = ih.a.f(e42.d0.clicfg_matrix_memory_mallopt_purge_32_bit, false);
        if (!f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "setupMallOpt: disabled");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.z.f193115k && !f18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "setupMallOpt: disabled for 32bit");
            return;
        }
        com.tencent.mm.feature.performance.f2 f2Var = new com.tencent.mm.feature.performance.f2(this);
        ki.i iVar = ki.i.f308101c;
        iVar.c(f2Var);
        e42.d0 d0Var = e42.d0.clicfg_matrix_memory_mallopt_purge_app_bg;
        if (!z65.c.a() && !o45.wf.f343033k) {
            z17 = false;
        }
        if (ih.a.f(d0Var, z17)) {
            iVar.b(f2Var);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        int i17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.util.List<android.hardware.Sensor> sensorList = ((android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor")).getSensorList(-1);
            if (mm.l.c() || mm.l.b()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (android.hardware.Sensor sensor : sensorList) {
                    java.lang.String name = sensor.getName();
                    int id6 = sensor.getId();
                    int type = sensor.getType();
                    float power = sensor.getPower();
                    try {
                        i17 = ((java.lang.Integer) sensor.getClass().getDeclaredMethod("getHandle", new java.lang.Class[0]).invoke(sensor, new java.lang.Object[0])).intValue();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.w("HealthStatsHelper", "getSensorHandle err: " + th6.getMessage());
                        i17 = 0;
                    }
                    sb6.append(sb6.length() == 0 ? "" : ",");
                    sb6.append(name);
                    sb6.append(":");
                    sb6.append(id6);
                    sb6.append(":");
                    sb6.append(type);
                    sb6.append(":");
                    sb6.append(i17);
                    sb6.append(":");
                    sb6.append(power);
                }
                com.tencent.mars.xlog.Log.i("HealthStatsHelper", "Sensors = " + ((java.lang.Object) sb6));
            }
            final android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (mm.o.b() || mm.o.c()) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                try {
                    wh.n1 j17 = wh.n1.j(context2);
                    for (java.util.Map.Entry entry : wh.n1.f445838c.entrySet()) {
                        linkedHashMap.put("powerItem-" + ((java.lang.String) entry.getKey()), entry.getValue());
                    }
                    for (java.util.Map.Entry entry2 : wh.n1.f445839d.entrySet()) {
                        java.lang.Double[] dArr = (java.lang.Double[]) entry2.getValue();
                        int i18 = 0;
                        while (i18 < dArr.length) {
                            java.lang.Double d17 = dArr[i18];
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("powerArray-");
                            sb7.append((java.lang.String) entry2.getKey());
                            sb7.append("-");
                            i18++;
                            sb7.append(i18);
                            linkedHashMap.put(sb7.toString(), d17);
                        }
                    }
                    int o17 = wh.m.o();
                    int g17 = j17.g();
                    int length = j17.f445842a.length;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    for (int i19 = 0; i19 < j17.f445842a.length; i19++) {
                        int i27 = j17.i(i19);
                        sb8.append(sb8.length() == 0 ? "" : ";");
                        sb8.append(i27);
                    }
                    linkedHashMap.put("resType", wh.n1.f445841f);
                    ap.a.a(1, "powerProfCompat", null, linkedHashMap, java.lang.String.valueOf(o17), java.lang.String.valueOf(g17), java.lang.String.valueOf(length), sb8.toString());
                    gi.u0.e(j17);
                } catch (java.lang.Throwable th7) {
                    ap.a.a(1, "powerProfCompat", th7, linkedHashMap, "err", th7.getMessage());
                }
                ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: gi.u0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i28;
                        android.content.Context context3 = context2;
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        gi.p1 p1Var = new gi.p1();
                        try {
                        } catch (java.lang.Exception unused) {
                        }
                        for (java.lang.String str : android.system.Os.getenv("CUST_POLICY_DIRS").split(":")) {
                            java.io.File file = new java.io.File(str, "/xml/power_profile.xml");
                            if (file.exists() && file.canRead()) {
                                p1Var.e(context3, file);
                                p1Var.d();
                                linkedHashMap2.put("custom", gi.u0.a("custom", p1Var));
                                try {
                                    gi.p1.f272082b.clear();
                                    gi.p1.f272083c.clear();
                                    p1Var.f(context3, "power_profile");
                                    p1Var.d();
                                    linkedHashMap2.put(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, gi.u0.a(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, p1Var));
                                } catch (java.lang.Exception unused2) {
                                }
                                try {
                                    gi.p1.f272082b.clear();
                                    gi.p1.f272083c.clear();
                                    p1Var.f(context3, "power_profile_test");
                                    p1Var.d();
                                    linkedHashMap2.put("test", gi.u0.a("test", p1Var));
                                } catch (java.lang.Exception unused3) {
                                }
                                ap.a.a(1, "powerProfWatt", null, linkedHashMap2, new java.lang.String[0]);
                                return;
                            }
                        }
                        throw new java.io.FileNotFoundException("/xml/power_profile.xml");
                    }
                }, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
            gm0.j1.e().k(new com.tencent.mm.feature.performance.k2(this), 2000L);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(9:3|(8:78|(3:80|(2:83|81)|84)(3:85|(2:88|86)|89)|6|(4:9|(3:11|12|13)(1:15)|14|7)|16|17|(3:20|(9:22|(8:24|(1:26)(2:67|68)|27|(2:30|28)|31|32|(11:34|(2:37|35)|38|39|(7:41|(1:43)(2:59|60)|44|(4:46|(1:48)(2:52|53)|49|50)(1:58)|57|49|50)|64|44|(0)(0)|57|49|50)(2:65|66)|51)|72|27|(1:28)|31|32|(0)(0)|51)(3:73|74|75)|18)|77)|5|6|(1:7)|16|17|(1:18)|77)|92|(1:94)|95|(7:389|390|391|(1:393)(3:425|(1:430)|431)|394|395|(1:397)(2:398|(1:400)(8:401|402|403|404|405|(2:407|408)|410|411)))(5:99|100|101|(3:103|(1:108)|109)|110)|111|112|(14:344|345|346|(2:374|(1:376)(3:377|(1:382)|383))|348|349|(1:351)(2:353|(1:355)(5:356|357|358|359|360))|352|118|(2:120|(1:122)(40:123|124|125|(2:127|(1:129)(3:130|(1:135)|136))|137|138|139|(6:300|301|302|(1:304)(1:319)|(1:306)(2:309|(1:311)(3:312|(1:317)|318))|307)(6:143|144|145|(1:147)(1:297)|(1:149)(2:287|(1:289)(3:290|(1:295)|296))|150)|151|(1:153)|154|(1:156)(1:285)|157|(3:278|279|(1:281)(1:282))|159|(1:163)|164|(1:166)(1:277)|167|168|169|(1:171)(2:268|(1:270)(2:271|(1:273)(1:274)))|172|173|(1:175)(3:263|(1:265)|266)|176|(1:178)(1:262)|179|(3:181|(1:260)(1:185)|(25:187|188|(1:190)(2:251|(1:253)(2:254|(1:259)(1:258)))|191|(1:193)|194|(1:196)|197|(1:199)|200|990|205|(7:207|(1:209)|210|(1:246)|214|(1:216)(1:245)|217)(1:247)|218|(1:244)|222|(3:224|(1:230)(1:228)|229)|231|(1:233)|234|(1:236)(1:243)|237|(1:239)(1:242)|240|241))|261|188|(0)(0)|191|(0)|194|(0)|197|(0)|200|990))|325|326|327|(41:329|139|(1:141)|300|301|302|(0)(0)|(0)(0)|307|151|(0)|154|(0)(0)|157|(0)|159|(2:161|163)|164|(0)(0)|167|168|169|(0)(0)|172|173|(0)(0)|176|(0)(0)|179|(0)|261|188|(0)(0)|191|(0)|194|(0)|197|(0)|200|990)(44:330|(1:332)(3:335|(1:340)|341)|333|138|139|(0)|300|301|302|(0)(0)|(0)(0)|307|151|(0)|154|(0)(0)|157|(0)|159|(0)|164|(0)(0)|167|168|169|(0)(0)|172|173|(0)(0)|176|(0)(0)|179|(0)|261|188|(0)(0)|191|(0)|194|(0)|197|(0)|200|990))(1:116)|117|118|(0)|325|326|327|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x05e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x05ea, code lost:
    
        r12 = 0;
        com.tencent.mm.app.p5.d("MicroMsg.GCSemiSpaceTrimWrapper", r0, "[-] Fail to mark enabled.", new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0991 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0714 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x066a A[Catch: all -> 0x06a4, TryCatch #2 {all -> 0x06a4, blocks: (B:302:0x065c, B:309:0x066a, B:311:0x067a, B:312:0x0680, B:314:0x068f, B:317:0x0696, B:318:0x069d), top: B:301:0x065c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1 A[LOOP:2: B:28:0x019b->B:30:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05af A[Catch: all -> 0x05e9, TryCatch #4 {all -> 0x05e9, blocks: (B:327:0x05a8, B:330:0x05af, B:332:0x05be, B:335:0x05c4, B:337:0x05d3, B:340:0x05da, B:341:0x05e1), top: B:326:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v191, types: [h62.d] */
    /* JADX WARN: Type inference failed for: r0v203, types: [h62.d] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v16, types: [kz5.p0] */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(final android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 2738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.c2.onCreate(android.content.Context):void");
    }

    public ob0.b3 wi() {
        return com.tencent.mm.plugin.performance.watchdogs.b0.B;
    }
}

package wp3;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d implements com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f529925h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f529926i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f529927m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Set f529928n;

    /* renamed from: g, reason: collision with root package name */
    public final wp3.a f529929g = new wp3.a(this);

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f529928n = new java.util.HashSet();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.p();
        java.lang.String str2 = f529925h + p17;
        f529925h = str2;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/pthread_hook";
        java.lang.String str4 = str3 + "/" + p17 + android.os.Process.myPid() + "_pthread_hook.json";
        f529926i = new com.p314xaae8f345.mm.vfs.r6(str3);
        f529927m = new com.p314xaae8f345.mm.vfs.r6(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "init dump file path = %s", str4);
    }

    public static java.lang.String u(java.util.Map map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f529925h, e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public double A4() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return 1.0d / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_diagnostic_pthread_hook_expt_rate_denominator, -1L);
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public void Sg(double d17) {
        tp3.a.INSTANCE.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_diagnostic_pthread_hook_expt_cmd, "<cmd><diagnostic><PthreadHook\n enable='1' process='all' duration='24' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>", true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, 10, 1);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 50 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? 51 : (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) ? 52 : -1, 1);
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public long V3() {
        return java.util.concurrent.TimeUnit.DAYS.toMinutes(1L);
    }

    @Override // tp3.c
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f529925h, "onRegistered: %s", "PthreadHook");
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.y.f234487e.a("pthread", this);
        com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c.f150239f.a(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h() {
        return this.f529929g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public java.lang.String j() {
        return "PthreadHook";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook=");
        wp3.a aVar = this.f529929g;
        sb6.append(aVar.f234454a.u(aVar.f529922l, ""));
        sb6.append(",thread=");
        sb6.append(aVar.f234454a.u(aVar.f529924n, ""));
        sb6.append("\t");
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public java.lang.String key() {
        return "PthreadHook";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, 12, 1);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 70 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? 71 : (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) ? 72 : -1, 1);
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public xh.b q() {
        wp3.a aVar = this.f529929g;
        java.lang.String u17 = aVar.f234454a.u(aVar.f529922l, "");
        java.lang.String str = aVar.f529923m;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = aVar.f234454a;
        java.lang.String u18 = o4Var.u(str, null);
        java.lang.String u19 = o4Var.u(aVar.f529924n, "");
        java.lang.String[] split = u17.split(";");
        java.lang.String[] split2 = u18 == null ? new java.lang.String[0] : u18.split(";");
        java.lang.String[] split3 = u19 == null ? new java.lang.String[]{".*"} : u19.split(";");
        java.lang.Object[] objArr = {java.util.Arrays.toString(split)};
        java.lang.String str2 = f529925h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hookRegex = %s (ignored)", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "ignoreRegex = %s (ignored)", java.util.Arrays.toString(split2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "threadRegex = %s", java.util.Arrays.toString(split3));
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d c4657x40d13e9d = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d.f134210h;
        c4657x40d13e9d.f134214e = true;
        for (java.lang.String str3 : split3) {
            if (android.text.TextUtils.isEmpty(str3)) {
                oj.j.b("Matrix.Pthread", "thread regex is empty!!!", new java.lang.Object[0]);
            } else {
                ((java.util.HashSet) c4657x40d13e9d.f134211b).add(str3);
            }
        }
        c4657x40d13e9d.f(true);
        return c4657x40d13e9d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public void s(boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        int i17;
        java.util.Set set;
        java.lang.String str;
        v();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(f529927m.o());
        java.lang.String str2 = "\n\t";
        java.lang.String str3 = ";";
        java.lang.Object[] objArr = {r6Var2.m82467xfb82e301(), sp3.d.f(r6Var2.B())};
        java.lang.String str4 = f529925h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", objArr);
        if (r6Var2.m()) {
            try {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(sp3.d.e(r6Var2.o())).getJSONArray("PthreadHook_not_exited");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    int i18 = 0;
                    while (i18 < jSONArray.length()) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(jSONObject.getString("hash"), 0L);
                        java.lang.String string = jSONObject.getString("native");
                        java.lang.String string2 = jSONObject.getString("java");
                        org.json.JSONArray jSONArray2 = jSONArray;
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.getString("count"), 0);
                        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("threads");
                        r6Var = r6Var2;
                        int i19 = i18;
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "------------------------------- hash= %d -------------------------------", java.lang.Long.valueOf(V));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "native\n\t%s", string.replace(str3, str2));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "java\n\t%s", string2.replace(str3, str2));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "ThreadCount = %d", java.lang.Integer.valueOf(P));
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.HashSet hashSet = new java.util.HashSet();
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            java.lang.String str5 = str2;
                            java.lang.String str6 = str3;
                            int i27 = 0;
                            while (true) {
                                int length = jSONArray3.length();
                                i17 = P;
                                set = f529928n;
                                str = string2;
                                if (i27 >= length) {
                                    break;
                                }
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                java.lang.String str7 = string;
                                org.json.JSONObject jSONObject2 = jSONArray3.getJSONObject(i27);
                                org.json.JSONArray jSONArray4 = jSONArray3;
                                java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
                                long j17 = V;
                                java.lang.String optString2 = jSONObject2.optString("tid", "-1");
                                java.lang.String optString3 = jSONObject2.optString("renames", "");
                                sb6.append("{");
                                sb6.append(optString2);
                                sb6.append("-");
                                sb6.append(optString);
                                sb6.append("}");
                                java.lang.String sb7 = sb6.toString();
                                arrayList.add(sb7);
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(optString2, -1);
                                linkedHashMap.put("t-" + i27 + "-name", optString);
                                linkedHashMap.put("t-" + i27 + "-tid", optString2);
                                linkedHashMap.put("t-" + i27 + "-renames", optString3);
                                if (!((java.util.HashSet) set).contains(sb7)) {
                                    hashSet.add(sb7);
                                }
                                i27++;
                                P = i17;
                                string2 = str;
                                string = str7;
                                jSONArray3 = jSONArray4;
                                V = j17;
                            }
                            long j18 = V;
                            java.lang.String str8 = string;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "==> leaked threads : %s", arrayList.toString().replace(",", ""));
                            if (!hashSet.isEmpty()) {
                                jx3.f.INSTANCE.d(19816, 0, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j18), str8, str, java.lang.Integer.valueOf(i17), arrayList.toString().replace(",", ""), bm5.f1.a(), java.lang.Integer.valueOf(android.os.Process.myPid()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, u(linkedHashMap));
                                set.addAll(hashSet);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "reported %s", hashSet);
                            }
                            i18 = i19 + 1;
                            jSONArray = jSONArray2;
                            r6Var2 = r6Var;
                            str2 = str5;
                            str3 = str6;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e, "report kv error", new java.lang.Object[0]);
                            r6Var.l();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.m82467xfb82e301(), sp3.d.f(r6Var.B()));
                        }
                    }
                    r6Var = r6Var2;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b || z65.c.a()) {
                        sp3.d.b(r6Var);
                    } else {
                        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r17.l();
                    throw th;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                r6Var = r6Var2;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = r6Var2;
                r6Var3.l();
                throw th;
            }
            r6Var.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.m82467xfb82e301(), sp3.d.f(r6Var.B()));
        }
    }

    public synchronized java.lang.String v() {
        java.lang.String str = f529925h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "memory dump begin");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = f529926i;
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d c4657x40d13e9d = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d.f134210h;
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = f529927m;
            c4657x40d13e9d.d(r6Var2.o());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dump path = %s", r6Var2.o());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f529925h, e17, "something wrong when dumping", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f529925h, "memory dump end, cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return f529927m.o();
    }
}

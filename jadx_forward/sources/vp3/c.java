package vp3;

/* loaded from: classes12.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d implements com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f520502r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f520503s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f520504t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f520505u;

    /* renamed from: g, reason: collision with root package name */
    public final vp3.a f520506g = new vp3.a(this);

    /* renamed from: h, reason: collision with root package name */
    public volatile long f520507h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f520508i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f520509m;

    /* renamed from: n, reason: collision with root package name */
    public long f520510n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f520511o;

    /* renamed from: p, reason: collision with root package name */
    public int f520512p;

    /* renamed from: q, reason: collision with root package name */
    public long f520513q;

    static {
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.p();
        java.lang.String str = f520502r + p17;
        f520502r = str;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/memory_hook";
        java.lang.String str3 = str2 + "/" + p17 + android.os.Process.myPid() + "_memory_hook.log";
        java.lang.String str4 = str2 + "/" + p17 + android.os.Process.myPid() + "_memory_hook.json";
        f520503s = new com.p314xaae8f345.mm.vfs.r6(str2);
        f520504t = new com.p314xaae8f345.mm.vfs.r6(str3);
        f520505u = new com.p314xaae8f345.mm.vfs.r6(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init dump file path = %s", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init json file path = %s", str4);
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public double A4() {
        com.p314xaae8f345.mm.p642xad8b531f.s sVar = ((km0.c) gm0.j1.p().a()).f390525f;
        java.lang.String str = f520502r;
        if (sVar != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(sVar.a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "disable memory hook by coolassist");
            return -1.0d;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (o45.wf.f424566k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enable memory hook for Alpha");
            return 1.0d;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enable memory hook for DEBUG");
            return 1.0d;
        }
        return 1.0d / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_diagnostic_memory_hook_expt_rate_denominator_v2, 20000L);
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public void Sg(double d17) {
        java.lang.String str = f520502r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dice action !");
        vp3.a aVar = this.f520506g;
        if (aVar.f234454a.o(aVar.f234462i, 0) > 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "skip process cmd, crashed for more than 3 times");
            return;
        }
        e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
        tp3.a.INSTANCE.d(j62.e.g().a("clicfg_diagnostic_memory_hook_expt_cmd", "<cmd><diagnostic><MemoryHook enable='1' source='expt' process='all' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$;.*libandroidfw\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>", false, true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, 0, 1);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 20 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? 21 : (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) ? 22 : -1, 1);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "onRegistered: %s", "MemoryHook");
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.y.f234487e.a("memory", this);
        com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c.f150239f.a(this);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(new vp3.d(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h() {
        return this.f520506g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public java.lang.String j() {
        return "MemoryHook";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook=");
        vp3.a aVar = this.f520506g;
        sb6.append(aVar.f234454a.u(aVar.f520492l, ""));
        sb6.append(",stack=");
        java.lang.String str = aVar.f520494n;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = aVar.f234454a;
        sb6.append(o4Var.i(str, false));
        sb6.append(",mmap=");
        sb6.append(o4Var.i(aVar.f520499s, false));
        sb6.append("\t");
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public java.lang.String key() {
        return "MemoryHook";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "onHookEnabled: source = %s", jVar.name());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, 2, 1);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1571, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 40 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? 41 : (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) ? 42 : -1, 1);
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        jx3.f.INSTANCE.b(arrayList, false);
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51528x6acacd80 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public xh.b q() {
        vp3.a aVar = this.f520506g;
        java.lang.String u17 = aVar.f234454a.u(aVar.f520492l, "");
        java.lang.String str = aVar.f520493m;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = aVar.f234454a;
        java.lang.String u18 = o4Var.u(str, "");
        boolean i17 = o4Var.i(aVar.f520494n, false);
        int o17 = o4Var.o(aVar.f520495o, 0);
        int o18 = o4Var.o(aVar.f520496p, 0);
        double f17 = aVar.f();
        boolean i18 = o4Var.i(aVar.f520498r, false);
        boolean i19 = o4Var.i(aVar.f520499s, false);
        int o19 = o4Var.o(aVar.f520500t, 5242880);
        java.lang.Object[] objArr = {u17, u18, java.lang.Boolean.valueOf(i17), java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(o18), java.lang.Double.valueOf(f17), java.lang.Boolean.valueOf(i18), java.lang.Boolean.valueOf(i19), java.lang.Integer.valueOf(o19)};
        java.lang.String str2 = f520502r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hook:%s, ignore:%s, enableStacktrace:%s, min:%d, max:%d, sampling:%f, extreme:%s, mmap:%s, stacklog:%s", objArr);
        if (android.text.TextUtils.isEmpty(u17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "ERROR(MemoryHook): hook regex is blank");
            return null;
        }
        java.lang.String[] split = u17.split(";");
        java.lang.String[] split2 = u18.split(";");
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4 c4655xed1e99e4 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4.f134199k;
        c4655xed1e99e4.getClass();
        for (java.lang.String str3 : split) {
            if (android.text.TextUtils.isEmpty(str3)) {
                oj.j.b("Matrix.MemoryHook", "thread regex is empty!!!", new java.lang.Object[0]);
            } else {
                ((java.util.HashSet) c4655xed1e99e4.f134200b).add(str3);
            }
        }
        for (java.lang.String str4 : split2) {
            if (!android.text.TextUtils.isEmpty(str4)) {
                ((java.util.HashSet) c4655xed1e99e4.f134201c).add(str4);
            }
        }
        c4655xed1e99e4.f134205g = i17;
        c4655xed1e99e4.f134202d = o17;
        c4655xed1e99e4.f134203e = o18;
        c4655xed1e99e4.f134204f = o19;
        c4655xed1e99e4.f134207i = i19;
        return c4655xed1e99e4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d
    public void s(boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = f520505u;
        if (z17) {
            if (android.os.Debug.getNativeHeapAllocatedSize() > 524288000) {
                u(null, r6Var.o());
            }
            v(false, 0);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = f520504t;
        u(r6Var2.o(), r6Var.o());
        v(false, 0);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int m40535xf2ceb016 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        java.lang.String str2 = f520502r;
        if (m40535xf2ceb016 > 1 && java.lang.System.currentTimeMillis() - this.f520508i <= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "skip logging for freq. but ilogs was reported");
        } else {
            sp3.d.d(str2, r6Var2);
            this.f520508i = java.lang.System.currentTimeMillis();
        }
    }

    public final void u(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = f520502r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "memory dump begin");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = f520503s;
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4.f134199k.d(str, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "dump path = %s, json path = %s", f520504t.o(), f520505u.o());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, "something wrong when dumping", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "memory dump end, cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void v(boolean z17, int i17) {
        java.lang.String str = f520502r;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(sp3.d.e(f520505u.o()));
            java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            java.lang.String str3 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "recent scene @ %s", str3);
            java.lang.String a17 = vp3.b.f520501a.a();
            x(jSONObject, "NativeHeap", z17, i17, str3, a17);
            x(jSONObject, "mmap", z17, i17, str3, a17);
            w(jSONObject, "SoNativeSize", z17, i17, str3);
            w(jSONObject, "SoMmapSize", z17, i17, str3);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void w(org.json.JSONObject jSONObject, java.lang.String str, boolean z17, int i17, java.lang.String str2) {
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "reportSoSizeJson: report nothing");
            }
            java.lang.String valueOf = java.lang.String.valueOf(android.os.Debug.getNativeHeapAllocatedSize());
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if ("SoNativeSize".equalsIgnoreCase(str)) {
                    arrayList.add(z17 ? "8" : "4");
                } else if ("SoMmapSize".equalsIgnoreCase(str)) {
                    arrayList.add(z17 ? "9" : "5");
                }
                arrayList.add(bm5.f1.a());
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                java.lang.String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                java.lang.String string = jSONObject2.getString("size");
                arrayList.add(string);
                long j17 = 0;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(string, 0L) < 1048576) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "so size %s < 1M", string);
                    return;
                }
                while (arrayList.size() < 26) {
                    arrayList.add("");
                }
                arrayList.add(valueOf);
                boolean mo40960xab2f7f06 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40960xab2f7f06();
                if (mo40960xab2f7f06) {
                    try {
                        j17 = java.lang.System.currentTimeMillis() - this.f520507h;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f520502r, th, "reportSoSizeJson", new java.lang.Object[0]);
                        return;
                    }
                }
                arrayList.add(mo40960xab2f7f06 ? "2" : "1");
                arrayList.add(java.lang.String.valueOf(j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "dumpAndReport: isBackground=%s, bgDuration=%s", java.lang.Boolean.valueOf(mo40960xab2f7f06), java.lang.Long.valueOf(j17));
                arrayList.add(java.lang.String.valueOf(android.os.Process.myPid()));
                arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
                arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                arrayList.add(java.lang.String.valueOf(i17));
                arrayList.add(str2);
                jx3.f.INSTANCE.l(21217, arrayList);
                java.util.Arrays.toString(arrayList.toArray());
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public final void x(org.json.JSONObject jSONObject, java.lang.String str, boolean z17, int i17, java.lang.String str2, java.lang.String str3) {
        org.json.JSONArray a17;
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "reportStacktraceJson: report nothing");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str4 = "1";
            if ("mmap".equalsIgnoreCase(str)) {
                arrayList.add(z17 ? "7" : "1");
            } else if ("NativeHeap".equalsIgnoreCase(str)) {
                arrayList.add(z17 ? "6" : "0");
            }
            arrayList.add(bm5.f1.a());
            this.f520509m = 0;
            this.f520510n = 0L;
            this.f520511o = null;
            this.f520512p = 0;
            this.f520513q = 0L;
            int i18 = 0;
            for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                java.lang.String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                java.lang.String string = jSONObject2.getString("size");
                arrayList.add(string);
                if (i19 == 0 && split[split.length - 1] != null && (split[split.length - 1].contains("libTP") || split[split.length - 1].contains("libvoip"))) {
                    i18 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.m100777x49d3c5ef().size();
                    ((ku5.t0) ku5.t0.f394148d).g(new vp3.RunnableC30658x2d8c9e());
                }
                if (i19 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(string, 0L) > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8 && split[split.length - 1] != null && split[split.length - 1].contains("libhwui")) {
                    pb0.g.b(new yz5.p() { // from class: vp3.c$$b
                        @Override // yz5.p
                        /* renamed from: invoke */
                        public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                            java.lang.String str5 = (java.lang.String) obj;
                            pb0.a aVar = (pb0.a) obj2;
                            vp3.c cVar = vp3.c.this;
                            cVar.f520509m += aVar.size();
                            cVar.f520510n += aVar.a();
                            if (cVar.f520511o == null) {
                                cVar.f520511o = str5;
                                cVar.f520512p = aVar.size();
                                cVar.f520513q = aVar.a();
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(aVar.a()), aVar, str5);
                            return null;
                        }
                    });
                }
                org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("top_stacks");
                for (int i27 = 0; i27 < jSONArray2.length(); i27++) {
                    org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i27);
                    arrayList.add(jSONObject3.getString("stack"));
                    arrayList.add(jSONObject3.getString("size"));
                }
            }
            while (arrayList.size() < 26) {
                arrayList.add("");
            }
            arrayList.add(java.lang.String.valueOf(android.os.Debug.getNativeHeapAllocatedSize()));
            boolean mo40960xab2f7f06 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40960xab2f7f06();
            long currentTimeMillis = mo40960xab2f7f06 ? java.lang.System.currentTimeMillis() - this.f520507h : 0L;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca c4671xf410f8ca = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495;
            if (c4671xf410f8ca.mo40965x320351f8()) {
                str4 = "3";
            } else if (mo40960xab2f7f06) {
                str4 = "2";
            }
            arrayList.add(str4);
            arrayList.add(java.lang.String.valueOf(currentTimeMillis));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f520502r, "dumpAndReport: isBackground=%s, isDeepBg=%s, bgDuration=%s", java.lang.Boolean.valueOf(mo40960xab2f7f06), java.lang.Boolean.valueOf(c4671xf410f8ca.mo40965x320351f8()), java.lang.Long.valueOf(currentTimeMillis));
            arrayList.add(java.lang.String.valueOf(android.os.Process.myPid()));
            arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
            arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            arrayList.add(java.lang.String.valueOf(i17));
            arrayList.add(str2);
            arrayList.add(str3);
            try {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (i18 > 0) {
                    jSONObject4.put("TPCount", i18);
                }
                long j17 = this.f520510n;
                if (j17 > 0) {
                    jSONObject4.put("bmSize", j17);
                    jSONObject4.put("bmCount", this.f520509m);
                    jSONObject4.put("t1Size", this.f520513q);
                    jSONObject4.put("t1Count", this.f520512p);
                    jSONObject4.put("t1Stack", this.f520511o);
                }
                int Ri = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ri();
                if (Ri > 0) {
                    jSONObject4.put("Flutter", Ri);
                    jSONObject4.put("FlutterBiz", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
                }
                int yj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj();
                if (yj6 > 0) {
                    jSONObject4.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, yj6);
                    jSONObject4.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca, ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.x.a()) != null) {
                    jSONObject4.put("appbrand", a17);
                }
                arrayList.add(jSONObject4.toString().replace(",", ";"));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f520502r, th6, "ignore", new java.lang.Object[0]);
            }
            jx3.f.INSTANCE.l(21217, arrayList);
            java.util.Arrays.toString(arrayList.toArray());
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f520502r, th7, "reportStacktraceJson", new java.lang.Object[0]);
        }
    }

    public void y(int i17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = f520504t;
        u(r6Var.o(), f520505u.o());
        v(true, i17);
        sp3.d.d(f520502r, r6Var);
    }
}

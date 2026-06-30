package com.tencent.mm.feature.lite;

@j95.b(dependencies = {c42.i.class})
/* loaded from: classes15.dex */
public class i extends i95.w implements q80.g0 {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f67166r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f67167s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f67168t = {"wxalite5a62b2376a074f2284dd9b4224043936", "wxalitea95723728764364c6f996b4bdab3af52", "wxalitefb18d43d7467f7b81eeb8ab3ac3718ca", "wxalite842f9e8076010458697522e7db33761b", "wxaliteffd0d77bb439c46980fd2877978576d6", "wxaliteb984a6d0a709290f7f2cd6cab0db8fbe"};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f67169d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67170e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f67171f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f67172g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f67173h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f67174i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f67175m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.feature.lite.q1 f67176n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f67177o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f67178p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f67179q;

    public i() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.feature.lite.LiteAppFeatureService$4
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent2 = liteAppLifeCycleEvent;
                if (com.tencent.mm.sdk.platformtools.t8.K0(liteAppLifeCycleEvent2.f54468g.f7819c)) {
                    return false;
                }
                am.ri riVar = liteAppLifeCycleEvent2.f54468g;
                if (riVar.f7817a != 0) {
                    return false;
                }
                com.tencent.mm.feature.lite.i iVar = com.tencent.mm.feature.lite.i.this;
                ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f67174i).computeIfAbsent(riVar.f7819c, new com.tencent.mm.feature.lite.LiteAppFeatureService$4$$a())).add(riVar.f7820d);
                ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f67175m).computeIfAbsent(riVar.f7819c, new com.tencent.mm.feature.lite.LiteAppFeatureService$4$$b())).add(riVar.f7821e);
                return false;
            }
        };
        this.f67170e = false;
        this.f67171f = new java.util.concurrent.ConcurrentHashMap();
        this.f67172g = new java.util.concurrent.ConcurrentHashMap();
        this.f67173h = new java.util.concurrent.ConcurrentHashMap();
        this.f67174i = new java.util.concurrent.ConcurrentHashMap();
        this.f67175m = new java.util.concurrent.ConcurrentHashMap();
        this.f67176n = null;
        this.f67177o = new java.util.concurrent.ConcurrentHashMap();
        this.f67178p = new java.util.concurrent.ConcurrentHashMap();
        this.f67179q = new java.util.HashMap();
    }

    public static void Ai(final com.tencent.mm.feature.lite.i iVar, q80.e0 e0Var, int i17, long j17, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i18;
        wu5.c z17;
        if (iVar.f67169d == null) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.lite.LiteAppFeatureService$6
                {
                    this.__eventId = -1426801938;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent) {
                    am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
                    if (!tiVar.f8013a) {
                        return false;
                    }
                    com.tencent.mm.feature.lite.i.Bi(com.tencent.mm.feature.lite.i.this, tiVar.f8014b);
                    return false;
                }
            };
            iVar.f67169d = iListener;
            iListener.alive();
        }
        boolean z18 = e0Var.f360680f;
        android.app.Activity activity2 = z18 ? null : activity;
        java.lang.String str4 = e0Var.f360675a;
        java.lang.String str5 = e0Var.f360676b;
        if (z18) {
            i18 = i17;
            z17 = null;
        } else {
            ku5.u0 u0Var = ku5.t0.f312615d;
            i18 = i17;
            com.tencent.mm.feature.lite.e1 e1Var = new com.tencent.mm.feature.lite.e1(iVar, str4, i18, str5);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            z17 = t0Var.z(e1Var, 900000L, false);
        }
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar.f67178p).get(str4);
        if (map == null) {
            map = new java.util.concurrent.ConcurrentHashMap();
            ((java.util.concurrent.ConcurrentHashMap) iVar.f67178p).put(str4, map);
        }
        com.tencent.mm.feature.lite.p1 p1Var = (com.tencent.mm.feature.lite.p1) map.get(str5);
        if (p1Var == null) {
            p1Var = new com.tencent.mm.feature.lite.p1(iVar, null);
            p1Var.f67245b = null;
            p1Var.f67244a = z17;
            p1Var.f67246c = null;
            boolean z19 = e0Var.f360679e;
            p1Var.f67248e = z19;
            p1Var.f67249f = e0Var.f360680f;
            p1Var.f67250g = z19 ? i18 : 0;
            p1Var.f67251h = str;
            p1Var.f67252i = str2;
            p1Var.f67253j = str3;
            map.put(str5, p1Var);
        } else {
            wu5.c cVar = p1Var.f67244a;
            if (cVar != null) {
                cVar.cancel(false);
            }
            p1Var.f67244a = z17;
            java.lang.ref.WeakReference weakReference = p1Var.f67245b;
            android.app.Activity activity3 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (activity3 != null && android.os.Build.VERSION.SDK_INT >= 29) {
                activity3.unregisterActivityLifecycleCallbacks(p1Var.f67246c);
                activity3.unregisterComponentCallbacks(p1Var.f67247d);
            }
            p1Var.f67245b = null;
            p1Var.f67246c = null;
        }
        com.tencent.mm.feature.lite.p1 p1Var2 = p1Var;
        if (activity2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "activity is null or has preload, appId:%s", str4);
            return;
        }
        p1Var2.f67245b = new java.lang.ref.WeakReference(activity2);
        com.tencent.mm.feature.lite.g1 g1Var = new com.tencent.mm.feature.lite.g1(iVar, str4, i17, j17, str5);
        p1Var2.f67246c = g1Var;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            activity2.registerActivityLifecycleCallbacks(g1Var);
        }
        com.tencent.mm.feature.lite.h1 h1Var = new com.tencent.mm.feature.lite.h1(iVar, str4, str5);
        p1Var2.f67247d = h1Var;
        activity2.registerComponentCallbacks(h1Var);
    }

    public static void Bi(final com.tencent.mm.feature.lite.i iVar, final java.lang.String str) {
        iVar.getClass();
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.b1(iVar, str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "onPackageUpdate %s", str);
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar.f67178p).get(str);
        if (map == null) {
            return;
        }
        map.keySet().toArray();
        final java.util.HashMap hashMap = new java.util.HashMap();
        map.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.feature.lite.i$$f
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.String str2 = (java.lang.String) obj;
                com.tencent.mm.feature.lite.p1 p1Var = (com.tencent.mm.feature.lite.p1) obj2;
                java.lang.ref.WeakReference weakReference = p1Var.f67245b;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    activity.unregisterActivityLifecycleCallbacks(p1Var.f67246c);
                    activity.unregisterComponentCallbacks(p1Var.f67247d);
                }
                wu5.c cVar = p1Var.f67244a;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(p1Var.f67250g);
                java.lang.String str3 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp appId:%s, path:%s, engineId:%d", str3, str2, valueOf);
                com.tencent.mm.plugin.lite.LiteAppCenter.releasePreloadView(str3, str2, p1Var.f67251h, p1Var.f67252i, p1Var.f67250g != 0 || kx5.n.h().b());
                kx5.n.h().f(p1Var.f67250g);
                if (p1Var.f67249f) {
                    hashMap.put(str2, p1Var);
                }
            }
        });
        ((java.util.concurrent.ConcurrentHashMap) iVar.f67178p).remove(str);
        hashMap.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.feature.lite.i$$g
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.tencent.mm.feature.lite.p1 p1Var = (com.tencent.mm.feature.lite.p1) obj2;
                com.tencent.mm.feature.lite.i iVar2 = com.tencent.mm.feature.lite.i.this;
                iVar2.getClass();
                q80.e0 e0Var = new q80.e0();
                e0Var.f360675a = str;
                e0Var.f360676b = (java.lang.String) obj;
                e0Var.f360679e = p1Var.f67248e;
                e0Var.f360680f = p1Var.f67249f;
                iVar2.Rj(com.tencent.mm.sdk.platformtools.x2.f193071a, e0Var);
            }
        });
    }

    public static boolean Gj() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (c01.z1.j() & 8388608) == 8388608;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.feature.lite.l1.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    public static java.lang.String Hj(byte[] bArr) {
        byte b17 = bArr[0];
        return (b17 == -1 && bArr[1] == -40) ? "image" : (b17 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? "image" : (b17 == 71 && bArr[1] == 73 && bArr[2] == 70) ? "image" : (b17 == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 32 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) ? "video" : (b17 == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) ? "video" : "image";
    }

    public static void ck(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, java.lang.String str, boolean z17, java.util.HashMap hashMap) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter;
        if (wxaLiteAppStartReport == null || (liteAppReporter = wxaLiteAppStartReport.I) == null) {
            return;
        }
        liteAppReporter.logPerf(str, z17, hashMap);
    }

    public static void wi(com.tencent.mm.feature.lite.i iVar, q80.f0 f0Var, boolean z17) {
        iVar.getClass();
        if (f0Var == null) {
            return;
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.y(iVar, f0Var, z17));
        } else if (z17) {
            f0Var.success();
        } else {
            f0Var.fail();
        }
    }

    public java.lang.String Aj(java.lang.String str) {
        com.tencent.mm.vfs.u6 u6Var;
        java.lang.String c17 = s46.c.c(str);
        if (!c17.isEmpty()) {
            java.lang.String b17 = q75.g.b(c17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            return b17.toLowerCase().contains("video") ? "video" : "image";
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        byte[] bArr = new byte[8];
        try {
            u6Var = new com.tencent.mm.vfs.u6(r6Var);
            try {
            } finally {
            }
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "getFileType not found file " + e17);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "getFileType error " + e18);
        }
        if (u6Var.read(bArr) <= 0) {
            u6Var.close();
            return "image";
        }
        java.lang.String Hj = Hj(bArr);
        u6Var.close();
        return Hj;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo Bj(java.lang.String str) {
        return com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo Cj(java.lang.String str) {
        return com.tencent.mm.plugin.lite.logic.g1.s().z(str);
    }

    public void Di(q80.a0 a0Var) {
        java.util.List list = com.tencent.mm.plugin.lite.w.f144511n;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.a0(a0Var));
    }

    public java.lang.String Dj() {
        return com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.class.getName();
    }

    public java.lang.String Ej(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.lite.w.initLib();
        return com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersion(str, str2, str3);
    }

    public java.util.Set Fj() {
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        return new java.util.concurrent.CopyOnWriteArraySet(s17.f143952f);
    }

    public boolean Ij() {
        java.util.List list = com.tencent.mm.plugin.lite.w.f144511n;
        return com.tencent.mm.plugin.lite.LiteAppCenter.isInitialized && com.tencent.mm.plugin.lite.w.f144512o[0];
    }

    public boolean Jj(java.lang.String str) {
        if (!com.tencent.mm.plugin.lite.w.initLib()) {
            return false;
        }
        boolean F = com.tencent.mm.plugin.lite.logic.g1.s().F(str, true);
        if (!F) {
            com.tencent.mm.plugin.lite.logic.g1.s().N(str, true, false, 21, 0L);
        }
        return F;
    }

    public boolean Kj(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).isEmpty()) {
            return false;
        }
        return str.startsWith("weixin://resourceid/") || str.startsWith("liteappLocalId://");
    }

    public boolean Lj(java.lang.String str) {
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j("clicfg_liteapp_share_android", "1", false, true).equalsIgnoreCase("1");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "isSharedLiteAppOpen appId%s enable:%b", str, java.lang.Boolean.valueOf(equalsIgnoreCase));
        return equalsIgnoreCase && s17.F(str, false);
    }

    public void Mj(java.lang.String str, java.lang.String str2, q80.f0 f0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putString("extInfo", str2);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.feature.lite.n1.class, new com.tencent.mm.feature.lite.r0(this, f0Var));
    }

    public void Ni(java.lang.String str) {
        ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.lite.logic.g1.s().f143952f).add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031c  */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.tencent.mm.feature.lite.q1] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nj(android.content.Context r27, android.os.Bundle r28, com.tencent.liteapp.report.WxaLiteAppStartReport r29, com.tencent.liteapp.storage.WxaLiteAppInfo r30, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData r31, q80.f0 r32) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.lite.i.Nj(android.content.Context, android.os.Bundle, com.tencent.liteapp.report.WxaLiteAppStartReport, com.tencent.liteapp.storage.WxaLiteAppInfo, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData, q80.f0):void");
    }

    public final void Oj(android.os.Bundle bundle, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.s sVar) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.feature.lite.n0(this, wxaLiteAppBaseView, wxaLiteAppInfo, wxaLiteAppStartReport, bundle, sVar, openExtraData));
    }

    public final boolean Pj(android.os.Bundle bundle, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        java.lang.String[] strArr = new java.lang.String[0];
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("checkMode");
        if (java.util.Arrays.asList("wxalitea75d7a00345004a062d5fbae679963fa@pay", "wxalite71edb1ca80c07142d0552fd50655a7b0@pay").contains(string) && string2 != "disable") {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo syncCheck enable." + bundle);
            bundle.putString("checkMode", "strict");
            bundle.putBoolean("syncCheck", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo syncCheck enable." + bundle);
        }
        if (java.util.Arrays.asList(strArr).contains(string)) {
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            if (!com.tencent.mm.plugin.lite.p.f144155g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo no-check enable." + bundle);
                bundle.putBoolean("disableCheck", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo no-check enable." + bundle);
            }
        }
        return true;
    }

    public void Qj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            com.tencent.mm.plugin.lite.LiteAppCenter.fontScale = j65.c.b(context);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || str3.equals("preloadLiteApp")) {
            q80.e0 e0Var = new q80.e0();
            e0Var.f360675a = str;
            e0Var.f360676b = str2;
            Rj(context, e0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s path:%s task:%s", str, str2, str3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", str3);
        intent.putExtra("appId", str);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    public void Ri(long j17, long j18, java.lang.String str, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.feature.lite.z0(this, j17, str, j18, map, gVar));
    }

    public void Rj(android.content.Context context, q80.e0 e0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(e0Var.f360675a)) {
            return;
        }
        java.lang.String str = e0Var.f360676b;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (com.tencent.mm.plugin.lite.LiteAppCenter.hasKeepAlive(e0Var.f360675a + "_" + str2 + "_", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp hit keepAlive, ignore! appId:%s page:%s", e0Var.f360675a, str2);
            return;
        }
        if (!e0Var.f360678d) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f67174i).containsKey(e0Var.f360675a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "already open this liteapp, ignore preload appId:%s", e0Var.f360675a);
                return;
            }
        }
        java.lang.String str3 = e0Var.f360677c;
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) this.f67178p).get(e0Var.f360675a);
        com.tencent.mm.feature.lite.p1 p1Var = map != null ? (com.tencent.mm.feature.lite.p1) map.get(str2) : null;
        if (p1Var != null) {
            if (str3 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! (null sessionId) appId:%s page:%s", e0Var.f360675a, str2);
                return;
            }
            java.lang.String str4 = p1Var.f67253j;
            if (str4 == null || str4.equals(str3)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! (same sessionId) appId:%s page:%s", e0Var.f360675a, str2);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp: sessionId changed, releasing old one. appId:%s", e0Var.f360675a);
                Yj(e0Var.f360675a, str2);
            }
        }
        if (str3 == null) {
            str3 = com.tencent.mm.plugin.lite.LiteAppCenter.genLiteAppSessionId();
        }
        java.lang.String str5 = str3;
        ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) this.f67175m).computeIfAbsent(e0Var.f360675a, new com.tencent.mm.feature.lite.i$$h())).add(str5);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s page:%s exclusive:%b keepAlive:%b", e0Var.f360675a, str2, java.lang.Boolean.valueOf(e0Var.f360679e), java.lang.Boolean.valueOf(e0Var.f360680f));
        if (!com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            com.tencent.mm.plugin.lite.LiteAppCenter.fontScale = j65.c.b(context);
        }
        com.tencent.mm.feature.lite.d1 d1Var = new com.tencent.mm.feature.lite.d1(this, e0Var, str2, str5, context instanceof android.app.Activity ? (android.app.Activity) context : null);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            d1Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(d1Var);
        }
    }

    public void Sj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "prepareLiteApp");
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        if (com.tencent.mm.plugin.lite.p.f144150b.get()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.feature.lite.t0(this));
    }

    public final org.json.JSONObject Tj(java.lang.String str) {
        final org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str != null && !str.isEmpty()) {
            try {
                return new org.json.JSONObject(str);
            } catch (java.lang.Exception unused) {
                java.util.Arrays.stream(str.split("&")).filter(new com.tencent.mm.feature.lite.i$$d()).forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.feature.lite.i$$e
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        org.json.JSONObject jSONObject2 = jSONObject;
                        java.lang.String[] split = ((java.lang.String) obj).split("=", 2);
                        try {
                            try {
                                jSONObject2.put(java.net.URLDecoder.decode(split[0], com.tencent.mapsdk.internal.rv.f51270c), java.net.URLDecoder.decode(split[1], com.tencent.mapsdk.internal.rv.f51270c));
                            } catch (java.lang.Exception unused2) {
                                jSONObject2.put(split[0], split[1]);
                            }
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                });
            }
        }
        return jSONObject;
    }

    public void Ui(android.content.Context context, android.net.Uri uri) {
        byte[] bArr = com.tencent.mm.plugin.lite.logic.m0.f144011a;
        if (uri == null) {
            com.tencent.mars.xlog.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: uri is null");
            return;
        }
        try {
            java.lang.String queryParameter = uri.getQueryParameter("url");
            if (queryParameter == null) {
                com.tencent.mars.xlog.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: missing url query parameter");
            } else {
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                if (com.tencent.mm.sdk.platformtools.t8.K0(decode)) {
                    com.tencent.mars.xlog.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: missing url parameter");
                } else {
                    com.tencent.mm.plugin.lite.logic.m0.a(decode, true, 105, new com.tencent.mm.plugin.lite.logic.i0(decode, context));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppDeepLinkProcessor", e17, "URL decode failed", new java.lang.Object[0]);
        }
    }

    public void Uj(long j17, long j18, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.lite.w.initLib();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(j17, j18, str, jSONObject);
    }

    public final boolean Vi(android.content.Context context) {
        if (!com.tencent.mm.sdk.platformtools.a0.c()) {
            com.tencent.mm.plugin.lite.w.initLib();
            return true;
        }
        boolean initLib = com.tencent.mm.plugin.lite.w.initLib();
        if (initLib) {
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("kInitLibCheckPref", 0).edit();
            edit.putLong("kInitLibCheckKvKey", 0L);
            edit.apply();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
        }
        return initLib;
    }

    public void Vj(long j17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.lite.w.initLib();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(j17, str, jSONObject);
    }

    public void Wj(java.lang.String str, java.lang.Class cls) {
        if (!android.text.TextUtils.isEmpty(str) && cls != null && com.tencent.liteapp.ui.WxaLiteAppUI.class.isAssignableFrom(cls)) {
            ((java.util.concurrent.ConcurrentHashMap) this.f67171f).put(str, cls);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "registerLiteAppActivity error. " + cls + " is not subclass of WxaLiteAppLiteUI");
    }

    public final void Xj() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f67178p).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map = (java.util.Map) entry.getValue();
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
            if (y17 != null) {
                java.util.Iterator it6 = map.entrySet().iterator();
                while (it6.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    com.tencent.mm.feature.lite.p1 p1Var = (com.tencent.mm.feature.lite.p1) entry2.getValue();
                    if (!p1Var.f67248e) {
                        wu5.c cVar = p1Var.f67244a;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        java.lang.ref.WeakReference weakReference = p1Var.f67245b;
                        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                        if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
                            activity.unregisterActivityLifecycleCallbacks(p1Var.f67246c);
                            activity.unregisterComponentCallbacks(p1Var.f67247d);
                        }
                        com.tencent.mm.plugin.lite.LiteAppCenter.releasePreloadView(str, str2, y17.path, y17.signatureKey, false);
                        it6.remove();
                    }
                }
                if (map.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void Yj(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.feature.lite.p1 ij6 = ij(str, str2);
        if (ij6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp not found appId:%s path:%s", str, str2);
            return;
        }
        com.tencent.mm.plugin.lite.w.initLib();
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp appId:%s, path:%s, engineId:%d", str, str2, java.lang.Integer.valueOf(ij6.f67250g));
        com.tencent.mm.plugin.lite.LiteAppCenter.releasePreloadView(str, str2, ij6.f67251h, ij6.f67252i, ij6.f67250g != 0 || kx5.n.h().b());
        kx5.n.h().f(ij6.f67250g);
    }

    public final void Zi(android.content.Context context, android.os.Bundle bundle, java.lang.String str, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, boolean z17, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, long j17, boolean z18, q80.f0 f0Var) {
        wxaLiteAppStartReport.f46004n = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.widget.dialog.u3 Q = z18 ? db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, new com.tencent.mm.feature.lite.l0(this)) : null;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("timeout", java.lang.String.valueOf(j17));
        hashMap.put("syncCheck", java.lang.String.valueOf(z17));
        ck(wxaLiteAppStartReport, "Android.Feature.checkUpdate.sync", true, hashMap);
        fj(str, z17, 1, j17, wxaLiteAppStartReport.I, new com.tencent.mm.feature.lite.m0(this, Q, wxaLiteAppStartReport, context, bundle, openExtraData, f0Var, str));
    }

    public void Zj(java.lang.String str) {
        java.util.Map map = this.f67177o;
        if (((java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) map).get(str)) == null) {
            com.tencent.mm.plugin.lite.w.initLib();
            com.tencent.mm.plugin.lite.LiteAppCenter.releaseStore(str);
        } else if (java.lang.Integer.valueOf(r1.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        }
    }

    public final void aj(android.os.Bundle bundle, java.lang.String str, java.lang.Boolean bool, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, long j17, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.s sVar, com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE);
        }
        fj(str, bool.booleanValue(), 1, j17, wxaLiteAppStartReport.I, new com.tencent.mm.feature.lite.x0(this, wxaLiteAppStartReport, bundle, wxaLiteAppBaseView, openExtraData, sVar));
    }

    public void ak(q80.a0 a0Var) {
        java.util.List list = com.tencent.mm.plugin.lite.w.f144511n;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.b0(a0Var));
    }

    public final void bj(java.lang.String str, java.lang.String str2, long j17, boolean z17, kh0.e eVar) {
        long j18 = j17 / 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp timeout: " + j18);
        kh0.g gVar = (kh0.g) i95.n0.c(kh0.g.class);
        boolean z18 = z17 ^ true;
        if (eVar == null) {
            eVar = new com.tencent.mm.feature.lite.e0(this);
        }
        jh0.v vVar = (jh0.v) gVar;
        vVar.getClass();
        vz4.d0.b(str, str2, j18, z18, new jh0.u(vVar, eVar));
    }

    public void bk(android.view.View view) {
        if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
            com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) view;
            if (wxaLiteAppBaseView.I) {
                wxaLiteAppBaseView.I = false;
                wxaLiteAppBaseView.onResume();
            }
        }
    }

    public void cj(java.lang.String str, com.tencent.mm.plugin.lite.api.h hVar) {
        fj(str, false, 2, 60000L, null, hVar);
    }

    public void dk(long j17, java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.lite.w.f144516s;
        synchronized (hashMap) {
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Long.valueOf(j17));
            if (hashMap2 != null) {
                if (obj == null) {
                    hashMap2.remove(str);
                } else {
                    hashMap2.put(str, obj);
                }
            } else if (obj != null) {
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put(str, obj);
                hashMap.put(java.lang.Long.valueOf(j17), hashMap3);
            }
        }
    }

    public void ek(java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "setLiteRunStatus :%b", bool);
        this.f67170e = bool.booleanValue();
    }

    public final void fj(java.lang.String str, boolean z17, int i17, long j17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.h hVar) {
        com.tencent.mm.plugin.lite.logic.g1.s().l(str, z17, i17, j17, liteAppReporter, hVar);
    }

    public void fk(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "setTestServiceEnable: %b", java.lang.Boolean.valueOf(z17));
        f67166r = z17;
        com.tencent.mm.plugin.lite.LiteAppCenter.setTestServiceEnable(z17);
    }

    public final void gk(android.content.Context context, q80.f0 f0Var) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("kInitLibCheckPref", 0);
        long j17 = sharedPreferences.getLong("kInitLibCheckKvKey", 0L);
        java.lang.String string = context.getString(com.tencent.mm.R.string.mez);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490931mf1);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490930mf0);
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.mey);
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.mex);
        if (j17 != 0 && java.lang.System.currentTimeMillis() - j17 >= 300000) {
            db5.e1.A(context, string, "", string2, string3, new com.tencent.mm.feature.lite.r(this, f0Var, context), new com.tencent.mm.feature.lite.t(this, f0Var));
            return;
        }
        if (j17 == 0) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("kInitLibCheckKvKey", java.lang.System.currentTimeMillis());
            edit.apply();
        }
        db5.e1.y(context, string4, "", string5, new com.tencent.mm.feature.lite.v(this, f0Var));
    }

    public void hj(java.lang.String str, boolean z17, boolean z18, com.tencent.mm.plugin.lite.api.h hVar) {
        fj(str, z17, z18 ? 2 : 1, z18 ? 60000L : 20000L, null, hVar);
    }

    public void hk(android.content.Context context, android.os.Bundle bundle, boolean z17, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, q80.f0 f0Var) {
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData;
        java.lang.String string = bundle.getString("pkgId");
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        com.tencent.mm.plugin.lite.s sVar = (jSONObject == null && jSONArray == null) ? null : new com.tencent.mm.plugin.lite.s();
        if (sVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (jSONObject != null) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.opt(next));
                }
                sVar.d(hashMap);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startGameLiteApp pkgId is null, syncCheckUpdate: %s", java.lang.Boolean.valueOf(z17));
            jk(context, bundle, true, z17, sVar, f0Var);
            return;
        }
        if (sVar != null) {
            com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData2 = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData2.store = sVar;
            openExtraData = openExtraData2;
        } else {
            openExtraData = null;
        }
        ik(context, bundle, z17, openExtraData, null, f0Var);
        if (jSONArray == null || jSONArray.length() == 0 || sVar == null) {
            return;
        }
        com.tencent.mm.feature.lite.x xVar = new com.tencent.mm.feature.lite.x(this, jSONArray, jSONArray2, sVar);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = jSONArray.optString(i17);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("url", optString);
                jSONObject2.put("state", com.tencent.mm.sdk.platformtools.t8.K0(optString) ? "fail" : "downloading");
                jSONArray2.put(jSONObject2);
            } catch (org.json.JSONException unused) {
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(optString, xVar);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("preloadImages", jSONArray2);
        sVar.d(hashMap2);
    }

    public final com.tencent.mm.feature.lite.p1 ij(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.feature.lite.p1 p1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "clearPreloadInfo appId:%s path:%s", str, str2);
        java.util.Map map = this.f67178p;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (map2 == null || (p1Var = (com.tencent.mm.feature.lite.p1) map2.get(str2)) == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = p1Var.f67245b;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(p1Var.f67246c);
            activity.unregisterComponentCallbacks(p1Var.f67247d);
        }
        wu5.c cVar = p1Var.f67244a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        map2.remove(str2);
        if (map2.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        }
        return p1Var;
    }

    public final void ik(android.content.Context context, android.os.Bundle bundle, boolean z17, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, q80.f0 f0Var) {
        boolean z18;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2;
        com.tencent.mm.plugin.lite.p.f144149a.b(4, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        java.lang.String string = bundle.getString("pkgId");
        java.lang.String string2 = bundle.getString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            if (f0Var != null) {
                f0Var.fail();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startGameLiteApp: %s", string2);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        boolean z19 = n17 ? z17 : false;
        if (c01.e2.a0() && Gj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "intercept!");
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            com.tencent.mm.feature.lite.z zVar = new com.tencent.mm.feature.lite.z(this, context, bundle, z19, openExtraData, wxaLiteAppStartReport, f0Var);
            ((vd0.j2) q1Var).getClass();
            v24.o0.h(context, 8388608L, null, zVar, 3);
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        if (wxaLiteAppStartReport == null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport3 = new com.tencent.liteapp.report.WxaLiteAppStartReport();
            wxaLiteAppStartReport3.f45997d = string2;
            wxaLiteAppStartReport3.f46002i = java.lang.System.currentTimeMillis();
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(string2);
            wxaLiteAppStartReport3.I = liteAppReporter;
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.START, new com.tencent.mm.feature.lite.a0(this));
            if (((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.lite.logic.g1.s().f143951e).containsKey(string2)) {
                wxaLiteAppStartReport3.I.logStart(com.tencent.liteapp.gen.StartAction.START_BEFORE_LAST_CHECK_FINISHED);
            }
            wxaLiteAppStartReport2 = wxaLiteAppStartReport3;
        } else {
            wxaLiteAppStartReport2 = wxaLiteAppStartReport;
        }
        wxaLiteAppStartReport2.I.logStart(com.tencent.liteapp.gen.StartAction.EXTERNAL_PACKAGE_LOADING_START);
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = (n17 && z17) ? null : com.tencent.mm.plugin.lite.logic.g1.s().y(string2, null);
        long j17 = bundle.getLong("timeout", 20000L);
        if (y17 != null) {
            if (f0Var != null) {
                f0Var.success();
            }
            wxaLiteAppStartReport2.f46003m = false;
            wxaLiteAppStartReport2.I.logStart(com.tencent.liteapp.gen.StartAction.EXTERNAL_PACKAGE_LOADING_SUCCESS);
            wxaLiteAppStartReport2.I.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, 4L);
            Nj(context, bundle, wxaLiteAppStartReport2, y17, openExtraData, f0Var);
            if (n17) {
                bj(string, string2, j17, true, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + string2);
            return;
        }
        if (!n17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "openGameLiteApp fail:" + string2);
            if (f0Var != null) {
                f0Var.fail();
                return;
            }
            return;
        }
        boolean z27 = bundle.getBoolean("withDownloadLoading", true);
        if (y17 != null && y17.isDebug() && (java.lang.System.currentTimeMillis() / 1000) - y17.updateTime < 86400) {
            z27 = false;
        }
        com.tencent.mm.ui.widget.dialog.u3[] u3VarArr = {null};
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.c0(this, u3VarArr, z27, context));
        wxaLiteAppStartReport2.f46003m = true;
        wxaLiteAppStartReport2.f46004n = java.lang.System.currentTimeMillis();
        bj(string, string2, j17, false, new com.tencent.mm.feature.lite.d0(this, u3VarArr, f0Var, wxaLiteAppStartReport2, string2, context, bundle, openExtraData));
    }

    public void jk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, com.tencent.mm.plugin.lite.s sVar, q80.f0 f0Var) {
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData;
        if (sVar != null) {
            openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData.store = sVar;
        } else {
            openExtraData = null;
        }
        nk(context, bundle, z17, z18, openExtraData, f0Var);
    }

    public void kk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, q80.f0 f0Var) {
        nk(context, bundle, z17, z18, null, f0Var);
    }

    public void lk(android.content.Context context, q80.d0 d0Var, q80.f0 f0Var) {
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
        nk(context, mj(d0Var, openExtraData), d0Var.f360666r, d0Var.f360667s, openExtraData, f0Var);
    }

    public final android.os.Bundle mj(q80.d0 d0Var, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.f360649a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f360650b)) {
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, d0Var.f360650b);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, null);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f360651c)) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                openExtraData.query = d0Var.f360651c;
            } else {
                bundle.putString("query", d0Var.f360651c);
                long j17 = d0Var.f360663o;
                if (j17 > 0) {
                    bundle.putLong(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_DATA_UUID, j17);
                }
            }
        }
        com.tencent.mm.plugin.lite.s sVar = d0Var.f360672x;
        if (sVar == null && d0Var.f360673y != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = d0Var.f360673y.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, d0Var.f360673y.opt(next));
            }
            com.tencent.mm.plugin.lite.s sVar2 = new com.tencent.mm.plugin.lite.s();
            sVar2.d(hashMap);
            sVar = sVar2;
        }
        openExtraData.store = sVar;
        long j18 = d0Var.f360671w;
        if (j18 > 0) {
            bundle.putLong("timeout", j18);
        }
        if (d0Var.f360652d.booleanValue()) {
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, d0Var.f360652d.booleanValue());
        }
        bundle.putBoolean("withDownloadLoading", true);
        boolean z17 = d0Var.f360653e;
        if (z17) {
            bundle.putBoolean("forbidRightGesture", z17);
        }
        android.os.Bundle bundle2 = d0Var.f360655g;
        if (bundle2 != null) {
            bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
        }
        if (d0Var.f360657i == 1) {
            bundle.putBoolean("isHalfScreen", true);
        }
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = d0Var.f360661m;
        if (liteAppHalfScreenConfig != null) {
            bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig);
        } else {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig2 = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
            liteAppHalfScreenConfig2.f143411e = d0Var.f360658j;
            liteAppHalfScreenConfig2.f143414h = d0Var.f360659k;
            liteAppHalfScreenConfig2.f143415i = d0Var.f360660l;
            liteAppHalfScreenConfig2.f143416m = null;
            bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f360654f)) {
            bundle.putString("minVersion", d0Var.f360654f);
        }
        int i17 = d0Var.f360662n;
        if (i17 > 0) {
            bundle.putInt("requestCode", i17);
        }
        int i18 = d0Var.f360664p;
        if (i18 > 0) {
            bundle.putInt("nextAnimIn", i18);
        }
        int i19 = d0Var.f360665q;
        if (i19 > 0) {
            bundle.putInt("currentAnimOut", i19);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f360668t)) {
            bundle.putString("sourceType", d0Var.f360668t);
        }
        java.lang.String[] strArr = d0Var.f360669u;
        if (strArr != null) {
            bundle.putStringArray("enableActions", strArr);
        }
        java.lang.String[] strArr2 = d0Var.f360670v;
        if (strArr2 != null) {
            bundle.putStringArray("enableViews", strArr2);
        }
        if (d0Var.f360674z != null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                try {
                    bundle.putInt("referrerScene", d0Var.f360674z.scene.ordinal());
                    openExtraData.referrerInfo = d0Var.f360674z.toJsonString();
                    com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = d0Var.f360674z;
                    if (liteAppReferrerInfo != null && (jSONObject = liteAppReferrerInfo.innerData) != null) {
                        if (jSONObject.has("appUuid")) {
                            bundle.putLong("referrerFromUuid", liteAppReferrerInfo.innerData.getLong("appUuid"));
                        }
                        if (liteAppReferrerInfo.innerData.has("pageId")) {
                            bundle.putLong("referrerFromPageId", liteAppReferrerInfo.innerData.getLong("pageId"));
                        }
                    }
                } catch (java.lang.Exception unused) {
                    openExtraData.referrerInfo = null;
                }
            } else {
                bundle.putParcelable("liteappReferrerInfo", d0Var.f360674z);
                long j19 = d0Var.f360663o;
                if (j19 > 0) {
                    bundle.putLong(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_DATA_UUID, j19);
                }
            }
        }
        int i27 = d0Var.A;
        if (i27 > 0) {
            bundle.putInt("keepAliveSeconds", i27);
        }
        boolean z18 = d0Var.B;
        if (z18) {
            bundle.putBoolean("ignoreAlive", z18);
        }
        int i28 = d0Var.C;
        if (i28 > 0) {
            bundle.putInt("keepAliveGroup", i28);
        }
        if (d0Var.f360656h.booleanValue()) {
            bundle.putBoolean("isolateTask", d0Var.f360656h.booleanValue());
        }
        java.lang.String str = d0Var.E;
        if (str != null) {
            bundle.putString("snapshotInitData", str);
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mk(android.content.Context r32, android.os.Bundle r33, boolean r34, boolean r35, com.tencent.liteapp.report.WxaLiteAppStartReport r36, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData r37, q80.f0 r38) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.lite.i.mk(android.content.Context, android.os.Bundle, boolean, boolean, com.tencent.liteapp.report.WxaLiteAppStartReport, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData, q80.f0):void");
    }

    public java.util.List nj() {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler k0Var = j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true) ? new ha3.k0() : new x03.q1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mm.plugin.lite.ui.b2());
        arrayList.add(new zc.b0());
        arrayList.add(new kx5.p());
        arrayList.add(k0Var);
        arrayList.add(new fa3.r());
        arrayList.add(new ea3.b0());
        arrayList.add(new la3.l());
        arrayList.add(new ca3.t());
        arrayList.add(new g03.b());
        arrayList.add(new g03.a());
        arrayList.add(new k03.h());
        arrayList.add(new g03.c());
        arrayList.add(new si0.f());
        arrayList.add(new ma3.e());
        return arrayList;
    }

    public final void nk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.f0 f0Var) {
        int i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.lite.o(this, context, bundle, z17, z18, openExtraData, f0Var));
            return;
        }
        com.tencent.mm.plugin.lite.p.f144149a.b(4, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        if (!bundle.containsKey("appId")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "appId is required");
            f0Var.fail();
            return;
        }
        java.lang.String string = bundle.getString("appId");
        if (!Vi(context)) {
            gk(context, f0Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
            return;
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(string);
        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.START, new com.tencent.mm.feature.lite.p(this));
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("checkUpdate", java.lang.String.valueOf(z17));
        hashMap.put("syncCheck", java.lang.String.valueOf(z18));
        boolean z19 = true;
        liteAppReporter.logPerf("Android.Startup.ToOnShowPageTimeStamp", true, hashMap);
        if (((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.lite.logic.g1.s().f143951e).containsKey(string)) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.START_BEFORE_LAST_CHECK_FINISHED);
        }
        if (bundle.containsKey("keepAliveSeconds")) {
            i17 = bundle.getInt("keepAliveSeconds");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "keepAliveSeconds %d", java.lang.Integer.valueOf(i17));
        } else {
            i17 = 0;
        }
        boolean z27 = bundle.containsKey("ignoreAlive") ? bundle.getBoolean("ignoreAlive") : false;
        if (i17 > 0) {
            com.tencent.liteapp.gen.StartAction startAction = com.tencent.liteapp.gen.StartAction.START_NEED_KEEP_ALIVE;
            liteAppReporter.logStart(startAction);
            if (z27) {
                liteAppReporter.logStart(startAction);
            }
        }
        if (z27) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.START_IGNORE_KEEP_ALIVE);
        }
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
        wxaLiteAppStartReport.I = liteAppReporter;
        wxaLiteAppStartReport.f45997d = string;
        wxaLiteAppStartReport.f46002i = java.lang.System.currentTimeMillis();
        java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, ya.b.INDEX);
        java.lang.String string3 = bundle.getString("query", "");
        wxaLiteAppStartReport.f45999f = string2;
        wxaLiteAppStartReport.f45998e = string3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp appId: " + string + ", page: " + string2);
        java.lang.String str = string + "_" + string2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap2 = f67167s;
        long longValue = hashMap2.containsKey(str) ? ((java.lang.Long) hashMap2.get(str)).longValue() : 0L;
        if (currentTimeMillis <= longValue || currentTimeMillis - longValue > 500) {
            hashMap2.put(str, java.lang.Long.valueOf(currentTimeMillis));
            z19 = false;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "reduplicate request key: %s, lasttime:%d, now:%d", str, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1293L, 105L, 1L);
            g0Var.kvStat(21018, string + "," + longValue + "," + currentTimeMillis);
        }
        if (z19) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.REPEATED_CLICK);
        } else {
            mk(context, bundle, z17, z18, wxaLiteAppStartReport, openExtraData, f0Var);
        }
    }

    public android.view.View oj(android.content.Context context, boolean z17, boolean z18, q80.u uVar) {
        com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = new com.tencent.mm.plugin.lite.ui.WxaLiteAppView(context);
        wxaLiteAppView.f46059z = z17;
        wxaLiteAppView.A = z18;
        wxaLiteAppView.f144377y0 = uVar;
        return wxaLiteAppView;
    }

    public void ok(android.content.Context context, q80.d0 d0Var, q80.f0 f0Var) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp In other MainProcess:%s", bm5.f1.a());
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData(d0Var.f360649a, d0Var.f360654f, d0Var.D.toString(), java.lang.Boolean.valueOf(d0Var.f360666r), java.lang.Boolean.valueOf(d0Var.f360667s)), com.tencent.mm.feature.lite.k1.class, new com.tencent.mm.feature.lite.n(this, f0Var, d0Var, context));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp In MainProcess");
        org.json.JSONObject jSONObject = d0Var.D;
        if (jSONObject != null && jSONObject.length() > 0) {
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.d(new com.tencent.mm.feature.lite.m(this, d0Var));
            d0Var.f360672x = sVar;
        }
        lk(context, d0Var, f0Var);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppFeatureService OnCreate.");
        java.util.List list = com.tencent.mm.plugin.lite.w.f144511n;
        if (!com.tencent.mm.plugin.lite.LiteAppCenter.isInitialized) {
            com.tencent.mm.plugin.lite.LiteAppCenter.setWxaLiteAppCallback(new com.tencent.mm.plugin.lite.w());
            com.tencent.mm.app.q5.b().a(new com.tencent.mm.plugin.lite.q0());
            com.tencent.mm.plugin.lite.LiteAppCenter.isInitialized = true;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.feature.lite.w wVar = new com.tencent.mm.feature.lite.w(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(wVar, 180000L, false);
        }
        com.tencent.mm.app.i4.a(new com.tencent.mm.feature.lite.k0(this));
        com.tencent.mm.plugin.lite.p.f144149a.e(new com.tencent.liteapp.report.WxaLiteAppStartReport());
        if (com.tencent.mm.sdk.platformtools.x2.n() && !com.tencent.mm.sdk.platformtools.a0.c()) {
            qa3.o oVar = qa3.o.f361051a;
            if (!com.tencent.mm.sdk.platformtools.s9.f192974b && !com.tencent.mm.sdk.platformtools.s9.f192975c && !z65.c.a()) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mars.xlog.Log.i("LiteAppTestService", "not test env");
            } else if (qa3.o.f361054d) {
                com.tencent.mars.xlog.Log.i("LiteAppTestService", "already_init");
            } else {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true);
                qa3.o.f361055e = fj6;
                if (fj6) {
                    com.tencent.mars.xlog.Log.i("LiteAppTestService", "use new websocket for test and load lib");
                    java.lang.String libraryName = org.chromium.net.impl.CronetLibraryLoader.libraryName();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(libraryName);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/test/LiteAppTestService", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/mm/plugin/lite/test/LiteAppTestService", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    wp5.e.a(context2, new qa3.k());
                }
                qa3.o.f361054d = true;
                com.tencent.mm.plugin.lite.w.initLib();
                com.tencent.mm.plugin.lite.test.LiteAppTestBroadcastReceiver liteAppTestBroadcastReceiver = new com.tencent.mm.plugin.lite.test.LiteAppTestBroadcastReceiver();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.liteapp.test.INIT_CONNECTION");
                if (fp.h.a(33)) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(liteAppTestBroadcastReceiver, intentFilter);
                } else {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(liteAppTestBroadcastReceiver, intentFilter, 2);
                }
                com.tencent.mars.xlog.Log.i("LiteAppTestService", "garry test init receiver");
                nz5.b.a(false, false, null, null, 0, qa3.l.f361049d, 31, null);
                boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a).a(".com.tencent.mm.debug.liteapp.testservice"), false);
                com.tencent.mars.xlog.Log.i("LiteAppTestService", "assist serviceEnable " + m17);
                if (m17) {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
            oa3.c cVar = new oa3.c();
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).getClass();
            sj4.z0.f408909b.put("17", cVar);
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.feature.lite.w0(this), 60000L);
        }
        com.tencent.mm.app.MMCrashReportContents.V.f(new com.tencent.mm.feature.lite.i$$a());
        com.tencent.mm.app.MMBugReportContents.f53230k.f53726p.f(new com.tencent.mm.feature.lite.i$$b());
        if (f67166r) {
            fk(true);
        }
    }

    public void pj(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "createStore, appId:%s aliveSeconds:%s pkgPath:%s", str, java.lang.Integer.valueOf(i17), str2);
        sj(4, null);
        com.tencent.mm.plugin.lite.p.f144149a.d();
        com.tencent.mm.plugin.lite.LiteAppCenter.createStore(str, str2, "", i17);
    }

    public void pk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, com.tencent.mm.plugin.lite.s sVar, q80.s sVar2) {
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData;
        if (sVar != null) {
            openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData.store = sVar;
        } else {
            openExtraData = null;
        }
        rk(view, bundle, z17, z18, openExtraData, sVar2);
    }

    public void qj(java.lang.String str, int i17, boolean z17, long j17, q80.f0 f0Var) {
        sj(4, null);
        com.tencent.mm.plugin.lite.p.f144149a.d();
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        if (y17 != null) {
            com.tencent.mm.plugin.lite.LiteAppCenter.createStore(str, y17.path, y17.signatureKey, i17);
            if (f0Var != null) {
                f0Var.success();
                return;
            }
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f67177o;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
        if (num == null) {
            concurrentHashMap.put(str, 1);
        } else {
            num.intValue();
        }
        if (j17 <= 0) {
            j17 = 20000;
        }
        fj(str, false, 1, j17, null, new com.tencent.mm.feature.lite.s0(this, str, i17, f0Var));
    }

    public void qk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, q80.s sVar) {
        rk(view, bundle, z17, z18, null, sVar);
    }

    public int rj(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mm.plugin.lite.w.initLib();
        return com.tencent.mm.plugin.lite.LiteAppCenter.dispatchStore(str, str2, obj);
    }

    public final void rk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.s sVar) {
        boolean z19;
        boolean z27;
        int i17;
        boolean z28;
        long j17;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        long j18;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter;
        com.tencent.mm.plugin.lite.p.f144149a.b(4, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        if (com.tencent.mm.plugin.lite.p.f144155g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "startLiteAppViewImpl debug syncCheck enable.");
            z19 = true;
            z27 = true;
        } else {
            z19 = z17;
            z27 = z18;
        }
        if (!(view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView)) {
            if (sVar != null) {
                sVar.fail();
                return;
            }
            return;
        }
        if (!bundle.containsKey("appId")) {
            if (sVar != null) {
                sVar.fail();
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("appId");
        if (!Vi(view.getContext())) {
            gk(view.getContext(), null);
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
            return;
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(string);
        liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START, new com.tencent.mm.feature.lite.j(this));
        if (((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.lite.logic.g1.s().f143951e).containsKey(string)) {
            liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START_BEFORE_LAST_CHECK_FINISHED);
        }
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) view;
        if (bundle.containsKey("keepAliveSeconds")) {
            i17 = bundle.getInt("keepAliveSeconds");
            wxaLiteAppBaseView.C = i17;
        } else {
            i17 = 0;
        }
        if (bundle.containsKey("ignoreAlive")) {
            z28 = bundle.getBoolean("ignoreAlive");
            wxaLiteAppBaseView.D = z28;
        } else {
            z28 = false;
        }
        if (bundle.containsKey("liteappReferrerInfo")) {
            wxaLiteAppBaseView.E = (com.tencent.liteapp.storage.LiteAppReferrerInfo) bundle.getParcelable("liteappReferrerInfo");
        } else {
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.APP_VIEW;
            wxaLiteAppBaseView.E = liteAppReferrerInfo;
        }
        if (i17 > 0) {
            liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START_NEED_KEEP_ALIVE);
            if (z28) {
                liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START_KEEP_ALIVE_IGNORE_LAST);
            }
        }
        if (z28) {
            liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START_IGNORE_KEEP_ALIVE);
        }
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
        wxaLiteAppStartReport.I = liteAppReporter2;
        wxaLiteAppBaseView.f46040d = liteAppReporter2;
        if (openExtraData != null) {
            java.lang.String str = openExtraData.query;
            if (str != null) {
                wxaLiteAppBaseView.f46053t = str;
            }
            wxaLiteAppBaseView.setStore(openExtraData.store);
        } else {
            wxaLiteAppBaseView.setStore(null);
        }
        if (bundle.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT)) {
            wxaLiteAppBaseView.f46058y = bundle.getBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT);
        }
        wxaLiteAppStartReport.f45997d = string;
        wxaLiteAppStartReport.f46002i = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1293L, 90L, 1L);
        long j19 = bundle.getLong("timeout", 0L);
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = z27 ? null : com.tencent.mm.plugin.lite.logic.g1.s().y(string, liteAppReporter2);
        if (z27 && (liteAppReporter = wxaLiteAppStartReport.I) != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.FORCE_SYNC_CHECK);
        }
        if (!com.tencent.mm.plugin.lite.logic.g1.s().I(string)) {
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = y17;
            if (wxaLiteAppInfo2 != null) {
                wxaLiteAppStartReport.f46003m = false;
                if (z19) {
                    liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE);
                    boolean z29 = z27;
                    j17 = 1;
                    fj(string, z29, 2, j19 > 0 ? j19 : 60000L, liteAppReporter2, new com.tencent.mm.feature.lite.k(this, liteAppReporter2));
                } else {
                    j17 = 1;
                }
                liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, j17);
                Oj(bundle, wxaLiteAppStartReport, wxaLiteAppInfo2, wxaLiteAppBaseView, openExtraData, sVar);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "get info return null, appid:" + string);
            g0Var.C(1293L, 92L, 1L);
            g0Var.kvStat(20979, string);
            wxaLiteAppStartReport.f46003m = true;
            wxaLiteAppStartReport.f46004n = java.lang.System.currentTimeMillis();
            liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE);
            fj(string, z27, 1, j19 > 0 ? j19 : 20000L, liteAppReporter2, new com.tencent.mm.feature.lite.l(this, wxaLiteAppStartReport, liteAppReporter2, liteAppReporter2, bundle, wxaLiteAppBaseView, openExtraData, sVar));
            return;
        }
        java.lang.String string2 = bundle.getString("appId");
        if (!com.tencent.mm.plugin.lite.logic.g1.s().I(string2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "illegal pay liteapp appid: %s, start fail", string2);
            if (sVar != null) {
                sVar.fail();
                return;
            }
            return;
        }
        java.lang.String string3 = bundle.getString("minVersion");
        if (string3 != null && y17 != null && com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(string3, Ej(y17.path, y17.appId, y17.signatureKey))) {
            z19 = true;
            z27 = true;
        }
        if (!z19 && z27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "illegal check update params, checkUpdate: %b, syncCheckUpdate: %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
            if (sVar != null) {
                sVar.fail();
                return;
            }
            return;
        }
        if (z27) {
            wxaLiteAppStartReport.f46003m = true;
            wxaLiteAppStartReport.f46004n = java.lang.System.currentTimeMillis();
            g0Var.C(1293L, 91L, 1L);
            aj(bundle, string2, java.lang.Boolean.valueOf(z27), wxaLiteAppStartReport, j19 > 0 ? j19 : 20000L, openExtraData, sVar, wxaLiteAppBaseView);
            return;
        }
        if (y17 == null) {
            wxaLiteAppStartReport.f46003m = true;
            wxaLiteAppStartReport.f46004n = java.lang.System.currentTimeMillis();
            g0Var.C(1293L, 92L, 1L);
            g0Var.kvStat(20979, string2);
            aj(bundle, string2, java.lang.Boolean.valueOf(z27), wxaLiteAppStartReport, j19 > 0 ? j19 : 20000L, openExtraData, sVar, wxaLiteAppBaseView);
            return;
        }
        wxaLiteAppStartReport.f46003m = false;
        if (z19) {
            wxaLiteAppStartReport.f46004n = java.lang.System.currentTimeMillis();
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter3 = wxaLiteAppStartReport.I;
            if (liteAppReporter3 != null) {
                liteAppReporter3.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE);
            }
            j18 = 1;
            wxaLiteAppInfo = y17;
            fj(string2, z27, 2, j19 > 0 ? j19 : 60000L, wxaLiteAppStartReport.I, new com.tencent.mm.feature.lite.v0(this, string2, wxaLiteAppStartReport));
        } else {
            wxaLiteAppInfo = y17;
            j18 = 1;
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter4 = wxaLiteAppStartReport.I;
        if (liteAppReporter4 != null) {
            liteAppReporter4.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, j18);
        }
        Oj(bundle, wxaLiteAppStartReport, wxaLiteAppInfo, wxaLiteAppBaseView, openExtraData, sVar);
    }

    public com.tencent.liteapp.report.WxaLiteAppStartReport sj(int i17, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (wxaLiteAppStartReport == null) {
            wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
        }
        return com.tencent.mm.plugin.lite.p.f144149a.b(i17, wxaLiteAppStartReport);
    }

    public void sk(com.tencent.mm.plugin.lite.api.p pVar, android.content.Intent intent, int i17) {
        if (i17 == 0) {
            intent.addFlags(268435456);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
            intent.putExtra("proxyui_action_code_key", 0);
            intent.putExtra("callback_id", m93.j.a(pVar));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService", "startProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService", "startProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public java.util.List tj(java.lang.String str) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback> entry : com.tencent.mm.plugin.lite.LiteAppCenter.mUICallback.entrySet()) {
            com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback value = entry.getValue();
            if (value.callback != null && (str2 = value.appId) != null && str2.equals(str)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public boolean tk(java.lang.String str) {
        com.tencent.mm.plugin.lite.w.initLib();
        return com.tencent.mm.plugin.lite.LiteAppCenter.storeIsAlive(str);
    }

    public java.lang.String uj(java.lang.String str) {
        java.lang.String authUrl = com.tencent.mm.plugin.lite.LiteAppCenter.getAuthUrl("", str, "", false);
        if (authUrl == null || authUrl.isEmpty()) {
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
            if (y17 != null) {
                authUrl = com.tencent.mm.plugin.lite.LiteAppCenter.getAuthUrl(y17.path, str, y17.signatureKey, false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "WxaLiteAppInfo is null");
            }
        }
        if (authUrl == null || authUrl.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "GetAuthUrl is null or empty");
        }
        return authUrl;
    }

    public int uk(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.w.initLib();
        return com.tencent.mm.plugin.lite.LiteAppCenter.subscribeStore(str, (java.lang.String[]) list.toArray(new java.lang.String[0]));
    }

    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo vj() {
        com.tencent.mm.plugin.lite.logic.g1.s().getClass();
        return com.tencent.mm.plugin.lite.logic.g1.s().t(null);
    }

    public int vk(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.w.initLib();
        return com.tencent.mm.plugin.lite.LiteAppCenter.unSubscribeStore(str, (java.lang.String[]) list.toArray(new java.lang.String[0]));
    }

    public java.lang.Object wj(long j17, java.lang.String str) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.lite.w.f144516s;
        synchronized (hashMap) {
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Long.valueOf(j17));
            if (hashMap2 == null) {
                return null;
            }
            return hashMap2.get(str);
        }
    }

    public java.util.List xj() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = kx5.n.h().f313316f;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.util.Map e17 = ((mx5.b) hashMap.get((java.lang.String) it.next())).getE();
            if (e17 != null && e17.containsKey("appId")) {
                arrayList.add(e17.get("appId").toString());
            }
        }
        return arrayList;
    }

    public int yj() {
        return kx5.n.h().f313316f.size();
    }

    public java.lang.String zj(java.lang.String str, long j17, java.lang.String str2) {
        java.lang.String str3;
        if (str2.startsWith("liteappLocalId://")) {
            str3 = com.tencent.mm.plugin.lite.LiteAppCenter.getPathByLiteAppLocalId(j17, str, str2);
        } else if (str2.startsWith("weixin://resourceid/")) {
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            str3 = com.tencent.mm.plugin.webview.model.o5.d(str2);
        } else {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return str3;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, "LiteAppFilePathNull," + j17 + "," + str);
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "getFilePathByBothLocalId null");
        return "";
    }
}

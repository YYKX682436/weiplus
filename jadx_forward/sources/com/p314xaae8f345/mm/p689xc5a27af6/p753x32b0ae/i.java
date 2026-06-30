package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

@j95.b(m140513x1e06fd29 = {c42.i.class})
/* loaded from: classes15.dex */
public class i extends i95.w implements q80.g0 {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f148699r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f148700s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f148701t = {"wxalite5a62b2376a074f2284dd9b4224043936", "wxalitea95723728764364c6f996b4bdab3af52", "wxalitefb18d43d7467f7b81eeb8ab3ac3718ca", "wxalite842f9e8076010458697522e7db33761b", "wxaliteffd0d77bb439c46980fd2877978576d6", "wxaliteb984a6d0a709290f7f2cd6cab0db8fbe"};

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f148702d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148703e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f148704f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f148705g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f148706h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f148707i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f148708m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.q1 f148709n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f148710o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f148711p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f148712q;

    public i() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.feature.lite.LiteAppFeatureService$4
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c32 = c5675xda3892c3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5675xda3892c32.f136001g.f89352c)) {
                    return false;
                }
                am.ri riVar = c5675xda3892c32.f136001g;
                if (riVar.f89350a != 0) {
                    return false;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.this;
                ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f148707i).computeIfAbsent(riVar.f89352c, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10618xa883805f())).add(riVar.f89353d);
                ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f148708m).computeIfAbsent(riVar.f89352c, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10619xa8838060())).add(riVar.f89354e);
                return false;
            }
        };
        this.f148703e = false;
        this.f148704f = new java.util.concurrent.ConcurrentHashMap();
        this.f148705g = new java.util.concurrent.ConcurrentHashMap();
        this.f148706h = new java.util.concurrent.ConcurrentHashMap();
        this.f148707i = new java.util.concurrent.ConcurrentHashMap();
        this.f148708m = new java.util.concurrent.ConcurrentHashMap();
        this.f148709n = null;
        this.f148710o = new java.util.concurrent.ConcurrentHashMap();
        this.f148711p = new java.util.concurrent.ConcurrentHashMap();
        this.f148712q = new java.util.HashMap();
    }

    public static void Ai(final com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, q80.e0 e0Var, int i17, long j17, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i18;
        wu5.c z17;
        if (iVar.f148702d == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe>(a0Var) { // from class: com.tencent.mm.feature.lite.LiteAppFeatureService$6
                {
                    this.f39173x3fe91575 = -1426801938;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe) {
                    am.ti tiVar = c5677x6d1cb2fe.f136003g;
                    if (!tiVar.f89546a) {
                        return false;
                    }
                    com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.Bi(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.this, tiVar.f89547b);
                    return false;
                }
            };
            iVar.f148702d = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        boolean z18 = e0Var.f442213f;
        android.app.Activity activity2 = z18 ? null : activity;
        java.lang.String str4 = e0Var.f442208a;
        java.lang.String str5 = e0Var.f442209b;
        if (z18) {
            i18 = i17;
            z17 = null;
        } else {
            ku5.u0 u0Var = ku5.t0.f394148d;
            i18 = i17;
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.e1 e1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.e1(iVar, str4, i18, str5);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            z17 = t0Var.z(e1Var, 900000L, false);
        }
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar.f148711p).get(str4);
        if (map == null) {
            map = new java.util.concurrent.ConcurrentHashMap();
            ((java.util.concurrent.ConcurrentHashMap) iVar.f148711p).put(str4, map);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) map.get(str5);
        if (p1Var == null) {
            p1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1(iVar, null);
            p1Var.f148778b = null;
            p1Var.f148777a = z17;
            p1Var.f148779c = null;
            boolean z19 = e0Var.f442212e;
            p1Var.f148781e = z19;
            p1Var.f148782f = e0Var.f442213f;
            p1Var.f148783g = z19 ? i18 : 0;
            p1Var.f148784h = str;
            p1Var.f148785i = str2;
            p1Var.f148786j = str3;
            map.put(str5, p1Var);
        } else {
            wu5.c cVar = p1Var.f148777a;
            if (cVar != null) {
                cVar.cancel(false);
            }
            p1Var.f148777a = z17;
            java.lang.ref.WeakReference weakReference = p1Var.f148778b;
            android.app.Activity activity3 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (activity3 != null && android.os.Build.VERSION.SDK_INT >= 29) {
                activity3.unregisterActivityLifecycleCallbacks(p1Var.f148779c);
                activity3.unregisterComponentCallbacks(p1Var.f148780d);
            }
            p1Var.f148778b = null;
            p1Var.f148779c = null;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var2 = p1Var;
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "activity is null or has preload, appId:%s", str4);
            return;
        }
        p1Var2.f148778b = new java.lang.ref.WeakReference(activity2);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1 g1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1(iVar, str4, i17, j17, str5);
        p1Var2.f148779c = g1Var;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            activity2.registerActivityLifecycleCallbacks(g1Var);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.h1 h1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.h1(iVar, str4, str5);
        p1Var2.f148780d = h1Var;
        activity2.registerComponentCallbacks(h1Var);
    }

    public static void Bi(final com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, final java.lang.String str) {
        iVar.getClass();
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.b1(iVar, str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "onPackageUpdate %s", str);
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar.f148711p).get(str);
        if (map == null) {
            return;
        }
        map.keySet().toArray();
        final java.util.HashMap hashMap = new java.util.HashMap();
        map.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.feature.lite.i$$f
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.String str2 = (java.lang.String) obj;
                com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) obj2;
                java.lang.ref.WeakReference weakReference = p1Var.f148778b;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    activity.unregisterActivityLifecycleCallbacks(p1Var.f148779c);
                    activity.unregisterComponentCallbacks(p1Var.f148780d);
                }
                wu5.c cVar = p1Var.f148777a;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(p1Var.f148783g);
                java.lang.String str3 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp appId:%s, path:%s, engineId:%d", str3, str2, valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65447xf93ff5c7(str3, str2, p1Var.f148784h, p1Var.f148785i, p1Var.f148783g != 0 || kx5.n.h().b());
                kx5.n.h().f(p1Var.f148783g);
                if (p1Var.f148782f) {
                    hashMap.put(str2, p1Var);
                }
            }
        });
        ((java.util.concurrent.ConcurrentHashMap) iVar.f148711p).remove(str);
        hashMap.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.feature.lite.i$$g
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) obj2;
                com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar2 = com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.this;
                iVar2.getClass();
                q80.e0 e0Var = new q80.e0();
                e0Var.f442208a = str;
                e0Var.f442209b = (java.lang.String) obj;
                e0Var.f442212e = p1Var.f148781e;
                e0Var.f442213f = p1Var.f148782f;
                iVar2.Rj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, e0Var);
            }
        });
    }

    public static boolean Gj() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return (c01.z1.j() & 8388608) == 8388608;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.l1.class);
        if (c10750x9556b48c == null) {
            return false;
        }
        return c10750x9556b48c.f149933d;
    }

    public static java.lang.String Hj(byte[] bArr) {
        byte b17 = bArr[0];
        return (b17 == -1 && bArr[1] == -40) ? "image" : (b17 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? "image" : (b17 == 71 && bArr[1] == 73 && bArr[2] == 70) ? "image" : (b17 == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 32 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) ? "video" : (b17 == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) ? "video" : "image";
    }

    public static void ck(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, java.lang.String str, boolean z17, java.util.HashMap hashMap) {
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874;
        if (c3707xe60c5943 == null || (abstractC3700xe41a2874 = c3707xe60c5943.I) == null) {
            return;
        }
        abstractC3700xe41a2874.mo28879x145c484d(str, z17, hashMap);
    }

    public static void wi(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, q80.f0 f0Var, boolean z17) {
        iVar.getClass();
        if (f0Var == null) {
            return;
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.y(iVar, f0Var, z17));
        } else if (z17) {
            f0Var.mo556x90b54003();
        } else {
            f0Var.mo555x2fd71e();
        }
    }

    public java.lang.String Aj(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.u6 u6Var;
        java.lang.String c17 = s46.c.c(str);
        if (!c17.isEmpty()) {
            java.lang.String b17 = q75.g.b(c17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (b17 == null) {
                b17 = "";
            }
            return b17.toLowerCase().contains("video") ? "video" : "image";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        byte[] bArr = new byte[8];
        try {
            u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
            try {
            } finally {
            }
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "getFileType not found file " + e17);
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "getFileType error " + e18);
        }
        if (u6Var.read(bArr) <= 0) {
            u6Var.close();
            return "image";
        }
        java.lang.String Hj = Hj(bArr);
        u6Var.close();
        return Hj;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Cj(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().z(str);
    }

    public void Di(q80.a0 a0Var) {
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.a0(a0Var));
    }

    public java.lang.String Dj() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.class.getName();
    }

    public java.lang.String Ej(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65338x15e79bbb(str, str2, str3);
    }

    public java.util.Set Fj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s();
        s17.getClass();
        return new java.util.concurrent.CopyOnWriteArraySet(s17.f225485f);
    }

    public boolean Ij() {
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37148xf582434a && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226045o[0];
    }

    public boolean Jj(java.lang.String str) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55()) {
            return false;
        }
        boolean F = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().F(str, true);
        if (!F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().N(str, true, false, 21, 0L);
        }
        return F;
    }

    public boolean Kj(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).isEmpty()) {
            return false;
        }
        return str.startsWith("weixin://resourceid/") || str.startsWith("liteappLocalId://");
    }

    public boolean Lj(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s();
        s17.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j("clicfg_liteapp_share_android", "1", false, true).equalsIgnoreCase("1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "isSharedLiteAppOpen appId%s enable:%b", str, java.lang.Boolean.valueOf(equalsIgnoreCase));
        return equalsIgnoreCase && s17.F(str, false);
    }

    public void Mj(java.lang.String str, java.lang.String str2, q80.f0 f0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putString("extInfo", str2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.n1.class, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.r0(this, f0Var));
    }

    public void Ni(java.lang.String str) {
        ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225485f).add(str);
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
    public final void Nj(android.content.Context r27, android.os.Bundle r28, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 r29, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 r30, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData r31, q80.f0 r32) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.Nj(android.content.Context, android.os.Bundle, com.tencent.liteapp.report.WxaLiteAppStartReport, com.tencent.liteapp.storage.WxaLiteAppInfo, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData, q80.f0):void");
    }

    public final void Oj(android.os.Bundle bundle, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.s sVar) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.n0(this, c3717xac6c2329, c3712x3ed8a441, c3707xe60c5943, bundle, sVar, openExtraData));
    }

    public final boolean Pj(android.os.Bundle bundle, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        java.lang.String[] strArr = new java.lang.String[0];
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("checkMode");
        if (java.util.Arrays.asList("wxalitea75d7a00345004a062d5fbae679963fa@pay", "wxalite71edb1ca80c07142d0552fd50655a7b0@pay").contains(string) && string2 != "disable") {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo syncCheck enable." + bundle);
            bundle.putString("checkMode", "strict");
            bundle.putBoolean("syncCheck", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo syncCheck enable." + bundle);
        }
        if (java.util.Arrays.asList(strArr).contains(string)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225688g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo no-check enable." + bundle);
                bundle.putBoolean("disableCheck", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preCheckPayLiteAppInfo no-check enable." + bundle);
            }
        }
        return true;
    }

    public void Qj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37145xa386663b = j65.c.b(context);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || str3.equals("preloadLiteApp")) {
            q80.e0 e0Var = new q80.e0();
            e0Var.f442208a = str;
            e0Var.f442209b = str2;
            Rj(context, e0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s path:%s task:%s", str, str2, str3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.C16188x97149d60.class);
        intent.addFlags(268435456);
        intent.putExtra("task", str3);
        intent.putExtra("appId", str);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public void Ri(long j17, long j18, java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.z0(this, j17, str, j18, map, gVar));
    }

    public void Rj(android.content.Context context, q80.e0 e0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.f442208a)) {
            return;
        }
        java.lang.String str = e0Var.f442209b;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65370x556ec2ce(e0Var.f442208a + "_" + str2 + "_", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp hit keepAlive, ignore! appId:%s page:%s", e0Var.f442208a, str2);
            return;
        }
        if (!e0Var.f442211d) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f148707i).containsKey(e0Var.f442208a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "already open this liteapp, ignore preload appId:%s", e0Var.f442208a);
                return;
            }
        }
        java.lang.String str3 = e0Var.f442210c;
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) this.f148711p).get(e0Var.f442208a);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var = map != null ? (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) map.get(str2) : null;
        if (p1Var != null) {
            if (str3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! (null sessionId) appId:%s page:%s", e0Var.f442208a, str2);
                return;
            }
            java.lang.String str4 = p1Var.f148786j;
            if (str4 == null || str4.equals(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! (same sessionId) appId:%s page:%s", e0Var.f442208a, str2);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp: sessionId changed, releasing old one. appId:%s", e0Var.f442208a);
                Yj(e0Var.f442208a, str2);
            }
        }
        if (str3 == null) {
            str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65290xce8d5c6e();
        }
        java.lang.String str5 = str3;
        ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) this.f148708m).computeIfAbsent(e0Var.f442208a, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10630x3046df())).add(str5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s page:%s exclusive:%b keepAlive:%b", e0Var.f442208a, str2, java.lang.Boolean.valueOf(e0Var.f442212e), java.lang.Boolean.valueOf(e0Var.f442213f));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37145xa386663b = j65.c.b(context);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d1 d1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d1(this, e0Var, str2, str5, context instanceof android.app.Activity ? (android.app.Activity) context : null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            d1Var.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(d1Var);
        }
    }

    public void Sj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "prepareLiteApp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b.get()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.t0(this));
    }

    public final org.json.JSONObject Tj(java.lang.String str) {
        final org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str != null && !str.isEmpty()) {
            try {
                return new org.json.JSONObject(str);
            } catch (java.lang.Exception unused) {
                java.util.Arrays.stream(str.split("&")).filter(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10626x3046db()).forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.feature.lite.i$$e
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        org.json.JSONObject jSONObject2 = jSONObject;
                        java.lang.String[] split = ((java.lang.String) obj).split("=", 2);
                        try {
                            try {
                                jSONObject2.put(java.net.URLDecoder.decode(split[0], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.net.URLDecoder.decode(split[1], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
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
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.m0.f225544a;
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: uri is null");
            return;
        }
        try {
            java.lang.String queryParameter = uri.getQueryParameter("url");
            if (queryParameter == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: missing url query parameter");
            } else {
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppDeepLinkProcessor", "processDeepLink: missing url parameter");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.m0.a(decode, true, 105, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.i0(decode, context));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppDeepLinkProcessor", e17, "URL decode failed", new java.lang.Object[0]);
        }
    }

    public void Uj(long j17, long j18, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(j17, j18, str, jSONObject);
    }

    public final boolean Vi(android.content.Context context) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            return true;
        }
        boolean m65927x7420eb55 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        if (m65927x7420eb55) {
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("kInitLibCheckPref", 0).edit();
            edit.putLong("kInitLibCheckKvKey", 0L);
            edit.apply();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
        }
        return m65927x7420eb55;
    }

    public void Vj(long j17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(j17, str, jSONObject);
    }

    public void Wj(java.lang.String str, java.lang.Class cls) {
        if (!android.text.TextUtils.isEmpty(str) && cls != null && com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.class.isAssignableFrom(cls)) {
            ((java.util.concurrent.ConcurrentHashMap) this.f148704f).put(str, cls);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "registerLiteAppActivity error. " + cls + " is not subclass of WxaLiteAppLiteUI");
    }

    public final void Xj() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f148711p).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map = (java.util.Map) entry.getValue();
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
            if (y17 != null) {
                java.util.Iterator it6 = map.entrySet().iterator();
                while (it6.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) entry2.getValue();
                    if (!p1Var.f148781e) {
                        wu5.c cVar = p1Var.f148777a;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        java.lang.ref.WeakReference weakReference = p1Var.f148778b;
                        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                        if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
                            activity.unregisterActivityLifecycleCallbacks(p1Var.f148779c);
                            activity.unregisterComponentCallbacks(p1Var.f148780d);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65447xf93ff5c7(str, str2, y17.f14369x346425, y17.f14372xa8503287, false);
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
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 ij6 = ij(str, str2);
        if (ij6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp not found appId:%s path:%s", str, str2);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "releasePreloadLiteApp appId:%s, path:%s, engineId:%d", str, str2, java.lang.Integer.valueOf(ij6.f148783g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65447xf93ff5c7(str, str2, ij6.f148784h, ij6.f148785i, ij6.f148783g != 0 || kx5.n.h().b());
        kx5.n.h().f(ij6.f148783g);
    }

    public final void Zi(android.content.Context context, android.os.Bundle bundle, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, long j17, boolean z18, q80.f0 f0Var) {
        c3707xe60c5943.f127537n = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = z18 ? db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.l0(this)) : null;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("timeout", java.lang.String.valueOf(j17));
        hashMap.put("syncCheck", java.lang.String.valueOf(z17));
        ck(c3707xe60c5943, "Android.Feature.checkUpdate.sync", true, hashMap);
        fj(str, z17, 1, j17, c3707xe60c5943.I, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.m0(this, Q, c3707xe60c5943, context, bundle, openExtraData, f0Var, str));
    }

    public void Zj(java.lang.String str) {
        java.util.Map map = this.f148710o;
        if (((java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) map).get(str)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65448x8a31cd1a(str);
        } else if (java.lang.Integer.valueOf(r1.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        }
    }

    public final void aj(android.os.Bundle bundle, java.lang.String str, java.lang.Boolean bool, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.s sVar, com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329) {
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE);
        }
        fj(str, bool.booleanValue(), 1, j17, c3707xe60c5943.I, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.x0(this, c3707xe60c5943, bundle, c3717xac6c2329, openExtraData, sVar));
    }

    public void ak(q80.a0 a0Var) {
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.b0(a0Var));
    }

    public final void bj(java.lang.String str, java.lang.String str2, long j17, boolean z17, kh0.e eVar) {
        long j18 = j17 / 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp timeout: " + j18);
        kh0.g gVar = (kh0.g) i95.n0.c(kh0.g.class);
        boolean z18 = z17 ^ true;
        if (eVar == null) {
            eVar = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.e0(this);
        }
        jh0.v vVar = (jh0.v) gVar;
        vVar.getClass();
        vz4.d0.b(str, str2, j18, z18, new jh0.u(vVar, eVar));
    }

    public void bk(android.view.View view) {
        if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
            com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view;
            if (c3717xac6c2329.I) {
                c3717xac6c2329.I = false;
                c3717xac6c2329.mo29029x57429eec();
            }
        }
    }

    public void cj(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        fj(str, false, 2, 60000L, null, hVar);
    }

    public void dk(long j17, java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226049s;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "setLiteRunStatus :%b", bool);
        this.f148703e = bool.booleanValue();
    }

    public final void fj(java.lang.String str, boolean z17, int i17, long j17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str, z17, i17, j17, abstractC3700xe41a2874, hVar);
    }

    public void fk(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "setTestServiceEnable: %b", java.lang.Boolean.valueOf(z17));
        f148699r = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65491xc9838e4(z17);
    }

    public final void gk(android.content.Context context, q80.f0 f0Var) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("kInitLibCheckPref", 0);
        long j17 = sharedPreferences.getLong("kInitLibCheckKvKey", 0L);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mez);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572464mf1);
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572463mf0);
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mey);
        java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mex);
        if (j17 != 0 && java.lang.System.currentTimeMillis() - j17 >= 300000) {
            db5.e1.A(context, string, "", string2, string3, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.r(this, f0Var, context), new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.t(this, f0Var));
            return;
        }
        if (j17 == 0) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("kInitLibCheckKvKey", java.lang.System.currentTimeMillis());
            edit.apply();
        }
        db5.e1.y(context, string4, "", string5, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.v(this, f0Var));
    }

    public void hj(java.lang.String str, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        fj(str, z17, z18 ? 2 : 1, z18 ? 60000L : 20000L, null, hVar);
    }

    public void hk(android.content.Context context, android.os.Bundle bundle, boolean z17, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, q80.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData;
        java.lang.String string = bundle.getString("pkgId");
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = (jSONObject == null && jSONArray == null) ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startGameLiteApp pkgId is null, syncCheckUpdate: %s", java.lang.Boolean.valueOf(z17));
            jk(context, bundle, true, z17, sVar, f0Var);
            return;
        }
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
            openExtraData2.f37267x68af8e1 = sVar;
            openExtraData = openExtraData2;
        } else {
            openExtraData = null;
        }
        ik(context, bundle, z17, openExtraData, null, f0Var);
        if (jSONArray == null || jSONArray.length() == 0 || sVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.x xVar = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.x(this, jSONArray, jSONArray2, sVar);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = jSONArray.optString(i17);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("url", optString);
                jSONObject2.put("state", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) ? "fail" : "downloading");
                jSONArray2.put(jSONObject2);
            } catch (org.json.JSONException unused) {
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(optString, xVar);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("preloadImages", jSONArray2);
        sVar.d(hashMap2);
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 ij(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1 p1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "clearPreloadInfo appId:%s path:%s", str, str2);
        java.util.Map map = this.f148711p;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (map2 == null || (p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p1) map2.get(str2)) == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = p1Var.f148778b;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity != null && android.os.Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(p1Var.f148779c);
            activity.unregisterComponentCallbacks(p1Var.f148780d);
        }
        wu5.c cVar = p1Var.f148777a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        map2.remove(str2);
        if (map2.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        }
        return p1Var;
    }

    public final void ik(android.content.Context context, android.os.Bundle bundle, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, q80.f0 f0Var) {
        boolean z18;
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(4, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        java.lang.String string = bundle.getString("pkgId");
        java.lang.String string2 = bundle.getString("appId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            if (f0Var != null) {
                f0Var.mo555x2fd71e();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startGameLiteApp: %s", string2);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        boolean z19 = n17 ? z17 : false;
        if (c01.e2.a0() && Gj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "intercept!");
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.z zVar = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.z(this, context, bundle, z19, openExtraData, c3707xe60c5943, f0Var);
            ((vd0.j2) q1Var).getClass();
            v24.o0.h(context, 8388608L, null, zVar, 3);
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        if (c3707xe60c5943 == null) {
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59433 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
            c3707xe60c59433.f127530d = string2;
            c3707xe60c59433.f127535i = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(string2);
            c3707xe60c59433.I = m65924x3e9425e;
            m65924x3e9425e.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.a0(this));
            if (((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225484e).containsKey(string2)) {
                c3707xe60c59433.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_BEFORE_LAST_CHECK_FINISHED);
            }
            c3707xe60c59432 = c3707xe60c59433;
        } else {
            c3707xe60c59432 = c3707xe60c5943;
        }
        c3707xe60c59432.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.EXTERNAL_PACKAGE_LOADING_START);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = (n17 && z17) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(string2, null);
        long j17 = bundle.getLong("timeout", 20000L);
        if (y17 != null) {
            if (f0Var != null) {
                f0Var.mo556x90b54003();
            }
            c3707xe60c59432.f127536m = false;
            c3707xe60c59432.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.EXTERNAL_PACKAGE_LOADING_SUCCESS);
            c3707xe60c59432.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, 4L);
            Nj(context, bundle, c3707xe60c59432, y17, openExtraData, f0Var);
            if (n17) {
                bj(string, string2, j17, true, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + string2);
            return;
        }
        if (!n17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "openGameLiteApp fail:" + string2);
            if (f0Var != null) {
                f0Var.mo555x2fd71e();
                return;
            }
            return;
        }
        boolean z27 = bundle.getBoolean("withDownloadLoading", true);
        if (y17 != null && y17.m28997x7a994349() && (java.lang.System.currentTimeMillis() / 1000) - y17.f14374xee5c7336 < 86400) {
            z27 = false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3[] u3VarArr = {null};
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.c0(this, u3VarArr, z27, context));
        c3707xe60c59432.f127536m = true;
        c3707xe60c59432.f127537n = java.lang.System.currentTimeMillis();
        bj(string, string2, j17, false, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d0(this, u3VarArr, f0Var, c3707xe60c59432, string2, context, bundle, openExtraData));
    }

    public void jk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, q80.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData;
        if (sVar != null) {
            openExtraData = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
            openExtraData.f37267x68af8e1 = sVar;
        } else {
            openExtraData = null;
        }
        nk(context, bundle, z17, z18, openExtraData, f0Var);
    }

    public void kk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, q80.f0 f0Var) {
        nk(context, bundle, z17, z18, null, f0Var);
    }

    public void lk(android.content.Context context, q80.d0 d0Var, q80.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
        nk(context, mj(d0Var, openExtraData), d0Var.f442199r, d0Var.f442200s, openExtraData, f0Var);
    }

    public final android.os.Bundle mj(q80.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.f442182a);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f442183b)) {
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, d0Var.f442183b);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, null);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f442184c)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                openExtraData.f37265x66f18c8 = d0Var.f442184c;
            } else {
                bundle.putString("query", d0Var.f442184c);
                long j17 = d0Var.f442196o;
                if (j17 > 0) {
                    bundle.putLong(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14344xf03a9130, j17);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = d0Var.f442205x;
        if (sVar == null && d0Var.f442206y != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = d0Var.f442206y.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, d0Var.f442206y.opt(next));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar2.d(hashMap);
            sVar = sVar2;
        }
        openExtraData.f37267x68af8e1 = sVar;
        long j18 = d0Var.f442204w;
        if (j18 > 0) {
            bundle.putLong("timeout", j18);
        }
        if (d0Var.f442185d.booleanValue()) {
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, d0Var.f442185d.booleanValue());
        }
        bundle.putBoolean("withDownloadLoading", true);
        boolean z17 = d0Var.f442186e;
        if (z17) {
            bundle.putBoolean("forbidRightGesture", z17);
        }
        android.os.Bundle bundle2 = d0Var.f442188g;
        if (bundle2 != null) {
            bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
        }
        if (d0Var.f442190i == 1) {
            bundle.putBoolean("isHalfScreen", true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = d0Var.f442194m;
        if (c16190x27388f34 != null) {
            bundle.putParcelable("halfScreenConfig", c16190x27388f34);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f342 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
            c16190x27388f342.f224944e = d0Var.f442191j;
            c16190x27388f342.f224947h = d0Var.f442192k;
            c16190x27388f342.f224948i = d0Var.f442193l;
            c16190x27388f342.f224949m = null;
            bundle.putParcelable("halfScreenConfig", c16190x27388f342);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f442187f)) {
            bundle.putString("minVersion", d0Var.f442187f);
        }
        int i17 = d0Var.f442195n;
        if (i17 > 0) {
            bundle.putInt("requestCode", i17);
        }
        int i18 = d0Var.f442197p;
        if (i18 > 0) {
            bundle.putInt("nextAnimIn", i18);
        }
        int i19 = d0Var.f442198q;
        if (i19 > 0) {
            bundle.putInt("currentAnimOut", i19);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f442201t)) {
            bundle.putString("sourceType", d0Var.f442201t);
        }
        java.lang.String[] strArr = d0Var.f442202u;
        if (strArr != null) {
            bundle.putStringArray("enableActions", strArr);
        }
        java.lang.String[] strArr2 = d0Var.f442203v;
        if (strArr2 != null) {
            bundle.putStringArray("enableViews", strArr2);
        }
        if (d0Var.f442207z != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                try {
                    bundle.putInt("referrerScene", d0Var.f442207z.f14311x683188c.ordinal());
                    openExtraData.f37266x83282d6d = d0Var.f442207z.m28987x9d6b37f4();
                    com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = d0Var.f442207z;
                    if (c3708xc1f46f80 != null && (jSONObject = c3708xc1f46f80.f14310xe0809720) != null) {
                        if (jSONObject.has("appUuid")) {
                            bundle.putLong("referrerFromUuid", c3708xc1f46f80.f14310xe0809720.getLong("appUuid"));
                        }
                        if (c3708xc1f46f80.f14310xe0809720.has("pageId")) {
                            bundle.putLong("referrerFromPageId", c3708xc1f46f80.f14310xe0809720.getLong("pageId"));
                        }
                    }
                } catch (java.lang.Exception unused) {
                    openExtraData.f37266x83282d6d = null;
                }
            } else {
                bundle.putParcelable("liteappReferrerInfo", d0Var.f442207z);
                long j19 = d0Var.f442196o;
                if (j19 > 0) {
                    bundle.putLong(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14344xf03a9130, j19);
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
        if (d0Var.f442189h.booleanValue()) {
            bundle.putBoolean("isolateTask", d0Var.f442189h.booleanValue());
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
    public final void mk(android.content.Context r32, android.os.Bundle r33, boolean r34, boolean r35, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 r36, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData r37, q80.f0 r38) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.mk(android.content.Context, android.os.Bundle, boolean, boolean, com.tencent.liteapp.report.WxaLiteAppStartReport, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData, q80.f0):void");
    }

    public java.util.List nj() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler k0Var = j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true) ? new ha3.k0() : new x03.q1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.b2());
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

    public final void nk(android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.f0 f0Var) {
        int i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.o(this, context, bundle, z17, z18, openExtraData, f0Var));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(4, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        if (!bundle.containsKey("appId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "appId is required");
            f0Var.mo555x2fd71e();
            return;
        }
        java.lang.String string = bundle.getString("appId");
        if (!Vi(context)) {
            gk(context, f0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(string);
        m65924x3e9425e.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.p(this));
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("checkUpdate", java.lang.String.valueOf(z17));
        hashMap.put("syncCheck", java.lang.String.valueOf(z18));
        boolean z19 = true;
        m65924x3e9425e.mo28879x145c484d("Android.Startup.ToOnShowPageTimeStamp", true, hashMap);
        if (((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225484e).containsKey(string)) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_BEFORE_LAST_CHECK_FINISHED);
        }
        if (bundle.containsKey("keepAliveSeconds")) {
            i17 = bundle.getInt("keepAliveSeconds");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "keepAliveSeconds %d", java.lang.Integer.valueOf(i17));
        } else {
            i17 = 0;
        }
        boolean z27 = bundle.containsKey("ignoreAlive") ? bundle.getBoolean("ignoreAlive") : false;
        if (i17 > 0) {
            com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518 enumC3705xd4888518 = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_NEED_KEEP_ALIVE;
            m65924x3e9425e.mo28889x775d9b7e(enumC3705xd4888518);
            if (z27) {
                m65924x3e9425e.mo28889x775d9b7e(enumC3705xd4888518);
            }
        }
        if (z27) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_IGNORE_KEEP_ALIVE);
        }
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
        c3707xe60c5943.I = m65924x3e9425e;
        c3707xe60c5943.f127530d = string;
        c3707xe60c5943.f127535i = java.lang.System.currentTimeMillis();
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, ya.b.f77479x42930b2);
        java.lang.String string3 = bundle.getString("query", "");
        c3707xe60c5943.f127532f = string2;
        c3707xe60c5943.f127531e = string3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp appId: " + string + ", page: " + string2);
        java.lang.String str = string + "_" + string2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap2 = f148700s;
        long longValue = hashMap2.containsKey(str) ? ((java.lang.Long) hashMap2.get(str)).longValue() : 0L;
        if (currentTimeMillis <= longValue || currentTimeMillis - longValue > 500) {
            hashMap2.put(str, java.lang.Long.valueOf(currentTimeMillis));
            z19 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "reduplicate request key: %s, lasttime:%d, now:%d", str, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1293L, 105L, 1L);
            g0Var.mo68478xbd3cda5f(21018, string + "," + longValue + "," + currentTimeMillis);
        }
        if (z19) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.REPEATED_CLICK);
        } else {
            mk(context, bundle, z17, z18, c3707xe60c5943, openExtraData, f0Var);
        }
    }

    public android.view.View oj(android.content.Context context, boolean z17, boolean z18, q80.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38(context);
        c16266x3ede7a38.f127592z = z17;
        c16266x3ede7a38.A = z18;
        c16266x3ede7a38.f225910y0 = uVar;
        return c16266x3ede7a38;
    }

    public void ok(android.content.Context context, q80.d0 d0Var, q80.f0 f0Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp In other MainProcess:%s", bm5.f1.a());
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10622xe53aefa1(d0Var.f442182a, d0Var.f442187f, d0Var.D.toString(), java.lang.Boolean.valueOf(d0Var.f442199r), java.lang.Boolean.valueOf(d0Var.f442200s)), com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.k1.class, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.n(this, f0Var, d0Var, context));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startLiteApp In MainProcess");
        org.json.JSONObject jSONObject = d0Var.D;
        if (jSONObject != null && jSONObject.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.d(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.m(this, d0Var));
            d0Var.f442205x = sVar;
        }
        lk(context, d0Var, f0Var);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppFeatureService OnCreate.");
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37148xf582434a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65494x4587863a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w());
            com.p314xaae8f345.mm.app.q5.b().a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.q0());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37148xf582434a = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.w wVar = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.w(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(wVar, 180000L, false);
        }
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.k0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.e(new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            qa3.o oVar = qa3.o.f442584a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !z65.c.a()) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "not test env");
            } else if (qa3.o.f442587d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "already_init");
            } else {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true);
                qa3.o.f442588e = fj6;
                if (fj6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "use new websocket for test and load lib");
                    java.lang.String m154080xdba63de6 = org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(m154080xdba63de6);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/test/LiteAppTestService", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/mm/plugin/lite/test/LiteAppTestService", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    wp5.e.a(context2, new qa3.k());
                }
                qa3.o.f442587d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1813x364492.C16235x5e3abaab c16235x5e3abaab = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1813x364492.C16235x5e3abaab();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.liteapp.test.INIT_CONNECTION");
                if (fp.h.a(33)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16235x5e3abaab, intentFilter);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16235x5e3abaab, intentFilter, 2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "garry test init receiver");
                nz5.b.a(false, false, null, null, 0, qa3.l.f442582d, 31, null);
                boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(com.p314xaae8f345.mm.p642xad8b531f.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a(".com.tencent.mm.debug.liteapp.testservice"), false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "assist serviceEnable " + m17);
                if (m17) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
            oa3.c cVar = new oa3.c();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) g0Var).getClass();
            sj4.z0.f490442b.put("17", cVar);
            ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.w0(this), 60000L);
        }
        com.p314xaae8f345.mm.app.C5000x71a2fa35.V.f(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.CallableC10623x3046d8());
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134763k.f135259p.f(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.CallableC10624x3046d9());
        if (f148699r) {
            fk(true);
        }
    }

    public void pj(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "createStore, appId:%s aliveSeconds:%s pkgPath:%s", str, java.lang.Integer.valueOf(i17), str2);
        sj(4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65271xe1eba545(str, str2, "", i17);
    }

    public void pk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, q80.s sVar2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData;
        if (sVar != null) {
            openExtraData = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
            openExtraData.f37267x68af8e1 = sVar;
        } else {
            openExtraData = null;
        }
        rk(view, bundle, z17, z18, openExtraData, sVar2);
    }

    public void qj(java.lang.String str, int i17, boolean z17, long j17, q80.f0 f0Var) {
        sj(4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.d();
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        if (y17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65271xe1eba545(str, y17.f14369x346425, y17.f14372xa8503287, i17);
            if (f0Var != null) {
                f0Var.mo556x90b54003();
                return;
            }
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f148710o;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
        if (num == null) {
            concurrentHashMap.put(str, 1);
        } else {
            num.intValue();
        }
        if (j17 <= 0) {
            j17 = 20000;
        }
        fj(str, false, 1, j17, null, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.s0(this, str, i17, f0Var));
    }

    public void qk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, q80.s sVar) {
        rk(view, bundle, z17, z18, null, sVar);
    }

    public int rj(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65284x81288087(str, str2, obj);
    }

    public final void rk(android.view.View view, android.os.Bundle bundle, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.s sVar) {
        boolean z19;
        boolean z27;
        int i17;
        boolean z28;
        long j17;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        long j18;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(4, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225688g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "startLiteAppViewImpl debug syncCheck enable.");
            z19 = true;
            z27 = true;
        } else {
            z19 = z17;
            z27 = z18;
        }
        if (!(view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329)) {
            if (sVar != null) {
                sVar.mo9542x2fd71e();
                return;
            }
            return;
        }
        if (!bundle.containsKey("appId")) {
            if (sVar != null) {
                sVar.mo9542x2fd71e();
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("appId");
        if (!Vi(view.getContext())) {
            gk(view.getContext(), null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "checkAndInitLib failed。");
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(string);
        m65924x3e9425e.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.j(this));
        if (((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225484e).containsKey(string)) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_BEFORE_LAST_CHECK_FINISHED);
        }
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view;
        if (bundle.containsKey("keepAliveSeconds")) {
            i17 = bundle.getInt("keepAliveSeconds");
            c3717xac6c2329.C = i17;
        } else {
            i17 = 0;
        }
        if (bundle.containsKey("ignoreAlive")) {
            z28 = bundle.getBoolean("ignoreAlive");
            c3717xac6c2329.D = z28;
        } else {
            z28 = false;
        }
        if (bundle.containsKey("liteappReferrerInfo")) {
            c3717xac6c2329.E = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80) bundle.getParcelable("liteappReferrerInfo");
        } else {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP_VIEW;
            c3717xac6c2329.E = c3708xc1f46f80;
        }
        if (i17 > 0) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_NEED_KEEP_ALIVE);
            if (z28) {
                m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_KEEP_ALIVE_IGNORE_LAST);
            }
        }
        if (z28) {
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_IGNORE_KEEP_ALIVE);
        }
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
        c3707xe60c5943.I = m65924x3e9425e;
        c3717xac6c2329.f127573d = m65924x3e9425e;
        if (openExtraData != null) {
            java.lang.String str = openExtraData.f37265x66f18c8;
            if (str != null) {
                c3717xac6c2329.f127586t = str;
            }
            c3717xac6c2329.m29034x53b6b99f(openExtraData.f37267x68af8e1);
        } else {
            c3717xac6c2329.m29034x53b6b99f(null);
        }
        if (bundle.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63)) {
            c3717xac6c2329.f127591y = bundle.getBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63);
        }
        c3707xe60c5943.f127530d = string;
        c3707xe60c5943.f127535i = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1293L, 90L, 1L);
        long j19 = bundle.getLong("timeout", 0L);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = z27 ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(string, m65924x3e9425e);
        if (z27 && (abstractC3700xe41a2874 = c3707xe60c5943.I) != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.FORCE_SYNC_CHECK);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().I(string)) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = y17;
            if (c3712x3ed8a4412 != null) {
                c3707xe60c5943.f127536m = false;
                if (z19) {
                    m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE);
                    boolean z29 = z27;
                    j17 = 1;
                    fj(string, z29, 2, j19 > 0 ? j19 : 60000L, m65924x3e9425e, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.k(this, m65924x3e9425e));
                } else {
                    j17 = 1;
                }
                m65924x3e9425e.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, j17);
                Oj(bundle, c3707xe60c5943, c3712x3ed8a4412, c3717xac6c2329, openExtraData, sVar);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "get info return null, appid:" + string);
            g0Var.C(1293L, 92L, 1L);
            g0Var.mo68478xbd3cda5f(20979, string);
            c3707xe60c5943.f127536m = true;
            c3707xe60c5943.f127537n = java.lang.System.currentTimeMillis();
            m65924x3e9425e.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE);
            fj(string, z27, 1, j19 > 0 ? j19 : 20000L, m65924x3e9425e, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.l(this, c3707xe60c5943, m65924x3e9425e, m65924x3e9425e, bundle, c3717xac6c2329, openExtraData, sVar));
            return;
        }
        java.lang.String string2 = bundle.getString("appId");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().I(string2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "illegal pay liteapp appid: %s, start fail", string2);
            if (sVar != null) {
                sVar.mo9542x2fd71e();
                return;
            }
            return;
        }
        java.lang.String string3 = bundle.getString("minVersion");
        if (string3 != null && y17 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(string3, Ej(y17.f14369x346425, y17.f14359x58b7f1c, y17.f14372xa8503287))) {
            z19 = true;
            z27 = true;
        }
        if (!z19 && z27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "illegal check update params, checkUpdate: %b, syncCheckUpdate: %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
            if (sVar != null) {
                sVar.mo9542x2fd71e();
                return;
            }
            return;
        }
        if (z27) {
            c3707xe60c5943.f127536m = true;
            c3707xe60c5943.f127537n = java.lang.System.currentTimeMillis();
            g0Var.C(1293L, 91L, 1L);
            aj(bundle, string2, java.lang.Boolean.valueOf(z27), c3707xe60c5943, j19 > 0 ? j19 : 20000L, openExtraData, sVar, c3717xac6c2329);
            return;
        }
        if (y17 == null) {
            c3707xe60c5943.f127536m = true;
            c3707xe60c5943.f127537n = java.lang.System.currentTimeMillis();
            g0Var.C(1293L, 92L, 1L);
            g0Var.mo68478xbd3cda5f(20979, string2);
            aj(bundle, string2, java.lang.Boolean.valueOf(z27), c3707xe60c5943, j19 > 0 ? j19 : 20000L, openExtraData, sVar, c3717xac6c2329);
            return;
        }
        c3707xe60c5943.f127536m = false;
        if (z19) {
            c3707xe60c5943.f127537n = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28742 = c3707xe60c5943.I;
            if (abstractC3700xe41a28742 != null) {
                abstractC3700xe41a28742.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE);
            }
            j18 = 1;
            c3712x3ed8a441 = y17;
            fj(string2, z27, 2, j19 > 0 ? j19 : 60000L, c3707xe60c5943.I, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.v0(this, string2, c3707xe60c5943));
        } else {
            c3712x3ed8a441 = y17;
            j18 = 1;
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28743 = c3707xe60c5943.I;
        if (abstractC3700xe41a28743 != null) {
            abstractC3700xe41a28743.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, j18);
        }
        Oj(bundle, c3707xe60c5943, c3712x3ed8a441, c3717xac6c2329, openExtraData, sVar);
    }

    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 sj(int i17, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        if (c3707xe60c5943 == null) {
            c3707xe60c5943 = new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(i17, c3707xe60c5943);
    }

    public void sk(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar, android.content.Intent intent, int i17) {
        if (i17 == 0) {
            intent.addFlags(268435456);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
            intent.putExtra("proxyui_action_code_key", 0);
            intent.putExtra("callback_id", m93.j.a(pVar));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
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
        for (java.util.Map.Entry<java.lang.Long, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback> entry : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.entrySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback value = entry.getValue();
            if (value.f37224xf5bc2045 != null && (str2 = value.f37221x58b7f1c) != null && str2.equals(str)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public boolean tk(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65497xb84155a2(str);
    }

    public java.lang.String uj(java.lang.String str) {
        java.lang.String m65301x1743ea71 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65301x1743ea71("", str, "", false);
        if (m65301x1743ea71 == null || m65301x1743ea71.isEmpty()) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
            if (y17 != null) {
                m65301x1743ea71 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65301x1743ea71(y17.f14369x346425, str, y17.f14372xa8503287, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "WxaLiteAppInfo is null");
            }
        }
        if (m65301x1743ea71 == null || m65301x1743ea71.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "GetAuthUrl is null or empty");
        }
        return m65301x1743ea71;
    }

    public int uk(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65501x58c0e9b7(str, (java.lang.String[]) list.toArray(new java.lang.String[0]));
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef vj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().t(null);
    }

    public int vk(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65505xd0f9c4b0(str, (java.lang.String[]) list.toArray(new java.lang.String[0]));
    }

    public java.lang.Object wj(long j17, java.lang.String str) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226049s;
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
        java.util.HashMap hashMap = kx5.n.h().f394849f;
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
        return kx5.n.h().f394849f.size();
    }

    public java.lang.String zj(java.lang.String str, long j17, java.lang.String str2) {
        java.lang.String str3;
        if (str2.startsWith("liteappLocalId://")) {
            str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65346x5462dac5(j17, str, str2);
        } else if (str2.startsWith("weixin://resourceid/")) {
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str2);
        } else {
            str3 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, "LiteAppFilePathNull," + j17 + "," + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "getFilePathByBothLocalId null");
        return "";
    }
}

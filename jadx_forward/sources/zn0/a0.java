package zn0;

/* loaded from: classes3.dex */
public class a0 {
    public final java.util.concurrent.ConcurrentHashMap E;
    public final java.util.Set F;

    /* renamed from: a, reason: collision with root package name */
    public final zn0.e0 f555830a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f555831b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f555832c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f555833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f555834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f555835f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f555836g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f555837h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f555838i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f555839j;

    /* renamed from: o, reason: collision with root package name */
    public final int f555844o;

    /* renamed from: p, reason: collision with root package name */
    public final zn0.i f555845p;

    /* renamed from: q, reason: collision with root package name */
    public final kn0.p f555846q;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f555840k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f555841l = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public int f555842m = 1258344707;

    /* renamed from: n, reason: collision with root package name */
    public int f555843n = 58415;

    /* renamed from: r, reason: collision with root package name */
    public kn0.i f555847r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f555848s = null;

    /* renamed from: t, reason: collision with root package name */
    public int f555849t = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f555850u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f555851v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public org.json.JSONObject f555852w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c f555853x = null;

    /* renamed from: y, reason: collision with root package name */
    public zn0.s f555854y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f555855z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public long D = 0;

    public a0(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8, zn0.e0 e0Var, boolean z17, int i17, kn0.p pVar) {
        this.f555844o = 0;
        this.f555845p = null;
        this.f555846q = null;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.E = concurrentHashMap;
        this.F = java.util.concurrent.ConcurrentHashMap.newKeySet();
        this.f555831b = abstractC26786xbe57dcc8;
        this.f555830a = e0Var;
        this.f555832c = z17;
        this.f555833d = new java.util.ArrayList();
        this.f555839j = new java.util.HashMap();
        this.f555844o = i17;
        this.f555846q = pVar;
        this.f555845p = new zn0.i(i17, this);
        concurrentHashMap.put(zn0.f0.DEFAULT, 100);
    }

    public int a(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser, int i17) {
        if (tRTCMixUser == null) {
            return i17;
        }
        fn0.g gVar = fn0.g.f345728a;
        boolean f17 = gVar.f();
        boolean d17 = gVar.d(tRTCMixUser.f57070xce2b2e46);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "appendUserAudioMode isAnchor = " + z17 + " isAudioMode = " + d17 + " userId= " + tRTCMixUser.f57070xce2b2e46 + " isEnableSwitchVideoAudio = " + f17 + " mixUser.pureAudio= " + tRTCMixUser.f57065x968497be);
        if (f17 && !z17) {
            d17 = tRTCMixUser.f57065x968497be;
        }
        if (d17) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            return i17 | 2;
        }
        java.util.regex.Pattern pattern2 = pm0.v.f438335a;
        return i17 & (-3);
    }

    public final void b() {
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        if (arrayList == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((zn0.v) it.next()).f555939d;
            if (str != null && !str.isEmpty()) {
                c(str);
            }
        }
    }

    public final void c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int intValue = ((java.lang.Integer) this.E.values().stream().min(new zn0.C30844x56d4592()).orElse(100)).intValue();
        this.f555831b.mo30362xe9a43228(str, intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "applyVolumeToSingleUser: userId=" + str + ", volume=" + intValue);
    }

    public final java.lang.String d(int i17, int i18) {
        return java.lang.String.valueOf(i17 / i18);
    }

    public void e(java.util.List list, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig, java.lang.String str, android.graphics.Point point, int i17, int i18) {
        zn0.a0 a0Var = this;
        java.lang.String str2 = str;
        int size = list.size();
        int i19 = point.x;
        int i27 = point.y;
        tRTCMixUser.f297232x = i19;
        tRTCMixUser.f297233y = i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "configRoomPkParams: userConfigList.size:%d, roomId:%s, originX:%d, originY:%d, videoWidth:%d, videoHeight:%d", java.lang.Integer.valueOf(size), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (size != 0) {
            java.lang.String str3 = ", userStream: ";
            if (size == 1) {
                int i28 = i17 / 2;
                tRTCMixUser.f57071x6be2dc6 = i28;
                int i29 = i18 / 4;
                tRTCMixUser.f57062xb7389127 = i29;
                java.util.Iterator it = list.iterator();
                int i37 = 0;
                while (it.hasNext()) {
                    zn0.v vVar = (zn0.v) it.next();
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser2 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                    tRTCMixUser2.f57067xc8d8bf56 = str2;
                    java.lang.String str4 = vVar.f555939d;
                    tRTCMixUser2.f57070xce2b2e46 = str4;
                    tRTCMixUser2.f57069xb8c992da = vVar.f555940e;
                    i37++;
                    tRTCMixUser2.f57072xd4bdd2f4 = i37;
                    tRTCMixUser2.f57065x968497be = true;
                    tRTCMixUser2.f57071x6be2dc6 = i28;
                    tRTCMixUser2.f57062xb7389127 = i29;
                    tRTCMixUser2.f297232x = i19;
                    tRTCMixUser2.f297233y = tRTCMixUser.f57062xb7389127 + i27;
                    zn0.g0 i38 = a0Var.i(str4, 0);
                    if (i38 != null) {
                        tRTCMixUser2.f57065x968497be = i38.f555881c;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "updateCloudMixtureParams userId " + tRTCMixUser2.f57070xce2b2e46 + ", pureAudioMode: " + tRTCMixUser2.f57065x968497be + ", userStream: " + i38);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "configRoomPkParams: add mixUser, userId:%s, x:%d, y:%d, width:%d, height:%d", tRTCMixUser2.f57070xce2b2e46, java.lang.Integer.valueOf(tRTCMixUser2.f297232x), java.lang.Integer.valueOf(tRTCMixUser2.f297233y), java.lang.Integer.valueOf(tRTCMixUser2.f57071x6be2dc6), java.lang.Integer.valueOf(tRTCMixUser2.f57062xb7389127));
                    tRTCTranscodingConfig.f57150xbef7910c.add(tRTCMixUser2);
                    a0Var = this;
                    str2 = str;
                    i28 = i28;
                    i29 = i29;
                }
            } else if (size == 2) {
                tRTCMixUser.f57071x6be2dc6 = i17 / 2;
                int i39 = i18 / 4;
                tRTCMixUser.f57062xb7389127 = i39;
                java.util.Iterator it6 = list.iterator();
                int i47 = 0;
                while (it6.hasNext()) {
                    zn0.v vVar2 = (zn0.v) it6.next();
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser3 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                    tRTCMixUser3.f57067xc8d8bf56 = str2;
                    java.util.Iterator it7 = it6;
                    java.lang.String str5 = vVar2.f555939d;
                    tRTCMixUser3.f57070xce2b2e46 = str5;
                    tRTCMixUser3.f57069xb8c992da = vVar2.f555940e;
                    int i48 = i47 + 1;
                    tRTCMixUser3.f57072xd4bdd2f4 = i48;
                    tRTCMixUser3.f57065x968497be = true;
                    int i49 = i17 / 4;
                    tRTCMixUser3.f57071x6be2dc6 = i49;
                    tRTCMixUser3.f57062xb7389127 = i39;
                    tRTCMixUser3.f297232x = (i47 * i49) + i19;
                    tRTCMixUser3.f297233y = tRTCMixUser.f57062xb7389127 + i27;
                    zn0.g0 i57 = a0Var.i(str5, 0);
                    if (i57 != null) {
                        tRTCMixUser3.f57065x968497be = i57.f555881c;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "updateCloudMixtureParams userId " + tRTCMixUser3.f57070xce2b2e46 + ", pureAudioMode: " + tRTCMixUser3.f57065x968497be + str3 + i57);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "configRoomPkParams: add mixUser, userId:%s, x:%d, y:%d, width:%d, height:%d", tRTCMixUser3.f57070xce2b2e46, java.lang.Integer.valueOf(tRTCMixUser3.f297232x), java.lang.Integer.valueOf(tRTCMixUser3.f297233y), java.lang.Integer.valueOf(tRTCMixUser3.f57071x6be2dc6), java.lang.Integer.valueOf(tRTCMixUser3.f57062xb7389127));
                    tRTCTranscodingConfig.f57150xbef7910c.add(tRTCMixUser3);
                    it6 = it7;
                    i47 = i48;
                    i39 = i39;
                    str3 = str3;
                }
            }
        } else {
            tRTCMixUser.f57071x6be2dc6 = i17 / 2;
            tRTCMixUser.f57062xb7389127 = i18 / 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "configRoomPkParams: anchor userId " + tRTCMixUser.f57070xce2b2e46 + ", pureAudioMode: " + tRTCMixUser.f57065x968497be + ", width: " + tRTCMixUser.f57071x6be2dc6 + ", height: " + tRTCMixUser.f57062xb7389127);
    }

    public zn0.v f(java.util.List list, java.lang.String str) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            zn0.v vVar = (zn0.v) list.get(i17);
            if (str != null && str.equals(vVar.f555939d)) {
                return vVar;
            }
        }
        return null;
    }

    public go0.q1 g(java.lang.String str) {
        java.util.HashMap hashMap = this.f555839j;
        if (hashMap == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !hashMap.containsKey(str)) {
            return null;
        }
        return (go0.q1) hashMap.get(str);
    }

    public int h(int i17, int i18, int i19) {
        int i27;
        float f17;
        float f18;
        fn0.g gVar = fn0.g.f345728a;
        boolean z17 = fn0.g.f345729b != null;
        if (!z17 || i19 == 0) {
            i27 = i18;
        } else {
            if (i19 != 1) {
                f17 = i17 * 2;
                f18 = 1.0843374f;
            } else {
                f17 = i17 * 2;
                f18 = 1.2244898f;
            }
            i27 = (int) (f17 / f18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "checkAdjustMicLayout: isEnableMicLayoutChange:" + z17 + " size = " + i19 + " videoWidth = " + i17 + " oriVideoHeight = " + i18 + " newHeight = " + i27);
        return i27;
    }

    public zn0.g0 i(java.lang.String str, int i17) {
        java.lang.String str2;
        java.util.Iterator it = this.f555833d.iterator();
        while (it.hasNext()) {
            zn0.g0 g0Var = (zn0.g0) it.next();
            if (g0Var != null && (str2 = g0Var.f555879a) != null && str2.equals(str) && g0Var.f555880b == i17) {
                return g0Var;
            }
        }
        return null;
    }

    public final boolean j(java.lang.String str, int i17) {
        java.lang.String str2;
        java.util.Iterator it = this.f555833d.iterator();
        while (it.hasNext()) {
            zn0.g0 g0Var = (zn0.g0) it.next();
            if (g0Var != null && (str2 = g0Var.f555879a) != null && str2.equals(str) && g0Var.f555880b == i17) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        fn0.g gVar = fn0.g.f345728a;
        return gVar.i() || gVar.g() || gVar.e() || gVar.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject l(int r18, int r19, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig r20, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser r21) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.a0.l(int, int, com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, com.tencent.trtc.TRTCCloudDef$TRTCMixUser):org.json.JSONObject");
    }

    public org.json.JSONObject m(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig, boolean z17) {
        int i17;
        int i18;
        int i19;
        int i27;
        java.lang.String str = "TRTCRemoteUserManager";
        if (tRTCTranscodingConfig == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "prepareAnchorInfoLinkMicJson return nil, config == null");
            return null;
        }
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> arrayList = tRTCTranscodingConfig.f57150xbef7910c;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "prepareAnchorInfoLinkMicJson return nil, mixUserList == null");
            return null;
        }
        if (arrayList.size() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "prepareAnchorInfoLinkMicJson return nil, mixUserList.size: " + arrayList.size());
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "prepareAnchorInfoLinkMicJson isFromMicForce: + " + z17 + " mixUserList.size: " + arrayList.size());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> it = arrayList.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser next = it.next();
                java.util.Iterator<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> it6 = it;
                if (i28 == 0) {
                    org.json.JSONArray jSONArray2 = jSONArray;
                    jSONObject.putOpt("x", d(next.f297232x, tRTCTranscodingConfig.f57158x9f1bbe0b));
                    jSONObject.putOpt("y", d(next.f297233y, tRTCTranscodingConfig.f57156x2a8d0982));
                    jSONObject.putOpt("w", d(next.f57071x6be2dc6, tRTCTranscodingConfig.f57158x9f1bbe0b));
                    jSONObject.putOpt("h", d(next.f57062xb7389127, tRTCTranscodingConfig.f57156x2a8d0982));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "prepareAnchorInfoLinkMicJson: add userInfo, index: " + i28 + ", info:" + jSONObject);
                    int i29 = this.f555845p.f555885b.f555850u;
                    if (i29 == 1) {
                        i17 = 1;
                    } else if (i29 != 2) {
                        i17 = 3;
                        if (i29 != 3) {
                            i17 = 0;
                        }
                    } else {
                        i17 = 2;
                    }
                    jSONObject.putOpt("bm", java.lang.Integer.valueOf(i17));
                    jSONObject.putOpt("m", java.lang.Integer.valueOf(z17 ? 1 : 0));
                    if (z17) {
                        java.lang.String str2 = this.f555848s;
                        jSONObject.putOpt("f", java.lang.Integer.valueOf((str2 == null || !str2.equals(next.f57070xce2b2e46)) ? 2 : 1));
                        jSONObject.putOpt("z", java.lang.Integer.valueOf(next.f57072xd4bdd2f4));
                    }
                    jSONObject.putOpt("a", d(tRTCTranscodingConfig.f57158x9f1bbe0b, tRTCTranscodingConfig.f57156x2a8d0982));
                    jSONObject.putOpt("i", java.lang.Integer.valueOf(next.f57072xd4bdd2f4 + 1));
                    i28++;
                    it = it6;
                    jSONArray = jSONArray2;
                } else {
                    org.json.JSONArray jSONArray3 = jSONArray;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    org.json.JSONObject jSONObject3 = jSONObject;
                    java.lang.String str3 = str;
                    jSONObject2.putOpt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID, next.f57070xce2b2e46);
                    jSONObject2.putOpt("x", d(next.f297232x, tRTCTranscodingConfig.f57158x9f1bbe0b));
                    jSONObject2.putOpt("y", d(next.f297233y, tRTCTranscodingConfig.f57156x2a8d0982));
                    jSONObject2.putOpt("w", d(next.f57071x6be2dc6, tRTCTranscodingConfig.f57158x9f1bbe0b));
                    jSONObject2.putOpt("h", d(next.f57062xb7389127, tRTCTranscodingConfig.f57156x2a8d0982));
                    if (z17) {
                        java.lang.String str4 = this.f555848s;
                        jSONObject2.putOpt("f", java.lang.Integer.valueOf((str4 == null || !str4.equals(next.f57070xce2b2e46)) ? 2 : 1));
                        jSONObject2.putOpt("z", java.lang.Integer.valueOf(next.f57072xd4bdd2f4));
                    }
                    fn0.g gVar = fn0.g.f345728a;
                    if (gVar.k()) {
                        jSONObject2.putOpt("mt", java.lang.Long.valueOf(gVar.c(next.f57070xce2b2e46)));
                    }
                    jSONObject2.putOpt("i", java.lang.Integer.valueOf(next.f57072xd4bdd2f4 + 1));
                    zn0.v d17 = zn0.x.f555947a.d(next.f57070xce2b2e46);
                    if (d17 != null) {
                        if (d17.f555943h <= this.f555844o) {
                            java.util.regex.Pattern pattern = pm0.v.f438335a;
                            i27 = 1;
                        } else {
                            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                            i27 = 0;
                        }
                        i18 = d17.f555945m ? i27 | 4 : i27 & (-5);
                    } else {
                        i18 = 0;
                    }
                    if (d17 != null) {
                        i18 = a(d17.f555945m, next, i18);
                    }
                    java.lang.String str5 = next.f57070xce2b2e46;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (gVar.o(str5)) {
                        java.util.regex.Pattern pattern3 = pm0.v.f438335a;
                        i19 = i18 | 16;
                    } else {
                        java.util.regex.Pattern pattern4 = pm0.v.f438335a;
                        i19 = i18 & (-17);
                    }
                    int i37 = next.f57067xc8d8bf56 != null ? i19 | 8 : i19 & (-9);
                    jSONObject2.putOpt("us", java.lang.Integer.valueOf(gVar.o(next.f57070xce2b2e46) ? i37 | 16 : i37 & (-17)));
                    jSONArray3.put(jSONObject2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "prepareAnchorInfoLinkMicJson: add userInfo, index: " + i28 + ", userInfo:" + jSONObject2);
                    i28++;
                    jSONArray = jSONArray3;
                    str = str3;
                    it = it6;
                    jSONObject = jSONObject3;
                }
            }
            org.json.JSONObject jSONObject4 = jSONObject;
            jSONObject4.putOpt("list", jSONArray);
            return jSONObject4;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public void n(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        java.lang.String str2;
        fn0.g gVar = fn0.g.f345728a;
        if (gVar.a(str)) {
            o(str);
            return;
        }
        zn0.g0 g0Var = new zn0.g0();
        g0Var.f555879a = str;
        g0Var.f555880b = i17;
        g0Var.f555881c = false;
        zn0.y yVar = zn0.x.f555947a;
        zn0.v d17 = yVar.d(str);
        if (d17 == null) {
            zn0.v vVar = new zn0.v(str, i17);
            vVar.f555941f = true;
            yVar.a(vVar);
        } else {
            d17.f555941f = true;
        }
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = this.f555831b;
        if (i17 == 2 || !this.f555832c) {
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
                abstractC26786xbe57dcc8.mo30331x856aea4(str, new com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f));
                if (i17 == 0) {
                    abstractC26786xbe57dcc8.mo30368x46994af3(str, 1);
                    abstractC26786xbe57dcc8.mo30393xaf56220d(str, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
                } else if (i17 == 2) {
                    abstractC26786xbe57dcc8.mo30364xda08ff23(str, 1);
                    abstractC26786xbe57dcc8.mo30391xcdbff63d(str, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
                }
            }
        } else if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TRTCRemoteUserManager", "startCustomRender renderView = null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "startCustomRender userId: " + str);
            if (k() && gVar.q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "startCustomRender skipped in voice room mode");
            } else {
                go0.q1 g17 = g(str);
                if (g17 == null) {
                    g17 = new go0.q1(str, 0);
                }
                kn0.p pVar = this.f555846q;
                if ((pVar != null && pVar.f391122i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(this.f555837h)) {
                    g17.e(5);
                } else {
                    g17.e(2);
                }
                android.view.TextureView textureView = new android.view.TextureView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getContext());
                textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                zn0.b0 b0Var = new zn0.b0(this, str, textureView);
                p(str);
                this.f555840k.put(str, b0Var);
                this.f555841l.postDelayed(b0Var, 3000L);
                textureView.setSurfaceTextureListener(new zn0.c0(this, str, g17));
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46533x473bda1f(textureView);
                if (textureView.isAvailable()) {
                    android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    try {
                        str2 = new org.json.JSONObject().put("available", true).put("width", width).put("height", height).toString().replace(",", ";");
                    } catch (java.lang.Exception unused) {
                        str2 = "{\"available\":true}";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TRTCRemoteUserManager", str2);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f();
                    c6516x7962e81f.f138678e = 400;
                    c6516x7962e81f.p(str2);
                    c6516x7962e81f.k();
                    p(str);
                    if (surfaceTexture != null && width > 0 && height > 0) {
                        g17.a(new android.view.Surface(surfaceTexture), false);
                        g17.d(width, height);
                    }
                }
                if (fn0.g.f345728a.n()) {
                    abstractC26786xbe57dcc8.mo30366x3cc2c55d(str, 2, 3, g17);
                } else {
                    abstractC26786xbe57dcc8.mo30366x3cc2c55d(str, 1, 2, g17);
                }
                this.f555839j.put(str, g17);
                textureView.invalidate();
            }
            abstractC26786xbe57dcc8.mo30393xaf56220d(str, null);
        }
        if (!j(str, 0)) {
            java.util.ArrayList arrayList = this.f555833d;
            arrayList.add(g0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "remoteUserVideoAvailable " + g0Var.f555879a + ", stream 0, size " + arrayList.size());
        }
        c(str);
    }

    public boolean o(java.lang.String str) {
        zn0.x.f555947a.h(str);
        r(str);
        boolean equals = str.equals(this.f555835f);
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = this.f555831b;
        if (!equals) {
            abstractC26786xbe57dcc8.mo30411xb8f95dad(str);
        }
        if (!fn0.g.f345728a.n()) {
            abstractC26786xbe57dcc8.mo30410x8675ce9d(str);
        }
        vn0.c cVar = vn0.b.f519707a;
        if (cVar.f519711d == null) {
            cVar.f519711d = new xn0.k();
        }
        xn0.k kVar = cVar.f519711d;
        if (!str.equals(kVar.f536963d)) {
            return false;
        }
        kVar.f536963d = "";
        return true;
    }

    public final void p(java.lang.String str) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f555840k.remove(str);
        if (runnable != null) {
            this.f555841l.removeCallbacks(runnable);
        }
    }

    public final void q(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = this.f555833d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn0.g0 g0Var = (zn0.g0) it.next();
            java.lang.String str2 = g0Var.f555879a;
            if (str2 != null && str2.equals(str) && g0Var.f555880b == i17) {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "removeVideoStream " + str + ", stream " + i17 + ", size " + arrayList.size());
                return;
            }
        }
    }

    public final void r(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "stopCustomRender userId: " + str);
        p(str);
        go0.q1 q1Var = (go0.q1) this.f555839j.remove(str);
        if (q1Var != null) {
            q1Var.c(new go0.k1(q1Var));
        }
        boolean q17 = fn0.g.f345728a.q();
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = this.f555831b;
        if (!q17) {
            abstractC26786xbe57dcc8.mo30410x8675ce9d(str);
        } else {
            if (str.equals(this.f555835f)) {
                return;
            }
            abstractC26786xbe57dcc8.mo30411xb8f95dad(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e2, code lost:
    
        if (r1.d().f536976s == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012c, code lost:
    
        r5 = r3;
        r9 = 160;
        r6 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0125, code lost:
    
        r5 = r3;
        r6 = 160;
        r9 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0123, code lost:
    
        if (r1.d().f536976s == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.a0.s():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x09c3, code lost:
    
        if (r4.size() <= 1) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x025e, code lost:
    
        if (r2.c().f536974q == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x027b, code lost:
    
        r9 = r21;
        r17 = 640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0276, code lost:
    
        r17 = r21;
        r9 = 640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x026b, code lost:
    
        if (r2.c().f536974q == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0291, code lost:
    
        r17 = r9;
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x028e, code lost:
    
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0274, code lost:
    
        if (r2.c().f536974q == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x028c, code lost:
    
        if (r8 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        if (r8 != false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0957 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x096e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x056e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(boolean r37) {
        /*
            Method dump skipped, instructions count: 2600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.a0.t(boolean):void");
    }

    public org.json.JSONObject u(int i17, int i18, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser) {
        java.lang.Object obj;
        int i19 = this.f555849t;
        if (i19 == 2) {
            if (f(zn0.x.f555947a.f555948a, this.f555848s) == null) {
                this.f555848s = this.f555834e;
            }
            return this.f555845p.m(this.f555838i, i17, i18, config, mixUser);
        }
        if (i19 == 3) {
            return this.f555845p.l(this.f555838i, i17, i18, config, mixUser);
        }
        zn0.i iVar = this.f555845p;
        org.json.JSONObject jSONObject = null;
        if (i19 == 4) {
            zn0.y yVar = zn0.x.f555947a;
            if (f(yVar.f555948a, this.f555848s) == null) {
                this.f555848s = this.f555834e;
            }
            java.lang.String selfRoomId = this.f555838i;
            iVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
            java.util.ArrayList arrayList = yVar.f555948a;
            if (arrayList == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            } else {
                iVar.b();
                int size = arrayList.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micGrabModeFillConfig videoHeight: " + i18 + " videoWidth: " + i17 + " size: " + size + " list: " + arrayList);
                config.f57158x9f1bbe0b = i17;
                float f17 = (float) i17;
                int b17 = a06.d.b(f17 / 1.125f);
                config.f57156x2a8d0982 = b17;
                config.f57148x4d0b70cd = "111302";
                java.util.LinkedList linkedList = new java.util.LinkedList();
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                tRTCMixUser.f57072xd4bdd2f4 = 1;
                tRTCMixUser.f297232x = 0;
                tRTCMixUser.f297233y = 0;
                tRTCMixUser.f57071x6be2dc6 = a06.d.b(2 * 0.25f * f17);
                float f18 = b17;
                tRTCMixUser.f57062xb7389127 = a06.d.b(4 * 0.25f * f18);
                linkedList.add(tRTCMixUser);
                for (int i27 = 0; i27 < 8; i27++) {
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser2 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                    tRTCMixUser2.f57072xd4bdd2f4 = i27 + 2;
                    tRTCMixUser2.f297232x = a06.d.b((((i27 % 2) * 0.25f) + 0.5f) * f17);
                    tRTCMixUser2.f297233y = a06.d.b((i27 / 2) * 0.25f * f18);
                    tRTCMixUser2.f57071x6be2dc6 = a06.d.b(0.25f * f17);
                    tRTCMixUser2.f57062xb7389127 = a06.d.b(0.25f * f18);
                    linkedList.add(tRTCMixUser2);
                }
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((zn0.v) obj).f555946n == 1) {
                        break;
                    }
                }
                zn0.v vVar = (zn0.v) obj;
                zn0.f fVar = new zn0.f(linkedList, mixUser, iVar);
                if (vVar == null) {
                    fVar.mo146xb9724478(0);
                    zn0.y yVar2 = zn0.x.f555947a;
                    yVar2.f555949b = 1;
                    yVar2.f555950c = size;
                } else {
                    fVar.mo146xb9724478(java.lang.Integer.valueOf(zn0.x.f555947a.f555949b - 1));
                }
                java.util.Iterator it6 = arrayList.iterator();
                int i28 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    zn0.v vVar2 = (zn0.v) next;
                    vVar2.f555944i = selfRoomId;
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser3 = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) kz5.n0.a0(linkedList, vVar2.f555946n - 1);
                    if (tRTCMixUser3 != null) {
                        java.lang.String str = vVar2.f555939d;
                        tRTCMixUser3.f57070xce2b2e46 = str;
                        tRTCMixUser3.f57069xb8c992da = vVar2.f555940e;
                        tRTCMixUser3.f57065x968497be = true;
                        zn0.g0 i37 = iVar.f555885b.i(str, 0);
                        if (i37 != null) {
                            tRTCMixUser3.f57065x968497be = i37.f555881c;
                        }
                        config.f57150xbef7910c.add(tRTCMixUser3);
                    }
                    i28 = i29;
                }
                jSONObject = iVar.n(selfRoomId, config, linkedList);
            }
        } else {
            if (i19 == 5) {
                java.lang.String selfRoomId2 = this.f555838i;
                iVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId2, "selfRoomId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
                org.json.JSONObject l17 = iVar.l(selfRoomId2, i17, i18, config, mixUser);
                config.f57148x4d0b70cd = "228076";
                return l17;
            }
            if (i19 != 6) {
                if (i19 == 9) {
                    return this.f555845p.k(this.f555838i, i17, i18, config, mixUser, false);
                }
                if (i19 != 10) {
                    return l(i17, i18, config, mixUser);
                }
                if (f(zn0.x.f555947a.f555948a, this.f555848s) == null) {
                    this.f555848s = this.f555834e;
                }
                return this.f555845p.k(this.f555838i, i17, i18, config, mixUser, true);
            }
            java.lang.String selfRoomId3 = this.f555838i;
            iVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId3, "selfRoomId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
            java.util.ArrayList arrayList2 = zn0.x.f555947a.f555948a;
            if (arrayList2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            } else {
                int size2 = arrayList2.size();
                iVar.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micGrabModeFillConfig videoHeight: " + i18 + " videoWidth: " + i17 + " size: " + size2 + " remoteUserConfigList: " + arrayList2);
                config.f57158x9f1bbe0b = i17;
                float f19 = (float) i17;
                int b18 = a06.d.b(f19 / 1.0263158f);
                config.f57156x2a8d0982 = b18;
                config.f57148x4d0b70cd = "228078";
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser4 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                int b19 = a06.d.b(0.25f * f19);
                tRTCMixUser4.f57071x6be2dc6 = b19;
                int b27 = a06.d.b(b19 / 1.1079545f);
                tRTCMixUser4.f57062xb7389127 = b27;
                tRTCMixUser4.f57072xd4bdd2f4 = 1;
                tRTCMixUser4.f297232x = (i17 - tRTCMixUser4.f57071x6be2dc6) / 2;
                tRTCMixUser4.f297233y = 0;
                linkedList2.add(tRTCMixUser4);
                float f27 = b18;
                float f28 = b27 + (0.08421053f * f27);
                int b28 = a06.d.b((f27 - f28) / 2.0f);
                int b29 = a06.d.b(f19 / 4.0f);
                int i38 = 1;
                for (int i39 = 9; i38 < i39; i39 = 9) {
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser5 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
                    int i47 = i38 + 1;
                    tRTCMixUser5.f57072xd4bdd2f4 = i47;
                    int i48 = i38 - 1;
                    tRTCMixUser5.f297232x = a06.d.b((i48 % 4) * b29);
                    tRTCMixUser5.f297233y = a06.d.b(((i48 / 4) * b28) + f28);
                    tRTCMixUser5.f57071x6be2dc6 = b29;
                    tRTCMixUser5.f57062xb7389127 = b28;
                    linkedList2.add(tRTCMixUser5);
                    i38 = i47;
                }
                mixUser.f297232x = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f297232x;
                mixUser.f297233y = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f297233y;
                mixUser.f57071x6be2dc6 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f57071x6be2dc6;
                mixUser.f57062xb7389127 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f57062xb7389127;
                ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f57070xce2b2e46 = iVar.f555887d;
                ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList2.get(0)).f57072xd4bdd2f4 = 1;
                java.util.Iterator it7 = arrayList2.iterator();
                int i49 = 0;
                while (it7.hasNext()) {
                    java.lang.Object next2 = it7.next();
                    int i57 = i49 + 1;
                    if (i49 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    zn0.v vVar3 = (zn0.v) next2;
                    vVar3.f555944i = selfRoomId3;
                    com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser6 = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) kz5.n0.a0(linkedList2, vVar3.f555946n - 1);
                    if (tRTCMixUser6 != null) {
                        java.lang.String str2 = vVar3.f555939d;
                        tRTCMixUser6.f57070xce2b2e46 = str2;
                        tRTCMixUser6.f57069xb8c992da = vVar3.f555940e;
                        tRTCMixUser6.f57065x968497be = true;
                        zn0.g0 i58 = iVar.f555885b.i(str2, 0);
                        if (i58 != null) {
                            tRTCMixUser6.f57065x968497be = i58.f555881c;
                        }
                        config.f57150xbef7910c.add(tRTCMixUser6);
                    }
                    i49 = i57;
                }
                zn0.y yVar3 = zn0.x.f555947a;
                yVar3.f555949b = 1;
                yVar3.f555950c = size2;
                jSONObject = iVar.n(selfRoomId3, config, linkedList2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig r17) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.a0.v(com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig):void");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 f220914a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f220915b;

    public static boolean a() {
        if (e() == null) {
            s();
            return false;
        }
        m53.e6 e6Var = f220914a.f36968x9bdea75f;
        if (e6Var != null) {
            return e6Var.f405194d;
        }
        return false;
    }

    public static m53.t b() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f220914a.f36953x667aec42;
        if (l1Var != null) {
            return l1Var.f405399n;
        }
        return null;
    }

    public static java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.d() + "globalconfig";
    }

    public static org.json.JSONArray d() {
        m53.r0 r0Var;
        java.util.LinkedList linkedList;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (e() != null) {
            r0Var = f220914a.f36949x46798945;
        } else {
            s();
            r0Var = null;
        }
        if (r0Var != null && (linkedList = r0Var.f405532d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                m53.e eVar = (m53.e) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("appId", eVar.f405170d);
                    jSONObject.put("gameName", eVar.f405171e);
                    jSONObject.put("albumName", eVar.f405172f);
                    jSONObject.put("defaultTitle", eVar.f405173g);
                } catch (org.json.JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 e() {
        if (!f220915b) {
            s();
        }
        return f220914a;
    }

    public static m53.v0 f() {
        e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 == null) {
            s();
            return null;
        }
        m53.v0 v0Var = c15936xa915f9d1.f36950x1e4f5dcd;
        if (v0Var == null) {
            return v0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", java.lang.Integer.valueOf(v0Var.f405649d), v0Var.f405650e);
        return v0Var;
    }

    public static m53.e1 g() {
        e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 == null) {
            s();
            return null;
        }
        m53.e1 e1Var = c15936xa915f9d1.f36952x8379d650;
        if (e1Var == null) {
            return e1Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", java.lang.Integer.valueOf(e1Var.f405175d), e1Var.f405176e);
        return e1Var;
    }

    public static m53.m h() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f220914a.f36953x667aec42;
        if (l1Var != null) {
            return l1Var.f405397i;
        }
        return null;
    }

    public static m53.l1 i() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f220914a.f36953x667aec42;
        if (l1Var != null) {
            return l1Var;
        }
        return null;
    }

    public static m53.a4 j() {
        if (e() != null) {
            m53.a4 a4Var = f220914a.f36961x4fd0bba1;
            if (a4Var != null) {
                return a4Var;
            }
        } else {
            s();
        }
        m53.a4 a4Var2 = new m53.a4();
        a4Var2.f405093d = 12;
        a4Var2.f405095f = 7200;
        a4Var2.f405097h = 0;
        a4Var2.f405094e = 300;
        a4Var2.f405096g = null;
        return a4Var2;
    }

    public static m53.q0 k() {
        e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 == null) {
            s();
            return null;
        }
        m53.q0 q0Var = c15936xa915f9d1.f36948x98bcc762;
        if (q0Var != null) {
            return q0Var;
        }
        return null;
    }

    public static m53.v3 l() {
        if (e() != null) {
            return f220914a.f36959x6e180273;
        }
        s();
        return null;
    }

    public static m53.b4 m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 != null) {
            m53.b4 b4Var = c15936xa915f9d1.f36962x7f01ea5f;
            if (b4Var != null) {
                return b4Var;
            }
        } else {
            s();
        }
        return null;
    }

    public static m53.c4 n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 != null) {
            m53.c4 c4Var = c15936xa915f9d1.f36963xf4ae0ad3;
            if (c4Var != null) {
                return c4Var;
            }
        } else {
            s();
        }
        return null;
    }

    public static boolean o() {
        boolean equalsIgnoreCase;
        e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = f220914a;
        if (c15936xa915f9d1 != null) {
            equalsIgnoreCase = c15936xa915f9d1.f36965x5a2dd0f3;
        } else {
            s();
            java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", o17);
            java.lang.String str = "zh_CN".equals(o17) ? "0" : "1";
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("HideGameCenter");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (d17 != null) {
                str = d17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "hide game center:[%s]", str);
            equalsIgnoreCase = str.equalsIgnoreCase("0");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getShowEntrance : " + equalsIgnoreCase);
        return equalsIgnoreCase;
    }

    public static m53.i5 p() {
        if (e() == null) {
            s();
            return null;
        }
        m53.i5 i5Var = f220914a.f36966x8b213390;
        if (i5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getStatusBarStyle color:%s, darkModeColor:%s, style:%s", i5Var.f405328d, i5Var.f405330f, i5Var.f405329e);
        }
        return f220914a.f36966x8b213390;
    }

    public static int q() {
        if (e() == null) {
            s();
            return 3600;
        }
        m53.d6 d6Var = f220914a.f36967x69a17b24;
        if (d6Var != null) {
            return d6Var.f405169d;
        }
        return 3600;
    }

    public static java.lang.Boolean r() {
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
        if (!((c01.z1.h() & 2048) != 2048)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "GameReddot dont show reddot! ReddotService interrupt");
            return java.lang.Boolean.TRUE;
        }
        m53.a4 j17 = j();
        if (j17 != null && j17.f405096g != null) {
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            m53.i0 i0Var = j17.f405096g;
            if (i17 >= i0Var.f405307d && i17 <= i0Var.f405308e) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void s() {
        /*
            java.lang.String r0 = "parseConfigFile, cost: "
            java.lang.String r1 = "parseGlobalConfig: gameConfigResp.parseFrom"
            java.lang.String r2 = "parseGlobalConfig: "
            java.lang.String r3 = "parseGlobalConfig: "
            java.lang.Class<com.tencent.mm.plugin.game.commlib.i> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.class
            monitor-enter(r4)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a     // Catch: java.lang.Throwable -> Lc6
            if (r5 == 0) goto L11
            monitor-exit(r4)
            return
        L11:
            r5 = 1
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220915b = r5     // Catch: java.lang.Throwable -> Lc6
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc6
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = c()     // Catch: java.lang.Throwable -> Lc6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc6
            boolean r8 = r7.m()     // Catch: java.lang.Throwable -> Lc6
            if (r8 != 0) goto L29
            monitor-exit(r4)
            return
        L29:
            r8 = 0
            com.tencent.mm.vfs.u6 r9 = new com.tencent.mm.vfs.u6     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            long r10 = r7.C()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            byte[] r8 = new byte[r10]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r9.read(r8)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r9.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> Lc6
            goto L66
        L3d:
            r0 = move-exception
            r8 = r9
            goto Lc0
        L41:
            r10 = move-exception
            r13 = r9
            r9 = r8
            r8 = r13
            goto L4b
        L46:
            r0 = move-exception
            goto Lc0
        L49:
            r10 = move-exception
            r9 = r8
        L4b:
            java.lang.String r11 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r10.getMessage()     // Catch: java.lang.Throwable -> L46
            r12.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r12.toString()     // Catch: java.lang.Throwable -> L46
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r11, r3)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L65
            r8.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> Lc6
        L65:
            r8 = r9
        L66:
            if (r8 != 0) goto L6a
            monitor-exit(r4)
            return
        L6a:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = new com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            r3.<init>()     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a = r3     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            r3.mo11468x92b714fd(r8)     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            goto La8
        L75:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc6
            r8.append(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Lc6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1)     // Catch: java.lang.Throwable -> Lc6
            r7.l()     // Catch: java.lang.Throwable -> Lc6
            goto La8
        L8f:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc6
            r8.append(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Lc6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1)     // Catch: java.lang.Throwable -> Lc6
            r7.l()     // Catch: java.lang.Throwable -> Lc6
        La8:
            java.lang.String r1 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc6
            long r7 = r7 - r5
            r2.append(r7)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return
        Lc0:
            if (r8 == 0) goto Lc5
            r8.close()     // Catch: java.io.IOException -> Lc5 java.lang.Throwable -> Lc6
        Lc5:
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s():void");
    }
}

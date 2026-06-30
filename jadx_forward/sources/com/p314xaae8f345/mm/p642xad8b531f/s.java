package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p642xad8b531f.s f145094g;

    /* renamed from: a, reason: collision with root package name */
    public int f145095a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f145096b = {"_id", "key", "type", "value"};

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.concurrent.Future f145097c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.util.concurrent.Future f145098d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f145099e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145100f;

    public s(android.content.Context context) {
        this.f145097c = null;
        this.f145098d = null;
        this.f145099e = context;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p642xad8b531f.p pVar = new com.p314xaae8f345.mm.p642xad8b531f.p(this, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f145097c = t0Var.x(pVar, 0L, "DebuggerInit");
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p642xad8b531f.q qVar = new com.p314xaae8f345.mm.p642xad8b531f.q(this);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        this.f145098d = t0Var2.x(qVar, 0L, "DebuggerInit");
        z65.c.f551995h = new com.p314xaae8f345.mm.p642xad8b531f.r(this);
    }

    public static com.p314xaae8f345.mm.p642xad8b531f.s b(android.content.Context context) {
        if (f145094g == null) {
            f145094g = new com.p314xaae8f345.mm.p642xad8b531f.s(context);
        }
        return f145094g;
    }

    public java.lang.Boolean a(java.lang.String str) {
        java.lang.Object obj;
        try {
            if (this.f145097c.get() != null && (obj = ((java.util.Map) this.f145098d.get()).get(str)) != null && (obj instanceof java.lang.Boolean)) {
                obj.toString();
                return (java.lang.Boolean) obj;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public java.lang.Integer c(java.lang.String str) {
        if (this.f145097c.get() == null) {
            return null;
        }
        java.lang.Object obj = ((java.util.Map) this.f145098d.get()).get(str);
        if (obj instanceof java.lang.Integer) {
            java.util.Objects.toString(obj);
            return (java.lang.Integer) obj;
        }
        return null;
    }

    public java.lang.String d(java.lang.String str) {
        if (this.f145097c.get() == null) {
            return null;
        }
        java.lang.Object obj = ((java.util.Map) this.f145098d.get()).get(str);
        if (obj instanceof java.lang.String) {
            java.util.Objects.toString(obj);
            return (java.lang.String) obj;
        }
        return null;
    }

    public void e(java.lang.String str) {
        java.lang.String d17;
        int c17 = c(".com.tencent.mm.debug.log.level");
        boolean z17 = true;
        boolean z18 = (this.f145099e.getApplicationInfo().flags & 2) != 0;
        if (c17 == null && z18) {
            c17 = 1;
        }
        java.lang.Integer num = c17;
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a(".com.tencent.mm.debug.log.append_mode"), true);
        boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a(".com.tencent.mm.debug.test.uploadLog"), z18);
        if (m18 && (d17 = d(".com.tencent.mm.debug.log.tag.skey")) != null && d17.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c.f19753xb41b214c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.p2(d17);
        }
        boolean l17 = "MM".equalsIgnoreCase(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.l() : false;
        java.lang.String.format("toolsLevel:%s appendIsSync:%s isLogcatOpen:%s isDebug:%s", num, java.lang.Boolean.valueOf(m17), java.lang.Boolean.valueOf(m18), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.m83864xb2ac238f(!l17, com.p314xaae8f345.mm.p2621x8fb0427b.x3.f277857a, lp0.b.g0(), num, java.lang.Boolean.valueOf(m17), java.lang.Boolean.valueOf(m18), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40544x534d5c42(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016(), true);
        java.lang.String d18 = d(".com.tencent.mm.debug.monkeyEnv");
        if (d18 == null) {
            d18 = "0";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d18, 0) == 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c = c(".com.tencent.mm.debug.log.level") != null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a(".com.tencent.mm.debug.blockReleasedPatch"), false)) {
            z17 = false;
        }
        z65.c.f551992e = z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274509d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a(".com.tencent.mm.debug.server.993_wxpay.used"), false);
    }

    public void f(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Debugger", "setupDebugIp IDC:%s", str);
        try {
            bm5.o1 o1Var = bm5.o1.f104252a;
            if (o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20116x20cdb068()) == 1) {
                java.lang.String l17 = o1Var.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20121x501eb805());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Debugger", "proxyValueStr:%s", l17);
                java.lang.String[] a17 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20121x501eb805.f273743a.a(l17, str);
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().l0(a17[0], a17[1], a17[2], a17[3]);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".com.tencent.mm.debug.server.host.http");
            java.lang.String str4 = "";
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : "." + str);
            java.lang.String d18 = d(sb6.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d18)) {
                d18 = d(".com.tencent.mm.debug.server.host.http");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".com.tencent.mm.debug.server.ports.http");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : "." + str);
            java.lang.String d19 = d(sb7.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d19)) {
                d19 = d(".com.tencent.mm.debug.server.ports.http");
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".com.tencent.mm.debug.server.host.socket");
            sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : "." + str);
            java.lang.String d27 = d(sb8.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d27)) {
                d27 = d(".com.tencent.mm.debug.server.host.socket");
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(".com.tencent.mm.debug.server.ports.socket");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str4 = "." + str;
            }
            sb9.append(str4);
            java.lang.String d28 = d(sb9.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d28)) {
                d28 = d(".com.tencent.mm.debug.server.ports.socket");
            }
            java.lang.String str5 = d28;
            java.lang.String d29 = d(".com.tencent.mm.debug.server.host.mini_program");
            java.lang.Integer c17 = c(".com.tencent.mm.debug.server.ports.mini_program");
            int intValue = c17 != null ? c17.intValue() : 0;
            java.lang.String d37 = d(".com.tencent.mm.debug.server.host.h5");
            java.lang.Integer c18 = c(".com.tencent.mm.debug.server.ports.h5");
            int intValue2 = c18 != null ? c18.intValue() : 0;
            java.lang.String str6 = null;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("weixin_mini_program_debug_info", 2, null);
                if (N != null) {
                    N.putString("weixin_mini_program_debug_host", d29);
                    N.putInt("weixin_mini_program_debug_port", intValue);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Debugger", "save mini program debug info");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Debugger", "mmkv is null,mmkvName:%s", "weixin_mini_program_debug_info");
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("weixin_h5_debug_info", 2, null);
                if (N2 != null) {
                    N2.putString("weixin_h5_debug_host", d37);
                    N2.putInt("weixin_h5_debug_port", intValue2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Debugger", "mmkv is null,mmkvName:%s", "weixin_h5_debug_info");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Debugger", e17, "get mmkv fail Exception", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().l0(d18, d19, d27, str5);
            java.lang.String d38 = d(".com.tencent.mm.debug.server.wallet.host");
            java.lang.String d39 = d(".com.tencent.mm.debug.server.wallet.host.multi");
            java.lang.String d47 = d(".com.tencent.mm.debug.server.wallet.ip");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d39) || !d39.contains("|")) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k0(d38, d47);
            } else {
                java.lang.String[] split = d39.split("\\|");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(split) && split.length > 0) {
                    for (java.lang.String str7 : split) {
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k0(str7, d47);
                    }
                }
            }
            java.lang.String d48 = d(".com.tencent.mm.debug.server.host.newdns");
            if (d48 == null || !d48.contains("@")) {
                if (d48 != null && d48.contains(":")) {
                    java.lang.String[] split2 = d48.split(":");
                    str2 = split2[0];
                    str3 = split2[1];
                }
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().r0(d48, str6);
                d17 = d(".com.tencent.mm.debug.server.host.pay_newdns");
                if (d17 == null && d17.contains("@")) {
                    java.lang.String[] split3 = d17.split("@");
                    if (split3.length == 3) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("general", split3[0]);
                        hashMap.put("domestic", split3[1]);
                        hashMap.put("oversea", split3[2]);
                        com.p314xaae8f345.mm.p971x6de15a2e.g1 c19 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
                        c19.getClass();
                        if (hashMap.size() == 0) {
                            return;
                        }
                        new com.p314xaae8f345.mm.p971x6de15a2e.p1(c19, 1000L, null, hashMap, false).a(c19.f153532t);
                        return;
                    }
                    return;
                }
            }
            java.lang.String[] split4 = d48.split("@");
            str2 = split4[0];
            str3 = split4[1];
            str6 = str3;
            d48 = str2;
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().r0(d48, str6);
            d17 = d(".com.tencent.mm.debug.server.host.pay_newdns");
            if (d17 == null) {
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Debugger", e18, "setupDebugIp fail. %s", e18.toString());
        }
    }
}

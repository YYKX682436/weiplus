package uh1;

/* loaded from: classes7.dex */
public abstract class f1 {
    public static boolean a() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a();
    }

    public static uh1.e1 b(java.util.Map map, java.lang.String str) {
        uh1.e1 e1Var = new uh1.e1();
        java.util.HashMap hashMap = null;
        try {
            if (a()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("weixin_mini_program_debug_info", 2, null);
                if (N != null) {
                    e1Var.f509314a = N.getString("weixin_mini_program_debug_host", "");
                    e1Var.f509315b = N.getInt("weixin_mini_program_debug_port", 0);
                    if (str != null && !str.isEmpty()) {
                        e1Var.f509316c = new java.net.URL(str).getHost();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, mmkvName:%s, customIp:%s, customPort:%d", "weixin_mini_program_debug_info", e1Var.f509314a, java.lang.Integer.valueOf(e1Var.f509315b));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, mmkv is null, mmkvName:%s", "weixin_mini_program_debug_info");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, not debug environment");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, exception", e17);
        }
        if (map != null) {
            if (a()) {
                try {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (context == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, MMApplicationContext.getContext() get a null context!");
                    } else {
                        int i17 = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("pay_uat_test_environment_id", 0);
                        if (i17 != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, testId: %d", java.lang.Integer.valueOf(i17));
                            r45.fg7 fg7Var = new r45.fg7();
                            fg7Var.f455859d = i17;
                            byte[] mo14344x5f01b1f6 = fg7Var.mo14344x5f01b1f6();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, info byte array length: %d", java.lang.Integer.valueOf(mo14344x5f01b1f6.length));
                            r45.ch4 ch4Var = new r45.ch4();
                            ch4Var.f453086d = "WXPAY_TEST_ENV_INFO";
                            ch4Var.f453087e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, item: %s", ch4Var.mo12245xcc313de3());
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(ch4Var);
                            r45.ah4 ah4Var = new r45.ah4();
                            ah4Var.f451545e = 0;
                            ah4Var.f451544d = linkedList;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, header: %s", ah4Var.mo12245xcc313de3());
                            java.lang.String encodeToString = android.util.Base64.encodeToString(ah4Var.mo14344x5f01b1f6(), 2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, base64String: %s", encodeToString);
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            hashMap2.put("Wxp-Test", encodeToString);
                            hashMap2.put("Wxp-Test-environmentId", java.lang.String.valueOf(i17));
                            hashMap = hashMap2;
                        }
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, exception", e18);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, not debug environment");
            }
            if (hashMap != null) {
                e1Var.f509317d = hashMap;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugProxyUtils", "setMiniProgramDebugProxy, Wxp-Test:%s, Wxp-Test-environmentId:%s", hashMap.get("Wxp-Test"), e1Var.f509317d.get("Wxp-Test-environmentId"));
            }
        }
        return e1Var;
    }
}

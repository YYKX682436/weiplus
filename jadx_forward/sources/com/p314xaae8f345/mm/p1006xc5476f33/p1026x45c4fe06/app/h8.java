package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class h8 implements q25.a {
    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59 c11577xd02dca59) {
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a()) {
            return true;
        }
        if (!"//enable_appbrand_monkey_test".equals(strArr[0])) {
            if ("//disable_appbrand_monkey_test".equals(strArr[0])) {
                bm5.p1 p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159115b;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ENABLE_APPBRAND_DEBUGGER");
                M.getClass();
                M.putBoolean("ENABLE_APPBRAND_DEBUGGER", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d = false;
            }
            return true;
        }
        bm5.p1 p1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159115b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ENABLE_APPBRAND_DEBUGGER");
        M2.getClass();
        M2.putBoolean("ENABLE_APPBRAND_DEBUGGER", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11846xc90653fd c11846xc90653fd = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f.f159273a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(new android.content.Intent().setAction("com.tencent.mm.appbrand.debugger.appbrand_process_reload_configs"));
        return true;
    }
}

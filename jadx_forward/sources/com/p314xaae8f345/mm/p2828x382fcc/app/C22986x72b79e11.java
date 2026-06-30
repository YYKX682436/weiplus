package com.p314xaae8f345.mm.p2828x382fcc.app;

/* renamed from: com.tencent.mm.xlog.app.XLogSetup */
/* loaded from: classes12.dex */
public class C22986x72b79e11 {

    /* renamed from: appendIsSync */
    public static java.lang.Boolean f39990x3d3d769f;

    /* renamed from: cachePath */
    public static java.lang.String f39991xdefef6c7;

    /* renamed from: isLogcatOpen */
    public static java.lang.Boolean f39993xc6c32446;

    /* renamed from: logPath */
    public static java.lang.String f39994x145c3989;

    /* renamed from: nameprefix */
    public static java.lang.String f39995x4c6d8dd;

    /* renamed from: setup */
    private static boolean f39996x6843a7d;

    /* renamed from: toolsLevel */
    public static java.lang.Integer f39997x1f52d269;

    /* renamed from: xlog */
    public static com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c f39998x382fcc = new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c();

    /* renamed from: hasInit */
    public static boolean f39992x29858eca = false;

    /* renamed from: keep_setupXLog */
    public static void m83864xb2ac238f(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3) {
        if (!f39992x29858eca) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40120x6c4ebec7(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295());
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.m40029xe9f5beed(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40102xb2516f8a(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4555x3339adb8());
            ((ku5.t0) ku5.t0.f394148d).a(new vq5.RunnableC30660x2ca3e0());
            f39992x29858eca = true;
        }
        f39991xdefef6c7 = str;
        f39994x145c3989 = str2;
        f39997x1f52d269 = num;
        f39990x3d3d769f = bool;
        f39993xc6c32446 = bool2;
        f39995x4c6d8dd = str3;
        if (z17 && !f39996x6843a7d) {
            f39996x6843a7d = true;
            fp.d0.o("wechatxlog");
            fp.d0.o(com.p314xaae8f345.p542x3306d5.C4436xdd79435b.f17577xd7c16926);
            f39998x382fcc.mo40562x97568359(0L, f39993xc6c32446.booleanValue());
            if (f39997x1f52d269 == null) {
                f39998x382fcc.mo40547x6cf51c31(2, 0, f39991xdefef6c7, f39994x145c3989, f39995x4c6d8dd, 3);
                f39998x382fcc.mo40563xc4d409b8(0L, 345600L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40590xade5069b();
            } else {
                f39998x382fcc.mo40547x6cf51c31(f39997x1f52d269.intValue(), bool.booleanValue() ? 1 : 0, f39991xdefef6c7, f39994x145c3989, f39995x4c6d8dd, 0);
                f39998x382fcc.mo40563xc4d409b8(0L, 604800L);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.j(f39998x382fcc);
            java.util.Set set = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.f274426i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKV", "reset handler");
            com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m84016x20979327(com.p314xaae8f345.mm.sdk.p2603x2137b148.n4.f274403a);
            jz5.g gVar = up.g.f511293a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274656s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "skip initialize because cso is not enabled");
                return;
            }
            java.lang.String mapLibraryName = java.lang.System.mapLibraryName("wechatxlog");
            com.p314xaae8f345.mm.cso.log.C10428x78dce0e5.m43627xc7433b10(mapLibraryName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "pending xlog engine " + mapLibraryName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$keep_setupXLog$0 */
    public static void m83865x30968b98() {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.m40107x316510(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    /* renamed from: realSetupXlog */
    public static void m83866x8d670feb() {
        m83864xb2ac238f(true, f39991xdefef6c7, f39994x145c3989, f39997x1f52d269, f39990x3d3d769f, f39993xc6c32446, f39995x4c6d8dd);
    }
}

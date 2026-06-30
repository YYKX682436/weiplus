package com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7;

@j95.b
/* renamed from: com.tencent.mm.plugin.sandbox.SubCoreSandBox */
/* loaded from: classes11.dex */
public class C17257xe7367bc8 extends i95.w implements mi3.f {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f240142d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f240143e;

    public mi3.e Ai(android.content.Context context, int i17, android.content.DialogInterface.OnCancelListener onCancelListener, boolean z17) {
        int i18 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.f273855o;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()).commit();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(34);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "show update dialog");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9 = (com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d2v, null);
        c20973x553f78a9.c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(context, "", true, 0, null);
        c17.setCancelable(true);
        c17.setOnCancelListener(new s65.q0(c20973x553f78a9, onCancelListener));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 48L, 1L, true);
        c20973x553f78a9.f273857e = c17;
        c20973x553f78a9.f273858f = false;
        return c20973x553f78a9;
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        com.p314xaae8f345.mm.app.p4.a(10);
        if (context == null || intent == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:mm");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 0L, 1L, true);
            intent.putExtra("exceptionProcess", "mm");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:push");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 1L, 1L, true);
            intent.putExtra("exceptionProcess", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:other");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 2L, 1L, true);
            intent.putExtra("exceptionProcess", "other");
        }
        boolean booleanExtra = intent.getBooleanExtra("use_bugreporter", false);
        java.lang.String str2 = "";
        if (booleanExtra) {
            java.lang.String str3 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.f273835a;
            try {
                java.lang.String stringExtra = intent.getStringExtra("tag");
                str = stringExtra != null ? stringExtra : "exception";
                str2 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.f273835a + intent.getStringExtra("userName") + "." + str + "." + java.lang.System.currentTimeMillis() + ".preventcrashlog";
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBugReporter", e17, "", new java.lang.Object[0]);
            }
        } else {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.f273824a;
            try {
                java.lang.String stringExtra2 = intent.getStringExtra("tag");
                str = stringExtra2 != null ? stringExtra2 : "exception";
                str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "crashprevent/" + intent.getStringExtra("userName") + "." + str + "." + c01.id.a() + ".crashlog";
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CrashUpload", e18, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() crashPreventPath:%s", str2);
        intent.putExtra("exceptionPreventPath", str2);
        try {
            intent.setClass(context, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.ServiceC20968xae44060a.class);
            com.p314xaae8f345.mm.app.p4.a(11);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(intent);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() %s %s", e19.getClass().getSimpleName(), e19.getMessage());
            intent.setClass(context, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20966x1e44bee5.class);
            com.p314xaae8f345.mm.app.p4.a(12);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
        if (intent.getBooleanExtra("exceptionJava", false)) {
            if (booleanExtra) {
                com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.d(intent, str2);
            } else {
                com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.e(intent, str2);
            }
        }
    }

    public void wi(boolean z17) {
        f240142d = true;
        f240143e = z17;
    }
}

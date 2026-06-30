package com.tencent.mm.booter;

/* loaded from: classes5.dex */
public abstract class o {
    public static com.tencent.mm.sdk.platformtools.o4 a() {
        return com.tencent.mm.sdk.platformtools.o4.M("service_launch_way");
    }

    public static boolean b(android.content.Context context) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return f(context);
    }

    public static boolean c() {
        if (!fp.h.c(26) || !u75.b.d()) {
            return true;
        }
        java.lang.String lowerCase = wo.w0.m().toLowerCase();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "model:%s startServiceHuaweiInfo:%s", lowerCase, "ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH");
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0("ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH")) {
                return false;
            }
            for (java.lang.String str : "ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH".split(",")) {
                if (lowerCase.startsWith(str.toLowerCase())) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "startServiceHuaweiInfo Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    public static boolean d() {
        ?? r37 = -1;
        if (fp.h.c(26) && u75.b.d()) {
            boolean a17 = u75.a.f425176a.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() isHonor:%s", java.lang.Boolean.valueOf(a17));
            int i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("service_launch_way", 4).getInt("huawei_switch", -1);
            int i18 = i17;
            if (i17 == -1) {
                i18 = c();
            }
            boolean startsWith = u75.b.a().startsWith("emotionui_1");
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() isHonor:%s huaweiEnable:%s isNotBelowEmui10:%s", java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(startsWith));
            if (startsWith || a17) {
                return false;
            }
            if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() true (huawei)");
                return true;
            }
        }
        if (fp.h.c(26)) {
            com.tencent.mm.sdk.platformtools.o4 a18 = a();
            if (a18.contains("target26_start_service")) {
                boolean z17 = a18.getBoolean("target26_start_service", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifTarget26StartService() result:%s", java.lang.Boolean.valueOf(z17));
                r37 = z17;
            }
            if (r37 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() true");
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() false");
        return false;
    }

    public static void e() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent className = new android.content.Intent().setClassName(context, "com.tencent.mm.pluginsdk.permission.PermissionActivity");
        className.setFlags(268435456);
        className.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/booter/CoreServiceUtil", "ignoreBatteryOptimizations", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/booter/CoreServiceUtil", "ignoreBatteryOptimizations", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ignoreBatteryOptimizations()");
    }

    public static boolean f(android.content.Context context) {
        boolean isIgnoringBatteryOptimizations = ((android.os.PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "isIgnoringBatteryOptimizations() result=%s", java.lang.Boolean.valueOf(isIgnoringBatteryOptimizations));
        return isIgnoringBatteryOptimizations;
    }

    public static void g() {
        int i17;
        try {
            java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
            if (u75.a.f425176a.a()) {
                i17 = 46;
            } else {
                if (!lowerCase.contains("xiaomi") && !lowerCase.contains("redmi")) {
                    if (!lowerCase.contains("huawei") && !lowerCase.contains("honor")) {
                        i17 = lowerCase.contains("vivo") ? 43 : lowerCase.contains("oppo") ? 42 : lowerCase.contains("samsung") ? 44 : 45;
                    }
                    i17 = 40;
                }
                i17 = 41;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(954L, i17, 1L, false);
            fVar.d(20661, 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CoreServiceUtil", th6, "", new java.lang.Object[0]);
        }
    }

    public static void h(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = a();
        a17.getClass();
        a17.putBoolean("target26_start_service", z17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "setTarget26StartService() enable: %s", java.lang.Boolean.valueOf(z17));
    }
}

package g03;

/* loaded from: classes11.dex */
public class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f348974d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flutter.FlutterCrashReportPlugin", "onAttachedToEngine FlutterCrashReportPlugin CHANNEL%s", "com.tencent.mm.flutter.crashreport");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.mm.flutter.crashreport");
        this.f348974d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f348974d.m138441xdf757329(null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L;
        java.lang.String string;
        java.lang.Object obj2;
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        if (str.equals("crash_report")) {
            java.util.Map map = (java.util.Map) c28687x4bb242ff.m138433xa13f5ebd("crashInfo");
            java.lang.String str2 = (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            boolean booleanValue = ((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("killSelf")).booleanValue();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("\n#deviceParameters=" + map.get("deviceParameters"));
            stringBuffer.append("\n#customParameters=" + map.get("customParameters"));
            stringBuffer.append("\n#applicationParameters=" + map.get("applicationParameters"));
            stringBuffer.append("\n#dateTime=" + map.get("dateTime"));
            stringBuffer.append("\n#context=" + map.get("context"));
            stringBuffer.append("\n#library=" + map.get("library"));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            stringBuffer.append("\n".concat(ld.d.f399579b.a().b()));
            stringBuffer.append("\n" + a03.h.a());
            java.util.Map map2 = (java.util.Map) map.get("customParameters");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map2);
            if (!map2.containsKey("WxaLiteApp") || (string = (L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()).getString("wxa_lite_app_game_center_version", "")) == null) {
                obj = "error";
            } else {
                if (booleanValue) {
                    int i17 = L.getInt("count_".concat(string), 0);
                    obj2 = "error";
                    long j17 = L.getLong("time_".concat(string), 0L);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - j17 > 3600000) {
                        L.putInt("count_".concat(string), 1);
                    } else {
                        L.putInt("count_".concat(string), i17 + 1);
                    }
                    L.putLong("time_".concat(string), currentTimeMillis);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle crash. version:%s count%d time:%s now:%s", string, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
                } else {
                    obj2 = "error";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle state error . version:%s", string);
                }
                obj = obj2;
                java.lang.Object obj3 = map.get(obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str3 = (java.lang.String) obj3;
                if (str3.length() >= 10) {
                    str3 = str3.substring(0, 10);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "substring(...)");
                }
                if (booleanValue) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 103L, 1L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 104L, 1L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = string;
                objArr[1] = booleanValue ? com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede : "bad state only";
                objArr[2] = str3;
                g0Var.d(20315, objArr);
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flutter.FlutterReportLogic", "reportFlutterActionAction %s %s", "FlutterCrash", str2);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(17326, java.lang.Long.valueOf(currentTimeMillis2), "FlutterCrash", str2);
            fVar.mo68477x336bdfd8(1053L, 2, 1L, false);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            java.lang.String str4 = (java.lang.String) map.get(obj);
            java.lang.String str5 = (java.lang.String) map.get("stackTrace");
            z65.d dVar = z65.c.f551990c;
            if (dVar != null) {
                dVar.a(stringBuffer2, "", booleanValue, str4, str5);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (booleanValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj4 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj4, arrayList.toArray(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj4, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.lang.Object obj5 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj5, arrayList2.toArray(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj5, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        }
    }
}

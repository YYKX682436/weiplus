package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.keylogger.z f84202a = new com.tencent.mm.plugin.appbrand.keylogger.z();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f84203b = false;

    public static void a(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        java.lang.String b17;
        if (f84203b && (b17 = com.tencent.mm.plugin.appbrand.keylogger.b0.b(cls)) != null) {
            f84202a.b(b17, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, "CollectKeyInfo", 0, "", str2);
        }
    }

    public static void b(java.lang.String str, kg1.a aVar) {
        c(str, aVar, "");
    }

    public static void c(java.lang.String str, kg1.a aVar, java.lang.String str2) {
        if (f84203b) {
            kg1.h hVar = (kg1.h) aVar;
            f84202a.b(hVar.f307693a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f307694b, java.lang.Integer.valueOf(hVar.f307695c ? 1 : 0), java.lang.String.format("fail:%s", str2), "");
        }
        com.tencent.mm.plugin.appbrand.keylogger.y.a(str, aVar, str2, "");
    }

    public static void d(java.lang.String str, kg1.a aVar, java.lang.String str2, java.lang.String str3, long j17, long j18) {
        if (f84203b) {
            java.lang.String str4 = ((kg1.h) aVar).f307693a;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            kg1.h hVar = (kg1.h) aVar;
            java.lang.Object[] objArr = {valueOf, str, hVar.f307694b, 0, "stepStart", str3};
            com.tencent.mm.plugin.appbrand.keylogger.z zVar = f84202a;
            zVar.b(str4, "%d|%s|%s|%d|%s|%s", objArr);
            zVar.b(hVar.f307693a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(j18), str, hVar.f307694b, java.lang.Integer.valueOf(hVar.f307695c ? 1 : 0), java.lang.String.format("fail:%s", str2), str3);
        }
        com.tencent.mm.plugin.appbrand.keylogger.y.a(str, aVar, str2, str3);
    }

    public static void e(java.lang.String str, kg1.a aVar) {
        if (f84203b) {
            kg1.h hVar = (kg1.h) aVar;
            f84202a.b(hVar.f307693a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f307694b, java.lang.Integer.valueOf(hVar.f307695c ? 1 : 0), "ok", "");
        }
        com.tencent.mm.plugin.appbrand.keylogger.x xVar = com.tencent.mm.plugin.appbrand.keylogger.y.f84205a;
        com.tencent.mm.plugin.appbrand.keylogger.v vVar = com.tencent.mm.plugin.appbrand.keylogger.t.f84200a;
        java.lang.String str2 = ((kg1.h) aVar).f307693a;
        vVar.a(str2, str, aVar, com.tencent.mm.plugin.appbrand.keylogger.y.f84205a.a(str2, str, aVar));
    }

    public static void f(java.lang.String str, kg1.a aVar, java.lang.String str2, long j17, long j18) {
        if (f84203b) {
            java.lang.String str3 = ((kg1.h) aVar).f307693a;
            kg1.h hVar = (kg1.h) aVar;
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), str, hVar.f307694b, 0, "stepStart", str2};
            com.tencent.mm.plugin.appbrand.keylogger.z zVar = f84202a;
            zVar.b(str3, "%d|%s|%s|%d|%s|%s", objArr);
            zVar.b(hVar.f307693a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(j18), str, hVar.f307694b, java.lang.Integer.valueOf(hVar.f307695c ? 1 : 0), "ok", str2);
        }
        com.tencent.mm.plugin.appbrand.keylogger.x xVar = com.tencent.mm.plugin.appbrand.keylogger.y.f84205a;
        com.tencent.mm.plugin.appbrand.keylogger.t.f84200a.a(((kg1.h) aVar).f307693a, str, aVar, j18 - j17);
    }

    public static void g(java.lang.String str, kg1.a aVar) {
        if (f84203b) {
            kg1.h hVar = (kg1.h) aVar;
            f84202a.b(hVar.f307693a, "%d|%s|%s|%d|%s|%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, hVar.f307694b, 0, "stepStart", "");
        }
        com.tencent.mm.plugin.appbrand.keylogger.x xVar = com.tencent.mm.plugin.appbrand.keylogger.y.f84205a;
        kg1.h hVar2 = (kg1.h) aVar;
        java.lang.String str2 = hVar2.f307693a;
        com.tencent.mm.plugin.appbrand.keylogger.x xVar2 = com.tencent.mm.plugin.appbrand.keylogger.y.f84205a;
        xVar2.getClass();
        java.lang.String format = java.lang.String.format("%s#%s#%s", str2, str, hVar2.f307694b);
        ((java.util.concurrent.ConcurrentHashMap) xVar2.f84204a).put(format, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.util.List list = (java.util.List) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.keylogger.t.f84200a.f84201a).get(hVar2.f307693a);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = (com.tencent.mm.plugin.appbrand.report.quality.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str, aVar, 0L, com.tencent.mm.plugin.appbrand.report.quality.u1.f88357d);
        }
    }

    public static com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo h(java.lang.String str) {
        java.util.regex.Pattern pattern = com.tencent.mm.plugin.appbrand.keylogger.z.f84206b;
        boolean z17 = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.regex.Matcher matcher = com.tencent.mm.plugin.appbrand.keylogger.z.f84206b.matcher(str);
            str = matcher.find() ? matcher.group(1) : null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String[] split = str.split("\\|", -1);
        if (split == null) {
            com.tencent.mars.xlog.Log.w("WeAppKeyLogger", "parse items null");
            return null;
        }
        if (split.length != 6) {
            com.tencent.mars.xlog.Log.w("WeAppKeyLogger", "parse items length illegal:%d", java.lang.Integer.valueOf(split.length));
            return null;
        }
        try {
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = new com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo();
            iKeyStepAnalyser$StepLogInfo.f84132d = com.tencent.mm.sdk.platformtools.t8.V(split[0], 0L);
            iKeyStepAnalyser$StepLogInfo.f84133e = split[1];
            iKeyStepAnalyser$StepLogInfo.f84134f = split[2];
            if (com.tencent.mm.sdk.platformtools.t8.P(split[3], 1) != 1) {
                z17 = false;
            }
            iKeyStepAnalyser$StepLogInfo.f84135g = z17;
            iKeyStepAnalyser$StepLogInfo.f84136h = split[4];
            iKeyStepAnalyser$StepLogInfo.f84137i = split[5];
            return iKeyStepAnalyser$StepLogInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("WeAppKeyLogger", "parse e:%s", e17);
            return null;
        }
    }

    public static void i(java.lang.Class cls, java.lang.String str) {
        java.util.List a17 = com.tencent.mm.plugin.appbrand.keylogger.b0.a(cls, null);
        if (a17 == null) {
            return;
        }
        e(str, ((kg1.o) a17.get(a17.size() - 1)).f307709a);
        java.lang.String str2 = ((kg1.h) ((kg1.o) a17.get(0)).f307709a).f307693a;
        com.tencent.mm.plugin.appbrand.keylogger.v vVar = com.tencent.mm.plugin.appbrand.keylogger.t.f84200a;
        vVar.getClass();
        vVar.b(str2, new com.tencent.mm.plugin.appbrand.keylogger.s(vVar, str));
    }

    public static void j(java.lang.Class cls, java.lang.String str) {
        java.util.List a17 = com.tencent.mm.plugin.appbrand.keylogger.b0.a(cls, null);
        if (a17 == null) {
            return;
        }
        e(str, ((kg1.o) a17.get(0)).f307709a);
        java.lang.String str2 = ((kg1.h) ((kg1.o) a17.get(0)).f307709a).f307693a;
        com.tencent.mm.plugin.appbrand.keylogger.v vVar = com.tencent.mm.plugin.appbrand.keylogger.t.f84200a;
        vVar.getClass();
        vVar.b(str2, new com.tencent.mm.plugin.appbrand.keylogger.r(vVar, str));
    }
}

package c61;

/* loaded from: classes16.dex */
public final class bb {
    public bb(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String t17 = r26.i0.t(str, ",", "#", false);
        if (t17.length() <= 3000) {
            return t17;
        }
        java.lang.String substring = t17.substring(0, 3000);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final void b(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportKv: ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.FlutterCrashReportStruct flutterCrashReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FlutterCrashReportStruct();
        flutterCrashReportStruct.f58140d = z17 ? 1L : 0L;
        flutterCrashReportStruct.f58141e = flutterCrashReportStruct.b("error", str != null ? r26.i0.t(str, ",", "#", false) : null, true);
        flutterCrashReportStruct.f58142f = flutterCrashReportStruct.b("stackTrace", str2 != null ? a(str2) : "", true);
        flutterCrashReportStruct.f58143g = currentTimeMillis / 1000;
        flutterCrashReportStruct.f58144h = flutterCrashReportStruct.b("pluginName", str3, true);
        flutterCrashReportStruct.f58145i = java.lang.System.currentTimeMillis() - j17;
        flutterCrashReportStruct.f58146j = java.lang.System.currentTimeMillis() - com.tencent.mm.app.x.f53906a;
        flutterCrashReportStruct.f58147k = flutterCrashReportStruct.b("flutter_revision", a03.h.a(), true);
        flutterCrashReportStruct.f58148l = flutterCrashReportStruct.b("widgetInformation", str4 != null ? r26.i0.t(str4, ",", "#", false) : null, true);
        flutterCrashReportStruct.f58149m = flutterCrashReportStruct.b("lastBuildWidget", str5 != null ? r26.i0.t(str5, ",", "#", false) : null, true);
        flutterCrashReportStruct.f58150n = flutterCrashReportStruct.b("lastSetStateStack", str6 != null ? a(str6) : "", true);
        flutterCrashReportStruct.f58151o = flutterCrashReportStruct.b("rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
        flutterCrashReportStruct.k();
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportKv: ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.FlutterExceptionReportStruct flutterExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FlutterExceptionReportStruct();
        flutterExceptionReportStruct.f58176d = z17 ? 1L : 0L;
        flutterExceptionReportStruct.f58177e = flutterExceptionReportStruct.b("error", str != null ? r26.i0.t(str, ",", "#", false) : null, true);
        flutterExceptionReportStruct.f58178f = flutterExceptionReportStruct.b("stackTrace", str2 != null ? a(str2) : "", true);
        flutterExceptionReportStruct.f58179g = currentTimeMillis / 1000;
        flutterExceptionReportStruct.f58180h = flutterExceptionReportStruct.b("pluginName", str3, true);
        flutterExceptionReportStruct.f58181i = java.lang.System.currentTimeMillis() - j17;
        flutterExceptionReportStruct.f58182j = java.lang.System.currentTimeMillis() - com.tencent.mm.app.x.f53906a;
        flutterExceptionReportStruct.f58183k = flutterExceptionReportStruct.b("flutter_revision", a03.h.a(), true);
        flutterExceptionReportStruct.f58184l = flutterExceptionReportStruct.b("widgetInformation", str4 != null ? r26.i0.t(str4, ",", "#", false) : null, true);
        flutterExceptionReportStruct.f58185m = flutterExceptionReportStruct.b("lastBuildWidget", str5 != null ? r26.i0.t(str5, ",", "#", false) : null, true);
        flutterExceptionReportStruct.f58186n = flutterExceptionReportStruct.b("lastSetStateStack", str6 != null ? a(str6) : "", true);
        flutterExceptionReportStruct.f58187o = flutterExceptionReportStruct.b("rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
        flutterExceptionReportStruct.k();
    }
}

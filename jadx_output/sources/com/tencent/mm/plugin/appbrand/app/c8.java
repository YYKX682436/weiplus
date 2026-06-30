package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes11.dex */
public class c8 extends hf.a {
    @Override // hf.a
    public void a(hf.b bVar) {
        super.a(bVar);
        try {
            com.tencent.mm.autogen.mmdata.rpt.Skyline_Dart_Crash_ReporterStruct skyline_Dart_Crash_ReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.Skyline_Dart_Crash_ReporterStruct();
            skyline_Dart_Crash_ReporterStruct.f60421d = skyline_Dart_Crash_ReporterStruct.b("Runtime", bm5.f1.a(), true);
            skyline_Dart_Crash_ReporterStruct.f60422e = skyline_Dart_Crash_ReporterStruct.b("CurrentActivity", com.tencent.mm.app.w.INSTANCE.h(), true);
            skyline_Dart_Crash_ReporterStruct.f60423f = skyline_Dart_Crash_ReporterStruct.b("CurrentThread", java.lang.Thread.currentThread().getName(), true);
            skyline_Dart_Crash_ReporterStruct.f60424g = skyline_Dart_Crash_ReporterStruct.b("ExtraCrashMsg", m91.f.f324951a.a().replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f60425h = skyline_Dart_Crash_ReporterStruct.b("DeviceParameters", bVar.f280985a.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f60426i = skyline_Dart_Crash_ReporterStruct.b("CustomParameters", bVar.f280986b.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f60427j = skyline_Dart_Crash_ReporterStruct.b("ApplicationParameters", bVar.f280987c.replaceAll(",", "_"), true);
            skyline_Dart_Crash_ReporterStruct.f60428k = skyline_Dart_Crash_ReporterStruct.b(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, bVar.f280988d, true);
            skyline_Dart_Crash_ReporterStruct.f60429l = skyline_Dart_Crash_ReporterStruct.b("Context", bVar.f280989e, true);
            skyline_Dart_Crash_ReporterStruct.f60430m = skyline_Dart_Crash_ReporterStruct.b("CrashContent", u46.l.t(bVar.f280990f.replaceAll(",", "_"), 0, 1024), true);
            skyline_Dart_Crash_ReporterStruct.f60431n = bVar.f280991g;
            skyline_Dart_Crash_ReporterStruct.f60432o = skyline_Dart_Crash_ReporterStruct.b("Revision", a03.h.a(), true);
            skyline_Dart_Crash_ReporterStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSkylineBootGuard", "report fail: %s", e17);
        }
    }
}

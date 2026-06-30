package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.r0 f76317a = new com.tencent.mm.plugin.appbrand.appstorage.r0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f76318b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t6 f76319c = com.tencent.mm.plugin.appbrand.appstorage.n0.f76274a;

    public static final void a() {
        com.tencent.mm.plugin.appbrand.appstorage.r0 r0Var = f76317a;
        long j17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77209g * 1048576;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimitSync limit:" + j17);
        if (j17 <= 0) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct();
        r0Var.b(j17, weAppFileSystemTempFileLastOccupationStatStruct);
        if (weAppFileSystemTempFileLastOccupationStatStruct.f62266m > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.nfc.j.CTRL_INDEX, 248);
        }
    }
}

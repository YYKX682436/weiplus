package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public abstract class g {
    public static final com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct a(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct weAppFileSystemTempFileSingleAllocStatStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct();
        weAppFileSystemTempFileSingleAllocStatStruct.f62269d = weAppFileSystemTempFileSingleAllocStatStruct.b("AppId", qualitySessionRuntime.f88135e, true);
        weAppFileSystemTempFileSingleAllocStatStruct.f62270e = qualitySessionRuntime.f88139i;
        int i17 = qualitySessionRuntime.f88136f;
        weAppFileSystemTempFileSingleAllocStatStruct.f62271f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.g.demo : cm.g.debug : cm.g.release;
        weAppFileSystemTempFileSingleAllocStatStruct.f62272g = qualitySessionRuntime.f88137g;
        return weAppFileSystemTempFileSingleAllocStatStruct;
    }
}

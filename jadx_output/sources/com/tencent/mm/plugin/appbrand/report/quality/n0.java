package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public abstract class n0 {
    public static final void a(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv14609, m81.b downloadRequest, com.tencent.mars.cdn.CdnManager.WebPageProfile profile, java.lang.String str, long j17, long j18, long j19, long j27, java.util.Map map) {
        kotlin.jvm.internal.o.g(kv14609, "kv14609");
        kotlin.jvm.internal.o.g(downloadRequest, "downloadRequest");
        kotlin.jvm.internal.o.g(profile, "profile");
        pm0.v.L("AppBrand.PkgDownloadProfileReportUtils.report", false, new com.tencent.mm.plugin.appbrand.report.quality.m0(qualitySession, kv14609, downloadRequest, profile, str, j17, j18, j19, j27, map));
    }
}

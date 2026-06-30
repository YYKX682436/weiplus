package io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534;

/* renamed from: io.flutter.plugin.report.FlutterAnrReport */
/* loaded from: classes11.dex */
public class C28744x4ff686dd {

    /* renamed from: callback */
    private static io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28744x4ff686dd.ReportCallback f71913xf5bc2045;

    /* renamed from: io.flutter.plugin.report.FlutterAnrReport$ReportCallback */
    /* loaded from: classes11.dex */
    public interface ReportCallback {
        /* renamed from: onReport */
        void mo134327x57412bf3(java.lang.String str, long j17, java.lang.String str2);
    }

    /* renamed from: report */
    private static void m138855xc84c5534(java.lang.String str, long j17, java.lang.String str2) {
        io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28744x4ff686dd.ReportCallback reportCallback = f71913xf5bc2045;
        if (reportCallback != null) {
            reportCallback.mo134327x57412bf3(str, j17, str2);
        }
    }

    /* renamed from: setCallback */
    public static void m138856x6c4ebec7(io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28744x4ff686dd.ReportCallback reportCallback) {
        f71913xf5bc2045 = reportCallback;
    }
}

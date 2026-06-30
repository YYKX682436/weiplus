package io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534;

/* renamed from: io.flutter.plugin.report.FlutterSlowRunnerReport */
/* loaded from: classes11.dex */
public class C28745x90fedd41 {

    /* renamed from: callback */
    private static io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28745x90fedd41.ReportCallback f71914xf5bc2045;

    /* renamed from: io.flutter.plugin.report.FlutterSlowRunnerReport$ReportCallback */
    /* loaded from: classes11.dex */
    public interface ReportCallback {
        /* renamed from: onReport */
        void mo134328x57412bf3(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2);
    }

    /* renamed from: report */
    private static void m138857xc84c5534(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2) {
        io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28745x90fedd41.ReportCallback reportCallback = f71914xf5bc2045;
        if (reportCallback != null) {
            reportCallback.mo134328x57412bf3(str, strArr, j17, str2);
        }
    }

    /* renamed from: setCallback */
    public static void m138858x6c4ebec7(io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28745x90fedd41.ReportCallback reportCallback) {
        f71914xf5bc2045 = reportCallback;
    }
}

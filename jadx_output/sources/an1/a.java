package an1;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final an1.a f8830a = new an1.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f8831b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f8832c = -1;

    public final void a(int i17) {
        int i18 = f8832c;
        if (i18 == -1) {
            f8832c = i17;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            f8831b = android.os.SystemClock.elapsedRealtime();
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.AudioDeviceInfoKvReportStruct audioDeviceInfoKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AudioDeviceInfoKvReportStruct();
        audioDeviceInfoKvReportStruct.f55339d = i18;
        long j17 = f8831b;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        audioDeviceInfoKvReportStruct.f55340e = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        audioDeviceInfoKvReportStruct.k();
        f8832c = i17;
        f8831b = android.os.SystemClock.elapsedRealtime();
    }
}

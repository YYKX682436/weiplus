package as0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final as0.a f13425a = new as0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f13426b = new android.util.SparseArray();

    public final com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a(int i17) {
        return (com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct) f13426b.get(i17);
    }

    public final void b(int i17, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = a(i17);
        if (a17 == null) {
            return;
        }
        a17.f55558g = z17 ? 1 : 0;
    }

    public final void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitReport", "markFallbackToReadPixel sessionId:" + i17 + ", status: " + i18);
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = a(i17);
        if (a17 != null) {
            a17.R = i18;
        }
    }
}

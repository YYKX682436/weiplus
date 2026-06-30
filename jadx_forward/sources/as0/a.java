package as0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final as0.a f94958a = new as0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f94959b = new android.util.SparseArray();

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a(int i17) {
        return (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e) f94959b.get(i17);
    }

    public final void b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = a(i17);
        if (a17 == null) {
            return;
        }
        a17.f137091g = z17 ? 1 : 0;
    }

    public final void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitReport", "markFallbackToReadPixel sessionId:" + i17 + ", status: " + i18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = a(i17);
        if (a17 != null) {
            a17.R = i18;
        }
    }
}

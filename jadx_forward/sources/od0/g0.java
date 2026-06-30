package od0;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426074d;

    public g0(od0.v vVar, java.lang.String str) {
        this.f426074d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] e17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.e(48);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("ECD", e17);
            bundle.putString("MGAI", this.f426074d);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, od0.q0.class, new od0.f0(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "post rwgsi task error: %s", th6.toString());
        }
    }
}

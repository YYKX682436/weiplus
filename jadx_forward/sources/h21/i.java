package h21;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f359809d;

    public i(int i17) {
        this.f359809d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f359809d + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "report crash count = " + i17);
        if (i17 < 0 || i17 > 10) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompatReporter", "#reportRecoveryCrashCnt: recCrashCnt");
        ap.c.a(1, 0, "recCrashCnt", ap.d.a(), "", "crash-" + i17, "", "", "", "");
        jx3.f.INSTANCE.mo68477x336bdfd8(1341L, i17 + 0, 1L, false);
    }
}

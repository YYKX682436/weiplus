package ei3;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.u f334655d;

    public t(ei3.u uVar) {
        this.f334655d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.u uVar = this.f334655d;
        try {
            uVar.h();
            uVar.m();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder error: %s", e17.getMessage());
        }
    }
}

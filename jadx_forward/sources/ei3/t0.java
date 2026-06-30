package ei3;

/* loaded from: classes10.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334656d;

    public t0(ei3.w0 w0Var, java.lang.String str) {
        this.f334656d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.vfs.w6.h(this.f334656d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}

package ei3;

/* loaded from: classes10.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334591d;

    public i0(ei3.j0 j0Var, java.lang.String str) {
        this.f334591d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.vfs.w6.h(this.f334591d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}

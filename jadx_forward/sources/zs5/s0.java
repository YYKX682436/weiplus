package zs5;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.u0 f557007d;

    public s0(zs5.u0 u0Var) {
        this.f557007d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f557007d.f557024e) {
            zs5.q0 q0Var = zs5.q0.f556994a;
            boolean d17 = q0Var.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "releaseWxFileQRCodeDecoder releaseQBar hasInit: %s", java.lang.Boolean.valueOf(d17));
            if (d17) {
                q0Var.mo142436x41012807();
            }
        }
    }
}

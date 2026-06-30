package di3;

/* loaded from: classes10.dex */
public class a0 implements di3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f314182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314183b;

    public a0(di3.b0 b0Var, t21.v2 v2Var, java.lang.String str) {
        this.f314182a = v2Var;
        this.f314183b = str;
    }

    @Override // di3.i
    public boolean a() {
        long j17 = this.f314182a.f496549n;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ai3.a.f86637a;
        synchronized (ai3.a.class) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish: %s", java.lang.Long.valueOf(j17));
                ai3.a.f86637a.remove(java.lang.Long.valueOf(j17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish error: %s", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile2 %s", this.f314183b);
        int t17 = t21.w2.t(this.f314183b);
        t21.v2 v2Var = this.f314182a;
        v2Var.f496541f = t17;
        v2Var.U = 32;
        t21.o2.Ui().C(this.f314182a);
        return true;
    }
}

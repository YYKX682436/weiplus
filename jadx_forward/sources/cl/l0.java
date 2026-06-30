package cl;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.m0 f124214d;

    public l0(cl.m0 m0Var) {
        this.f124214d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release");
        com.p159x477cd522.p160x333422.C1466x7b8b3792 c1466x7b8b3792 = this.f124214d.f124228d;
        if (c1466x7b8b3792 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release mV8Buffer null");
        } else {
            c1466x7b8b3792.m15908xbd15ad61();
        }
    }
}

package cl;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.m0 f42681d;

    public l0(cl.m0 m0Var) {
        this.f42681d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release");
        com.eclipsesource.mmv8.SharedV8ArrayBuffer sharedV8ArrayBuffer = this.f42681d.f42695d;
        if (sharedV8ArrayBuffer == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release mV8Buffer null");
        } else {
            sharedV8ArrayBuffer.manualRelease();
        }
    }
}

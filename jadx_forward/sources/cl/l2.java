package cl;

/* loaded from: classes7.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p159x477cd522.p160x333422.C1474xd5ce209a f124216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124217e;

    public l2(cl.m2 m2Var, com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a, cl.q0 q0Var) {
        this.f124216d = c1474xd5ce209a;
        this.f124217e = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a = this.f124216d;
        if (c1474xd5ce209a.mo16335xafdb8087()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: called a released task");
        } else {
            c1474xd5ce209a.m16420x2e7a5e(this.f124217e.f().mo16386x31ca9f38(), null);
            c1474xd5ce209a.mo15825x41012807();
        }
    }
}

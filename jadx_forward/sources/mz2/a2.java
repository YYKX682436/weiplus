package mz2;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz2.c2 f414620d;

    public a2(mz2.c2 c2Var) {
        this.f414620d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (mz2.n0.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncGenRsaKey", "device is support FingerPrintAuth");
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63457xf0bc036f(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncGenRsaKey", "device is not support FingerPrintAuth");
            str = "";
        }
        mz2.b2 b2Var = this.f414620d.f414629a;
        if (b2Var != null) {
            b2Var.a(str);
        }
    }
}

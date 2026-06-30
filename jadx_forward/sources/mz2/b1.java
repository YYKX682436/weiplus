package mz2;

/* loaded from: classes9.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz2.c1 f414626e;

    public b1(mz2.c1 c1Var, java.lang.String str) {
        this.f414626e = c1Var;
        this.f414625d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback running");
        android.os.Message mo50288x733c63a2 = this.f414626e.f414628a.f414641h.mo50288x733c63a2();
        mo50288x733c63a2.what = 1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rsaKey", this.f414625d);
        mo50288x733c63a2.setData(bundle);
        mo50288x733c63a2.sendToTarget();
    }
}

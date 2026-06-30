package mz2;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414701d;

    public p0(mz2.q0 q0Var, java.lang.String str) {
        this.f414701d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f414701d;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "rsaKey is null");
        }
        oz2.e eVar = new oz2.e(str);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(eVar);
    }
}

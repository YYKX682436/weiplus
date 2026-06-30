package k23;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.n1 f385147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385148e;

    public l1(k23.n1 n1Var, k23.j2 j2Var) {
        this.f385147d = n1Var;
        this.f385148e = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.n1 n1Var = this.f385147d;
        if (n1Var.f385161d) {
            return;
        }
        n1Var.f385161d = true;
        n1Var.f385162e = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", n1Var.f385158a + ": 长按触发语音输入");
        k23.k1 k1Var = this.f385148e.f385129n;
        if (k1Var != null) {
            k1Var.c();
        }
    }
}

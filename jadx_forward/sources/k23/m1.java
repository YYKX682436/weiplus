package k23;

/* loaded from: classes12.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.n1 f385152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f385153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385154f;

    public m1(k23.n1 n1Var, boolean z17, k23.j2 j2Var) {
        this.f385152d = n1Var;
        this.f385153e = z17;
        this.f385154f = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        k23.n1 n1Var = this.f385152d;
        sb6.append(n1Var.f385158a);
        sb6.append(": 长按延迟结束，isCanceling=");
        boolean z17 = this.f385153e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", sb6.toString());
        k23.k1 k1Var = this.f385154f.f385129n;
        if (k1Var != null) {
            k1Var.g(z17);
        }
        n1Var.f385164g = null;
    }
}

package gt4;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.r1 f357043d;

    public q1(gt4.r1 r1Var) {
        this.f357043d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.r1 r1Var = this.f357043d;
        r1Var.animate().alpha(0.0f).setDuration(100L);
        gt4.l1 l1Var = r1Var.C.f262263g;
        if (l1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
            int i17 = ((gt4.v1) l1Var).f357103a.f262274p.f82644n;
        }
    }
}

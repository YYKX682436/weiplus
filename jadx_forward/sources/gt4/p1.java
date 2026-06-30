package gt4;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.r1 f357029d;

    public p1(gt4.r1 r1Var) {
        this.f357029d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.r1 r1Var = this.f357029d;
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        r1Var.f357046d.getPixels(r1Var.f357057r, 0, width, 0, 0, width, height);
        float f17 = width * height;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i17 = 0; i17 < f17; i17++) {
            if (r1Var.f357057r[i17] == 0) {
                f19 += 1.0f;
            }
        }
        if (f19 >= 0.0f && f17 > 0.0f) {
            f18 = f19 / f17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "erasePercent: %s", java.lang.Float.valueOf(f18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "");
        if (f18 >= r1Var.B) {
            r1Var.A = true;
            if (r1Var.f357059t) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gt4.q1(r1Var));
            r1Var.f357059t = true;
        }
    }
}

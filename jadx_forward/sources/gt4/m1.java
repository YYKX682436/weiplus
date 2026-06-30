package gt4;

/* loaded from: classes13.dex */
public class m1 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gt4.r1 f357003g;

    public m1(gt4.r1 r1Var) {
        this.f357003g = r1Var;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        gt4.r1 r1Var = this.f357003g;
        long j17 = r1Var.f357064y;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (r1Var.f357065z) {
            if (elapsedRealtime < 80) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        r1Var.f357064y = android.os.SystemClock.elapsedRealtime();
        r1Var.f357065z = true;
        if (r1Var.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "onStartShakeOrClick, already finish clear mask");
            return;
        }
        if (r1Var.b()) {
            return;
        }
        if (r1Var.f357063x) {
            r1Var.f357062w += r1Var.getHeight() / 6;
            r1Var.c();
        } else {
            r1Var.f357061v += r1Var.getHeight() / 6;
            r1Var.c();
        }
        r1Var.f357063x = !r1Var.f357063x;
        if (!r1Var.f357058s) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gt4.n1(r1Var), 50L);
            r1Var.f357058s = true;
        }
        r1Var.b();
    }
}

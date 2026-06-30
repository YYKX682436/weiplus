package sc3;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488079d;

    public w(sc3.k1 k1Var) {
        this.f488079d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f488079d.S) {
            sc3.k1 k1Var = this.f488079d;
            if (!k1Var.f488007J) {
                long j17 = k1Var.T + 1;
                k1Var.T = j17;
                bf3.g0.f101160a.b(k1Var.f488009e, new sc3.v(k1Var, j17));
                if (this.f488079d.S) {
                    sc3.k1 k1Var2 = this.f488079d;
                    if (!k1Var2.f488007J) {
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) k1Var2.R).mo141623x754a37bb()).mo50297x7c4d7ca2(this, this.f488079d.U);
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f488079d.Q, "heartbeat tick#" + j17 + " not reschedule: started=" + this.f488079d.S + ", destroying=" + this.f488079d.f488007J);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f488079d.Q, "heartbeat tick skip: started=" + this.f488079d.S + ", destroying=" + this.f488079d.f488007J);
    }
}

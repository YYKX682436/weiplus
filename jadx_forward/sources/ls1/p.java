package ls1;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402539d;

    public p(ls1.e0 e0Var) {
        this.f402539d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls1.e0 e0Var = this.f402539d;
        e0Var.B1();
        boolean z17 = e0Var.f402513f2;
        boolean z18 = e0Var.f402514g2;
        if (z17 || z18) {
            return;
        }
        ax4.a.a(92);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = e0Var.P1;
        i0Var.f175824l0 = true;
        i0Var.f175826m0 = true;
        e0Var.J1();
        e0Var.I(-124);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e0Var.B1(), "check notifyPage timeout");
    }
}

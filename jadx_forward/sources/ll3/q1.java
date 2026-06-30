package ll3;

/* loaded from: classes11.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ql3.a f400751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll3.r1 f400752e;

    public q1(ll3.r1 r1Var, ql3.a aVar) {
        this.f400752e = r1Var;
        this.f400751d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ql3.a aVar;
        r45.jj4 jj4Var = new r45.jj4();
        ql3.a aVar2 = this.f400751d;
        jj4Var.f459388d = aVar2.f67000x56a01985;
        java.lang.String str = aVar2.f66992xe65a7da;
        jj4Var.f459393i = str;
        jj4Var.f459395m = aVar2.f66991xbe4efa2f;
        jj4Var.f459391g = str;
        android.graphics.Bitmap s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).s(jj4Var);
        if (s17 != null) {
            android.graphics.Bitmap X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(s17, 10);
            ql3.a aVar3 = this.f400751d;
            ll3.r1 r1Var = this.f400752e;
            r1Var.c(aVar3, X);
            int[] c17 = com.p314xaae8f345.mm.ui.bk.c(X, 4, 4);
            ql3.a aVar4 = this.f400751d;
            if (!(aVar4.f66993x12571f84 == c17[0] && aVar4.f66998x375331e == c17[1])) {
                this.f400751d = ll3.o2.Ai().L0(this.f400751d.f66983xc8c6afdb, c17[0], c17[1]);
            }
            ll3.p1 p1Var = r1Var.f400757b;
            if (p1Var == null || (aVar = this.f400751d) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u) p1Var).d(aVar, c17);
        }
    }
}

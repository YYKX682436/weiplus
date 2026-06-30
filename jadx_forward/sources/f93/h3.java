package f93;

/* loaded from: classes11.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.j3 f341882d;

    public h3(f93.j3 j3Var) {
        this.f341882d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        f93.j3 j3Var = this.f341882d;
        if (j3Var.f341898e.f224805J.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.a(j3Var.f341898e);
        } else {
            j3Var.f341898e.E.E();
            j3Var.f341898e.g7(f93.w3.Empty);
        }
        if (j3Var.f341897d && (n3Var = j3Var.f341898e.Z) != null) {
            n3Var.mo50303x856b99f0(5002);
            j3Var.f341898e.Z.mo50307xb9e94560(5003, 0L);
        }
        j3Var.f341898e.e7();
    }
}

package f93;

/* loaded from: classes11.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.z1 f342035d;

    public x1(f93.z1 z1Var) {
        this.f342035d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        f93.z1 z1Var = this.f342035d;
        if (z1Var.f342060e.B.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.X6(z1Var.f342060e);
        } else {
            z1Var.f342060e.A.E();
            z1Var.f342060e.h7(f93.m2.Empty);
            z1Var.f342060e.f224784r.setEnabled(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = z1Var.f342060e;
            viewOnCreateContextMenuListenerC16169x37a19e8d.f224784r.setTextColor(viewOnCreateContextMenuListenerC16169x37a19e8d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        }
        if (z1Var.f342059d && (n3Var = z1Var.f342060e.Q) != null) {
            n3Var.mo50303x856b99f0(5002);
            z1Var.f342060e.Q.mo50307xb9e94560(5003, 0L);
        }
        z1Var.f342060e.e7();
    }
}

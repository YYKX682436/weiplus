package ww1;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f531892d;

    public y0(ww1.l1 l1Var) {
        this.f531892d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.l1 l1Var = this.f531892d;
        if (l1Var.f531766d != null && l1Var.f531769g && l1Var.f531767e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "this play may error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 1L, 1L, false);
        }
    }
}

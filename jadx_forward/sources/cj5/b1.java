package cj5;

/* loaded from: classes.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f123605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f123606e;

    public b1(cj5.d1 d1Var, boolean z17) {
        this.f123605d = d1Var;
        this.f123606e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f m67437x4bd5310;
        cj5.d1 d1Var = this.f123605d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = d1Var.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.a1(this.f123606e ? d1Var.T6().o().getHeight() : 0));
    }
}

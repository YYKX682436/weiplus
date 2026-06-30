package xe5;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f535652d;

    public u(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f535652d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s40.y0 y0Var = (s40.y0) i95.n0.c(s40.y0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f535652d;
        long m124847x74d37ac6 = f9Var != null ? f9Var.m124847x74d37ac6() : -1L;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.f5) y0Var).getClass();
        rl2.l Pj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj();
        if (m124847x74d37ac6 == -1) {
            Pj.getClass();
            return;
        }
        ce2.l z07 = Pj.z0(m124847x74d37ac6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "onFinderNotifyExpose ,msgId = " + m124847x74d37ac6 + ",tipsId = " + z07.f68169x11c19d58 + ", rowId = " + z07.f72763xa3c65b86);
        if (z07.f72763xa3c65b86 != -1) {
            z07.f68159xbc5c91be = 1;
            Pj.mo51732xbf274172(z07, false, new java.lang.String[0]);
        }
    }
}

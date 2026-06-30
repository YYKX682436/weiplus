package lx;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f403219e;

    public a3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, long j17) {
        this.f403218d = c10491x8102098a;
        this.f403219e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f403218d.f146786d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f403219e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}

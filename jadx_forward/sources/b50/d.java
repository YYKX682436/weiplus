package b50;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f99465e;

    public d(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, long j17) {
        this.f99464d = c10601x91d05935;
        this.f99465e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f99464d.f148594d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f99465e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}

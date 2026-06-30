package zv;

/* loaded from: classes11.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f557586e;

    public m2(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, long j17) {
        this.f557585d = c10465x1b7ee7d;
        this.f557586e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f557585d.f146722d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f557586e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}

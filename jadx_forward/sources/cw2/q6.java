package cw2;

/* loaded from: classes15.dex */
public final class q6 implements ek4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f305485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f305486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f305487d;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, int i17, cw2.s6 s6Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f305484a = c15188xd8bd4bd;
        this.f305485b = i17;
        this.f305486c = s6Var;
        this.f305487d = countDownLatch;
    }

    @Override // ek4.v
    public void a(int i17) {
        cw2.s6 s6Var = this.f305486c;
        int i18 = this.f305485b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305484a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd.m61380xe56ce956(), "requestedResource taskId:" + i18 + " requestVideoData fail, ret:" + i17 + ' ' + this);
            s6Var.c(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd.m61380xe56ce956(), "requestedResource taskId:" + i18 + " requestVideoData success, ret:" + i17 + ' ' + this);
            s6Var.c(true);
        }
        this.f305487d.countDown();
    }
}

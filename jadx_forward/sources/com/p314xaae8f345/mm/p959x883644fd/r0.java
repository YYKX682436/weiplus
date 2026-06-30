package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes11.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153085f;

    public r0(com.p314xaae8f345.mm.p959x883644fd.s0 s0Var, int i17, int i18, int i19) {
        this.f153083d = i17;
        this.f153084e = i18;
        this.f153085f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f153083d;
        long j18 = this.f153084e;
        boolean[] zArr = com.p314xaae8f345.mm.p959x883644fd.b0.f153026a;
        boolean a17 = com.p314xaae8f345.mm.p971x6de15a2e.y2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = this.f153085f;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p959x883644fd.b0.b(j17, j18, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p959x883644fd.b0.a(j17, j18, i17);
        }
    }
}

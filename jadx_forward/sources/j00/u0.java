package j00;

/* loaded from: classes9.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f378438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378439f;

    public u0(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, j00.k1 k1Var) {
        this.f378437d = str;
        this.f378438e = f9Var;
        this.f378439f = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveNewEcsGiftMsg, talker:");
        sb6.append(this.f378437d);
        sb6.append(", msg:");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f378438e;
        sb6.append(f9Var.m124847x74d37ac6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
        j00.k1 k1Var = this.f378439f;
        j00.k1.Bi(k1Var, f9Var);
        j00.k1.wi(k1Var, f9Var);
    }
}

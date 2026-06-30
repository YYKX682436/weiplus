package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1 f166743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f166744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1 w1Var, long j17) {
        super(0);
        this.f166742d = lVar;
        this.f166743e = w1Var;
        this.f166744f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.d();
        this.f166742d.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task(");
        sb6.append(this.f166743e.hashCode());
        sb6.append(") WxaCommLibRuntimeReader.loadOrFallback cost[");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f166744f);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", sb6.toString());
        return jz5.f0.f384359a;
    }
}

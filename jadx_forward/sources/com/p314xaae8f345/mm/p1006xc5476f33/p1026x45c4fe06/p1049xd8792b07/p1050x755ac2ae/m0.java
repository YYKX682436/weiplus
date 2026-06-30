package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 f159450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var, java.lang.String str) {
        super(0);
        this.f159450d = n0Var;
        this.f159451e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        int i19;
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.String str = this.f159451e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var = this.f159450d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.l0(str, n0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1 k1Var = n0Var.f159463b;
        synchronized (k1Var) {
            i17 = k1Var.f159447a;
        }
        long pow = ((int) java.lang.Math.pow(2.0f, i17 - 1)) * 5000;
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "resolve#RetryDelayMillsResolver, curBackoffFactor: " + i17 + ", retryDelayMills: " + pow);
        synchronized (k1Var) {
            i18 = k1Var.f159447a;
            int i27 = i18 + 1;
            k1Var.f159447a = i27;
            if (10 < i27) {
                k1Var.f159447a = 1;
            }
            i19 = k1Var.f159447a;
        }
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "updateBackoffFactor#RetryDelayMillsResolver, oldBackoffFactor: " + i18 + ", newBackoffFactor: " + i19);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(l0Var, pow, false);
        return jz5.f0.f384359a;
    }
}

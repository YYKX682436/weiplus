package w11;

/* loaded from: classes12.dex */
public final class n0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523623d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 f523624e;

    /* renamed from: f, reason: collision with root package name */
    public final long f523625f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f523626g;

    /* renamed from: h, reason: collision with root package name */
    public final int f523627h;

    public n0(long j17, byte[] bArr) {
        this.f523625f = -1L;
        this.f523627h = 0;
        this.f523625f = j17;
        this.f523626g = bArr;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        byte[] bArr = this.f523626g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneNotifyData", "dkpush %s", "get keyBuf failed");
            return -1;
        }
        int i17 = this.f523627h;
        if (i17 == 0) {
            this.f523624e = new w11.l0();
        } else {
            w11.m0 m0Var = new w11.m0();
            this.f523624e = m0Var;
            m0Var.f523620c = i17;
        }
        long j17 = this.f523625f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNotifyData", "doScene now:%d buf:%s", java.lang.Long.valueOf(j17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k(bArr, 0, 0));
        ((o45.zh) this.f523624e.mo47979x2d63726f()).f424580b = j17;
        ((o45.zh) this.f523624e.mo47979x2d63726f()).f424579a = bArr;
        this.f523623d = u0Var;
        return mo9409x10f9447a(sVar, this.f523624e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 268369922;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNotifyData", "onGYNetEnd [%d,%d] %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f523623d.mo815x76e0bfae(i18, i19, str, this);
    }

    public n0(long j17, byte[] bArr, int i17) {
        this.f523625f = -1L;
        this.f523627h = 0;
        this.f523625f = j17;
        this.f523626g = bArr;
        this.f523627h = i17;
    }
}

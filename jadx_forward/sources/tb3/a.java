package tb3;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f498511d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f498512e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vn0 f498513f;

    public a(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.un0();
        lVar.f152198b = new r45.vn0();
        lVar.f152200d = 1987;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f498511d = a17;
        ((r45.un0) a17.f152243a.f152217a).f469020d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f498512e = u0Var;
        return mo9409x10f9447a(sVar, this.f498511d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1987;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f498513f = (r45.vn0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f498513f.f469925d), this.f498513f.f469926e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f498512e;
        if (u0Var != null) {
            r45.vn0 vn0Var = this.f498513f;
            u0Var.mo815x76e0bfae(i18, vn0Var.f469925d, vn0Var.f469926e, this);
        }
    }
}

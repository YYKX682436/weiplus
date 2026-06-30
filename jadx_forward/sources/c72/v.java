package c72;

/* loaded from: classes12.dex */
public abstract class v extends com.p314xaae8f345.mm.p944x882e457a.p1 {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f121126f;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121127e = null;

    public abstract int H(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var);

    public abstract r45.vt4 I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var);

    public abstract void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr);

    public abstract void K(java.lang.String str);

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121127e = u0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f121126f)) {
            return mo808xfb85f7b0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", f121126f);
        K(f121126f);
        return H(sVar, u0Var);
    }
}

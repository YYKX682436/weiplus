package c72;

/* loaded from: classes12.dex */
public abstract class v extends com.tencent.mm.modelbase.p1 {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f39593f;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39594e = null;

    public abstract int H(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var);

    public abstract r45.vt4 I(com.tencent.mm.network.v0 v0Var);

    public abstract void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr);

    public abstract void K(java.lang.String str);

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39594e = u0Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f39593f)) {
            return getType();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", f39593f);
        K(f39593f);
        return H(sVar, u0Var);
    }
}

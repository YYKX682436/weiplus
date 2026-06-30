package b55;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.network.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f18110d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f18111e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18112f = false;

    public d(com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        this.f18110d = v0Var;
        this.f18111e = l0Var;
    }

    @Override // com.tencent.mm.network.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.z0 z0Var, byte[] bArr, int i27, int i28) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        d55.u.b("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[,%d]", valueOf, valueOf2, valueOf3, bool, java.lang.Integer.valueOf(this.f18110d.hashCode()));
        if (this.f18112f) {
            return;
        }
        this.f18112f = true;
        d55.u.b("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), bool);
        this.f18111e.onGYNetEnd(i17, i18, i19, str, this.f18110d, bArr);
    }
}

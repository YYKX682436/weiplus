package b55;

/* loaded from: classes11.dex */
public class d extends com.p314xaae8f345.mm.p971x6de15a2e.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f99643d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f99644e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99645f = false;

    public d(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        this.f99643d = v0Var;
        this.f99644e = l0Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, byte[] bArr, int i27, int i28) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        d55.u.b("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[,%d]", valueOf, valueOf2, valueOf3, bool, java.lang.Integer.valueOf(this.f99643d.hashCode()));
        if (this.f99645f) {
            return;
        }
        this.f99645f = true;
        d55.u.b("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), bool);
        this.f99644e.mo804x5f9cdc6f(i17, i18, i19, str, this.f99643d, bArr);
    }
}

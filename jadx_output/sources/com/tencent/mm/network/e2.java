package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class e2 extends com.tencent.mm.network.j0 implements com.tencent.mm.network.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.g1 f71983d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mars.comm.MMWakerLock f71984e;

    public e2(com.tencent.mm.network.g1 g1Var, com.tencent.mars.comm.MMWakerLock mMWakerLock) {
        this.f71983d = g1Var;
        this.f71984e = mMWakerLock;
    }

    @Override // com.tencent.mm.network.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.z0 z0Var, byte[] bArr, int i27, int i28) {
    }

    @Override // com.tencent.mm.network.k0
    public void ri(com.tencent.mm.network.z0 z0Var, int i17, int i18, java.lang.String str) {
        this.f71984e.lock(com.tencent.mm.network.g1.M(), "MMAutoAuth.IOnGetCert.onAutoAuth");
        new com.tencent.mm.network.d2(this, 1000L, null, z0Var, i17, i18).a(this.f71983d.f71999t);
    }
}

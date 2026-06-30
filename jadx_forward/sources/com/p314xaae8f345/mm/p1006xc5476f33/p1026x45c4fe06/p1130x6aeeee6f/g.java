package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b {
    public g() {
        super(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: releaseDirectByteBuffer */
    public void mo51547x3b42e258(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b
    public cl.p u0(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0) {
        boolean z17 = cl.x.f124350a;
        return new cl.t3(c5138xafbea1a0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b
    public cl.q0 v0(cl.p pVar, int i17) {
        cl.a aVar = (cl.a) pVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = aVar.f124112l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "createMainContext, contextTag: %d, mainContextSnapshotIndex: %d", valueOf, java.lang.Integer.valueOf(i18));
        return com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a != i18 ? new cl.q0(aVar, aVar.b(), new cl.g(aVar, i17, i18)) : new cl.q0(aVar, aVar.b(), new cl.d(aVar, i17));
    }

    public g(java.lang.String str, byte[] bArr) {
        super(new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0(str, bArr));
    }
}

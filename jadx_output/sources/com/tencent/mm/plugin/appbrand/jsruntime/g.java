package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsruntime.b {
    public g() {
        super(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.v
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.p u0(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        boolean z17 = cl.x.f42817a;
        return new cl.t3(iJSRuntime$Config);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.q0 v0(cl.p pVar, int i17) {
        cl.a aVar = (cl.a) pVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = aVar.f42579l;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "createMainContext, contextTag: %d, mainContextSnapshotIndex: %d", valueOf, java.lang.Integer.valueOf(i18));
        return com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX != i18 ? new cl.q0(aVar, aVar.b(), new cl.g(aVar, i17, i18)) : new cl.q0(aVar, aVar.b(), new cl.d(aVar, i17));
    }

    public g(java.lang.String str, byte[] bArr) {
        super(new com.tencent.mm.appbrand.v8.IJSRuntime$Config(str, bArr));
    }
}

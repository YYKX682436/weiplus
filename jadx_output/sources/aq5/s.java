package aq5;

/* loaded from: classes5.dex */
public final class s implements gz.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13293a;

    public s(aq5.y yVar) {
        this.f13293a = yVar;
    }

    @Override // gz.k
    public void a(java.lang.String toIp, int i17) {
        kotlin.jvm.internal.o.g(toIp, "toIp");
        aq5.y yVar = this.f13293a;
        com.tencent.mars.xlog.Log.i(yVar.f13337a, "sender onConnected() called with: toIp = " + toIp + ", toPort = " + i17);
        com.tencent.mars.xlog.Log.i(yVar.f13337a, "doSenderNegotiation() called");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new aq5.p(yVar, null), 2, null);
        }
    }

    @Override // gz.k
    public void b(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        aq5.y yVar = this.f13293a;
        com.tencent.mars.xlog.Log.w(yVar.f13337a, "sender onDisconnected() called with: reason = " + i17 + ", errMsg = " + errMsg);
        yVar.f13342f.invoke(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL));
    }

    @Override // gz.k
    public void c(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        aq5.y yVar = this.f13293a;
        com.tencent.mars.xlog.Log.i(yVar.f13337a, "sender onConnectFailed() called with: reason = " + i17 + ", errMsg = " + errMsg);
        yVar.f13342f.invoke(10001);
    }
}

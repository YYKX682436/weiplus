package aq5;

/* loaded from: classes5.dex */
public final class m implements gz.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq5.o f13255a;

    public m(aq5.o oVar) {
        this.f13255a = oVar;
    }

    @Override // gz.k
    public void a(java.lang.String toIp, int i17) {
        kotlin.jvm.internal.o.g(toIp, "toIp");
        aq5.o oVar = this.f13255a;
        com.tencent.mars.xlog.Log.i(oVar.f13262a, "receiver onConnected() called1 with: toIp = " + toIp + ", toPort = " + i17);
        com.tencent.mars.xlog.Log.i(oVar.f13262a, "doReceiverNegotiation() called");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new aq5.j(oVar, null), 2, null);
        }
    }

    @Override // gz.k
    public void b(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.w(this.f13255a.f13262a, "receiver onDisconnected() called with: reason = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // gz.k
    public void c(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        aq5.o oVar = this.f13255a;
        com.tencent.mars.xlog.Log.i(oVar.f13262a, "receiver onConnectFailed() called with: reason = " + i17 + ", errMsg = " + errMsg);
        oVar.f13267f.invoke(10001);
    }
}

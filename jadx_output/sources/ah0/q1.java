package ah0;

/* loaded from: classes8.dex */
public class q1 extends com.tencent.mm.app.z2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f4776d = true;

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.plugin.webview.modeltools.z.Ai().f183375n = false;
        com.tencent.mm.plugin.webview.modeltools.z.Ai().getClass();
        com.tencent.mm.plugin.webview.modeltools.u0 u0Var = com.tencent.mm.plugin.webview.modeltools.u0.f183352a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.modeltools.u0.f183355d).getValue()).booleanValue() && ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.modeltools.u0.f183354c).getValue()).booleanValue()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", "cleanPreload");
            pm0.v.X(new com.tencent.mm.plugin.webview.modeltools.p0(currentTimeMillis));
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.webview.modeltools.z.Ai().f183375n = true;
        if (this.f4776d) {
            this.f4776d = false;
        } else {
            com.tencent.mm.plugin.webview.modeltools.z.Ai().getClass();
            com.tencent.mm.plugin.webview.modeltools.u0.f183352a.a();
        }
    }
}

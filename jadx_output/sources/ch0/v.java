package ch0;

/* loaded from: classes8.dex */
public final class v extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f41255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI f41256c;

    public v(com.tencent.mm.plugin.webview.core.e3 e3Var, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI) {
        this.f41255b = e3Var;
        this.f41256c = preLoadWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f41255b;
        try {
            e3Var.e0().rg(this.f41256c.N2, e3Var.U());
        } catch (android.os.RemoteException unused) {
        }
    }
}

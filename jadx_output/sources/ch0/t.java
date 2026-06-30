package ch0;

/* loaded from: classes8.dex */
public final class t extends com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView {
    public t(android.app.Activity activity, com.tencent.xweb.f1 f1Var) {
        super(activity, f1Var);
    }

    @Override // com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView
    public java.lang.String getUserAgentString() {
        java.lang.String a17 = ik1.l0.a(getContext(), getSettings().g(), (ik1.k0) nd.f.a(ik1.k0.class));
        kotlin.jvm.internal.o.f(a17, "appendUserAgent(...)");
        return a17;
    }
}

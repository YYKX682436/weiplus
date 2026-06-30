package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"com/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction;", "", "status", "", "url", "", "waitFor", "verify", "<init>", "()V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction */
/* loaded from: classes8.dex */
public abstract class AbstractC19238x91ef6cc5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19245xf232fb8a {
    /* renamed from: verify */
    public abstract boolean mo74136xcf208879(java.lang.String url);

    /* renamed from: waitFor */
    public final boolean m74137x42891314(int status, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, m74139x143f1b92().D) || m74139x143f1b92().f263494w0.contains(java.lang.Integer.valueOf(status))) && m74139x143f1b92().B0.contains(java.lang.Integer.valueOf(status));
    }
}

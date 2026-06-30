package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class y extends gb1.f {
    public static final int CTRL_INDEX = 299;
    public static final java.lang.String NAME = "removeHTMLWebView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.n7 page = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).destroy();
        kotlin.jvm.internal.o.g(page, "page");
        page.P(new com.tencent.mm.plugin.appbrand.page.qa(page, null));
        return true;
    }
}

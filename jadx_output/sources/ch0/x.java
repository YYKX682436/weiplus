package ch0;

/* loaded from: classes8.dex */
public abstract class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final ch0.a a(ch0.k params, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI activity, tg0.b2 callback, ch0.e0 configurer, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(configurer, "configurer");
        if (kotlin.jvm.internal.o.b(this, ch0.s.f41253a)) {
            if (activity.L3) {
                baseWebSearchWebView = null;
            } else {
                activity.L3 = true;
                baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) activity.f183815f;
            }
            kotlin.jvm.internal.o.d(baseWebSearchWebView);
            qx4.d0 d0Var = activity.E3;
            d0Var.f367401j = new ch0.i0(callback);
            d0Var.f367403l = null;
            com.tencent.mm.plugin.webview.core.e3 e3Var = activity.L1;
            if (!d0Var.f367396e) {
                d0Var.p(new ch0.o(callback));
                java.lang.String stringExtra = activity.getIntent().getStringExtra("ftsrealurl");
                java.lang.String str = stringExtra != null ? stringExtra : "";
                int i17 = params.f41233c.f419041m;
                int i18 = su4.k2.f412978a;
                jx3.f.INSTANCE.d(27700, 10, str, java.lang.Integer.valueOf(i17));
            }
            configurer.a(params.f41232b, baseWebSearchWebView, viewGroup);
            int i19 = params.f41232b;
            kotlin.jvm.internal.o.d(e3Var);
            return new ch0.a(i19, baseWebSearchWebView, d0Var, e3Var, ch0.f0.f41203d, ch0.o0.f41247e, null, 64, null);
        }
        if (!kotlin.jvm.internal.o.b(this, ch0.r.f41252a)) {
            throw new jz5.j();
        }
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView tVar = new ch0.t(activity.getContainerActivity(), qx4.l0.a() ? com.tencent.xweb.f1.WV_KIND_SYS : com.tencent.xweb.f1.WV_KIND_NONE);
        configurer.a(params.f41232b, tVar, viewGroup);
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h;
        qx4.d0 d0Var2 = new qx4.d0(new ch0.w(tVar), new mu4.h(com.tencent.mm.plugin.webview.stub.WebViewStubService.class, "webSearch", "", jsapiPermissionWrapper).a());
        d0Var2.f367401j = new ch0.i0(callback);
        tVar.addJavascriptInterface(d0Var2, "webSearchJSApi");
        if (!d0Var2.f367396e) {
            d0Var2.p(new ch0.o(callback));
        }
        d0Var2.f367403l = null;
        java.lang.String b17 = ch0.d0.f41199a.b(activity, params);
        tVar.loadUrl(b17);
        com.tencent.mm.plugin.webview.core.e3 e3Var2 = new com.tencent.mm.plugin.webview.core.e3(tVar, new com.tencent.mm.plugin.webview.model.b6(), new zg0.k2(null, false, false, false, false, 65, false, 83, null));
        e3Var2.E(new ch0.u(new aw4.u(0)));
        e3Var2.D(new ch0.v(e3Var2, activity));
        e3Var2.q0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", b17);
        intent.putExtra("geta8key_scene", 65);
        intent.putExtra("useJs", true);
        intent.putExtra("hardcode_jspermission", jsapiPermissionWrapper);
        e3Var2.j(intent);
        activity.J3 = new ch0.j(callback);
        return new ch0.a(params.f41232b, tVar, d0Var2, e3Var2, ch0.f0.f41204e, ch0.o0.f41247e, null, 64, null);
    }
}

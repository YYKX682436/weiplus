package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class fb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265715d;

    public fb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f265715d = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onLongClick(android.view.View r14) {
        /*
            r13 = this;
            java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$33"
            java.lang.String r2 = "android/view/View$OnLongClickListener"
            java.lang.String r3 = "onLongClick"
            java.lang.String r4 = "(Landroid/view/View;)Z"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r14)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            r5 = r13
            yj0.a.b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r13.f265715d
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r3 = "show_long_click_popup_menu"
            r4 = 1
            boolean r0 = r0.getBooleanExtra(r3, r4)
            if (r0 == 0) goto Lba
            java.lang.String r3 = "MicroMsg.WebViewUI"
            com.tencent.mm.ui.widget.MMWebView r0 = r2.f265348f     // Catch: java.lang.Exception -> L34
            com.tencent.xweb.d1 r0 = r0.mo120147x1d5dd38c()     // Catch: java.lang.Exception -> L34
            goto L43
        L34:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = "getHitTestResult exp %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r5, r0)
            r0 = 0
        L43:
            r5 = r0
            if (r5 == 0) goto La6
            java.lang.String r0 = r5.f301773b
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 == 0) goto L4f
            goto La6
        L4f:
            com.tencent.mm.plugin.webview.stub.v0 r0 = r2.K1     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = r5.f301773b     // Catch: java.lang.Exception -> L67
            boolean r6 = r0.r6(r6)     // Catch: java.lang.Exception -> L67
            if (r6 == 0) goto L7e
            com.tencent.mm.plugin.webview.stub.v0 r0 = r2.K1     // Catch: java.lang.Exception -> L65
            java.lang.String r7 = r5.f301773b     // Catch: java.lang.Exception -> L65
            int r8 = r2.t7()     // Catch: java.lang.Exception -> L65
            r0.Gd(r7, r8)     // Catch: java.lang.Exception -> L65
            goto L7e
        L65:
            r0 = move-exception
            goto L69
        L67:
            r0 = move-exception
            r6 = r4
        L69:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "postBinded, handleEvents, ex = "
            r7.<init>(r8)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r0)
        L7e:
            if (r6 != 0) goto La4
            java.lang.String r0 = r5.f301773b
            android.webkit.WebSettings$RenderPriority r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.f265330v3
            r2.getClass()
            r3 = 2131773387(0x7f1047cb, float:1.917816E38)
            java.lang.String r3 = i65.a.r(r2, r3)
            r5 = 2131773376(0x7f1047c0, float:1.9178138E38)
            java.lang.String r5 = i65.a.r(r2, r5)
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            com.tencent.mm.plugin.webview.ui.tools.hb r5 = new com.tencent.mm.plugin.webview.ui.tools.hb
            r5.<init>(r2, r0)
            java.lang.String r6 = ""
            db5.e1.e(r2, r0, r3, r6, r5)
            goto Lac
        La4:
            r4 = r6
            goto Lac
        La6:
            java.lang.String r0 = "hittestresult getExtra is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            r4 = 0
        Lac:
            java.lang.String r9 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$33"
            java.lang.String r10 = "android/view/View$OnLongClickListener"
            java.lang.String r11 = "onLongClick"
            java.lang.String r12 = "(Landroid/view/View;)Z"
            r7 = r4
            r8 = r13
            yj0.a.i(r7, r8, r9, r10, r11, r12)
            return r4
        Lba:
            java.lang.String r9 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$33"
            java.lang.String r10 = "android/view/View$OnLongClickListener"
            java.lang.String r11 = "onLongClick"
            java.lang.String r12 = "(Landroid/view/View;)Z"
            r7 = 1
            r8 = r13
            yj0.a.i(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fb.onLongClick(android.view.View):boolean");
    }
}

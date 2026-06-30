package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public final class s0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo0 f268360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19315x634a5a88 f268361e;

    public s0(r45.oo0 oo0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19315x634a5a88 c19315x634a5a88) {
        this.f268360d = oo0Var;
        this.f268361e = c19315x634a5a88;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        r45.oo0 oo0Var = this.f268360d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oo0Var.f463923e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenSdkFaceDetectInfoLayout", "promptInfo url is null");
        } else {
            java.lang.String url = oo0Var.f463923e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19315x634a5a88.f265174n;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19315x634a5a88 c19315x634a5a88 = this.f268361e;
            c19315x634a5a88.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenSdkFaceDetectInfoLayout", "jumpToWebView url is null");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", url);
                intent.putExtra("showShare", false);
                intent.putExtra("geta8key_username", c01.z1.r());
                j45.l.j(c19315x634a5a88.m74380x3c6fed6a(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setColor(this.f268361e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
    }
}

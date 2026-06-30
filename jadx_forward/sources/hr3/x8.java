package hr3;

/* loaded from: classes.dex */
public final class x8 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.z8 f365708a;

    public x8(hr3.z8 z8Var) {
        this.f365708a = z8Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn));
        sb6.append("/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=");
        hr3.z8 z8Var = this.f365708a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(z8Var.m80379x76847179()));
        java.lang.String sb7 = sb6.toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", sb7);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(z8Var.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}

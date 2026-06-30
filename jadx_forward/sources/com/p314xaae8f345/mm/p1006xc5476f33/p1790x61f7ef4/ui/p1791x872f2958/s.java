package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class s implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 f224914a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1) {
        this.f224914a = activityC16174xab39c6e1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1 = this.f224914a;
        activityC16174xab39c6e1.mo48674x36654fab();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(activityC16174xab39c6e1.mo55332x76847179());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(activityC16174xab39c6e1.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}

package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class g extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f145703e = activityC10332x8a1129f5;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(268435456);
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/newreadtemplate?t=work_wechat/about_group");
        j45.l.j(this.f145703e, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}

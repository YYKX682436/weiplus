package hr3;

/* loaded from: classes.dex */
public class ic implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d f365189a;

    public ic(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d) {
        this.f365189a = activityC16864x5bbaf71d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d = this.f365189a;
        activityC16864x5bbaf71d.mo48674x36654fab();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(activityC16864x5bbaf71d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(activityC16864x5bbaf71d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}

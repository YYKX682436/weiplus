package uf5;

/* loaded from: classes.dex */
public class e0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 f508750a;

    public e0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 activityC22346xe85a7ad0) {
        this.f508750a = activityC22346xe85a7ad0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 activityC22346xe85a7ad0 = this.f508750a;
        activityC22346xe85a7ad0.mo48674x36654fab();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(activityC22346xe85a7ad0.mo55332x76847179());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(activityC22346xe85a7ad0.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}

package a44;

/* loaded from: classes4.dex */
public final class n extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 f82830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82831e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3, java.lang.String str) {
        this.f82830d = c17705x7d0622a3;
        this.f82831e = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/download/ComplianceManagementView$appendLinkStr$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3.f244168h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = this.f82830d;
        c17705x7d0622a3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        java.lang.String str = this.f82831e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c17705x7d0622a3.f244169d, "openUrl but url is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(c17705x7d0622a3.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/download/ComplianceManagementView$appendLinkStr$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDrawState", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f82830d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDrawState", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
    }
}

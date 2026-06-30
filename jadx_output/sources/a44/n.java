package a44;

/* loaded from: classes4.dex */
public final class n extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView f1297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1298e;

    public n(com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView, java.lang.String str) {
        this.f1297d = complianceManagementView;
        this.f1298e = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/download/ComplianceManagementView$appendLinkStr$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        int i17 = com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView.f162635h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = this.f1297d;
        complianceManagementView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        java.lang.String str = this.f1298e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(complianceManagementView.f162636d, "openUrl but url is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(complianceManagementView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$openUrl", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/download/ComplianceManagementView$appendLinkStr$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f1297d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView$appendLinkStr$clickableSpan$1");
    }
}

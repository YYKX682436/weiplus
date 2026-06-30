package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class xl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2 f243296d;

    public xl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2 activityC17460x8b5f64b2) {
        this.f243296d = activityC17460x8b5f64b2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=signup/secondaryid_faq");
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2 activityC17460x8b5f64b2 = this.f243296d;
        j45.l.j(activityC17460x8b5f64b2.mo55332x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, activityC17460x8b5f64b2.f242198g, wo.w0.k(), 0, 2, 1001, 10103, null, java.lang.Integer.valueOf(activityC17460x8b5f64b2.f242196e));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

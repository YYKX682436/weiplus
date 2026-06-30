package p61;

/* loaded from: classes.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 f433772d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5) {
        this.f433772d = activityC11364xda6e5bc5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5 = this.f433772d;
        intent.putExtra("rawUrl", (java.lang.String) activityC11364xda6e5bc5.f154544z.get(".sysmsg.BindPhoneGuidance.guidanceHelp.jumpUrl"));
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.n(activityC11364xda6e5bc5.mo55332x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

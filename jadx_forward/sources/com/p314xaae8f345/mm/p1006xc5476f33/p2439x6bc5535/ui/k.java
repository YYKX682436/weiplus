package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269552d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5) {
        this.f269552d = activityC19503x99c967c5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5 = this.f269552d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "spam url %s", activityC19503x99c967c5.f269507t);
        if (activityC19503x99c967c5.f269494d != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19503x99c967c5.f269507t)) {
            activityC19503x99c967c5.W6();
        } else {
            java.lang.String str = activityC19503x99c967c5.f269507t;
            activityC19503x99c967c5.D = true;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
            intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
            j45.l.n(activityC19503x99c967c5, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54061x54ac4478);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

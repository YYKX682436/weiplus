package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19326x8fe40e17 f265425d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19326x8fe40e17 activityC19326x8fe40e17) {
        this.f265425d = activityC19326x8fe40e17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19326x8fe40e17 activityC19326x8fe40e17 = this.f265425d;
        android.os.Bundle extras = activityC19326x8fe40e17.getIntent().getExtras();
        android.content.Intent putExtras = extras != null ? new android.content.Intent().putExtras(extras) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthWechatUI", "click agree!");
        j45.l.j(activityC19326x8fe40e17, "webview", ".ui.tools.SDKOAuthUI", putExtras, null);
        activityC19326x8fe40e17.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

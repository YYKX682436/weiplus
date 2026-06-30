package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class la implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 f145841d;

    public la(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5) {
        this.f145841d = activityC10361xc5a22f5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5 = this.f145841d;
        if (activityC10361xc5a22f5.f145426f.getVisibility() == 0) {
            android.content.Intent intent = new android.content.Intent();
            activityC10361xc5a22f5.f145436s = activityC10361xc5a22f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572373b00, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            intent.putExtra("rawUrl", activityC10361xc5a22f5.f145436s);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("showShare", false);
            j45.l.n(activityC10361xc5a22f5, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 500);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

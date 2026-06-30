package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class ga implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10360x717b2f32 f145719d;

    public ga(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10360x717b2f32 activityC10360x717b2f32) {
        this.f145719d = activityC10360x717b2f32;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object[] objArr = {com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()};
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10360x717b2f32 activityC10360x717b2f32 = this.f145719d;
        intent.putExtra("rawUrl", activityC10360x717b2f32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572373b00, objArr));
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.m(activityC10360x717b2f32, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

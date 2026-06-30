package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ga implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeResultUI f64186d;

    public ga(com.tencent.mm.chatroom.ui.RoomUpgradeResultUI roomUpgradeResultUI) {
        this.f64186d = roomUpgradeResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.m2.d()};
        com.tencent.mm.chatroom.ui.RoomUpgradeResultUI roomUpgradeResultUI = this.f64186d;
        intent.putExtra("rawUrl", roomUpgradeResultUI.getString(com.tencent.mm.R.string.f490840b00, objArr));
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.m(roomUpgradeResultUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

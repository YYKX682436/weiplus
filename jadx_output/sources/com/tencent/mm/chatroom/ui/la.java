package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class la implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64308d;

    public la(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI) {
        this.f64308d = roomUpgradeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI = this.f64308d;
        if (roomUpgradeUI.f63893f.getVisibility() == 0) {
            android.content.Intent intent = new android.content.Intent();
            roomUpgradeUI.f63903s = roomUpgradeUI.getString(com.tencent.mm.R.string.f490840b00, com.tencent.mm.sdk.platformtools.m2.d());
            intent.putExtra("rawUrl", roomUpgradeUI.f63903s);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("showShare", false);
            j45.l.n(roomUpgradeUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 500);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

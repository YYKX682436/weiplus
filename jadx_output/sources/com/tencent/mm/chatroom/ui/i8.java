package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f64227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f64228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAlphaProcessUI f64229f;

    public i8(com.tencent.mm.chatroom.ui.RoomAlphaProcessUI roomAlphaProcessUI, boolean z17, int i17) {
        this.f64229f = roomAlphaProcessUI;
        this.f64227d = z17;
        this.f64228e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.RoomAlphaProcessUI roomAlphaProcessUI = this.f64229f;
        android.content.Intent intent = new android.content.Intent(roomAlphaProcessUI, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomUpgradeUI.class);
        intent.setFlags(603979776);
        intent.putExtra("room_name", roomAlphaProcessUI.f63839d);
        intent.putExtra("upgrade_success", this.f64227d);
        intent.putExtra("left_quota", this.f64228e);
        com.tencent.mm.chatroom.ui.RoomAlphaProcessUI roomAlphaProcessUI2 = this.f64229f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(roomAlphaProcessUI2, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        roomAlphaProcessUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(roomAlphaProcessUI2, "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

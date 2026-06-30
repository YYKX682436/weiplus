package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class oa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64412d;

    public oa(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI) {
        this.f64412d = roomUpgradeUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI = this.f64412d;
        if (roomUpgradeUI.f63901q != null) {
            gm0.j1.n().f273288b.d(roomUpgradeUI.f63901q);
            roomUpgradeUI.f63901q = null;
        }
        roomUpgradeUI.finish();
    }
}

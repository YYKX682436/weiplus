package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class pa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64429d;

    public pa(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI) {
        this.f64429d = roomUpgradeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f64429d.finish();
    }
}

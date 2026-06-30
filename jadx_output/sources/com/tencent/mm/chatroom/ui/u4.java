package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class u4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64569e;

    public u4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64569e = modRemarkRoomNameUI;
        this.f64568d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.roomsdk.model.factory.a aVar = this.f64568d;
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64569e;
        aVar.c(modRemarkRoomNameUI.getContext(), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490573yv), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.bcr), false, false, null);
    }
}

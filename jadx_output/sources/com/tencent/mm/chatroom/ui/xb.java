package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class xb implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64669d;

    public xb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64669d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f64669d.a();
    }
}

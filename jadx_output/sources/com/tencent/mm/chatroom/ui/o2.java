package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class o2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64402d;

    public o2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64402d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f64402d.a();
    }
}

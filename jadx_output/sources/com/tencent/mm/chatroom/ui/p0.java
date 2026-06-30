package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64418d;

    public p0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64418d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f64418d.a();
    }
}

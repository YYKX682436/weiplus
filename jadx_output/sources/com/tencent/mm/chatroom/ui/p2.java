package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class p2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd0.f f64420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DelChatroomMemberUI f64421e;

    public p2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, gd0.f fVar) {
        this.f64421e = delChatroomMemberUI;
        this.f64420d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gd0.f fVar = this.f64420d;
        if (fVar != null) {
            ((com.tencent.mm.roomsdk.model.factory.h) fVar).a();
        }
        com.tencent.mm.roomsdk.model.factory.a aVar = this.f64421e.f63756q;
        if (aVar != null) {
            aVar.a();
        }
    }
}

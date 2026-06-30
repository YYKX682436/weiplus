package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class s extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, android.os.Looper looper) {
        super(looper);
        this.f64493a = chatroomInfoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        boolean z17 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64493a;
        chatroomInfoUI.A7();
        java.lang.String D0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().D0(chatroomInfoUI.A);
        java.lang.String str = chatroomInfoUI.Q;
        if (str == null || str.equals(D0)) {
            return;
        }
        chatroomInfoUI.d1();
    }
}

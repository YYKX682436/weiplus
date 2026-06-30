package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class o0 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64400a;

    public o0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64400a = chatroomInfoUI;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        tm.a b17 = tm.a.b(str);
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64400a;
        if (b17 != null) {
            b17.c(chatroomInfoUI, null, null);
            return;
        }
        if (i18 == -66) {
            db5.e1.s(chatroomInfoUI, chatroomInfoUI.getString(com.tencent.mm.R.string.bo_), chatroomInfoUI.getString(com.tencent.mm.R.string.f490573yv));
        } else {
            java.lang.String string = chatroomInfoUI.getString(com.tencent.mm.R.string.boa);
            if (str == null) {
                str = string;
            }
            db5.e1.s(chatroomInfoUI, str, chatroomInfoUI.getString(com.tencent.mm.R.string.f490573yv));
        }
        chatroomInfoUI.d1();
        chatroomInfoUI.Z0();
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionCallbackFunc", "[delChatroomMember] onResult errType:%s errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}

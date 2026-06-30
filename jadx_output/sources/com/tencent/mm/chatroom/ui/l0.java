package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class l0 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.m0 f64296d;

    public l0(com.tencent.mm.chatroom.ui.m0 m0Var) {
        this.f64296d = m0Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f343223a) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "deleteChatroomImp2 errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        com.tencent.mm.chatroom.ui.m0 m0Var = this.f64296d;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = m0Var.f64351f;
        boolean z18 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        chatroomInfoUI.i7();
        int i19 = this.f343223a;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2 = m0Var.f64351f;
        if (i19 == 0) {
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.Z6(chatroomInfoUI2, m0Var.f64350e);
        } else {
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y6(chatroomInfoUI2, fVar);
        }
    }
}

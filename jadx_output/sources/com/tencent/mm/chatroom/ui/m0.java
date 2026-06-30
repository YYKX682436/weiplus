package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class m0 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64351f;

    public m0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, java.lang.String str, java.lang.String str2) {
        this.f64351f = chatroomInfoUI;
        this.f64349d = str;
        this.f64350e = str2;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "deleteChatroomImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64351f;
        if (!com.tencent.mm.storage.z3.N4(chatroomInfoUI.A)) {
            chatroomInfoUI.i7();
            if (this.f343223a == 0) {
                com.tencent.mm.chatroom.ui.ChatroomInfoUI.Z6(chatroomInfoUI, this.f64350e);
                return;
            } else {
                com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y6(chatroomInfoUI, fVar);
                return;
            }
        }
        if (this.f343223a != 0) {
            chatroomInfoUI.i7();
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y6(chatroomInfoUI, fVar);
            return;
        }
        r45.sb0 sb0Var = new r45.sb0();
        r45.du5 du5Var = new r45.du5();
        java.lang.String str2 = this.f64349d;
        du5Var.f372756d = str2 != null ? str2 : "";
        du5Var.f372757e = true;
        sb0Var.f385605d = du5Var;
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.h hVar = new com.tencent.mm.roomsdk.model.factory.h(true);
        chatroomInfoUI.U = hVar;
        xg3.p0 p0Var = new xg3.p0(7, sb0Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(p0Var);
        hVar.f192266f = new e21.k(linkedList);
        com.tencent.mm.roomsdk.model.factory.a aVar = chatroomInfoUI.U;
        aVar.f192248d = new com.tencent.mm.chatroom.ui.l0(this);
        aVar.b();
    }
}

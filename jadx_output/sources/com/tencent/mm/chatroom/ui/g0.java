package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class g0 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64171d;

    public g0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64171d = chatroomInfoUI;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "quitChatroom errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        if (com.tencent.mm.storage.z3.N4(this.f64171d.A)) {
            if (this.f343223a == 0) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.chatroom.ui.f0(this));
                return;
            } else {
                this.f64171d.i7();
                com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y6(this.f64171d, fVar);
                return;
            }
        }
        this.f64171d.i7();
        if (this.f343223a == 0) {
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.X6(this.f64171d);
        } else {
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y6(this.f64171d, fVar);
        }
    }
}

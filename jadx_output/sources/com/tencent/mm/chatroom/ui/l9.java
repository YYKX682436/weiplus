package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class l9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI f64306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f64307b;

    public l9(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI, java.util.LinkedList linkedList) {
        this.f64306a = roomSpecialFollowMemberManagerUI;
        this.f64307b = linkedList;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.chatroom.ui.b9 b9Var = com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.f63855u;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 447;
        objArr[1] = java.lang.Integer.valueOf(fVar.f70616b);
        objArr[2] = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.String str = fVar.f70617c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f64306a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = roomSpecialFollowMemberManagerUI.f63864o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.T6(roomSpecialFollowMemberManagerUI, this.f64307b);
            return null;
        }
        androidx.appcompat.app.AppCompatActivity context = roomSpecialFollowMemberManagerUI.getContext();
        java.lang.String str2 = fVar.f70617c;
        java.lang.String string = roomSpecialFollowMemberManagerUI.getString(com.tencent.mm.R.string.f493408k22);
        if (str2 == null) {
            str2 = string;
        }
        db5.e1.s(context, str2, roomSpecialFollowMemberManagerUI.getString(com.tencent.mm.R.string.f490573yv));
        return null;
    }
}

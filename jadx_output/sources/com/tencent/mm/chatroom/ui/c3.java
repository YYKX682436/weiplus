package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class c3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupAdminManagerUI f64066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f64067b;

    public c3(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI, java.util.LinkedList linkedList) {
        this.f64066a = groupAdminManagerUI;
        this.f64067b = linkedList;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = this.f64066a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = groupAdminManagerUI.f63765i;
        if (u3Var != null && u3Var.isShowing()) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = groupAdminManagerUI.f63765i;
            kotlin.jvm.internal.o.d(u3Var2);
            u3Var2.dismiss();
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.chatroom.ui.GroupAdminManagerUI.T6(groupAdminManagerUI, this.f64067b);
            return null;
        }
        if (fVar.f70619e.getType() != 889) {
            return null;
        }
        int i17 = com.tencent.mm.chatroom.ui.GroupAdminManagerUI.f63759q;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 774;
        objArr[1] = java.lang.Integer.valueOf(fVar.f70616b);
        objArr[2] = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.String str = fVar.f70617c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "CgiAddChatRoomAdmin scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        androidx.appcompat.app.AppCompatActivity context = groupAdminManagerUI.getContext();
        java.lang.String str2 = fVar.f70617c;
        java.lang.String string = groupAdminManagerUI.getString(com.tencent.mm.R.string.f489832d0);
        if (str2 == null) {
            str2 = string;
        }
        db5.e1.s(context, str2, groupAdminManagerUI.getString(com.tencent.mm.R.string.f490573yv));
        return null;
    }
}

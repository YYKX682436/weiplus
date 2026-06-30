package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class hb implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f64211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomManagerUI f64212b;

    public hb(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI, java.util.LinkedList linkedList) {
        this.f64212b = seeRoomManagerUI;
        this.f64211a = linkedList;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI = this.f64212b;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = seeRoomManagerUI.f63933h;
        if (u3Var != null && u3Var.isShowing()) {
            seeRoomManagerUI.f63933h.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f70617c);
        if (b17 != null) {
            b17.c(seeRoomManagerUI, null, null);
        } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.chatroom.ui.SeeRoomManagerUI.T6(seeRoomManagerUI, this.f64211a);
            seeRoomManagerUI.f63932g.notifyDataSetChanged();
        } else if (fVar.f70619e.getType() == 3677) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = 774;
            objArr[1] = java.lang.Integer.valueOf(fVar.f70616b);
            objArr[2] = java.lang.Integer.valueOf(fVar.f70615a);
            java.lang.String str = fVar.f70617c;
            if (str == null) {
                str = "";
            }
            objArr[3] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
            db5.e1.s(seeRoomManagerUI.getContext(), seeRoomManagerUI.getString(com.tencent.mm.R.string.bo6), seeRoomManagerUI.getString(com.tencent.mm.R.string.f490573yv));
        }
        return null;
    }
}

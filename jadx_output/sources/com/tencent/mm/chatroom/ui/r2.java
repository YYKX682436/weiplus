package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class r2 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.s2 f64471d;

    public r2(com.tencent.mm.chatroom.ui.s2 s2Var) {
        this.f64471d = s2Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f343223a) : "null";
        com.tencent.mars.xlog.Log.i("Micromsg.RoomOpLogResult", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        int i19 = this.f343223a;
        com.tencent.mm.chatroom.ui.s2 s2Var = this.f64471d;
        if (i19 == 0) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = s2Var.f64499e.f64563d.f64590e;
            delChatroomMemberUI.f63756q = com.tencent.mm.chatroom.ui.DelChatroomMemberUI.T6(delChatroomMemberUI, s2Var.f64498d.d1(), true);
            return;
        }
        android.app.ProgressDialog progressDialog = s2Var.f64499e.f64563d.f64590e.f63757r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.chatroom.ui.u2 u2Var = s2Var.f64499e;
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI2 = u2Var.f64563d.f64590e;
        java.lang.String string = delChatroomMemberUI2.getString(com.tencent.mm.R.string.ign);
        com.tencent.mm.chatroom.ui.v2 v2Var = u2Var.f64563d;
        db5.e1.y(delChatroomMemberUI2, string, "", v2Var.f64590e.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.chatroom.ui.q2(this));
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI3 = v2Var.f64590e;
        if (delChatroomMemberUI3.f63753n == 1) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.U6(delChatroomMemberUI3, delChatroomMemberUI3.f63758s, delChatroomMemberUI3.f63754o, delChatroomMemberUI3.f63750h, v2Var.getCount(), 1, 3, s2Var.f64498d.d1());
        }
    }
}

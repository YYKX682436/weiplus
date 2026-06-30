package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class k2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f64266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f64267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DelChatroomMemberUI f64268d;

    public k2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, java.lang.String str, boolean z17, java.util.List list) {
        this.f64268d = delChatroomMemberUI;
        this.f64265a = str;
        this.f64266b = z17;
        this.f64267c = list;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.storage.z3 z3Var;
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = this.f64268d;
        if (delChatroomMemberUI.f63753n == 1) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.U6(delChatroomMemberUI, delChatroomMemberUI.f63758s, delChatroomMemberUI.f63754o, delChatroomMemberUI.f63750h, delChatroomMemberUI.f63747e.getCount(), 1, 2, this.f64265a);
        }
        android.app.ProgressDialog progressDialog = delChatroomMemberUI.f63757r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        db5.e1.T(delChatroomMemberUI, this.f64266b ? delChatroomMemberUI.getString(com.tencent.mm.R.string.igm) : delChatroomMemberUI.getString(com.tencent.mm.R.string.i4o));
        com.tencent.mm.chatroom.ui.v2 v2Var = delChatroomMemberUI.f63747e;
        v2Var.getClass();
        boolean z17 = false;
        for (java.lang.String str2 : this.f64267c) {
            java.util.List list = v2Var.f64589d;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    z3Var = (com.tencent.mm.storage.z3) it.next();
                    if (z3Var.d1().equals(str2)) {
                        break;
                    }
                } else {
                    z3Var = null;
                    break;
                }
            }
            if (z3Var != null) {
                ((java.util.LinkedList) list).remove(z3Var);
                z17 = true;
            }
        }
        if (z17) {
            v2Var.notifyDataSetChanged();
        }
        delChatroomMemberUI.f63746d.post(new com.tencent.mm.chatroom.ui.j2(this));
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class n2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DelChatroomMemberUI f64386b;

    public n2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI, java.lang.String str) {
        this.f64386b = delChatroomMemberUI;
        this.f64385a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = this.f64386b;
        android.app.ProgressDialog progressDialog = delChatroomMemberUI.f63757r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        if (i18 == -2024) {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(delChatroomMemberUI, null, null);
                return;
            }
            db5.e1.E(delChatroomMemberUI.getContext(), delChatroomMemberUI.getString(com.tencent.mm.R.string.i4k), null, delChatroomMemberUI.getString(com.tencent.mm.R.string.i4l), false, new com.tencent.mm.chatroom.ui.l2(this));
        } else {
            db5.e1.E(delChatroomMemberUI, delChatroomMemberUI.getString(com.tencent.mm.R.string.i4u), null, delChatroomMemberUI.getString(com.tencent.mm.R.string.f490507x1), false, new com.tencent.mm.chatroom.ui.m2(this));
        }
        if (delChatroomMemberUI.f63753n == 1) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.U6(delChatroomMemberUI, delChatroomMemberUI.f63758s, delChatroomMemberUI.f63754o, delChatroomMemberUI.f63750h, delChatroomMemberUI.f63747e.getCount(), 1, 3, this.f64385a);
        }
    }
}

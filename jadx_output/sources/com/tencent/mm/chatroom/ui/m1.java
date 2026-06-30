package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f64353e;

    public m1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI, boolean z17) {
        this.f64352d = chatroomManagerUI;
        this.f64353e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.chatroom.ui.ChatroomManagerUI.f63727s;
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64352d;
        java.lang.String Z6 = chatroomManagerUI.Z6();
        p75.n0 n0Var = dm.x1.N;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.x1.T);
        p75.d dVar = dm.x1.Q;
        p75.m0 j17 = dVar.j(Z6);
        p75.i0 g17 = dm.x1.N.g(linkedList);
        g17.f352657d = j17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        jm0.l lVar = dm.x1.Y1;
        dm.x1 x1Var = (dm.x1) a17.o(lVar.Q4(), dm.x1.class);
        int i18 = (x1Var != null ? x1Var.field_chatroomStatus : 0) | Integer.MIN_VALUE;
        boolean z17 = this.f64353e;
        int i19 = z17 ? i18 | 4 : i18 & (-5);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chatroomStatus", java.lang.Integer.valueOf(i19));
        java.lang.String Z62 = chatroomManagerUI.Z6();
        kotlin.jvm.internal.o.f(Z62, "access$getMRoomId(...)");
        p75.m0 j18 = dVar.j(Z62);
        p75.h1 j19 = dm.x1.N.j(contentValues);
        j19.b(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "dealModOnlyAdmin updateStatus mRoomId:%s isChecked:%s status:%s updateResult:%s", chatroomManagerUI.Z6(), java.lang.Boolean.valueOf(z17), java.lang.Integer.toBinaryString(i19), java.lang.Integer.valueOf(j19.a().f(lVar.Q4())));
    }
}

package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee f145885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f145886e;

    public m1(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee, boolean z17) {
        this.f145885d = activityC10339x9e5e23ee;
        this.f145886e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee.f145260s;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee = this.f145885d;
        java.lang.String Z6 = activityC10339x9e5e23ee.Z6();
        p75.n0 n0Var = dm.x1.N;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.x1.T);
        p75.d dVar = dm.x1.Q;
        p75.m0 j17 = dVar.j(Z6);
        p75.i0 g17 = dm.x1.N.g(linkedList);
        g17.f434190d = j17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        jm0.l lVar = dm.x1.Y1;
        dm.x1 x1Var = (dm.x1) a17.o(lVar.Q4(), dm.x1.class);
        int i18 = (x1Var != null ? x1Var.f69084x8729abea : 0) | Integer.MIN_VALUE;
        boolean z17 = this.f145886e;
        int i19 = z17 ? i18 | 4 : i18 & (-5);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chatroomStatus", java.lang.Integer.valueOf(i19));
        java.lang.String Z62 = activityC10339x9e5e23ee.Z6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z62, "access$getMRoomId(...)");
        p75.m0 j18 = dVar.j(Z62);
        p75.h1 j19 = dm.x1.N.j(contentValues);
        j19.b(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomManagerUI", "dealModOnlyAdmin updateStatus mRoomId:%s isChecked:%s status:%s updateResult:%s", activityC10339x9e5e23ee.Z6(), java.lang.Boolean.valueOf(z17), java.lang.Integer.toBinaryString(i19), java.lang.Integer.valueOf(j19.a().f(lVar.Q4())));
    }
}

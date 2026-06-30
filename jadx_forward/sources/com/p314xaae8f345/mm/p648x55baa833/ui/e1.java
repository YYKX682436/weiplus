package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145656d;

    public e1(com.p314xaae8f345.mm.p648x55baa833.ui.f1 f1Var, java.lang.String str) {
        this.f145656d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a17.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update chatroom set modifytime = ");
        sb6.append(currentTimeMillis);
        sb6.append(" where chatroomname = '");
        java.lang.String str = this.f145656d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        a17.f275303d.A("chatroom", sb6.toString());
    }

    /* renamed from: toString */
    public java.lang.String m43538x9616526c() {
        return super.toString() + "|getContactCallBack";
    }
}

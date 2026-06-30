package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64123d;

    public e1(com.tencent.mm.chatroom.ui.f1 f1Var, java.lang.String str) {
        this.f64123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a17.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update chatroom set modifytime = ");
        sb6.append(currentTimeMillis);
        sb6.append(" where chatroomname = '");
        java.lang.String str = this.f64123d;
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        a17.f193770d.A("chatroom", sb6.toString());
    }

    public java.lang.String toString() {
        return super.toString() + "|getContactCallBack";
    }
}

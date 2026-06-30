package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f64294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64295e;

    public l(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, c01.o8 o8Var) {
        this.f64295e = chatroomInfoUI;
        this.f64294d = o8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((c01.k7) c01.n8.a()).b(this.f64295e.F.field_chatroomname, 30, this.f64294d);
    }

    public java.lang.String toString() {
        return super.toString() + "|getContactCallBack2";
    }
}

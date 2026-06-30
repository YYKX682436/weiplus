package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64437e;

    public q0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, int i17) {
        this.f64437e = chatroomInfoUI;
        this.f64436d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64437e;
        android.view.View x17 = ((com.tencent.mm.ui.base.preference.b) chatroomInfoUI.f63693h).x(this.f64436d, chatroomInfoUI.getListView());
        if (x17 != null) {
            zg5.a.a(chatroomInfoUI.getContext(), x17);
        }
    }
}

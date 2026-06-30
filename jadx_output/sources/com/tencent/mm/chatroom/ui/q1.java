package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        super(0);
        this.f64438d = chatroomManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f64438d.getPreferenceScreen();
        if (preferenceScreen != null) {
            return ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("room_bind_app_info_key");
        }
        return null;
    }
}

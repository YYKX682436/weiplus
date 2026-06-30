package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        super(0);
        this.f64470d = chatroomManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f64470d.getIntent().getStringExtra("RoomInfo_Id");
        return stringExtra == null ? "" : stringExtra;
    }
}

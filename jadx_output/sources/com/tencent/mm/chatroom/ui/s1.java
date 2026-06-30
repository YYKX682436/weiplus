package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        super(0);
        this.f64497d = chatroomManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f64497d.getIntent().getStringExtra("room_owner_name");
    }
}

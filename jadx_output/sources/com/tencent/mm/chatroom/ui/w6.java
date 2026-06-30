package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class w6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        super(0);
        this.f64619d = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f64619d.getIntent().getStringExtra("intent_chatroom_username");
        return stringExtra == null ? "" : stringExtra;
    }
}

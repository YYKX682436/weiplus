package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        super(0);
        this.f64684d = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((com.tencent.mm.storage.a3) ((jz5.n) this.f64684d.f63830e).getValue()).field_roomowner, c01.z1.r()));
    }
}

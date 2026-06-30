package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class d7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        super(0);
        this.f64112d = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope(this.f64112d.getClass().getSimpleName().concat("_LifecycleScope"), this.f64112d, 0, 4, null);
    }
}

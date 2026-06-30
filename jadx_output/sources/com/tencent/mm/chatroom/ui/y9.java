package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class y9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64688d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f64688d.getIntent().getStringExtra("RoomInfo_Id");
        return stringExtra == null ? "" : stringExtra;
    }
}

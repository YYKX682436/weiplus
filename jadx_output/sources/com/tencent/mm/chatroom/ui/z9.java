package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class z9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64723d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64723d;
        sb6.append(roomStillNotifyMessageManagerUI.getPackageName());
        sb6.append("_preferences");
        return roomStillNotifyMessageManagerUI.getSharedPreferences(sb6.toString(), 0);
    }
}

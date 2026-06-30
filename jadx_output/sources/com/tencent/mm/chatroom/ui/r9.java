package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64484d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        int i17 = com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI.f63870q;
        java.lang.String X6 = this.f64484d.X6();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (X6 == null) {
            X6 = "";
        }
        return a17.z0(X6);
    }
}

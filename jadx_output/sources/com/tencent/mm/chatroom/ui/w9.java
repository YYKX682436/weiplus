package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class w9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64622d;

    public w9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        this.f64622d = roomStillNotifyMessageManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64622d;
        g4Var.d(0, roomStillNotifyMessageManagerUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), roomStillNotifyMessageManagerUI.getContext().getString(com.tencent.mm.R.string.lnt));
    }
}

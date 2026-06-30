package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public final class j9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI f64256d;

    public j9(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
        this.f64256d = roomSpecialFollowMemberManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f64256d;
        g4Var.d(0, roomSpecialFollowMemberManagerUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), roomSpecialFollowMemberManagerUI.getContext().getString(com.tencent.mm.R.string.lnt));
    }
}

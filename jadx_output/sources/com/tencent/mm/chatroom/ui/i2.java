package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class i2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DelChatroomMemberUI f64218d;

    public i2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI) {
        this.f64218d = delChatroomMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = this.f64218d;
        if (delChatroomMemberUI.f63753n == 1) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.U6(delChatroomMemberUI, delChatroomMemberUI.f63758s, delChatroomMemberUI.f63754o, delChatroomMemberUI.f63750h, delChatroomMemberUI.f63747e.getCount(), 0, 1, "");
        }
        this.f64218d.finish();
        return true;
    }
}

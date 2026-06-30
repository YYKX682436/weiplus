package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class de implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI f64120d;

    public de(com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI) {
        this.f64120d = selectedMemberChattingRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = this.f64120d;
        selectedMemberChattingRecordUI.setResult(0);
        selectedMemberChattingRecordUI.finish();
        return true;
    }
}

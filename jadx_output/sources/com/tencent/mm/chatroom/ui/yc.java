package com.tencent.mm.chatroom.ui;

/* loaded from: classes9.dex */
public class yc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64694d;

    public yc(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI) {
        this.f64694d = selectMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64694d;
        selectMemberUI.setResult(0, intent);
        selectMemberUI.finish();
        return true;
    }
}

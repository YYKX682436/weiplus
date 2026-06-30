package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class mc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDateUI f64376d;

    public mc(com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI) {
        this.f64376d = selectDateUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64376d.finish();
        return true;
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class qa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI f64460d;

    public qa(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        this.f64460d = seeAccessVerifyInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64460d.finish();
        return true;
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class y2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupAdminManagerUI f64679d;

    public y2(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI) {
        this.f64679d = groupAdminManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64679d.finish();
        return true;
    }
}

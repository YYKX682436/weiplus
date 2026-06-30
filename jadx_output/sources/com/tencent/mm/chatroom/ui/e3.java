package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class e3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupAdminManagerUI f64125d;

    public e3(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI) {
        this.f64125d = groupAdminManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = com.tencent.mm.chatroom.ui.GroupAdminManagerUI.f63759q;
        com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = this.f64125d;
        g4Var.d(0, groupAdminManagerUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), groupAdminManagerUI.getContext().getString(com.tencent.mm.R.string.lnq));
    }
}

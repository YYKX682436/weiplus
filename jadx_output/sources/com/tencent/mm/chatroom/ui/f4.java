package com.tencent.mm.chatroom.ui;

/* loaded from: classes9.dex */
public final class f4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.InvitationReasonEditorUI f64149d;

    public f4(com.tencent.mm.chatroom.ui.InvitationReasonEditorUI invitationReasonEditorUI) {
        this.f64149d = invitationReasonEditorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64149d.finish();
        return true;
    }
}

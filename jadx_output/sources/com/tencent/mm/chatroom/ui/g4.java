package com.tencent.mm.chatroom.ui;

/* loaded from: classes9.dex */
public final class g4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.InvitationReasonEditorUI f64175d;

    public g4(com.tencent.mm.chatroom.ui.InvitationReasonEditorUI invitationReasonEditorUI) {
        this.f64175d = invitationReasonEditorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.InvitationReasonEditorUI invitationReasonEditorUI = this.f64175d;
        intent.putExtra("intent_key_invitation_reason", java.lang.String.valueOf(((com.tencent.mm.ui.base.NestedScrollEditText) ((jz5.n) invitationReasonEditorUI.f63786d).getValue()).getText()));
        invitationReasonEditorUI.setResult(-1, intent);
        invitationReasonEditorUI.finish();
        return true;
    }
}

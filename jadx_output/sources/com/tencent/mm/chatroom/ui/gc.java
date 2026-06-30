package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class gc extends com.tencent.mm.ui.base.preference.NormalIconPreference {
    public final /* synthetic */ com.tencent.mm.storage.z3 Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI seeRoomOwnerManagerUI, android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        super(context, null);
        this.Y1 = z3Var;
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.L1, this.Y1.d1(), 0.15f);
        this.L1.setVisibility(0);
    }
}

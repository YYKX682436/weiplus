package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class ec extends com.tencent.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI f64135e;

    public ec(com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI seeRoomOwnerManagerUI) {
        this.f64135e = seeRoomOwnerManagerUI;
    }

    @Override // com.tencent.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        this.f64135e.finish();
    }
}

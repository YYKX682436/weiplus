package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class nb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64396d;

    public nb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64396d = seeRoomMemberUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64396d;
        seeRoomMemberUI.f63935d.scrollListBy(seeRoomMemberUI.f63950v);
    }
}

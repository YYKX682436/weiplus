package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class ub implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f64581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64582e;

    public ub(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI, java.util.List list) {
        this.f64582e = seeRoomMemberUI;
        this.f64581d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.cc ccVar = this.f64582e.f63936e;
        if (ccVar != null) {
            ccVar.d(this.f64581d);
        }
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ia f64210d;

    public ha(com.tencent.mm.chatroom.ui.ia iaVar) {
        this.f64210d = iaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ia iaVar = this.f64210d;
        com.tencent.mm.chatroom.ui.RoomUpgradeResultUI roomUpgradeResultUI = iaVar.f64233b;
        java.lang.String str = iaVar.f64232a;
        int i17 = com.tencent.mm.chatroom.ui.RoomUpgradeResultUI.f63881o;
        roomUpgradeResultUI.U6(str);
    }
}

package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.na f64373d;

    public ma(com.tencent.mm.chatroom.ui.na naVar) {
        this.f64373d = naVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.na naVar = this.f64373d;
        com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI = naVar.f64395b;
        java.lang.String str = naVar.f64394a;
        int i17 = com.tencent.mm.chatroom.ui.RoomUpgradeUI.f63890x;
        roomUpgradeUI.V6(str);
    }
}

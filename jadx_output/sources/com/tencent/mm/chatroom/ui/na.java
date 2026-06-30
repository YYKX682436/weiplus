package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class na implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64395b;

    public na(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI, java.lang.String str) {
        this.f64395b = roomUpgradeUI;
        this.f64394a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            this.f64395b.f63894g.post(new com.tencent.mm.chatroom.ui.ma(this));
        }
    }
}

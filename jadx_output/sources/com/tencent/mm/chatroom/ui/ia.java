package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ia implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeResultUI f64233b;

    public ia(com.tencent.mm.chatroom.ui.RoomUpgradeResultUI roomUpgradeResultUI, java.lang.String str) {
        this.f64233b = roomUpgradeResultUI;
        this.f64232a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            this.f64233b.f63884f.post(new com.tencent.mm.chatroom.ui.ha(this));
        }
    }
}

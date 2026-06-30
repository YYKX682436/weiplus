package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class d8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI f64113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
        super(0);
        this.f64113d = roomAccessVerifyApplicationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((com.tencent.mm.storage.a3) ((jz5.n) this.f64113d.f63836e).getValue()).field_roomowner, c01.z1.r()));
    }
}

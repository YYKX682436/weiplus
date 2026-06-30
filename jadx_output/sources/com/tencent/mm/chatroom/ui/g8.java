package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class g8 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI f64184d;

    public g8(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
        this.f64184d = roomAccessVerifyApplicationUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c it = (o75.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomAccessVerifyApplicationUI", "notify, " + it.f343588b);
        pm0.v.X(new com.tencent.mm.chatroom.ui.f8(this.f64184d));
    }
}

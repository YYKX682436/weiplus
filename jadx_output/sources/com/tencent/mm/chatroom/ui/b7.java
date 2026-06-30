package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class b7 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64057d;

    public b7(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        this.f64057d = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c it = (o75.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "notify, " + it.f343588b);
        pm0.v.X(new com.tencent.mm.chatroom.ui.a7(this.f64057d));
    }
}

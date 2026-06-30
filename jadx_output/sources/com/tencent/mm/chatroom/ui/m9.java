package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64372d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI.f63870q;
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64372d;
        roomStillNotifyMessageManagerUI.getClass();
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        java.lang.String string = roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.lns);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String X6 = roomStillNotifyMessageManagerUI.X6();
        kotlin.jvm.internal.o.f(X6, "<get-roomId>(...)");
        java.util.ArrayList arrayList = roomStillNotifyMessageManagerUI.f63877m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.storage.z3) it.next()).d1());
        }
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(roomStillNotifyMessageManagerUI, string, X6, arrayList2, kz5.p0.f313996d, true);
        Ai.putExtra("block_contact", c01.z1.r());
        Ai.putExtra("max_limit_num", com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4) - arrayList.size());
        Ai.putExtra("too_many_member_tip_string", roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.i6k, java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4))));
        Ai.putExtra("too_many_member_tip_ok_string", roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.f490454vi));
        roomStillNotifyMessageManagerUI.startActivityForResult(Ai, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "goToAddFollowerMember");
        return jz5.f0.f302826a;
    }
}

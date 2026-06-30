package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class z8 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomInfoDetailUI f64722a;

    public z8(com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI) {
        this.f64722a = roomInfoDetailUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str;
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI = this.f64722a;
        roomInfoDetailUI.f63853q = false;
        java.lang.String string = roomInfoDetailUI.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI2 = this.f64722a;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(roomInfoDetailUI, string, roomInfoDetailUI2.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.chatroom.ui.w8(this));
        if (roomInfoDetailUI2.f63853q) {
            str = null;
        } else {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(roomInfoDetailUI2.f63847h.d1());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.chatroom.ui.RoomInfoDetailUI.V6(roomInfoDetailUI2, Q);
            return;
        }
        Q.dismiss();
        com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI3 = this.f64722a;
        db5.e1.L(roomInfoDetailUI3, false, roomInfoDetailUI3.getString(com.tencent.mm.R.string.kk_, str), null, roomInfoDetailUI2.getString(com.tencent.mm.R.string.fs8), roomInfoDetailUI2.getString(com.tencent.mm.R.string.b96), new com.tencent.mm.chatroom.ui.x8(this), new com.tencent.mm.chatroom.ui.y8(this, Q), -1, com.tencent.mm.R.color.f478622ch);
    }
}

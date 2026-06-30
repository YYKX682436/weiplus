package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64031e;

    public a5(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, int i17) {
        this.f64031e = modRemarkRoomNameUI;
        this.f64030d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64031e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(modRemarkRoomNameUI.f63824n.getHeight());
        int i17 = this.f64030d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRoomNameUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (modRemarkRoomNameUI.f63824n.getHeight() > i17) {
            modRemarkRoomNameUI.f63823m.scrollBy(0, modRemarkRoomNameUI.f63824n.getHeight() - i17);
        }
    }
}

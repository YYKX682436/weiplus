package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomManagerUI f64084d;

    public cb(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI) {
        this.f64084d = seeRoomManagerUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI = this.f64084d;
        int dimension = (int) (seeRoomManagerUI.getResources().getDimension(com.tencent.mm.R.dimen.f479567j) + seeRoomManagerUI.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3) + seeRoomManagerUI.getResources().getDimension(com.tencent.mm.R.dimen.f479929j9));
        if (seeRoomManagerUI.f63932g.getCount() / 4 > 0) {
            dimension *= (seeRoomManagerUI.f63932g.getCount() / 4) + 1;
        }
        seeRoomManagerUI.f63929d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(seeRoomManagerUI.f63929d.getWidth(), dimension));
    }
}

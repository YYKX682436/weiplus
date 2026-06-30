package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes4.dex */
public class l0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        d43.b bVar = d43.b.f307944d;
        b43.d dVar = d43.b.f307945e;
        synchronized (dVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "pauseKeepAlive");
            dVar.f99339h = true;
            dVar.f99340i = false;
            if (dVar.f99337f != null) {
                gm0.j1.d().d(dVar.f99337f);
            }
        }
        return true;
    }
}

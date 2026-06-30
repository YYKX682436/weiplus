package fh4;

/* loaded from: classes15.dex */
public class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b f344236d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b) {
        this.f344236d = activityC18551xd77e8c9b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "seizeMicTimer reach");
        com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b = this.f344236d;
        if (activityC18551xd77e8c9b.f254004v != 5) {
            return false;
        }
        activityC18551xd77e8c9b.f254004v = 3;
        dh4.l.Di().s();
        activityC18551xd77e8c9b.A.c(100L, 100L);
        return false;
    }
}

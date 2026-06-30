package fs3;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347842d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        this.f347842d = activityC16925x87b5f55d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347842d;
        if (activityC16925x87b5f55d.f236301v || (c19621x752a03d5 = activityC16925x87b5f55d.f236290i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cancel refresh chat room member.");
            return false;
        }
        activityC16925x87b5f55d.Q = new es3.a(0, activityC16925x87b5f55d.f236291m, activityC16925x87b5f55d.f236302w, c19621x752a03d5.f270899d, c19621x752a03d5.f270900e, c19621x752a03d5.f270901f, c19621x752a03d5.f270902g, c19621x752a03d5.f270903h, c19621x752a03d5.f270904i);
        c01.d9.e().g(activityC16925x87b5f55d.Q);
        return false;
    }
}

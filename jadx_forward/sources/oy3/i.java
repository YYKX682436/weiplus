package oy3;

/* loaded from: classes13.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431562d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431562d = activityC17256xc70b42d4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "handler msg " + msg.what);
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431562d;
        switch (i17) {
            case 1001:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431553d, 0);
                return true;
            case 1002:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431554e, 0);
                return true;
            case 1003:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431555f, 0);
                return true;
            case 1004:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431556g, msg.arg1);
                return true;
            case 1005:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431557h, 0);
                return true;
            case 1006:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431558i, 0);
                return true;
            case 1007:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431559m, 0);
                return true;
            case 1008:
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.T6(activityC17256xc70b42d4, oy3.h.f431560n, 0);
                return true;
            default:
                return true;
        }
    }
}

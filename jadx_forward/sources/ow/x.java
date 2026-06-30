package ow;

/* loaded from: classes9.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.x f430806a = new ow.x();

    public final void a(long j17, java.lang.String latestNotifyMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestNotifyMsgId, "latestNotifyMsgId");
        if (latestNotifyMsgId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] scheduleNotifyMsg latestNotifyMsgId exception");
            return;
        }
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis() + (j17 * 60 * 1000));
        long time = date.getTime() - java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] interval: " + time + "，newFireDate: " + date + " , latestNotifyMsgId: " + latestNotifyMsgId);
        ((ku5.t0) ku5.t0.f394148d).A("BrandEcsNotifyTimerMgrUpdateDigest");
        ((ku5.t0) ku5.t0.f394148d).l(ow.u.f430802d, time, "BrandEcsNotifyTimerMgrUpdateDigest");
    }
}

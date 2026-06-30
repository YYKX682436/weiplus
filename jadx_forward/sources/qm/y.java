package qm;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f446199a;

    static {
        boolean z17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled not main process");
        } else if (com.p314xaae8f345.mm.ui.bk.Q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled isFoldableDevice ignore");
        } else {
            if (!com.p314xaae8f345.mm.ui.bk.A()) {
                z17 = true;
                f446199a = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatDeviceSupport: " + z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled isTablet ignore");
        }
        z17 = false;
        f446199a = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatDeviceSupport: " + z17);
    }
}

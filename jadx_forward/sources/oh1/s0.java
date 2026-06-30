package oh1;

/* loaded from: classes11.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh1.u0 f426822e;

    public s0(oh1.u0 u0Var, java.lang.String str, android.content.Intent intent) {
        this.f426822e = u0Var;
        this.f426821d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b c4683x847dbe1b = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495;
        boolean mo40975xf7b3660d = c4683x847dbe1b.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "now isForeground:%b", java.lang.Boolean.valueOf(mo40975xf7b3660d));
        if (mo40975xf7b3660d) {
            return;
        }
        oh1.u0 u0Var = this.f426822e;
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "showPCPayPushContentNotification");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728));
        boolean i17 = ip.b.i();
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
        k0Var.e(this.f426821d);
        k0Var.f550996g = activity;
        if (i17) {
            notification.vibrate = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274523b;
        }
        android.app.Notification b17 = k0Var.b();
        b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        b17.flags |= 16;
        b17.sound = android.media.RingtoneManager.getDefaultUri(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "canVibrate:%b", java.lang.Boolean.valueOf(i17));
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).Ai(51, b17);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).Bi();
        if (u0Var.f426835d) {
            return;
        }
        u0Var.f426835d = true;
        c4683x847dbe1b.mo40973x40b15f2e(new oh1.t0(u0Var));
    }
}

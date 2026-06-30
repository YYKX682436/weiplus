package k13;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 f384749d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965) {
        this.f384749d = activityC15563xb39a5965;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965.f218875s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965 = this.f384749d;
        activityC15563xb39a5965.getWindow().getDecorView().setKeepScreenOn(true);
        activityC15563xb39a5965.getWindow().addFlags(128);
        boolean z17 = activityC15563xb39a5965.f218883p;
        java.lang.String str = activityC15563xb39a5965.f218860d;
        if (z17) {
            i95.m c17 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (!h13.l0.Ui((h13.l0) c17, null, 1, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "PlaySound.playRoot");
                activityC15563xb39a5965.f218878h = com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.d(activityC15563xb39a5965.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573684ff0, com.p314xaae8f345.mm.sdk.p2603x2137b148.u5.NOTSET, 2, true, null);
            }
        }
        if (activityC15563xb39a5965.f218884q) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (h13.l0.Vi((h13.l0) c18, null, 1, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "vibrator.vibrate");
                ((android.os.Vibrator) ((jz5.n) activityC15563xb39a5965.f218877g).mo141623x754a37bb()).vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
            }
        }
        activityC15563xb39a5965.f218885r = true;
    }
}

package k13;

/* loaded from: classes10.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384757d;

    public i1(k13.l1 l1Var) {
        this.f384757d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(h13.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (h13.l0.Vi((h13.l0) c17, null, 1, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", "vibrator.vibrate");
            if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                ((android.os.Vibrator) ((jz5.n) this.f384757d.f384779x).mo141623x754a37bb()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
            } else {
                ((android.os.Vibrator) ((jz5.n) this.f384757d.f384779x).mo141623x754a37bb()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
            }
        }
    }
}

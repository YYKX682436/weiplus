package dk2;

/* loaded from: classes5.dex */
public final class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f315464d;

    public pg(android.content.Intent intent) {
        this.f315464d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f315464d;
        if (intent != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("live_exception_monitor");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.SCREEN_ON", intent.getAction())) {
                R.putBoolean("PARAM_IS_SCREEN_OFF", false);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.SCREEN_OFF", intent.getAction())) {
                R.putBoolean("PARAM_IS_SCREEN_OFF", true);
            }
        }
    }
}

package b83;

/* loaded from: classes11.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f99854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f99855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b83.i f99856c;

    public g(b83.i iVar, java.lang.Runnable runnable, long j17) {
        this.f99856c = iVar;
        this.f99854a = runnable;
        this.f99855b = j17;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean equals = "android.intent.action.SCREEN_OFF".equals(intent == null ? "" : intent.getAction());
        java.lang.Runnable runnable = this.f99854a;
        b83.i iVar = this.f99856c;
        if (equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen off now, send message now");
            iVar.f99857a.postDelayed(runnable, this.f99855b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen on, remove pending runnable and receive");
            iVar.f99857a.removeCallbacks(runnable);
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

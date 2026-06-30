package b83;

/* loaded from: classes11.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f18321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b83.i f18323c;

    public g(b83.i iVar, java.lang.Runnable runnable, long j17) {
        this.f18323c = iVar;
        this.f18321a = runnable;
        this.f18322b = j17;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean equals = "android.intent.action.SCREEN_OFF".equals(intent == null ? "" : intent.getAction());
        java.lang.Runnable runnable = this.f18321a;
        b83.i iVar = this.f18323c;
        if (equals) {
            com.tencent.mars.xlog.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen off now, send message now");
            iVar.f18324a.postDelayed(runnable, this.f18322b);
        } else {
            com.tencent.mars.xlog.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen on, remove pending runnable and receive");
            iVar.f18324a.removeCallbacks(runnable);
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

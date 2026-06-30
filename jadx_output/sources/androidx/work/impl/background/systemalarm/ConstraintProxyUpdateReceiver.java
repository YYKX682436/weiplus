package androidx.work.impl.background.systemalarm;

/* loaded from: classes13.dex */
public class ConstraintProxyUpdateReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f12482a = a5.a0.e("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            a5.a0.c().a(f12482a, java.lang.String.format("Ignoring unknown action %s", action), new java.lang.Throwable[0]);
        } else {
            ((m5.c) b5.w.c(context).f17898d).a(new d5.d(this, intent, context, goAsync()));
        }
    }
}

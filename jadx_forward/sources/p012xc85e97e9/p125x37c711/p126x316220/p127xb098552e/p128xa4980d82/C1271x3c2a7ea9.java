package p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82;

/* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver */
/* loaded from: classes13.dex */
public class C1271x3c2a7ea9 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f94015a = a5.a0.e("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            a5.a0.c().a(f94015a, java.lang.String.format("Ignoring unknown action %s", action), new java.lang.Throwable[0]);
        } else {
            ((m5.c) b5.w.c(context).f99431d).a(new d5.d(this, intent, context, goAsync()));
        }
    }
}

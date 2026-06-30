package h5;

/* loaded from: classes13.dex */
public class b extends h5.d {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f360513i = a5.a0.e("BatteryNotLowTracker");

    @Override // h5.f
    public java.lang.Object a() {
        android.content.Intent registerReceiver = this.f360521b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return java.lang.Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        a5.a0.c().b(f360513i, "getInitialState - null intent received", new java.lang.Throwable[0]);
        return null;
    }

    @Override // h5.d
    public android.content.IntentFilter e() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // h5.d
    public void f(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        a5.a0.c().a(f360513i, java.lang.String.format("Received %s", intent.getAction()), new java.lang.Throwable[0]);
        java.lang.String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            b(java.lang.Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            b(java.lang.Boolean.FALSE);
        }
    }
}

package h5;

/* loaded from: classes13.dex */
public class i extends h5.d {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f360529i = a5.a0.e("StorageNotLowTracker");

    @Override // h5.f
    public java.lang.Object a() {
        android.content.Intent registerReceiver = this.f360521b.registerReceiver(null, e());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return java.lang.Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    @Override // h5.d
    public android.content.IntentFilter e() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // h5.d
    public void f(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        a5.a0.c().a(f360529i, java.lang.String.format("Received %s", intent.getAction()), new java.lang.Throwable[0]);
        java.lang.String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            b(java.lang.Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            b(java.lang.Boolean.TRUE);
        }
    }
}

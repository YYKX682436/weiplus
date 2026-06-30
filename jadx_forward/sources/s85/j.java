package s85;

/* loaded from: classes4.dex */
public final class j extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final s85.a f486447a;

    /* renamed from: b, reason: collision with root package name */
    public final s85.a f486448b;

    public j(android.content.Context context) {
        int intExtra;
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f486447a = new s85.a("charging", java.lang.Boolean.valueOf(registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)));
        this.f486448b = new s85.a("interactive", java.lang.Boolean.valueOf(((android.os.PowerManager) context.getSystemService("power")).isScreenOn()));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c17 = 65535;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        s85.a aVar = this.f486447a;
        s85.a aVar2 = this.f486448b;
        switch (c17) {
            case 0:
                aVar2.f(java.lang.Boolean.FALSE);
                aVar = aVar2;
                break;
            case 1:
                aVar.f(java.lang.Boolean.FALSE);
                break;
            case 2:
                aVar2.f(java.lang.Boolean.TRUE);
                aVar = aVar2;
                break;
            case 3:
                aVar.f(java.lang.Boolean.TRUE);
                break;
            default:
                aVar = null;
                break;
        }
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemStatus", "System status changed: %s = %s", aVar.f486435d, aVar.f486436e.toString());
        }
    }
}

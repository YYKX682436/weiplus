package be1;

/* loaded from: classes7.dex */
public class e0 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c17 = 65535;
        switch (action.hashCode()) {
            case -1875733435:
                if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1184851779:
                if (action.equals("android.location.PROVIDERS_CHANGED")) {
                    c17 = 1;
                    break;
                }
                break;
            case 452039370:
                if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                int intExtra = intent.getIntExtra("wifi_state", 4);
                if (intExtra == 3) {
                    be1.f0.f19466m.set(true);
                    return;
                } else {
                    if (intExtra == 1) {
                        be1.f0.f19466m.set(false);
                        return;
                    }
                    return;
                }
            case 1:
                android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService(ya.b.LOCATION);
                be1.f0.f19467n.set(locationManager.isProviderEnabled("gps"));
                be1.f0.f19468o.set(locationManager.isProviderEnabled("network"));
                return;
            case 2:
                be1.f0.f19469p.set(!intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", true));
                return;
            default:
                return;
        }
    }
}

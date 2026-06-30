package d5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f308008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f308009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.BroadcastReceiver.PendingResult f308010f;

    public d(p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1271x3c2a7ea9 c1271x3c2a7ea9, android.content.Intent intent, android.content.Context context, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f308008d = intent;
        this.f308009e = context;
        this.f308010f = pendingResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.BroadcastReceiver.PendingResult pendingResult = this.f308010f;
        android.content.Context context = this.f308009e;
        android.content.Intent intent = this.f308008d;
        try {
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            a5.a0.c().a(p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1271x3c2a7ea9.f94015a, java.lang.String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(booleanExtra4)), new java.lang.Throwable[0]);
            k5.h.a(context, p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1268x3d9a1453.class, booleanExtra);
            k5.h.a(context, p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1267xcde111e3.class, booleanExtra2);
            k5.h.a(context, p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1270xcb5c0f25.class, booleanExtra3);
            k5.h.a(context, p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1269x719c6d98.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }
}

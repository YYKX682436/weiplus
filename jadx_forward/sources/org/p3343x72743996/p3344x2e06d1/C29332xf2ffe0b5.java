package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.PowerMonitor */
/* loaded from: classes12.dex */
public class C29332xf2ffe0b5 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73399x7118e671 = false;

    /* renamed from: sInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5 f73400xbfaed628;

    /* renamed from: mIsBatteryPower */
    private boolean f73401x73b7a70f;

    /* renamed from: org.chromium.base.PowerMonitor$Natives */
    /* loaded from: classes12.dex */
    public interface Natives {
        /* renamed from: onBatteryChargingChanged */
        void mo152602x15ca2df5();

        /* renamed from: onThermalStatusChanged */
        void mo152603xfa5388a(int i17);
    }

    private C29332xf2ffe0b5() {
    }

    /* renamed from: create */
    public static void m152595xaf65a0fc() {
        android.os.PowerManager powerManager;
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        if (f73400xbfaed628 != null) {
            return;
        }
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        f73400xbfaed628 = new org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5();
        android.content.Intent m152361xd9ec0c5 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(m152349x6e669035, null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (m152361xd9ec0c5 != null) {
            m152601x15ca2df5(m152361xd9ec0c5.getIntExtra("plugged", 0) == 0);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(m152349x6e669035, new android.content.BroadcastReceiver() { // from class: org.chromium.base.PowerMonitor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.m152601x15ca2df5(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
            }
        }, intentFilter);
        if (android.os.Build.VERSION.SDK_INT < 29 || (powerManager = (android.os.PowerManager) m152349x6e669035.getSystemService("power")) == null) {
            return;
        }
        org.p3343x72743996.p3344x2e06d1.C29333xba27fefd.m152604xeb19ec1c(powerManager);
    }

    /* renamed from: createForTests */
    public static void m152596x51e0aff4() {
        f73400xbfaed628 = new org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5();
    }

    /* renamed from: getCurrentThermalStatus */
    private static int m152597xf510a1e6() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (f73400xbfaed628 == null) {
            m152595xaf65a0fc();
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29395xdcec3710.m152850xf510a1e6(powerManager);
    }

    /* renamed from: getRemainingBatteryCapacity */
    private static int m152598x10defa87() {
        if (f73400xbfaed628 == null) {
            m152595xaf65a0fc();
        }
        return m152599x3c633547();
    }

    /* renamed from: getRemainingBatteryCapacityImpl */
    private static int m152599x3c633547() {
        return ((android.os.BatteryManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("batterymanager")).getIntProperty(1);
    }

    /* renamed from: isBatteryPower */
    private static boolean m152600x6d049d42() {
        if (f73400xbfaed628 == null) {
            m152595xaf65a0fc();
        }
        return f73400xbfaed628.f73401x73b7a70f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBatteryChargingChanged */
    public static void m152601x15ca2df5(boolean z17) {
        f73400xbfaed628.f73401x73b7a70f = z17;
        org.p3343x72743996.p3344x2e06d1.C29334x1ec78ab0.get().mo152602x15ca2df5();
    }
}

package iq1;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f375212a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f375213b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f375212a = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f375213b = hashMap2;
        int i17 = hq1.n0.f364706a;
        hashMap2.put("0000fea1-0000-1000-8000-00805f9b34fb", 1L);
        hashMap2.put("0000fea2-0000-1000-8000-00805f9b34fb", 1L);
        hashMap2.put("0000feb1-0000-1000-8000-00805f9b34fb", 16L);
        hashMap2.put("0000feb2-0000-1000-8000-00805f9b34fb", 16L);
        hashMap2.put("0000feb3-0000-1000-8000-00805f9b34fb", 16L);
        hashMap2.put("0000feb4-0000-1000-8000-00805f9b34fb", 16L);
        hashMap.put("0000fee7-0000-1000-8000-00805f9b34fb", 0L);
        hashMap.put("0000181d-0000-1000-8000-00805f9b34fb", 2L);
        hashMap.put("0000180d-0000-1000-8000-00805f9b34fb", 4L);
        hashMap.put("00001810-0000-1000-8000-00805f9b34fb", 8L);
    }

    public static long a(android.bluetooth.BluetoothGattService bluetoothGattService) {
        if (bluetoothGattService == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("iq1.f", "service is null");
            return 0L;
        }
        java.lang.String uuid = bluetoothGattService.getUuid().toString();
        int i17 = hq1.n0.f364706a;
        if (!uuid.equalsIgnoreCase("0000fee7-0000-1000-8000-00805f9b34fb") || bluetoothGattService.getCharacteristic(java.util.UUID.fromString("0000fea1-0000-1000-8000-00805f9b34fb")) == null) {
            java.lang.Long l17 = (java.lang.Long) f375212a.get(uuid);
            if (l17 == null) {
                return 0L;
            }
            return l17.longValue();
        }
        java.util.List<android.bluetooth.BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
        long j17 = 0;
        for (int i18 = 0; i18 < characteristics.size(); i18++) {
            java.lang.Long l18 = (java.lang.Long) f375213b.get(characteristics.get(i18).getUuid().toString());
            j17 |= l18 == null ? 0L : l18.longValue();
        }
        return j17;
    }

    public static java.lang.String b(long j17) {
        java.util.HashMap hashMap = f375212a;
        for (java.lang.String str : hashMap.keySet()) {
            if (((java.lang.Long) hashMap.get(str)).longValue() == j17) {
                return str;
            }
        }
        if (!f375213b.containsValue(java.lang.Long.valueOf(j17))) {
            return null;
        }
        int i17 = hq1.n0.f364706a;
        return "0000fee7-0000-1000-8000-00805f9b34fb";
    }
}

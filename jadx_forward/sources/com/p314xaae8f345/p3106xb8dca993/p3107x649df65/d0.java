package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class d0 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.b("shouldUpdateId, notifyFlag : ".concat(java.lang.String.valueOf(intExtra)));
        if (intExtra != 1) {
            if (intExtra == 2) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
                if (stringArrayListExtra == null) {
                    return;
                }
                boolean contains = stringArrayListExtra.contains(context.getPackageName());
                if (contains) {
                    com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e0 a17 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a().a(intent.getStringExtra("openIdType"));
                    if (a17 != null) {
                        a17.b();
                        return;
                    }
                    return;
                }
                z17 = contains;
            } else {
                z17 = true;
            }
            if (intExtra == 0 && z17) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e0 a18 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a().a(intent.getStringExtra("openIdType"));
                if (a18 != null) {
                    a18.b();
                    return;
                }
                return;
            }
        } else if (android.text.TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e0 a19 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a().a(intent.getStringExtra("openIdType"));
            if (a19 != null) {
                a19.b();
            }
        }
    }
}

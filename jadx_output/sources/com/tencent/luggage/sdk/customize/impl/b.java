package com.tencent.luggage.sdk.customize.impl;

/* loaded from: classes.dex */
public final class b implements pb1.u {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.customize.impl.b f47314d = new com.tencent.luggage.sdk.customize.impl.b();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f47315e = new java.util.ArrayList(5);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f47316f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f47317g;

    @Override // pb1.u
    public synchronized int F9() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStart");
        i17 = f47317g;
        f47317g = i17 + 1;
        f47316f.put(java.lang.Integer.valueOf(i17), new com.tencent.luggage.sdk.customize.impl.a(i17, android.os.SystemClock.elapsedRealtime()));
        return i17;
    }

    @Override // pb1.u
    public synchronized boolean dj() {
        java.util.ArrayList arrayList = f47315e;
        if (arrayList.size() < 5) {
            return false;
        }
        return android.os.SystemClock.elapsedRealtime() - ((com.tencent.luggage.sdk.customize.impl.a) arrayList.get(0)).f47313b < 30000;
    }

    @Override // pb1.u
    public synchronized void t9(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, id: " + i17);
        com.tencent.luggage.sdk.customize.impl.a aVar = (com.tencent.luggage.sdk.customize.impl.a) f47316f.remove(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, scan is null");
            return;
        }
        java.util.ArrayList arrayList = f47315e;
        if (arrayList.size() >= 5) {
            arrayList.remove(0);
        }
        arrayList.add(aVar);
    }
}

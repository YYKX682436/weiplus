package com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220;

/* loaded from: classes.dex */
public final class b implements pb1.u {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.b f128847d = new com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.b();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f128848e = new java.util.ArrayList(5);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f128849f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f128850g;

    @Override // pb1.u
    public synchronized int F9() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStart");
        i17 = f128850g;
        f128850g = i17 + 1;
        f128849f.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a(i17, android.os.SystemClock.elapsedRealtime()));
        return i17;
    }

    @Override // pb1.u
    public synchronized boolean dj() {
        java.util.ArrayList arrayList = f128848e;
        if (arrayList.size() < 5) {
            return false;
        }
        return android.os.SystemClock.elapsedRealtime() - ((com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a) arrayList.get(0)).f128846b < 30000;
    }

    @Override // pb1.u
    public synchronized void t9(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, id: " + i17);
        com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a aVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a) f128849f.remove(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, scan is null");
            return;
        }
        java.util.ArrayList arrayList = f128848e;
        if (arrayList.size() >= 5) {
            arrayList.remove(0);
        }
        arrayList.add(aVar);
    }
}

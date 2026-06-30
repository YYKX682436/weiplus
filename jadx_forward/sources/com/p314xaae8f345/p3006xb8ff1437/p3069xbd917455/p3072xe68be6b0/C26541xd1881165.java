package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReportControllerState */
/* loaded from: classes15.dex */
public class C26541xd1881165 {

    /* renamed from: IDLE */
    public static final int f55020x2237d4 = 1;

    /* renamed from: INDEX */
    private static final int f55021x42930b2 = 0;

    /* renamed from: PREPARED */
    public static final int f55022xe261843d = 3;

    /* renamed from: PREPARING */
    public static final int f55023x69cf13e4 = 2;

    /* renamed from: STATE_TO_STRING_MAP */
    private static final java.util.Map<java.lang.Integer, java.lang.String> f55024x59744104;

    /* renamed from: mCurState */
    private int f55025x459b61be = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReportControllerState$STATE */
    /* loaded from: classes6.dex */
    public @interface STATE {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f55024x59744104 = hashMap;
        hashMap.put(1, "IDLE");
        hashMap.put(2, "PREPARING");
        hashMap.put(3, "PREPARED");
    }

    /* renamed from: getState */
    public synchronized int m103840x75286adb() {
        return this.f55025x459b61be;
    }

    /* renamed from: isMatchState */
    public synchronized boolean m103841xefef4a96(int i17) {
        return this.f55025x459b61be == i17;
    }

    /* renamed from: setState */
    public synchronized void m103842x53b6854f(int i17) {
        this.f55025x459b61be = i17;
    }

    /* renamed from: toString */
    public synchronized java.lang.String m103843x9616526c() {
        return "state[ cur : " + f55024x59744104.get(java.lang.Integer.valueOf(this.f55025x459b61be)) + " ]";
    }
}

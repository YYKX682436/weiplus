package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb f243172a = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb();

    /* renamed from: b, reason: collision with root package name */
    public static long f243173b;

    public final java.lang.String a() {
        if (b()) {
            return "0";
        }
        java.lang.String valueOf = java.lang.String.valueOf(30 - ((java.lang.System.currentTimeMillis() / 1000) - f243173b));
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("SettingsFingerprintVerifyFailedTime", "[fingerprint login] getTimeRemaining time is " + f243173b + ",time is " + valueOf);
        return valueOf;
    }

    public final boolean b() {
        return f243173b == 0 || (java.lang.System.currentTimeMillis() / ((long) 1000)) - f243173b > 30;
    }
}

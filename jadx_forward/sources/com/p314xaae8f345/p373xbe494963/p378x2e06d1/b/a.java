package com.p314xaae8f345.p373xbe494963.p378x2e06d1.b;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f127821a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final long f127822b;

    public a(long j17) {
        this.f127822b = j17;
    }

    public final boolean a() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f127821a;
        if (j17 != 0 && elapsedRealtime - j17 <= this.f127822b) {
            return false;
        }
        this.f127821a = android.os.SystemClock.elapsedRealtime();
        return true;
    }
}

package com.tencent.liteav.base.b;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f46288a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final long f46289b;

    public a(long j17) {
        this.f46289b = j17;
    }

    public final boolean a() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f46288a;
        if (j17 != 0 && elapsedRealtime - j17 <= this.f46289b) {
            return false;
        }
        this.f46288a = android.os.SystemClock.elapsedRealtime();
        return true;
    }
}

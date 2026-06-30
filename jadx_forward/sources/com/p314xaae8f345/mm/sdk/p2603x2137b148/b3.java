package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public class b3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f274005a;

    public b3() {
        this.f274005a = false;
    }

    public boolean a(long j17) {
        boolean z17;
        if (j17 == 0) {
            synchronized (this) {
                while (!this.f274005a) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            return true;
        }
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j18 = j17 + currentTimeMillis;
            while (!this.f274005a && currentTimeMillis < j18) {
                try {
                    wait(j18 - currentTimeMillis);
                } catch (java.lang.InterruptedException unused2) {
                }
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            z17 = this.f274005a;
        }
        return z17;
    }

    public void b() {
        synchronized (this) {
            this.f274005a = false;
        }
    }

    public void c() {
        synchronized (this) {
            boolean z17 = this.f274005a;
            this.f274005a = true;
            if (!z17) {
                notifyAll();
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m77724x9616526c() {
        return "MMConditionVariable[" + hashCode() + "," + this.f274005a + "]";
    }

    public b3(boolean z17) {
        this.f274005a = z17;
    }
}

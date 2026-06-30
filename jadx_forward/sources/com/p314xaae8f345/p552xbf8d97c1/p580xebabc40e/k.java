package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ComponentName f134488a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f134489b;

    /* renamed from: c, reason: collision with root package name */
    public int f134490c;

    public k(android.content.ComponentName componentName) {
        this.f134488a = componentName;
    }

    public abstract void a(android.content.Intent intent);

    public void b(int i17) {
        if (!this.f134489b) {
            this.f134489b = true;
            this.f134490c = i17;
        } else {
            if (this.f134490c == i17) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Given job ID " + i17 + " is different than previous " + this.f134490c);
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}

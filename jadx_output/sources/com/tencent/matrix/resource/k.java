package com.tencent.matrix.resource;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ComponentName f52955a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52956b;

    /* renamed from: c, reason: collision with root package name */
    public int f52957c;

    public k(android.content.ComponentName componentName) {
        this.f52955a = componentName;
    }

    public abstract void a(android.content.Intent intent);

    public void b(int i17) {
        if (!this.f52956b) {
            this.f52956b = true;
            this.f52957c = i17;
        } else {
            if (this.f52957c == i17) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Given job ID " + i17 + " is different than previous " + this.f52957c);
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}

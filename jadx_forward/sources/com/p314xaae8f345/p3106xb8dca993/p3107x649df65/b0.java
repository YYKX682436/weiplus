package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y f297088a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 f297089b;

    public b0(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 a0Var) {
        this.f297088a = yVar;
        this.f297089b = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 a0Var;
        if (this.f297088a == null) {
            return;
        }
        int i17 = 0;
        boolean z17 = false;
        do {
            try {
                java.util.concurrent.TimeUnit.MICROSECONDS.sleep(10L);
                z17 = this.f297088a.c();
                i17++;
                if (z17) {
                    break;
                }
            } catch (java.lang.Exception unused) {
            }
        } while (i17 < 30);
        if (!z17 || (a0Var = this.f297089b) == null) {
            return;
        }
        a0Var.a(true);
    }
}

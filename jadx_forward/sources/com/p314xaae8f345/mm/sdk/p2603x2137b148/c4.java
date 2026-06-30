package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes9.dex */
public class c4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c4 f274029b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c4();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 f274030a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.o3(android.os.Looper.getMainLooper());

    public void a(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f274030a.d(runnable);
        }
    }
}

package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f86088a = false;

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f86089b = 4;

    public static final int a() {
        int i17 = f86088a ? 6 : 4;
        return !kz5.z.G(new java.lang.Integer[]{4, 6}, java.lang.Integer.valueOf(f86089b)) ? i17 | 1 : i17;
    }
}

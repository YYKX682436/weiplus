package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f63409f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final int f63410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f63411b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Intent f63412c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63413d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f63414e;

    public l0(java.lang.String processName, android.content.Intent serviceIntent, boolean z17, android.content.Intent processServiceIntent) {
        kotlin.jvm.internal.o.g(processName, "processName");
        kotlin.jvm.internal.o.g(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.o.g(processServiceIntent, "processServiceIntent");
        this.f63410a = f63409f.getAndIncrement();
        this.f63411b = processName;
        this.f63412c = serviceIntent;
        this.f63413d = z17;
        this.f63414e = processServiceIntent;
    }
}

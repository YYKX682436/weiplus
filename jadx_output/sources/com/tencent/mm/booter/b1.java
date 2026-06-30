package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f63307c = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final int f63308a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f63309b;

    public b1(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f63308a = f63307c.getAndIncrement();
        this.f63309b = intent;
    }
}

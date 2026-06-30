package com.tencent.mm.booter;

/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f63297e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final long f63298a;

    /* renamed from: b, reason: collision with root package name */
    public final long f63299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63300c = f63297e.getAndIncrement();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f63301d = jz5.h.a(jz5.i.f302829d, com.tencent.mm.booter.z0.f63608d);

    public a1(long j17, long j18) {
        this.f63298a = j17;
        this.f63299b = j18;
    }

    public final java.util.LinkedList a() {
        return (java.util.LinkedList) this.f63301d.getValue();
    }

    public java.lang.String toString() {
        return "DisorderSyncNumFixUp(id=" + this.f63300c + ", bgn=" + this.f63298a + ", end=" + this.f63299b + ", handledList=" + a() + ')';
    }
}

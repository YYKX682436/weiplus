package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f144830e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final long f144831a;

    /* renamed from: b, reason: collision with root package name */
    public final long f144832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f144833c = f144830e.getAndIncrement();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f144834d = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p642xad8b531f.z0.f145141d);

    public a1(long j17, long j18) {
        this.f144831a = j17;
        this.f144832b = j18;
    }

    public final java.util.LinkedList a() {
        return (java.util.LinkedList) this.f144834d.mo141623x754a37bb();
    }

    /* renamed from: toString */
    public java.lang.String m43373x9616526c() {
        return "DisorderSyncNumFixUp(id=" + this.f144833c + ", bgn=" + this.f144831a + ", end=" + this.f144832b + ", handledList=" + a() + ')';
    }
}

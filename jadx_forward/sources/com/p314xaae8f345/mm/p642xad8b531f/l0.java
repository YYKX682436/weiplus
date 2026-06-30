package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f144942f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final int f144943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f144944b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Intent f144945c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f144946d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f144947e;

    public l0(java.lang.String processName, android.content.Intent serviceIntent, boolean z17, android.content.Intent processServiceIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceIntent, "serviceIntent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processServiceIntent, "processServiceIntent");
        this.f144943a = f144942f.getAndIncrement();
        this.f144944b = processName;
        this.f144945c = serviceIntent;
        this.f144946d = z17;
        this.f144947e = processServiceIntent;
    }
}

package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f76727a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f76728b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f76729c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f76730d;

    public p0(android.content.Context context, yz5.l observer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f76727a = observer;
        java.lang.Object systemService = context.getSystemService("phone");
        if (systemService instanceof android.telephony.TelephonyManager) {
        }
        this.f76728b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f76729c = jz5.h.b(com.tencent.mm.plugin.appbrand.av_device_usage.m0.f76712d);
        this.f76730d = jz5.h.b(new com.tencent.mm.plugin.appbrand.av_device_usage.o0(this));
    }
}

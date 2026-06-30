package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f158260a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f158261b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f158262c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f158263d;

    public p0(android.content.Context context, yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f158260a = observer;
        java.lang.Object systemService = context.getSystemService("phone");
        if (systemService instanceof android.telephony.TelephonyManager) {
        }
        this.f158261b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f158262c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.m0.f158245d);
        this.f158263d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o0(this));
    }
}

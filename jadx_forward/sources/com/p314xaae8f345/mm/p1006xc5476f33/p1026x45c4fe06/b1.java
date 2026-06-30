package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f158287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 f158288b;

    /* renamed from: c, reason: collision with root package name */
    public final long f158289c;

    /* renamed from: d, reason: collision with root package name */
    public final long f158290d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 splash) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splash, "splash");
        this.f158287a = runtime;
        this.f158288b = splash;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f158289c = timeUnit.toMillis(20L);
        this.f158290d = timeUnit.toMillis(10L);
        splash.mo52965xfb86a31b().addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ge geVar = runtime.H;
        if (geVar.f159786b.get()) {
            return;
        }
        geVar.f159785a.add(a1Var);
    }
}

package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes5.dex */
public final class b1 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f152419f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f152420g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f152421h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f152422i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(jm0.o plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f152419f = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.a1.f152405d);
        this.f152420g = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.x0.f152691d);
        this.f152421h = jz5.h.b(new com.p314xaae8f345.mm.p947xba6de98f.s0(plugin));
        this.f152422i = jz5.h.b(new com.p314xaae8f345.mm.p947xba6de98f.w0(this));
    }

    public final java.lang.String T6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = gm0.j1.b().j() + "cdnTemp";
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0(str2));
        sb6.append(java.io.File.separator);
        sb6.append(str);
        return sb6.toString();
    }

    public final java.util.concurrent.ConcurrentLinkedQueue U6() {
        return (java.util.concurrent.ConcurrentLinkedQueue) ((jz5.n) this.f152420g).mo141623x754a37bb();
    }

    public final java.util.concurrent.ConcurrentHashMap V6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f152419f).mo141623x754a37bb();
    }
}

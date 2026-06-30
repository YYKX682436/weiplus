package com.tencent.mm.modelcdntran;

/* loaded from: classes5.dex */
public final class b1 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f70886f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f70887g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f70888h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f70889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(jm0.o plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f70886f = jz5.h.b(com.tencent.mm.modelcdntran.a1.f70872d);
        this.f70887g = jz5.h.b(com.tencent.mm.modelcdntran.x0.f71158d);
        this.f70888h = jz5.h.b(new com.tencent.mm.modelcdntran.s0(plugin));
        this.f70889i = jz5.h.b(new com.tencent.mm.modelcdntran.w0(this));
    }

    public final java.lang.String T6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = gm0.j1.b().j() + "cdnTemp";
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        sb6.append(lp0.b.h0(str2));
        sb6.append(java.io.File.separator);
        sb6.append(str);
        return sb6.toString();
    }

    public final java.util.concurrent.ConcurrentLinkedQueue U6() {
        return (java.util.concurrent.ConcurrentLinkedQueue) ((jz5.n) this.f70887g).getValue();
    }

    public final java.util.concurrent.ConcurrentHashMap V6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f70886f).getValue();
    }
}

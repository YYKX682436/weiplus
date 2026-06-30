package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class x7 implements com.tencent.mm.plugin.appbrand.jsapi.media.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.r1 f82141a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f82142b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f82143c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.media.s1 f82144d;

    public x7(yz5.a runtimeProvider, com.tencent.mm.plugin.appbrand.jsapi.media.r1 r1Var) {
        kotlin.jvm.internal.o.g(runtimeProvider, "runtimeProvider");
        this.f82141a = r1Var;
        this.f82142b = "MicroMsg.AppBrand.WxaAudioFocusComponent#" + hashCode();
        this.f82143c = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.w7(runtimeProvider, this));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.q1
    public boolean a() {
        if (((com.tencent.mm.plugin.appbrand.jsapi.media.t1) ((jz5.n) this.f82143c).getValue()) == null) {
            com.tencent.mars.xlog.Log.e(this.f82142b, "abandonFocus, service is null");
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.s1 s1Var = this.f82144d;
        if (s1Var == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.media.t1) ((jz5.n) this.f82143c).getValue();
        kotlin.jvm.internal.o.d(t1Var);
        boolean b37 = t1Var.b3(s1Var);
        com.tencent.mars.xlog.Log.i(this.f82142b, "abandonFocus, abandoned: " + b37);
        if (b37) {
            this.f82144d = null;
        }
        return b37;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.q1
    public boolean requestFocus() {
        if (((com.tencent.mm.plugin.appbrand.jsapi.media.t1) ((jz5.n) this.f82143c).getValue()) == null) {
            com.tencent.mars.xlog.Log.e(this.f82142b, "requestFocus, service is null");
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.media.t1) ((jz5.n) this.f82143c).getValue();
        kotlin.jvm.internal.o.d(t1Var);
        com.tencent.mm.plugin.appbrand.jsapi.media.s1 Gd = t1Var.Gd(this.f82141a);
        boolean a17 = Gd.a();
        com.tencent.mars.xlog.Log.i(this.f82142b, "requestFocus, gainFocus: " + a17);
        if (a17) {
            this.f82144d = Gd;
        }
        return a17;
    }
}

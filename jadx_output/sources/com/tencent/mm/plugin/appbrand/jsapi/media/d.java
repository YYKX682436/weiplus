package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.media.e8 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f81751g = "MicroMsg.AppBrandAudioFocusService#" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f81752h = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.a(this));

    /* renamed from: i, reason: collision with root package name */
    public final f25.g f81753i = f25.g.f259094c;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f81754m = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.c(this));

    /* renamed from: n, reason: collision with root package name */
    public volatile f25.m0 f81755n;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public boolean a() {
        f25.m0 m0Var;
        if (((f25.n0) ((jz5.n) this.f81752h).getValue()) == null || (m0Var = this.f81755n) == null) {
            return false;
        }
        f25.n0 n0Var = (f25.n0) ((jz5.n) this.f81752h).getValue();
        kotlin.jvm.internal.o.d(n0Var);
        boolean yg6 = n0Var.yg(m0Var);
        if (yg6) {
            this.f81755n = null;
        }
        return yg6;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public java.lang.String c() {
        return this.f81751g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public boolean g() {
        if (((f25.n0) ((jz5.n) this.f81752h).getValue()) == null) {
            return false;
        }
        if (this.f81755n != null) {
            com.tencent.mars.xlog.Log.i(this.f81751g, "requestAudioFocus, requestSession not null");
            return true;
        }
        f25.n0 n0Var = (f25.n0) ((jz5.n) this.f81752h).getValue();
        kotlin.jvm.internal.o.d(n0Var);
        f25.m0 m96 = n0Var.m9(this.f81753i, (com.tencent.mm.plugin.appbrand.jsapi.media.b) ((jz5.n) this.f81754m).getValue());
        g25.e eVar = (g25.e) m96;
        if (eVar.f267980c) {
            this.f81755n = m96;
        }
        return eVar.f267980c;
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class z extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79311d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79312e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79313f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f79314g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f79315h = false;

    public z(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79311d = k0Var;
        this.f79312e = lVar;
        this.f79313f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "runTask");
        this.f79315h = n01.c.b(this.f79314g);
        super.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "callback");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79312e;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "server is null");
            return;
        }
        boolean z17 = this.f79315h;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79311d;
        int i17 = this.f79313f;
        if (z17) {
            lVar.a(i17, k0Var.o("fail"));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }
}

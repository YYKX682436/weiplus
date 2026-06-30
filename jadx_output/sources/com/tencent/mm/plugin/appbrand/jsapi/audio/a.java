package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public abstract class a implements com.tencent.mm.plugin.appbrand.jsapi.audio.u, java.lang.Runnable {
    public void b() {
        java.lang.String name = getClass().getName();
        if (name.contains("$")) {
            name.substring(name.lastIndexOf("$") + 1);
            java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
        }
    }

    public void c() {
        java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a == null) {
            synchronized (com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79131c) {
                if (com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.b.a();
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        a();
    }
}

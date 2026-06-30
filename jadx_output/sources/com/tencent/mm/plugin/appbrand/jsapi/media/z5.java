package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f82175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.f6 f82177h;

    public z5(com.tencent.mm.plugin.appbrand.jsapi.media.f6 f6Var, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, java.lang.ref.WeakReference weakReference, int i17) {
        this.f82177h = f6Var;
        this.f82173d = e9Var;
        this.f82174e = str;
        this.f82175f = weakReference;
        this.f82176g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String o17;
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.jsapi.media.f6.f81807g.iterator();
        nm5.j jVar = null;
        while (it.hasNext() && (jVar = ((com.tencent.mm.plugin.appbrand.jsapi.media.b6) it.next()).a(this.f82173d.t3(), this.f82174e)) == null) {
        }
        java.lang.ref.WeakReference weakReference = this.f82175f;
        if (weakReference.get() == null || !((com.tencent.mm.plugin.appbrand.e9) weakReference.get()).isRunning()) {
            return;
        }
        int i17 = this.f82176g;
        com.tencent.mm.plugin.appbrand.jsapi.media.f6 f6Var = this.f82177h;
        if (jVar == null) {
            ((com.tencent.mm.plugin.appbrand.e9) weakReference.get()).a(i17, f6Var.o("fail:file not found"));
            return;
        }
        int ordinal = ((com.tencent.mm.plugin.appbrand.jsapi.media.e6) jVar.a(0)).ordinal();
        if (ordinal == 0) {
            o17 = f6Var.o("fail:file not found");
        } else if (ordinal != 2) {
            o17 = f6Var.o("fail");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("width", java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.jsapi.media.c6) jVar.a(1)).f81742a));
            hashMap.put("height", java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.jsapi.media.c6) jVar.a(1)).f81743b));
            hashMap.put("orientation", ((com.tencent.mm.plugin.appbrand.jsapi.media.c6) jVar.a(1)).f81744c);
            hashMap.put("type", ((com.tencent.mm.plugin.appbrand.jsapi.media.c6) jVar.a(1)).f81745d);
            o17 = f6Var.p("ok", hashMap);
        }
        ((com.tencent.mm.plugin.appbrand.e9) weakReference.get()).a(i17, o17);
    }
}

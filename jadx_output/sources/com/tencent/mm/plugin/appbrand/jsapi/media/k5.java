package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f81900i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f81901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.j5 f81902n;

    public k5(com.tencent.mm.plugin.appbrand.jsapi.media.j5 j5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, int i19, java.lang.ref.WeakReference weakReference, int i27) {
        this.f81902n = j5Var;
        this.f81895d = str;
        this.f81896e = lVar;
        this.f81897f = i17;
        this.f81898g = i18;
        this.f81899h = i19;
        this.f81900i = weakReference;
        this.f81901m = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f81895d;
        com.tencent.mm.plugin.appbrand.jsapi.media.l5 a17 = ((com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.startsWith("wxfile://")) ? new com.tencent.mm.plugin.appbrand.jsapi.media.o5(null) : new com.tencent.mm.plugin.appbrand.jsapi.media.m5(null)).a(this.f81896e, this.f81895d, this.f81897f, this.f81898g, this.f81899h);
        java.lang.ref.WeakReference weakReference = this.f81900i;
        if (weakReference.get() == null || !((com.tencent.mm.plugin.appbrand.jsapi.l) weakReference.get()).isRunning()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:component is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) weakReference.get();
        com.tencent.mm.plugin.appbrand.jsapi.media.j5 j5Var = this.f81902n;
        int i17 = this.f81901m;
        if (a17 != null) {
            boolean z17 = a17.f81919a;
            java.lang.String str2 = a17.f81920b;
            if (z17 || !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (!a17.f81919a) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail, message:%s", str2);
                    lVar.a(i17, j5Var.r(str2, a17.f81921c, null));
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempFilePath", str2);
                j5Var.getClass();
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                hashMap.put("errno", 0);
                lVar.a(i17, j5Var.t("ok", hashMap));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail");
        lVar.a(i17, j5Var.r("fail:compress image fail", a17.f81921c, null));
    }
}

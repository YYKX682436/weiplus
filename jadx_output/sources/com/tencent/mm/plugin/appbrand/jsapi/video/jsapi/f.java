package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes13.dex */
public class f implements oe1.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g f83618b;

    public f(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, final oe1.r1 r1Var) {
        this.f83618b = gVar;
        this.f83617a = lVar;
        final androidx.lifecycle.y lifecycleOwner = lVar.getLifecycleOwner();
        if (lifecycleOwner != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f fVar = com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f.this;
                    fVar.getClass();
                    lifecycleOwner.mo133getLifecycle().a(new androidx.lifecycle.x(fVar, r1Var, this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.JsApiLoadVideoResource$1$1

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ oe1.r1 f83594d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ oe1.d1 f83595e;

                        {
                            this.f83594d = r2;
                            this.f83595e = r3;
                        }

                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                        public void onDestroyed() {
                            oe1.d1 d1Var;
                            ((oe1.z1) this.f83594d).getClass();
                            try {
                                if (com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83524d == null || (d1Var = this.f83595e) == null) {
                                    return;
                                }
                                java.util.Iterator it = new java.util.LinkedList(((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83523c).values()).iterator();
                                while (it.hasNext()) {
                                    oe1.a aVar = (oe1.a) it.next();
                                    if (d1Var == aVar.f344692e) {
                                        aVar.f344692e = null;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    });
                }
            });
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadSucc save_path = %s, url = %s", str2, str);
        this.f83618b.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("resource", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        xe1.m mVar = new xe1.m();
        mVar.p(this.f83617a);
        mVar.r(jSONObject);
        mVar.m();
    }
}

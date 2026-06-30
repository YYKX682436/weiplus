package cl;

/* loaded from: classes7.dex */
public class l3 {

    /* renamed from: c, reason: collision with root package name */
    public final cl.m3 f42687c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f42688d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f42685a = new java.util.concurrent.atomic.AtomicInteger(j());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f42686b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final cl.u f42689e = new cl.h3(this);

    public l3(cl.m3 m3Var) {
        this.f42687c = m3Var;
    }

    public void a(cl.q0 q0Var, java.util.ArrayList arrayList, cl.k3 k3Var) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cl.j3 j3Var = (cl.j3) it.next();
                if (j3Var != null && j3Var.a()) {
                    arrayList2.add(j3Var);
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (k3Var != null) {
            ((com.tencent.mm.plugin.appbrand.y9) k3Var).f92420a = java.lang.System.currentTimeMillis();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((cl.j3) it6.next()).f42669b);
        }
        q0Var.b(arrayList3, this.f42688d, new cl.z2(this, k3Var, currentTimeMillis));
    }

    public void b(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (q0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8EngineWorkerManager", "hy: engine context released");
        } else if (valueCallback != null) {
            q0Var.d(str, new cl.d3(this, valueCallback));
        } else {
            q0Var.d(str, null);
        }
    }

    public void c(android.content.Context context, int i17, com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.util.List list, boolean z17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.V8EngineWorkerManager", "hy: not support bind native in nano case");
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.c0 d(int i17, java.lang.ref.WeakReference weakReference) {
        return new cl.c3(this, weakReference);
    }

    public void e(int i17, cl.q0 q0Var) {
        q0Var.c();
        ((cl.a) q0Var.f42724b).g();
    }

    public void f() {
        for (java.util.Map.Entry entry : this.f42686b.entrySet()) {
            e(((java.lang.Integer) entry.getKey()).intValue(), (cl.q0) entry.getValue());
        }
    }

    public final void g(cl.q0 q0Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.V8EngineWorkerManager", "handleException(%s), stackTrace : %s", str, str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str);
            jSONObject.put("stack", str2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.V8EngineWorkerManager", android.util.Log.getStackTraceString(e17));
        }
        q0Var.d(java.lang.String.format("WeixinWorker.errorHandler(%s)", jSONObject), null);
    }

    public void h() {
    }

    public com.tencent.mm.appbrand.v8.IJSRuntime$Config i(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config = new com.tencent.mm.appbrand.v8.IJSRuntime$Config();
        iJSRuntime$Config.f53948f = "1";
        iJSRuntime$Config.f53949g = true;
        iJSRuntime$Config.f53951i = true;
        iJSRuntime$Config.f53952j = true;
        iJSRuntime$Config.f53956n = new java.lang.ref.WeakReference(mVar);
        iJSRuntime$Config.f53957o = this.f42689e;
        return iJSRuntime$Config;
    }

    public int j() {
        return 0;
    }
}

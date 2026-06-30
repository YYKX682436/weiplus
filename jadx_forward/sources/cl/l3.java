package cl;

/* loaded from: classes7.dex */
public class l3 {

    /* renamed from: c, reason: collision with root package name */
    public final cl.m3 f124220c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f124221d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f124218a = new java.util.concurrent.atomic.AtomicInteger(j());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f124219b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final cl.u f124222e = new cl.h3(this);

    public l3(cl.m3 m3Var) {
        this.f124220c = m3Var;
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
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y9) k3Var).f173953a = java.lang.System.currentTimeMillis();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((cl.j3) it6.next()).f124202b);
        }
        q0Var.b(arrayList3, this.f124221d, new cl.z2(this, k3Var, currentTimeMillis));
    }

    public void b(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (q0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8EngineWorkerManager", "hy: engine context released");
        } else if (valueCallback != null) {
            q0Var.d(str, new cl.d3(this, valueCallback));
        } else {
            q0Var.d(str, null);
        }
    }

    public void c(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.util.List list, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8EngineWorkerManager", "hy: not support bind native in nano case");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 d(int i17, java.lang.ref.WeakReference weakReference) {
        return new cl.c3(this, weakReference);
    }

    public void e(int i17, cl.q0 q0Var) {
        q0Var.c();
        ((cl.a) q0Var.f124257b).g();
    }

    public void f() {
        for (java.util.Map.Entry entry : this.f124219b.entrySet()) {
            e(((java.lang.Integer) entry.getKey()).intValue(), (cl.q0) entry.getValue());
        }
    }

    public final void g(cl.q0 q0Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8EngineWorkerManager", "handleException(%s), stackTrace : %s", str, str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
            jSONObject.put("stack", str2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8EngineWorkerManager", android.util.Log.getStackTraceString(e17));
        }
        q0Var.d(java.lang.String.format("WeixinWorker.errorHandler(%s)", jSONObject), null);
    }

    public void h() {
    }

    public com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0 = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0();
        c5138xafbea1a0.f135481f = "1";
        c5138xafbea1a0.f135482g = true;
        c5138xafbea1a0.f135484i = true;
        c5138xafbea1a0.f135485j = true;
        c5138xafbea1a0.f135489n = new java.lang.ref.WeakReference(mVar);
        c5138xafbea1a0.f135490o = this.f124222e;
        return c5138xafbea1a0;
    }

    public int j() {
        return 0;
    }
}

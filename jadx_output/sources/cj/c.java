package cj;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f41824d;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.matrix.resource.watcher.f f41825a;

    /* renamed from: b, reason: collision with root package name */
    public xi.e f41826b;

    /* renamed from: c, reason: collision with root package name */
    public xi.d f41827c;

    public c(com.tencent.matrix.resource.watcher.f fVar) {
        this.f41825a = fVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:14:0x007c). Please report as a decompilation issue!!! */
    public ti.a a(java.io.File file, java.lang.String str) {
        ti.a a17;
        f41824d = true;
        java.lang.String str2 = ((com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)).f53000h.f446128d;
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.util.EnumSet allOf = java.util.EnumSet.allOf(ti.q0.class);
        ti.s0 s0Var = new ti.s0();
        java.util.Iterator it = allOf.iterator();
        while (it.hasNext()) {
            ti.q0 q0Var = (ti.q0) it.next();
            if (q0Var.a(i17, str2)) {
                q0Var.b(s0Var);
                s0Var.f419510e.f419511a = q0Var.name();
            }
        }
        ti.u0 u0Var = new ti.u0(s0Var);
        try {
            ti.x0 x0Var = new ti.x0(file);
            si.a aVar = new si.a(str, u0Var);
            long nanoTime = java.lang.System.nanoTime();
            try {
                dc.m mVar = x0Var.f419523a;
                dc.j b17 = aVar.b(str, mVar);
                a17 = b17 == null ? ti.a.b(ui.a.a(nanoTime)) : aVar.a(nanoTime, mVar, b17);
            } catch (java.lang.Throwable th6) {
                a17 = ti.a.a(th6, ui.a.a(nanoTime));
            }
        } catch (java.io.IOException e17) {
            a17 = ti.a.a(e17, 0L);
        }
        this.f41825a.d();
        f41824d = false;
        return a17;
    }

    public abstract boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo);

    public final void c(int i17, wi.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        d(i17, bVar, str, str2, str3, str4, 0);
    }

    public final void d(int i17, wi.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        e(i17, bVar, str, str2, str3, str4, i18, null);
    }

    public final void e(int i17, wi.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5) {
        ri.d0 d0Var = new ri.d0(i17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("dump_mode", bVar.name());
            jSONObject.put(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
            jSONObject.put("ref_key", str2);
            jSONObject.put("leak_detail", str3);
            jSONObject.put("cost_millis", str4);
            jSONObject.put("retry_count", i18);
            jSONObject.put("hprof_path", str5);
        } catch (org.json.JSONException e17) {
            oj.j.d("Matrix.LeakProcessor.Base", e17, "", new java.lang.Object[0]);
        }
        d0Var.f395862d = jSONObject;
        this.f41825a.f52980e.d(d0Var);
    }
}

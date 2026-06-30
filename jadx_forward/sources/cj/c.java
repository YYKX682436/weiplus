package cj;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f123357d;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f f123358a;

    /* renamed from: b, reason: collision with root package name */
    public xi.e f123359b;

    /* renamed from: c, reason: collision with root package name */
    public xi.d f123360c;

    public c(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar) {
        this.f123358a = fVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:14:0x007c). Please report as a decompilation issue!!! */
    public ti.a a(java.io.File file, java.lang.String str) {
        ti.a a17;
        f123357d = true;
        java.lang.String str2 = ((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class)).f134533h.f527661d;
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.util.EnumSet allOf = java.util.EnumSet.allOf(ti.q0.class);
        ti.s0 s0Var = new ti.s0();
        java.util.Iterator it = allOf.iterator();
        while (it.hasNext()) {
            ti.q0 q0Var = (ti.q0) it.next();
            if (q0Var.a(i17, str2)) {
                q0Var.b(s0Var);
                s0Var.f501043e.f501044a = q0Var.name();
            }
        }
        ti.u0 u0Var = new ti.u0(s0Var);
        try {
            ti.x0 x0Var = new ti.x0(file);
            si.a aVar = new si.a(str, u0Var);
            long nanoTime = java.lang.System.nanoTime();
            try {
                dc.m mVar = x0Var.f501056a;
                dc.j b17 = aVar.b(str, mVar);
                a17 = b17 == null ? ti.a.b(ui.a.a(nanoTime)) : aVar.a(nanoTime, mVar, b17);
            } catch (java.lang.Throwable th6) {
                a17 = ti.a.a(th6, ui.a.a(nanoTime));
            }
        } catch (java.io.IOException e17) {
            a17 = ti.a.a(e17, 0L);
        }
        this.f123358a.d();
        f123357d = false;
        return a17;
    }

    public abstract boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 c4706x164388f6);

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
            jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, str);
            jSONObject.put("ref_key", str2);
            jSONObject.put("leak_detail", str3);
            jSONObject.put("cost_millis", str4);
            jSONObject.put("retry_count", i18);
            jSONObject.put("hprof_path", str5);
        } catch (org.json.JSONException e17) {
            oj.j.d("Matrix.LeakProcessor.Base", e17, "", new java.lang.Object[0]);
        }
        d0Var.f477395d = jSONObject;
        this.f123358a.f134513e.d(d0Var);
    }
}

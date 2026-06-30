package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static int f234651a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f234652b;

    public static final void a(ob0.s3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.A + info.B > 2097152 && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            f234651a++;
        }
        if (f234651a < 3 || f234652b || !ih.a.f(e42.d0.clicfg_matrix_m_oldbg_ams_pss_with_isolated_xweb_2g_enable, true)) {
            return;
        }
        ri.i0 i0Var = ri.k0.f477453a;
        long j17 = info.f425499w;
        int i17 = info.A + info.B;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", info.C.length);
            jSONObject.put("detail", jSONArray);
            ob0.s3[] allProcessMemInfos = info.C;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allProcessMemInfos, "allProcessMemInfos");
            java.util.ArrayList arrayList = new java.util.ArrayList(allProcessMemInfos.length);
            for (ob0.s3 s3Var : allProcessMemInfos) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("process", s3Var.f425478b);
                jSONObject2.put("pid", s3Var.f425477a);
                jSONObject2.put("amsPss", s3Var.f425501y);
                arrayList.add(jSONObject2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("process", "IsolatedXWeb");
            jSONObject3.put("pid", -1);
            jSONObject3.put("amsPss", info.B);
            jSONArray.put(jSONObject3);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.Common", th6, "", new java.lang.Object[0]);
        }
        java.lang.String b17 = ri.l0.b(jSONObject);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        android.app.ActivityManager activityManager = oj.p.f427245a;
        oj.p.f427245a.getMemoryInfo(memoryInfo);
        i0Var.a(new ri.j0(1000, null, 0, 0, 0L, 0L, 0L, 0, null, 0, null, i17, b17, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, j17, ri.l0.b(new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold).a()), null, null, 0, 0, null, null, 0, 0, -25171970, 1, null));
        f234652b = true;
    }
}

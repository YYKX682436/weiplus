package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f118427a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<c.t.m.p134x35c0ce.c.a> f118428b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f118429c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<c.t.m.p134x35c0ce.c.a> f118430d = null;

    /* renamed from: e, reason: collision with root package name */
    public c.t.m.p134x35c0ce.c.c f118431e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118432f;

    public h(android.content.Context context, java.util.List<c.t.m.p134x35c0ce.c.a> list, boolean z17) {
        this.f118428b = null;
        this.f118431e = null;
        this.f118427a = context;
        this.f118432f = z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f118428b = arrayList;
        arrayList.addAll(list);
        this.f118431e = new c.t.m.p134x35c0ce.c.c(this.f118427a);
    }

    public final boolean a(java.lang.String str) {
        java.lang.String c17 = c.t.m.p134x35c0ce.c.q.c(c.t.m.p134x35c0ce.c.l.a(str, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
        if (c17 == null) {
            return false;
        }
        this.f118430d = c.t.m.p134x35c0ce.c.q.d(c17);
        java.util.List<c.t.m.p134x35c0ce.c.a> d17 = c.t.m.p134x35c0ce.c.q.d(c.t.m.p134x35c0ce.c.q.c(this.f118427a, "__bad_dex_info___sapp", "preference_default_sapp"));
        boolean a17 = !d17.isEmpty() ? c.t.m.p134x35c0ce.c.k.a(d17, this.f118430d) : false;
        boolean a18 = a(this.f118428b, this.f118430d);
        java.util.List<c.t.m.p134x35c0ce.c.a> d18 = c.t.m.p134x35c0ce.c.q.d(c.t.m.p134x35c0ce.c.q.c(this.f118427a, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "preference_default_sapp"));
        boolean a19 = !d18.isEmpty() ? c.t.m.p134x35c0ce.c.k.a(d18, this.f118430d) : false;
        c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "need and samebad:" + a18 + "," + a17);
        if (a18 || a17 || a19) {
            return false;
        }
        c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "to download:".concat(c17));
        this.f118431e.b(this.f118430d);
        return true;
    }

    public final boolean b() {
        return java.lang.System.currentTimeMillis() - c.t.m.p134x35c0ce.c.q.a(this.f118427a, "__last_check_update_time___sapp", (java.lang.Long) 0L).longValue() > 3600000;
    }

    public final boolean c() {
        byte[] bytes;
        java.lang.String a17 = a();
        if (a17 != null && (bytes = a17.getBytes()) != null) {
            new java.util.HashMap();
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                if (i17 >= 3) {
                    break;
                }
                byte[] a18 = c.t.m.p134x35c0ce.c.o.a("https://lhp.map.qq.com?desc_c", bytes);
                if (a18 != null) {
                    java.lang.String str = new java.lang.String(a18);
                    c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "response suc,try:" + i18);
                    return a(str);
                }
                c.t.m.p134x35c0ce.c.q.a(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                i17 = i18;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b17 = b();
        c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "t:" + b17 + ",i:" + this.f118432f);
        c();
        c.t.m.p134x35c0ce.c.q.b(this.f118427a, "__last_check_update_time___sapp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        c.t.m.p134x35c0ce.c.e.a(this.f118427a).d();
    }

    public final boolean a(java.util.List<c.t.m.p134x35c0ce.c.a> list, java.util.List<c.t.m.p134x35c0ce.c.a> list2) {
        boolean z17;
        boolean z18 = true;
        for (c.t.m.p134x35c0ce.c.a aVar : list) {
            java.util.Iterator<c.t.m.p134x35c0ce.c.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                c.t.m.p134x35c0ce.c.a next = it.next();
                if (!next.f118390c.contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                    next.f118390c += com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99;
                }
                if (aVar.f118390c.equals(next.f118390c) && aVar.f118391d == next.f118391d && aVar.f118392e.equals(next.f118392e)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                z18 = false;
            }
        }
        return z18;
    }

    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f118427a.getFilesDir().getAbsolutePath() + java.io.File.separator + c.t.m.p134x35c0ce.c.q.f118449b;
        try {
            jSONObject.put("appkey", c.t.m.p134x35c0ce.c.q.k(this.f118427a));
            jSONObject.put("appversion", c.t.m.p134x35c0ce.c.q.b(this.f118427a));
            jSONObject.put("imei", c.t.m.p134x35c0ce.c.q.g(this.f118427a));
            jSONObject.put("coverSDKver", c.t.m.p134x35c0ce.c.g.f118423a);
            jSONObject.put("model", c.t.m.p134x35c0ce.c.q.e() + "_" + c.t.m.p134x35c0ce.c.q.f());
            jSONObject.put("APILevel", c.t.m.p134x35c0ce.c.q.b());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List<c.t.m.p134x35c0ce.c.a> list = this.f118428b;
            if (list != null) {
                for (c.t.m.p134x35c0ce.c.a aVar : list) {
                    if (aVar != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("compId", aVar.f118388a);
                        jSONObject2.put("compVer", aVar.f118389b);
                        jSONObject2.put("size", aVar.f118391d);
                        jSONObject2.put("md5", c.t.m.p134x35c0ce.c.q.a(new java.io.File(str, aVar.f118390c)));
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("compList", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "req:" + jSONObject3);
            return c.t.m.p134x35c0ce.c.l.b(jSONObject3, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q");
        } catch (java.lang.Exception e17) {
            c.t.m.p134x35c0ce.c.e.a(this.f118427a).a("DRG", "reqDerror:" + e17.toString());
            return null;
        }
    }
}

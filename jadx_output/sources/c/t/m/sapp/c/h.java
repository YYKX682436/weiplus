package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f36894a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<c.t.m.sapp.c.a> f36895b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36896c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<c.t.m.sapp.c.a> f36897d = null;

    /* renamed from: e, reason: collision with root package name */
    public c.t.m.sapp.c.c f36898e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36899f;

    public h(android.content.Context context, java.util.List<c.t.m.sapp.c.a> list, boolean z17) {
        this.f36895b = null;
        this.f36898e = null;
        this.f36894a = context;
        this.f36899f = z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f36895b = arrayList;
        arrayList.addAll(list);
        this.f36898e = new c.t.m.sapp.c.c(this.f36894a);
    }

    public final boolean a(java.lang.String str) {
        java.lang.String c17 = c.t.m.sapp.c.q.c(c.t.m.sapp.c.l.a(str, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
        if (c17 == null) {
            return false;
        }
        this.f36897d = c.t.m.sapp.c.q.d(c17);
        java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(c.t.m.sapp.c.q.c(this.f36894a, "__bad_dex_info___sapp", "preference_default_sapp"));
        boolean a17 = !d17.isEmpty() ? c.t.m.sapp.c.k.a(d17, this.f36897d) : false;
        boolean a18 = a(this.f36895b, this.f36897d);
        java.util.List<c.t.m.sapp.c.a> d18 = c.t.m.sapp.c.q.d(c.t.m.sapp.c.q.c(this.f36894a, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "preference_default_sapp"));
        boolean a19 = !d18.isEmpty() ? c.t.m.sapp.c.k.a(d18, this.f36897d) : false;
        c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "need and samebad:" + a18 + "," + a17);
        if (a18 || a17 || a19) {
            return false;
        }
        c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "to download:".concat(c17));
        this.f36898e.b(this.f36897d);
        return true;
    }

    public final boolean b() {
        return java.lang.System.currentTimeMillis() - c.t.m.sapp.c.q.a(this.f36894a, "__last_check_update_time___sapp", (java.lang.Long) 0L).longValue() > 3600000;
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
                byte[] a18 = c.t.m.sapp.c.o.a("https://lhp.map.qq.com?desc_c", bytes);
                if (a18 != null) {
                    java.lang.String str = new java.lang.String(a18);
                    c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "response suc,try:" + i18);
                    return a(str);
                }
                c.t.m.sapp.c.q.a(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                i17 = i18;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b17 = b();
        c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "t:" + b17 + ",i:" + this.f36899f);
        c();
        c.t.m.sapp.c.q.b(this.f36894a, "__last_check_update_time___sapp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        c.t.m.sapp.c.e.a(this.f36894a).d();
    }

    public final boolean a(java.util.List<c.t.m.sapp.c.a> list, java.util.List<c.t.m.sapp.c.a> list2) {
        boolean z17;
        boolean z18 = true;
        for (c.t.m.sapp.c.a aVar : list) {
            java.util.Iterator<c.t.m.sapp.c.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                c.t.m.sapp.c.a next = it.next();
                if (!next.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                    next.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
                }
                if (aVar.f36857c.equals(next.f36857c) && aVar.f36858d == next.f36858d && aVar.f36859e.equals(next.f36859e)) {
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
        java.lang.String str = this.f36894a.getFilesDir().getAbsolutePath() + java.io.File.separator + c.t.m.sapp.c.q.f36916b;
        try {
            jSONObject.put("appkey", c.t.m.sapp.c.q.k(this.f36894a));
            jSONObject.put("appversion", c.t.m.sapp.c.q.b(this.f36894a));
            jSONObject.put("imei", c.t.m.sapp.c.q.g(this.f36894a));
            jSONObject.put("coverSDKver", c.t.m.sapp.c.g.f36890a);
            jSONObject.put("model", c.t.m.sapp.c.q.e() + "_" + c.t.m.sapp.c.q.f());
            jSONObject.put("APILevel", c.t.m.sapp.c.q.b());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List<c.t.m.sapp.c.a> list = this.f36895b;
            if (list != null) {
                for (c.t.m.sapp.c.a aVar : list) {
                    if (aVar != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("compId", aVar.f36855a);
                        jSONObject2.put("compVer", aVar.f36856b);
                        jSONObject2.put("size", aVar.f36858d);
                        jSONObject2.put("md5", c.t.m.sapp.c.q.a(new java.io.File(str, aVar.f36857c)));
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("compList", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "req:" + jSONObject3);
            return c.t.m.sapp.c.l.b(jSONObject3, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q");
        } catch (java.lang.Exception e17) {
            c.t.m.sapp.c.e.a(this.f36894a).a("DRG", "reqDerror:" + e17.toString());
            return null;
        }
    }
}

package j85;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j85.g f379784a = new j85.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f379785b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f379786c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f379787d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f379788e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f379789f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f379790g;

    static {
        new java.util.HashMap();
        f379785b = "MicroMsg.SensitiveReporter";
        f379786c = new java.util.concurrent.CopyOnWriteArrayList();
        f379787d = new java.util.HashMap();
        f379788e = new java.util.ArrayList();
        f379789f = 2000L;
        f379790g = jz5.h.b(j85.b.f379774d);
    }

    public static final void a(j85.g gVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0 c6952x82e688b0) {
        gVar.getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f379786c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(c6952x82e688b0);
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f379790g).mo141623x754a37bb()).mo50305x3d8a09a2(1);
    }

    public final void b(java.lang.String methodName, java.lang.String throwAbleStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwAbleStr, "throwAbleStr");
        pm0.v.M(f379785b, false, new j85.e(throwAbleStr, methodName), 2, null);
    }

    public final void c(d85.g0 permission, d85.f0 f0Var, java.lang.String str) {
        java.lang.String str2 = f379785b;
        java.lang.String str3 = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[reportUnControlSwitch] enter");
            java.lang.String str4 = f0Var != null ? f0Var.f308709d : null;
            if (str4 == null) {
                str4 = "null";
            }
            int i17 = f0Var != null ? f0Var.f308710e : -1;
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            java.util.List list = (java.util.List) e85.i.f331852e.get(permission.f308725d);
            boolean z17 = !(list != null && list.contains(str4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[reportUnControlSwitch] permission:" + permission + ", business:" + f0Var + ", isUnControl:" + z17 + ", process:" + bm5.f1.a());
            if (z17) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("webview_url_prefs_url", "");
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                java.lang.String g07 = g0Var != null ? kz5.n0.g0(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).xj(), "|", null, null, 0, null, null, 62, null) : "";
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("currentUrl", string);
                jSONObject.put("liteAppIdStr", g07);
                if (str != null) {
                    str3 = str;
                }
                jSONObject.put("appBrandId", str3);
                jSONObject.put("activityDump", um0.a.a());
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jSONObject.put("callerStack", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[reportUnControlSwitch] json = ".concat(r26.i0.t(jSONObject2, ",", ";", false)));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                ((cy1.a) rVar).Ej("request_sys_permission", kz5.c1.k(new jz5.l("business_id", r26.i0.t(jSONObject3, ",", ";", false)), new jz5.l("sys_permission_id", java.lang.String.valueOf(permission.f308726e)), new jz5.l("business_scene_id", java.lang.String.valueOf(i17))), 33328);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[reportUnControlSwitch] exit");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[reportUnControlSwitch] error:" + th6.getMessage());
        }
    }
}

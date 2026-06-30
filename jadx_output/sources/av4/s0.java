package av4;

/* loaded from: classes7.dex */
public final class s0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.s0 f14332d = new av4.s0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + msg.f340790a);
        java.util.Map map = msg.f340790a;
        int i17 = -1;
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "capability", -1);
        int e18 = com.tencent.mm.plugin.websearch.l2.e(map, "authScene", -1);
        if (e17 == 1) {
            g0Var = d85.g0.LOCAION;
        } else if (e17 == 6) {
            g0Var = d85.g0.STORAGE;
        } else {
            if (e17 != 11) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "capability error: " + e17);
                return true;
            }
            g0Var = d85.g0.CAMERA;
        }
        if (e18 == 10) {
            f0Var = d85.f0.f227167r;
        } else {
            if (e18 != 11) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "authScene error: " + e18);
                return true;
            }
            f0Var = d85.f0.f227168s;
        }
        android.content.Context context = env.f340860a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            java.util.HashMap hashMap = e85.i.f250315a;
            java.util.Set entrySet = e85.i.f250316b.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : entrySet) {
                if (((java.util.Map.Entry) obj).getValue() == g0Var) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(activity, (java.lang.String) it6.next(), f0Var.f227177e);
                if (ij6 == d85.h0.SYSTEM_REFUSE) {
                    i17 = 2;
                } else {
                    if (ij6 == d85.h0.BUSINESS_REFUSE) {
                        i17 = 3;
                    }
                    if (ij6 == d85.h0.GRANTED && i17 != 3) {
                        i17 = 1;
                    }
                    if (ij6 == d85.h0.ERROR) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ij6.f227201d);
                    }
                }
            }
        }
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("retCode", 0);
        lVarArr[1] = new jz5.l("status", java.lang.Integer.valueOf(i17));
        lVarArr[2] = new jz5.l("locationSystemAuthorizationStatus", 0);
        lVarArr[3] = new jz5.l("accuracyAuthorization", java.lang.Boolean.FALSE);
        lVarArr[4] = new jz5.l("isLocationAuthExptEnable", java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_websearch_location_req, 0) == 1));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", k17);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "systemCapabilityAuthorizationStatus";
    }
}

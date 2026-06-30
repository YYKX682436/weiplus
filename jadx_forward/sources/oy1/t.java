package oy1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ oy1.t f431459a = new oy1.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f431460b = new java.util.LinkedHashMap();

    public final oy1.c0 a(int i17) {
        oy1.c0 c0Var;
        java.util.Map map = f431460b;
        synchronized (map) {
            if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
                map.put(java.lang.Integer.valueOf(i17), new oy1.c0(i17));
            }
            c0Var = (oy1.c0) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        }
        return c0Var;
    }

    public final void b(int i17, java.util.List reportInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoList, "reportInfoList");
        oy1.c0 a17 = a(i17);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a17.f431380b, "LiteAppCustomReportCgiEvent size = " + reportInfoList.size());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i18 = a17.i();
            android.os.Message mo50288x733c63a2 = a17.i().mo50288x733c63a2();
            mo50288x733c63a2.what = 1008;
            mo50288x733c63a2.obj = reportInfoList;
            i18.mo50308x2936bf5f(mo50288x733c63a2);
        }
    }

    public final void c(boolean z17) {
        java.util.Map map = f431460b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                ((oy1.c0) entry.getValue()).j(z17);
            }
        }
    }

    public final void d() {
        java.util.Map map = f431460b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                qy1.b0 b0Var = ((oy1.c0) entry.getValue()).f431387i;
                p3325xe03a0797.p3326xc267989b.z0.d(b0Var.f449248n, "CgiStorageHelper send destroyed", null, 2, null);
                p3325xe03a0797.p3326xc267989b.z0.d(b0Var.f449249o, "CgiStorageHelper receive destroyed", null, 2, null);
                u26.x0.a(b0Var.f449245k, null, 1, null);
                p3325xe03a0797.p3326xc267989b.l.f(null, new qy1.q(b0Var, null), 1, null);
            }
        }
    }

    public final void e() {
        java.util.Map map = f431460b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                oy1.c0 c0Var = (oy1.c0) entry.getValue();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i17 = c0Var.i();
                android.os.Message mo50288x733c63a2 = c0Var.i().mo50288x733c63a2();
                mo50288x733c63a2.what = 1007;
                i17.mo50308x2936bf5f(mo50288x733c63a2);
            }
        }
    }
}

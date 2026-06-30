package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f206976b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f206977c = true;

    /* renamed from: d, reason: collision with root package name */
    public static int f206978d;

    /* renamed from: e, reason: collision with root package name */
    public static int f206979e;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 f206975a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f206980f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f206981g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209188d7).mo141623x754a37bb()).r()).intValue() == 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b(int i17, int i18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f206981g;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), concurrentHashMap2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0) concurrentHashMap2.get(java.lang.Integer.valueOf(i18));
        if (v0Var != null) {
            return v0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 v0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0();
        concurrentHashMap2.put(java.lang.Integer.valueOf(i18), v0Var2);
        return v0Var2;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f206980f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (w0Var != null) {
            return w0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 w0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0();
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), w0Var2);
        return w0Var2;
    }

    public final void d(int i17, boolean z17, boolean z18, int i18) {
        if (!a() && f206976b) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onCgiStart] tabType:" + i17 + " isAuto:" + z18 + " cgiStatus:" + i18);
                h(i17, 11, z18);
                c(i17).f206951f = i18;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onCgiEnd] tabType:" + i17 + " isAuto:" + z18 + " cgiStatus:" + i18);
            h(i17, 12, z18);
            c(i17).f206951f = i18;
        }
    }

    public final void e(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (a()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onEnterList] tabType:" + i17 + " curPosition:" + i18);
        f206979e = i17;
        c(i17).f206947b = i18;
        h(i17, 3, false);
        g(context, i17, new jz5.l(3, 0), false);
    }

    public final void f(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (a()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onLeaveList] tabType:" + i17 + " curPosition:" + i18);
        f206979e = i17;
        c(i17).f206947b = i18;
        h(i17, 4, false);
        g(context, i17, new jz5.l(4, 3), true);
    }

    public final long g(android.content.Context context, int i17, jz5.l lVar, boolean z17) {
        long j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c17 = c(i17);
        jSONObject.put("curPosition", c17.f206947b);
        jSONObject.put("itemCount", c17.f206946a);
        jSONObject.put("isExposed", c17.f206949d);
        jSONObject.put("isLoading", c17.f206948c);
        jSONObject.put("isTop", c17.f206950e);
        jSONObject.put("cgiStatus", c17.f206951f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b17 = b(i17, ((java.lang.Number) lVar.f384366d).intValue());
        jSONObject.put("actionType", b17.f206923a);
        jSONObject.put("actionTime", b17.f206924b);
        jSONObject.put("isAuto", b17.f206925c);
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        java.lang.Number number = (java.lang.Number) lVar.f384367e;
        int intValue2 = number.intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(intValue);
        sb6.append('-');
        sb6.append(intValue2);
        jSONObject.put("pairType", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b18 = b(i17, number.intValue());
        long j18 = b18.f206924b;
        long j19 = 0;
        if (j18 > 0) {
            long j27 = b17.f206924b;
            j17 = j27 > j18 ? j27 - j18 : java.lang.System.currentTimeMillis() - b18.f206924b;
        } else {
            j17 = 0;
        }
        jSONObject.put("pairTime", j17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b19 = b(i17, 12);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b27 = b(i17, 11);
            long j28 = b27.f206924b;
            if (j28 > 0) {
                long j29 = b19.f206924b;
                if (j29 <= j28) {
                    j29 = java.lang.System.currentTimeMillis();
                    j28 = b27.f206924b;
                }
                j19 = j29 - j28;
            }
            jSONObject.put("cgiTime", j19);
        }
        jSONObject.put("tabType", i17);
        jSONObject.put("enterTabType", f206978d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            long j37 = b17.f206924b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActionReporter", "[report23788] sessionId:" + V6.m75945x2fec8307(0) + ", contextId:" + V6.m75945x2fec8307(1) + ", clickTabContextId:" + V6.m75945x2fec8307(2) + ", commentScene:" + V6.m75939xb282bd08(5) + ", changeVersion:2 reportType:1, timeStamp:" + j37 + ", actionData:" + jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23788, V6.m75945x2fec8307(0), V6.m75945x2fec8307(1), V6.m75945x2fec8307(2), java.lang.Integer.valueOf(V6.m75939xb282bd08(5)), 2, 1, java.lang.Integer.valueOf((int) (j37 / 1000)), jSONObject2 != null ? r26.i0.t(jSONObject2, ",", ";", false) : "");
        }
        return j17;
    }

    public final void h(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v0 b17 = b(i17, i18);
        b17.f206924b = java.lang.System.currentTimeMillis();
        b17.f206923a = i18;
        b17.f206925c = z17;
    }
}

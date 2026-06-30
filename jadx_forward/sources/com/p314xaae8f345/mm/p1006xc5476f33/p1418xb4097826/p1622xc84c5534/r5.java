package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes3.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5 f206868a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 f206869b;

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = f206869b;
        if (q5Var != null && q5Var.f206804d == 0) {
            if (q5Var != null) {
                q5Var.f206804d = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var2 = f206869b;
            if (q5Var2 != null) {
                if (q5Var2.f206801a == 0 || q5Var2.f206802b == 0 || q5Var2.f206803c == 0 || q5Var2.f206805e == 0 || q5Var2.f206804d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEnterCostReporter", "report invalid data, enter=" + q5Var2.f206801a + ", reusme=" + q5Var2.f206802b + ", select=" + q5Var2.f206803c + ", startPlay=" + q5Var2.f206805e + ", firstFrame=" + q5Var2.f206804d);
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6501x23a2dd38 c6501x23a2dd38 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6501x23a2dd38();
                    c6501x23a2dd38.f138454d = 10L;
                    c6501x23a2dd38.f138455e = 5L;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("isPreloadSuccess", q5Var2.f206807g);
                    jSONObject.put("totalCost", q5Var2.f206804d - q5Var2.f206801a);
                    jSONObject.put("clickToResumeCost", q5Var2.f206802b - q5Var2.f206801a);
                    jSONObject.put("resumeToSelectCost", q5Var2.f206803c - q5Var2.f206802b);
                    jSONObject.put("selectToStartPlayCost", q5Var2.f206805e - q5Var2.f206803c);
                    jSONObject.put("startPlayToFirstFrame", q5Var2.f206804d - q5Var2.f206805e);
                    jSONObject.put("selectToFirstFrameCost", q5Var2.f206804d - q5Var2.f206803c);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    c6501x23a2dd38.f138456f = c6501x23a2dd38.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r26.i0.t(jSONObject2, ",", ";", false), true);
                    c6501x23a2dd38.f138457g = c6501x23a2dd38.b("tag", q5Var2.f206806f ? "PreloadCoreMode" : "NormalMode", true);
                    c6501x23a2dd38.f138458h = c6501x23a2dd38.b("majorData", java.lang.String.valueOf(q5Var2.f206804d - q5Var2.f206801a), true);
                    c6501x23a2dd38.k();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEnterCostReporter", "report21680 info:" + c6501x23a2dd38.n());
                }
            }
        }
        f206869b = null;
    }
}

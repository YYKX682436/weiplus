package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0 f234637a = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f234638b = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t0.a() + "_native_heap_top";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f234639c = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t0.a() + "_timestamp";

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0.f234660b;
        java.lang.String str = f234638b;
        long q17 = o4Var.q(str, -1L);
        long q18 = o4Var.q(f234639c, 0L);
        if (q17 > 2147483648L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeOOMMonitor", "report top native heap last process " + q17);
            ri.i0 i0Var = ri.k0.f477453a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("time", q18);
            i0Var.a(new ri.j0(302, null, 0, 0, 0L, q17, 0L, 0, null, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67108898, 1, null));
            o4Var.A(str, -1);
        }
    }
}

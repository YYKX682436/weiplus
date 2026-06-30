package yc1;

/* loaded from: classes7.dex */
public class q extends yc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f77527x366c91de = 346;

    /* renamed from: NAME */
    public static final java.lang.String f77528x24728b = "createSocketTask";

    /* renamed from: p, reason: collision with root package name */
    public static uh1.n0 f542334p;

    /* renamed from: h, reason: collision with root package name */
    public final uh1.p0 f542335h;

    /* renamed from: i, reason: collision with root package name */
    public final int f542336i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f542337m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f542338n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f542339o = new java.util.concurrent.atomic.AtomicBoolean(false);

    public q(int i17, uh1.p0 p0Var) {
        this.f542336i = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateSocketTask", "JsApiCreateSocketTask, programType:%d", java.lang.Integer.valueOf(i17));
        this.f542336i = i17;
        this.f542335h = p0Var;
    }

    public static org.json.JSONObject C(yc1.q qVar, xk1.e eVar) {
        qVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        xk1.f fVar = (xk1.f) eVar;
        for (java.lang.String str : java.util.Collections.unmodifiableSet(fVar.f536540a.keySet())) {
            try {
                jSONObject.put(str, fVar.a(str));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiCreateSocketTask", e17, "JSONExceptions ", new java.lang.Object[0]);
            }
        }
        return jSONObject;
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str3 = "fail";
        } else {
            str3 = "fail:" + str2;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("socketTaskId", str);
        hashMap.put("state", "error");
        hashMap.put("errMsg", str3);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(lVar);
        pVar.r(jSONObject);
        pVar.n(this.f542294g.a(str));
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 3L, 1L, false);
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "socketTaskId";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // gb1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r15, org.json.JSONObject r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.q.d(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, java.lang.String):void");
    }

    @Override // gb1.m
    /* renamed from: getTaskId */
    public java.lang.String mo1076x30961476() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f509437b;
        uh1.s0.f509434a.getClass();
        sb6.append(uh1.t0.f509437b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}

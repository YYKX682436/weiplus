package yc1;

/* loaded from: classes7.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77515x366c91de = 347;

    /* renamed from: NAME */
    public static final java.lang.String f77516x24728b = "operateSocketTask";

    /* renamed from: g, reason: collision with root package name */
    public boolean f542290g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f542291h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f542292i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final uh1.p0 f542293m;

    public a0(uh1.p0 p0Var) {
        this.f542293m = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        uh1.p0 p0Var;
        if (!this.f542292i.getAndSet(true) && (p0Var = this.f542293m) != null) {
            this.f542290g = p0Var.a(lVar.mo48798x74292566());
            this.f542291h = p0Var.b(lVar.mo48798x74292566());
        }
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateSocketTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("socketTaskId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
            lVar.a(i17, o("fail:taskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f509437b;
        mf1.i a17 = uh1.s0.f509434a.a(lVar.mo48798x74292566());
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "client is null");
            return;
        }
        mf1.k a18 = a17.a(optString);
        if (a18 == null) {
            lVar.a(i17, o("fail:taskID not exist"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
            return;
        }
        if (optString2.equals("close")) {
            int optInt = jSONObject.optInt("code", 1000);
            if (optInt != 1000 && (optInt < 3000 || optInt >= 5000)) {
                lVar.a(i17, o("fail:The code must be either 1000, or between 3000 and 4999"));
                return;
            }
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "");
            a17.g(a18, optInt, optString3);
            lVar.a(i17, o("ok"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateSocketTask", "closeSocket taskId:%s, code %d, reason %s", optString, java.lang.Integer.valueOf(optInt), optString3);
            return;
        }
        if (!optString2.equals("send")) {
            lVar.a(i17, o("fail:unknown operationType"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:unknown operationType");
            return;
        }
        if (!a17.d(a18)) {
            lVar.a(i17, o("fail:don't send before socket connected"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "send fail taskId: %s", optString);
            return;
        }
        java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (opt == null) {
            lVar.a(i17, o("fail:message is null or nil"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:%s", opt);
            return;
        }
        try {
            if (opt instanceof java.nio.ByteBuffer) {
                a17.e(a18, (java.nio.ByteBuffer) opt);
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 4L, 1L, false);
            } else if (!(opt instanceof java.lang.String)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
                lVar.a(i17, o("fail:unknown data"));
                return;
            } else {
                a17.b(a18, (java.lang.String) opt);
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 4L, 1L, false);
            }
            lVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            lVar.a(i17, o("fail:" + e17.getMessage()));
            if (this.f542290g || this.f542291h) {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 6L, 1L, false);
            } else {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 5L, 1L, false);
            }
        }
    }
}

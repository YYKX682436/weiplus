package ad1;

/* loaded from: classes7.dex */
public class b implements uh1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f3108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad1.a f3109e;

    public b(ad1.a aVar, java.lang.ref.WeakReference weakReference, long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f3109e = aVar;
        this.f3105a = weakReference;
        this.f3106b = j17;
        this.f3107c = str;
        this.f3108d = lVar;
    }

    public void a(org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar;
        if (jSONObject == null || (lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f3105a.get()) == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        java.lang.String str = this.f3107c;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent();
                am.u uVar = appBrandNetWorkReqHeaderReceivedEvent.f53981g;
                uVar.f8045a = "request";
                uVar.f8047c = jSONObject;
                uVar.f8046b = str;
                appBrandNetWorkReqHeaderReceivedEvent.e();
                return;
            }
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestTaskId", str);
        hashMap.put("state", "headersReceived");
        hashMap.put("header", jSONObject);
        hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
        ad1.c cVar = new ad1.c();
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        cVar.p(lVar);
        cVar.r(jSONObject2);
        cVar.n(this.f3109e.f3102h.a(str));
    }

    public void b(java.lang.String str, java.lang.String str2, int i17, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f3105a.get();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f3106b);
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        java.lang.String str3 = this.f3107c;
        objArr[2] = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "onRequestResult, time: %d, data size: %d,requestTaskId %s", objArr);
        if (lVar == null) {
            return;
        }
        if ("fail".equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateRequestTask", "onRequestResult taskId[%s] reason[%s] data[%s] errno[%d]", str3, str, str2, java.lang.Integer.valueOf(i17));
        }
        uh1.q a17 = uh1.s.f427900a.a(lVar);
        if (a17 != null && ((java.util.concurrent.ConcurrentSkipListSet) a17.f427856c).contains(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateRequestTask", "request abort %s", str3);
            return;
        }
        this.f3109e.b(lVar, this.f3107c, str2, i17, map);
        uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
        lVar.getAppId();
        h1Var.getClass();
    }

    public void c(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str3 = this.f3107c;
        hashMap.put("requestTaskId", str3);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesWritten", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToWrite", java.lang.Long.valueOf(j18));
        ad1.c cVar = new ad1.c();
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        cVar.p(this.f3108d);
        cVar.r(jSONObject);
        cVar.n(this.f3109e.f3102h.a(str3));
    }
}

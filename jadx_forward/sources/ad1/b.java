package ad1;

/* loaded from: classes7.dex */
public class b implements uh1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f84638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f84641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad1.a f84642e;

    public b(ad1.a aVar, java.lang.ref.WeakReference weakReference, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f84642e = aVar;
        this.f84638a = weakReference;
        this.f84639b = j17;
        this.f84640c = str;
        this.f84641d = lVar;
    }

    public void a(org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar;
        if (jSONObject == null || (lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f84638a.get()) == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        java.lang.String str = this.f84640c;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6();
                am.u uVar = c5164x497885b6.f135514g;
                uVar.f89578a = "request";
                uVar.f89580c = jSONObject;
                uVar.f89579b = str;
                c5164x497885b6.e();
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
        cVar.n(this.f84642e.f84635h.a(str));
    }

    public void b(java.lang.String str, java.lang.String str2, int i17, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f84638a.get();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f84639b);
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        java.lang.String str3 = this.f84640c;
        objArr[2] = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "onRequestResult, time: %d, data size: %d,requestTaskId %s", objArr);
        if (lVar == null) {
            return;
        }
        if ("fail".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateRequestTask", "onRequestResult taskId[%s] reason[%s] data[%s] errno[%d]", str3, str, str2, java.lang.Integer.valueOf(i17));
        }
        uh1.q a17 = uh1.s.f509433a.a(lVar);
        if (a17 != null && ((java.util.concurrent.ConcurrentSkipListSet) a17.f509389c).contains(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateRequestTask", "request abort %s", str3);
            return;
        }
        this.f84642e.b(lVar, this.f84640c, str2, i17, map);
        uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
        lVar.mo48798x74292566();
        h1Var.getClass();
    }

    public void c(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str3 = this.f84640c;
        hashMap.put("requestTaskId", str3);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesWritten", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToWrite", java.lang.Long.valueOf(j18));
        ad1.c cVar = new ad1.c();
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        cVar.p(this.f84641d);
        cVar.r(jSONObject);
        cVar.n(this.f84642e.f84635h.a(str3));
    }
}

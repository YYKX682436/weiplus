package uh1;

/* loaded from: classes7.dex */
public class b0 implements wh1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.c0 f509299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh1.e0 f509300c;

    public b0(uh1.e0 e0Var, java.lang.String str, uh1.c0 c0Var) {
        this.f509300c = e0Var;
        this.f509298a = str;
        this.f509299b = c0Var;
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f509300c.b(this.f509298a);
        ((bd1.a) this.f509299b).a(-1, str3, i17);
    }

    public void b(java.lang.String str) {
        this.f509300c.f509313h.remove(str);
    }

    public void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f509300c.b(this.f509298a);
        bd1.a aVar = (bd1.a) this.f509299b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str4 = aVar.f100767b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "onUploadResultWithCode uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, statusCode %d", str4, aVar.f100768c, str3, 0, valueOf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str3);
        hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
        hashMap.put("uploadTaskId", str4);
        hashMap.put("state", ya.b.f77504xbb80cbe3);
        org.json.JSONObject jSONObject = aVar.f100766a;
        if (jSONObject != null) {
            hashMap.put("header", jSONObject);
        }
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(aVar.f100769d);
        bVar.r(jSONObject2);
        bd1.c cVar = aVar.f100770e;
        bVar.n(cVar.f100773f.a(str4));
        cVar.f100773f.b(str4);
    }

    public void d(org.json.JSONObject jSONObject) {
        bd1.a aVar = (bd1.a) this.f509299b;
        aVar.getClass();
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = aVar.f100769d;
        java.lang.String str = aVar.f100767b;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6();
                am.u uVar = c5164x497885b6.f135514g;
                uVar.f89578a = "upload";
                uVar.f89580c = jSONObject;
                uVar.f89579b = str;
                c5164x497885b6.e();
                return;
            }
            return;
        }
        aVar.f100766a = jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uploadTaskId", str);
        hashMap.put("state", "headersReceived");
        hashMap.put("header", aVar.f100766a);
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(aVar.f100770e.f100773f.a(str));
    }

    public void e(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        bd1.a aVar = (bd1.a) this.f509299b;
        aVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str3 = aVar.f100767b;
        hashMap.put("uploadTaskId", str3);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesSent", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToSend", java.lang.Long.valueOf(j18));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(aVar.f100769d);
        bVar.r(jSONObject);
        bVar.n(aVar.f100770e.f100773f.a(str3));
    }
}

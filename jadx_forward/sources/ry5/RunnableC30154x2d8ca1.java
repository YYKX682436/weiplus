package ry5;

/* renamed from: ry5.c$$d */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC30154x2d8ca1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry5.c f483254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483255e;

    public /* synthetic */ RunnableC30154x2d8ca1(ry5.c cVar, java.lang.String str) {
        this.f483254d = cVar;
        this.f483255e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str = this.f483255e;
        ry5.c cVar = this.f483254d;
        cVar.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            i17 = jSONObject.getInt("action");
            try {
                jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            } catch (org.json.JSONException unused) {
            }
        } catch (org.json.JSONException unused2) {
            i17 = -1;
        }
        if (i17 == 1) {
            cVar.e();
            cVar.c();
            if (a.b.c().f81581e != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").putString("sentinel_main_start", cVar.f483236a);
                return;
            }
            return;
        }
        if (i17 == 2) {
            cVar.e();
            return;
        }
        if (i17 == 5) {
            return;
        }
        if (i17 == 6) {
            cVar.c();
            return;
        }
        xy5.b.a("enricwu.SentinelService", "unknow action : " + i17);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f225000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f225002f;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String[] strArr, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f225000d = strArr;
        this.f225001e = str;
        this.f225002f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754) com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_schedule_data").r(this.f225001e, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754.class);
        if (c16221xf9b96754 == null) {
            jSONObject = "{}";
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("interval", c16221xf9b96754.f225414d);
                jSONObject3.put("repeat", c16221xf9b96754.f225415e);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c16221xf9b96754.f225416f);
                jSONObject4.put("payload", c16221xf9b96754.f225417g);
                jSONObject3.put("action", jSONObject4);
                jSONObject3.put("forceDispatch", c16221xf9b96754.f225418h);
                jSONObject3.put("aliveDurationSeconds", c16221xf9b96754.f225419i);
                jSONObject2.put("scheduleOption", jSONObject3);
                jSONObject2.put("lastTriggerTime", c16221xf9b96754.f225420m);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.MMLiteAppScheduleData", "toJasonString JSONException" + e17.toString());
            }
            jSONObject = jSONObject2.toString();
        }
        this.f225000d[0] = jSONObject;
        this.f225002f.countDown();
    }
}

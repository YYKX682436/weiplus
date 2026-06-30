package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* renamed from: com.tencent.matrix.resource.CanaryResultService */
/* loaded from: classes12.dex */
public class ServiceC4702xa5693200 extends com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd {
    public static void f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.ServiceC4702xa5693200.class);
        intent.setAction("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT");
        intent.putExtra("RESULT_PATH", str);
        intent.putExtra("RESULT_ACTIVITY", str2);
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd.a(context, com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.ServiceC4702xa5693200.class, -84148994, intent);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd
    public void d(android.content.Intent intent) {
        if (intent == null || !"com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT".equals(intent.getAction())) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("RESULT_PATH");
        java.lang.String stringExtra2 = intent.getStringExtra("RESULT_ACTIVITY");
        if (stringExtra == null || stringExtra.isEmpty() || stringExtra2 == null || stringExtra2.isEmpty()) {
            oj.j.b("Matrix.CanaryResultService", "resultPath or activityName is null or empty, skip reporting.", new java.lang.Object[0]);
            return;
        }
        ri.d0 d0Var = new ri.d0(0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("resultZipPath", stringExtra);
            jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, stringExtra2);
            d0Var.f477395d = jSONObject;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.CanaryResultService", th6, "unexpected exception, skip reporting.", new java.lang.Object[0]);
        }
        qi.b a17 = ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class);
        if (a17 != null) {
            a17.d(d0Var);
        }
    }
}

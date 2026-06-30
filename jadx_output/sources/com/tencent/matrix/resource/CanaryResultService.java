package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public class CanaryResultService extends com.tencent.matrix.resource.MatrixJobIntentService {
    public static void f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.matrix.resource.CanaryResultService.class);
        intent.setAction("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT");
        intent.putExtra("RESULT_PATH", str);
        intent.putExtra("RESULT_ACTIVITY", str2);
        com.tencent.matrix.resource.MatrixJobIntentService.a(context, com.tencent.matrix.resource.CanaryResultService.class, -84148994, intent);
    }

    @Override // com.tencent.matrix.resource.MatrixJobIntentService
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
            jSONObject.put(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, stringExtra2);
            d0Var.f395862d = jSONObject;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.CanaryResultService", th6, "unexpected exception, skip reporting.", new java.lang.Object[0]);
        }
        qi.b a17 = ih.d.d().a(com.tencent.matrix.resource.x.class);
        if (a17 != null) {
            a17.d(d0Var);
        }
    }
}

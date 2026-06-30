package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class s implements com.p3263xee53b379.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302258a;

    public s(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302258a = activityC28074x3a8f05c8;
    }

    @Override // com.p3263xee53b379.f
    public final void a(java.lang.String str, com.p3263xee53b379.g gVar) {
        try {
            this.f302258a.f302206n = gVar;
            java.lang.String optString = new org.json.JSONObject(str).optString("scheme");
            if (android.text.TextUtils.isEmpty(optString)) {
                if (gVar != null) {
                    ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("1", "Parameter error", null));
                    return;
                }
                return;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(optString));
            try {
                com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8 = this.f302258a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC28074x3a8f05c8, arrayList.toArray(), "com/unionpay/o", "a", "(Ljava/lang/String;Lcom/unionpay/ae;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC28074x3a8f05c8.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC28074x3a8f05c8, "com/unionpay/o", "a", "(Ljava/lang/String;Lcom/unionpay/ae;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused) {
                if (gVar != null) {
                    ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("2", "Call application error", null));
                }
            }
        } catch (java.lang.Exception e17) {
            if (gVar != null) {
                ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("1", e17.getMessage(), null));
            }
        }
    }
}

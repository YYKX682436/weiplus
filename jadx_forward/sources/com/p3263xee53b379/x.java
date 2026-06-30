package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class x implements com.p3263xee53b379.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302265a;

    public x(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302265a = activityC28074x3a8f05c8;
    }

    @Override // com.p3263xee53b379.f
    public final void a(java.lang.String str, com.p3263xee53b379.g gVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.e(this.f302265a, jSONObject.getString(next), next);
            }
            if (gVar != null) {
                ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("0", ya.b.f77504xbb80cbe3, null));
            }
        } catch (java.lang.Exception e17) {
            if (gVar != null) {
                ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("1", e17.getMessage(), null));
            }
        }
    }
}

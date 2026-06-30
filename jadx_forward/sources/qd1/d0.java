package qd1;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f443152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.e0 f443155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443156h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443157i;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, qd1.e0 e0Var, int i18, java.lang.String str) {
        this.f443152d = v5Var;
        this.f443153e = e9Var;
        this.f443154f = i17;
        this.f443155g = e0Var;
        this.f443156h = i18;
        this.f443157i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        android.view.View view = this.f443152d.P1().f510108f;
        qd1.e0 e0Var = this.f443155g;
        int i17 = this.f443154f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443153e;
        if (view == null || view.getTag() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "toastView or tag is null, error");
            e0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject));
            return;
        }
        try {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            if (((java.lang.Integer) tag).intValue() != this.f443156h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "toastView is null, error");
                e0Var.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var.a(i17, e0Var.u(str2, jSONObject2));
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
            if (textView != null) {
                textView.setText(this.f443157i);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "textView is null, error");
            e0Var.getClass();
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str5 != null ? str5 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject3));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "toastView tag is " + view.getTag() + ", error");
            e0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject4));
        }
    }
}

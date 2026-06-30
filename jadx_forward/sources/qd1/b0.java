package qd1;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.c0 f443140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443142i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443143m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443144n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443145o;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, qd1.c0 c0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f443137d = e9Var;
        this.f443138e = i17;
        this.f443139f = i18;
        this.f443140g = c0Var;
        this.f443141h = str;
        this.f443142i = str2;
        this.f443143m = str3;
        this.f443144n = str4;
        this.f443145o = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443137d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 w07 = e9Var.t3().w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getNativeWidgetManager(...)");
        fl1.b2 b2Var = (fl1.b2) w07.f173281b.get(this.f443138e);
        qd1.c0 c0Var = this.f443140g;
        int i17 = this.f443139f;
        if (b2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateModal", "dialog is not exist, return");
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, c0Var.u(str2, jSONObject));
            return;
        }
        fl1.b bVar = b2Var instanceof fl1.b ? (fl1.b) b2Var : null;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateModal", "appbrandDialog is not AppBrandAlertDialog, return");
            c0Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str4 != null ? str4 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, c0Var.u(str2, jSONObject2));
            return;
        }
        boolean z17 = bVar.f293370r.getVisibility() == 0;
        java.lang.String str6 = this.f443141h;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6);
        java.lang.String str7 = this.f443142i;
        if (!K0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) || z17) {
                bVar.setTitle(str6);
            } else {
                bVar.t(str6);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) && !z17) {
            bVar.t(str7);
        }
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                java.lang.String str8 = this.f443143m;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    bVar.f293370r.setVisibility(0);
                    bVar.f293370r.setHint(str8);
                }
            } else {
                bVar.f293370r.setVisibility(0);
                bVar.f293370r.setText(str7);
            }
        }
        android.widget.Button button = bVar.f293362g;
        if (button != null) {
            button.setText(this.f443144n);
        }
        android.widget.Button button2 = bVar.f293363h;
        if (button2 != null) {
            button2.setText(this.f443145o);
        }
        c0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var.a(i17, c0Var.u(str2, jSONObject3));
    }
}

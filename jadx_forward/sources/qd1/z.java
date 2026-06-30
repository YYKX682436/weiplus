package qd1;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.a0 f443228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f443230i;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, qd1.a0 a0Var, java.lang.String str, java.util.ArrayList arrayList) {
        this.f443225d = e9Var;
        this.f443226e = i17;
        this.f443227f = i18;
        this.f443228g = a0Var;
        this.f443229h = str;
        this.f443230i = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443225d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 w07 = e9Var.t3().w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getNativeWidgetManager(...)");
        android.util.SparseArray sparseArray = w07.f173280a;
        int i17 = this.f443226e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) sparseArray.get(i17);
        qd1.a0 a0Var = this.f443228g;
        int i18 = this.f443227f;
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateActionSheet", "bottomSheet is null, id:" + i17 + " return");
            a0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i18, a0Var.u(str2, jSONObject));
            return;
        }
        java.lang.String str4 = this.f443229h;
        if (str4 != null) {
            if (str4.length() > 0) {
                qd1.h.C(e9Var.getF229340d(), k0Var, str4);
            }
        }
        k0Var.f293405n = new qd1.y(this.f443230i);
        k0Var.v();
        a0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i18, a0Var.u(str2, jSONObject2));
    }
}

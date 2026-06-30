package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class v0 extends com.tencent.mm.plugin.appbrand.jsapi.lbs.b {
    public static final int CTRL_INDEX = 902;
    public static final java.lang.String NAME = "openMapApp";

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f81490v = new com.tencent.mm.plugin.appbrand.jsapi.lbs.p0();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.HashMap f81491w = new com.tencent.mm.plugin.appbrand.jsapi.lbs.q0();

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.HashMap f81492x = new com.tencent.mm.plugin.appbrand.jsapi.lbs.r0();

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f81493y = new com.tencent.mm.plugin.appbrand.jsapi.lbs.s0();

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f81494h;

    /* renamed from: s, reason: collision with root package name */
    public z80.j0 f81502s;

    /* renamed from: i, reason: collision with root package name */
    public double f81495i = 0.0d;

    /* renamed from: m, reason: collision with root package name */
    public double f81496m = 0.0d;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f81497n = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f81498o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81499p = new com.tencent.mm.plugin.appbrand.jsapi.lbs.c1();

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f81500q = new com.tencent.mm.plugin.location.model.LocationInfo(false);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f81501r = new com.tencent.mm.plugin.location.model.LocationInfo(false);

    /* renamed from: t, reason: collision with root package name */
    public boolean f81503t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f81504u = false;

    public static void E(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str) {
        v0Var.getClass();
        e9Var.a(i17, str);
        v0Var.f81504u = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject optJSONObject;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f81500q;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenMapApp", "data is null");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "data:%s", jSONObject);
        if (!C(e9Var)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", -2);
            e9Var.a(i17, p("fail:system permission denied", hashMap));
            return;
        }
        try {
            this.f81495i = jSONObject.getDouble("latitude");
            this.f81496m = jSONObject.getDouble("longitude");
            java.lang.String string = jSONObject.getString(ya.b.DESTINATION);
            this.f81497n = jSONObject.optString("preferApplication");
            locationInfo.f144586e = this.f81495i;
            locationInfo.f144587f = this.f81496m;
            locationInfo.f144589h = string;
            locationInfo.f144588g = 15;
            java.util.HashMap hashMap2 = this.f81498o;
            hashMap2.clear();
            if (jSONObject.has("poiId") && (optJSONObject = jSONObject.optJSONObject("poiId")) != null) {
                int i18 = 0;
                while (true) {
                    java.util.ArrayList arrayList = f81490v;
                    if (i18 >= arrayList.size()) {
                        break;
                    }
                    java.lang.String optString = optJSONObject.optString((java.lang.String) arrayList.get(i18));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        hashMap2.put((java.lang.String) arrayList.get(i18), optString);
                    }
                    i18++;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenMapApp", e17, "", new java.lang.Object[0]);
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.d(), e9Var.getContext());
        if (o17.equals("language_default")) {
            com.tencent.mm.sdk.platformtools.m2.u(e9Var.getContext(), java.util.Locale.ENGLISH);
            o17 = "en";
        } else {
            com.tencent.mm.sdk.platformtools.m2.u(e9Var.getContext(), com.tencent.mm.sdk.platformtools.m2.s(o17));
        }
        locationInfo.f144590i = o17;
        this.f81501r.f144590i = o17;
        if (this.f81502s == null) {
            z80.i0 i0Var = (z80.i0) i95.n0.c(z80.i0.class);
            android.content.Context context = e9Var.getContext();
            ((y80.u0) i0Var).getClass();
            this.f81502s = new za3.d(context);
        }
        this.f81499p.a(e9Var.t3());
        android.os.Bundle bundle = new android.os.Bundle();
        lk1.c cVar = (lk1.c) e9Var.q(lk1.c.class);
        if (cVar != null) {
            cVar.Pg("gcj02", new com.tencent.mm.plugin.appbrand.jsapi.lbs.u0(this, e9Var, i17), bundle);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenMapApp", "locationManager is null");
            e9Var.a(i17, o("fail:internal error"));
        }
    }

    public final void F(com.tencent.mm.plugin.appbrand.e9 e9Var, android.widget.LinearLayout linearLayout, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.view.View.OnClickListener onClickListener, boolean z18) {
        android.view.View inflate = android.view.View.inflate(e9Var.Z0(), com.tencent.mm.R.layout.dyt, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jgr);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jhi);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jgj);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d1o);
        textView.setText(str2);
        if (com.tencent.mm.ui.bk.C()) {
            imageView.setImageDrawable(e9Var.Z0().getDrawable(com.tencent.mm.R.raw.appbrand_open_map_app_icon_dark));
        } else {
            imageView.setImageDrawable(e9Var.Z0().getDrawable(com.tencent.mm.R.raw.appbrand_open_map_app_icon_ligh));
        }
        java.lang.String str4 = (java.lang.String) f81493y.get(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            java.lang.String T0 = ((o91.e) e9Var.q(o91.e.class)).T0(e9Var, str4);
            o91.d dVar = (o91.d) e9Var.q(o91.d.class);
            if (dVar != null) {
                ((qd.b) dVar).c(T0, null, new com.tencent.mm.plugin.appbrand.jsapi.lbs.o0(this, T0, e9Var, imageView));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f81497n) && this.f81497n.equalsIgnoreCase(str3)) {
            str3.equalsIgnoreCase("tencent");
            if (!z18) {
                textView2.setVisibility(0);
                textView2.setText(e9Var.Z0().getString(com.tencent.mm.R.string.mjc));
            }
        } else if (str3.equalsIgnoreCase("tencent")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "hide MapAppRecommendText");
        }
        if (z17 || !z18) {
            imageView2.setVisibility(8);
        }
        inflate.setOnClickListener(onClickListener);
        linearLayout.addView(inflate);
    }

    public final void G(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, android.widget.LinearLayout linearLayout, boolean z17, int i17) {
        java.lang.String string = e9Var.Z0().getString(com.tencent.mm.R.string.juc);
        F(e9Var, linearLayout, "com.tencent.map", string, "tencent", this.f81494h.isEmpty(), new com.tencent.mm.plugin.appbrand.jsapi.lbs.m0(this, y1Var, e9Var, string, i17), z17);
    }

    public final boolean H() {
        boolean containsKey = this.f81494h.containsKey("com.tencent.map");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "install tencent map: %s.", java.lang.Boolean.valueOf(containsKey));
        return containsKey;
    }

    public final void I(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, android.widget.LinearLayout linearLayout, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = !com.tencent.mm.sdk.platformtools.a0.c();
        if (!z17 && H()) {
            z17 = true;
        }
        if (z17 && !this.f81494h.containsKey("com.tencent.map")) {
            G(e9Var, y1Var, linearLayout, true, i17);
            sb6.append(e9Var.Z0().getString(com.tencent.mm.R.string.juc));
        }
        int i18 = 0;
        for (java.util.Map.Entry entry : this.f81494h.entrySet()) {
            int i19 = i18 + 1;
            boolean z18 = i18 == this.f81494h.size() - 1;
            java.lang.String str = (java.lang.String) f81492x.get(entry.getKey());
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "entry: %s, %s, appName:%s", entry.getKey(), entry.getValue(), str);
            if (sb6.length() == 0) {
                sb6.append((java.lang.String) entry.getValue());
            } else {
                sb6.append("|");
                sb6.append((java.lang.String) entry.getValue());
            }
            F(e9Var, linearLayout, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), str, z18, new com.tencent.mm.plugin.appbrand.jsapi.lbs.n0(this, i18, str, entry, e9Var, i17, y1Var), true);
            i18 = i19;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 24, "", "", "", sb6, 4, java.lang.Integer.valueOf(H() ? 1 : 0), e9Var.getAppId());
    }
}

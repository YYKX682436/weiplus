package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b {

    /* renamed from: CTRL_INDEX */
    public static final int f34420x366c91de = 902;

    /* renamed from: NAME */
    public static final java.lang.String f34421x24728b = "openMapApp";

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f163023v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.p0();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.HashMap f163024w = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.q0();

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.HashMap f163025x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.r0();

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f163026y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.s0();

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f163027h;

    /* renamed from: s, reason: collision with root package name */
    public z80.j0 f163035s;

    /* renamed from: i, reason: collision with root package name */
    public double f163028i = 0.0d;

    /* renamed from: m, reason: collision with root package name */
    public double f163029m = 0.0d;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f163030n = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f163031o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 f163032p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1();

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f163033q = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23(false);

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f163034r = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23(false);

    /* renamed from: t, reason: collision with root package name */
    public boolean f163036t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163037u = false;

    public static void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, java.lang.String str) {
        v0Var.getClass();
        e9Var.a(i17, str);
        v0Var.f163037u = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f163033q;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenMapApp", "data is null");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "data:%s", jSONObject);
        if (!C(e9Var)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", -2);
            e9Var.a(i17, p("fail:system permission denied", hashMap));
            return;
        }
        try {
            this.f163028i = jSONObject.getDouble("latitude");
            this.f163029m = jSONObject.getDouble("longitude");
            java.lang.String string = jSONObject.getString(ya.b.f77475x2b19d7ee);
            this.f163030n = jSONObject.optString("preferApplication");
            c16279x64cea23.f226119e = this.f163028i;
            c16279x64cea23.f226120f = this.f163029m;
            c16279x64cea23.f226122h = string;
            c16279x64cea23.f226121g = 15;
            java.util.HashMap hashMap2 = this.f163031o;
            hashMap2.clear();
            if (jSONObject.has("poiId") && (optJSONObject = jSONObject.optJSONObject("poiId")) != null) {
                int i18 = 0;
                while (true) {
                    java.util.ArrayList arrayList = f163023v;
                    if (i18 >= arrayList.size()) {
                        break;
                    }
                    java.lang.String optString = optJSONObject.optString((java.lang.String) arrayList.get(i18));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        hashMap2.put((java.lang.String) arrayList.get(i18), optString);
                    }
                    i18++;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenMapApp", e17, "", new java.lang.Object[0]);
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d(), e9Var.mo50352x76847179());
        if (o17.equals("language_default")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(e9Var.mo50352x76847179(), java.util.Locale.ENGLISH);
            o17 = "en";
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(e9Var.mo50352x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(o17));
        }
        c16279x64cea23.f226123i = o17;
        this.f163034r.f226123i = o17;
        if (this.f163035s == null) {
            z80.i0 i0Var = (z80.i0) i95.n0.c(z80.i0.class);
            android.content.Context mo50352x76847179 = e9Var.mo50352x76847179();
            ((y80.u0) i0Var).getClass();
            this.f163035s = new za3.d(mo50352x76847179);
        }
        this.f163032p.a(e9Var.t3());
        android.os.Bundle bundle = new android.os.Bundle();
        lk1.c cVar = (lk1.c) e9Var.q(lk1.c.class);
        if (cVar != null) {
            cVar.Pg("gcj02", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u0(this, e9Var, i17), bundle);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenMapApp", "locationManager is null");
            e9Var.a(i17, o("fail:internal error"));
        }
    }

    public final void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, android.widget.LinearLayout linearLayout, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.view.View.OnClickListener onClickListener, boolean z18) {
        android.view.View inflate = android.view.View.inflate(e9Var.Z0(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dyt, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jgr);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jhi);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jgj);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1o);
        textView.setText(str2);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            imageView.setImageDrawable(e9Var.Z0().getDrawable(com.p314xaae8f345.mm.R.raw.f78520x2cb280df));
        } else {
            imageView.setImageDrawable(e9Var.Z0().getDrawable(com.p314xaae8f345.mm.R.raw.f78521x2cb64087));
        }
        java.lang.String str4 = (java.lang.String) f163026y.get(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            java.lang.String T0 = ((o91.e) e9Var.q(o91.e.class)).T0(e9Var, str4);
            o91.d dVar = (o91.d) e9Var.q(o91.d.class);
            if (dVar != null) {
                ((qd.b) dVar).c(T0, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.o0(this, T0, e9Var, imageView));
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f163030n) && this.f163030n.equalsIgnoreCase(str3)) {
            str3.equalsIgnoreCase("tencent");
            if (!z18) {
                textView2.setVisibility(0);
                textView2.setText(e9Var.Z0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjc));
            }
        } else if (str3.equalsIgnoreCase("tencent")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "hide MapAppRecommendText");
        }
        if (z17 || !z18) {
            imageView2.setVisibility(8);
        }
        inflate.setOnClickListener(onClickListener);
        linearLayout.addView(inflate);
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, android.widget.LinearLayout linearLayout, boolean z17, int i17) {
        java.lang.String string = e9Var.Z0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.juc);
        F(e9Var, linearLayout, "com.tencent.map", string, "tencent", this.f163027h.isEmpty(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.m0(this, y1Var, e9Var, string, i17), z17);
    }

    public final boolean H() {
        boolean containsKey = this.f163027h.containsKey("com.tencent.map");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "install tencent map: %s.", java.lang.Boolean.valueOf(containsKey));
        return containsKey;
    }

    public final void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, android.widget.LinearLayout linearLayout, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c();
        if (!z17 && H()) {
            z17 = true;
        }
        if (z17 && !this.f163027h.containsKey("com.tencent.map")) {
            G(e9Var, y1Var, linearLayout, true, i17);
            sb6.append(e9Var.Z0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.juc));
        }
        int i18 = 0;
        for (java.util.Map.Entry entry : this.f163027h.entrySet()) {
            int i19 = i18 + 1;
            boolean z18 = i18 == this.f163027h.size() - 1;
            java.lang.String str = (java.lang.String) f163025x.get(entry.getKey());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "entry: %s, %s, appName:%s", entry.getKey(), entry.getValue(), str);
            if (sb6.length() == 0) {
                sb6.append((java.lang.String) entry.getValue());
            } else {
                sb6.append("|");
                sb6.append((java.lang.String) entry.getValue());
            }
            F(e9Var, linearLayout, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), str, z18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.n0(this, i18, str, entry, e9Var, i17, y1Var), true);
            i18 = i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 24, "", "", "", sb6, 4, java.lang.Integer.valueOf(H() ? 1 : 0), e9Var.mo48798x74292566());
    }
}

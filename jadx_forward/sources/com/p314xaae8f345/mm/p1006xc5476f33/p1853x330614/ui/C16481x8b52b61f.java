package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView */
/* loaded from: classes9.dex */
public class C16481x8b52b61f extends android.widget.LinearLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int f229831v = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f229832d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f229833e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f229834f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f229835g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f229836h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f229837i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f229838m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f229839n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f229840o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f229841p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f229842q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f229843r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f229844s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d f229845t;

    /* renamed from: u, reason: collision with root package name */
    public r45.bm5 f229846u;

    public C16481x8b52b61f(android.content.Context context) {
        super(context);
        d(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f c16481x8b52b61f, java.lang.String str) {
        c16481x8b52b61f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletSectionCellView", "clear reddot: %s", str);
        org.json.JSONObject m66582xd6c026d0 = c16481x8b52b61f.m66582xd6c026d0();
        if (m66582xd6c026d0 == null) {
            return;
        }
        m66582xd6c026d0.remove(str);
        m66582xd6c026d0.remove(java.lang.String.format("%s_expiretime", str));
        m66582xd6c026d0.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, m66582xd6c026d0.toString());
    }

    /* renamed from: getRedDotConfig */
    private org.json.JSONObject m66582xd6c026d0() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallWalletSectionCellView", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public final void b() {
        this.f229840o.setVisibility(8);
        this.f229838m.setVisibility(8);
        this.f229839n.setVisibility(8);
        this.f229841p.setVisibility(8);
        r45.bm5 bm5Var = this.f229846u;
        if (bm5Var == null || bm5Var.f452405d != 4) {
            return;
        }
        this.f229835g.setText("");
    }

    public void c(r45.xj6 xj6Var, org.json.JSONObject jSONObject, boolean z17, java.lang.String str, boolean z18, l81.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y1 y1Var) {
        r45.rl6 rl6Var;
        java.util.LinkedList linkedList;
        r45.hl6 hl6Var;
        r45.cg0 cg0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.g(this.f229833e, xj6Var.f471699d, -1, 0, 0, true, 1.0f);
        r45.bz3 bz3Var = xj6Var.f471702g;
        if (bz3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bz3Var.f452705d)) {
            this.f229836h.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
            this.f229836h.setColorFilter(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb), android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.g(this.f229836h, xj6Var.f471702g, com.p314xaae8f345.mm.R.C30861xcebc809e.ch7, 0, 0, true, 1.0f);
        }
        java.util.LinkedList linkedList2 = xj6Var.f471700e;
        if (linkedList2 == null || linkedList2.size() <= 0) {
            this.f229834f.setText("");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(this.f229834f, (r45.rl6) linkedList2.get(0));
        }
        if (xj6Var.f471707o != null) {
            if (j65.e.b() && (rl6Var = xj6Var.f471707o.f471934e) != null && (linkedList = rl6Var.f466520d) != null && linkedList.size() > 0 && (cg0Var = (hl6Var = (r45.hl6) xj6Var.f471707o.f471934e.f466520d.get(0)).f457811n) != null) {
                cg0Var.f453071d = 4292966169L;
                hl6Var.f457804d = 4292966169L;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.i(this.f229844s, xj6Var.f471707o);
            this.f229844s.setVisibility(0);
        } else {
            this.f229844s.setVisibility(8);
        }
        java.util.LinkedList linkedList3 = xj6Var.f471701f;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f229835g.setText("");
                this.f229845t.b();
                this.f229835g.setVisibility(0);
            } else {
                this.f229845t.e("", !z18);
                this.f229845t.setVisibility(0);
                this.f229835g.setVisibility(8);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(this.f229835g, (r45.rl6) linkedList3.get(0));
            this.f229845t.b();
            this.f229835g.setVisibility(0);
        } else {
            this.f229845t.e(str, !z18);
            this.f229845t.setVisibility(0);
            this.f229835g.setVisibility(8);
        }
        if (linkedList3 == null || linkedList3.size() <= 1) {
            this.f229837i.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(this.f229837i, (r45.rl6) linkedList3.get(1));
        }
        b();
        r45.bm5 bm5Var = xj6Var.f471703h;
        if (bm5Var != null && jSONObject != null) {
            this.f229846u = bm5Var;
            boolean z19 = jSONObject.optInt(bm5Var.f452406e, 0) == 1;
            long optLong = jSONObject.optLong(java.lang.String.format("%s_expiretime", xj6Var.f471703h.f452406e), 0L);
            boolean z27 = (optLong <= 0 || java.lang.System.currentTimeMillis() <= optLong) ? z19 : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletSectionCellView", "red dot expired: %s, %s, %s, %s, %s", xj6Var.f471703h.f452406e, java.lang.Long.valueOf(optLong), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Integer.valueOf(xj6Var.f471703h.f452405d));
            if (z19 && !z27) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22735, xj6Var.f471703h.f452406e, 2, "");
            }
            if (z27) {
                int i17 = xj6Var.f471703h.f452405d;
                if (i17 == 1) {
                    this.f229838m.setVisibility(0);
                } else if (i17 == 2) {
                    this.f229840o.setVisibility(0);
                } else if (i17 == 3) {
                    this.f229841p.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.e(getContext(), xj6Var.f471703h.f452407f, null).toString());
                    this.f229841p.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571338c7, this.f229841p.getText()));
                    this.f229841p.setVisibility(0);
                } else if (i17 == 4) {
                    this.f229839n.setVisibility(0);
                    this.f229835g.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(this.f229835g, xj6Var.f471703h.f452407f);
                    this.f229845t.b();
                } else {
                    z27 = false;
                }
                if (z27) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22735, xj6Var.f471703h.f452406e, 1, "");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22735, xj6Var.f471703h.f452406e, 0, "Red Dot Type returned by server is invalid.");
                }
            }
        }
        r45.t35 t35Var = xj6Var.f471705m;
        if (t35Var != null) {
            float f17 = t35Var.f467629f;
            int i18 = f229831v;
            int b17 = f17 > 0.0f ? i65.a.b(getContext(), (int) f17) : i18;
            float f18 = t35Var.f467630g;
            int b18 = f18 > 0.0f ? i65.a.b(getContext(), (int) f18) : i18;
            float f19 = t35Var.f467627d;
            int b19 = f19 > 0.0f ? i65.a.b(getContext(), (int) f19) : i18;
            float f27 = t35Var.f467628e;
            if (f27 > 0.0f) {
                i18 = i65.a.b(getContext(), (int) f27);
            }
            this.f229843r.setPadding(b17, b19, b18, i18);
        }
        if (z17) {
            this.f229834f.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o2(this));
        } else {
            android.view.View view = this.f229842q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (xj6Var.f471706n != null) {
            setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.p2(this, xj6Var, e1Var, y1Var));
        }
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bwu, (android.view.ViewGroup) this, true);
        this.f229832d = inflate;
        this.f229833e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.k2i);
        this.f229834f = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2s);
        this.f229835g = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2f);
        this.f229836h = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2q);
        this.f229837i = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2r);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2m);
        this.f229838m = imageView;
        imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571337c6));
        this.f229839n = (android.widget.ImageView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2p);
        android.widget.TextView textView = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2k);
        this.f229840o = textView;
        textView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571337c6));
        this.f229841p = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2l);
        this.f229842q = this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2g);
        this.f229843r = (android.view.ViewGroup) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2j);
        this.f229844s = (android.widget.TextView) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2h);
        this.f229845t = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.k2e);
        this.f229845t.m73933xaf1ebe0c((android.widget.ProgressBar) this.f229832d.findViewById(com.p314xaae8f345.mm.R.id.pcr));
        setOrientation(1);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj7);
    }

    public C16481x8b52b61f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public C16481x8b52b61f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        d(context);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f220611e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f220612f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f220613g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f220614h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f220615i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f220616m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f220617n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f220618o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f220619p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d f220620q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs f220621r;

    /* renamed from: s, reason: collision with root package name */
    public int f220622s;

    /* renamed from: t, reason: collision with root package name */
    public long f220623t;

    /* renamed from: u, reason: collision with root package name */
    public long f220624u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f220625v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f220626w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f220627x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.Map f220628y;

    public e1(android.view.View view) {
        super(view);
        this.f220625v = false;
        this.f220626w = false;
        this.f220627x = new java.util.LinkedList();
        this.f220611e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565151bg3);
        this.f220612f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565153bg5);
        this.f220616m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bfu);
        this.f220613g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565148bg0);
        this.f220614h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bg6);
        this.f220615i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bg7);
        this.f220617n = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m1n);
        this.f220618o = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m1o);
        this.f220619p = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.nwj);
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x0(this, view));
    }

    public static void j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d = e1Var.f220620q;
        java.lang.String str = c15720x34e10e9d == null ? "" : c15720x34e10e9d.f36482x58b82fc;
        java.lang.String str2 = c15720x34e10e9d != null ? c15720x34e10e9d.f36490x3923b317 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d2 = e1Var.f220620q;
        if (c15720x34e10e9d2 != null) {
            try {
                jSONObject.put("reportStr", c15720x34e10e9d2.f36497x732388a6);
            } catch (java.lang.Exception unused) {
            }
        }
        if (!e1Var.f220626w) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.k(1002L, e1Var.f220622s, 2L, e1Var.f220625v ? 4L : i17, e1Var.f220623t, e1Var.f220624u, str, str2, jSONObject.toString());
            return;
        }
        long j17 = e1Var.f220622s;
        long j18 = e1Var.f220625v ? 4L : i17;
        long j19 = e1Var.f220623t;
        long j27 = e1Var.f220624u;
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e c6632x56e7d94e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e();
        c6632x56e7d94e.f139854d = 11L;
        c6632x56e7d94e.f139855e = 1102L;
        c6632x56e7d94e.f139856f = j17;
        c6632x56e7d94e.f139857g = 2L;
        c6632x56e7d94e.f139858h = j18;
        c6632x56e7d94e.f139859i = j19;
        c6632x56e7d94e.f139860j = j27;
        c6632x56e7d94e.f139869s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149731d, 0L);
        c6632x56e7d94e.f139871u = c6632x56e7d94e.b("session_id", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id"), true);
        c6632x56e7d94e.f139872v = java.lang.System.currentTimeMillis();
        c6632x56e7d94e.q(str);
        c6632x56e7d94e.p(str2);
        c6632x56e7d94e.f139868r = c6632x56e7d94e.b("ExternInfo", jSONObject2 != null ? java.net.URLEncoder.encode(jSONObject2) : null, true);
        c6632x56e7d94e.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0
    public void i(w33.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
        if (aVar.f524233b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) {
            this.f220626w = aVar.f524234c;
            if (list != null) {
                ((java.util.LinkedList) this.f220627x).addAll(list);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) aVar.f524233b;
            this.f220621r = lbs;
            this.f220622s = i17;
            this.f220623t = j17;
            this.f220624u = j18;
            this.f3639x46306858.setTag(c15741x8495618b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d = c15741x8495618b.f36604x391f2836;
            if (c15720x34e10e9d != null) {
                this.f220620q = c15720x34e10e9d;
                this.f220611e.setText(c15720x34e10e9d.f36499xc05e036f);
                r53.y.a().e(this.f220613g, c15741x8495618b.f36604x391f2836.f36488x39217505, null, null);
                boolean z17 = c15741x8495618b.f36604x391f2836.f36494x46ae0f6e;
                android.widget.ImageView imageView = this.f220612f;
                android.content.Context context = this.f220830d;
                android.widget.TextView textView = this.f220616m;
                if (z17) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fky);
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
                    imageView.setVisibility(0);
                    textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y0(this, c15741x8495618b, lbs));
                } else {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573731fl0);
                    imageView.setVisibility(8);
                    textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z0(this, c15741x8495618b, lbs));
                }
                if (c15741x8495618b.f36604x391f2836.f36486xf8727839) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
                } else {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                    textView.setClickable(false);
                    this.f220625v = true;
                }
                java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8> linkedList = c15741x8495618b.f36604x391f2836.f36500x834ad001;
                boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList);
                android.widget.LinearLayout linearLayout = this.f220618o;
                android.view.ViewGroup viewGroup = this.f220617n;
                if (L0) {
                    viewGroup.setVisibility(8);
                    linearLayout.setVisibility(8);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 c15809xc54f5bf8 : linkedList) {
                        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccw, viewGroup, false);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566977hp2);
                        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566975hp0);
                        textView2.setText(c15809xc54f5bf8.f36848x83471df4);
                        java.lang.Integer l17 = c15809xc54f5bf8.f36847x5a72f63 != null ? s33.y.l(com.p314xaae8f345.mm.ui.bk.C() ? c15809xc54f5bf8.f36847x5a72f63.f36646xa0e2915a : c15809xc54f5bf8.f36847x5a72f63.f36649x7db41efa) : null;
                        if (l17 == null) {
                            l17 = c15809xc54f5bf8.f36846xf874ff20 ? java.lang.Integer.valueOf(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560084al)) : java.lang.Integer.valueOf(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                        }
                        textView2.setTextColor(l17.intValue());
                        float q17 = i65.a.q(context);
                        imageView2.getLayoutParams().height = (int) (imageView2.getLayoutParams().height * q17);
                        imageView2.getLayoutParams().width = (int) (imageView2.getLayoutParams().width * q17);
                        imageView2.requestLayout();
                        imageView2.setVisibility(0);
                        if (c15809xc54f5bf8.f36849x8e88707b != null) {
                            boolean C = com.p314xaae8f345.mm.ui.bk.C();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa32936 = c15809xc54f5bf8.f36849x8e88707b;
                            java.lang.String str = C ? c15817xefa32936.f36859x91963fa2 : c15817xefa32936.f36860xf38c7e02;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                imageView2.setVisibility(8);
                            } else {
                                imageView2.setVisibility(0);
                                r53.y.a().e(imageView2, str, null, null);
                            }
                        } else if (c15809xc54f5bf8.f36846xf874ff20) {
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78774x6c82edde);
                            } else {
                                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78775x244f03ae);
                            }
                        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
                            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78776x5c799090);
                        } else {
                            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78777x332cb73c);
                        }
                        inflate.measure(0, 0);
                        arrayList.add(inflate);
                    }
                    viewGroup.setVisibility(0);
                    linearLayout.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d1) this.f220628y.get(c15741x8495618b);
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                    if (d1Var != null) {
                        int i18 = d1Var.f220599a;
                        if (i18 != 0) {
                            layoutParams.height = i18;
                        } else {
                            layoutParams.height = 0;
                        }
                        int i19 = d1Var.f220600b;
                        if (i19 != 0) {
                            layoutParams2.height = i19;
                        } else {
                            layoutParams2.height = 0;
                        }
                    } else {
                        layoutParams.height = -2;
                        layoutParams2.height = -2;
                    }
                    viewGroup.setLayoutParams(layoutParams);
                    linearLayout.setLayoutParams(layoutParams2);
                    viewGroup.removeAllViews();
                    linearLayout.removeAllViews();
                    viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b1(this, c15741x8495618b, arrayList));
                }
                java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647> linkedList2 = c15741x8495618b.f36604x391f2836.f36492x303e6caf;
                boolean L02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2);
                android.widget.LinearLayout linearLayout2 = this.f220619p;
                if (L02) {
                    linearLayout2.setVisibility(8);
                } else {
                    linearLayout2.setVisibility(0);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 c15743xc7e67647 : linkedList2) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccx, (android.view.ViewGroup) linearLayout2, false);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f566979hp4);
                        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f566978hp3);
                        textView3.setText(c15743xc7e67647.f36613x2efe91);
                        java.lang.Integer l18 = c15743xc7e67647.f36612x5a72f63 != null ? s33.y.l(com.p314xaae8f345.mm.ui.bk.C() ? c15743xc7e67647.f36612x5a72f63.f36646xa0e2915a : c15743xc7e67647.f36612x5a72f63.f36649x7db41efa) : null;
                        if (l18 == null) {
                            l18 = java.lang.Integer.valueOf(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                        }
                        textView3.setTextColor(l18.intValue());
                        float q18 = i65.a.q(context);
                        imageView3.getLayoutParams().height = (int) (imageView3.getLayoutParams().height * q18);
                        imageView3.getLayoutParams().width = (int) (imageView3.getLayoutParams().width * q18);
                        imageView3.requestLayout();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15743xc7e67647.f36614x313c79)) {
                            imageView3.setVisibility(8);
                        } else {
                            imageView3.setVisibility(0);
                            r53.y.a().e(imageView3, c15743xc7e67647.f36614x313c79, null, null);
                        }
                        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) inflate2.getBackground();
                        if (gradientDrawable != null) {
                            java.lang.Integer l19 = c15743xc7e67647.f36610x7966cd12 != null ? s33.y.l(com.p314xaae8f345.mm.ui.bk.C() ? c15743xc7e67647.f36610x7966cd12.f36646xa0e2915a : c15743xc7e67647.f36610x7966cd12.f36649x7db41efa) : null;
                            if (l19 == null) {
                                l19 = java.lang.Integer.valueOf(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
                            }
                            gradientDrawable.setColor(l19.intValue());
                        }
                        inflate2.measure(0, 0);
                        if (c15743xc7e67647.f36616xb5c517ba != null) {
                            inflate2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a1(this, c15743xc7e67647));
                        }
                        arrayList2.add(inflate2);
                    }
                    linearLayout2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.c1(this, arrayList2));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc5371434 = c15741x8495618b.f36603x863903dd;
            if (c15746xc5371434 != null) {
                int i27 = c15746xc5371434.f36642x40ef08cf;
                this.f220615i.setText(c15746xc5371434.f36643x2efe91);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15741x8495618b.f36603x863903dd.f36641xac32c30b);
                android.widget.ImageView imageView4 = this.f220614h;
                if (K0) {
                    imageView4.setVisibility(8);
                } else {
                    r53.y.a().e(imageView4, c15741x8495618b.f36603x863903dd.f36641xac32c30b, null, null);
                    imageView4.setVisibility(0);
                }
            }
        }
    }
}

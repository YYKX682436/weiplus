package qd4;

/* loaded from: classes15.dex */
public class r extends ql5.d {

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f443423k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f443424l;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f443425m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f443426n;

    /* renamed from: o, reason: collision with root package name */
    public int f443427o;

    /* renamed from: d, reason: collision with root package name */
    public int f443416d = 4;

    /* renamed from: e, reason: collision with root package name */
    public int f443417e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f443418f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f443419g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f443420h = 3;

    /* renamed from: i, reason: collision with root package name */
    public int[] f443421i = {com.p314xaae8f345.mm.R.C30867xcad56011.jbq, com.p314xaae8f345.mm.R.C30867xcad56011.jbo, com.p314xaae8f345.mm.R.C30867xcad56011.jbj, com.p314xaae8f345.mm.R.C30867xcad56011.jba};

    /* renamed from: j, reason: collision with root package name */
    public int[] f443422j = {com.p314xaae8f345.mm.R.C30867xcad56011.jbr, com.p314xaae8f345.mm.R.C30867xcad56011.jbp, com.p314xaae8f345.mm.R.C30867xcad56011.jbk, com.p314xaae8f345.mm.R.C30867xcad56011.jbb};

    /* renamed from: p, reason: collision with root package name */
    public int f443428p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f443429q = false;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f443430r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f443431s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f443432t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f443433u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public qd4.p f443434v = null;

    public r(android.content.Context context) {
        this.f443425m = context;
        this.f443426n = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        qd4.o oVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (view == null) {
            int i19 = this.f443427o;
            android.view.LayoutInflater layoutInflater = this.f443426n;
            view2 = i19 == 1 ? layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs9, (android.view.ViewGroup) null);
            oVar = new qd4.o(this, null);
            oVar.f443408a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9q);
            oVar.f443409b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9p);
            oVar.f443410c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9o);
            oVar.f443411d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9n);
            oVar.f443412e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9m);
            oVar.f443413f = imageView;
            imageView.setOnClickListener(new qd4.n(this));
            view2.setTag(oVar);
        } else {
            oVar = (qd4.o) view.getTag();
            view2 = view;
        }
        android.widget.ImageView imageView2 = oVar.f443413f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.lang.Object tag = imageView2.getTag();
        if (tag == null || !(tag instanceof qd4.q)) {
            qd4.q qVar = new qd4.q(this);
            qVar.f443414a = i17;
            qVar.f443415b = i18;
            imageView2.setTag(qVar);
        } else {
            qd4.q qVar2 = (qd4.q) imageView2.getTag();
            qVar2.f443414a = i17;
            qVar2.f443415b = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        int size = this.f443424l.size();
        java.lang.CharSequence charSequence = "";
        android.content.Context context = this.f443425m;
        if (i18 == size) {
            oVar.f443408a.setVisibility(8);
            oVar.f443409b.setVisibility(8);
            oVar.f443412e.setVisibility(8);
            oVar.f443413f.setVisibility(8);
            oVar.f443410c.setVisibility(0);
            oVar.f443411d.setVisibility(0);
            if (i17 == this.f443420h) {
                if (this.f443433u.size() > 0) {
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f443433u), ",");
                    oVar.f443411d.setText("√" + c17);
                    oVar.f443411d.setVisibility(0);
                    oVar.f443411d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
                } else {
                    oVar.f443411d.setText("");
                    oVar.f443411d.setVisibility(8);
                }
            } else if (i17 == this.f443419g) {
                if (this.f443432t.size() > 0) {
                    java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f443432t), ",");
                    oVar.f443411d.setText("√" + c18);
                    oVar.f443411d.setVisibility(0);
                    oVar.f443411d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6d));
                } else {
                    oVar.f443411d.setText("");
                    oVar.f443411d.setVisibility(8);
                }
            }
        } else {
            oVar.f443408a.setVisibility(0);
            oVar.f443409b.setVisibility(0);
            oVar.f443412e.setVisibility(0);
            oVar.f443413f.setVisibility(4);
            oVar.f443410c.setVisibility(8);
            oVar.f443411d.setVisibility(8);
            java.lang.String str = (java.lang.String) this.f443424l.get(i18);
            android.widget.TextView textView = oVar.f443408a;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            android.widget.TextView textView2 = oVar.f443409b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str));
            if (j17 == null || j17.size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(j17.size());
                for (java.lang.String str2 : j17) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    ((sg3.a) v0Var).getClass();
                    arrayList.add(c01.a2.e(str2));
                }
                java.lang.String c19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, c19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            }
            textView2.setText(charSequence);
            oVar.f443413f.setImageResource(com.p314xaae8f345.mm.R.raw.f81106x4448d04);
            if (this.f443427o == 1) {
                if (i17 == this.f443419g) {
                    if (f(1, str)) {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81056x99940718);
                    } else {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81058x89594171);
                    }
                } else if (i17 == this.f443420h) {
                    if (this.f443428p != i17) {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                    } else {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                    }
                    if (f(2, str)) {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                    } else {
                        oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                    }
                }
            } else if (i17 == this.f443419g) {
                if (f(1, str)) {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                } else {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                }
            } else if (i17 == this.f443420h) {
                if (f(2, str)) {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f78848x228ad7e9);
                } else {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return view2;
    }

    @Override // ql5.d
    public int c(int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if ((!"visible".equals(this.f443423k.get(i17)) && !"invisible".equals(this.f443423k.get(i17))) || (arrayList = this.f443424l) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return 0;
        }
        int size = arrayList.size() + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return size;
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (e() != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(e());
            if (!g(arrayList, str)) {
                if (arrayList.size() == 5) {
                    arrayList.remove(4);
                    arrayList.add(0, str);
                } else {
                    arrayList.add(0, str);
                }
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
                gm0.j1.i();
                gm0.j1.u().c().w(335875, c17);
            }
        } else {
            gm0.j1.i();
            gm0.j1.u().c().w(335875, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    public final java.util.List e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return P1;
    }

    public final boolean f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (i17 == 1) {
            boolean g17 = g(this.f443430r, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return g17;
        }
        boolean g18 = g(this.f443431s, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return g18;
    }

    public final boolean g(java.util.List list, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.lang.Object obj = this.f443424l.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        int i17 = this.f443416d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return i17;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        qd4.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof qd4.o)) {
            int i18 = this.f443427o;
            android.view.LayoutInflater layoutInflater = this.f443426n;
            inflate = i18 == 1 ? layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csc, (android.view.ViewGroup) null) : layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csb, (android.view.ViewGroup) null);
            oVar = new qd4.o(this, null);
            oVar.f443408a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9q);
            oVar.f443412e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9h);
            oVar.f443409b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9p);
            inflate.setTag(oVar);
        } else {
            oVar = (qd4.o) view.getTag();
            inflate = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        oVar.f443408a.setText(this.f443421i[i17]);
        oVar.f443409b.setText(this.f443422j[i17]);
        int i19 = this.f443418f;
        android.content.Context context = this.f443425m;
        if (i17 == i19 || i17 == this.f443417e) {
            if (this.f443428p != i17) {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            } else {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
                oVar.f443412e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
            }
        } else if (i17 == this.f443419g) {
            if (this.f443428p != i17) {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            } else {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
                oVar.f443412e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
            }
        } else if (i17 == this.f443420h) {
            if (this.f443427o == 1) {
                if (this.f443428p != i17) {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
                } else {
                    oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80978xde058675);
                    oVar.f443412e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
                }
            } else if (this.f443428p != i17) {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            } else {
                oVar.f443412e.setImageResource(com.p314xaae8f345.mm.R.raw.f80941x843c76f5);
                oVar.f443412e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (!this.f443429q || i17 != this.f443418f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return inflate;
        }
        android.view.View view2 = new android.view.View(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return view2;
    }

    public void h(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.List e17 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (e17 == null || arrayList == null) {
            this.f443424l = arrayList;
        } else {
            java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (g(arrayList, str)) {
                    arrayList.remove(str);
                    arrayList2.add(str);
                }
            }
            arrayList.addAll(0, arrayList2);
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ",");
            gm0.j1.i();
            gm0.j1.u().c().w(335875, c17);
            this.f443424l = arrayList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    public final java.util.List i(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        }
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return linkedList;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return true;
    }
}

package ae4;

/* loaded from: classes15.dex */
public class a extends ql5.d {

    /* renamed from: t, reason: collision with root package name */
    public static int f85884t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static int f85885u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static int f85886v = 1 + 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f85887w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f85888x;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f85889d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f85890e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f85891f;

    /* renamed from: g, reason: collision with root package name */
    public int f85892g;

    /* renamed from: h, reason: collision with root package name */
    public int f85893h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f85894i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f85895j = false;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f85896k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f85897l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f85898m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f85899n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f85900o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f85901p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f85902q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f85903r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public ae4.c f85904s = null;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jbm);
        new java.util.ArrayList();
        f85887w = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.jbq, com.p314xaae8f345.mm.R.C30867xcad56011.jbo, com.p314xaae8f345.mm.R.C30867xcad56011.jbj, com.p314xaae8f345.mm.R.C30867xcad56011.jba};
        f85888x = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.jbr, com.p314xaae8f345.mm.R.C30867xcad56011.jbp, com.p314xaae8f345.mm.R.C30867xcad56011.jbk, com.p314xaae8f345.mm.R.C30867xcad56011.jbb};
    }

    public a(android.content.Context context) {
        this.f85890e = context;
        this.f85891f = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f85884t = 0;
            f85885u = 1;
        } else {
            f85884t = -1;
            f85885u = 0;
        }
        f85886v = f85885u + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s", java.lang.Integer.valueOf(f85884t), java.lang.Integer.valueOf(f85885u), java.lang.Integer.valueOf(f85886v));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        ae4.b bVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (view == null) {
            int i19 = this.f85892g;
            android.view.LayoutInflater layoutInflater = this.f85891f;
            view2 = i19 == 1 ? layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs9, (android.view.ViewGroup) null);
            bVar = new ae4.b(this);
            bVar.f85906a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9q);
            bVar.f85907b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9p);
            bVar.f85908c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9o);
            bVar.f85909d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9n);
            bVar.f85910e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9m);
            bVar.f85911f = imageView;
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: ae4.a$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.Object child;
                    ae4.a aVar = ae4.a.this;
                    aVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view3);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    ae4.d dVar = (view3.getTag() == null || !(view3.getTag() instanceof ae4.d)) ? null : (ae4.d) view3.getTag();
                    if (dVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
                        yj0.a.h(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                        return;
                    }
                    ae4.c cVar = aVar.f85904s;
                    if (cVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
                        int i27 = dVar.f85912a;
                        int i28 = dVar.f85913b;
                        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.C;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nk) cVar).f251549a;
                        activityC18072xf2d2bc10.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        ae4.a aVar2 = activityC18072xf2d2bc10.f248758m;
                        if (aVar2 == null || (child = aVar2.getChild(i27, i28)) == null || !(child instanceof java.lang.String)) {
                            str = "lambda$getRealChildView$0";
                            str2 = "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter";
                        } else {
                            java.lang.String str3 = (java.lang.String) child;
                            java.lang.String e17 = ((b93.b) c93.a.a()).e(str3);
                            android.content.Intent intent = new android.content.Intent();
                            str = "lambda$getRealChildView$0";
                            intent.putExtra("label_id", e17);
                            intent.putExtra("label_name", str3);
                            intent.putExtra("is_show_delete", false);
                            intent.putExtra("key_label_click_source", 3);
                            intent.putExtra("last_page_source_type", 1);
                            str2 = "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter";
                            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                                j45.l.n(activityC18072xf2d2bc10.mo55332x76847179(), "label", ".ui.ContactEditLabel", intent, 4002);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                                j45.l.n(activityC18072xf2d2bc10.mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
                    } else {
                        str = "lambda$getRealChildView$0";
                        str2 = "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter";
                    }
                    yj0.a.h(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                }
            });
            view2.setTag(bVar);
        } else {
            bVar = (ae4.b) view.getTag();
            view2 = view;
        }
        int i27 = f85885u;
        java.lang.CharSequence charSequence = "";
        android.content.Context context = this.f85890e;
        if (i18 == i27) {
            bVar.f85906a.setVisibility(8);
            bVar.f85907b.setVisibility(8);
            bVar.f85910e.setVisibility(8);
            bVar.f85911f.setVisibility(8);
            bVar.f85908c.setVisibility(0);
            bVar.f85909d.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f85908c.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbs));
            if (i17 == 3) {
                if (this.f85899n.size() > 0) {
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f85899n), ",");
                    android.widget.TextView textView = bVar.f85909d;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    float textSize = bVar.f85909d.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, "√" + c17, textSize));
                    bVar.f85909d.setVisibility(0);
                    bVar.f85909d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
                } else {
                    bVar.f85909d.setText("");
                    bVar.f85909d.setVisibility(8);
                }
            } else if (i17 == 2) {
                if (this.f85898m.size() > 0) {
                    java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f85898m), ",");
                    android.widget.TextView textView2 = bVar.f85909d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize2 = bVar.f85909d.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, "√" + c18, textSize2));
                    bVar.f85909d.setVisibility(0);
                    bVar.f85909d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6d));
                } else {
                    bVar.f85909d.setText("");
                    bVar.f85909d.setVisibility(8);
                }
            }
        } else if (i18 == f85884t) {
            bVar.f85906a.setVisibility(8);
            bVar.f85910e.setVisibility(8);
            bVar.f85911f.setVisibility(8);
            bVar.f85908c.setVisibility(0);
            bVar.f85907b.setVisibility(8);
            bVar.f85909d.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f85908c.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbw));
            if (i17 == 3) {
                if (this.f85901p.size() > 0) {
                    java.lang.String c19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f85901p), ",");
                    bVar.f85909d.setText("√" + c19);
                    bVar.f85909d.setVisibility(0);
                    bVar.f85909d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
                } else {
                    bVar.f85909d.setText("");
                    bVar.f85909d.setVisibility(8);
                }
            } else if (i17 == 2) {
                if (this.f85900o.size() > 0) {
                    java.lang.String c110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(this.f85900o), ",");
                    bVar.f85909d.setText("√" + c110);
                    bVar.f85909d.setVisibility(0);
                    bVar.f85909d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6d));
                } else {
                    bVar.f85909d.setText("");
                    bVar.f85909d.setVisibility(8);
                }
            }
        } else {
            int i28 = i18 - f85886v;
            android.widget.ImageView imageView2 = bVar.f85911f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            java.lang.Object tag = imageView2.getTag();
            if (tag == null || !(tag instanceof ae4.d)) {
                ae4.d dVar = new ae4.d(this);
                dVar.f85912a = i17;
                dVar.f85913b = i28;
                imageView2.setTag(dVar);
            } else {
                ae4.d dVar2 = (ae4.d) imageView2.getTag();
                dVar2.f85912a = i17;
                dVar2.f85913b = i28;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f85906a.setVisibility(0);
            bVar.f85907b.setVisibility(0);
            bVar.f85910e.setVisibility(0);
            bVar.f85911f.setVisibility(0);
            bVar.f85908c.setVisibility(8);
            bVar.f85909d.setVisibility(8);
            java.lang.String str = (java.lang.String) this.f85889d.get(i28);
            android.widget.TextView textView3 = bVar.f85906a;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            android.widget.TextView textView4 = bVar.f85907b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str));
            if (j17 == null || j17.size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(j17.size());
                for (java.lang.String str2 : j17) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    ((sg3.a) v0Var).getClass();
                    arrayList.add(c01.a2.e(str2));
                }
                java.lang.String c111 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, c111);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            }
            textView4.setText(charSequence);
            bVar.f85911f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81106x4448d04, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
            if (this.f85892g == 1) {
                if (i17 == 2) {
                    if (f(1, str)) {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81056x99940718);
                    } else {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81058x89594171);
                    }
                } else if (i17 == 3) {
                    if (this.f85893h != i17) {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                    } else {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                    }
                    if (f(2, str)) {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                    } else {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                    }
                }
            } else if (i17 == 2) {
                if (f(1, str)) {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                } else {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                }
            } else if (i17 == 3) {
                if (f(2, str)) {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f78848x228ad7e9);
                } else {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return view2;
    }

    @Override // ql5.d
    public int c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i17 <= 1 || this.f85889d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        int size = this.f85889d.size() + f85886v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return size;
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    public final java.util.List e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return P1;
    }

    public final boolean f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i17 == 1) {
            boolean g17 = g(this.f85896k, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return g17;
        }
        boolean g18 = g(this.f85897l, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return g18;
    }

    public final boolean g(java.util.List list, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.lang.Object obj = this.f85889d.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 4;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        ae4.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof ae4.b)) {
            int i18 = this.f85892g;
            android.view.LayoutInflater layoutInflater = this.f85891f;
            inflate = i18 == 1 ? layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csc, (android.view.ViewGroup) null) : layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csb, (android.view.ViewGroup) null);
            bVar = new ae4.b(this);
            bVar.f85906a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9q);
            bVar.f85910e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9h);
            bVar.f85907b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9p);
            inflate.setTag(bVar);
        } else {
            bVar = (ae4.b) view.getTag();
            inflate = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        bVar.f85906a.setText(f85887w[i17]);
        bVar.f85907b.setText(f85888x[i17]);
        bVar.f85907b.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "dealWithGroupView: groupPosition:%d, mGroupSelect:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f85893h));
        android.content.Context context = this.f85890e;
        if (i17 == 0 || i17 == 1) {
            if (this.f85893h != i17) {
                bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            } else {
                bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
                bVar.f85910e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
            }
        } else if (i17 != 2) {
            if (i17 == 3) {
                if (this.f85892g == 1) {
                    if (this.f85893h != i17) {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
                    } else {
                        bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80978xde058675);
                        bVar.f85910e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
                    }
                } else if (this.f85893h != i17) {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
                } else {
                    bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80941x843c76f5);
                    bVar.f85910e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
                }
            }
        } else if (this.f85893h != i17) {
            bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        } else {
            bVar.f85910e.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
            bVar.f85910e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (this.f85895j && i17 == 1) {
            android.view.View view2 = new android.view.View(context);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return view2;
        }
        if (!this.f85894i || (i17 != 1 && i17 != 2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return inflate;
        }
        android.view.View view3 = new android.view.View(context);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return view3;
    }

    public void h(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.List e17 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (e17 == null || arrayList == null) {
            this.f85889d = arrayList;
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
            this.f85889d = arrayList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    public final java.util.List i(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        }
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return linkedList;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return true;
    }
}

package ae4;

/* loaded from: classes15.dex */
public class a extends ql5.d {

    /* renamed from: t, reason: collision with root package name */
    public static int f4351t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static int f4352u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static int f4353v = 1 + 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f4354w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f4355x;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f4356d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f4357e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f4358f;

    /* renamed from: g, reason: collision with root package name */
    public int f4359g;

    /* renamed from: h, reason: collision with root package name */
    public int f4360h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4361i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4362j = false;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f4363k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f4364l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f4365m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f4366n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f4367o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f4368p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f4369q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f4370r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public ae4.c f4371s = null;

    static {
        com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jbm);
        new java.util.ArrayList();
        f4354w = new int[]{com.tencent.mm.R.string.jbq, com.tencent.mm.R.string.jbo, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jba};
        f4355x = new int[]{com.tencent.mm.R.string.jbr, com.tencent.mm.R.string.jbp, com.tencent.mm.R.string.jbk, com.tencent.mm.R.string.jbb};
    }

    public a(android.content.Context context) {
        this.f4357e = context;
        this.f4358f = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f4351t = 0;
            f4352u = 1;
        } else {
            f4351t = -1;
            f4352u = 0;
        }
        f4353v = f4352u + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s", java.lang.Integer.valueOf(f4351t), java.lang.Integer.valueOf(f4352u), java.lang.Integer.valueOf(f4353v));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        ae4.b bVar;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (view == null) {
            int i19 = this.f4359g;
            android.view.LayoutInflater layoutInflater = this.f4358f;
            view2 = i19 == 1 ? layoutInflater.inflate(com.tencent.mm.R.layout.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.tencent.mm.R.layout.cs9, (android.view.ViewGroup) null);
            bVar = new ae4.b(this);
            bVar.f4373a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9q);
            bVar.f4374b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9p);
            bVar.f4375c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9o);
            bVar.f4376d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9n);
            bVar.f4377e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9m);
            bVar.f4378f = imageView;
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: ae4.a$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.Object child;
                    ae4.a aVar = ae4.a.this;
                    aVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view3);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    ae4.d dVar = (view3.getTag() == null || !(view3.getTag() instanceof ae4.d)) ? null : (ae4.d) view3.getTag();
                    if (dVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
                        yj0.a.h(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                        return;
                    }
                    ae4.c cVar = aVar.f4371s;
                    if (cVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
                        int i27 = dVar.f4379a;
                        int i28 = dVar.f4380b;
                        int i29 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.C;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = ((com.tencent.mm.plugin.sns.ui.nk) cVar).f170016a;
                        snsLabelUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        ae4.a aVar2 = snsLabelUI.f167225m;
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
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                                j45.l.n(snsLabelUI.getContext(), "label", ".ui.ContactEditLabel", intent, 4002);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                                j45.l.n(snsLabelUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
                    } else {
                        str = "lambda$getRealChildView$0";
                        str2 = "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter";
                    }
                    yj0.a.h(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            });
            view2.setTag(bVar);
        } else {
            bVar = (ae4.b) view.getTag();
            view2 = view;
        }
        int i27 = f4352u;
        java.lang.CharSequence charSequence = "";
        android.content.Context context = this.f4357e;
        if (i18 == i27) {
            bVar.f4373a.setVisibility(8);
            bVar.f4374b.setVisibility(8);
            bVar.f4377e.setVisibility(8);
            bVar.f4378f.setVisibility(8);
            bVar.f4375c.setVisibility(0);
            bVar.f4376d.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f4375c.setText(context.getResources().getString(com.tencent.mm.R.string.jbs));
            if (i17 == 3) {
                if (this.f4366n.size() > 0) {
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f4366n), ",");
                    android.widget.TextView textView = bVar.f4376d;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    float textSize = bVar.f4376d.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "√" + c17, textSize));
                    bVar.f4376d.setVisibility(0);
                    bVar.f4376d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6e));
                } else {
                    bVar.f4376d.setText("");
                    bVar.f4376d.setVisibility(8);
                }
            } else if (i17 == 2) {
                if (this.f4365m.size() > 0) {
                    java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f4365m), ",");
                    android.widget.TextView textView2 = bVar.f4376d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize2 = bVar.f4376d.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "√" + c18, textSize2));
                    bVar.f4376d.setVisibility(0);
                    bVar.f4376d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6d));
                } else {
                    bVar.f4376d.setText("");
                    bVar.f4376d.setVisibility(8);
                }
            }
        } else if (i18 == f4351t) {
            bVar.f4373a.setVisibility(8);
            bVar.f4377e.setVisibility(8);
            bVar.f4378f.setVisibility(8);
            bVar.f4375c.setVisibility(0);
            bVar.f4374b.setVisibility(8);
            bVar.f4376d.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f4375c.setText(context.getResources().getString(com.tencent.mm.R.string.jbw));
            if (i17 == 3) {
                if (this.f4368p.size() > 0) {
                    java.lang.String c19 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f4368p), ",");
                    bVar.f4376d.setText("√" + c19);
                    bVar.f4376d.setVisibility(0);
                    bVar.f4376d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6e));
                } else {
                    bVar.f4376d.setText("");
                    bVar.f4376d.setVisibility(8);
                }
            } else if (i17 == 2) {
                if (this.f4367o.size() > 0) {
                    java.lang.String c110 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f4367o), ",");
                    bVar.f4376d.setText("√" + c110);
                    bVar.f4376d.setVisibility(0);
                    bVar.f4376d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6d));
                } else {
                    bVar.f4376d.setText("");
                    bVar.f4376d.setVisibility(8);
                }
            }
        } else {
            int i28 = i18 - f4353v;
            android.widget.ImageView imageView2 = bVar.f4378f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            java.lang.Object tag = imageView2.getTag();
            if (tag == null || !(tag instanceof ae4.d)) {
                ae4.d dVar = new ae4.d(this);
                dVar.f4379a = i17;
                dVar.f4380b = i28;
                imageView2.setTag(dVar);
            } else {
                ae4.d dVar2 = (ae4.d) imageView2.getTag();
                dVar2.f4379a = i17;
                dVar2.f4380b = i28;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            bVar.f4373a.setVisibility(0);
            bVar.f4374b.setVisibility(0);
            bVar.f4377e.setVisibility(0);
            bVar.f4378f.setVisibility(0);
            bVar.f4375c.setVisibility(8);
            bVar.f4376d.setVisibility(8);
            java.lang.String str = (java.lang.String) this.f4356d.get(i28);
            android.widget.TextView textView3 = bVar.f4373a;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            android.widget.TextView textView4 = bVar.f4374b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str));
            if (j17 == null || j17.size() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(j17.size());
                for (java.lang.String str2 : j17) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    ((sg3.a) v0Var).getClass();
                    arrayList.add(c01.a2.e(str2));
                }
                java.lang.String c111 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, c111);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            }
            textView4.setText(charSequence);
            bVar.f4378f.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_label_more_btn, context.getResources().getColor(com.tencent.mm.R.color.BW_50)));
            if (this.f4359g == 1) {
                if (i17 == 2) {
                    if (f(1, str)) {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected);
                    } else {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected);
                    }
                } else if (i17 == 3) {
                    if (this.f4360h != i17) {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                    } else {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                    }
                    if (f(2, str)) {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                    } else {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                    }
                }
            } else if (i17 == 2) {
                if (f(1, str)) {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                } else {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                }
            } else if (i17 == 3) {
                if (f(2, str)) {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.raw.checkbox_selected_red);
                } else {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return view2;
    }

    @Override // ql5.d
    public int c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i17 <= 1 || this.f4356d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        int size = this.f4356d.size() + f4353v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return size;
    }

    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (e() != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(e());
            if (!g(arrayList, str)) {
                if (arrayList.size() == 5) {
                    arrayList.remove(4);
                    arrayList.add(0, str);
                } else {
                    arrayList.add(0, str);
                }
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                gm0.j1.i();
                gm0.j1.u().c().w(335875, c17);
            }
        } else {
            gm0.j1.i();
            gm0.j1.u().c().w(335875, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    public final java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return P1;
    }

    public final boolean f(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i17 == 1) {
            boolean g17 = g(this.f4363k, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return g17;
        }
        boolean g18 = g(this.f4364l, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return g18;
    }

    public final boolean g(java.util.List list, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.lang.Object obj = this.f4356d.get(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 4;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        ae4.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof ae4.b)) {
            int i18 = this.f4359g;
            android.view.LayoutInflater layoutInflater = this.f4358f;
            inflate = i18 == 1 ? layoutInflater.inflate(com.tencent.mm.R.layout.csc, (android.view.ViewGroup) null) : layoutInflater.inflate(com.tencent.mm.R.layout.csb, (android.view.ViewGroup) null);
            bVar = new ae4.b(this);
            bVar.f4373a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n9q);
            bVar.f4377e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n9h);
            bVar.f4374b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n9p);
            inflate.setTag(bVar);
        } else {
            bVar = (ae4.b) view.getTag();
            inflate = view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        bVar.f4373a.setText(f4354w[i17]);
        bVar.f4374b.setText(f4355x[i17]);
        bVar.f4374b.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_1));
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "dealWithGroupView: groupPosition:%d, mGroupSelect:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f4360h));
        android.content.Context context = this.f4357e;
        if (i17 == 0 || i17 == 1) {
            if (this.f4360h != i17) {
                bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_off);
            } else {
                bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_on);
                bVar.f4377e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
            }
        } else if (i17 != 2) {
            if (i17 == 3) {
                if (this.f4359g == 1) {
                    if (this.f4360h != i17) {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_off);
                    } else {
                        bVar.f4377e.setImageResource(com.tencent.mm.R.raw.round_selector_checked_orange);
                        bVar.f4377e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
                    }
                } else if (this.f4360h != i17) {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_off);
                } else {
                    bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_on_red);
                    bVar.f4377e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
                }
            }
        } else if (this.f4360h != i17) {
            bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_off);
        } else {
            bVar.f4377e.setImageResource(com.tencent.mm.R.raw.radio_on);
            bVar.f4377e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (this.f4362j && i17 == 1) {
            android.view.View view2 = new android.view.View(context);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return view2;
        }
        if (!this.f4361i || (i17 != 1 && i17 != 2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return inflate;
        }
        android.view.View view3 = new android.view.View(context);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return view3;
    }

    public void h(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.List e17 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (e17 == null || arrayList == null) {
            this.f4356d = arrayList;
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
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ",");
            gm0.j1.i();
            gm0.j1.u().c().w(335875, c17);
            this.f4356d = arrayList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    public final java.util.List i(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        }
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return linkedList;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return true;
    }
}

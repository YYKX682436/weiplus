package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class n7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99593e;

    public n7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99593e = sportHistoryUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cvc;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String d17;
        r45.ab0 ab0Var;
        java.util.Iterator it;
        android.view.ViewGroup viewGroup;
        java.util.LinkedList<r45.ed6> linkedList;
        android.content.Context context;
        boolean z18;
        android.widget.LinearLayout linearLayout;
        android.view.View view;
        java.lang.String valueOf;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.widget.TextView textView;
        in5.s0 holder = s0Var;
        com.tencent.mm.plugin.exdevice.ui.f7 item = (com.tencent.mm.plugin.exdevice.ui.f7) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.cqs);
        r45.ab0 ab0Var2 = item.f99459e;
        int i19 = ab0Var2.f369880d;
        com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI = this.f99593e;
        sportHistoryUI.getClass();
        long j17 = i19;
        long j18 = 1000 * j17;
        if (j18 >= com.tencent.mm.plugin.sport.model.c0.g()) {
            d17 = sportHistoryUI.getString(com.tencent.mm.R.string.c5f);
            kotlin.jvm.internal.o.d(d17);
        } else if (j18 >= com.tencent.mm.plugin.sport.model.c0.g() - 86400000) {
            d17 = sportHistoryUI.getString(com.tencent.mm.R.string.c5s);
            kotlin.jvm.internal.o.d(d17);
        } else {
            d17 = k35.m1.d(sportHistoryUI.getString(com.tencent.mm.R.string.f492135fc2), j17);
            kotlin.jvm.internal.o.d(d17);
        }
        textView2.setText(d17);
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        r45.hh7 hh7Var = ab0Var2.f369881e;
        int i27 = 0;
        int i28 = hh7Var != null ? hh7Var.f376175e : 0;
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.nic)).setText(java.lang.String.valueOf(i28));
        if (i28 >= 10000) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.nic)).setTextColor(i65.a.d(sportHistoryUI, com.tencent.mm.R.color.f478937ld));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.nic)).setTextColor(i65.a.d(sportHistoryUI, com.tencent.mm.R.color.f478936lc));
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g)).setText(java.lang.String.valueOf(ab0Var2.f369883g));
        if (ab0Var2.f369885i) {
            ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1n)).setImageResource(com.tencent.mm.R.raw.device_rank_item_liked);
        } else {
            ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1n)).setImageResource(com.tencent.mm.R.raw.device_rank_item_unliked);
        }
        java.util.LinkedList U6 = com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.U6(sportHistoryUI, ab0Var2);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.nfo);
        viewGroup2.removeAllViews();
        java.util.Iterator it6 = U6.iterator();
        while (it6.hasNext()) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) it6.next();
            android.content.Context context2 = holder.f293121e;
            android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.a_5, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f483246a34);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.a2m);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a2u);
            if (((linkedList2 == null || linkedList2.isEmpty()) ? 1 : i27) != 0) {
                return;
            }
            java.lang.Object obj = linkedList2.get(i27);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.ed6 ed6Var = (r45.ed6) obj;
            int i29 = ed6Var.f373335o;
            if (i29 == 0) {
                if (kotlin.jvm.internal.o.b("21f9d636b41b25be", ed6Var.f373327d)) {
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.R.string.jjh);
                    }
                    if (weImageView2 != null) {
                        weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_apple_watch);
                    }
                    if (weImageView2 != null) {
                        weImageView2.setColorFilter(i65.a.d(sportHistoryUI.getContext(), com.tencent.mm.R.color.FG_2));
                    }
                    java.util.LinkedList<r45.dd6> linkedList3 = ab0Var2.f369886m;
                    if (!(linkedList3 != null && (linkedList3.isEmpty() ^ true))) {
                        java.lang.Integer valueOf2 = linkedList3 != null ? java.lang.Integer.valueOf(linkedList3.size()) : null;
                        kotlin.jvm.internal.o.d(valueOf2);
                        if (valueOf2.intValue() < 3) {
                            ab0Var = ab0Var2;
                            it = it6;
                            weImageView = weImageView2;
                            viewGroup = viewGroup2;
                            linkedList = linkedList2;
                            context = context2;
                            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(ed6Var.f373327d, new com.tencent.mm.plugin.exdevice.ui.i7(sportHistoryUI, textView3, weImageView));
                        }
                    }
                    ab0Var = ab0Var2;
                    android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.a_3, (android.view.ViewGroup) null);
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.nfn);
                    if (linkedList3 != null) {
                        for (r45.dd6 dd6Var : linkedList3) {
                            java.util.Iterator it7 = it6;
                            android.view.ViewGroup viewGroup3 = viewGroup2;
                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.a_6, (android.view.ViewGroup) null);
                            android.widget.TextView textView4 = linearLayout4 != null ? (android.widget.TextView) linearLayout4.findViewById(com.tencent.mm.R.id.lpl) : null;
                            android.content.Context context3 = context2;
                            if (textView4 != null) {
                                textView4.setText(dd6Var.f372335m);
                                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.V6(sportHistoryUI, textView4, 14.0f);
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            java.util.LinkedList linkedList4 = linkedList2;
                            sb6.append((int) dd6Var.f372331f);
                            sb6.append('/');
                            sb6.append((int) dd6Var.f372332g);
                            java.lang.String sb7 = sb6.toString();
                            if (linearLayout4 != null && (textView = (android.widget.TextView) linearLayout4.findViewById(com.tencent.mm.R.id.lpm)) != null) {
                                textView.setText(sb7);
                                com.tencent.mm.ui.bk.s0(textView.getPaint());
                                int i37 = dd6Var.f372333h;
                                textView.setTextColor(textView.getContext().getResources().getColor(i37 != 0 ? i37 != 1 ? i37 != 2 ? com.tencent.mm.R.color.f478712f3 : com.tencent.mm.R.color.f478927l3 : com.tencent.mm.R.color.f478928l4 : com.tencent.mm.R.color.f478929l5));
                                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.V6(sportHistoryUI, textView, 17.0f);
                            }
                            android.widget.TextView textView5 = linearLayout4 != null ? (android.widget.TextView) linearLayout4.findViewById(com.tencent.mm.R.id.lpy) : null;
                            if (textView5 != null) {
                                textView5.setText(dd6Var.f372336n);
                                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.V6(sportHistoryUI, textView5, 14.0f);
                            }
                            linearLayout3.addView(linearLayout4);
                            linkedList2 = linkedList4;
                            it6 = it7;
                            viewGroup2 = viewGroup3;
                            context2 = context3;
                        }
                    }
                    it = it6;
                    viewGroup = viewGroup2;
                    context = context2;
                    java.util.LinkedList linkedList5 = linkedList2;
                    com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress colorfulCircleProgress = (com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress) inflate2.findViewById(com.tencent.mm.R.id.gsv);
                    if (colorfulCircleProgress != null && linkedList3 != null) {
                        for (r45.dd6 dd6Var2 : linkedList3) {
                            int i38 = dd6Var2.f372333h;
                            java.util.LinkedList linkedList6 = linkedList5;
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = weImageView2;
                            int i39 = (int) (360.0f * (dd6Var2.f372331f / dd6Var2.f372332g));
                            if (i38 == 0) {
                                colorfulCircleProgress.outDestDegree = i39;
                            } else if (i38 == 1) {
                                colorfulCircleProgress.midDestDegree = i39;
                            } else if (i38 != 2) {
                                colorfulCircleProgress.innerDestDegree = i39;
                            } else {
                                colorfulCircleProgress.innerDestDegree = i39;
                            }
                            linkedList5 = linkedList6;
                            weImageView2 = weImageView3;
                        }
                    }
                    weImageView = weImageView2;
                    linkedList = linkedList5;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(inflate2);
                    }
                    ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(ed6Var.f373327d, new com.tencent.mm.plugin.exdevice.ui.i7(sportHistoryUI, textView3, weImageView));
                } else {
                    ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(ed6Var.f373327d, new com.tencent.mm.plugin.exdevice.ui.h7(sportHistoryUI, textView3, weImageView2));
                    ab0Var = ab0Var2;
                    it = it6;
                    viewGroup = viewGroup2;
                    linkedList = linkedList2;
                    context = context2;
                }
                inflate.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.l7(ed6Var, sportHistoryUI));
                linearLayout = linearLayout2;
                view = inflate;
                z18 = true;
            } else {
                ab0Var = ab0Var2;
                it = it6;
                viewGroup = viewGroup2;
                linkedList = linkedList2;
                context = context2;
                z18 = true;
                if (i29 == 1) {
                    if (textView3 != null) {
                        textView3.setText(ed6Var.f373328e);
                    }
                    o11.f fVar = new o11.f();
                    fVar.f342077a = true;
                    fVar.f342078b = true;
                    fVar.f342096t = true;
                    n11.a.b().h(ed6Var.f373334n, weImageView2, fVar.a());
                    java.lang.String str = ed6Var.f373333m;
                    if (!(str == null || str.length() == 0)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(ed6Var.f373333m);
                        int optInt = jSONObject.optInt("jump_type");
                        boolean z19 = optInt != 0;
                        androidx.appcompat.app.AppCompatActivity context4 = sportHistoryUI.getContext();
                        kotlin.jvm.internal.o.f(context4, "getContext(...)");
                        ym5.a1.f(new a42.f(textView3, z19 ? i65.a.d(context4, com.tencent.mm.R.color.Link_100) : i65.a.d(context4, com.tencent.mm.R.color.FG_2), weImageView2));
                        boolean z27 = z19;
                        linearLayout = linearLayout2;
                        view = inflate;
                        view.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.m7(z27, optInt, jSONObject, ed6Var, sportHistoryUI));
                    }
                }
                linearLayout = linearLayout2;
                view = inflate;
            }
            for (r45.ed6 ed6Var2 : linkedList) {
                java.lang.String str2 = ed6Var2.f373330g;
                if (!((str2 == null || str2.length() == 0) ? z18 : false)) {
                    android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a_6, (android.view.ViewGroup) null);
                    kotlin.jvm.internal.o.e(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) inflate3;
                    android.widget.TextView textView6 = (android.widget.TextView) viewGroup4.findViewById(com.tencent.mm.R.id.lpl);
                    if (textView6 != null) {
                        textView6.setText(ed6Var2.f373330g);
                    }
                    android.widget.TextView textView7 = (android.widget.TextView) viewGroup4.findViewById(com.tencent.mm.R.id.lpm);
                    if (textView7 != null) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(ed6Var2.f373336p)) {
                            valueOf = java.lang.String.valueOf(ed6Var2.f373331h);
                        } else {
                            valueOf = ed6Var2.f373336p;
                            kotlin.jvm.internal.o.d(valueOf);
                        }
                        textView7.setText(valueOf);
                        com.tencent.mm.ui.bk.s0(textView7.getPaint());
                    }
                    android.widget.TextView textView8 = (android.widget.TextView) viewGroup4.findViewById(com.tencent.mm.R.id.lpy);
                    if (textView8 != null) {
                        textView8.setText(ed6Var2.f373332i);
                    }
                    linearLayout.addView(viewGroup4);
                }
            }
            android.view.ViewGroup viewGroup5 = viewGroup;
            viewGroup5.addView(view);
            holder = s0Var;
            viewGroup2 = viewGroup5;
            ab0Var2 = ab0Var;
            it6 = it;
            i27 = 0;
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

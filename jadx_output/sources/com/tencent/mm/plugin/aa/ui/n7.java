package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72750a;

    public n7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72750a = paylistAAUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        android.text.SpannableString spannableString;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        int i27;
        r45.d0 d0Var = (r45.d0) obj;
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72750a;
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.PaylistAAUI", "queryDetailRes is null!!!");
            com.tencent.mm.plugin.aa.ui.PaylistAAUI.j7(paylistAAUI, null);
            return null;
        }
        java.lang.String str3 = d0Var.f371957f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(d0Var.f371959h);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(d0Var.f371965q);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(d0Var.f371967s);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(d0Var.f371968t);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(d0Var.f371969u);
        java.util.LinkedList linkedList2 = d0Var.A;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "get queryDetailRes: %s, billNo: %s, type: %s, state: %s, is_launcher: %s, role: %s, role_state: %s, payer_list.size: %s", d0Var, str3, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Integer.valueOf(linkedList2.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "paid_num: %s, plan_num: %s, activity_amount: %s", java.lang.Integer.valueOf(d0Var.f371964p), java.lang.Integer.valueOf(d0Var.f371962n), java.lang.Long.valueOf(d0Var.D));
        android.view.View view = paylistAAUI.f72547i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        paylistAAUI.f72544J = d0Var.f371960i;
        paylistAAUI.K = d0Var.H;
        paylistAAUI.M = linkedList2.size() + 1;
        paylistAAUI.L = d0Var.f371958g;
        paylistAAUI.R = d0Var.f371959h;
        paylistAAUI.G.setBannerData(d0Var.f371954J);
        java.lang.String str4 = d0Var.f371960i;
        java.lang.String str5 = d0Var.f371958g;
        double r17 = h61.o.r(d0Var.f371961m);
        android.widget.TextView textView = (android.widget.TextView) paylistAAUI.findViewById(com.tencent.mm.R.id.kse);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str6 = d0Var.f371960i;
        ((sg3.a) v0Var).getClass();
        sb6.append(c01.a2.e(str6));
        sb6.append(paylistAAUI.getString(com.tencent.mm.R.string.hgy));
        textView.setText(sb6.toString());
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) paylistAAUI.findViewById(com.tencent.mm.R.id.krs), str4, null);
        android.widget.TextView textView2 = (android.widget.TextView) paylistAAUI.findViewById(com.tencent.mm.R.id.ks7);
        android.widget.TextView textView3 = (android.widget.TextView) paylistAAUI.findViewById(com.tencent.mm.R.id.ks8);
        int i28 = d0Var.f371959h;
        if (i28 == 4) {
            textView3.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin = i65.a.b(paylistAAUI.getContext(), 8);
            textView.setLayoutParams(layoutParams);
            str2 = "MicroMsg.Aa.PaylistAAUI";
            linkedList = linkedList2;
        } else {
            if (i28 == 2) {
                long j17 = d0Var.D;
                str = "MicroMsg.Aa.PaylistAAUI";
                if (j17 > d0Var.f371961m) {
                    java.lang.String string = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(j17)));
                    java.lang.String string2 = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(d0Var.f371961m)));
                    java.lang.String str7 = paylistAAUI.getString(com.tencent.mm.R.string.hgx) + string + paylistAAUI.getString(com.tencent.mm.R.string.hgv) + string2;
                    spannableString = new android.text.SpannableString(str7);
                    com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1)), null);
                    wcPayTextApppearanceSpan.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 7);
                    linkedList = linkedList2;
                    com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan2 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1)), null);
                    wcPayTextApppearanceSpan2.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 7);
                    spannableString.setSpan(wcPayTextApppearanceSpan, str7.indexOf(string), str7.indexOf(string) + string.length(), 17);
                    spannableString.setSpan(wcPayTextApppearanceSpan2, str7.lastIndexOf(string2), str7.lastIndexOf(string2) + string2.length(), 17);
                    textView3.setText(spannableString);
                    str2 = str;
                    com.tencent.mars.xlog.Log.i(str2, "top title : %s", spannableString.toString());
                }
            } else {
                str = "MicroMsg.Aa.PaylistAAUI";
            }
            linkedList = linkedList2;
            java.lang.String string3 = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(r17));
            java.lang.String str8 = paylistAAUI.getString(com.tencent.mm.R.string.hgx) + string3;
            spannableString = new android.text.SpannableString(str8);
            com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan3 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1)), null);
            wcPayTextApppearanceSpan3.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 7);
            spannableString.setSpan(wcPayTextApppearanceSpan3, str8.lastIndexOf(string3), str8.lastIndexOf(string3) + string3.length(), 17);
            textView3.setText(spannableString);
            str2 = str;
            com.tencent.mars.xlog.Log.i(str2, "top title : %s", spannableString.toString());
        }
        textView3.postDelayed(new com.tencent.mm.plugin.aa.ui.u7(paylistAAUI, textView3, textView), 100L);
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.E)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = paylistAAUI.getContext();
                ((ke0.e) xVar).getClass();
                paylistAAUI.o7(textView2, com.tencent.mm.pluginsdk.ui.span.c0.i(context, str5), "", d0Var);
            } else {
                textView2.setClickable(true);
                textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(paylistAAUI));
                textView2.post(new com.tencent.mm.plugin.aa.ui.v7(paylistAAUI, textView2, str5, d0Var));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "", new java.lang.Object[0]);
        }
        int i29 = d0Var.f371965q;
        if (i29 == 2) {
            paylistAAUI.C.setText(com.tencent.mm.R.string.hgq);
            paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
        } else if (i29 == 3) {
            paylistAAUI.C.setText(com.tencent.mm.R.string.hgo);
            paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
        } else {
            int i37 = d0Var.f371968t;
            if (i37 == 3) {
                paylistAAUI.f72551p.setVisibility(8);
                paylistAAUI.f72550o.setVisibility(0);
                paylistAAUI.C.setText(paylistAAUI.getString(com.tencent.mm.R.string.hgz));
                paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
                j61.c z07 = e61.e.wi().z0(d0Var.f371957f);
                if (z07 != null) {
                    z07.field_status = 4;
                    e61.e.wi().replace(z07);
                }
            } else if (i37 == 2) {
                paylistAAUI.f72551p.setVisibility(8);
                paylistAAUI.f72550o.setVisibility(0);
                int i38 = d0Var.f371969u;
                if (i38 == 6) {
                    paylistAAUI.C.setText(paylistAAUI.getString(com.tencent.mm.R.string.hgp));
                    paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u));
                } else if (i38 == 2) {
                    java.lang.String string4 = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(d0Var.f371963o)));
                    java.lang.String str9 = paylistAAUI.getString(com.tencent.mm.R.string.f492693hh4) + string4;
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(str9);
                    com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan4 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) paylistAAUI.C.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u)), null);
                    wcPayTextApppearanceSpan4.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 4);
                    spannableString2.setSpan(wcPayTextApppearanceSpan4, str9.lastIndexOf(string4), str9.lastIndexOf(string4) + string4.length(), 17);
                    paylistAAUI.C.setText(spannableString2);
                    paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u));
                } else if (i38 == 1) {
                    java.lang.String string5 = paylistAAUI.getString(com.tencent.mm.R.string.f492694hh5);
                    java.lang.String str10 = paylistAAUI.getString(com.tencent.mm.R.string.f492693hh4) + string5;
                    android.text.SpannableString spannableString3 = new android.text.SpannableString(str10);
                    com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan5 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) paylistAAUI.C.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u)), null);
                    wcPayTextApppearanceSpan5.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 4);
                    spannableString3.setSpan(wcPayTextApppearanceSpan5, str10.lastIndexOf(string5), str10.lastIndexOf(string5) + string5.length(), 17);
                    paylistAAUI.C.setText(spannableString3);
                } else {
                    com.tencent.mars.xlog.Log.e(str2, "unhandled state, state: %s, type: %s, role: %s", java.lang.Integer.valueOf(d0Var.f371965q), java.lang.Integer.valueOf(d0Var.f371959h), java.lang.Integer.valueOf(d0Var.f371968t));
                    paylistAAUI.C.setVisibility(8);
                }
            } else if (i37 == 1) {
                if (d0Var.f371959h == 4) {
                    int i39 = d0Var.f371969u;
                    com.tencent.mars.xlog.Log.i(str2, "renderInstantPayAreaForCustomize role:%s", java.lang.Integer.valueOf(i39));
                    if (i39 == 1) {
                        paylistAAUI.f72551p.setVisibility(0);
                        paylistAAUI.f72550o.setVisibility(8);
                        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = (com.tencent.mm.wallet_core.ui.WalletTextView) paylistAAUI.findViewById(com.tencent.mm.R.id.k6j);
                        paylistAAUI.f72556u = walletTextView;
                        walletTextView.setVisibility(8);
                        ((android.widget.TextView) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.ks6)).setVisibility(8);
                        r45.a0 f17 = h61.o.f(linkedList);
                        if (f17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(f17.f369577i)) {
                            paylistAAUI.A = f17.f369577i;
                        }
                        android.widget.Button button = (android.widget.Button) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.f486286ks4);
                        paylistAAUI.f72557v = button;
                        int i47 = d0Var.f371965q;
                        if (i47 == 2 || i47 == 3) {
                            button.setVisibility(8);
                        } else {
                            button.setText(paylistAAUI.getString(com.tencent.mm.R.string.hgu));
                            paylistAAUI.f72557v.setOnClickListener(new com.tencent.mm.plugin.aa.ui.n6(paylistAAUI));
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) paylistAAUI.f72557v.getLayoutParams();
                            layoutParams2.topMargin = 0;
                            paylistAAUI.f72557v.setLayoutParams(layoutParams2);
                        }
                    } else if (i39 != 7) {
                        com.tencent.mars.xlog.Log.i(str2, "unknown type");
                    } else {
                        paylistAAUI.f72551p.setVisibility(8);
                        paylistAAUI.f72550o.setVisibility(0);
                        java.lang.String string6 = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(d0Var.f371970v)));
                        java.lang.String str11 = paylistAAUI.getString(com.tencent.mm.R.string.f492689hh0) + string6;
                        android.text.SpannableString spannableString4 = new android.text.SpannableString(str11);
                        com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan6 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) paylistAAUI.C.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u)), null);
                        wcPayTextApppearanceSpan6.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 4);
                        spannableString4.setSpan(wcPayTextApppearanceSpan6, str11.lastIndexOf(string6), str11.lastIndexOf(string6) + string6.length(), 17);
                        paylistAAUI.C.setText(spannableString4);
                        paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u));
                    }
                } else {
                    r45.a0 f18 = h61.o.f(linkedList);
                    int i48 = d0Var.f371969u;
                    if (i48 == 1 || (f18 != null && f18.f369575g == 1)) {
                        java.lang.String format = java.lang.String.format("%.2f", java.lang.Double.valueOf(h61.o.r(d0Var.f371970v)));
                        java.lang.String string7 = paylistAAUI.getString(com.tencent.mm.R.string.hgm);
                        java.lang.String str12 = f18.f369577i;
                        paylistAAUI.Q = d0Var.f371970v;
                        int i49 = d0Var.f371965q;
                        paylistAAUI.f72551p.setVisibility(0);
                        paylistAAUI.f72550o.setVisibility(8);
                        paylistAAUI.f72557v = (android.widget.Button) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.f486286ks4);
                        paylistAAUI.f72558w = (android.widget.TextView) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.krr);
                        paylistAAUI.f72559x = (android.widget.TextView) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.f486282ks0);
                        paylistAAUI.f72554s = (android.widget.LinearLayout) paylistAAUI.findViewById(com.tencent.mm.R.id.f486283ks1);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                            i17 = 8;
                            paylistAAUI.f72560y.setVisibility(8);
                        } else {
                            paylistAAUI.f72560y.setVisibility(0);
                            paylistAAUI.f72560y.setText(str12);
                            paylistAAUI.A = paylistAAUI.f72560y.getText().toString();
                            i17 = 8;
                        }
                        paylistAAUI.p7();
                        if (i49 == 2 || i49 == 3) {
                            paylistAAUI.f72557v.setVisibility(i17);
                            paylistAAUI.f72559x.setVisibility(i17);
                        } else {
                            paylistAAUI.f72558w.setVisibility(0);
                            paylistAAUI.f72559x.setVisibility(i17);
                        }
                        paylistAAUI.f72557v.setOnClickListener(new com.tencent.mm.plugin.aa.ui.o6(paylistAAUI));
                        paylistAAUI.f72554s.setVisibility(0);
                        paylistAAUI.f72556u = (com.tencent.mm.wallet_core.ui.WalletTextView) paylistAAUI.findViewById(com.tencent.mm.R.id.k6j);
                        android.widget.TextView textView4 = (android.widget.TextView) paylistAAUI.f72551p.findViewById(com.tencent.mm.R.id.ks6);
                        paylistAAUI.f72556u.b();
                        paylistAAUI.f72556u.setText(format);
                        paylistAAUI.f72556u.setTextSize(46.0f);
                        textView4.setText(string7);
                    } else if (i48 == 7 || (f18 != null && f18.f369575g == 7)) {
                        paylistAAUI.f72551p.setVisibility(8);
                        paylistAAUI.f72550o.setVisibility(0);
                        java.lang.String string8 = paylistAAUI.getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(d0Var.f371970v)));
                        java.lang.String str13 = paylistAAUI.getString(com.tencent.mm.R.string.f492689hh0) + string8;
                        android.text.SpannableString spannableString5 = new android.text.SpannableString(str13);
                        com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan7 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) paylistAAUI.C.getTextSize(), android.content.res.ColorStateList.valueOf(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u)), null);
                        wcPayTextApppearanceSpan7.f180847d = com.tencent.mm.wallet_core.ui.r1.F(paylistAAUI.getContext(), 4);
                        spannableString5.setSpan(wcPayTextApppearanceSpan7, str13.lastIndexOf(string8), str13.lastIndexOf(string8) + string8.length(), 17);
                        paylistAAUI.C.setText(spannableString5);
                        paylistAAUI.C.setTextColor(paylistAAUI.getResources().getColor(com.tencent.mm.R.color.a0u));
                    } else {
                        com.tencent.mars.xlog.Log.e(str2, "unhandled state, state: %s, type: %s, role: %s", java.lang.Integer.valueOf(d0Var.f371965q), java.lang.Integer.valueOf(d0Var.f371959h), java.lang.Integer.valueOf(d0Var.f371968t));
                        paylistAAUI.f72551p.setVisibility(8);
                        paylistAAUI.C.setVisibility(8);
                    }
                }
                androidx.appcompat.app.AppCompatActivity activity = paylistAAUI.getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.aa.ui.y5 y5Var = (com.tencent.mm.plugin.aa.ui.y5) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.aa.ui.y5.class);
                y5Var.getClass();
                if (d0Var.f371968t == 1) {
                    r45.a0 f19 = h61.o.f(linkedList);
                    if ((d0Var.f371969u == 7) || (f19 != null && f19.f369575g == 7)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PayListAAUIAmountInfoUIC", "payer has paid, check amount_info_page");
                        java.lang.String str14 = d0Var.L;
                        if (str14 == null || str14.length() == 0) {
                            android.widget.LinearLayout O6 = y5Var.O6();
                            if (O6 != null) {
                                O6.setVisibility(8);
                            }
                        } else {
                            android.widget.LinearLayout O62 = y5Var.O6();
                            if (O62 != null) {
                                O62.setVisibility(0);
                            }
                            android.widget.TextView textView5 = (android.widget.TextView) y5Var.findViewById(com.tencent.mm.R.id.upd);
                            if (textView5 != null) {
                                textView5.setText(d0Var.L);
                            }
                            java.lang.String str15 = d0Var.M;
                            if (!(str15 == null || str15.length() == 0)) {
                                android.widget.LinearLayout O63 = y5Var.O6();
                                if (O63 != null) {
                                    O63.setClickable(true);
                                }
                                android.widget.LinearLayout O64 = y5Var.O6();
                                if (O64 != null) {
                                    O64.setOnClickListener(new com.tencent.mm.plugin.aa.ui.x5(str15));
                                }
                            }
                        }
                    } else {
                        android.widget.LinearLayout O65 = y5Var.O6();
                        if (O65 != null) {
                            O65.setVisibility(8);
                        }
                    }
                } else {
                    android.widget.LinearLayout O66 = y5Var.O6();
                    if (O66 != null) {
                        O66.setVisibility(8);
                    }
                }
            }
        }
        if (d0Var.f371968t == 2 && ((i27 = d0Var.f371965q) == 2 || i27 == 3 || d0Var.f371969u == 6)) {
            paylistAAUI.D.setText(paylistAAUI.getString(com.tencent.mm.R.string.f492691hh2, java.lang.Double.valueOf(h61.o.r(d0Var.f371963o))));
            i18 = 0;
            paylistAAUI.D.setVisibility(0);
        } else {
            i18 = 0;
            paylistAAUI.D.setVisibility(8);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.a0 a0Var = (r45.a0) it.next();
            if (a0Var.f369575g == 1) {
                arrayList3.add(a0Var);
            } else {
                arrayList2.add(a0Var);
            }
        }
        if (!arrayList3.isEmpty() || arrayList2.size() <= 0) {
            i19 = i18;
            if (arrayList2.isEmpty() && arrayList3.size() > 0) {
                paylistAAUI.f72552q.setVisibility(8);
                paylistAAUI.n7(arrayList3, paylistAAUI.getString(com.tencent.mm.R.string.hgh, java.lang.Integer.valueOf(arrayList3.size())), paylistAAUI.l7(d0Var.f371968t, d0Var.f371969u, d0Var.f371965q, d0Var.f371959h, linkedList));
            } else if (arrayList3.size() > 0 && arrayList2.size() > 0) {
                paylistAAUI.f72552q.setVisibility(8);
                java.lang.String string9 = paylistAAUI.getString(com.tencent.mm.R.string.hgj, java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()));
                arrayList3.addAll(arrayList2);
                paylistAAUI.n7(arrayList3, string9, paylistAAUI.l7(d0Var.f371968t, d0Var.f371969u, d0Var.f371965q, d0Var.f371959h, linkedList));
            } else if (d0Var.f371959h == 4 && arrayList2.isEmpty()) {
                paylistAAUI.f72552q.setVisibility(8);
                paylistAAUI.f72553r.setVisibility(8);
                paylistAAUI.E.setVisibility(paylistAAUI.l7(d0Var.f371968t, d0Var.f371969u, d0Var.f371965q, d0Var.f371959h, linkedList) ? i19 : 8);
            } else {
                paylistAAUI.f72552q.setVisibility(8);
                paylistAAUI.f72553r.setVisibility(8);
            }
        } else {
            i19 = i18;
            paylistAAUI.n7(arrayList2, paylistAAUI.getString(com.tencent.mm.R.string.hgi, java.lang.Integer.valueOf(arrayList2.size())), paylistAAUI.l7(d0Var.f371968t, d0Var.f371969u, d0Var.f371965q, d0Var.f371959h, linkedList));
            paylistAAUI.f72552q.setVisibility(8);
        }
        paylistAAUI.addIconOptionMenu(i19, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.aa.ui.t7(paylistAAUI, d0Var));
        if (d0Var.f371968t == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f371960i) && d0Var.f371960i.equals(c01.z1.r())) {
            paylistAAUI.F.setVisibility(i19);
            paylistAAUI.f72555t.setPadding(i19, i19, i19, com.tencent.mm.ui.zk.a(paylistAAUI.getContext(), 24));
        } else {
            paylistAAUI.F.setVisibility(8);
            paylistAAUI.f72555t.setPadding(i19, i19, i19, com.tencent.mm.ui.zk.a(paylistAAUI.getContext(), 32));
        }
        if (paylistAAUI.F.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i(str2, "no need to show bottom tv");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.B)) {
            com.tencent.mars.xlog.Log.i(str2, "wording is null");
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(d0Var.B);
            if (d0Var.C == 1) {
                paylistAAUI.F.setClickable(true);
                java.lang.String str16 = d0Var.B;
                com.tencent.mm.wallet_core.ui.r1.w0(paylistAAUI.F, str16, 0, str16.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.o7(paylistAAUI), true), paylistAAUI.getContext());
            } else {
                paylistAAUI.F.setText(spannableStringBuilder);
            }
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(paylistAAUI.getString(com.tencent.mm.R.string.hh6));
        spannableStringBuilder2.setSpan(new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.i7(paylistAAUI, d0Var), true), i19, spannableStringBuilder2.length(), 18);
        paylistAAUI.E.setText(spannableStringBuilder2);
        paylistAAUI.hideLoading();
        return null;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154283a;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154283a = activityC11355x7bcfecda;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        android.text.SpannableString spannableString;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        int i27;
        r45.d0 d0Var = (r45.d0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154283a;
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.PaylistAAUI", "queryDetailRes is null!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.j7(activityC11355x7bcfecda, null);
            return null;
        }
        java.lang.String str3 = d0Var.f453490f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(d0Var.f453492h);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(d0Var.f453498q);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(d0Var.f453500s);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(d0Var.f453501t);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(d0Var.f453502u);
        java.util.LinkedList linkedList2 = d0Var.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "get queryDetailRes: %s, billNo: %s, type: %s, state: %s, is_launcher: %s, role: %s, role_state: %s, payer_list.size: %s", d0Var, str3, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Integer.valueOf(linkedList2.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "paid_num: %s, plan_num: %s, activity_amount: %s", java.lang.Integer.valueOf(d0Var.f453497p), java.lang.Integer.valueOf(d0Var.f453495n), java.lang.Long.valueOf(d0Var.D));
        android.view.View view = activityC11355x7bcfecda.f154080i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC11355x7bcfecda.f154077J = d0Var.f453493i;
        activityC11355x7bcfecda.K = d0Var.H;
        activityC11355x7bcfecda.M = linkedList2.size() + 1;
        activityC11355x7bcfecda.L = d0Var.f453491g;
        activityC11355x7bcfecda.R = d0Var.f453492h;
        activityC11355x7bcfecda.G.m83148xdedf72f8(d0Var.f453487J);
        java.lang.String str4 = d0Var.f453493i;
        java.lang.String str5 = d0Var.f453491g;
        double r17 = h61.o.r(d0Var.f453494m);
        android.widget.TextView textView = (android.widget.TextView) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.kse);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str6 = d0Var.f453493i;
        ((sg3.a) v0Var).getClass();
        sb6.append(c01.a2.e(str6));
        sb6.append(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgy));
        textView.setText(sb6.toString());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.krs), str4, null);
        android.widget.TextView textView2 = (android.widget.TextView) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.ks7);
        android.widget.TextView textView3 = (android.widget.TextView) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.ks8);
        int i28 = d0Var.f453492h;
        if (i28 == 4) {
            textView3.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin = i65.a.b(activityC11355x7bcfecda.mo55332x76847179(), 8);
            textView.setLayoutParams(layoutParams);
            str2 = "MicroMsg.Aa.PaylistAAUI";
            linkedList = linkedList2;
        } else {
            if (i28 == 2) {
                long j17 = d0Var.D;
                str = "MicroMsg.Aa.PaylistAAUI";
                if (j17 > d0Var.f453494m) {
                    java.lang.String string = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(h61.o.r(j17)));
                    java.lang.String string2 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(h61.o.r(d0Var.f453494m)));
                    java.lang.String str7 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgx) + string + activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgv) + string2;
                    spannableString = new android.text.SpannableString(str7);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x23598017 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)), null);
                    c19157x23598017.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 7);
                    linkedList = linkedList2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980172 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)), null);
                    c19157x235980172.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 7);
                    spannableString.setSpan(c19157x23598017, str7.indexOf(string), str7.indexOf(string) + string.length(), 17);
                    spannableString.setSpan(c19157x235980172, str7.lastIndexOf(string2), str7.lastIndexOf(string2) + string2.length(), 17);
                    textView3.setText(spannableString);
                    str2 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "top title : %s", spannableString.toString());
                }
            } else {
                str = "MicroMsg.Aa.PaylistAAUI";
            }
            linkedList = linkedList2;
            java.lang.String string3 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(r17));
            java.lang.String str8 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgx) + string3;
            spannableString = new android.text.SpannableString(str8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980173 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) textView3.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)), null);
            c19157x235980173.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 7);
            spannableString.setSpan(c19157x235980173, str8.lastIndexOf(string3), str8.lastIndexOf(string3) + string3.length(), 17);
            textView3.setText(spannableString);
            str2 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "top title : %s", spannableString.toString());
        }
        textView3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u7(activityC11355x7bcfecda, textView3, textView), 100L);
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.E)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11355x7bcfecda.mo55332x76847179();
                ((ke0.e) xVar).getClass();
                activityC11355x7bcfecda.o7(textView2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, str5), "", d0Var);
            } else {
                textView2.setClickable(true);
                textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC11355x7bcfecda));
                textView2.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v7(activityC11355x7bcfecda, textView2, str5, d0Var));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, "", new java.lang.Object[0]);
        }
        int i29 = d0Var.f453498q;
        if (i29 == 2) {
            activityC11355x7bcfecda.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hgq);
            activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else if (i29 == 3) {
            activityC11355x7bcfecda.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hgo);
            activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            int i37 = d0Var.f453501t;
            if (i37 == 3) {
                activityC11355x7bcfecda.f154084p.setVisibility(8);
                activityC11355x7bcfecda.f154083o.setVisibility(0);
                activityC11355x7bcfecda.C.setText(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgz));
                activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                j61.c z07 = e61.e.wi().z0(d0Var.f453490f);
                if (z07 != null) {
                    z07.f65953x10a0fed7 = 4;
                    e61.e.wi().mo11260x413cb2b4(z07);
                }
            } else if (i37 == 2) {
                activityC11355x7bcfecda.f154084p.setVisibility(8);
                activityC11355x7bcfecda.f154083o.setVisibility(0);
                int i38 = d0Var.f453502u;
                if (i38 == 6) {
                    activityC11355x7bcfecda.C.setText(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgp));
                    activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u));
                } else if (i38 == 2) {
                    java.lang.String string4 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(h61.o.r(d0Var.f453496o)));
                    java.lang.String str9 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574226hh4) + string4;
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(str9);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980174 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) activityC11355x7bcfecda.C.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u)), null);
                    c19157x235980174.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 4);
                    spannableString2.setSpan(c19157x235980174, str9.lastIndexOf(string4), str9.lastIndexOf(string4) + string4.length(), 17);
                    activityC11355x7bcfecda.C.setText(spannableString2);
                    activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u));
                } else if (i38 == 1) {
                    java.lang.String string5 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574227hh5);
                    java.lang.String str10 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574226hh4) + string5;
                    android.text.SpannableString spannableString3 = new android.text.SpannableString(str10);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980175 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) activityC11355x7bcfecda.C.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u)), null);
                    c19157x235980175.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 4);
                    spannableString3.setSpan(c19157x235980175, str10.lastIndexOf(string5), str10.lastIndexOf(string5) + string5.length(), 17);
                    activityC11355x7bcfecda.C.setText(spannableString3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "unhandled state, state: %s, type: %s, role: %s", java.lang.Integer.valueOf(d0Var.f453498q), java.lang.Integer.valueOf(d0Var.f453492h), java.lang.Integer.valueOf(d0Var.f453501t));
                    activityC11355x7bcfecda.C.setVisibility(8);
                }
            } else if (i37 == 1) {
                if (d0Var.f453492h == 4) {
                    int i39 = d0Var.f453502u;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "renderInstantPayAreaForCustomize role:%s", java.lang.Integer.valueOf(i39));
                    if (i39 == 1) {
                        activityC11355x7bcfecda.f154084p.setVisibility(0);
                        activityC11355x7bcfecda.f154083o.setVisibility(8);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.k6j);
                        activityC11355x7bcfecda.f154089u = c22904x897710ab;
                        c22904x897710ab.setVisibility(8);
                        ((android.widget.TextView) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.ks6)).setVisibility(8);
                        r45.a0 f17 = h61.o.f(linkedList);
                        if (f17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f451110i)) {
                            activityC11355x7bcfecda.A = f17.f451110i;
                        }
                        android.widget.Button button = (android.widget.Button) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.f567819ks4);
                        activityC11355x7bcfecda.f154090v = button;
                        int i47 = d0Var.f453498q;
                        if (i47 == 2 || i47 == 3) {
                            button.setVisibility(8);
                        } else {
                            button.setText(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgu));
                            activityC11355x7bcfecda.f154090v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n6(activityC11355x7bcfecda));
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) activityC11355x7bcfecda.f154090v.getLayoutParams();
                            layoutParams2.topMargin = 0;
                            activityC11355x7bcfecda.f154090v.setLayoutParams(layoutParams2);
                        }
                    } else if (i39 != 7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unknown type");
                    } else {
                        activityC11355x7bcfecda.f154084p.setVisibility(8);
                        activityC11355x7bcfecda.f154083o.setVisibility(0);
                        java.lang.String string6 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(h61.o.r(d0Var.f453503v)));
                        java.lang.String str11 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574222hh0) + string6;
                        android.text.SpannableString spannableString4 = new android.text.SpannableString(str11);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980176 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) activityC11355x7bcfecda.C.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u)), null);
                        c19157x235980176.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 4);
                        spannableString4.setSpan(c19157x235980176, str11.lastIndexOf(string6), str11.lastIndexOf(string6) + string6.length(), 17);
                        activityC11355x7bcfecda.C.setText(spannableString4);
                        activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u));
                    }
                } else {
                    r45.a0 f18 = h61.o.f(linkedList);
                    int i48 = d0Var.f453502u;
                    if (i48 == 1 || (f18 != null && f18.f451108g == 1)) {
                        java.lang.String format = java.lang.String.format("%.2f", java.lang.Double.valueOf(h61.o.r(d0Var.f453503v)));
                        java.lang.String string7 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgm);
                        java.lang.String str12 = f18.f451110i;
                        activityC11355x7bcfecda.Q = d0Var.f453503v;
                        int i49 = d0Var.f453498q;
                        activityC11355x7bcfecda.f154084p.setVisibility(0);
                        activityC11355x7bcfecda.f154083o.setVisibility(8);
                        activityC11355x7bcfecda.f154090v = (android.widget.Button) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.f567819ks4);
                        activityC11355x7bcfecda.f154091w = (android.widget.TextView) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.krr);
                        activityC11355x7bcfecda.f154092x = (android.widget.TextView) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.f567815ks0);
                        activityC11355x7bcfecda.f154087s = (android.widget.LinearLayout) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.f567816ks1);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                            i17 = 8;
                            activityC11355x7bcfecda.f154093y.setVisibility(8);
                        } else {
                            activityC11355x7bcfecda.f154093y.setVisibility(0);
                            activityC11355x7bcfecda.f154093y.setText(str12);
                            activityC11355x7bcfecda.A = activityC11355x7bcfecda.f154093y.getText().toString();
                            i17 = 8;
                        }
                        activityC11355x7bcfecda.p7();
                        if (i49 == 2 || i49 == 3) {
                            activityC11355x7bcfecda.f154090v.setVisibility(i17);
                            activityC11355x7bcfecda.f154092x.setVisibility(i17);
                        } else {
                            activityC11355x7bcfecda.f154091w.setVisibility(0);
                            activityC11355x7bcfecda.f154092x.setVisibility(i17);
                        }
                        activityC11355x7bcfecda.f154090v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o6(activityC11355x7bcfecda));
                        activityC11355x7bcfecda.f154087s.setVisibility(0);
                        activityC11355x7bcfecda.f154089u = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) activityC11355x7bcfecda.findViewById(com.p314xaae8f345.mm.R.id.k6j);
                        android.widget.TextView textView4 = (android.widget.TextView) activityC11355x7bcfecda.f154084p.findViewById(com.p314xaae8f345.mm.R.id.ks6);
                        activityC11355x7bcfecda.f154089u.b();
                        activityC11355x7bcfecda.f154089u.setText(format);
                        activityC11355x7bcfecda.f154089u.setTextSize(46.0f);
                        textView4.setText(string7);
                    } else if (i48 == 7 || (f18 != null && f18.f451108g == 7)) {
                        activityC11355x7bcfecda.f154084p.setVisibility(8);
                        activityC11355x7bcfecda.f154083o.setVisibility(0);
                        java.lang.String string8 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571304b8, java.lang.Double.valueOf(h61.o.r(d0Var.f453503v)));
                        java.lang.String str13 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574222hh0) + string8;
                        android.text.SpannableString spannableString5 = new android.text.SpannableString(str13);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x235980177 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, (int) activityC11355x7bcfecda.C.getTextSize(), android.content.res.ColorStateList.valueOf(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u)), null);
                        c19157x235980177.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(activityC11355x7bcfecda.mo55332x76847179(), 4);
                        spannableString5.setSpan(c19157x235980177, str13.lastIndexOf(string8), str13.lastIndexOf(string8) + string8.length(), 17);
                        activityC11355x7bcfecda.C.setText(spannableString5);
                        activityC11355x7bcfecda.C.setTextColor(activityC11355x7bcfecda.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0u));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "unhandled state, state: %s, type: %s, role: %s", java.lang.Integer.valueOf(d0Var.f453498q), java.lang.Integer.valueOf(d0Var.f453492h), java.lang.Integer.valueOf(d0Var.f453501t));
                        activityC11355x7bcfecda.f154084p.setVisibility(8);
                        activityC11355x7bcfecda.C.setVisibility(8);
                    }
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC11355x7bcfecda.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y5 y5Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y5) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y5.class);
                y5Var.getClass();
                if (d0Var.f453501t == 1) {
                    r45.a0 f19 = h61.o.f(linkedList);
                    if ((d0Var.f453502u == 7) || (f19 != null && f19.f451108g == 7)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayListAAUIAmountInfoUIC", "payer has paid, check amount_info_page");
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
                            android.widget.TextView textView5 = (android.widget.TextView) y5Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.upd);
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
                                    O64.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x5(str15));
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
        if (d0Var.f453501t == 2 && ((i27 = d0Var.f453498q) == 2 || i27 == 3 || d0Var.f453502u == 6)) {
            activityC11355x7bcfecda.D.setText(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574224hh2, java.lang.Double.valueOf(h61.o.r(d0Var.f453496o))));
            i18 = 0;
            activityC11355x7bcfecda.D.setVisibility(0);
        } else {
            i18 = 0;
            activityC11355x7bcfecda.D.setVisibility(8);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.a0 a0Var = (r45.a0) it.next();
            if (a0Var.f451108g == 1) {
                arrayList3.add(a0Var);
            } else {
                arrayList2.add(a0Var);
            }
        }
        if (!arrayList3.isEmpty() || arrayList2.size() <= 0) {
            i19 = i18;
            if (arrayList2.isEmpty() && arrayList3.size() > 0) {
                activityC11355x7bcfecda.f154085q.setVisibility(8);
                activityC11355x7bcfecda.n7(arrayList3, activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgh, java.lang.Integer.valueOf(arrayList3.size())), activityC11355x7bcfecda.l7(d0Var.f453501t, d0Var.f453502u, d0Var.f453498q, d0Var.f453492h, linkedList));
            } else if (arrayList3.size() > 0 && arrayList2.size() > 0) {
                activityC11355x7bcfecda.f154085q.setVisibility(8);
                java.lang.String string9 = activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgj, java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()));
                arrayList3.addAll(arrayList2);
                activityC11355x7bcfecda.n7(arrayList3, string9, activityC11355x7bcfecda.l7(d0Var.f453501t, d0Var.f453502u, d0Var.f453498q, d0Var.f453492h, linkedList));
            } else if (d0Var.f453492h == 4 && arrayList2.isEmpty()) {
                activityC11355x7bcfecda.f154085q.setVisibility(8);
                activityC11355x7bcfecda.f154086r.setVisibility(8);
                activityC11355x7bcfecda.E.setVisibility(activityC11355x7bcfecda.l7(d0Var.f453501t, d0Var.f453502u, d0Var.f453498q, d0Var.f453492h, linkedList) ? i19 : 8);
            } else {
                activityC11355x7bcfecda.f154085q.setVisibility(8);
                activityC11355x7bcfecda.f154086r.setVisibility(8);
            }
        } else {
            i19 = i18;
            activityC11355x7bcfecda.n7(arrayList2, activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgi, java.lang.Integer.valueOf(arrayList2.size())), activityC11355x7bcfecda.l7(d0Var.f453501t, d0Var.f453502u, d0Var.f453498q, d0Var.f453492h, linkedList));
            activityC11355x7bcfecda.f154085q.setVisibility(8);
        }
        activityC11355x7bcfecda.mo74404x84f07bce(i19, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7(activityC11355x7bcfecda, d0Var));
        if (d0Var.f453501t == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f453493i) && d0Var.f453493i.equals(c01.z1.r())) {
            activityC11355x7bcfecda.F.setVisibility(i19);
            activityC11355x7bcfecda.f154088t.setPadding(i19, i19, i19, com.p314xaae8f345.mm.ui.zk.a(activityC11355x7bcfecda.mo55332x76847179(), 24));
        } else {
            activityC11355x7bcfecda.F.setVisibility(8);
            activityC11355x7bcfecda.f154088t.setPadding(i19, i19, i19, com.p314xaae8f345.mm.ui.zk.a(activityC11355x7bcfecda.mo55332x76847179(), 32));
        }
        if (activityC11355x7bcfecda.F.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "no need to show bottom tv");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.B)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "wording is null");
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(d0Var.B);
            if (d0Var.C == 1) {
                activityC11355x7bcfecda.F.setClickable(true);
                java.lang.String str16 = d0Var.B;
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(activityC11355x7bcfecda.F, str16, 0, str16.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o7(activityC11355x7bcfecda), true), activityC11355x7bcfecda.mo55332x76847179());
            } else {
                activityC11355x7bcfecda.F.setText(spannableStringBuilder);
            }
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh6));
        spannableStringBuilder2.setSpan(new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i7(activityC11355x7bcfecda, d0Var), true), i19, spannableStringBuilder2.length(), 18);
        activityC11355x7bcfecda.E.setText(spannableStringBuilder2);
        activityC11355x7bcfecda.mo48627xce38d9a();
        return null;
    }
}

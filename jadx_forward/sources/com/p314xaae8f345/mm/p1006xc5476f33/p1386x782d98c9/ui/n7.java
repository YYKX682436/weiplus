package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class n7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 f181126e;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134) {
        this.f181126e = activityC13481xc7ac0134;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cvc;
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.widget.TextView textView;
        in5.s0 holder = s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.cqs);
        r45.ab0 ab0Var2 = item.f180992e;
        int i19 = ab0Var2.f451413d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134 = this.f181126e;
        activityC13481xc7ac0134.getClass();
        long j17 = i19;
        long j18 = 1000 * j17;
        if (j18 >= com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g()) {
            d17 = activityC13481xc7ac0134.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        } else if (j18 >= com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g() - 86400000) {
            d17 = activityC13481xc7ac0134.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        } else {
            d17 = k35.m1.d(activityC13481xc7ac0134.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        }
        textView2.setText(d17);
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        r45.hh7 hh7Var = ab0Var2.f451414e;
        int i27 = 0;
        int i28 = hh7Var != null ? hh7Var.f457708e : 0;
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nic)).setText(java.lang.String.valueOf(i28));
        if (i28 >= 10000) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nic)).setTextColor(i65.a.d(activityC13481xc7ac0134, com.p314xaae8f345.mm.R.C30859x5a72f63.f560470ld));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nic)).setTextColor(i65.a.d(activityC13481xc7ac0134, com.p314xaae8f345.mm.R.C30859x5a72f63.f560469lc));
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g)).setText(java.lang.String.valueOf(ab0Var2.f451416g));
        if (ab0Var2.f451418i) {
            ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i1n)).setImageResource(com.p314xaae8f345.mm.R.raw.f78966x490a458b);
        } else {
            ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i1n)).setImageResource(com.p314xaae8f345.mm.R.raw.f78967x143f6f12);
        }
        java.util.LinkedList U6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.U6(activityC13481xc7ac0134, ab0Var2);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.nfo);
        viewGroup2.removeAllViews();
        java.util.Iterator it6 = U6.iterator();
        while (it6.hasNext()) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) it6.next();
            android.content.Context context2 = holder.f374654e;
            android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_5, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564779a34);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.a2m);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a2u);
            if (((linkedList2 == null || linkedList2.isEmpty()) ? 1 : i27) != 0) {
                return;
            }
            java.lang.Object obj = linkedList2.get(i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.ed6 ed6Var = (r45.ed6) obj;
            int i29 = ed6Var.f454868o;
            if (i29 == 0) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("21f9d636b41b25be", ed6Var.f454860d)) {
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jjh);
                    }
                    if (c22699x3dcdb3522 != null) {
                        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80006x708eb752);
                    }
                    if (c22699x3dcdb3522 != null) {
                        c22699x3dcdb3522.setColorFilter(i65.a.d(activityC13481xc7ac0134.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    }
                    java.util.LinkedList<r45.dd6> linkedList3 = ab0Var2.f451419m;
                    if (!(linkedList3 != null && (linkedList3.isEmpty() ^ true))) {
                        java.lang.Integer valueOf2 = linkedList3 != null ? java.lang.Integer.valueOf(linkedList3.size()) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
                        if (valueOf2.intValue() < 3) {
                            ab0Var = ab0Var2;
                            it = it6;
                            c22699x3dcdb352 = c22699x3dcdb3522;
                            viewGroup = viewGroup2;
                            linkedList = linkedList2;
                            context = context2;
                            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(ed6Var.f454860d, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i7(activityC13481xc7ac0134, textView3, c22699x3dcdb352));
                        }
                    }
                    ab0Var = ab0Var2;
                    android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_3, (android.view.ViewGroup) null);
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.nfn);
                    if (linkedList3 != null) {
                        for (r45.dd6 dd6Var : linkedList3) {
                            java.util.Iterator it7 = it6;
                            android.view.ViewGroup viewGroup3 = viewGroup2;
                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_6, (android.view.ViewGroup) null);
                            android.widget.TextView textView4 = linearLayout4 != null ? (android.widget.TextView) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.lpl) : null;
                            android.content.Context context3 = context2;
                            if (textView4 != null) {
                                textView4.setText(dd6Var.f453868m);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.V6(activityC13481xc7ac0134, textView4, 14.0f);
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            java.util.LinkedList linkedList4 = linkedList2;
                            sb6.append((int) dd6Var.f453864f);
                            sb6.append('/');
                            sb6.append((int) dd6Var.f453865g);
                            java.lang.String sb7 = sb6.toString();
                            if (linearLayout4 != null && (textView = (android.widget.TextView) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.lpm)) != null) {
                                textView.setText(sb7);
                                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                                int i37 = dd6Var.f453866h;
                                textView.setTextColor(textView.getContext().getResources().getColor(i37 != 0 ? i37 != 1 ? i37 != 2 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560460l3 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560461l4 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560462l5));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.V6(activityC13481xc7ac0134, textView, 17.0f);
                            }
                            android.widget.TextView textView5 = linearLayout4 != null ? (android.widget.TextView) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.lpy) : null;
                            if (textView5 != null) {
                                textView5.setText(dd6Var.f453869n);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.V6(activityC13481xc7ac0134, textView5, 14.0f);
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
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13455x85da5d17 c13455x85da5d17 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13455x85da5d17) inflate2.findViewById(com.p314xaae8f345.mm.R.id.gsv);
                    if (c13455x85da5d17 != null && linkedList3 != null) {
                        for (r45.dd6 dd6Var2 : linkedList3) {
                            int i38 = dd6Var2.f453866h;
                            java.util.LinkedList linkedList6 = linkedList5;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = c22699x3dcdb3522;
                            int i39 = (int) (360.0f * (dd6Var2.f453864f / dd6Var2.f453865g));
                            if (i38 == 0) {
                                c13455x85da5d17.outDestDegree = i39;
                            } else if (i38 == 1) {
                                c13455x85da5d17.midDestDegree = i39;
                            } else if (i38 != 2) {
                                c13455x85da5d17.innerDestDegree = i39;
                            } else {
                                c13455x85da5d17.innerDestDegree = i39;
                            }
                            linkedList5 = linkedList6;
                            c22699x3dcdb3522 = c22699x3dcdb3523;
                        }
                    }
                    c22699x3dcdb352 = c22699x3dcdb3522;
                    linkedList = linkedList5;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(inflate2);
                    }
                    ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(ed6Var.f454860d, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i7(activityC13481xc7ac0134, textView3, c22699x3dcdb352));
                } else {
                    ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(ed6Var.f454860d, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h7(activityC13481xc7ac0134, textView3, c22699x3dcdb3522));
                    ab0Var = ab0Var2;
                    it = it6;
                    viewGroup = viewGroup2;
                    linkedList = linkedList2;
                    context = context2;
                }
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.l7(ed6Var, activityC13481xc7ac0134));
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
                        textView3.setText(ed6Var.f454861e);
                    }
                    o11.f fVar = new o11.f();
                    fVar.f423610a = true;
                    fVar.f423611b = true;
                    fVar.f423629t = true;
                    n11.a.b().h(ed6Var.f454867n, c22699x3dcdb3522, fVar.a());
                    java.lang.String str = ed6Var.f454866m;
                    if (!(str == null || str.length() == 0)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(ed6Var.f454866m);
                        int optInt = jSONObject.optInt("jump_type");
                        boolean z19 = optInt != 0;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13481xc7ac0134.mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                        ym5.a1.f(new a42.f(textView3, z19 ? i65.a.d(mo55332x76847179, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c) : i65.a.d(mo55332x76847179, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), c22699x3dcdb3522));
                        boolean z27 = z19;
                        linearLayout = linearLayout2;
                        view = inflate;
                        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m7(z27, optInt, jSONObject, ed6Var, activityC13481xc7ac0134));
                    }
                }
                linearLayout = linearLayout2;
                view = inflate;
            }
            for (r45.ed6 ed6Var2 : linkedList) {
                java.lang.String str2 = ed6Var2.f454863g;
                if (!((str2 == null || str2.length() == 0) ? z18 : false)) {
                    android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_6, (android.view.ViewGroup) null);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) inflate3;
                    android.widget.TextView textView6 = (android.widget.TextView) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.lpl);
                    if (textView6 != null) {
                        textView6.setText(ed6Var2.f454863g);
                    }
                    android.widget.TextView textView7 = (android.widget.TextView) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.lpm);
                    if (textView7 != null) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ed6Var2.f454869p)) {
                            valueOf = java.lang.String.valueOf(ed6Var2.f454864h);
                        } else {
                            valueOf = ed6Var2.f454869p;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                        }
                        textView7.setText(valueOf);
                        com.p314xaae8f345.mm.ui.bk.s0(textView7.getPaint());
                    }
                    android.widget.TextView textView8 = (android.widget.TextView) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.lpy);
                    if (textView8 != null) {
                        textView8.setText(ed6Var2.f454865i);
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
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

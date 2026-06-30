package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh f193569d;

    public bh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar) {
        this.f193569d = khVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        android.widget.TextView textView;
        r45.oa4 oa4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.M, "2", null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = this.f193569d;
        int x17 = khVar.x1();
        android.view.ViewGroup viewGroup = khVar.f446856d;
        if (x17 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var.y(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.x(6);
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gh(z2Var);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.and, (android.view.ViewGroup) null);
            android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.l3j) : null;
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dth));
            }
            z2Var.j(inflate);
            z2Var.C();
        } else if (x17 == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var2.y(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var2.x(6);
            z2Var2.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hh(z2Var2);
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ama, (android.view.ViewGroup) null);
            int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            android.widget.TextView textView3 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3i) : null;
            if (textView3 != null) {
                textView3.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eez));
            }
            android.widget.TextView textView4 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3e) : null;
            if (textView4 != null) {
                textView4.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eex));
            }
            android.widget.TextView textView5 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3f) : null;
            if (textView5 != null) {
                textView5.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eey));
            }
            android.widget.TextView textView6 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3c) : null;
            if (textView6 != null) {
                android.text.SpannableString spannableString = new android.text.SpannableString(" •  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eev));
                spannableString.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize), 0, spannableString.length(), 33);
                textView6.setText(spannableString);
            }
            android.widget.TextView textView7 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3d) : null;
            if (textView7 != null) {
                android.text.SpannableString spannableString2 = new android.text.SpannableString(" •  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eew));
                spannableString2.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize), 0, spannableString2.length(), 33);
                textView7.setText(spannableString2);
            }
            android.view.View findViewById = inflate2 != null ? inflate2.findViewById(com.p314xaae8f345.mm.R.id.usq) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = inflate2 != null ? inflate2.findViewById(com.p314xaae8f345.mm.R.id.usp) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById2;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = inflate2 != null ? inflate2.findViewById(com.p314xaae8f345.mm.R.id.uso) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view4 = findViewById3;
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView8 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3b) : null;
            android.widget.TextView textView9 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l3a) : null;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = inflate2 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate2 : null;
            if (c1073x7e08a787 != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
                cVar.d(c1073x7e08a787);
                cVar.f(com.p314xaae8f345.mm.R.id.l3b, 3, com.p314xaae8f345.mm.R.id.l3d, 4, c1073x7e08a787.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
                cVar.b(c1073x7e08a787);
                c1073x7e08a787.m7179xd020a803(null);
            }
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            z2Var2.j(inflate2);
            z2Var2.C();
        } else if (x17 == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var3.y(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var3.x(6);
            z2Var3.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ih(z2Var3);
            android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.and, (android.view.ViewGroup) null);
            android.widget.TextView textView10 = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.l3j) : null;
            if (textView10 != null) {
                textView10.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egd));
            }
            z2Var3.j(inflate3);
            z2Var3.C();
        } else if (x17 == 8) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(viewGroup.getContext(), 0, 0, true, false);
            android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ama, (android.view.ViewGroup) null);
            android.widget.TextView textView11 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3i) : null;
            if (textView11 != null) {
                textView11.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzn));
            }
            android.widget.TextView textView12 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3e) : null;
            if (textView12 != null) {
                textView12.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzl));
            }
            int dimensionPixelSize2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.TextView textView13 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3c) : null;
            if (textView13 != null) {
                android.text.SpannableString spannableString3 = new android.text.SpannableString(" •  ".concat(string));
                spannableString3.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString3.length(), 33);
                textView13.setText(spannableString3);
            }
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
            java.util.LinkedList linkedList = (e1Var == null || (oa4Var = e1Var.f410529z) == null) ? null : oa4Var.I;
            if (linkedList == null || linkedList.isEmpty()) {
                android.widget.TextView textView14 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3h) : null;
                if (textView14 != null) {
                    textView14.setVisibility(0);
                }
                android.widget.TextView textView15 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3f) : null;
                if (textView15 != null) {
                    textView15.setVisibility(0);
                }
                android.widget.TextView textView16 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3d) : null;
                if (textView16 != null) {
                    textView16.setVisibility(0);
                }
                android.widget.TextView textView17 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3f) : null;
                if (textView17 != null) {
                    textView17.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ox7));
                }
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575287ox4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                android.widget.TextView textView18 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3d) : null;
                if (textView18 != null) {
                    android.text.SpannableString spannableString4 = new android.text.SpannableString(" •  ".concat(string2));
                    spannableString4.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString4.length(), 33);
                    textView18.setText(spannableString4);
                }
                android.view.View findViewById4 = inflate4 != null ? inflate4.findViewById(com.p314xaae8f345.mm.R.id.usq) : null;
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    android.view.View view5 = findViewById4;
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = inflate4 != null ? inflate4.findViewById(com.p314xaae8f345.mm.R.id.usp) : null;
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    android.view.View view6 = findViewById5;
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById6 = inflate4 != null ? inflate4.findViewById(com.p314xaae8f345.mm.R.id.uso) : null;
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    android.view.View view7 = findViewById6;
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.TextView textView19 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3h) : null;
                if (textView19 != null) {
                    textView19.setVisibility(0);
                }
                android.widget.TextView textView20 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3f) : null;
                if (textView20 != null) {
                    textView20.setVisibility(0);
                }
                android.widget.TextView textView21 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3d) : null;
                if (textView21 != null) {
                    textView21.setVisibility(0);
                }
                android.widget.TextView textView22 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3f) : null;
                if (textView22 != null) {
                    textView22.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzm));
                }
                java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzk);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ox6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                android.text.SpannableString spannableString5 = new android.text.SpannableString(" •  " + string3 + string4);
                spannableString5.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString5.length(), 33);
                spannableString5.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jh(khVar), spannableString5.length() - string4.length(), spannableString5.length(), 33);
                spannableString5.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c)), spannableString5.length() - string4.length(), spannableString5.length(), 33);
                if (inflate4 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.l3d;
                    textView = (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3d);
                } else {
                    i17 = com.p314xaae8f345.mm.R.id.l3d;
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(spannableString5);
                }
                android.widget.TextView textView23 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(i17) : null;
                if (textView23 != null) {
                    textView23.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
                android.widget.TextView textView24 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.usq) : null;
                if (textView24 != null) {
                    textView24.setVisibility(0);
                }
                android.widget.TextView textView25 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.usp) : null;
                if (textView25 != null) {
                    textView25.setVisibility(0);
                }
                android.widget.TextView textView26 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.uso) : null;
                if (textView26 != null) {
                    textView26.setVisibility(0);
                }
                android.widget.TextView textView27 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.usp) : null;
                if (textView27 != null) {
                    textView27.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ox7));
                }
                java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575287ox4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                android.widget.TextView textView28 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.uso) : null;
                if (textView28 != null) {
                    android.text.SpannableString spannableString6 = new android.text.SpannableString(" •  ".concat(string5));
                    spannableString6.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString6.length(), 33);
                    textView28.setText(spannableString6);
                }
            }
            android.view.View findViewById7 = inflate4 != null ? inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3b) : null;
            if (findViewById7 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                android.view.View view8 = findViewById7;
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById8 = inflate4 != null ? inflate4.findViewById(com.p314xaae8f345.mm.R.id.l3a) : null;
            if (findViewById8 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                android.view.View view9 = findViewById8;
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (inflate4 != null) {
                inflate4.setPadding(inflate4.getPaddingLeft(), inflate4.getPaddingTop(), inflate4.getPaddingRight(), inflate4.getPaddingBottom() + i65.a.h(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br));
            }
            z2Var4.j(inflate4);
            z2Var4.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

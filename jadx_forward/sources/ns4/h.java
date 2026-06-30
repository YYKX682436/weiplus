package ns4;

/* loaded from: classes8.dex */
public final class h implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421067d;

    public h(ns4.s sVar) {
        this.f421067d = sVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        r45.js3 js3Var = (r45.js3) obj;
        ns4.s sVar = this.f421067d;
        if (js3Var == null) {
            sVar.getClass();
        } else {
            android.widget.TextView textView = sVar.f421178j;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerDesc");
                throw null;
            }
            textView.setVisibility(8);
        }
        if (js3Var == null) {
            sVar.getClass();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = sVar.f421171c;
            if (y1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                throw null;
            }
            y1Var.f();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = sVar.f421171c;
            if (y1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                throw null;
            }
            if (!y1Var2.f()) {
                sVar.f421173e.O6(1);
            }
            sVar.c(java.lang.Boolean.FALSE);
            java.util.LinkedList price_infos = js3Var.f459618d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(price_infos, "price_infos");
            java.util.List V0 = kz5.n0.V0(price_infos);
            r45.ha7 ha7Var = js3Var.f459622h;
            if (ha7Var == null || ha7Var.f457524d != 1) {
                ns4.d dVar = sVar.f421176h;
                if (dVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                    throw null;
                }
                dVar.f421023f = false;
            } else {
                java.util.ArrayList arrayList = (java.util.ArrayList) V0;
                if (ha7Var.f457527g < arrayList.size()) {
                    arrayList.remove(js3Var.f459622h.f457527g);
                    ns4.d dVar2 = sVar.f421176h;
                    if (dVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                        throw null;
                    }
                    dVar2.f421023f = true;
                    dVar2.f421024g = js3Var.f459622h.f457526f;
                } else {
                    ns4.d dVar3 = sVar.f421176h;
                    if (dVar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                        throw null;
                    }
                    dVar3.f421023f = false;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = (java.util.ArrayList) V0;
            int size = arrayList4.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 < 3) {
                    arrayList2.add(arrayList4.get(i17));
                } else {
                    arrayList3.add(arrayList4.get(i17));
                }
            }
            ns4.d dVar4 = sVar.f421176h;
            if (dVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                throw null;
            }
            if (dVar4.f421023f) {
                arrayList3.add(new r45.ja7());
            }
            ns4.d dVar5 = sVar.f421175g;
            if (dVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFirstAdapter");
                throw null;
            }
            dVar5.f421021d = arrayList2;
            dVar5.f421025h = new ns4.q(sVar, arrayList2);
            ns4.d dVar6 = sVar.f421176h;
            if (dVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                throw null;
            }
            dVar6.f421021d = arrayList3;
            dVar6.f421025h = new ns4.r(sVar, js3Var, arrayList3);
            dVar5.m8146xced61ae5();
            ns4.d dVar7 = sVar.f421176h;
            if (dVar7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
                throw null;
            }
            dVar7.m8146xced61ae5();
            if (sVar.f421170b.f383084i != null) {
                android.view.View view = sVar.f421177i;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                    throw null;
                }
                if (view.getParent() == null) {
                    android.view.View view2 = sVar.f421177i;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                        throw null;
                    }
                    ns4.v vVar = new ns4.v(view2);
                    sVar.f421172d = vVar;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = sVar.f421171c;
                    if (y1Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                        throw null;
                    }
                    y1Var3.h(vVar);
                }
            } else {
                android.view.View view3 = sVar.f421177i;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                    throw null;
                }
                if (view3.getParent() == null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = sVar.f421171c;
                    if (y1Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                        throw null;
                    }
                    android.view.View view4 = sVar.f421177i;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                        throw null;
                    }
                    y1Var4.k(view4);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var5 = sVar.f421171c;
                if (y1Var5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                    throw null;
                }
                y1Var5.s();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size2 = arrayList4.size();
            for (int i18 = 0; i18 < size2; i18++) {
                r45.ja7 ja7Var = (r45.ja7) arrayList4.get(i18);
                java.lang.Object obj2 = "";
                if (ja7Var == null || (str = ja7Var.f459212d) == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f459213e) : "");
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f459214f) : "");
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f459215g) : "");
                sb6.append("|");
                if (ja7Var != null) {
                    obj2 = java.lang.Boolean.valueOf(ja7Var.f459216h);
                }
                sb6.append(obj2);
                sb6.append(";");
            }
            android.view.View view5 = sVar.f421177i;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            dy1.a.k(view5, kz5.c1.l(new jz5.l("price_info", sb6), new jz5.l("diff_wecoin_count", 0)));
        }
        sVar.getClass();
        if (js3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BuyGoodsBottomDialog", "updateCheckBox: response is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BuyGoodsBottomDialog", "updateCheckBox: " + js3Var.f459620f);
        android.view.View view6 = sVar.f421177i;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view6.findViewById(com.p314xaae8f345.mm.R.id.lma);
        if (js3Var.f459620f == 1) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(js3Var.f459620f);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = sVar.f421169a;
        boolean z17 = sVar.f421174f;
        ms4.h hVar = sVar.f421173e;
        if (valueOf != null) {
            valueOf.intValue();
            hVar.O6(valueOf.intValue() == 0 ? 7 : 6);
            android.view.View view7 = sVar.f421177i;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view7.findViewById(com.p314xaae8f345.mm.R.id.lmb);
            android.view.View view8 = sVar.f421177i;
            if (view8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view8.findViewById(com.p314xaae8f345.mm.R.id.lma);
            if (z17) {
                checkBox.setBackground(activityC1102x9ee2d9f.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563755bb1, null));
            }
            checkBox.setChecked(valueOf.intValue() != 0);
            linearLayout2.setOnClickListener(new ns4.p(checkBox, sVar));
        }
        java.lang.String str2 = js3Var.f459619e;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        android.view.View view9 = sVar.f421177i;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view9.findViewById(com.p314xaae8f345.mm.R.id.lmd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        os4.h.m(textView2, 14);
        if (z17) {
            textView2.setTextColor(activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
        r45.js3 js3Var2 = (r45.js3) hVar.f412565h.mo3195x754a37bb();
        java.lang.String string = js3Var2 != null && js3Var2.f459620f == 1 ? activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oog) : activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string.concat(" "));
        java.lang.String string2 = activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        spannableStringBuilder.append((java.lang.CharSequence) string2);
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new ns4.o(sVar, str2), true), string.length(), spannableStringBuilder.length(), 18);
        textView2.setText(spannableStringBuilder);
        textView2.setClickable(true);
        textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC1102x9ee2d9f));
        textView2.setVisibility(0);
    }
}

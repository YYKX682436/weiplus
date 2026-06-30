package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class ex extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f184843e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184844f;

    /* renamed from: g, reason: collision with root package name */
    public final int f184845g;

    /* renamed from: h, reason: collision with root package name */
    public final int f184846h;

    /* renamed from: i, reason: collision with root package name */
    public final int f184847i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f184848m;

    public ex(android.content.Context context, yz5.l onRevert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRevert, "onRevert");
        this.f184843e = onRevert;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
        this.f184844f = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.f184845g = a17.f278668a - dimensionPixelSize;
        this.f184846h = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
        this.f184847i = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(i65.a.b(context, 15));
        this.f184848m = paint;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eeq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        int i19;
        java.util.Iterator it;
        int i27;
        so2.o6 item = (so2.o6) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.tvp);
        int i28 = 0;
        imageView.setVisibility(0);
        so2.n6 n6Var = item.f492067d;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dx(this, n6Var));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.u9u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) p17;
        linearLayout.removeAllViews();
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String str = n6Var.f492034a;
        java.lang.String str2 = n6Var.f492039f == so2.a.f491775f ? "" : n6Var.f492035b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i29 = this.f184845g;
        android.graphics.Paint paint = this.f184848m;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) n(str, i29, i29, paint, this.f184846h, null);
        int size = arrayList3.size();
        int i37 = this.f184847i;
        int i38 = this.f184844f;
        int i39 = this.f184845g;
        if (size == 2) {
            arrayList.add(arrayList3.get(0));
            arrayList2.add(arrayList3.get(1));
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184540e, "", i37, i38, i38, null));
            arrayList2.add(o(str2, this.f184847i, paint, i39 - (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax) arrayList3.get(1)).f184443d + i38), n6Var));
            i19 = 2;
            z18 = true;
        } else {
            arrayList.add(arrayList3.get(0));
            int i47 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax) arrayList3.get(0)).f184443d + i38;
            if (i47 <= i39) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184540e, "", i37, i38, i38, null));
                int i48 = i39 - i47;
                if (i48 > 0) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) n(str2, i48, this.f184845g, paint, this.f184847i, n6Var);
                    if (arrayList4.size() == 1) {
                        arrayList.add(arrayList4.get(0));
                    } else {
                        arrayList.add(arrayList4.get(0));
                        arrayList2.add(arrayList4.get(1));
                    }
                    z18 = true;
                } else {
                    z18 = true;
                    arrayList2.add(o(str2, this.f184847i, paint, this.f184845g, n6Var));
                }
            } else {
                z18 = true;
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184540e, "", i37, i38, i38, null));
                arrayList2.add(o(str2, this.f184847i, paint, i39 - i38, n6Var));
            }
            i19 = 2;
        }
        java.util.List[] listArr = new java.util.List[i19];
        listArr[0] = arrayList;
        listArr[z18 ? 1 : 0] = arrayList2;
        java.util.Iterator it6 = kz5.c0.i(listArr).iterator();
        while (it6.hasNext()) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax> list2 = (java.util.List) it6.next();
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
            linearLayout2.setOrientation(i28);
            linearLayout2.setGravity(16);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            if (linearLayout.getChildCount() > 0) {
                layoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
            }
            linearLayout2.setLayoutParams(layoutParams);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax axVar : list2) {
                int ordinal = axVar.f184440a.ordinal();
                int i49 = axVar.f184443d;
                int i57 = axVar.f184442c;
                if (ordinal == 0) {
                    android.widget.TextView textView = new android.widget.TextView(context);
                    textView.setText(axVar.f184441b);
                    textView.setTextSize(15.0f);
                    textView.setTextColor(i57);
                    textView.setMaxLines(z18 ? 1 : 0);
                    textView.setSingleLine(z18);
                    textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    textView.setMaxWidth(java.lang.Math.min(i49, axVar.f184444e));
                    so2.n6 n6Var2 = axVar.f184445f;
                    if (n6Var2 != null) {
                        java.lang.String str3 = axVar.f184441b;
                        if (n6Var2.f492040g == so2.m.f492009e) {
                            android.content.Context context2 = textView.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                            android.text.SpannableString spannableString = new android.text.SpannableString(str3);
                            it = it6;
                            i27 = 0;
                            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str3, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cx(context2, n6Var2)), 0, str3.length(), 17);
                            textView.setText(spannableString);
                            com.p314xaae8f345.mm.ui.fk.c(textView);
                            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(textView.getContext()));
                        } else {
                            it = it6;
                            i27 = i28;
                            textView.setText(str3);
                            com.p314xaae8f345.mm.ui.fk.a(textView);
                            textView.setOnTouchListener(null);
                        }
                    } else {
                        it = it6;
                        i27 = i28;
                    }
                    linearLayout2.addView(textView);
                    it6 = it;
                    i28 = i27;
                    z18 = true;
                } else if (ordinal == z18) {
                    int i58 = i49 - (dimensionPixelSize * 2);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79608x748495f3);
                    c22699x3dcdb352.setRotation(270.0f);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i58, i58);
                    layoutParams2.leftMargin = dimensionPixelSize;
                    layoutParams2.rightMargin = dimensionPixelSize;
                    c22699x3dcdb352.setLayoutParams(layoutParams2);
                    c22699x3dcdb352.m82040x7541828(i57);
                    linearLayout2.addView(c22699x3dcdb352);
                }
            }
            linearLayout.addView(linearLayout2);
            z18 = true;
        }
    }

    public final java.util.List n(java.lang.String str, int i17, int i18, android.graphics.Paint paint, int i19, so2.n6 n6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = str.length();
        float f17 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < length; i28++) {
            f17 += paint.measureText(java.lang.String.valueOf(str.charAt(i28)));
            if (f17 > i17) {
                break;
            }
            i27++;
        }
        if (i27 <= 0 || i27 >= str.length()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184539d, str, i19, (int) paint.measureText(str), i17, n6Var));
        } else {
            java.lang.String substring = str.substring(0, i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String substring2 = str.substring(i27, str.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            int measureText = (int) paint.measureText(substring);
            int measureText2 = (int) paint.measureText(substring2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx bxVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184539d;
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(bxVar, substring, i19, measureText, i17, n6Var));
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(bxVar, substring2, i19, measureText2, i18, n6Var));
        }
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax o(java.lang.String str, int i17, android.graphics.Paint paint, int i18, so2.n6 n6Var) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx.f184539d, str, i17, (int) paint.measureText(str), i18, n6Var);
    }
}

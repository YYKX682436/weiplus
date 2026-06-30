package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class ex extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f103310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103311f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103312g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103313h;

    /* renamed from: i, reason: collision with root package name */
    public final int f103314i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f103315m;

    public ex(android.content.Context context, yz5.l onRevert) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onRevert, "onRevert");
        this.f103310e = onRevert;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479660bx);
        this.f103311f = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        this.f103312g = a17.f197135a - dimensionPixelSize;
        this.f103313h = b3.l.getColor(context, com.tencent.mm.R.color.FG_1);
        this.f103314i = b3.l.getColor(context, com.tencent.mm.R.color.FG_0);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(i65.a.b(context, 15));
        this.f103315m = paint;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eeq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        int i19;
        java.util.Iterator it;
        int i27;
        so2.o6 item = (so2.o6) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.tvp);
        int i28 = 0;
        imageView.setVisibility(0);
        so2.n6 n6Var = item.f410534d;
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.dx(this, n6Var));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.u9u);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) p17;
        linearLayout.removeAllViews();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str = n6Var.f410501a;
        java.lang.String str2 = n6Var.f410506f == so2.a.f410242f ? "" : n6Var.f410502b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i29 = this.f103312g;
        android.graphics.Paint paint = this.f103315m;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) n(str, i29, i29, paint, this.f103313h, null);
        int size = arrayList3.size();
        int i37 = this.f103314i;
        int i38 = this.f103311f;
        int i39 = this.f103312g;
        if (size == 2) {
            arrayList.add(arrayList3.get(0));
            arrayList2.add(arrayList3.get(1));
            arrayList2.add(new com.tencent.mm.plugin.finder.convert.ax(com.tencent.mm.plugin.finder.convert.bx.f103007e, "", i37, i38, i38, null));
            arrayList2.add(o(str2, this.f103314i, paint, i39 - (((com.tencent.mm.plugin.finder.convert.ax) arrayList3.get(1)).f102910d + i38), n6Var));
            i19 = 2;
            z18 = true;
        } else {
            arrayList.add(arrayList3.get(0));
            int i47 = ((com.tencent.mm.plugin.finder.convert.ax) arrayList3.get(0)).f102910d + i38;
            if (i47 <= i39) {
                arrayList.add(new com.tencent.mm.plugin.finder.convert.ax(com.tencent.mm.plugin.finder.convert.bx.f103007e, "", i37, i38, i38, null));
                int i48 = i39 - i47;
                if (i48 > 0) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) n(str2, i48, this.f103312g, paint, this.f103314i, n6Var);
                    if (arrayList4.size() == 1) {
                        arrayList.add(arrayList4.get(0));
                    } else {
                        arrayList.add(arrayList4.get(0));
                        arrayList2.add(arrayList4.get(1));
                    }
                    z18 = true;
                } else {
                    z18 = true;
                    arrayList2.add(o(str2, this.f103314i, paint, this.f103312g, n6Var));
                }
            } else {
                z18 = true;
                arrayList2.add(new com.tencent.mm.plugin.finder.convert.ax(com.tencent.mm.plugin.finder.convert.bx.f103007e, "", i37, i38, i38, null));
                arrayList2.add(o(str2, this.f103314i, paint, i39 - i38, n6Var));
            }
            i19 = 2;
        }
        java.util.List[] listArr = new java.util.List[i19];
        listArr[0] = arrayList;
        listArr[z18 ? 1 : 0] = arrayList2;
        java.util.Iterator it6 = kz5.c0.i(listArr).iterator();
        while (it6.hasNext()) {
            java.util.List<com.tencent.mm.plugin.finder.convert.ax> list2 = (java.util.List) it6.next();
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
            linearLayout2.setOrientation(i28);
            linearLayout2.setGravity(16);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            if (linearLayout.getChildCount() > 0) {
                layoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj);
            }
            linearLayout2.setLayoutParams(layoutParams);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
            for (com.tencent.mm.plugin.finder.convert.ax axVar : list2) {
                int ordinal = axVar.f102907a.ordinal();
                int i49 = axVar.f102910d;
                int i57 = axVar.f102909c;
                if (ordinal == 0) {
                    android.widget.TextView textView = new android.widget.TextView(context);
                    textView.setText(axVar.f102908b);
                    textView.setTextSize(15.0f);
                    textView.setTextColor(i57);
                    textView.setMaxLines(z18 ? 1 : 0);
                    textView.setSingleLine(z18);
                    textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    textView.setMaxWidth(java.lang.Math.min(i49, axVar.f102911e));
                    so2.n6 n6Var2 = axVar.f102912f;
                    if (n6Var2 != null) {
                        java.lang.String str3 = axVar.f102908b;
                        if (n6Var2.f410507g == so2.m.f410476e) {
                            android.content.Context context2 = textView.getContext();
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            android.text.SpannableString spannableString = new android.text.SpannableString(str3);
                            it = it6;
                            i27 = 0;
                            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(str3, context2.getResources().getColor(com.tencent.mm.R.color.Link_100), context2.getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.convert.cx(context2, n6Var2)), 0, str3.length(), 17);
                            textView.setText(spannableString);
                            com.tencent.mm.ui.fk.c(textView);
                            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(textView.getContext()));
                        } else {
                            it = it6;
                            i27 = i28;
                            textView.setText(str3);
                            com.tencent.mm.ui.fk.a(textView);
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
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_arrow_down_line_regular);
                    weImageView.setRotation(270.0f);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i58, i58);
                    layoutParams2.leftMargin = dimensionPixelSize;
                    layoutParams2.rightMargin = dimensionPixelSize;
                    weImageView.setLayoutParams(layoutParams2);
                    weImageView.setIconColor(i57);
                    linearLayout2.addView(weImageView);
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
            arrayList.add(new com.tencent.mm.plugin.finder.convert.ax(com.tencent.mm.plugin.finder.convert.bx.f103006d, str, i19, (int) paint.measureText(str), i17, n6Var));
        } else {
            java.lang.String substring = str.substring(0, i27);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String substring2 = str.substring(i27, str.length());
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            int measureText = (int) paint.measureText(substring);
            int measureText2 = (int) paint.measureText(substring2);
            com.tencent.mm.plugin.finder.convert.bx bxVar = com.tencent.mm.plugin.finder.convert.bx.f103006d;
            arrayList.add(new com.tencent.mm.plugin.finder.convert.ax(bxVar, substring, i19, measureText, i17, n6Var));
            arrayList.add(new com.tencent.mm.plugin.finder.convert.ax(bxVar, substring2, i19, measureText2, i18, n6Var));
        }
        return arrayList;
    }

    public final com.tencent.mm.plugin.finder.convert.ax o(java.lang.String str, int i17, android.graphics.Paint paint, int i18, so2.n6 n6Var) {
        return new com.tencent.mm.plugin.finder.convert.ax(com.tencent.mm.plugin.finder.convert.bx.f103006d, str, i17, (int) paint.measureText(str), i18, n6Var);
    }
}

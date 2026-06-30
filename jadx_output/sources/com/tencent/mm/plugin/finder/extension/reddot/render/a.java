package com.tencent.mm.plugin.finder.extension.reddot.render;

/* loaded from: classes8.dex */
public final class a extends oc2.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f105831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, android.content.Context context) {
        super(renderView, context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f105831f = renderView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0a57, code lost:
    
        r7 = r0;
        r11 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0cb7  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence k(com.tencent.mm.plugin.finder.extension.reddot.render.a r57, android.widget.TextView r58, oc2.l0 r59, oc2.y0 r60, android.util.ArrayMap r61, java.util.LinkedHashSet r62, int r63, java.lang.Object r64) {
        /*
            Method dump skipped, instructions count: 3430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.render.a.k(com.tencent.mm.plugin.finder.extension.reddot.render.a, android.widget.TextView, oc2.l0, oc2.y0, android.util.ArrayMap, java.util.LinkedHashSet, int, java.lang.Object):java.lang.CharSequence");
    }

    public static final float l(jz5.g gVar) {
        return ((java.lang.Number) gVar.getValue()).floatValue();
    }

    public static final android.text.SpannableString m(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, int i17, int i18, java.util.LinkedList linkedList, int i19, float f17) {
        boolean z17;
        boolean z18;
        android.graphics.RectF rectF;
        android.graphics.Canvas canvas;
        android.graphics.Bitmap bitmap;
        float measureText;
        boolean z19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append(((oc2.f0) it.next()).f344174g);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        boolean z27 = com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.H;
        renderView.getClass();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(i19);
        java.util.Iterator it6 = linkedList.iterator();
        float f18 = 0.0f;
        while (true) {
            z17 = false;
            if (!it6.hasNext()) {
                break;
            }
            oc2.f0 f0Var = (oc2.f0) it6.next();
            int i27 = f0Var.f344168a;
            float f19 = f0Var.f344172e;
            if (i27 == 1) {
                renderView.g(textPaint, f0Var.f344173f);
                textPaint.setTextSize(f19);
                float floatValue = valueOf2.floatValue() + (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) + valueOf2.floatValue();
                if (f18 < floatValue) {
                    f18 = floatValue;
                }
            } else if (i27 == 2) {
                float floatValue2 = f19 + valueOf2.floatValue();
                if (f18 < floatValue2) {
                    f18 = floatValue2;
                }
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z19 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z19 = false;
            }
            if (z19 || z65.c.a()) {
                z17 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(renderView.h(), "Debug createGlobalCapsuleSpan maxHeight style=" + f0Var.f344168a + " height=" + f18);
            }
        }
        if (f18 == 0.0f) {
            f18 = renderView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479694ct);
        }
        java.util.Iterator it7 = linkedList.iterator();
        float f27 = 0.0f;
        while (it7.hasNext()) {
            oc2.f0 f0Var2 = (oc2.f0) it7.next();
            textPaint.setTextSize(f0Var2.f344172e);
            java.lang.Object obj = f0Var2.f344170c;
            if (obj instanceof java.lang.CharSequence) {
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                measureText = textPaint.measureText(charSequence, 0, charSequence.length());
            } else if (obj instanceof android.graphics.drawable.Drawable) {
                measureText = ((android.graphics.drawable.Drawable) obj).getBounds().width();
            }
            f27 += measureText;
        }
        float floatValue3 = valueOf.floatValue() + f27 + valueOf.floatValue();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf((int) f18));
        arrayList.add(java.lang.Integer.valueOf((int) floatValue3));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/extension/reddot/render/RenderView", "createGlobalCapsuleSpan", "(Ljava/util/LinkedList;IFLkotlin/Pair;)Lcom/tencent/mm/ui/widget/FixImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/extension/reddot/render/RenderView", "createGlobalCapsuleSpan", "(Ljava/util/LinkedList;IFLkotlin/Pair;)Lcom/tencent/mm/ui/widget/FixImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 2.0f, floatValue3, f18 - 2.0f);
        if (!(f17 == 0.5f)) {
            f18 = renderView.f105812g;
        }
        canvas2.drawRoundRect(rectF2, f18, f18, textPaint);
        float intValue = valueOf.intValue();
        int i28 = 0;
        for (java.lang.Object obj3 : linkedList) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            oc2.f0 f0Var3 = (oc2.f0) obj3;
            textPaint.setColor(f0Var3.f344171d);
            textPaint.setTextSize(f0Var3.f344172e);
            renderView.g(textPaint, f0Var3.f344173f);
            java.lang.Object obj4 = f0Var3.f344170c;
            if (obj4 instanceof java.lang.CharSequence) {
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj4;
                rectF = rectF2;
                canvas = canvas2;
                bitmap = createBitmap;
                canvas2.drawText(charSequence2, 0, charSequence2.length(), intValue, rectF2.centerY() + (((textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) / 2) - textPaint.getFontMetrics().bottom), textPaint);
                intValue += textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                rectF = rectF2;
                canvas = canvas2;
                bitmap = createBitmap;
                if (obj4 instanceof android.graphics.drawable.Drawable) {
                    android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj4;
                    float width = drawable.getBounds().width() + intValue;
                    float f28 = 2;
                    float height = ((rectF.height() - drawable.getBounds().height()) / f28) + f28;
                    drawable.setBounds(new android.graphics.Rect((int) intValue, (int) height, (int) width, (int) (height + drawable.getBounds().height())));
                    drawable.draw(canvas);
                    intValue = width;
                }
            }
            canvas2 = canvas;
            i28 = i29;
            rectF2 = rectF;
            createBitmap = bitmap;
        }
        android.graphics.RectF rectF3 = rectF2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(renderView.getResources(), createBitmap);
        bitmapDrawable.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z18 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z18 = false;
        }
        if (z18 || z65.c.a()) {
            z17 = true;
        } else {
            kb2.b bVar2 = kb2.b.f306225a;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(renderView.h(), "Debug createGlobalCapsuleSpan width=" + ((int) rectF3.width()) + " height=" + ((int) rectF3.height()));
        }
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString(" " + ((java.lang.Object) sb6));
        spannableString.setSpan(wVar, 1, sb6.length() + 1, 33);
        return spannableString;
    }

    public final boolean i(android.widget.TextView textView, android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableString spannableString, int i17) {
        float f17;
        int i18;
        com.tencent.mm.plugin.finder.extension.reddot.render.a aVar;
        boolean z17 = true;
        if (spannableString.length() == 0) {
            return false;
        }
        android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(spannableStringBuilder).append((java.lang.CharSequence) spannableString);
        float desiredWidth = android.text.Layout.getDesiredWidth(append, textView.getPaint());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(append);
        sb6.append(" maxWidth=" + i17 + ",desiredWidth=" + desiredWidth + ';');
        float f18 = (float) i17;
        if (desiredWidth <= f18) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((java.lang.CharSequence) append);
            aVar = this;
            z17 = false;
        } else {
            int length = append.length();
            float[] fArr = new float[length];
            textView.getPaint().getTextWidths(append, 0, append.length(), fArr);
            double d17 = 0.0d;
            int i19 = 0;
            while (i19 < length) {
                d17 += fArr[i19];
                i19++;
                desiredWidth = desiredWidth;
            }
            float f19 = desiredWidth;
            float measureText = textView.getPaint().measureText(java.lang.String.valueOf((char) 8230));
            int length2 = append.length();
            int length3 = append.length() - 1;
            while (true) {
                if (-1 >= length3) {
                    f17 = measureText;
                    i18 = length;
                    break;
                }
                i18 = length;
                d17 -= fArr[length3];
                f17 = measureText;
                if (measureText + d17 < i17) {
                    z17 = true;
                    length2 = length3 + 1;
                    break;
                }
                z17 = true;
                length3--;
                length = i18;
                measureText = f17;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ellWidth=");
            sb7.append(f17);
            sb7.append(",charWidthArray=");
            int i27 = i18;
            java.util.ArrayList arrayList = new java.util.ArrayList(i27);
            for (int i28 = 0; i28 < i27; i28++) {
                arrayList.add(java.lang.Float.valueOf(fArr[i28]));
            }
            sb7.append(arrayList);
            sb7.append(",calContentWidth=");
            sb7.append(d17);
            sb7.append(",endIndex=");
            sb7.append(length2);
            sb7.append(';');
            sb6.append(sb7.toString());
            spannableStringBuilder.clear();
            spannableStringBuilder.append((java.lang.CharSequence) append);
            float f27 = f19;
            while (f27 > f18) {
                if (length2 <= 0 || length2 > append.length()) {
                    sb6.append("endIndex=" + length2 + " invalid;");
                    break;
                }
                spannableStringBuilder.clear();
                spannableStringBuilder.append(append.subSequence(0, length2));
                if ((spannableStringBuilder.length() > 0 ? z17 : false) && r26.p0.D0(spannableStringBuilder) != 8230) {
                    spannableStringBuilder.append((char) 8230);
                }
                float desiredWidth2 = android.text.Layout.getDesiredWidth(spannableStringBuilder, textView.getPaint());
                sb6.append("str[0," + length2 + ")=" + ((java.lang.Object) spannableStringBuilder) + ",desiredWidth=" + desiredWidth2 + ';');
                length2 += -1;
                f27 = desiredWidth2;
            }
            aVar = this;
        }
        com.tencent.mars.xlog.Log.i(aVar.f105831f.h(), "calContent " + ((java.lang.Object) sb6) + " overWidth=" + z17);
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0439 A[LOOP:1: B:47:0x03d8->B:71:0x0439, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0448  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(oc2.l0 r34, oc2.y0 r35) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.render.a.j(oc2.l0, oc2.y0):int");
    }

    public final boolean n(java.lang.Integer num, int i17, android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableString spannableString, int i18, android.widget.TextView textView, oc2.y yVar, java.util.LinkedHashSet linkedHashSet) {
        float desiredWidth;
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "DSL红点节点指定展示行功能开关", e42.c0.clicfg_finder_red_dot_dsl_expected_line_switch, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.bg0.f126529d, 8, null)).booleanValue();
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f105831f;
        if (!booleanValue || i18 <= 0 || i17 < 0 || r26.n0.B(spannableString, "\n", false)) {
            com.tencent.mars.xlog.Log.i(renderView.h(), "hitExp: " + booleanValue + ", currentExpectedLine: " + i17 + ", maxWidth: " + i18);
            return false;
        }
        android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textView.getPaint(), i18).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        int lineCount = build.getLineCount();
        if (i17 != 0 && lineCount > i17) {
            com.tencent.mars.xlog.Log.i(renderView.h(), "lineCount is greater than valid ExpectedLine, currentExpectedLine: " + i17 + ", layout lineCount: " + lineCount);
            return false;
        }
        float lineWidth = build.getLineWidth(lineCount - 1);
        if (lineCount < i17) {
            if (linkedHashSet != null) {
                linkedHashSet.add(java.lang.Integer.valueOf(spannableStringBuilder.length()));
            }
            spannableStringBuilder.append("\n").append((java.lang.CharSequence) spannableString);
            com.tencent.mars.xlog.Log.i(renderView.h(), "line count is less than valid ExpectedLine, currentExpectedLine: " + i17 + ", layout lineCount: " + lineCount);
            return true;
        }
        float[] a17 = yVar.a(spannableString);
        if (a17 != null) {
            desiredWidth = 0.0f;
            for (float f17 : a17) {
                desiredWidth += f17;
            }
        } else {
            desiredWidth = android.text.Layout.getDesiredWidth(spannableString, textView.getPaint());
        }
        float f18 = i18;
        if (desiredWidth + lineWidth <= f18) {
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            com.tencent.mars.xlog.Log.i(renderView.h(), "current line can hold spannableString, currentExpectedLine: " + i17 + ", layout lineCount: " + lineCount);
            return true;
        }
        if (a17 == null || i17 != 0 || num == null || num.intValue() == 0 || num.intValue() != lineCount) {
            com.tencent.mars.xlog.Log.i(renderView.h(), "current line can't hold spannableString, currentExpectedLine: " + i17 + ", layout lineCount: " + lineCount);
            return false;
        }
        float f19 = f18 - lineWidth;
        if (linkedHashSet != null) {
            linkedHashSet.add(java.lang.Integer.valueOf(spannableStringBuilder.length()));
        }
        spannableStringBuilder.append("\n").append((java.lang.CharSequence) spannableString);
        com.tencent.mars.xlog.Log.i(renderView.h(), "manually break line, availableWidth: " + f19 + ", lastExpectedLine: " + num + ", currentExpectedLine: 0, layout lineCount: " + lineCount);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    public final boolean o(android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableString spannableString, oc2.l0 l0Var, android.widget.TextView textView) {
        boolean z17;
        int i17;
        ?? arrayList;
        boolean z18;
        android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(spannableStringBuilder).append((java.lang.CharSequence) spannableString);
        int length = append.length();
        float[] fArr = new float[length];
        textView.getPaint().getTextWidths(append, 0, append.length(), fArr);
        double d17 = 0.0d;
        double d18 = 0.0d;
        for (int i18 = 0; i18 < length; i18++) {
            d18 += fArr[i18];
        }
        if (l0Var.f344221c <= d18) {
            if (append.length() > 0) {
                float measureText = textView.getPaint().measureText("…");
                int i19 = l0Var.f344221c;
                double d19 = d18 - i19;
                int length2 = append.length() - 1;
                while (true) {
                    if (-1 >= length2) {
                        i17 = i19;
                        length2 = 0;
                        break;
                    }
                    i17 = i19;
                    d19 -= fArr[length2];
                    if (d19 >= d17 || java.lang.Math.abs(d19) < measureText) {
                        length2--;
                        i19 = i17;
                        d17 = 0.0d;
                    } else if (length2 > 1) {
                        length2--;
                    }
                }
                if (length2 <= 0 || l0Var.f344223e) {
                    z17 = false;
                    spannableStringBuilder.clear();
                    spannableStringBuilder.append(append);
                    return z17;
                }
                int i27 = length2 + 1;
                if (!(i27 >= 0)) {
                    throw new java.lang.IllegalArgumentException(("Requested element count " + i27 + " is less than zero.").toString());
                }
                if (i27 == 0) {
                    arrayList = kz5.p0.f313996d;
                } else if (i27 >= length) {
                    arrayList = kz5.z.w0(fArr);
                } else if (i27 == 1) {
                    arrayList = kz5.b0.c(java.lang.Float.valueOf(fArr[0]));
                } else {
                    arrayList = new java.util.ArrayList(i27);
                    int i28 = 0;
                    for (int i29 = 0; i29 < length; i29++) {
                        arrayList.add(java.lang.Float.valueOf(fArr[i29]));
                        z18 = true;
                        i28++;
                        if (i28 == i27) {
                            break;
                        }
                    }
                }
                z18 = true;
                float H0 = kz5.n0.H0(arrayList);
                spannableStringBuilder.clear();
                spannableStringBuilder.append(append.subSequence(0, i27));
                if ((spannableStringBuilder.length() > 0 ? z18 : false) && r26.p0.D0(spannableStringBuilder) != 8230) {
                    spannableStringBuilder.append((char) 8230);
                    H0 += measureText;
                }
                java.lang.String h17 = this.f105831f.h();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("end=");
                sb6.append(length2);
                sb6.append(" totalTxtWidth=");
                sb6.append(d18);
                sb6.append(" maxTxtWidth=");
                sb6.append(i17);
                sb6.append(" displayWidth=");
                sb6.append(H0);
                sb6.append(" paint textSize=");
                sb6.append(textView.getPaint().getTextSize());
                sb6.append(",ellWidth=");
                sb6.append(measureText);
                sb6.append(", width=");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(length);
                for (int i37 = 0; i37 < length; i37++) {
                    arrayList2.add(java.lang.Float.valueOf(fArr[i37]));
                }
                sb6.append(arrayList2);
                com.tencent.mars.xlog.Log.i(h17, sb6.toString());
                return z18;
            }
        }
        z17 = false;
        spannableStringBuilder.clear();
        spannableStringBuilder.append(append);
        return z17;
    }

    public final void p(android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableString spannableString, oc2.l0 l0Var, android.widget.TextView textView, java.lang.Integer num) {
        if (!this.f105831f.f105818p) {
            if (textView.getPaint().measureText(spannableStringBuilder, 0, spannableStringBuilder.length()) / l0Var.f344221c > 1.0f || r26.n0.L(spannableStringBuilder, "\n", 0, false, 6, null) >= 0) {
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                return;
            } else {
                spannableStringBuilder.append("\n").append((java.lang.CharSequence) spannableString);
                return;
            }
        }
        if (num != null && num.intValue() == 0) {
            if (textView.getPaint().measureText(spannableStringBuilder, 0, spannableStringBuilder.length()) / l0Var.f344221c > 1.0f || r26.n0.L(spannableStringBuilder, "\n", 0, false, 6, null) >= 0) {
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                return;
            } else {
                spannableStringBuilder.append("\n").append((java.lang.CharSequence) spannableString);
                return;
            }
        }
        if (num == null || num.intValue() != 1) {
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        } else if (r26.n0.L(spannableStringBuilder, "\n", 0, false, 6, null) < 0) {
            spannableStringBuilder.append("\n").append((java.lang.CharSequence) spannableString);
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0aed, code lost:
    
        if (r2 < r8) goto L454;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a74 A[LOOP:4: B:271:0x0a49->B:281:0x0a74, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a84 A[EDGE_INSN: B:282:0x0a84->B:283:0x0a84 BREAK  A[LOOP:4: B:271:0x0a49->B:281:0x0a74], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b18 A[EDGE_INSN: B:305:0x0b18->B:306:0x0b18 BREAK  A[LOOP:3: B:253:0x0a17->B:262:0x0b01], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(oc2.l0 r33, oc2.y0 r34) {
        /*
            Method dump skipped, instructions count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.render.a.q(oc2.l0, oc2.y0):void");
    }
}

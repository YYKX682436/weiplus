package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class c5 {
    public c5(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        java.lang.String input;
        java.lang.String str2;
        ((qv.w) ((rv.x2) i95.n0.c(rv.x2.class))).getClass();
        int i27 = com.tencent.mm.storage.c2.f193803a;
        if (str == null) {
            return str;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        kotlin.jvm.internal.o.f(a17, "domainString(...)");
        boolean z17 = false;
        if (!r26.n0.B(str, a17, false) && i18 < 0 && i17 < 0 && i19 <= 0) {
            return str;
        }
        int L = r26.n0.L(str, "#", 0, false, 6, null);
        if (L > 0) {
            input = str.substring(0, L);
            kotlin.jvm.internal.o.f(input, "substring(...)");
            str2 = str.substring(L);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        } else {
            input = str;
            str2 = "";
        }
        if (!r26.n0.B(str, "?", false)) {
            input = input.concat("?");
            z17 = true;
        }
        if (i17 >= 0) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(scene=[\\d]*)");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            input = replaceAll + "&scene=" + i17;
        }
        if (i18 >= 0) {
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(subscene=[\\d]*)");
            kotlin.jvm.internal.o.f(compile2, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll2 = compile2.matcher(input).replaceAll("");
            kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
            input = replaceAll2 + "&subscene=" + i18;
        }
        if (i27 > 0) {
            input = input + "&sessionid=" + i27;
        }
        if (i19 > 0) {
            input = (input + "&clicktime=" + i19) + "&enterid=" + i19;
        }
        java.lang.String str3 = input;
        if (z17) {
            str3 = r26.i0.v(str3, "?&", "?", false, 4, null);
        }
        return str3 + str2;
    }

    public final com.tencent.mm.plugin.finder.feed.ui.sq b(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        android.view.View inflate;
        r45.dm2 object_extend;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        r45.dm2 object_extend2 = item.getFeedObject().getFeedObject().getObject_extend();
        if ((object_extend2 == null || (cl2Var2 = (r45.cl2) object_extend2.getCustom(4)) == null) ? false : cl2Var2.getBoolean(9)) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "getAdsTagSpan ignoreAdsTag true");
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = item.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        boolean z17 = (feedObject == null || (object_extend = feedObject.getObject_extend()) == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null || !cl2Var.getBoolean(10)) ? false : true;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "getAdsTagSpan showTag true");
        }
        if (!hc2.o0.E(item.getFeedObject().getFeedObject(), false, 1, null) && !z17) {
            return null;
        }
        if (com.tencent.mm.plugin.finder.convert.q6.f104337x == null && (inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488801ah1, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            com.tencent.mm.plugin.finder.convert.q6.f104337x = createBitmap;
            android.graphics.Bitmap bitmap = com.tencent.mm.plugin.finder.convert.q6.f104337x;
            kotlin.jvm.internal.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = com.tencent.mm.plugin.finder.convert.q6.f104337x;
        if (bitmap2 != null) {
            return new com.tencent.mm.plugin.finder.feed.ui.sq(context, bitmap2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l c(android.content.Context r26, com.tencent.mm.plugin.finder.model.BaseFinderFeed r27, com.tencent.mm.ui.widget.MMNeat7extView r28, int r29, float r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.c5.c(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float, boolean):jz5.l");
    }

    public final java.lang.String d(r45.xl2 activityEvent, android.content.Context context) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(activityEvent, "activityEvent");
        kotlin.jvm.internal.o.g(context, "context");
        boolean c17 = hc2.a0.c(activityEvent.getLong(5));
        if (com.tencent.mm.sdk.platformtools.t8.K0(activityEvent.getString(1))) {
            string = context.getString(com.tencent.mm.R.string.cjn);
        } else {
            r45.h21 h21Var = (r45.h21) activityEvent.getCustom(4);
            if ((h21Var != null ? h21Var.getString(0) : null) == null) {
                string = (!c17 || com.tencent.mm.sdk.platformtools.t8.K0(activityEvent.getString(2))) ? context.getString(com.tencent.mm.R.string.cjp) : context.getString(com.tencent.mm.R.string.ciu, activityEvent.getString(2), "");
            } else if (!c17 || com.tencent.mm.sdk.platformtools.t8.K0(activityEvent.getString(2))) {
                r45.h21 h21Var2 = (r45.h21) activityEvent.getCustom(4);
                if (h21Var2 == null || (string = h21Var2.getString(0)) == null) {
                    string = "";
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                r45.h21 h21Var3 = (r45.h21) activityEvent.getCustom(4);
                sb6.append(h21Var3 != null ? h21Var3.getString(0) : null);
                sb6.append(context.getString(com.tencent.mm.R.string.cid, activityEvent.getString(2), ""));
                string = sb6.toString();
            }
        }
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final android.text.SpannableString e(ks5.a layout, int i17, android.text.SpannableString spannableString, int i18, boolean z17) {
        boolean z18;
        android.text.SpannableString spannableString2;
        kotlin.jvm.internal.o.g(layout, "layout");
        int length = spannableString != null ? spannableString.length() : 0;
        boolean z19 = true;
        if (i18 < length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(spannableString != null ? spannableString.subSequence(0, i18).toString() : null);
            sb6.append((char) 8230);
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", sb6.toString());
            z18 = true;
        } else {
            z18 = false;
        }
        int min = java.lang.Math.min(length, i18);
        if (z17) {
            int i19 = i17 - 1;
            int b17 = layout.b(i19) + layout.j(i19);
            if (b17 > 0) {
                min = java.lang.Math.min(b17, min);
                if (z19 || spannableString == null) {
                    spannableString2 = new android.text.SpannableString("");
                } else {
                    java.lang.CharSequence subSequence = spannableString.subSequence(0, min);
                    kotlin.jvm.internal.o.e(subSequence, "null cannot be cast to non-null type android.text.SpannableString");
                    spannableString2 = (android.text.SpannableString) subSequence;
                }
                return new android.text.SpannableString(new android.text.SpannableStringBuilder(spannableString2).append(com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.ctd)));
            }
        }
        z19 = z18;
        if (z19) {
        }
        spannableString2 = new android.text.SpannableString("");
        return new android.text.SpannableString(new android.text.SpannableStringBuilder(spannableString2).append(com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.ctd)));
    }

    public final jz5.l f(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, com.tencent.mm.ui.widget.MMNeat7extView measureTv, int i17, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(measureTv, "measureTv");
        int integer = item.getFeedObject().getExtReading().getInteger(3);
        int i18 = 0;
        java.lang.String string = item.getFeedObject().getExtReading().getString(0);
        if (string == null || string.length() == 0) {
            string = null;
        }
        java.lang.String string2 = item.getFeedObject().getExtReading().getString(1);
        java.lang.String str = string2 == null || string2.length() == 0 ? null : string2;
        if (string == null || str == null) {
            return new jz5.l(-1, null);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.ra).getValue()).r()).booleanValue()) {
            com.tencent.mm.plugin.finder.convert.c5 c5Var = com.tencent.mm.plugin.finder.convert.q6.f104325i;
            if (r26.n0.B(string, "mp.weixin.qq.com/s", false)) {
                return new jz5.l(-1, null);
            }
        }
        java.lang.String str2 = "  " + ((java.lang.Object) android.text.TextUtils.ellipsize(str, measureTv.getPaint(), f17, android.text.TextUtils.TruncateAt.END));
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        com.tencent.mm.plugin.finder.convert.c5 c5Var2 = com.tencent.mm.plugin.finder.convert.q6.f104325i;
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, integer != 1 ? com.tencent.mm.R.raw.icons_filled_link : com.tencent.mm.R.raw.icons_filled_red_envelope_big, (c5Var2.k() || item.getIsPreview()) ? com.tencent.mm.plugin.finder.convert.q6.f104332s : integer == 1 ? com.tencent.mm.plugin.finder.convert.q6.f104335v : com.tencent.mm.plugin.finder.convert.q6.f104336w);
        int i19 = com.tencent.mm.plugin.finder.convert.q6.f104330q;
        e17.setBounds(0, 0, (int) (((i19 * 1.0f) * e17.getIntrinsicWidth()) / e17.getIntrinsicHeight()), i19);
        int i27 = (c5Var2.k() || item.getIsPreview()) ? com.tencent.mm.plugin.finder.convert.q6.f104332s : i17;
        spannableString.setSpan(new al5.w(e17, 1), 0, 1, 17);
        com.tencent.mm.plugin.finder.view.yl ylVar = new com.tencent.mm.plugin.finder.view.yl(str, i27, com.tencent.mm.plugin.finder.convert.q6.f104331r, false, false, new com.tencent.mm.plugin.finder.convert.a5(context, item, string), 16, null);
        ylVar.f133407i = com.tencent.mm.plugin.finder.convert.q6.f104327n;
        spannableString.setSpan(ylVar, 1, str2.length(), 17);
        if (integer != 0) {
            if (integer != 1) {
                if (integer == 2) {
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                    if (finderDescPanelUIC != null) {
                        finderDescPanelUIC.d7(item.getItemId(), 512);
                    }
                }
                i18 = -1;
            } else {
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                if (finderDescPanelUIC2 != null) {
                    finderDescPanelUIC2.d7(item.getItemId(), 16);
                }
                i18 = 1;
            }
        } else if (r26.n0.B(string, "mp.weixin.qq.com/s", false)) {
            pf5.z zVar3 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC3 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar3.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
            if (finderDescPanelUIC3 != null) {
                finderDescPanelUIC3.d7(item.getItemId(), 1);
            }
        } else {
            pf5.z zVar4 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC4 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar4.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
            if (finderDescPanelUIC4 != null) {
                finderDescPanelUIC4.d7(item.getItemId(), 4);
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i18), spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l g(android.content.Context r22, com.tencent.mm.plugin.finder.model.BaseFinderFeed r23, com.tencent.mm.ui.widget.MMNeat7extView r24, int r25, float r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.c5.g(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float):jz5.l");
    }

    public final com.tencent.mm.plugin.finder.feed.ui.sq h(android.content.Context context) {
        android.view.View inflate;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Zb;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 1) {
            return null;
        }
        if (com.tencent.mm.plugin.finder.convert.q6.f104338y == null && (inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.azf, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getShowAllCommentTagSpan", "(Landroid/content/Context;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getShowAllCommentTagSpan", "(Landroid/content/Context;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            com.tencent.mm.plugin.finder.convert.q6.f104338y = createBitmap;
            android.graphics.Bitmap bitmap = com.tencent.mm.plugin.finder.convert.q6.f104338y;
            kotlin.jvm.internal.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = com.tencent.mm.plugin.finder.convert.q6.f104338y;
        if (bitmap2 != null) {
            return new com.tencent.mm.plugin.finder.feed.ui.sq(context, bitmap2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jz5.l i(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        java.lang.Object[] objArr = ((object_extend != null ? object_extend.getLong(30) : 0L) & 512) == 512;
        if (!z17 && item.getFeedObject().getCreateTime() > 0) {
            if ((item.getFeedObject().getFeedObject().getObjectType() == 1) != false && i17 != 1 && i17 != 120 && objArr == false) {
                android.text.SpannableString spannableString = new android.text.SpannableString(com.tencent.mm.plugin.finder.assist.w2.k(context, item.getFeedObject().getCreateTime() * 1000));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479251u3)), 0, spannableString.length(), 17);
                return new jz5.l(java.lang.Integer.valueOf(z17 ? 1 : 0), spannableString);
            }
        }
        return new jz5.l(-1, null);
    }

    public final boolean j() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J5).getValue()).r()).intValue() == 1;
    }

    public final boolean k() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return true;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        return ls2Var != null && ls2Var.getInteger(0) == 1;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class c5 {
    public c5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        java.lang.String input;
        java.lang.String str2;
        ((qv.w) ((rv.x2) i95.n0.c(rv.x2.class))).getClass();
        int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        if (str == null) {
            return str;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "domainString(...)");
        boolean z17 = false;
        if (!r26.n0.B(str, a17, false) && i18 < 0 && i17 < 0 && i19 <= 0) {
            return str;
        }
        int L = r26.n0.L(str, "#", 0, false, 6, null);
        if (L > 0) {
            input = str.substring(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(input, "substring(...)");
            str2 = str.substring(L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            input = replaceAll + "&scene=" + i17;
        }
        if (i18 >= 0) {
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(subscene=[\\d]*)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            java.lang.String replaceAll2 = compile2.matcher(input).replaceAll("");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
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

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        android.view.View inflate;
        r45.dm2 m76806xdef68064;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.dm2 m76806xdef680642 = item.getFeedObject().getFeedObject().m76806xdef68064();
        if ((m76806xdef680642 == null || (cl2Var2 = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) == null) ? false : cl2Var2.m75933x41a8a7f2(9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "getAdsTagSpan ignoreAdsTag true");
            return null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = item.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f361869a;
        boolean z17 = (feedObject == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null || !cl2Var.m75933x41a8a7f2(10)) ? false : true;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "getAdsTagSpan showTag true");
        }
        if (!hc2.o0.E(item.getFeedObject().getFeedObject(), false, 1, null) && !z17) {
            return null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185870x == null && (inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570334ah1, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185870x = createBitmap;
            android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185870x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185870x;
        if (bitmap2 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, bitmap2);
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
    public final jz5.l c(android.content.Context r26, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r27, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 r28, int r29, float r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5.c(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float, boolean):jz5.l");
    }

    public final java.lang.String d(r45.xl2 activityEvent, android.content.Context context) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityEvent, "activityEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean c17 = hc2.a0.c(activityEvent.m75942xfb822ef2(5));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityEvent.m75945x2fec8307(1))) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjn);
        } else {
            r45.h21 h21Var = (r45.h21) activityEvent.m75936x14adae67(4);
            if ((h21Var != null ? h21Var.m75945x2fec8307(0) : null) == null) {
                string = (!c17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityEvent.m75945x2fec8307(2))) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjp) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ciu, activityEvent.m75945x2fec8307(2), "");
            } else if (!c17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityEvent.m75945x2fec8307(2))) {
                r45.h21 h21Var2 = (r45.h21) activityEvent.m75936x14adae67(4);
                if (h21Var2 == null || (string = h21Var2.m75945x2fec8307(0)) == null) {
                    string = "";
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                r45.h21 h21Var3 = (r45.h21) activityEvent.m75936x14adae67(4);
                sb6.append(h21Var3 != null ? h21Var3.m75945x2fec8307(0) : null);
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cid, activityEvent.m75945x2fec8307(2), ""));
                string = sb6.toString();
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public final android.text.SpannableString e(ks5.a layout, int i17, android.text.SpannableString spannableString, int i18, boolean z17) {
        boolean z18;
        android.text.SpannableString spannableString2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        int length = spannableString != null ? spannableString.length() : 0;
        boolean z19 = true;
        if (i18 < length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(spannableString != null ? spannableString.subSequence(0, i18).toString() : null);
            sb6.append((char) 8230);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", sb6.toString());
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
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(subSequence, "null cannot be cast to non-null type android.text.SpannableString");
                    spannableString2 = (android.text.SpannableString) subSequence;
                }
                return new android.text.SpannableString(new android.text.SpannableStringBuilder(spannableString2).append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.ctd)));
            }
        }
        z19 = z18;
        if (z19) {
        }
        spannableString2 = new android.text.SpannableString("");
        return new android.text.SpannableString(new android.text.SpannableStringBuilder(spannableString2).append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.ctd)));
    }

    public final jz5.l f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 measureTv, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measureTv, "measureTv");
        int m75939xb282bd08 = item.getFeedObject().m59234x84f51d21().m75939xb282bd08(3);
        int i18 = 0;
        java.lang.String m75945x2fec8307 = item.getFeedObject().m59234x84f51d21().m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            m75945x2fec8307 = null;
        }
        java.lang.String m75945x2fec83072 = item.getFeedObject().m59234x84f51d21().m75945x2fec8307(1);
        java.lang.String str = m75945x2fec83072 == null || m75945x2fec83072.length() == 0 ? null : m75945x2fec83072;
        if (m75945x2fec8307 == null || str == null) {
            return new jz5.l(-1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.ra).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185858i;
            if (r26.n0.B(m75945x2fec8307, "mp.weixin.qq.com/s", false)) {
                return new jz5.l(-1, null);
            }
        }
        java.lang.String str2 = "  " + ((java.lang.Object) android.text.TextUtils.ellipsize(str, measureTv.m84162x74f59ea8(), f17, android.text.TextUtils.TruncateAt.END));
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5 c5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185858i;
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, m75939xb282bd08 != 1 ? com.p314xaae8f345.mm.R.raw.f79775xc850a312 : com.p314xaae8f345.mm.R.raw.f79883x87bc4817, (c5Var2.k() || item.getIsPreview()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185865s : m75939xb282bd08 == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185868v : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185869w);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185863q;
        e17.setBounds(0, 0, (int) (((i19 * 1.0f) * e17.getIntrinsicWidth()) / e17.getIntrinsicHeight()), i19);
        int i27 = (c5Var2.k() || item.getIsPreview()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185865s : i17;
        spannableString.setSpan(new al5.w(e17, 1), 0, 1, 17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl ylVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str, i27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185864r, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a5(context, item, m75945x2fec8307), 16, null);
        ylVar.f214940i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185860n;
        spannableString.setSpan(ylVar, 1, str2.length(), 17);
        if (m75939xb282bd08 != 0) {
            if (m75939xb282bd08 != 1) {
                if (m75939xb282bd08 == 2) {
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
                    if (c15447x4ebc90c2 != null) {
                        c15447x4ebc90c2.d7(item.mo2128x1ed62e84(), 512);
                    }
                }
                i18 = -1;
            } else {
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c22 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
                if (c15447x4ebc90c22 != null) {
                    c15447x4ebc90c22.d7(item.mo2128x1ed62e84(), 16);
                }
                i18 = 1;
            }
        } else if (r26.n0.B(m75945x2fec8307, "mp.weixin.qq.com/s", false)) {
            pf5.z zVar3 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c23 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
            if (c15447x4ebc90c23 != null) {
                c15447x4ebc90c23.d7(item.mo2128x1ed62e84(), 1);
            }
        } else {
            pf5.z zVar4 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c24 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
            if (c15447x4ebc90c24 != null) {
                c15447x4ebc90c24.d7(item.mo2128x1ed62e84(), 4);
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
    public final jz5.l g(android.content.Context r22, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r23, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 r24, int r25, float r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5.g(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float):jz5.l");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq h(android.content.Context context) {
        android.view.View inflate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Zb;
        ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).l();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != 1) {
            return null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185871y == null && (inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azf, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getShowAllCommentTagSpan", "(Landroid/content/Context;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$Companion", "getShowAllCommentTagSpan", "(Landroid/content/Context;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185871y = createBitmap;
            android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185871y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185871y;
        if (bitmap2 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, bitmap2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jz5.l i(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        r45.dm2 m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064();
        java.lang.Object[] objArr = ((m76806xdef68064 != null ? m76806xdef68064.m75942xfb822ef2(30) : 0L) & 512) == 512;
        if (!z17 && item.getFeedObject().m59220x3fdd41df() > 0) {
            if ((item.getFeedObject().getFeedObject().m76805x2dd7a70f() == 1) != false && i17 != 1 && i17 != 120 && objArr == false) {
                android.text.SpannableString spannableString = new android.text.SpannableString(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(context, item.getFeedObject().m59220x3fdd41df() * 1000));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560784u3)), 0, spannableString.length(), 17);
                return new jz5.l(java.lang.Integer.valueOf(z17 ? 1 : 0), spannableString);
            }
        }
        return new jz5.l(-1, null);
    }

    public final boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J5).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final boolean k() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return true;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
        return ls2Var != null && ls2Var.m75939xb282bd08(0) == 1;
    }
}

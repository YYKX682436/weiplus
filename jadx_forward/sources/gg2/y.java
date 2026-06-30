package gg2;

/* loaded from: classes2.dex */
public final class y extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f353258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f353258b = "MicroMsg.LiveExpTwentySevenItem";
    }

    @Override // gg2.b
    public java.lang.Object a(android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        view.setOnClickListener(new gg2.x(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.f565787t94);
        if (c22624x85d69039 == null) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String l17 = l();
        int n17 = n();
        android.content.Context context = c22624x85d69039.getContext();
        boolean z18 = false;
        if ((l17.length() == 0) && n17 == 0) {
            c22624x85d69039.setVisibility(8);
        } else {
            boolean z19 = l17.length() == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191635a;
            tc2.g gVar = this.f353197a;
            if (z19 && h2Var.b(context, gVar.f498681h) == null) {
                c22624x85d69039.setVisibility(8);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f353258b, "initHighlightSummaryView, showType: " + n17 + ", content: " + r26.p0.E0(l17, 50));
                if (n17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b17 = h2Var.b(context, gVar.f498681h);
                    r45.iw1 m17 = m();
                    if (m17 == null) {
                        z17 = false;
                    } else {
                        java.lang.String m75945x2fec8307 = m17.m75945x2fec8307(0);
                        z17 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
                    }
                    if (z17) {
                        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.orz);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        l17 = string.concat(l17);
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(l17);
                    if (b17 != null) {
                        spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                        spannableStringBuilder.setSpan(b17, 0, 1, 17);
                    }
                    c22624x85d69039.b(new android.text.SpannableString(spannableStringBuilder));
                    c22624x85d69039.setVisibility(0);
                } else {
                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575253os0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq sqVar = null;
                    if (!(string2 == null || string2.length() == 0)) {
                        android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191638d;
                        if (bitmap == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLivingTag", "getTalkingTagSpan create bitmap, text: " + string2);
                            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_c, (android.view.ViewGroup) null);
                            if (inflate != null) {
                                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nxa);
                                if (textView != null) {
                                    textView.setText(string2);
                                }
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
                                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getTalkingTagSpan", "(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getTalkingTagSpan", "(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191638d = createBitmap;
                                if (createBitmap != null) {
                                    inflate.draw(new android.graphics.Canvas(createBitmap));
                                    sqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, createBitmap);
                                }
                            }
                        } else {
                            sqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, bitmap);
                        }
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(l17);
                    if (sqVar != null) {
                        spannableStringBuilder2.insert(0, (java.lang.CharSequence) " ");
                        spannableStringBuilder2.setSpan(sqVar, 0, 1, 17);
                    }
                    c22624x85d69039.b(new android.text.SpannableString(spannableStringBuilder2));
                    c22624x85d69039.setVisibility(0);
                }
                z18 = true;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }

    @Override // gg2.b
    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_g;
    }

    @Override // gg2.b
    public int e() {
        return 5;
    }

    @Override // gg2.b
    public java.lang.String f() {
        r45.iw1 m17 = m();
        java.lang.String m75945x2fec8307 = m17 != null ? m17.m75945x2fec8307(0) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // gg2.b
    public int g() {
        return 27;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f353258b;
    }

    @Override // gg2.b
    public boolean j(gg2.b other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof gg2.y) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l(), ((gg2.y) other).l());
        }
        return false;
    }

    public final java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        android.text.SpannableString descriptionSpan;
        java.lang.String spannableString;
        r45.iw1 m17 = m();
        java.lang.String m75945x2fec8307 = m17 != null ? m17.m75945x2fec8307(0) : null;
        boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        java.lang.String str = "";
        java.lang.String str2 = this.f353258b;
        if (!z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
            long m75939xb282bd08 = m17.m75939xb282bd08(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("display highlight summary, content: ");
            java.lang.String m75945x2fec83072 = m17.m75945x2fec8307(0);
            sb6.append(m75945x2fec83072 != null ? r26.p0.E0(m75945x2fec83072, 50) : null);
            sb6.append(", createTime: ");
            sb6.append(m75939xb282bd08);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            java.lang.String m75945x2fec83073 = m17.m75945x2fec8307(0);
            return m75945x2fec83073 == null ? "" : m75945x2fec83073;
        }
        if (n() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "no highlight summary and no fallback");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f353197a.f498681h;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null && (spannableString = descriptionSpan.toString()) != null) {
            str = spannableString;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "no highlight summary, fallback to description: ".concat(r26.p0.E0(str, 50)));
        return str;
    }

    public final r45.iw1 m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f353197a.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) {
            return null;
        }
        return (r45.iw1) m59258xd0557130.m75936x14adae67(81);
    }

    public final int n() {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.wg6 wg6Var;
        r45.kr0 h17 = h();
        if (h17 == null || (m75941xfb821914 = h17.m75941xfb821914(12)) == null) {
            return 0;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.kz3) obj).m75939xb282bd08(0) == 27) {
                break;
            }
        }
        r45.kz3 kz3Var = (r45.kz3) obj;
        if (kz3Var == null || (wg6Var = (r45.wg6) kz3Var.m75936x14adae67(18)) == null) {
            return 0;
        }
        return wg6Var.m75939xb282bd08(1);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.th2 f185775f;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, android.view.View view, r45.th2 th2Var) {
        this.f185773d = q6Var;
        this.f185774e = view;
        this.f185775f = th2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        android.view.View decorView;
        java.lang.String m75945x2fec8307;
        android.widget.ImageView imageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$showFeedRecordTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185774e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f185773d.getClass();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7e, (android.view.ViewGroup) null, false);
        y9.i iVar = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        iVar.setContentView(inflate);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = true;
        boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z18) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        layoutParams.height = (int) (i17 * kx2.a.f394811a.a(context));
        inflate.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tey);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tew);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n6(iVar));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.tex);
        if (linearLayout != null) {
            linearLayout.addView(new android.view.View(linearLayout.getContext()), new android.widget.LinearLayout.LayoutParams(-1, linearLayout.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7)));
            r45.cr0 cr0Var = (r45.cr0) this.f185775f.m75936x14adae67(0);
            if (cr0Var != null) {
                java.util.LinkedList m75941xfb821914 = cr0Var.m75941xfb821914(6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShort_title(...)");
                r45.cw2 cw2Var = (r45.cw2) kz5.n0.Z(m75941xfb821914);
                java.lang.String m75945x2fec83072 = cw2Var != null ? cw2Var.m75945x2fec8307(0) : null;
                java.lang.String str2 = "";
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                boolean z19 = m75945x2fec83072.length() > 0;
                android.content.Context context2 = linearLayout.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7d, (android.view.ViewGroup) null, false);
                java.lang.String m75945x2fec83073 = cr0Var.m75945x2fec8307(1);
                if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0) && (imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tek)) != null) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    zy2.v8.b(ya2.l.f542035a, cr0Var.m75945x2fec8307(1) + cr0Var.m75945x2fec8307(2), imageView, null, 4, null);
                }
                java.lang.String m75945x2fec83074 = cr0Var.m75945x2fec8307(9);
                if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0)) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tep);
                    if (imageView2 != null) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        zy2.v8.b(ya2.l.f542035a, cr0Var.m75945x2fec8307(9) + cr0Var.m75945x2fec8307(10), imageView2, null, 4, null);
                    }
                    android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tep);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.teq);
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById4 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tej);
                    if (findViewById4 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById5 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tem);
                    if (findViewById5 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ten);
                if (textView2 != null) {
                    java.lang.String m75945x2fec83075 = cr0Var.m75945x2fec8307(0);
                    if (m75945x2fec83075 == null) {
                        m75945x2fec83075 = "";
                    }
                    textView2.setText(m75945x2fec83075);
                }
                java.util.LinkedList m75941xfb8219142 = cr0Var.m75941xfb821914(6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getShort_title(...)");
                r45.cw2 cw2Var2 = (r45.cw2) kz5.n0.Z(m75941xfb8219142);
                if (cw2Var2 != null && (m75945x2fec8307 = cw2Var2.m75945x2fec8307(0)) != null) {
                    str2 = m75945x2fec8307;
                }
                if (z19) {
                    if (str2.length() > 0) {
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ter);
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            textView3.setText(str2);
                        }
                        android.view.View findViewById6 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f566042tf0);
                        if (findViewById6 != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                            arrayList6.add(0);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                java.lang.String m75945x2fec83076 = cr0Var.m75945x2fec8307(12);
                if (m75945x2fec83076 != null && m75945x2fec83076.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.teo);
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        textView4.setText(cr0Var.m75945x2fec8307(12));
                    }
                    android.view.View findViewById7 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tez);
                    if (findViewById7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.TextView textView5 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tes);
                if (textView5 != null) {
                    textView5.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(context2, cr0Var.m75939xb282bd08(7) * 1000));
                }
                linearLayout.addView(inflate2, 0);
            }
        }
        java.lang.Object parent = inflate.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
        }
        android.view.Window window2 = iVar.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayr);
        }
        iVar.setOnShowListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o6(A));
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$showFeedRecordTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

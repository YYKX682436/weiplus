package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.th2 f104242f;

    public p6(com.tencent.mm.plugin.finder.convert.q6 q6Var, android.view.View view, r45.th2 th2Var) {
        this.f104240d = q6Var;
        this.f104241e = view;
        this.f104242f = th2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        android.view.View decorView;
        java.lang.String string;
        android.widget.ImageView imageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$showFeedRecordTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f104241e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f104240d.getClass();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e7e, (android.view.ViewGroup) null, false);
        y9.i iVar = new y9.i(context, com.tencent.mm.R.style.f30do);
        iVar.setContentView(inflate);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = true;
        boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z18) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        layoutParams.height = (int) (i17 * kx2.a.f313278a.a(context));
        inflate.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tey);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tew);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.convert.n6(iVar));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.tex);
        if (linearLayout != null) {
            linearLayout.addView(new android.view.View(linearLayout.getContext()), new android.widget.LinearLayout.LayoutParams(-1, linearLayout.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7)));
            r45.cr0 cr0Var = (r45.cr0) this.f104242f.getCustom(0);
            if (cr0Var != null) {
                java.util.LinkedList list = cr0Var.getList(6);
                kotlin.jvm.internal.o.f(list, "getShort_title(...)");
                r45.cw2 cw2Var = (r45.cw2) kz5.n0.Z(list);
                java.lang.String string2 = cw2Var != null ? cw2Var.getString(0) : null;
                java.lang.String str2 = "";
                if (string2 == null) {
                    string2 = "";
                }
                boolean z19 = string2.length() > 0;
                android.content.Context context2 = linearLayout.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.e7d, (android.view.ViewGroup) null, false);
                java.lang.String string3 = cr0Var.getString(1);
                if (!(string3 == null || string3.length() == 0) && (imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.tek)) != null) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    zy2.v8.b(ya2.l.f460502a, cr0Var.getString(1) + cr0Var.getString(2), imageView, null, 4, null);
                }
                java.lang.String string4 = cr0Var.getString(9);
                if (!(string4 == null || string4.length() == 0)) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.tep);
                    if (imageView2 != null) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        zy2.v8.b(ya2.l.f460502a, cr0Var.getString(9) + cr0Var.getString(10), imageView2, null, 4, null);
                    }
                    android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.tep);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.teq);
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById4 = inflate2.findViewById(com.tencent.mm.R.id.tej);
                    if (findViewById4 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById5 = inflate2.findViewById(com.tencent.mm.R.id.tem);
                    if (findViewById5 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ten);
                if (textView2 != null) {
                    java.lang.String string5 = cr0Var.getString(0);
                    if (string5 == null) {
                        string5 = "";
                    }
                    textView2.setText(string5);
                }
                java.util.LinkedList list2 = cr0Var.getList(6);
                kotlin.jvm.internal.o.f(list2, "getShort_title(...)");
                r45.cw2 cw2Var2 = (r45.cw2) kz5.n0.Z(list2);
                if (cw2Var2 != null && (string = cw2Var2.getString(0)) != null) {
                    str2 = string;
                }
                if (z19) {
                    if (str2.length() > 0) {
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ter);
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            textView3.setText(str2);
                        }
                        android.view.View findViewById6 = inflate2.findViewById(com.tencent.mm.R.id.f484509tf0);
                        if (findViewById6 != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                            arrayList6.add(0);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                java.lang.String string6 = cr0Var.getString(12);
                if (string6 != null && string6.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.teo);
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        textView4.setText(cr0Var.getString(12));
                    }
                    android.view.View findViewById7 = inflate2.findViewById(com.tencent.mm.R.id.tez);
                    if (findViewById7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "getFeedRecordContentView", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FeedRecord;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.TextView textView5 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.tes);
                if (textView5 != null) {
                    textView5.setText(com.tencent.mm.plugin.finder.assist.w2.k(context2, cr0Var.getInteger(7) * 1000));
                }
                linearLayout.addView(inflate2, 0);
            }
        }
        java.lang.Object parent = inflate.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
        }
        android.view.Window window2 = iVar.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setBackgroundResource(com.tencent.mm.R.drawable.ayr);
        }
        iVar.setOnShowListener(new com.tencent.mm.plugin.finder.convert.o6(A));
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$showFeedRecordTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

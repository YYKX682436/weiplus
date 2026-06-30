package dn2;

/* loaded from: classes3.dex */
public final class z implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323527a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323528b;

    /* renamed from: c, reason: collision with root package name */
    public int f323529c;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        ?? r142;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323527a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323528b = (android.widget.TextView) findViewById2;
        jz5.g b17 = jz5.h.b(new dn2.y(rootView));
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565048b23);
        android.widget.TextView textView = this.f323528b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view = this.f323527a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        java.lang.Object D = liveMsg.D();
        r45.xi1 xi1Var = D instanceof r45.xi1 ? (r45.xi1) D : null;
        if (xi1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew_View", "like bullet msg: " + pm0.b0.g(xi1Var));
            java.util.LinkedList m75941xfb821914 = xi1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMerged_msg_list(...)");
            int i17 = 0;
            int i18 = 0;
            for (java.lang.Object obj : m75941xfb821914) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((r45.w64) obj).m75939xb282bd08(0) == this.f323529c) {
                    i17 = i19;
                }
                i18 = i19;
            }
            r45.w64 w64Var = (r45.w64) xi1Var.m75936x14adae67(0);
            this.f323529c = w64Var != null ? w64Var.m75939xb282bd08(0) : 0;
            r45.w64 w64Var2 = i17 >= 0 && i17 < xi1Var.m75941xfb821914(1).size() ? (r45.w64) xi1Var.m75941xfb821914(1).get(i17) : (r45.w64) xi1Var.m75936x14adae67(0);
            if (w64Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew_View", "like bullet chosen msg: " + pm0.b0.g(w64Var2));
                java.util.LinkedList m75941xfb8219142 = w64Var2.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getUser_info_list(...)");
                r45.x64 x64Var = (r45.x64) kz5.n0.Z(m75941xfb8219142);
                if (x64Var == null || (str = x64Var.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                java.lang.String str3 = str;
                dk2.ef efVar = dk2.ef.f314905a;
                gk2.e eVar = dk2.ef.I;
                if (eVar != null ? zl2.r4.f555483a.y1(eVar) : false) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    str2 = str3;
                    z17 = false;
                    yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    jz5.n nVar = (jz5.n) b17;
                    for (android.widget.ImageView imageView : (android.widget.ImageView[]) nVar.mo141623x754a37bb()) {
                        imageView.setVisibility(8);
                    }
                    r142 = 1;
                    java.util.LinkedList m75941xfb8219143 = w64Var2.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getUser_info_list(...)");
                    int i27 = 0;
                    for (java.lang.Object obj2 : kz5.n0.L0(m75941xfb8219143, 3)) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.x64 x64Var2 = (r45.x64) obj2;
                        android.widget.ImageView imageView2 = ((android.widget.ImageView[]) nVar.mo141623x754a37bb())[i27];
                        imageView2.setVisibility(0);
                        int m75939xb282bd08 = x64Var2.m75939xb282bd08(2);
                        pf5.u uVar = pf5.u.f435469a;
                        jz5.l lVar = m75939xb282bd08 == 3 ? new jz5.l(new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).K).mo141623x754a37bb()), mn2.f1.f411490h) : new jz5.l(new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).L).mo141623x754a37bb()), mn2.f1.f411494o);
                        ((vo0.d) lVar.f384366d).c(new mn2.n(x64Var2.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), imageView2, mn2.g1.f411508a.h((mn2.f1) lVar.f384367e));
                        i27 = i28;
                    }
                } else {
                    str2 = str3;
                    z17 = false;
                    r142 = 1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.lang.String c17 = zl2.r4.f555483a.c1(str2, 6, r142);
                if (w64Var2.m75939xb282bd08(2) > r142) {
                    android.widget.TextView textView2 = this.f323528b;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                        throw null;
                    }
                    android.view.View view2 = this.f323527a;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                        throw null;
                    }
                    textView2.setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573123dm1, c17, java.lang.Integer.valueOf(w64Var2.m75939xb282bd08(2))));
                    cn2.l.f125101a.c(r142, r142);
                } else {
                    android.widget.TextView textView3 = this.f323528b;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                        throw null;
                    }
                    android.view.View view3 = this.f323527a;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                        throw null;
                    }
                    textView3.setText(view3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573124dm2, c17));
                    cn2.l.f125101a.c(r142, z17);
                }
            }
        }
        return rootView;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dex;
    }
}

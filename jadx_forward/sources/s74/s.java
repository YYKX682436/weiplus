package s74;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f486064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f486068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.MarginLayoutParams f486069i;

    public s(s74.o0 o0Var, android.view.View view, s74.f3 f3Var, android.view.View view2, android.widget.FrameLayout frameLayout, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f486064d = o0Var;
        this.f486065e = view;
        this.f486066f = f3Var;
        this.f486067g = view2;
        this.f486068h = frameLayout;
        this.f486069i = marginLayoutParams;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$measureAbsolute$1$2$1");
        s74.o0 o0Var = this.f486064d;
        java.lang.String j17 = o0Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLayoutChange pa = ");
        s74.q4 q4Var = s74.q4.f486046a;
        android.view.View view2 = this.f486065e;
        org.json.JSONObject g17 = q4Var.g(view2);
        s74.f3 f3Var = this.f486066f;
        sb6.append(g17 != null ? f3Var.l(g17) : null);
        sb6.append(" cd = ");
        android.view.View view3 = this.f486067g;
        org.json.JSONObject g18 = q4Var.g(view3);
        sb6.append(g18 != null ? f3Var.l(g18) : null);
        sb6.append("  ");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(i18);
        sb6.append(' ');
        sb6.append(i19);
        sb6.append(' ');
        sb6.append(i27);
        sb6.append("   ");
        sb6.append(i28);
        sb6.append(' ');
        sb6.append(i29);
        sb6.append(' ');
        sb6.append(i37);
        sb6.append(' ');
        sb6.append(i38);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2.getParent() instanceof android.view.View) {
            android.widget.FrameLayout frameLayout = this.f486068h;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view2, frameLayout) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view2.getParent(), frameLayout)) {
                frameLayout.getLocationInWindow(iArr);
                java.lang.Object parent = view2.getParent();
                android.view.View view4 = parent instanceof android.view.View ? (android.view.View) parent : null;
                if (view4 != null) {
                    view4.getLocationInWindow(iArr2);
                }
            }
        }
        android.view.View view5 = this.f486067g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$measureAbsolute$1$2$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$measureAbsolute$1$2$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.FrameLayout.LayoutParams(0, 0);
        }
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.Integer valueOf = java.lang.Integer.valueOf(layoutParams2.leftMargin);
        int i39 = (iArr2[0] - iArr[0]) + i17;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = this.f486069i;
        lVarArr[0] = new jz5.l(valueOf, java.lang.Integer.valueOf(i39 + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0)));
        lVarArr[1] = new jz5.l(java.lang.Integer.valueOf(layoutParams2.topMargin), java.lang.Integer.valueOf((iArr2[1] - iArr[1]) + i18 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0)));
        lVarArr[2] = new jz5.l(java.lang.Integer.valueOf(layoutParams2.rightMargin), java.lang.Integer.valueOf(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0));
        lVarArr[3] = new jz5.l(java.lang.Integer.valueOf(layoutParams2.bottomMargin), java.lang.Integer.valueOf(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
        int i47 = i19 - i17;
        lVarArr[4] = new jz5.l(java.lang.Integer.valueOf(layoutParams2.width), java.lang.Integer.valueOf(i47));
        int i48 = i27 - i18;
        lVarArr[5] = new jz5.l(java.lang.Integer.valueOf(layoutParams2.height), java.lang.Integer.valueOf(i48));
        java.util.Iterator it = kz5.c0.k(lVarArr).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            jz5.l lVar = (jz5.l) obj;
            if (((java.lang.Number) lVar.f384366d).intValue() != ((java.lang.Number) lVar.f384367e).intValue()) {
                break;
            }
        }
        if (obj != null) {
            layoutParams2.leftMargin = (iArr2[0] - iArr[0]) + i17 + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            layoutParams2.topMargin = (iArr2[1] - iArr[1]) + i18 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            layoutParams2.rightMargin = marginLayoutParams != null ? marginLayoutParams.rightMargin : 0;
            layoutParams2.bottomMargin = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            layoutParams2.width = i47;
            layoutParams2.height = i48;
            view3.setLayoutParams(layoutParams2);
            p3325xe03a0797.p3326xc267989b.y0 h17 = o0Var.h();
            if (h17 != null) {
                p3325xe03a0797.p3326xc267989b.l.d(h17, null, null, new s74.r(view3, null), 3, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$measureAbsolute$1$2$1");
    }
}

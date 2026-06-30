package yr3;

/* loaded from: classes11.dex */
public final class s0 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f546548f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f546549g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f546550h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f546551i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.view.View inputItemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(inputItemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputItemView, "inputItemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546548f = inputItemView;
        this.f546549g = "LargeLiveViewHolder";
        this.f546550h = inputItemView.getContext();
        this.f546551i = inputItemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        android.view.View view;
        r45.u5 u5Var;
        yr3.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.o5 o5Var = dataModel.f546267b;
        r45.u5 u5Var2 = o5Var.P;
        java.lang.String str = this.f546549g;
        if (u5Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "detailInfo.finder_live == null");
            return;
        }
        wr3.n0 n0Var = wr3.n0.f530376g;
        android.view.View view2 = this.f546551i;
        if (itemStatus == n0Var) {
            a84.y0.p(view2, true);
        } else {
            a84.y0.p(view2, false);
        }
        r45.u5 finder_live = o5Var.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finder_live, "finder_live");
        boolean z18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.f463454n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.L)) ? false : true;
        android.view.View view3 = this.f546548f;
        android.view.View findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.caz);
        android.view.View findViewById2 = view3.findViewById(com.p314xaae8f345.mm.R.id.cay);
        if (z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = view3.findViewById(com.p314xaae8f345.mm.R.id.cbn);
            android.widget.ImageView imageView = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbm);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.f4x);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.exa);
            android.widget.TextView textView = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbo);
            android.widget.TextView textView2 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbq);
            textView.setText(o5Var.f463446d);
            android.text.TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView.getPaint();
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            textView2.setVisibility(8);
            r45.nw1 g17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(finder_live.f468564f);
            eq1.h hVar = eq1.h.f337345a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15315xe70278e1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15315xe70278e12);
            hVar.j(g17, c15315xe70278e1, c15315xe70278e12);
            textView.setTag(com.p314xaae8f345.mm.R.id.bph, finder_live.f468564f);
            view = view3;
            u5Var = finder_live;
            hVar.f(finder_live.f468563e, finder_live.f468564f, new yr3.q0(this, finder_live, textView, c15315xe70278e1, c15315xe70278e12, textView2));
            s0Var = this;
            android.content.Context context = s0Var.f546550h;
            int B = i65.a.B(context) - i65.a.b(context, 16);
            int i19 = (int) (B * 0.5625d);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams)).height = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setCover, coverUrl = " + o5Var.L + ", cardHeight = " + i19 + ", cardWidth = " + B);
            java.lang.String str2 = o5Var.L;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            o11.f fVar = new o11.f();
            fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
            fVar.f423610a = true;
            fVar.f423611b = true;
            fVar.f423612c = true;
            hVar.l(imageView, str2, fVar.a());
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView2 = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.cba);
            android.widget.ImageView imageView3 = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbf);
            android.widget.TextView textView3 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbg);
            android.widget.TextView textView4 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbh);
            android.widget.TextView textView5 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.cbe);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view3.findViewById(com.p314xaae8f345.mm.R.id.f4x);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view3.findViewById(com.p314xaae8f345.mm.R.id.exa);
            textView3.setText(finder_live.f468567i);
            android.text.TextPaint paint3 = textView3.getPaint();
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView3.getPaint();
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            textView4.setText(finder_live.f468574s);
            textView5.setText("");
            r45.nw1 g18 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(finder_live.f468564f);
            eq1.h hVar2 = eq1.h.f337345a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15315xe70278e13);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15315xe70278e14);
            hVar2.j(g18, c15315xe70278e13, c15315xe70278e14);
            textView3.setTag(com.p314xaae8f345.mm.R.id.bph, finder_live.f468564f);
            hVar2.f(finder_live.f468563e, finder_live.f468564f, new yr3.r0(this, finder_live, textView3, c15315xe70278e13, c15315xe70278e14, textView5));
            java.lang.String str3 = finder_live.f468573r.f466079d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            o11.f fVar2 = new o11.f();
            fVar2.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
            fVar2.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
            fVar2.f423610a = true;
            fVar2.f423611b = true;
            fVar2.f423612c = true;
            hVar2.h(imageView3, imageView2, str3, fVar2.a());
            s0Var = this;
            u5Var = finder_live;
            view = view3;
        }
        view.setOnClickListener(new yr3.p0(u5Var, s0Var));
    }
}

package yr3;

/* loaded from: classes11.dex */
public final class i1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f546403f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f546404g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f546405h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546403f = itemView.getContext();
        this.f546404g = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cbl);
        this.f546405h = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f546268c;
        r45.o5 o5Var = dataModel.f546267b;
        yr3.w wVar = yr3.w.f546592a;
        android.content.Context context = this.f546403f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        wr3.i iVar = this.f546248d;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f546249e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565878r65);
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565877r64);
        if (x51.t1.b(o5Var.A)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.r66);
            textView.setText(o5Var.f463446d);
            android.text.TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView.getPaint();
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/PicArticleViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.r67);
            textView2.setText(o5Var.f463446d);
            android.text.TextPaint paint3 = textView2.getPaint();
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2.getPaint();
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            ((android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565876r63)).setText(o5Var.A);
        }
        java.lang.String str = x51.t1.b(o5Var.f463455o) ? o5Var.f463453m : o5Var.f463455o;
        n11.a b17 = n11.a.b();
        o11.g d17 = wVar.d();
        android.widget.ImageView imageView = this.f546404g;
        b17.h(str, imageView, d17);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        fq1.e eVar = fq1.e.f347040a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        layoutParams.height = (int) ((eVar.e(context) - i65.a.b(context, 16)) * 0.428f);
    }
}

package yr3;

/* loaded from: classes11.dex */
public final class t1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f546572f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f546573g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f546574h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f546575i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f546576m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f546577n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f546578o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546572f = "ThreePicViewHolder";
        this.f546573g = itemView.getContext();
        this.f546574h = itemView.findViewById(com.p314xaae8f345.mm.R.id.rgn);
        this.f546575i = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.rgo);
        this.f546576m = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.rgp);
        this.f546577n = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.rgq);
        this.f546578o = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        int i19;
        int i27;
        android.view.View findViewById;
        int i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f546268c;
        r45.o5 o5Var = dataModel.f546267b;
        yr3.w wVar = yr3.w.f546592a;
        android.content.Context context = this.f546573g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        wr3.i iVar = this.f546248d;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f546249e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dyf);
        android.view.View findViewById3 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dye);
        if (x51.t1.b(o5Var.A)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i19 = 0;
            i27 = 8;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cbj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dyg);
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
            i19 = 0;
            i27 = 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cbj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView2 = (android.widget.TextView) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dyh);
            textView2.setText(o5Var.f463446d);
            android.text.TextPaint paint3 = textView2.getPaint();
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2.getPaint();
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            ((android.widget.TextView) this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dyd)).setText(o5Var.A);
        }
        if (o5Var.H > 1) {
            ((android.widget.TextView) findViewById).setVisibility(i19);
            ((android.widget.TextView) findViewById).setText(java.lang.String.valueOf(o5Var.H));
            i28 = i27;
        } else {
            i28 = i27;
            ((android.widget.TextView) findViewById).setVisibility(i28);
            ((android.widget.TextView) findViewById).setText("");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f546574h.getLayoutParams();
        fq1.e eVar = fq1.e.f347040a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        layoutParams.height = (int) (((((eVar.e(context) - i65.a.b(context, 16)) - i65.a.b(context, i28)) / 3.0f) / 3.0f) * 4.0f);
        if (o5Var.K.f456442d.size() < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f546572f, "PicInfoList size less 3");
            return;
        }
        java.lang.String str = ((r45.t5) o5Var.K.f456442d.get(i19)).f467681g;
        java.lang.String str2 = ((r45.t5) o5Var.K.f456442d.get(1)).f467681g;
        java.lang.String str3 = ((r45.t5) o5Var.K.f456442d.get(2)).f467681g;
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
        fVar.f423612c = true;
        n11.a.b().h(str, this.f546575i, fVar.a());
        o11.f fVar2 = new o11.f();
        fVar2.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
        fVar2.f423612c = true;
        n11.a.b().h(str2, this.f546576m, fVar2.a());
        o11.f fVar3 = new o11.f();
        fVar3.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
        fVar3.f423612c = true;
        n11.a.b().h(str3, this.f546577n, fVar3.a());
    }
}

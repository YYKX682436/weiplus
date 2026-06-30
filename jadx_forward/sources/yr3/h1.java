package yr3;

/* loaded from: classes11.dex */
public final class h1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f546371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f546372e;

    /* renamed from: f, reason: collision with root package name */
    public final sr3.a f546373f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f546374g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f546375h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f546376i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f546377m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f546378n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f546379o;

    /* renamed from: p, reason: collision with root package name */
    public final yr3.e1 f546380p;

    /* renamed from: q, reason: collision with root package name */
    public final yr3.e1 f546381q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(wr3.i adapter, android.view.View itemView, int i17, sr3.a accountType) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountType, "accountType");
        this.f546371d = adapter;
        this.f546372e = i17;
        this.f546373f = accountType;
        this.f546374g = "MsgSlidePicViewHolder";
        this.f546375h = adapter.B();
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f546376i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f546377m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sye);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.twl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f546380p = new yr3.e1(findViewById3, imageView, imageView2, textView, (android.widget.TextView) findViewById7, findViewById8);
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.p314xaae8f345.mm.R.id.v1m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sym);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        android.view.View findViewById14 = itemView.findViewById(com.p314xaae8f345.mm.R.id.syn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f546381q = new yr3.e1(findViewById9, imageView3, imageView4, textView2, (android.widget.TextView) findViewById13, findViewById14);
    }

    public final void i(r45.s5 s5Var, r45.o5 o5Var, boolean z17, int i17, int i18, yr3.e1 e1Var) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        if (o5Var == null) {
            android.view.View view = e1Var.f546329a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546374g, "fillMain: msgId=" + s5Var.f467042d.f472323d);
        android.view.View view2 = e1Var.f546329a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = e1Var.f546329a.getLayoutParams();
        int i19 = this.f546372e;
        layoutParams.width = i19;
        fq1.e eVar = fq1.e.f347040a;
        android.view.View view3 = e1Var.f546329a;
        android.content.Context context = this.f546375h;
        fq1.e.h(eVar, view3, i65.a.b(context, 8), false, false, 12, null);
        r45.z5 z5Var = o5Var.R;
        e1Var.f546331c.setVisibility(z5Var != null && z5Var.f473253g == 1 ? 0 : 8);
        r45.l5 l5Var = s5Var.f467047i.f464286d;
        yr3.w wVar = yr3.w.f546592a;
        android.content.Context context2 = this.f546375h;
        wr3.i iVar = this.f546371d;
        android.view.View view4 = e1Var.f546329a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
        wVar.j(context2, iVar, view4, s5Var, o5Var, l5Var, i18, wr3.n0.f530375f, z17, i17, this.f546373f, true);
        e1Var.f546332d.setText(((le0.x) i95.n0.c(le0.x.class)) != null ? com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, o5Var.f463446d) : "");
        java.lang.String str2 = o5Var.A;
        android.widget.TextView textView = e1Var.f546333e;
        textView.setText(str2);
        java.lang.CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e1Var, this.f546380p);
        r45.g6 g6Var = o5Var.K;
        if (g6Var == null || (linkedList = g6Var.f456443e) == null || (str = (java.lang.String) kz5.n0.Z(linkedList)) == null) {
            java.lang.String str3 = o5Var.f463453m;
            str = str3 != null ? str3 : "";
        }
        android.widget.ImageView imageView = e1Var.f546330b;
        imageView.getLayoutParams().height = (int) (i19 * 1.3333334f);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17 ? this.f546378n : this.f546379o, str)) {
            return;
        }
        if (b17) {
            this.f546378n = str;
        } else {
            this.f546379o = str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk);
            return;
        }
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
        fVar.f423610a = true;
        fVar.f423611b = true;
        fVar.f423612c = true;
        b18.h(str, imageView, fVar.a());
    }
}

package ns4;

/* loaded from: classes8.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f421021d;

    /* renamed from: e, reason: collision with root package name */
    public int f421022e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f421023f;

    /* renamed from: g, reason: collision with root package name */
    public long f421024g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f421025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421026i;

    public d(ns4.s sVar) {
        this.f421026i = sVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f421021d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ns4.s sVar;
        ns4.a holder = (ns4.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f421021d;
        if (arrayList != null) {
            int size = arrayList.size();
            ns4.s sVar2 = this.f421026i;
            if (i17 < size) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.ja7 ja7Var = (r45.ja7) obj;
                boolean z17 = sVar2.f421174f;
                android.widget.TextView textView = holder.f420960g;
                android.widget.TextView textView2 = holder.f420959f;
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = sVar2.f421169a;
                if (z17) {
                    textView2.setTextColor(activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                    textView.setTextColor(activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                }
                boolean z18 = this.f421023f;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f420961h;
                if (z18 && i17 == 2) {
                    c22699x3dcdb352.setVisibility(8);
                    textView2.setTextSize(1, 17.0f);
                    java.lang.String string = activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9r);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    sVar = sVar2;
                    java.lang.String string2 = activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9o, java.lang.String.valueOf(this.f421024g / 100));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    textView2.setText(string);
                    textView2.setContentDescription(string);
                    textView.setText(string2);
                    android.view.View view = holder.f420962i;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    sVar = sVar2;
                    c22699x3dcdb352.setVisibility(0);
                    textView2.setTextSize(1, 24.0f);
                    textView2.setText(java.lang.String.valueOf(ja7Var.f459213e));
                    textView2.setContentDescription(activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l99, java.lang.String.valueOf(ja7Var.f459213e)));
                    java.lang.String string3 = activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_1, java.lang.String.valueOf(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + ja7Var.f459214f, "100", 0, java.math.RoundingMode.CEILING).longValue()));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    textView.setText(string3);
                    ja7Var.f459216h = false;
                    android.view.View view2 = holder.f420962i;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = holder.f420957d;
                dy1.a.c(view3);
                dy1.a.i(view3, "pay_coin_view");
                jz5.l[] lVarArr = new jz5.l[7];
                java.lang.String str = ja7Var.f459212d;
                lVarArr[0] = new jz5.l("product_id", str != null ? str : "");
                lVarArr[1] = new jz5.l("wecoin_count", java.lang.Integer.valueOf(ja7Var.f459213e));
                lVarArr[2] = new jz5.l(ya.b.f77496x48db929, java.lang.Integer.valueOf(ja7Var.f459214f));
                lVarArr[3] = new jz5.l("discount_wecoin_count", java.lang.Integer.valueOf(ja7Var.f459215g));
                lVarArr[4] = new jz5.l("new_user_discount", java.lang.Boolean.valueOf(ja7Var.f459216h));
                lVarArr[5] = new jz5.l("coin_report_session_id", js4.r.f383100c);
                lVarArr[6] = new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f383098a));
                dy1.a.k(view3, kz5.c1.l(lVarArr));
                dy1.a.l(view3, 40, 25955);
            } else {
                sVar = sVar2;
            }
            ns4.s sVar3 = sVar;
            ns4.c cVar = new ns4.c(sVar3, this, holder);
            if (this.f421022e <= 0) {
                android.view.View view4 = sVar3.f421177i;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                    throw null;
                }
                if (view4.getWidth() <= 0) {
                    android.view.View view5 = sVar3.f421177i;
                    if (view5 != null) {
                        view5.post(new ns4.b(cVar));
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                        throw null;
                    }
                }
            }
            cVar.mo152xb9724478();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f421026i.f421169a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569788o9, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ns4.a(this, inflate);
    }
}

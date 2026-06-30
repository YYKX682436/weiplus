package ns4;

/* loaded from: classes8.dex */
public final class r implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js3 f421161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f421162f;

    public r(ns4.s sVar, r45.js3 js3Var, java.util.ArrayList arrayList) {
        this.f421160d = sVar;
        this.f421161e = js3Var;
        this.f421162f = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ns4.s sVar = this.f421160d;
        ns4.d dVar = sVar.f421176h;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondAdapter");
            throw null;
        }
        if (dVar.f421023f && i17 == 2) {
            android.view.View view2 = sVar.f421177i;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            if (((android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.lmb)).isChecked()) {
                ns4.p0 p0Var = new ns4.p0(sVar.f421169a, new ns4.r0(this.f421161e.f459622h.f457526f, sVar.f421174f, new ns4.i(sVar)));
                p0Var.f421148h.f();
                p0Var.f421143c.C();
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = p0Var.f421146f;
                if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
                    throw null;
                }
                viewOnFocusChangeListenerC22907xe18534c2.post(new ns4.o0(p0Var));
            } else {
                sVar.b();
            }
        } else {
            java.lang.Object obj = this.f421162f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ns4.s.a(sVar, (r45.ja7) obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

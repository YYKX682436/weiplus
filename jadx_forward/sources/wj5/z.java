package wj5;

/* loaded from: classes5.dex */
public final class z extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528385e;

    public z(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.v processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528385e = tipsBarContext;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cj8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.j item = (xj5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.hw7);
        frameLayout.removeAllViews();
        s35.b bVar = (s35.b) item.f536440u;
        frameLayout.addView(bVar.f484376h, new android.view.ViewGroup.LayoutParams(-1, -2));
        android.view.View findViewById = bVar.f484376h.findViewById(com.p314xaae8f345.mm.R.id.bqi);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar = this.f528385e;
        if (findViewById != null) {
            int i19 = dVar.a() ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = bVar.f484376h.findViewById(com.p314xaae8f345.mm.R.id.bqj);
        if (findViewById2 == null) {
            return;
        }
        int i27 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

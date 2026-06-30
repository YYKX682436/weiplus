package wj5;

/* loaded from: classes9.dex */
public final class u extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528375e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528376f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.s f528377g;

    public u(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d shareData, yj5.s processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareData, "shareData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528375e = ui6;
        this.f528376f = shareData;
        this.f528377g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569927s4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.h item = (xj5.h) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.omd);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565020b03);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3 = (com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3) holder.p(com.p314xaae8f345.mm.R.id.ole);
        textView.setText(item.f536438u.f458303e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c21455x9ab6ec3.setVisibility(8);
        holder.f3639x46306858.setOnClickListener(new wj5.s(item, this, holder));
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        n(itemView, i17, this.f528376f, new wj5.t(this, item));
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

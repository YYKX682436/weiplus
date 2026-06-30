package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes.dex */
public final class d extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f176102e;

    public d(boolean z17) {
        this.f176102e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569782o3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a item = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.awu);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) holder.p(com.p314xaae8f345.mm.R.id.awv);
        boolean z18 = item.f176094f;
        progressBar.setVisibility(z18 ? 0 : 8);
        int i19 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.f176102e || (textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.an6)) == null) {
            return;
        }
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n66));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

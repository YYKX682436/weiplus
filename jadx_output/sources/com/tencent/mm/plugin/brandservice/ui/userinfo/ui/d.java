package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes.dex */
public final class d extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f94569e;

    public d(boolean z17) {
        this.f94569e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488249o3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a item = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.awu);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) holder.p(com.tencent.mm.R.id.awv);
        boolean z18 = item.f94561f;
        progressBar.setVisibility(z18 ? 0 : 8);
        int i19 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.f94569e || (textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.an6)) == null) {
            return;
        }
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.n66));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

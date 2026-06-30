package a45;

/* loaded from: classes4.dex */
public abstract class j extends xn.c {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489463eo0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        xn.d item = (xn.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.v4e);
        u15.a aVar = (u15.a) item.f455404d;
        if (aVar == null || (str = aVar.getTitle()) == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.v4d);
        kotlin.jvm.internal.o.f(frameLayout, "getShareReviewAttachContainer(...)");
        n(frameLayout, aVar.k(), i17, i18);
        if (frameLayout.getChildCount() == 0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.d0v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (aVar.o() && aVar.l()) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cxh);
            return;
        }
        if (aVar.o()) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cxk);
            return;
        }
        if (!aVar.l()) {
            view.setBackgroundColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f478491c));
            return;
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.cxi);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.v4d);
        kotlin.jvm.internal.o.f(frameLayout, "getShareReviewAttachContainer(...)");
        o(frameLayout, i17);
    }

    public abstract void n(android.widget.FrameLayout frameLayout, oi3.e eVar, int i17, int i18);

    public abstract void o(android.widget.FrameLayout frameLayout, int i17);
}

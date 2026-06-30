package a45;

/* loaded from: classes4.dex */
public abstract class j extends xn.c {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570996eo0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        xn.d item = (xn.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.v4e);
        u15.a aVar = (u15.a) item.f536937d;
        if (aVar == null || (str = aVar.m167417x7531c8a2()) == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v4d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getShareReviewAttachContainer(...)");
        n(frameLayout, aVar.k(), i17, i18);
        if (frameLayout.getChildCount() == 0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (aVar.o() && aVar.l()) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxh);
            return;
        }
        if (aVar.o()) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxk);
            return;
        }
        if (!aVar.l()) {
            view.setBackgroundColor(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            return;
        }
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxi);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/sharereview/ShareReviewBaseConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/chatting/basis/MsgItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.v4d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getShareReviewAttachContainer(...)");
        o(frameLayout, i17);
    }

    public abstract void n(android.widget.FrameLayout frameLayout, oi3.e eVar, int i17, int i18);

    public abstract void o(android.widget.FrameLayout frameLayout, int i17);
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public final class tn extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281556e;

    public tn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        this.f281556e = hoVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569977th;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg item = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281556e;
        textView.setText(hoVar.f280113d.g().getString(item.f281040e));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.nh8);
        java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho.E;
        int i19 = item.f281039d == hoVar.n0() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sn(hoVar, item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

package aj2;

/* loaded from: classes8.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86833e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f86834f;

    public c(java.lang.String anchorUserId, yz5.l micEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserId, "anchorUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micEvent, "micEvent");
        this.f86833e = anchorUserId;
        this.f86834f = micEvent;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aug;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.CharSequence string;
        aj2.a item = (aj2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        km2.q qVar = item.f86825d;
        if (qVar != null) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.hxd);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setOnClickListener(new aj2.b(holder, item, this, i17));
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fso);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390703a, this.f86833e)) {
                string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5o);
            } else {
                java.lang.String str = qVar.f390706d;
                if (str == null || str.length() == 0) {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.String str2 = qVar.f390706d;
                    float textSize = textView.getTextSize();
                    ((ke0.e) xVar).getClass();
                    string = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, str2, textSize);
                } else {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
                    java.lang.String str3 = qVar.f390706d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    android.text.Spanned c17 = l4Var.c(str3, "");
                    float textSize2 = textView.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    string = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context2, c17, textSize2);
                }
            }
            textView.setText(string);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.hxe);
            int i19 = item.f86826e ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

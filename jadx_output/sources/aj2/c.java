package aj2;

/* loaded from: classes8.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5300e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f5301f;

    public c(java.lang.String anchorUserId, yz5.l micEvent) {
        kotlin.jvm.internal.o.g(anchorUserId, "anchorUserId");
        kotlin.jvm.internal.o.g(micEvent, "micEvent");
        this.f5300e = anchorUserId;
        this.f5301f = micEvent;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aug;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.CharSequence string;
        aj2.a item = (aj2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        km2.q qVar = item.f5292d;
        if (qVar != null) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.hxd);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setOnClickListener(new aj2.b(holder, item, this, i17));
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fso);
            if (kotlin.jvm.internal.o.b(qVar.f309170a, this.f5300e)) {
                string = textView.getContext().getResources().getString(com.tencent.mm.R.string.d5o);
            } else {
                java.lang.String str = qVar.f309173d;
                if (str == null || str.length() == 0) {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.lang.String str2 = qVar.f309173d;
                    float textSize = textView.getTextSize();
                    ((ke0.e) xVar).getClass();
                    string = com.tencent.mm.pluginsdk.ui.span.c0.n(context, str2, textSize);
                } else {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
                    java.lang.String str3 = qVar.f309173d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    android.text.Spanned c17 = l4Var.c(str3, "");
                    float textSize2 = textView.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    string = com.tencent.mm.pluginsdk.ui.span.c0.n(context2, c17, textSize2);
                }
            }
            textView.setText(string);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.hxe);
            int i19 = item.f5293e ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

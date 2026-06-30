package q50;

/* loaded from: classes.dex */
public final class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elv;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        q50.a item = (q50.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = (p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) context;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = item.f441669d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(n17);
        rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String d17 = n17.d1();
        ((c01.w1) eVar).getClass();
        int o17 = c01.v1.o(d17);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            wi6 = wi6 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n79, java.lang.Integer.valueOf(o17));
        }
        textView.setText(wi6);
        holder.p(com.p314xaae8f345.mm.R.id.a_4).setOnClickListener(new q50.f(new q50.h(str, holder), str, activityC0053x3d3f670c));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.d0v);
        int i19 = item.f441670e ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/feature/forward/ui/ForwardMsgPreviewConversationConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/feature/forward/ui/ForwardMsgPreviewConversationConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.dl.i(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq)).getPaint());
        kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        ((hn1.s) b0Var).Ai((android.widget.ImageView) p18, str);
        holder.p(com.p314xaae8f345.mm.R.id.u97).setOnClickListener(new q50.g(this, activityC0053x3d3f670c, str));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

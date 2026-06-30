package wj5;

/* loaded from: classes5.dex */
public final class i extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528338e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528339f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.d f528340g;

    public i(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.d processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528338e = ui6;
        this.f528339f = tipsBarContext;
        this.f528340g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570110xr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        long j17;
        xj5.c item = (xj5.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f564230ll);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.m38);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = item.f536433u;
        java.lang.String str = a3Var.f69088x37548063;
        java.lang.String str2 = a3Var.f69090xb4fe86b0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String input = r26.n0.u0(str2).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\n");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        textView.setText(replaceAll);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar = this.f528339f;
        int i19 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a3Var.f69107x5be1edb3) ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a3Var.f69107x5be1edb3, c01.z1.r());
        boolean G0 = a3Var.G0(c01.z1.r());
        holder.f3639x46306858.setOnClickListener(new wj5.g(str, b17, G0, holder, item));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe c7002x3df26ffe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe();
        c7002x3df26ffe.f143167d = c7002x3df26ffe.b("ChatName", str, true);
        c7002x3df26ffe.f143169f = a3Var.f69098xbcb1bed0;
        if (b17) {
            j17 = 1;
        } else {
            j17 = G0 ? 2 : 0;
        }
        c7002x3df26ffe.f143168e = j17;
        c7002x3df26ffe.f143171h = c7002x3df26ffe.b("NoticeId", "" + a3Var.f69092x65ba57ac, true);
        c7002x3df26ffe.f143170g = 22L;
        yj5.d dVar2 = this.f528340g;
        dVar2.f544243f = c7002x3df26ffe;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        n(itemView, i17, dVar, new wj5.h(this));
        dVar2.f544245h = true;
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

package wj5;

/* loaded from: classes5.dex */
public final class e0 extends wj5.c {

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f528326h;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528327e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528328f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.c0 f528329g;

    public e0(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d shareData, yj5.c0 processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareData, "shareData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528327e = ui6;
        this.f528328f = shareData;
        this.f528329g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569927s4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.n item = (xj5.n) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.omd);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565020b03);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3 = (com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3) holder.p(com.p314xaae8f345.mm.R.id.ole);
        ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar = item.f536448u;
        java.lang.String Di = g0Var.Di(dbVar.t0(), dbVar.w0().f454141i);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Di);
        sb6.append(": ");
        java.lang.String MsgSummary = dbVar.w0().f454140h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MsgSummary, "MsgSummary");
        sb6.append(r26.i0.u(MsgSummary, '\n', ' ', false, 4, null));
        textView.setText(sb6.toString());
        boolean C = c01.v1.C(this.f528327e.x(), en1.a.a());
        if (C) {
            c21455x9ab6ec3.setVisibility(0);
        } else {
            c21455x9ab6ec3.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar = this.f528328f;
        if (dVar.a()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c21455x9ab6ec3.setVisibility(8);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21455x9ab6ec3);
        p(c21455x9ab6ec3, false);
        c21455x9ab6ec3.setOnClickListener(new wj5.b0(this, c21455x9ab6ec3, holder, item));
        holder.f3639x46306858.setOnClickListener(new wj5.c0(this, c21455x9ab6ec3, item, holder));
        if (C) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            itemView.setOnLongClickListener(null);
        } else {
            android.view.View itemView2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            n(itemView2, i17, dVar, new wj5.d0(item));
        }
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void p(com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c21455x9ab6ec3, "<this>");
        if (q(c21455x9ab6ec3)) {
            java.lang.String string = c21455x9ab6ec3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int color = c21455x9ab6ec3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
            c21455x9ab6ec3.tText = string;
            c21455x9ab6ec3.tTextColor = color;
            c21455x9ab6ec3.tPaddingLeft = 0;
            c21455x9ab6ec3.tPaddingRight = 0;
            c21455x9ab6ec3.tBackgroundRes = com.p314xaae8f345.mm.R.C30861xcebc809e.afm;
            c21455x9ab6ec3.tBackgroundShow = false;
            c21455x9ab6ec3.tDuration = 200L;
            c21455x9ab6ec3.b(z17);
            c21455x9ab6ec3.setTag(java.lang.Boolean.FALSE);
        }
        r(c21455x9ab6ec3);
    }

    public final boolean q(com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c21455x9ab6ec3, "<this>");
        java.lang.Object tag = c21455x9ab6ec3.getTag();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE);
    }

    public final void r(com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c21455x9ab6ec3, "<this>");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(c21455x9ab6ec3, q(c21455x9ab6ec3) ? "group_msg_set_top_bar_remove_confirm" : "group_msg_set_top_bar_remove");
        aVar.ik(c21455x9ab6ec3, 8, 26356);
    }
}

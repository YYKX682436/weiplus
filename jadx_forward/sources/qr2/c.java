package qr2;

/* loaded from: classes2.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f447600e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 f447601f;

    /* renamed from: g, reason: collision with root package name */
    public final int f447602g;

    public c(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18;
        boolean z18 = true;
        this.f447600e = (i17 & 1) != 0 ? false : z17;
        this.f447601f = z1Var;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z18 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i19 = a17.f278668a;
        if (!z18 && i19 > (i18 = a17.f278669b)) {
            i19 = i18;
        }
        this.f447602g = i19;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dik;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.vx0 vx0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        int dimension = (this.f447602g - ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr))) / 2;
        if (dimension > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
            layoutParams.width = dimension;
            holder.f3639x46306858.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565583cu2);
        r45.dm2 m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064();
        java.lang.String string = (m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lt9, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(6)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(string);
        sb6.append(' ');
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.getFeedObject().m59226x730bcac6()) ? "" : item.getFeedObject().getDescriptionSpan());
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(sb7);
        }
        if (this.f447600e) {
            textView.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77918x9e227f16));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nhh);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) holder.f374658i;
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (z1Var.f204041d) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565583cu2)).setAlpha(0.06f);
            textView2.setVisibility(0);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.qn6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565583cu2)).setAlpha(1.0f);
            textView2.setVisibility(8);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.qn6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dy1.a.i(itemView, "biz_feed_collection");
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        dy1.a.a(itemView2, new qr2.b(V6, item, this));
        android.view.View itemView3 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
        dy1.a.l(itemView3, 40, 25496);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

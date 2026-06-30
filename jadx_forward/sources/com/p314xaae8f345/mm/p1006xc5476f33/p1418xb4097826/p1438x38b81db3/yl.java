package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yl extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final long f186559e;

    public yl(long j17) {
        this.f186559e = j17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570360al0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.h0 item = (so2.h0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View element = holder.p(com.p314xaae8f345.mm.R.id.eii);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ein);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = holder.p(com.p314xaae8f345.mm.R.id.i1e);
        java.lang.String m75945x2fec8307 = item.f491907d.m75945x2fec8307(0);
        ya2.b2 b17 = ya2.h.f542017a.b(m75945x2fec8307);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            java.lang.String m176700xe5e0d2a0 = b17.m176700xe5e0d2a0();
            if (!(m176700xe5e0d2a0.length() > 0)) {
                m176700xe5e0d2a0 = null;
            }
            if (m176700xe5e0d2a0 != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d l17 = g1Var.l();
                mn2.n nVar = new mn2.n(m176700xe5e0d2a0, null, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                l17.c(nVar, (android.widget.ImageView) element, g1Var.h(mn2.f1.f411494o));
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            ng5.a.a((android.widget.ImageView) element, m75945x2fec8307);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String md6 = c61.yb.md((c61.yb) c17, m75945x2fec8307, null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(holder.f374654e, md6));
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vl(m75945x2fec8307, this, holder));
        android.view.View view = (android.view.View) h0Var.f391656d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!item.f491908e || item.f491909f) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeConvert", "begin blink animation " + i17);
        item.f491909f = true;
        android.view.View view2 = (android.view.View) h0Var.f391656d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = (android.view.View) h0Var.f391656d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ((android.view.View) h0Var.f391656d).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xl(h0Var, this, i17));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

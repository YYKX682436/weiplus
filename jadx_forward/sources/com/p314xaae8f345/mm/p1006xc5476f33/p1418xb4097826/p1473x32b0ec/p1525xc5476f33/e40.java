package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class e40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 f193901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.c0 f193902e;

    public e40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 h40Var, cm2.c0 c0Var) {
        this.f193901d = h40Var;
        this.f193902e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 h40Var = this.f193901d;
        android.content.Context context = h40Var.f194300d;
        cm2.c0 c0Var = this.f193902e;
        r45.do2 item = c0Var.f124867v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, item, true);
        yz5.l lVar = h40Var.f194303g;
        if (lVar != null) {
            lVar.mo146xb9724478(c0Var);
        }
        bf2.c.c(bf2.c.f101131a, h40Var.f194301e, 5, 15, pm0.v.u(zl2.r4.f555483a.c0(c0Var.f124867v)), 0, null, 0, 4, null, 0, nd1.y0.f72985x366c91de, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

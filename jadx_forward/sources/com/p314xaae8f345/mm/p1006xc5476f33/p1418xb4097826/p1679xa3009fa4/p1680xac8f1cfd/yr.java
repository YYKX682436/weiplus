package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class yr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f218138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f218139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f218140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f218141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f218142h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f218143i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f218144m;

    public yr(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var, int i17) {
        this.f218138d = c22699x3dcdb352;
        this.f218139e = list;
        this.f218140f = hsVar;
        this.f218141g = s0Var;
        this.f218142h = zk2Var;
        this.f218143i = xk2Var;
        this.f218144m = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f218138d;
        int i17 = 0;
        c22699x3dcdb352.setClickable(false);
        c22699x3dcdb352.setFocusable(false);
        java.util.Iterator it = this.f218139e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            in5.s0 s0Var = this.f218141g;
            if (!hasNext) {
                r45.xk2 answer = this.f218143i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(answer, "$answer");
                this.f218140f.R6(s0Var, this.f218142h, answer, "");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            if (i17 <= this.f218144m) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2 : null;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.m82040x7541828(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                }
            }
            i17 = i18;
        }
    }
}

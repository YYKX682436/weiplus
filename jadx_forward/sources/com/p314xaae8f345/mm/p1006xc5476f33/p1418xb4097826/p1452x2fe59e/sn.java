package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class sn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn f190532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn tnVar) {
        super(1);
        this.f190532d = tnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn tnVar = this.f190532d;
        boolean z17 = tnVar.f188689e.m56393xfb854877() == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelateUIContract", "[fetchEndCallback], " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = tnVar.f188690f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar = a1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co) a1Var : null;
        if (coVar != null && !z17 && !coVar.f188023z) {
            coVar.f188023z = true;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) coVar.l(com.p314xaae8f345.mm.R.id.g7l);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            coVar.f188020w = (android.widget.TextView) coVar.l(com.p314xaae8f345.mm.R.id.ooz);
            coVar.f188021x = (android.widget.TextView) coVar.l(com.p314xaae8f345.mm.R.id.f568986op0);
            android.widget.TextView textView = coVar.f188020w;
            if (textView != null) {
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xn(coVar));
            }
            android.widget.TextView textView2 = coVar.f188021x;
            if (textView2 != null) {
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yn(coVar));
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = tnVar.f188690f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar2 = a1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co) a1Var2 : null;
            if (coVar2 != null) {
                coVar2.W();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = tnVar.f188690f;
            android.view.View t17 = a1Var3 != null ? a1Var3.t() : null;
            if (t17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view = t17;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelatePresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}

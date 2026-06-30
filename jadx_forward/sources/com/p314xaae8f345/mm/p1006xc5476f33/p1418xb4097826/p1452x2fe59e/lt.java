package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class lt extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt f188859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar) {
        super(1);
        this.f188859d = ytVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View f294968x;
        android.view.View f294968x2;
        android.view.View f294968x3;
        android.widget.TextView textView;
        android.view.View f294968x4;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f188859d;
        if (ytVar.g().m56388xcaeb60d0().size() > 4) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f17 = ytVar.h().f();
            android.view.View view = null;
            android.view.View f294968x5 = f17 != null ? f17.getF294968x() : null;
            if (f294968x5 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f294968x5, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f294968x5, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f18 = ytVar.h().f();
            if (f18 != null && (f294968x4 = f18.getF294968x()) != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f19 = ytVar.h().f();
            if (f19 != null && (f294968x3 = f19.getF294968x()) != null && (textView = (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(ytVar.f192730d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f27 = ytVar.h().f();
            android.widget.TextView textView3 = (f27 == null || (f294968x2 = f27.getF294968x()) == null) ? null : (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f28 = ytVar.h().f();
            if (f28 != null && (f294968x = f28.getF294968x()) != null) {
                view = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            }
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}

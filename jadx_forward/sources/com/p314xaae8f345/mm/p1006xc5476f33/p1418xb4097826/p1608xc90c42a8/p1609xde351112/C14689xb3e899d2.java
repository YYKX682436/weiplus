package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter$onAttach$3 */
/* loaded from: classes3.dex */
public final class C14689xb3e899d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter f204253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14689xb3e899d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter presenter) {
        super(1);
        this.f204253d = presenter;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wecoinHotList.size:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4 b4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4) it;
            java.util.LinkedList linkedList = b4Var.f189256a;
            sb6.append(linkedList.size());
            sb6.append(", totalWecoinHot:");
            long j17 = b4Var.f189257b;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeIncomeContract.Presenter", sb6.toString());
            boolean isEmpty = linkedList.isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter presenter = this.f204253d;
            if (isEmpty) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.ViewCallback viewCallback = presenter.f204251f;
                if (viewCallback != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = viewCallback.f204256f;
                    if (c1163xf1deaba4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("chargeCustomerRecyclerView");
                        throw null;
                    }
                    c1163xf1deaba4.setVisibility(8);
                    android.view.View view = viewCallback.f204262o;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.ViewCallback viewCallback2 = presenter.f204251f;
                if (viewCallback2 != null) {
                    android.widget.TextView textView = viewCallback2.f204260m;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAmount");
                        throw null;
                    }
                    textView.setText(java.lang.String.valueOf(linkedList.size()));
                    android.widget.TextView textView2 = viewCallback2.f204261n;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hotAmount");
                        throw null;
                    }
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = viewCallback2.f204254d;
                    textView2.setText(j17 > 0 ? abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9_, zl2.r4.S(zl2.r4.f555483a, b4Var.f189257b, 0, 2, null)) : abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d99));
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = viewCallback2.f204256f;
                    if (c1163xf1deaba42 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("chargeCustomerRecyclerView");
                        throw null;
                    }
                    c1163xf1deaba42.setVisibility(0);
                    android.view.View view2 = viewCallback2.f204262o;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = presenter.f204250e;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                c22848x6ddd90cf.m8146xced61ae5();
            }
        }
        return jz5.f0.f384359a;
    }
}

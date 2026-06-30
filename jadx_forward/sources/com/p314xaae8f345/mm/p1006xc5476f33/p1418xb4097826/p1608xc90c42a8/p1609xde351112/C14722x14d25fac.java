package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$onAttach$3 */
/* loaded from: classes3.dex */
public final class C14722x14d25fac extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.Presenter f204335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14722x14d25fac(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.Presenter presenter) {
        super(1);
        this.f204335d = presenter;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWeCoinHotConstract.Presenter", sb6.toString());
            boolean isEmpty = linkedList.isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.Presenter presenter = this.f204335d;
            if (isEmpty) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.ViewCallback viewCallback = presenter.f204332f;
                if (viewCallback != null) {
                    android.widget.RelativeLayout relativeLayout = viewCallback.f204342m;
                    if (relativeLayout == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleGroup");
                        throw null;
                    }
                    relativeLayout.setVisibility(8);
                    android.widget.TextView textView = viewCallback.f204345p;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTv");
                        throw null;
                    }
                    textView.setVisibility(0);
                    viewCallback.a().setVisibility(8);
                    android.view.View view = viewCallback.f204346q;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.ViewCallback viewCallback2 = presenter.f204332f;
                if (viewCallback2 != null) {
                    android.widget.TextView textView2 = viewCallback2.f204344o;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleAmountTv");
                        throw null;
                    }
                    textView2.setText(java.lang.String.valueOf(j17));
                    android.widget.RelativeLayout relativeLayout2 = viewCallback2.f204342m;
                    if (relativeLayout2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleGroup");
                        throw null;
                    }
                    relativeLayout2.setVisibility(0);
                    android.widget.TextView textView3 = viewCallback2.f204345p;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTv");
                        throw null;
                    }
                    textView3.setVisibility(8);
                    viewCallback2.a().setVisibility(0);
                    android.view.View view2 = viewCallback2.f204346q;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = presenter.f204331e;
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

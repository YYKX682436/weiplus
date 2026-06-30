package hd2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca f362077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca) {
        super(1);
        this.f362077d = c14134xc5fab6ca;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca = this.f362077d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ko koVar = c14134xc5fab6ca.f191577v;
        if (koVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View view = koVar.f187719s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ko koVar2 = c14134xc5fab6ca.f191577v;
        if (koVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View view2 = koVar2.f187719s;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ko koVar3 = c14134xc5fab6ca.f191577v;
        if (koVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View view3 = koVar3.f187719s;
        android.view.View findViewById2 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.ilh) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            android.view.View view4 = findViewById2;
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}

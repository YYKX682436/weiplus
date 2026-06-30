package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ll extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f188843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar) {
        super(1);
        this.f188843d = tlVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 it = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f188843d;
        tlVar.j(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.a(tlVar, false);
        android.view.View d17 = tlVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = tlVar.f190602d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ggVar);
        boolean z17 = true;
        ggVar.W6(true, false);
        ggVar.T6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B7).mo141623x754a37bb()).r()).intValue();
        if (intValue != 1 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            android.view.View view = (android.view.View) ((jz5.n) tlVar.g().f192612h).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ll extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(1);
        this.f107310d = tlVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107310d;
        tlVar.j(false);
        com.tencent.mm.plugin.finder.feed.tl.a(tlVar, false);
        android.view.View d17 = tlVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.MMActivity activity = tlVar.f109069d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.d(ggVar);
        boolean z17 = true;
        ggVar.W6(true, false);
        ggVar.T6();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B7).getValue()).r()).intValue();
        if (intValue != 1 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            android.view.View view = (android.view.View) ((jz5.n) tlVar.g().f111079h).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f104430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(android.view.View view, com.tencent.mm.plugin.finder.convert.ew ewVar, in5.s0 s0Var, int i17) {
        super(1);
        this.f104429d = view;
        this.f104430e = ewVar;
        this.f104431f = s0Var;
        this.f104432g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.ys it = (com.tencent.mm.plugin.finder.feed.ys) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f104429d;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486582lr0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486585lr3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!it.f111194f.isEmpty()) {
            com.tencent.mm.plugin.finder.convert.ew ewVar = this.f104430e;
            in5.s0 s0Var = this.f104431f;
            ewVar.h(s0Var, it, s0Var.getAdapterPosition(), this.f104432g, true, null);
        }
        com.tencent.mm.plugin.finder.convert.ew ewVar2 = this.f104430e;
        ewVar2.f103308w.f103425c = java.lang.System.currentTimeMillis();
        ewVar2.f103299n = false;
        return jz5.f0.f302826a;
    }
}

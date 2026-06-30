package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f111175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(0);
        this.f111175d = tlVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f111175d;
        int i17 = tlVar.f109083u + 1;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tlVar.g().f111076e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        int a07 = i17 + wxRecyclerAdapter.a0();
        com.tencent.mm.plugin.finder.feed.ql qlVar = new com.tencent.mm.plugin.finder.feed.ql(400, tlVar.f109069d);
        qlVar.f12049a = a07;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = tlVar.g().f111075d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(qlVar);
        }
        return jz5.f0.f302826a;
    }
}

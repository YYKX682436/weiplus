package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f106637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f106638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.feed.f8 f8Var, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
        super(0);
        this.f106635d = str;
        this.f106636e = str2;
        this.f106637f = f8Var;
        this.f106638g = finderThanksUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favInfoUpdateListener event objectID:");
        java.lang.String str = this.f106635d;
        sb6.append(str);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f106636e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f106637f;
        java.util.Iterator it = f8Var.f106719p.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.c1 c1Var = (so2.c1) next;
            if (r26.i0.q(c1Var.f410288d.f385429g, str2, false, 2, null) && c1Var.f410289e.equals(str)) {
                com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "favInfoUpdateListener event index " + i17);
                am.md mdVar = this.f106638g.f54333g;
                c1Var.f410288d.f385436q = (mdVar == null || !mdVar.f7338b) ? 0 : 1;
                yw2.f fVar = f8Var.f106720q;
                if (fVar != null && (recyclerView = fVar.n().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(i17, 1);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f106919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
        super(0);
        this.f106916d = str;
        this.f106917e = str2;
        this.f106918f = idVar;
        this.f106919g = finderThanksUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.String str = this.f106916d;
        sb6.append(str);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f106917e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.feed.id idVar = this.f106918f;
        java.util.Iterator it = idVar.f107007m.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.f1 f1Var = (so2.f1) next;
            if (r26.i0.q(f1Var.f410336d.getString(5), str2, false, 2, null) && kotlin.jvm.internal.o.b(f1Var.f410337e, str)) {
                com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "thanksUpdateListener event index " + i17);
                am.md mdVar = this.f106919g.f54333g;
                f1Var.f410336d.set(15, java.lang.Integer.valueOf((mdVar == null || !mdVar.f7338b) ? 0 : 1));
                yw2.n nVar = idVar.f107010p;
                if (nVar != null && (recyclerView = nVar.o().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(i17, 1);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}

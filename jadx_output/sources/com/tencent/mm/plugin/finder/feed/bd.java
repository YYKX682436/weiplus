package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f106379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f106380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.tencent.mm.plugin.finder.feed.id idVar, java.util.List list, java.util.Set set, java.util.Set set2) {
        super(0);
        this.f106377d = idVar;
        this.f106378e = list;
        this.f106379f = set;
        this.f106380g = set2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.id idVar = this.f106377d;
        if (idVar.f107017w) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processPendingPrivacyEvents events:");
            sb6.append(this.f106378e.size());
            sb6.append(" remove:");
            java.util.Set set = this.f106379f;
            sb6.append(set);
            sb6.append(" restore:");
            java.util.Set set2 = this.f106380g;
            sb6.append(set2);
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
            boolean z17 = !set.isEmpty();
            java.util.Set set3 = idVar.C;
            if (z17) {
                java.util.Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    java.util.ArrayList arrayList = idVar.f107007m;
                    java.util.Iterator it6 = arrayList.iterator();
                    boolean z18 = false;
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(((so2.f1) it6.next()).f410336d.getString(5), str)) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        arrayList.remove(i17);
                        yw2.n nVar = idVar.f107010p;
                        if (nVar != null && (recyclerView = nVar.o().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyItemRemoved(i17);
                        }
                        idVar.f107013s--;
                        idVar.o();
                        if (idVar.f107013s == 0) {
                            yw2.n nVar2 = idVar.f107010p;
                            if (nVar2 != null) {
                                nVar2.q();
                            }
                        }
                    }
                }
                set3.addAll(set);
            }
            if (!set2.isEmpty()) {
                set3.removeAll(set2);
                com.tencent.mm.plugin.finder.feed.id.m(idVar, idVar.f107003f, false, new com.tencent.mm.plugin.finder.feed.ad(idVar), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f106733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f106735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f106736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f106737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f106738f;

    public fd(yz5.l lVar, com.tencent.mm.plugin.finder.feed.id idVar, boolean z17, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, long j17, fp0.r rVar) {
        this.f106733a = lVar;
        this.f106734b = idVar;
        this.f106735c = z17;
        this.f106736d = finderItem;
        this.f106737e = j17;
        this.f106738f = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.feed.jc jcVar = (com.tencent.mm.plugin.finder.feed.jc) obj;
        yz5.l lVar = this.f106733a;
        if (lVar == null || (linkedList = (java.util.LinkedList) lVar.invoke(jcVar.f107094b)) == null) {
            linkedList = jcVar.f107094b;
        }
        com.tencent.mm.plugin.finder.feed.id idVar = this.f106734b;
        yw2.n nVar = idVar.f107010p;
        java.lang.Object obj2 = null;
        if (nVar != null) {
            android.widget.FrameLayout frameLayout = nVar.f466655h;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout.setVisibility(8);
            nVar.n().setOnClickListener(null);
        }
        boolean z17 = this.f106735c;
        if (!z17) {
            yw2.n nVar2 = idVar.f107010p;
            if (nVar2 != null) {
                nVar2.o().P(linkedList != null ? linkedList.size() : 0);
            }
        } else if (!idVar.f107012r) {
            yw2.n nVar3 = idVar.f107010p;
            if (nVar3 != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(nVar3.o(), null, 1, null);
            }
            yw2.n nVar4 = idVar.f107010p;
            if (nVar4 != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.r(nVar4.o(), false, null, new com.tencent.mm.plugin.finder.feed.dd(idVar), 3, null);
            }
        }
        if (z17 && !idVar.f107011q) {
            yw2.n nVar5 = idVar.f107010p;
            if (nVar5 != null) {
                nVar5.g(false);
            }
            yw2.n nVar6 = idVar.f107010p;
            if (nVar6 != null) {
                nVar6.k().l(true);
            }
        }
        r45.a31 a31Var = jcVar.f107096d;
        r45.t11 t11Var = a31Var != null ? (r45.t11) a31Var.getCustom(0) : null;
        idVar.f107019y = t11Var != null ? (r45.ri0) t11Var.getCustom(1) : null;
        java.util.ArrayList arrayList = idVar.f107007m;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106736d;
        if (t11Var != null) {
            so2.f1 f1Var = new so2.f1(new r45.md1(), finderItem.getUnsignedId());
            f1Var.f410342m = t11Var;
            arrayList.add(f1Var);
        }
        r45.tl6 tl6Var = jcVar.f107095c;
        if (tl6Var != null && tl6Var.getInteger(0) != 0) {
            so2.f1 f1Var2 = new so2.f1(new r45.md1(), finderItem.getUnsignedId());
            f1Var2.f410341i = tl6Var;
            arrayList.add(f1Var2);
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "refresh header title...");
            idVar.o();
            if (z17) {
                arrayList.clear();
                yw2.n nVar7 = idVar.f107010p;
                if (nVar7 != null && (recyclerView = nVar7.o().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                if (jcVar.f107093a) {
                    yw2.n nVar8 = idVar.f107010p;
                    if (nVar8 != null) {
                        nVar8.q();
                    }
                } else {
                    yw2.n nVar9 = idVar.f107010p;
                    if (nVar9 != null) {
                        com.tencent.mm.plugin.finder.feed.ed edVar = new com.tencent.mm.plugin.finder.feed.ed(idVar, finderItem);
                        android.widget.FrameLayout frameLayout2 = nVar9.f466655h;
                        if (frameLayout2 == null) {
                            kotlin.jvm.internal.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout2.setVisibility(0);
                        android.view.View view = nVar9.f466656i;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar9.l().setVisibility(8);
                        android.view.View n17 = nVar9.n();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(n17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        n17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar9.n().setOnClickListener(new yw2.m(edVar));
                    }
                }
            }
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.md1 md1Var = (r45.md1) it.next();
                kotlin.jvm.internal.o.d(md1Var);
                so2.f1 f1Var3 = new so2.f1(md1Var, finderItem.getUnsignedId());
                com.tencent.mm.protobuf.g gVar = idVar.f107004g;
                r45.md1 md1Var2 = f1Var3.f410336d;
                if (gVar == null || md1Var2.getInteger(7) != 1) {
                    if (idVar.f107005h.length() > 0) {
                        if (!kotlin.jvm.internal.o.b(idVar.f107005h, md1Var2.getString(5))) {
                        }
                    }
                    arrayList.add(f1Var3);
                }
                f1Var3.f410338f = true;
                arrayList.add(f1Var3);
            }
            if (((java.lang.Boolean) ((jz5.n) idVar.A).getValue()).booleanValue() && !idVar.f107012r && arrayList.size() > 1) {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((so2.f1) next).f410336d.getString(5), c01.z1.r())) {
                        obj2 = next;
                        break;
                    }
                }
                so2.f1 f1Var4 = (so2.f1) obj2;
                if (f1Var4 != null) {
                    f1Var4.f410340h = true;
                }
            }
            yw2.n nVar10 = idVar.f107010p;
            if (nVar10 != null && (recyclerView2 = nVar10.o().getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                adapter2.notifyDataSetChanged();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f106737e);
        sb6.append("ms, succ:");
        sb6.append(linkedList != null);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        this.f106738f.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}

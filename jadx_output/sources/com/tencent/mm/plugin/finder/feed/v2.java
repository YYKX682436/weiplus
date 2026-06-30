package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderCommentChangeEvent f110863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f110863d = finderCommentChangeEvent;
        this.f110864e = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int e17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        java.lang.Boolean bool;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = this.f110863d;
        am.ta taVar = finderCommentChangeEvent.f54263g;
        int i17 = taVar.f7995c;
        int i18 = com.tencent.mm.plugin.finder.storage.wj0.S;
        boolean z17 = true;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f110864e;
        if (i17 == i18) {
            int h17 = a7Var.f106210g.h();
            com.tencent.mm.plugin.finder.feed.p2 p2Var = a7Var.f106217p;
            if (p2Var != null) {
                dm.w3 w3Var = finderCommentChangeEvent.f54263g.f7996d;
                kotlin.jvm.internal.o.e(w3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var = (com.tencent.mm.plugin.finder.storage.yj0) w3Var;
                long Y0 = yj0Var.Y0();
                com.tencent.mm.plugin.finder.feed.a7 a7Var2 = p2Var.f108695b;
                if (Y0 == 0 || a7Var2.f106210g.e(yj0Var.Y0()) != -1) {
                    int a17 = a7Var2.f106210g.a(new so2.y0(yj0Var));
                    androidx.recyclerview.widget.f2 adapter3 = p2Var.f108694a.getAdapter();
                    if (adapter3 != null) {
                        adapter3.notifyDataSetChanged();
                    }
                    if (yj0Var.Y0() != 0) {
                        yw2.a0 a0Var = a7Var2.f106216o;
                        if (a0Var != null) {
                            com.tencent.mm.view.RefreshLoadMoreLayout.r(a0Var.s(), false, null, com.tencent.mm.plugin.finder.feed.o2.f108616d, 3, null);
                        }
                        yw2.a0 a0Var2 = a7Var2.f106216o;
                        if (a0Var2 != null && (recyclerView3 = a0Var2.s().getRecyclerView()) != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(a17));
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(recyclerView3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper", "onInsertChange", "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z", "Undefined", "scrollToPosition", "(I)V");
                            recyclerView3.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(recyclerView3, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper", "onInsertChange", "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z", "Undefined", "scrollToPosition", "(I)V");
                        }
                    }
                } else {
                    z17 = false;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } else {
                bool = null;
            }
            int h18 = a7Var.f106210g.h();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            finderItem.setCommentCount(finderItem.getCommentCount() + (h18 - h17));
            bu2.j jVar = bu2.j.f24534a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            jVar.n(finderItem2, bu2.i.f24524e);
            bool2 = bool;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.R) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var2 = a7Var.f106217p;
            if (p2Var2 != null) {
                dm.w3 w3Var2 = taVar.f7996d;
                kotlin.jvm.internal.o.e(w3Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var2.b((com.tencent.mm.plugin.finder.storage.yj0) w3Var2, 1));
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.Y) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var3 = a7Var.f106217p;
            if (p2Var3 != null) {
                dm.w3 w3Var3 = taVar.f7996d;
                kotlin.jvm.internal.o.e(w3Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var3.b((com.tencent.mm.plugin.finder.storage.yj0) w3Var3, 6));
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.U) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var4 = a7Var.f106217p;
            if (p2Var4 != null) {
                long j17 = taVar.f7994b;
                com.tencent.mm.plugin.finder.feed.a7 a7Var3 = p2Var4.f108695b;
                int e18 = a7Var3.f106210g.e(j17);
                if (e18 != -1) {
                    java.lang.Object obj = a7Var3.f106210g.f108469d.get(e18);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = ((so2.y0) obj).f410703d;
                    yj0Var2.l1(yj0Var2.z0() & (-257));
                    androidx.recyclerview.widget.f2 adapter4 = p2Var4.f108694a.getAdapter();
                    if (adapter4 != null) {
                        adapter4.notifyItemChanged(e18, 1);
                    }
                } else {
                    z17 = false;
                }
                bool2 = java.lang.Boolean.valueOf(z17);
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.T) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var5 = a7Var.f106217p;
            if (p2Var5 != null) {
                long j18 = taVar.f7994b;
                com.tencent.mm.plugin.finder.feed.a7 a7Var4 = p2Var5.f108695b;
                java.util.ArrayList arrayList2 = a7Var4.f106210g.f108469d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                so2.y0 y0Var = null;
                int i19 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.y0 y0Var2 = (so2.y0) next;
                    if (y0Var2.f410703d.t0() == j18) {
                        y0Var = y0Var2;
                    }
                    if (y0Var2.f410703d.Y0() == j18) {
                        arrayList3.add(next);
                    }
                    i19 = i27;
                }
                java.util.List V0 = kz5.n0.V0(arrayList3);
                if (y0Var != null) {
                    ((java.util.ArrayList) V0).add(0, y0Var);
                }
                arrayList2.removeAll(V0);
                if (!((java.util.ArrayList) V0).isEmpty()) {
                    com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var4.f106210g;
                    java.util.Iterator it6 = yVar.f108469d.iterator();
                    while (it6.hasNext()) {
                        so2.y0 y0Var3 = (so2.y0) it6.next();
                        if (hc2.c0.c(y0Var3.f410703d.z0())) {
                            com.tencent.mm.plugin.finder.storage.yj0 yj0Var3 = y0Var3.f410703d;
                            yj0Var3.l1(yj0Var3.z0() & (-257));
                        }
                    }
                    if (y0Var != null) {
                        com.tencent.mm.plugin.finder.storage.yj0 yj0Var4 = y0Var.f410703d;
                        yj0Var4.l1(yj0Var4.z0() | 256);
                        yVar.b(V0, true, false);
                    }
                    androidx.recyclerview.widget.f2 adapter5 = p2Var5.f108694a.getAdapter();
                    if (adapter5 != null) {
                        adapter5.notifyDataSetChanged();
                    }
                }
                bool2 = java.lang.Boolean.FALSE;
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.W) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var6 = a7Var.f106217p;
            if (p2Var6 != null) {
                dm.w3 w3Var4 = taVar.f7996d;
                kotlin.jvm.internal.o.e(w3Var4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var6.b((com.tencent.mm.plugin.finder.storage.yj0) w3Var4, 4));
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.X) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var7 = a7Var.f106217p;
            if (p2Var7 != null) {
                dm.w3 w3Var5 = taVar.f7996d;
                kotlin.jvm.internal.o.e(w3Var5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var7.b((com.tencent.mm.plugin.finder.storage.yj0) w3Var5, 5));
            }
            bool2 = null;
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.V) {
            so2.y0 y0Var4 = a7Var.G1;
            if (y0Var4 != null) {
                if (taVar.f7994b == y0Var4.f410703d.t0()) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.u2(a7Var, y0Var4));
                }
                a7Var.G1 = null;
            }
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.Z) {
            int e19 = a7Var.f106210g.e(taVar.f7994b);
            if (e19 != -1) {
                java.lang.Object obj2 = a7Var.f106210g.f108469d.get(e19);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                so2.y0 y0Var5 = (so2.y0) obj2;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
                if (finderItem3 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                if (hc2.o0.H(finderItem3.getFeedObject())) {
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var5 = y0Var5.f410703d;
                    yj0Var5.l1(yj0Var5.z0() | 1);
                    com.tencent.mm.protocal.protobuf.FinderCommentInfo u07 = y0Var5.f410703d.u0();
                    r45.dc dcVar = new r45.dc();
                    dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                    u07.setAuthor_reaction_info(dcVar);
                }
                yw2.a0 a0Var3 = a7Var.f106216o;
                if (a0Var3 != null && (recyclerView2 = a0Var3.s().getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                    adapter2.notifyItemChanged(e19);
                }
            }
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.f128259p0 && (e17 = a7Var.f106210g.e(taVar.f7994b)) != -1) {
            java.lang.Object obj3 = a7Var.f106210g.f108469d.get(e17);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            so2.y0 y0Var6 = (so2.y0) obj3;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = a7Var.f106212i;
            if (finderItem4 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (hc2.o0.H(finderItem4.getFeedObject())) {
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var6 = y0Var6.f410703d;
                yj0Var6.l1(yj0Var6.z0() & (-2));
            }
            yw2.a0 a0Var4 = a7Var.f106216o;
            if (a0Var4 != null && (recyclerView = a0Var4.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemChanged(e17);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "[onNotifyChange] " + finderCommentChangeEvent + " result=" + bool2);
        return jz5.f0.f302826a;
    }
}

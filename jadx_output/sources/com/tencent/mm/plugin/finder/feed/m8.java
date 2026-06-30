package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f107362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f107363b;

    public m8(com.tencent.mm.plugin.finder.feed.t8 t8Var, yz5.a aVar) {
        this.f107362a = t8Var;
        this.f107363b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List dataList;
        so2.j5 j5Var;
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList2;
        com.tencent.mm.plugin.finder.feed.i0 i0Var2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        androidx.recyclerview.widget.f2 adapter3;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        androidx.recyclerview.widget.f2 adapter4;
        androidx.recyclerview.widget.RecyclerView recyclerView5;
        androidx.recyclerview.widget.f2 adapter5;
        androidx.recyclerview.widget.RecyclerView recyclerView6;
        androidx.recyclerview.widget.f2 adapter6;
        androidx.recyclerview.widget.RecyclerView recyclerView7;
        androidx.recyclerview.widget.f2 adapter7;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        android.view.View f213435x;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        dw2.c0 c0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView8;
        androidx.recyclerview.widget.f2 adapter8;
        java.util.AbstractCollection dataList3;
        java.util.AbstractCollection dataList4;
        r45.x31 x31Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f107362a;
        v1Var.l(t8Var.f106427m, false, false, false);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if ((i17 != 0 || fVar.f70616b != 0) && !hc2.p.b(i17, fVar.f70616b)) {
            int i18 = fVar.f70616b;
            if (i18 != -4011 && i18 != -4033 && i18 != -4036 && i18 != -5002) {
                yz5.p pVar = t8Var.I;
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(i18), fVar.f70617c);
                }
                v1Var.w(t8Var.f106427m, null);
                return f0Var;
            }
            bu2.j.f24534a.l(t8Var.C);
            yz5.p pVar2 = t8Var.I;
            if (pVar2 != null) {
                pVar2.invoke(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
            }
            com.tencent.mm.plugin.finder.report.v1.o(v1Var, t8Var.f106427m, false, null, false, 0L, false, 60, null);
            return f0Var;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (finderObject == null) {
            return null;
        }
        java.lang.String str = ((com.tencent.mm.plugin.finder.ui.qm) t8Var).f129749x0;
        com.tencent.mars.xlog.Log.i(str, "get feed detail success");
        t8Var.u0("get feed detail success", finderObject);
        com.tencent.mm.ui.MMActivity activity = t8Var.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).O6(t8Var.F, finderObject.getId());
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        finderContact.setUsername(contact != null ? contact.getUsername() : null);
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
        finderContact.setNickname(contact2 != null ? contact2.getNickname() : null);
        com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
        finderContact.setHeadUrl(contact3 != null ? contact3.getHeadUrl() : null);
        com.tencent.mm.protocal.protobuf.FinderContact contact4 = finderObject.getContact();
        finderContact.setAuthInfo(contact4 != null ? contact4.getAuthInfo() : null);
        com.tencent.mm.protocal.protobuf.FinderContact contact5 = finderObject.getContact();
        finderContact.setExtInfo(contact5 != null ? contact5.getExtInfo() : null);
        java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_FINDER_FORWARD_SOURCE");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            r45.dm2 object_extend = finderObject.getObject_extend();
            if (object_extend != null) {
                if (((r45.x31) object_extend.getCustom(7)) == null) {
                    object_extend.set(7, new r45.x31());
                }
                r45.x31 x31Var2 = (r45.x31) object_extend.getCustom(7);
                if (x31Var2 != null) {
                    x31Var2.set(0, stringExtra);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace first finderForwardSource:");
            r45.dm2 object_extend2 = finderObject.getObject_extend();
            sb6.append((object_extend2 == null || (x31Var = (r45.x31) object_extend2.getCustom(7)) == null) ? null : x31Var.getString(0));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
        ya2.g.m(ya2.h.f460484a, finderContact, false, 2, null);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
        h0Var.f310123d = a17;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        a17.setCommentScene(nyVar != null ? nyVar.f135380n : 0);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d);
        long longExtra = activity.getIntent().getLongExtra("key_product_id", -1L);
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("key_product_extra");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        p17.W0(longExtra);
        p17.I1(stringExtra2);
        yz5.p pVar3 = t8Var.f109045J;
        if (pVar3 != null) {
            pVar3.invoke(finderObject, p17);
        }
        t8Var.C = finderObject.getId();
        r45.dm2 object_extend3 = finderObject.getObject_extend();
        t8Var.D = object_extend3 != null ? object_extend3.getString(62) : null;
        sc2.p2.f406143b.a().a(kz5.b0.c(h0Var.f310123d));
        bu2.j.f24534a.n((com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d, bu2.i.f24531l);
        if (t8Var.K == null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = t8Var.f106570t;
            if (baseFeedLoader != null && (dataList4 = baseFeedLoader.getDataList()) != null) {
                dataList4.clear();
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = t8Var.f106570t;
            if (baseFeedLoader2 != null && (dataList3 = baseFeedLoader2.getDataList()) != null) {
                dataList3.add(p17);
            }
            com.tencent.mm.plugin.finder.feed.i0 i0Var3 = t8Var.f106424g;
            if (i0Var3 != null && (recyclerView8 = i0Var3.getRecyclerView()) != null && (adapter8 = recyclerView8.getAdapter()) != null) {
                adapter8.notifyDataSetChanged();
            }
            v1Var.k(t8Var.f106427m);
            if (((com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d).isMemberFeed() && (c0Var = t8Var.f106429o.f223703n) != null) {
                c0Var.y("memberVideo", true, true);
            }
            pm0.v.V(300L, new com.tencent.mm.plugin.finder.feed.l8(t8Var, h0Var));
        } else if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127932sa).getValue()).r()).booleanValue()) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = t8Var.f106570t;
            if (baseFeedLoader3 != null && (dataList2 = baseFeedLoader3.getDataList()) != 0) {
                java.util.Iterator it = dataList2.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    so2.j5 j5Var2 = (so2.j5) it.next();
                    if ((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getId() == p17.getFeedObject().getId()) {
                        break;
                    }
                    i19++;
                }
                int i27 = i19;
                if (i27 >= 0) {
                    dataList2.remove(i27);
                    dataList2.add(i27, p17);
                }
                com.tencent.mars.xlog.Log.i(str, "refresh index " + i27);
                com.tencent.mm.plugin.finder.feed.i0 i0Var4 = t8Var.f106424g;
                if (i0Var4 != null && (recyclerView7 = i0Var4.getRecyclerView()) != null && (adapter7 = recyclerView7.getAdapter()) != null) {
                    adapter7.notifyItemChanged(i27, new jz5.l(12, null));
                }
                com.tencent.mm.plugin.finder.feed.i0 i0Var5 = t8Var.f106424g;
                if (i0Var5 != null && (recyclerView6 = i0Var5.getRecyclerView()) != null && (adapter6 = recyclerView6.getAdapter()) != null) {
                    adapter6.notifyItemChanged(i27, new jz5.l(45, null));
                }
                com.tencent.mm.plugin.finder.feed.i0 i0Var6 = t8Var.f106424g;
                if (i0Var6 != null && (recyclerView5 = i0Var6.getRecyclerView()) != null && (adapter5 = recyclerView5.getAdapter()) != null) {
                    adapter5.notifyItemChanged(i27, new jz5.l(48, null));
                }
                com.tencent.mm.plugin.finder.feed.i0 i0Var7 = t8Var.f106424g;
                if (i0Var7 != null && (recyclerView4 = i0Var7.getRecyclerView()) != null && (adapter4 = recyclerView4.getAdapter()) != null) {
                    adapter4.notifyItemChanged(i27, new jz5.l(49, null));
                }
                if (t8Var.G != 0 && !((com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d).isMemberFeed() && (i0Var2 = t8Var.f106424g) != null && (recyclerView3 = i0Var2.getRecyclerView()) != null && (adapter3 = recyclerView3.getAdapter()) != null) {
                    adapter3.notifyItemChanged(i27, new jz5.l(53, java.lang.Long.valueOf(t8Var.G)));
                }
                com.tencent.mars.xlog.Log.i(str, "cache exit, refresh apart");
            }
        } else {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader4 = t8Var.f106570t;
            if (baseFeedLoader4 != null && (dataList = baseFeedLoader4.getDataList()) != null && (j5Var = (so2.j5) kz5.n0.a0(dataList, 0)) != null) {
                if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                    j5Var = null;
                }
                if (j5Var != null) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    baseFinderFeed.getFeedObject().setCommentCount(p17.getFeedObject().getCommentCount());
                    baseFinderFeed.getFeedObject().setLikeCount(p17.getFeedObject().getLikeCount());
                    baseFinderFeed.getFeedObject().setForwardCount(p17.getFeedObject().getForwardCount());
                    com.tencent.mm.protocal.protobuf.FinderContact contact6 = p17.getFeedObject().getFeedObject().getContact();
                    if (contact6 != null) {
                        baseFinderFeed.getFeedObject().getFeedObject().setContact(contact6);
                        baseFinderFeed.a1(ya2.d.h(contact6, null, false, 3, null));
                    }
                    com.tencent.mm.plugin.finder.feed.i0 i0Var8 = t8Var.f106424g;
                    if (i0Var8 != null && (recyclerView2 = i0Var8.getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                        adapter2.notifyItemChanged(0, new jz5.l(12, null));
                    }
                    if (t8Var.G != 0 && !((com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d).isMemberFeed() && (i0Var = t8Var.f106424g) != null && (recyclerView = i0Var.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyItemChanged(0, new jz5.l(53, java.lang.Long.valueOf(t8Var.G)));
                    }
                }
            }
        }
        t8Var.i0(p17);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[loadFirstFeed] feed=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = t8Var.K;
        sb7.append((baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject2.getId()));
        sb7.append(" => ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = t8Var.K;
        sb7.append((baseFinderFeed3 == null || (feedObject = baseFinderFeed3.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? null : mb4Var.getString(0));
        sb7.append(" updateFeed=");
        sb7.append(p17.getFeedObject().getId());
        sb7.append(" => ");
        r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(p17.getFeedObject().getMediaList());
        sb7.append(mb4Var2 != null ? mb4Var2.getString(0) : null);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        if ((!kotlin.jvm.internal.o.b("WeApp", activity.getIntent().getStringExtra("KEY_FROM_SOURCE")) && !kotlin.jvm.internal.o.b("GlobalFav", activity.getIntent().getStringExtra("KEY_FROM_SOURCE"))) || activity.getIntent().getBooleanExtra("key_need_related_list", false)) {
            this.f107363b.invoke();
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i(str, "小程序拦截");
        com.tencent.mm.plugin.finder.feed.i0 i0Var9 = t8Var.f106424g;
        if (i0Var9 != null && (o17 = i0Var9.o()) != null && (f213435x = o17.getF213435x()) != null) {
            android.view.View findViewById = f213435x.findViewById(com.tencent.mm.R.id.m6l);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = f213435x.findViewById(com.tencent.mm.R.id.ile);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        t8Var.H = false;
        return f0Var;
    }
}

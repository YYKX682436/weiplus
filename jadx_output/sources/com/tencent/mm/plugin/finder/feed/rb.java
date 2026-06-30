package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rb implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.wb f108900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f108901b;

    public rb(com.tencent.mm.plugin.finder.feed.wb wbVar, yz5.a aVar) {
        this.f108900a = wbVar;
        this.f108901b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List dataList;
        so2.j5 j5Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        java.util.AbstractCollection dataList2;
        java.util.AbstractCollection dataList3;
        r45.x31 x31Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.plugin.finder.feed.wb wbVar = this.f108900a;
        v1Var.l(wbVar.f106427m, false, false, false);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                java.lang.String str = wbVar.f110965y;
                com.tencent.mars.xlog.Log.i(str, "get feed detail success");
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
                com.tencent.mm.ui.MMActivity mMActivity = wbVar.f106421d;
                java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("KEY_FINDER_FORWARD_SOURCE");
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
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                a17.setCommentScene(nyVar != null ? nyVar.f135380n : 0);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a17);
                yz5.l lVar = wbVar.D;
                if (lVar != null) {
                    lVar.invoke(finderObject);
                }
                wbVar.f110966z = finderObject.getId();
                sc2.p2.f406143b.a().a(kz5.b0.c(a17));
                bu2.j.f24534a.n(a17, bu2.i.f24531l);
                if (wbVar.E == null) {
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = wbVar.f106570t;
                    if (baseFeedLoader != null && (dataList3 = baseFeedLoader.getDataList()) != null) {
                        dataList3.clear();
                    }
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = wbVar.f106570t;
                    if (baseFeedLoader2 != null && (dataList2 = baseFeedLoader2.getDataList()) != null) {
                        dataList2.add(p17);
                    }
                    com.tencent.mm.plugin.finder.feed.i0 i0Var = wbVar.f106424g;
                    if (i0Var != null && (recyclerView2 = i0Var.getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                        adapter2.notifyDataSetChanged();
                    }
                    v1Var.k(wbVar.f106427m);
                    pm0.v.V(300L, new com.tencent.mm.plugin.finder.feed.qb(wbVar));
                } else {
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = wbVar.f106570t;
                    if (baseFeedLoader3 != null && (dataList = baseFeedLoader3.getDataList()) != null && (j5Var = (so2.j5) kz5.n0.a0(dataList, 0)) != null) {
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
                            com.tencent.mm.plugin.finder.feed.i0 i0Var2 = wbVar.f106424g;
                            if (i0Var2 != null && (recyclerView = i0Var2.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                                adapter.notifyItemChanged(0, new jz5.l(12, null));
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[loadFirstFeed] feed=");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = wbVar.E;
                sb7.append((baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject2.getId()));
                sb7.append(" => ");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = wbVar.E;
                sb7.append((baseFinderFeed3 == null || (feedObject = baseFinderFeed3.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? null : mb4Var.getString(0));
                sb7.append(" updateFeed=");
                sb7.append(p17.getFeedObject().getId());
                sb7.append(" => ");
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(p17.getFeedObject().getMediaList());
                sb7.append(mb4Var2 != null ? mb4Var2.getString(0) : null);
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
                this.f108901b.invoke();
                return f0Var;
            }
        } else {
            int i18 = fVar.f70616b;
            if (i18 == -4011 || i18 == -4033 || i18 == -4036 || i18 == -5002) {
                bu2.j.f24534a.l(wbVar.f110966z);
                yz5.p pVar = wbVar.C;
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
                    return f0Var;
                }
            } else {
                yz5.p pVar2 = wbVar.C;
                if (pVar2 != null) {
                    pVar2.invoke(java.lang.Integer.valueOf(i18), fVar.f70617c);
                    return f0Var;
                }
            }
        }
        return null;
    }
}

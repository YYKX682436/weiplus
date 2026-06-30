package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wk implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f110993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f110994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f110995c;

    public wk(com.tencent.mm.plugin.finder.feed.tl tlVar, yz5.p pVar, yz5.l lVar) {
        this.f110993a = tlVar;
        this.f110994b = pVar;
        this.f110995c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f110993a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "get feed detail success");
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
                ya2.g.m(ya2.h.f460484a, finderContact, false, 2, null);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                so2.u1 u1Var = (so2.u1) cu2.u.f222441a.p(a17);
                yz5.l lVar = this.f110995c;
                if (lVar != null) {
                    lVar.invoke(finderObject);
                }
                tlVar.f109084v = finderObject.getId();
                com.tencent.mm.ui.MMActivity activity = tlVar.f109069d;
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("first_feedid", pm0.v.u(tlVar.f109084v));
                java.lang.String objectNonceId = finderObject.getObjectNonceId();
                if (objectNonceId == null) {
                    objectNonceId = "";
                }
                tlVar.f109086x = objectNonceId;
                bu2.j.f24534a.n(a17, bu2.i.f24531l);
                so2.u1 u1Var2 = tlVar.f109087y;
                if (u1Var2 != null) {
                    u1Var2.getFeedObject().setCommentCount(u1Var.getFeedObject().getCommentCount());
                    u1Var2.getFeedObject().setLikeCount(u1Var.getFeedObject().getLikeCount());
                    u1Var2.getFeedObject().setForwardCount(u1Var.getFeedObject().getForwardCount());
                    com.tencent.mm.protocal.protobuf.FinderContact contact6 = u1Var.getFeedObject().getFeedObject().getContact();
                    if (contact6 != null) {
                        u1Var2.getFeedObject().getFeedObject().setContact(contact6);
                        u1Var2.a1(ya2.d.h(contact6, null, false, 3, null));
                    }
                    com.tencent.mm.plugin.finder.feed.tl.b(tlVar, u1Var2, new jz5.l(12, null), 0, 4, null);
                    com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "cache exit,refresh apart");
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mm.plugin.finder.feed.tl.b(tlVar, u1Var, null, 0, 6, null);
                    tlVar.e().getDataListJustForAdapter().clear();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[loadFirstFeed] feed=");
                so2.u1 u1Var3 = tlVar.f109087y;
                sb6.append((u1Var3 == null || (feedObject2 = u1Var3.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject2.getId()));
                sb6.append(" => ");
                so2.u1 u1Var4 = tlVar.f109087y;
                sb6.append((u1Var4 == null || (feedObject = u1Var4.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? null : mb4Var.getString(0));
                sb6.append(" updateFeed=");
                sb6.append(u1Var.getFeedObject().getId());
                sb6.append(" => ");
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(u1Var.getFeedObject().getMediaList());
                sb6.append(mb4Var2 != null ? mb4Var2.getString(0) : null);
                com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", sb6.toString());
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.vk(tlVar));
                return f0Var2;
            }
        } else {
            int i18 = fVar.f70616b;
            yz5.p pVar = this.f110994b;
            if (i18 == -4011 || i18 == -4033 || i18 == -4036 || i18 == -5002) {
                bu2.j.f24534a.l(tlVar.f109084v);
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
                    return f0Var2;
                }
            } else if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), fVar.f70617c);
                return f0Var2;
            }
        }
        return null;
    }
}

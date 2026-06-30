package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f107117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(0);
        this.f107117d = feedUpdateEvent;
        this.f107118e = tlVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.u1 u1Var;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f107117d;
        feedUpdateEvent.f54252g.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        am.ia iaVar = feedUpdateEvent.f54252g;
        sb6.append(iaVar.f6918a);
        sb6.append(",fav = ");
        sb6.append(iaVar.f6920c);
        sb6.append(",like = ");
        sb6.append(iaVar.f6922e);
        sb6.append(",likeCount = ");
        sb6.append(iaVar.f6923f);
        sb6.append(" ,needChangeData = ");
        sb6.append(iaVar.f6921d);
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", sb6.toString());
        int i17 = iaVar.f6919b;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107118e;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 4) {
                    if (i17 != 5) {
                        if (i17 == 20 && iaVar.f6918a != 0) {
                            java.lang.Object obj = tlVar.f().f293125i;
                            so2.u1 u1Var2 = obj instanceof so2.u1 ? (so2.u1) obj : null;
                            if (u1Var2 != null && u1Var2.getItemId() == iaVar.f6918a) {
                                r9 = 1;
                            }
                            if (r9 != 0) {
                                so2.u1 u1Var3 = (so2.u1) tlVar.f().f293125i;
                                com.tencent.mm.plugin.finder.feed.tl tlVar2 = this.f107118e;
                                kotlin.jvm.internal.o.d(u1Var3);
                                com.tencent.mm.plugin.finder.feed.tl.b(tlVar2, u1Var3, new jz5.l(12, null), 0, 4, null);
                            }
                        }
                    } else if (iaVar.f6918a != 0) {
                        java.lang.Object obj2 = tlVar.f().f293125i;
                        u1Var = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                        if (u1Var != null && u1Var.getItemId() == iaVar.f6918a) {
                            so2.u1 u1Var4 = (so2.u1) tlVar.f().f293125i;
                            r9 = iaVar.f6920c == 1 ? 1 : 0;
                            if (iaVar.f6921d == 1) {
                                com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "TYPE_FAV_CHANGED oldFlag = " + u1Var4.getFeedObject().getFavFlag() + ", eventFlag = " + r9);
                                if (u1Var4.getFeedObject().getFavFlag() != r9) {
                                    u1Var4.getFeedObject().setFavFlag(r9);
                                    com.tencent.mm.plugin.finder.feed.tl.b(this.f107118e, u1Var4, new jz5.l(4, 1), 0, 4, null);
                                    com.tencent.mm.plugin.finder.feed.tl.b(this.f107118e, u1Var4, new jz5.l(9, 1), 0, 4, null);
                                }
                            } else {
                                com.tencent.mm.plugin.finder.feed.tl tlVar3 = this.f107118e;
                                kotlin.jvm.internal.o.d(u1Var4);
                                com.tencent.mm.plugin.finder.feed.tl.b(tlVar3, u1Var4, new jz5.l(4, 1), 0, 4, null);
                                com.tencent.mm.plugin.finder.feed.tl.b(this.f107118e, u1Var4, new jz5.l(9, 1), 0, 4, null);
                            }
                            if (iaVar.f6928k > 0) {
                                com.tencent.mm.plugin.finder.feed.tl tlVar4 = this.f107118e;
                                kotlin.jvm.internal.o.d(u1Var4);
                                com.tencent.mm.plugin.finder.feed.tl.b(tlVar4, u1Var4, new jz5.l(35, feedUpdateEvent), 0, 4, null);
                            }
                        }
                    }
                } else if (iaVar.f6918a != 0) {
                    java.lang.Object obj3 = tlVar.f().f293125i;
                    u1Var = obj3 instanceof so2.u1 ? (so2.u1) obj3 : null;
                    if (u1Var != null && u1Var.getItemId() == iaVar.f6918a) {
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        so2.u1 u1Var5 = (so2.u1) tlVar.f().f293125i;
                        if (iaVar.f6921d == 1) {
                            int i18 = iaVar.f6922e;
                            int likeFlag = u1Var5.getFeedObject().getLikeFlag();
                            com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "TYPE_FEED_LIKE_CHANGED oldFlag:" + likeFlag + ", newFlag:" + i18);
                            if (likeFlag != i18) {
                                u1Var5.getFeedObject().setLikeFlag(i18);
                                if (likeFlag == 0) {
                                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = u1Var5.getFeedObject();
                                    feedObject.setLikeCount(feedObject.getLikeCount() + 1);
                                } else if (i18 == 0) {
                                    u1Var5.getFeedObject().setLikeCount(r4.getLikeCount() - 1);
                                }
                                if (i18 == 1) {
                                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = u1Var5.getFeedObject();
                                    feedObject2.setFriendLikeCount(feedObject2.getFriendLikeCount() + 1);
                                    nv2.n1.f340551h.a(u1Var5.getFeedObject().getLikeList());
                                } else if (likeFlag == 1) {
                                    u1Var5.getFeedObject().setFriendLikeCount(r4.getFriendLikeCount() - 1);
                                    nv2.n1.f340551h.o(u1Var5.getFeedObject().getLikeList());
                                }
                                com.tencent.mm.plugin.finder.feed.tl.b(this.f107118e, u1Var5, new jz5.l(3, 1), 0, 4, null);
                            }
                        } else {
                            com.tencent.mm.plugin.finder.feed.tl tlVar5 = this.f107118e;
                            kotlin.jvm.internal.o.d(u1Var5);
                            com.tencent.mm.plugin.finder.feed.tl.b(tlVar5, u1Var5, new jz5.l(3, 1), 0, 4, null);
                        }
                        if (iaVar.f6928k > 0) {
                            com.tencent.mm.plugin.finder.feed.tl tlVar6 = this.f107118e;
                            kotlin.jvm.internal.o.d(u1Var5);
                            com.tencent.mm.plugin.finder.feed.tl.b(tlVar6, u1Var5, new jz5.l(35, feedUpdateEvent), 0, 4, null);
                        }
                    }
                }
            } else if (iaVar.f6918a != 0) {
                java.lang.Object obj4 = tlVar.f().f293125i;
                u1Var = obj4 instanceof so2.u1 ? (so2.u1) obj4 : null;
                if (u1Var != null && u1Var.getItemId() == iaVar.f6918a) {
                    r9 = 1;
                }
                if (r9 != 0) {
                    java.lang.Object obj5 = tlVar.f().f293125i;
                    kotlin.jvm.internal.o.f(obj5, "getAssociatedObject(...)");
                    com.tencent.mm.plugin.finder.feed.tl.b(tlVar, (so2.u1) obj5, new jz5.l(29, 1), 0, 4, null);
                }
            }
        } else if (iaVar.f6918a != 0) {
            java.lang.Object obj6 = tlVar.f().f293125i;
            u1Var = obj6 instanceof so2.u1 ? (so2.u1) obj6 : null;
            if (u1Var != null && u1Var.getItemId() == iaVar.f6918a) {
                r9 = 1;
            }
            if (r9 != 0) {
                bu2.j jVar = bu2.j.f24534a;
                kotlin.jvm.internal.o.d(iaVar);
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = jVar.h(iaVar.f6918a);
                if (h17 != null) {
                    com.tencent.mm.plugin.finder.feed.tl.b(this.f107118e, (so2.u1) cu2.u.f222441a.p(h17), 1, 0, 4, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

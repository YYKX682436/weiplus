package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f188650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f188651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar) {
        super(0);
        this.f188650d = c5445x963cab3;
        this.f188651e = tlVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        so2.u1 u1Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f188650d;
        c5445x963cab3.f135785g.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        am.ia iaVar = c5445x963cab3.f135785g;
        sb6.append(iaVar.f88451a);
        sb6.append(",fav = ");
        sb6.append(iaVar.f88453c);
        sb6.append(",like = ");
        sb6.append(iaVar.f88455e);
        sb6.append(",likeCount = ");
        sb6.append(iaVar.f88456f);
        sb6.append(" ,needChangeData = ");
        sb6.append(iaVar.f88454d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", sb6.toString());
        int i17 = iaVar.f88452b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f188651e;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 4) {
                    if (i17 != 5) {
                        if (i17 == 20 && iaVar.f88451a != 0) {
                            java.lang.Object obj = tlVar.f().f374658i;
                            so2.u1 u1Var2 = obj instanceof so2.u1 ? (so2.u1) obj : null;
                            if (u1Var2 != null && u1Var2.mo2128x1ed62e84() == iaVar.f88451a) {
                                r9 = 1;
                            }
                            if (r9 != 0) {
                                so2.u1 u1Var3 = (so2.u1) tlVar.f().f374658i;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar2 = this.f188651e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var3);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar2, u1Var3, new jz5.l(12, null), 0, 4, null);
                            }
                        }
                    } else if (iaVar.f88451a != 0) {
                        java.lang.Object obj2 = tlVar.f().f374658i;
                        u1Var = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                        if (u1Var != null && u1Var.mo2128x1ed62e84() == iaVar.f88451a) {
                            so2.u1 u1Var4 = (so2.u1) tlVar.f().f374658i;
                            r9 = iaVar.f88453c == 1 ? 1 : 0;
                            if (iaVar.f88454d == 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "TYPE_FAV_CHANGED oldFlag = " + u1Var4.getFeedObject().m59236xfdaf34f1() + ", eventFlag = " + r9);
                                if (u1Var4.getFeedObject().m59236xfdaf34f1() != r9) {
                                    u1Var4.getFeedObject().m59374x71208265(r9);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188651e, u1Var4, new jz5.l(4, 1), 0, 4, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188651e, u1Var4, new jz5.l(9, 1), 0, 4, null);
                                }
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar3 = this.f188651e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var4);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar3, u1Var4, new jz5.l(4, 1), 0, 4, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188651e, u1Var4, new jz5.l(9, 1), 0, 4, null);
                            }
                            if (iaVar.f88461k > 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar4 = this.f188651e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var4);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar4, u1Var4, new jz5.l(35, c5445x963cab3), 0, 4, null);
                            }
                        }
                    }
                } else if (iaVar.f88451a != 0) {
                    java.lang.Object obj3 = tlVar.f().f374658i;
                    u1Var = obj3 instanceof so2.u1 ? (so2.u1) obj3 : null;
                    if (u1Var != null && u1Var.mo2128x1ed62e84() == iaVar.f88451a) {
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        so2.u1 u1Var5 = (so2.u1) tlVar.f().f374658i;
                        if (iaVar.f88454d == 1) {
                            int i18 = iaVar.f88455e;
                            int m59255xbd8ebd19 = u1Var5.getFeedObject().m59255xbd8ebd19();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "TYPE_FEED_LIKE_CHANGED oldFlag:" + m59255xbd8ebd19 + ", newFlag:" + i18);
                            if (m59255xbd8ebd19 != i18) {
                                u1Var5.getFeedObject().m59386xb8471e25(i18);
                                if (m59255xbd8ebd19 == 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = u1Var5.getFeedObject();
                                    feedObject.m59385x50740976(feedObject.m59254xf4204902() + 1);
                                } else if (i18 == 0) {
                                    u1Var5.getFeedObject().m59385x50740976(r4.m59254xf4204902() - 1);
                                }
                                if (i18 == 1) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = u1Var5.getFeedObject();
                                    feedObject2.m59382x2d5669f8(feedObject2.m59247xf67fd084() + 1);
                                    nv2.n1.f422084h.a(u1Var5.getFeedObject().m59256xbd916e4b());
                                } else if (m59255xbd8ebd19 == 1) {
                                    u1Var5.getFeedObject().m59382x2d5669f8(r4.m59247xf67fd084() - 1);
                                    nv2.n1.f422084h.o(u1Var5.getFeedObject().m59256xbd916e4b());
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188651e, u1Var5, new jz5.l(3, 1), 0, 4, null);
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar5 = this.f188651e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var5);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar5, u1Var5, new jz5.l(3, 1), 0, 4, null);
                        }
                        if (iaVar.f88461k > 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar6 = this.f188651e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var5);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar6, u1Var5, new jz5.l(35, c5445x963cab3), 0, 4, null);
                        }
                    }
                }
            } else if (iaVar.f88451a != 0) {
                java.lang.Object obj4 = tlVar.f().f374658i;
                u1Var = obj4 instanceof so2.u1 ? (so2.u1) obj4 : null;
                if (u1Var != null && u1Var.mo2128x1ed62e84() == iaVar.f88451a) {
                    r9 = 1;
                }
                if (r9 != 0) {
                    java.lang.Object obj5 = tlVar.f().f374658i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "getAssociatedObject(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar, (so2.u1) obj5, new jz5.l(29, 1), 0, 4, null);
                }
            }
        } else if (iaVar.f88451a != 0) {
            java.lang.Object obj6 = tlVar.f().f374658i;
            u1Var = obj6 instanceof so2.u1 ? (so2.u1) obj6 : null;
            if (u1Var != null && u1Var.mo2128x1ed62e84() == iaVar.f88451a) {
                r9 = 1;
            }
            if (r9 != 0) {
                bu2.j jVar = bu2.j.f106067a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iaVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = jVar.h(iaVar.f88451a);
                if (h17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188651e, (so2.u1) cu2.u.f303974a.p(h17), 1, 0, 4, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

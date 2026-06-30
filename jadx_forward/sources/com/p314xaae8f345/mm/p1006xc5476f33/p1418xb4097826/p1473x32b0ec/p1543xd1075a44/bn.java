package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class bn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn f199444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar) {
        super(2);
        this.f199444d = mnVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        java.util.ArrayList arrayList;
        java.lang.Object obj4;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.mu2 searchInfo = (r45.mu2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchInfo, "searchInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invite search panel item click, nickname:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) searchInfo.m75936x14adae67(0);
        jz5.f0 f0Var = null;
        sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) searchInfo.m75936x14adae67(0);
        if (c19782x23db1cfa2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar = this.f199444d;
            java.lang.String m76197x6c03c64c = c19782x23db1cfa2.m76197x6c03c64c();
            java.util.List list = ((mm2.o4) mnVar.f200618f.P0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj3).f390705c, m76197x6c03c64c)) {
                        break;
                    }
                }
            }
            if (obj3 != null) {
                qo0.c cVar = mnVar.f200617e;
                qo0.b bVar = qo0.b.M3;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String m76197x6c03c64c2 = c19782x23db1cfa2.m76197x6c03c64c();
                if (m76197x6c03c64c2 == null) {
                    m76197x6c03c64c2 = "";
                }
                bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", m76197x6c03c64c2);
                cVar.mo46557x60d69242(bVar, bundle);
            } else if (((mm2.y2) mnVar.f200618f.P0(mm2.y2.class)).N6(true, 1, false)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                mnVar.a();
                mnVar.f200618f.C1();
                km2.q qVar = (km2.q) mnVar.f200630u.get(c19782x23db1cfa2.m76197x6c03c64c());
                if (qVar != null) {
                    qVar.f390714l = 6;
                    r45.xn1 xn1Var = qVar.f390720r;
                    if (xn1Var != null) {
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.mo14344x5f01b1f6());
                        mnVar.f200617e.mo46557x60d69242(qo0.b.Y3, bundle3);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, accept pk, but selectUser.contact is null.");
                    }
                    mnVar.f200628s.m8146xced61ae5();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, accept pk.");
                } else {
                    java.util.List list2 = ((mm2.o4) mnVar.f200618f.P0(mm2.o4.class)).f410852p;
                    if (list2 != null) {
                        synchronized (list2) {
                            java.util.Iterator it6 = list2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it6.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj4).f390705c, c19782x23db1cfa2.m76197x6c03c64c())) {
                                    break;
                                }
                            }
                        }
                        km2.q qVar2 = (km2.q) obj4;
                        if (qVar2 != null) {
                            if (qVar2.m()) {
                                qVar2.f390714l = 6;
                                qo0.c cVar2 = mnVar.f200617e;
                                qo0.b bVar2 = qo0.b.M3;
                                android.os.Bundle bundle4 = new android.os.Bundle();
                                java.lang.String m76197x6c03c64c3 = c19782x23db1cfa2.m76197x6c03c64c();
                                if (m76197x6c03c64c3 == null) {
                                    m76197x6c03c64c3 = "";
                                }
                                bundle4.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", m76197x6c03c64c3);
                                cVar2.mo46557x60d69242(bVar2, bundle4);
                            } else {
                                r45.xn1 xn1Var2 = new r45.xn1();
                                xn1Var2.set(0, c19782x23db1cfa2);
                                qVar2.f390714l = 6;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, apply pk.");
                                fj2.s.f344716a.d(ml2.q2.f409372x1, mnVar.B, new hi2.a(xn1Var2));
                                bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var2.mo14344x5f01b1f6());
                                bundle2.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", 3);
                                mnVar.f200617e.mo46557x60d69242(qo0.b.X3, bundle2);
                            }
                            mnVar.f200628s.m8146xced61ae5();
                            f0Var = jz5.f0.f384359a;
                        }
                    }
                    if (f0Var == null) {
                        java.util.List list3 = ((mm2.o4) mnVar.f200618f.P0(mm2.o4.class)).f410852p;
                        if (list3 != null) {
                            java.lang.String m76175x6d346f39 = c19782x23db1cfa2.m76175x6d346f39();
                            java.lang.String m76197x6c03c64c4 = c19782x23db1cfa2.m76197x6c03c64c();
                            java.lang.String m76184x8010e5e4 = c19782x23db1cfa2.m76184x8010e5e4();
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = c19782x23db1cfa2.m76160xd133dfec();
                            java.lang.String m76192x3f6b0a02 = c19782x23db1cfa2.m76192x3f6b0a02();
                            r45.xn1 xn1Var3 = new r45.xn1();
                            xn1Var3.set(0, c19782x23db1cfa2);
                            km2.q qVar3 = new km2.q("", m76175x6d346f39, m76197x6c03c64c4, m76184x8010e5e4, 2, "", null, true, 0, m76160xd133dfec, m76192x3f6b0a02, 0, 0, false, "", false, 0L, xn1Var3, false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -149504, 1, null);
                            qVar3.f390714l = 6;
                            list3.add(qVar3);
                        }
                        bm2.i4 i4Var = mnVar.f200628s;
                        java.util.List list4 = ((mm2.o4) mnVar.f200618f.P0(mm2.o4.class)).f410852p;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list4, "<get-recomApplylinkMicUserList>(...)");
                        synchronized (list4) {
                            arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj5 : list4) {
                                if (((km2.q) obj5).f390710h) {
                                    arrayList.add(obj5);
                                }
                            }
                        }
                        i4Var.y(arrayList);
                        r45.xn1 xn1Var4 = new r45.xn1();
                        xn1Var4.set(0, c19782x23db1cfa2);
                        mnVar.f200628s.m8146xced61ae5();
                        fj2.s.f344716a.d(ml2.q2.f409372x1, mnVar.B, new hi2.a(xn1Var4));
                        bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var4.mo14344x5f01b1f6());
                        bundle2.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", 3);
                        mnVar.f200617e.mo46557x60d69242(qo0.b.X3, bundle2);
                    }
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409363q, c19782x23db1cfa2.m76197x6c03c64c(), -1, -1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onInviteAnchor click invalid pos: " + intValue + ", applyNick: " + c19782x23db1cfa2.m76184x8010e5e4());
            }
        }
        return jz5.f0.f384359a;
    }
}

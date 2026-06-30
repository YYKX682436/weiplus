package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f207455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f207457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        super(0);
        this.f207455d = c5445x963cab3;
        this.f207456e = activityC14945x8c20f160;
        this.f207457f = c22848x6ddd90cf;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f207455d;
        sb6.append(c5445x963cab3.f135785g.f88451a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", sb6.toString());
        am.ia iaVar = c5445x963cab3.f135785g;
        int i17 = iaVar.f88452b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207456e;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f207457f;
        if (i17 != 0) {
            if (i17 != 4) {
                if (i17 == 5 && iaVar.f88451a != 0) {
                    java.util.Iterator<T> it = activityC14945x8c20f160.C.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        so2.j5 j5Var = (so2.j5) it.next();
                        if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != -1) {
                        c22848x6ddd90cf.m8152xc67946d3(i18, 1, new jz5.l(4, 1));
                        c22848x6ddd90cf.m8152xc67946d3(i18, 1, new jz5.l(9, 1));
                        if (iaVar.f88461k > 0) {
                            c22848x6ddd90cf.m8152xc67946d3(i18, 1, new jz5.l(35, c5445x963cab3));
                        }
                    }
                }
            } else if (iaVar.f88451a != 0) {
                java.util.Iterator<T> it6 = activityC14945x8c20f160.C.iterator();
                int i19 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    so2.j5 j5Var2 = (so2.j5) it6.next();
                    if ((j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                        break;
                    }
                    i19++;
                }
                if (i19 != -1) {
                    if (iaVar.f88454d == 1) {
                        java.lang.Object a07 = kz5.n0.a0(activityC14945x8c20f160.C, i19);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = a07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) a07 : null;
                        if (abstractC14490x69736cb5 != null) {
                            int i27 = iaVar.f88455e;
                            int m59255xbd8ebd19 = abstractC14490x69736cb5.getFeedObject().m59255xbd8ebd19();
                            if (m59255xbd8ebd19 != i27) {
                                if (m59255xbd8ebd19 == 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                                    feedObject.m59385x50740976(feedObject.m59254xf4204902() + 1);
                                } else if (i27 == 0) {
                                    abstractC14490x69736cb5.getFeedObject().m59385x50740976(r11.m59254xf4204902() - 1);
                                }
                                if (i27 == 1) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
                                    feedObject2.m59382x2d5669f8(feedObject2.m59247xf67fd084() + 1);
                                    nv2.n1.f422084h.a(abstractC14490x69736cb5.getFeedObject().m59256xbd916e4b());
                                } else if (m59255xbd8ebd19 == 1) {
                                    abstractC14490x69736cb5.getFeedObject().m59382x2d5669f8(r6.m59247xf67fd084() - 1);
                                    nv2.n1.f422084h.o(abstractC14490x69736cb5.getFeedObject().m59256xbd916e4b());
                                }
                                c22848x6ddd90cf.m8152xc67946d3(i19, 1, new jz5.l(3, 1));
                            }
                        }
                    } else {
                        c22848x6ddd90cf.m8152xc67946d3(i19, 1, new jz5.l(3, 1));
                    }
                    if (iaVar.f88461k > 0) {
                        c22848x6ddd90cf.m8152xc67946d3(i19, 1, new jz5.l(35, c5445x963cab3));
                    }
                }
            }
        } else if (iaVar.f88451a != 0 && bu2.j.f106067a.h(iaVar.f88451a) != null) {
            java.util.Iterator<T> it7 = activityC14945x8c20f160.C.iterator();
            int i28 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i28 = -1;
                    break;
                }
                so2.j5 j5Var3 = (so2.j5) it7.next();
                if ((j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var3).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                    break;
                }
                i28++;
            }
            if (i28 != -1) {
                c22848x6ddd90cf.m8152xc67946d3(i28, 1, 1);
            }
        }
        return jz5.f0.f384359a;
    }
}

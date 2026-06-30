package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class qm extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 {
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15094xd008ea82 D1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15096xbc16917b E1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.em F1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15095xc20d01c6 G1;
    public boolean H1;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.LinkedList f211279l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f211280p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.Long f211281p1;

    /* renamed from: x0, reason: collision with root package name */
    public final java.lang.String f211282x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f211283x1;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15216x1b6b354b f211284y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f211285y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f211286z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$shareBackupListReadyListener$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$finderPersonalizedUpdateEventListener$1] */
    public qm(int i17, final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, boolean z17, int i18, boolean z18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(i17, context, z17, false, i18, gVar, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f211280p0 = z18;
        this.f211282x0 = "Finder.FinderShareFeedDetailUI";
        this.f211279l1 = new java.util.LinkedList();
        this.f211281p1 = 0L;
        this.f211283x1 = -1;
        this.D1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(context) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this;
                java.lang.String str = qmVar.f211282x0;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = qmVar.f188103t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) abstractC13919x46aff122 : null;
                if (abstractC13834x56f46d28 == null) {
                    return true;
                }
                abstractC13834x56f46d28.m56136x5a0b1819(gaVar.f88282a);
                return true;
            }
        };
        this.E1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5530xa6d73130>(context) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$shareBackupListReadyListener$1
            {
                this.f39173x3fe91575 = 103122208;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5530xa6d73130 c5530xa6d73130) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5530xa6d73130 event = c5530xa6d73130;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.om(this));
                return true;
            }
        };
        this.F1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.em(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.G1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5518xee2c723b>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$finderPersonalizedUpdateEventListener$1
            {
                this.f39173x3fe91575 = -270597589;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5518xee2c723b c5518xee2c723b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5518xee2c723b event = c5518xee2c723b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.im(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm.this));
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.Object] */
    public static final void w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar, java.lang.String str) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        java.util.ArrayList m56388xcaeb60d0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa2;
        java.util.AbstractCollection m56388xcaeb60d02;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        boolean z17;
        boolean z18 = qmVar.C1;
        java.lang.String str3 = qmVar.f211282x0;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "checkAutoRemoveBackupFeed return for enterPullRequestDone");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = qmVar.f187957g;
        if (i0Var2 == null || (m56068x4905e9fa = i0Var2.m56068x4905e9fa()) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56068x4905e9fa.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56068x4905e9fa.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null || (abstractC13919x46aff122 = qmVar.f188103t) == null || (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) == null || (i0Var = qmVar.f187957g) == null || (o17 = i0Var.o()) == null) {
            return;
        }
        int w17 = c15415x74224fd8.w();
        int y17 = c15415x74224fd8.y();
        if (w17 < 0 || w17 != y17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "checkAutoInsertBackupFeed " + str + " return [" + w17 + ' ' + y17 + ']');
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "checkAutoInsertBackupFeed " + str);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = m56068x4905e9fa.q0(w17, false);
        in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        if (s0Var == null) {
            return;
        }
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb53 == null) {
            return;
        }
        int mo1894x7e414b06 = c22848x6ddd90cf.mo1894x7e414b06() - c22848x6ddd90cf.a0();
        boolean z19 = mo1894x7e414b06 > 0 && w17 + 1 == mo1894x7e414b06;
        java.util.Iterator it = m56388xcaeb60d0.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it.next()).mo2128x1ed62e84() == abstractC14490x69736cb53.mo2128x1ed62e84()) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (z19) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = qmVar.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            as2.g gVar = (as2.g) pf5.z.f435481a.a(activity).e(as2.g.class);
            if (gVar != null) {
                java.util.Iterator it6 = gVar.f94996d.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        abstractC14490x69736cb52 = 0;
                        break;
                    }
                    abstractC14490x69736cb52 = it6.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) abstractC14490x69736cb52;
                    if (!m56388xcaeb60d0.isEmpty()) {
                        java.util.Iterator it7 = m56388xcaeb60d0.iterator();
                        while (it7.hasNext()) {
                            if (abstractC14490x69736cb54.mo2128x1ed62e84() == ((so2.j5) it7.next()).mo2128x1ed62e84()) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (!z17 && abstractC14490x69736cb54.getFeedObject().m59347x965c8f17() && abstractC14490x69736cb54.getIsUnReadBackupFeed()) {
                        break;
                    }
                }
                abstractC14490x69736cb5 = abstractC14490x69736cb52;
                str2 = str3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSharePageBackupUIC", "getBackupFeed feed:" + hc2.b0.h(abstractC14490x69736cb5, false, 1, null));
            } else {
                str2 = str3;
                abstractC14490x69736cb5 = null;
            }
            if (abstractC14490x69736cb5 != null) {
                abstractC14490x69736cb5.X0(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = qmVar.f188103t;
                if (abstractC13919x46aff1222 != null && (m56388xcaeb60d02 = abstractC13919x46aff1222.m56388xcaeb60d0()) != null) {
                    m56388xcaeb60d02.add(abstractC14490x69736cb5);
                }
                o17.mo56051xb0566d03(i17 + 1, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var3 = qmVar.f187957g;
                if (i0Var3 != null && (o18 = i0Var3.o()) != null && o18.G()) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(o18, false, null, null, 7, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var4 = qmVar.f187957g;
                    if (i0Var4 != null && (m56068x4905e9fa2 = i0Var4.m56068x4905e9fa()) != null) {
                        qmVar.C0(m56068x4905e9fa2);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1223 = qmVar.f188103t;
            as2.g gVar2 = (as2.g) pf5.z.f435481a.a(activity).e(as2.g.class);
            java.util.List list = gVar2 != null ? gVar2.f94997e : null;
            if (!(list == null || list.isEmpty()) && (abstractC13919x46aff1223 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8) abstractC13919x46aff1223;
                java.util.List list2 = c13861xc72e20d8.R;
                if (list2 == null || list2.isEmpty()) {
                    c13861xc72e20d8.R = list;
                }
            }
        } else {
            str2 = str3;
            abstractC14490x69736cb5 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkAutoInsertBackupFeed " + hc2.b0.d(abstractC14490x69736cb53, i17) + " isAutoInsert:" + z19 + " index:" + i17 + " firstVisible:" + w17 + " itemCount:" + mo1894x7e414b06 + " backupFeed:" + hc2.b0.h(abstractC14490x69736cb5, false, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r16, int r17, in5.s0 r18) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm.A(com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, in5.s0):void");
    }

    public final void C0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f211282x0, "[smoothScrollToNextPosition] nextPosition=" + w17);
        c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pm(c1163xf1deaba4, w17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void G(ym5.s3 reason) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        java.util.ArrayList m56388xcaeb60d02;
        java.util.List m56388xcaeb60d03;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.String str = this.f211282x0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onLoadMoreEnd:");
        this.Z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a, this.f187960m, false, null, false, 0L, false, 60, null);
        if (reason.f545057i && reason.f545054f && (i0Var2 = this.f187957g) != null && (m56068x4905e9fa = i0Var2.m56068x4905e9fa()) != null) {
            C0(m56068x4905e9fa);
        }
        boolean z17 = reason.f545054f;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var3 = this.f187957g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa2 = i0Var3 != null ? i0Var3.m56068x4905e9fa() : null;
            thVar.f217558d = m56068x4905e9fa2;
            if (m56068x4905e9fa2 != null) {
                m56068x4905e9fa2.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sh(thVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
            thVar.P6((abstractC13919x46aff122 == null || (m56388xcaeb60d03 = abstractC13919x46aff122.m56388xcaeb60d0()) == null) ? null : (so2.j5) kz5.n0.a0(m56388xcaeb60d03, 1));
            thVar.O6(false);
        } else if (reason.f545049a == 1 && (i0Var = this.f187957g) != null && (o17 = i0Var.o()) != null) {
            o17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.mm(this));
        }
        x0();
        if (this.H1) {
            this.H1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = this.f188103t;
            if (abstractC13919x46aff1222 != null && (m56388xcaeb60d02 = abstractC13919x46aff1222.m56388xcaeb60d0()) != null) {
                java.util.ListIterator listIterator = m56388xcaeb60d02.listIterator(m56388xcaeb60d02.size());
                while (listIterator.hasPrevious()) {
                    so2.j5 j5Var = (so2.j5) listIterator.previous();
                    if (j5Var.h() == 15 && (j5Var instanceof so2.n1) && so2.n1.h2((so2.n1) j5Var, null, 1, null)) {
                        i17 = listIterator.nextIndex();
                        break;
                    }
                }
            }
            i17 = -1;
            if (i17 >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1223 = this.f188103t;
                if (abstractC13919x46aff1223 != null && (m56388xcaeb60d0 = abstractC13919x46aff1223.m56388xcaeb60d0()) != 0) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var4 = this.f187957g;
                if (i0Var4 != null && (o18 = i0Var4.o()) != null) {
                    o18.mo56053xb9568715(i17, 1);
                }
                if (activity.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.RESUMED) && hc2.e.a()) {
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
                    e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
                    e4Var.c();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delete placeholder item index=" + i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (((r2 == null || (r2 = r2.getFeedObject()) == null || !r2.m59315x31740422()) ? false : true) != false) goto L20;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 r18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm.X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.gj):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public in5.s h() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15092xf036eed8(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        super.i(feed, menu, sheet, i17);
        if (this.f211280p0) {
            menu.removeItem(103);
            menu.removeItem(114);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f187960m == 1001 && feed.N0() && !zl2.q4.f555466a.C(feed)) {
            menu.b(108, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (feed.getFeedObject().m59303x7d1523() || !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a.c0(context)) {
                menu.g(107, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwf), com.p314xaae8f345.mm.R.raw.f80064x214d7a07);
            } else {
                menu.g(106, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572896cv4), com.p314xaae8f345.mm.R.raw.f80065x5d7d9c0);
            }
        }
        super.m(feed, menu, sheet, holder);
        if (this.f211280p0) {
            menu.removeItem(305);
            menu.removeItem(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630);
            if (feed.N0()) {
                return;
            }
            menu.removeItem(101);
            menu.removeItem(99);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public void n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, int i17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        int i18 = 0;
        boolean booleanExtra = activity.getIntent().getBooleanExtra("is_from_ad", false);
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            qt2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        r45.qt2 qt2Var2 = qt2Var;
        so2.z1 z1Var = so2.z1.f492263a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187954d;
        int i19 = z17 ? 1 : 2;
        if (booleanExtra) {
            i17 = 22;
        }
        z1Var.a(abstractActivityC21394xb3d2c0cf, qt2Var2, feed, i19, true, i17);
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
        }
        gVar.i(D0, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        so2.j5 j5Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        super.mo979x3f5eee52();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        java.util.List m56388xcaeb60d0 = abstractC13919x46aff122 != null ? abstractC13919x46aff122.m56388xcaeb60d0() : null;
        if (m56388xcaeb60d0 != null && (j5Var = (so2.j5) kz5.n0.Z(m56388xcaeb60d0)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 != null) {
                cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
                long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                kVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(mo2128x1ed62e84);
                if (h17 != null && (feedObject = h17.getFeedObject()) != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null) {
                    m76806xdef68064.set(49, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15216x1b6b354b c15216x1b6b354b = this.f211284y0;
        if (c15216x1b6b354b != null) {
            c15216x1b6b354b.mo48814x2efc64();
        }
        mo48814x2efc64();
        java.util.Iterator it = this.f211279l1.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        if (i0Var != null && (o17 = i0Var.o()) != null && (m82555x4905e9fa = o17.m82555x4905e9fa()) != null) {
            m82555x4905e9fa.V0(this.F1);
        }
        mo48814x2efc64();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /* renamed from: onRefreshEnd */
    public void mo56038xb3ee2b3f(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f211282x0, "onRefreshEnd:");
        this.Z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int i17 = this.f187960m;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(v1Var, i17, false, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), false, 0L, false, 56, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public java.lang.String v() {
        return this.f211282x0;
    }

    public final void x0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o18;
        if (this.B1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = this.f187957g;
        boolean z17 = false;
        if (i0Var2 != null && (o18 = i0Var2.o()) != null && o18.getEnableLoadMore()) {
            z17 = true;
        }
        if (z17) {
            this.B1 = true;
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SHARE_PREFETCH_LAST_FEED_OUNT_INT_SYNC, 3);
            java.lang.String str = this.f211282x0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addLoadMorePreload: add load more preload, loadMoreThreshold=" + r17);
            if (r17 <= 0 || (i0Var = this.f187957g) == null || (o17 = i0Var.o()) == null) {
                return;
            }
            o17.m82555x4905e9fa().i(new sc2.r8(str, o17, r17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(long r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm.z(long):boolean");
    }
}

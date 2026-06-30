package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public in5.s a(int i17) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryMusicPostConfig$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2 || type == 4 || type == 9) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.y.this);
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public boolean b() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 feedLoader, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        so2.j5 j5Var = (so2.j5) feedLoader.m56388xcaeb60d0().get(i17);
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        if (abstractC14490x69736cb5 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryMusicPostConfig", "enterGalleryTimelinePage: itemType=" + abstractC14490x69736cb5.h() + ", fixPos=" + i17 + ", tabType=" + i18);
            if (abstractC14490x69736cb5.h() == 4) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                long m75942xfb822ef2 = mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterGalleryTimelinePage: videoDurationMs=");
                sb6.append(m75942xfb822ef2);
                sb6.append(", miniDurationMs=");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a aVar = this.f192893a;
                long j17 = m75942xfb822ef2;
                sb6.append(aVar.f192879e);
                sb6.append(", maxDurationMs=");
                sb6.append(aVar.f192880f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryMusicPostConfig", sb6.toString());
                long j18 = aVar.f192879e;
                if (j18 <= 0 || j17 >= j18) {
                    long j19 = aVar.f192880f;
                    if (j19 <= 0 || j17 <= j19) {
                        android.content.Intent intent = new android.content.Intent();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(feedLoader, intent, i17, null, 4, null);
                        long j27 = 1000;
                        intent.putExtra("MINI_DURATION", (int) (aVar.f192879e / j27));
                        intent.putExtra("MAX_DURATION", (int) (aVar.f192880f / j27));
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Dk(activity, intent, 10005, aVar.f192876b, aVar.f192877c, i18);
                    } else {
                        db5.t7.m123883x26a183b(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573478lk2, java.lang.Long.valueOf(aVar.f192880f / 1000)), 0).show();
                    }
                } else {
                    db5.t7.m123883x26a183b(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eq6, java.lang.Long.valueOf(aVar.f192879e / 1000)), 0).show();
                }
            } else {
                db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.eq8, 0).show();
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderGalleryMusicPostConfig", "enterGalleryTimelinePage: error, feed=" + j5Var + ", fixPos=" + i17 + ", tabType=" + i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 e(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 3);
        c1161x57298f5d.m8091xc21abdf5(true);
        return c1161x57298f5d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public int g() {
        return 10005;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r5 == null) goto L19;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r4, int r5, int r6, android.content.Intent r7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.c r8) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "curActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            r8 = 0
            if (r7 == 0) goto L14
            java.lang.String r0 = "SELECT_OBJECT"
            byte[] r7 = r7.getByteArrayExtra(r0)
            goto L15
        L14:
            r7 = r8
        L15:
            if (r7 == 0) goto L1f
            com.tencent.mm.protocal.protobuf.FinderObject r8 = new com.tencent.mm.protocal.protobuf.FinderObject
            r8.<init>()
            r8.mo11468x92b714fd(r7)
        L1f:
            com.tencent.mm.plugin.finder.gallery.b0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a
            r0 = 10005(0x2715, float:1.402E-41)
            if (r5 != r0) goto L89
            r1 = -1
            if (r6 != r1) goto L89
            if (r8 == 0) goto L89
            com.tencent.mm.plugin.finder.storage.h90 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec
            r6 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.a(r8, r6)
            java.util.LinkedList r5 = r5.m59264x7efe73ec()
            java.lang.Object r5 = kz5.n0.Z(r5)
            r45.mb4 r5 = (r45.mb4) r5
            if (r5 == 0) goto L5e
            r0 = 3
            int r0 = r5.m75939xb282bd08(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.m75945x2fec8307(r6)
            r1.append(r2)
            r2 = 18
            java.lang.String r5 = r5.m75945x2fec8307(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L61
            goto L5f
        L5e:
            r0 = r6
        L5f:
            java.lang.String r5 = ""
        L61:
            com.tencent.mm.autogen.events.MusicPostSelectEvent r1 = new com.tencent.mm.autogen.events.MusicPostSelectEvent
            r1.<init>()
            am.kk r2 = r1.f136046g
            r2.f88693a = r5
            int r5 = r5.length()
            if (r5 != 0) goto L71
            r6 = 1
        L71:
            r2.f88695c = r6
            r2.f88697e = r0
            long r5 = r8.m76784x5db1b11()
            r2.f88694b = r5
            r1.e()
            r4.finish()
            long r4 = r8.m76784x5db1b11()
            r7.c(r4)
            goto L97
        L89:
            if (r5 != r0) goto L97
            if (r8 == 0) goto L92
            long r4 = r8.m76784x5db1b11()
            goto L94
        L92:
            r4 = 0
        L94:
            r7.e(r4)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.y.h(com.tencent.mm.ui.MMActivity, int, int, android.content.Intent, com.tencent.mm.plugin.finder.gallery.c):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void j() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579();
        am.kk kkVar = c5723x5d13c579.f136046g;
        kkVar.f88693a = "";
        kkVar.f88695c = true;
        c5723x5d13c579.e();
    }
}

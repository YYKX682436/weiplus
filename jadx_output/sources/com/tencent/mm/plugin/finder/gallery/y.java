package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.plugin.finder.gallery.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.gallery.a data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public in5.s a(int i17) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryMusicPostConfig$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2 || type == 4 || type == 9) {
                    return new com.tencent.mm.plugin.finder.gallery.w(com.tencent.mm.plugin.finder.gallery.y.this);
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public boolean b() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void c(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader, int i17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        so2.j5 j5Var = (so2.j5) feedLoader.getDataListJustForAdapter().get(i17);
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (baseFinderFeed != null) {
            com.tencent.mars.xlog.Log.i("FinderGalleryMusicPostConfig", "enterGalleryTimelinePage: itemType=" + baseFinderFeed.h() + ", fixPos=" + i17 + ", tabType=" + i18);
            if (baseFinderFeed.h() == 4) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
                long j17 = mb4Var != null ? mb4Var.getLong(24) : 0L;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterGalleryTimelinePage: videoDurationMs=");
                sb6.append(j17);
                sb6.append(", miniDurationMs=");
                com.tencent.mm.plugin.finder.gallery.a aVar = this.f111360a;
                long j18 = j17;
                sb6.append(aVar.f111346e);
                sb6.append(", maxDurationMs=");
                sb6.append(aVar.f111347f);
                com.tencent.mars.xlog.Log.i("FinderGalleryMusicPostConfig", sb6.toString());
                long j19 = aVar.f111346e;
                if (j19 <= 0 || j18 >= j19) {
                    long j27 = aVar.f111347f;
                    if (j27 <= 0 || j18 <= j27) {
                        android.content.Intent intent = new android.content.Intent();
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(feedLoader, intent, i17, null, 4, null);
                        long j28 = 1000;
                        intent.putExtra("MINI_DURATION", (int) (aVar.f111346e / j28));
                        intent.putExtra("MAX_DURATION", (int) (aVar.f111347f / j28));
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Dk(activity, intent, 10005, aVar.f111343b, aVar.f111344c, i18);
                    } else {
                        db5.t7.makeText(activity, activity.getResources().getString(com.tencent.mm.R.string.f491945lk2, java.lang.Long.valueOf(aVar.f111347f / 1000)), 0).show();
                    }
                } else {
                    db5.t7.makeText(activity, activity.getResources().getString(com.tencent.mm.R.string.eq6, java.lang.Long.valueOf(aVar.f111346e / 1000)), 0).show();
                }
            } else {
                db5.t7.makeText(activity, com.tencent.mm.R.string.eq8, 0).show();
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderGalleryMusicPostConfig", "enterGalleryTimelinePage: error, feed=" + j5Var + ", fixPos=" + i17 + ", tabType=" + i18);
        }
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.p2 e(int i17) {
        return new com.tencent.mm.plugin.finder.gallery.x();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 3);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public int g() {
        return 10005;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r5 == null) goto L19;
     */
    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.tencent.mm.ui.MMActivity r4, int r5, int r6, android.content.Intent r7, com.tencent.mm.plugin.finder.gallery.c r8) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "curActivity"
            kotlin.jvm.internal.o.g(r8, r0)
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
            r8.parseFrom(r7)
        L1f:
            com.tencent.mm.plugin.finder.gallery.b0 r7 = com.tencent.mm.plugin.finder.gallery.b0.f111350a
            r0 = 10005(0x2715, float:1.402E-41)
            if (r5 != r0) goto L89
            r1 = -1
            if (r6 != r1) goto L89
            if (r8 == 0) goto L89
            com.tencent.mm.plugin.finder.storage.h90 r5 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            r6 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.a(r8, r6)
            java.util.LinkedList r5 = r5.getMediaList()
            java.lang.Object r5 = kz5.n0.Z(r5)
            r45.mb4 r5 = (r45.mb4) r5
            if (r5 == 0) goto L5e
            r0 = 3
            int r0 = r5.getInteger(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getString(r6)
            r1.append(r2)
            r2 = 18
            java.lang.String r5 = r5.getString(r2)
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
            am.kk r2 = r1.f54513g
            r2.f7160a = r5
            int r5 = r5.length()
            if (r5 != 0) goto L71
            r6 = 1
        L71:
            r2.f7162c = r6
            r2.f7164e = r0
            long r5 = r8.getId()
            r2.f7161b = r5
            r1.e()
            r4.finish()
            long r4 = r8.getId()
            r7.c(r4)
            goto L97
        L89:
            if (r5 != r0) goto L97
            if (r8 == 0) goto L92
            long r4 = r8.getId()
            goto L94
        L92:
            r4 = 0
        L94:
            r7.e(r4)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.gallery.y.h(com.tencent.mm.ui.MMActivity, int, int, android.content.Intent, com.tencent.mm.plugin.finder.gallery.c):void");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void j() {
        com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent = new com.tencent.mm.autogen.events.MusicPostSelectEvent();
        am.kk kkVar = musicPostSelectEvent.f54513g;
        kkVar.f7160a = "";
        kkVar.f7162c = true;
        musicPostSelectEvent.e();
    }
}

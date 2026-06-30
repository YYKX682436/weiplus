package v74;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final v74.v0 f515480a;

    /* renamed from: b, reason: collision with root package name */
    public final z74.i f515481b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f515482c;

    /* renamed from: d, reason: collision with root package name */
    public final v74.x0 f515483d;

    static {
        new v74.w0(null);
    }

    public z0(v74.v0 mAdLookbookStatistic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdLookbookStatistic, "mAdLookbookStatistic");
        this.f515480a = mAdLookbookStatistic;
        z74.i iVar = new z74.i();
        this.f515481b = iVar;
        this.f515482c = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsSingleVideoPlayMode", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        iVar.f552149c = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsSingleVideoPlayMode", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        iVar.f552150d = 1000L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        this.f515483d = new v74.x0(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:11:0x0023, B:14:0x0050, B:16:0x005d, B:18:0x0066, B:20:0x0072, B:26:0x007a, B:27:0x0080, B:28:0x0086, B:29:0x006d, B:30:0x004b), top: B:10:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11, android.view.ViewGroup r12, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r13, r45.jj4 r14, boolean r15) {
        /*
            r10 = this;
            z74.i r0 = r10.f515481b
            java.lang.String r1 = "playVideo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            r3 = 0
            if (r12 == 0) goto L12
            android.content.Context r4 = r12.getContext()
            goto L13
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = "AdLookbookVideoManager"
            if (r4 == 0) goto Laf
            if (r13 == 0) goto Laf
            if (r14 == 0) goto L1e
            java.lang.String r4 = r14.f459388d
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L23
            goto Laf
        L23:
            xd4.j0 r4 = new xd4.j0     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            r4.f535192a = r14     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r13.m70363x51f8f990()     // Catch: java.lang.Throwable -> L93
            r4.f535193b = r6     // Catch: java.lang.Throwable -> L93
            long r6 = r13.f68891x29d1292e     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = ca4.z0.t0(r6)     // Catch: java.lang.Throwable -> L93
            r4.f535195d = r6     // Catch: java.lang.Throwable -> L93
            int r13 = r13.m70357x3fdd41df()     // Catch: java.lang.Throwable -> L93
            r4.f535194c = r13     // Catch: java.lang.Throwable -> L93
            android.content.Context r13 = r12.getContext()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r14.f459388d     // Catch: java.lang.Throwable -> L93
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r13 = r0.a(r13, r6)     // Catch: java.lang.Throwable -> L93
            if (r13 != 0) goto L4b
            goto L50
        L4b:
            r6 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r6)     // Catch: java.lang.Throwable -> L93
        L50:
            java.lang.String r6 = "getVideoViewInContainer"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)     // Catch: java.lang.Throwable -> L93
            boolean r8 = a84.y0.e(r12)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L6d
            r8 = 0
            android.view.View r8 = r12.getChildAt(r8)     // Catch: java.lang.Throwable -> L93
            boolean r9 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L6d
            r3 = r8
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r3     // Catch: java.lang.Throwable -> L93
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)     // Catch: java.lang.Throwable -> L93
            goto L70
        L6d:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)     // Catch: java.lang.Throwable -> L93
        L70:
            if (r3 != 0) goto L76
            r10.b(r11, r13, r12, r4)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L76:
            if (r3 != r13) goto L86
            if (r15 == 0) goto L80
            java.lang.String r11 = r14.f459388d     // Catch: java.lang.Throwable -> L93
            r0.f(r3, r11)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L80:
            java.lang.String r11 = r14.f459388d     // Catch: java.lang.Throwable -> L93
            r0.g(r3, r11)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L86:
            java.lang.String r14 = "videoView changed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r14)     // Catch: java.lang.Throwable -> L93
            a84.y0.c(r12)     // Catch: java.lang.Throwable -> L93
            r10.b(r11, r13, r12, r4)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L93:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "playVideo, exp="
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r12)
            java.lang.String r12 = "AdLookbookVideoHelper playVideo"
            ca4.q.c(r12, r11)
        Lab:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        Laf:
            java.lang.String r11 = "playVideo params error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r11)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.z0.a(int, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookVideoManager", "startPlay, pos=" + i17);
        if (c17983xb14a9c8d != null) {
            j0Var.f535193b = ca4.m0.e(j0Var.f535193b, j0Var.f535192a.f459388d + '_');
            a84.y0.i(c17983xb14a9c8d);
            a84.y0.o(c17983xb14a9c8d, -1, -1);
            a84.y0.b(viewGroup, c17983xb14a9c8d, 0);
            a84.y0.p(c17983xb14a9c8d, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("alwaysShowThumb", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            c17983xb14a9c8d.f247974h2 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alwaysShowThumb", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            c17983xb14a9c8d.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            c17983xb14a9c8d.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            c17983xb14a9c8d.m70655x360a109e(new v74.y0(i17, c17983xb14a9c8d, this));
            java.lang.Integer num = (java.lang.Integer) this.f515482c.get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 0;
            }
            this.f515481b.i(c17983xb14a9c8d, j0Var, j0Var.f535195d, j0Var.f535192a.f459388d, num.intValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookVideoManager", "stopAll");
        try {
            this.f515483d.removeCallbacksAndMessages(null);
            this.f515481b.j();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookVideoManager", "stopAll, exp=" + th6);
            ca4.q.c("AdLookbookVideoHelper stopAll", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
    }
}

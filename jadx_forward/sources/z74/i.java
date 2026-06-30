package z74;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f552148b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f552147a = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f552149c = true;

    /* renamed from: d, reason: collision with root package name */
    public long f552150d = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:7:0x0017, B:9:0x0028, B:13:0x0032, B:15:0x0037), top: B:6:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d a(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "getVideoViewWithMediaId"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.util.Map r2 = r7.f552147a
            r3 = 0
            java.lang.String r4 = "VideoViewManager"
            if (r2 != 0) goto L17
            java.lang.String r8 = "are you sure? the map is null? I don't think the statement can reach!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L17:
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r9 = r2.get(r9)     // Catch: java.lang.Throwable -> L58
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r9     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "shouldUseNewVideoView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)     // Catch: java.lang.Throwable -> L58
            r5 = 1
            if (r9 == 0) goto L31
            boolean r6 = r7.b(r9)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            r6 = 0
            goto L32
        L31:
            r6 = r5
        L32:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L54
            java.lang.String r9 = "onNewVideoView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r1)     // Catch: java.lang.Throwable -> L58
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView     // Catch: java.lang.Throwable -> L58
            r2.<init>(r8, r5)     // Catch: java.lang.Throwable -> L58
            long r5 = r7.f552150d     // Catch: java.lang.Throwable -> L58
            r2.m70650xf21459b3(r5)     // Catch: java.lang.Throwable -> L58
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L58
            r5 = -1
            r8.<init>(r5, r5)     // Catch: java.lang.Throwable -> L58
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> L58
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r1)     // Catch: java.lang.Throwable -> L58
            r9 = r2
        L54:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r9
        L58:
            java.lang.String r8 = "getVideoViewWithMediaId has something wrong!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z74.i.a(android.content.Context, java.lang.String):com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (!(c17983xb14a9c8d instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VideoViewManager", "the video view is not SnsTimelineVideoView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) c17983xb14a9c8d;
        if (!c18390xafce807.f252179r2 && !c18390xafce807.f252177p2 && !c18390xafce807.O1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoViewManager", "the video view is destroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        return true;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f552147a;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) map).entrySet()) {
            if (entry != null && entry.getValue() != null && (c17983xb14a9c8d2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) entry.getValue()) != c17983xb14a9c8d) {
                c17983xb14a9c8d2.F();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f552147a;
        java.lang.String str = this.f552148b;
        try {
            if (!android.text.TextUtils.isEmpty(str) && map != null && (c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) ((android.util.ArrayMap) map).get(str)) != null) {
                c17983xb14a9c8d.F();
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoViewManager", "pausePlay has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f552147a;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        java.util.Iterator it = ((android.util.ArrayMap) map).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (entry != null && b((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) entry.getValue())) {
                it.remove();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, java.lang.String str) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoViewManager", "resumePlay has something wrong!");
        }
        if (this.f552149c && (str == null || !str.equals(this.f552148b))) {
            z17 = false;
            if (c17983xb14a9c8d == null && z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                if (c17983xb14a9c8d instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) {
                    z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) c17983xb14a9c8d).f0();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                    z18 = false;
                }
                if (z18) {
                    if (c17983xb14a9c8d.m70621x51e8b0a() - c17983xb14a9c8d.m70620x9746038c() < 500) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoViewManager", "the current position is too near to end of the video!!");
                        c17983xb14a9c8d.M(0, true);
                    } else {
                        c17983xb14a9c8d.K();
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoViewManager", "the media is is not same as the current one!!!");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        }
        z17 = true;
        if (c17983xb14a9c8d == null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoViewManager", "the media is is not same as the current one!!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            java.util.Map map = this.f552147a;
            if (map == null || str == null || ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) ((android.util.ArrayMap) map).get(str)) != c17983xb14a9c8d || c17983xb14a9c8d == null || b(c17983xb14a9c8d)) {
                c17983xb14a9c8d = null;
            }
            if (c17983xb14a9c8d != null) {
                c17983xb14a9c8d.M(0, true);
                c17983xb14a9c8d.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoViewManager", "the media is is not same as the current one, or the view is destroyed!!!");
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VideoViewManager", "seekPlay has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, xd4.j0 j0Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        i(c17983xb14a9c8d, j0Var, str, str2, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, xd4.j0 j0Var, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (c17983xb14a9c8d == null || j0Var == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        try {
            c17983xb14a9c8d.setVisibility(0);
            if (this.f552149c) {
                c(c17983xb14a9c8d);
            }
            e();
            c17983xb14a9c8d.P(j0Var.f535192a, j0Var.f535193b, j0Var.f535194c);
            c17983xb14a9c8d.x(false);
            c17983xb14a9c8d.m70644x764d819b(true);
            c17983xb14a9c8d.D(i17);
            java.util.Map map = this.f552147a;
            if (map != null) {
                ((android.util.ArrayMap) map).put(str2, c17983xb14a9c8d);
            }
            ((android.util.ArrayMap) map).size();
            if (this.f552149c) {
                this.f552148b = str2;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoViewManager", "startPlay has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void j() {
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            map = this.f552147a;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoViewManager", "stopAll has something wrong!");
        }
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) map).entrySet()) {
            if (entry != null && entry.getValue() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) entry.getValue();
                if (c17983xb14a9c8d instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) c17983xb14a9c8d).g0();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }
}

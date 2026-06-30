package z74;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallbackEx {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f552123a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.Reference f552124b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.Reference f552125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f552126d;

    /* renamed from: e, reason: collision with root package name */
    public z74.c f552127e = null;

    /* renamed from: f, reason: collision with root package name */
    public z74.a f552128f = null;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, i64.b1 b1Var, int i17) {
        this.f552123a = c17933xe8d1b226;
        this.f552124b = new java.lang.ref.WeakReference(c17983xb14a9c8d);
        this.f552125c = new java.lang.ref.WeakReference(b1Var);
        this.f552126d = i17;
    }

    public static java.lang.String d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "normal time line item";
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "base card time line item";
        }
        if (i17 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        return "grid card time line item";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        d(this.f552126d);
        b(z74.b.f552117d, i17 * 1000, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    public final void b(z74.b bVar, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        z74.c cVar = this.f552127e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) this.f552124b.get();
        if (cVar != null && c17983xb14a9c8d != null) {
            cVar.a(c17983xb14a9c8d, bVar, i17, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        i64.b1 b1Var = (i64.b1) this.f552125c.get();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) this.f552124b.get();
        if (c17983xb14a9c8d != null && (c17933xe8d1b226 = this.f552123a) != null && b1Var != null) {
            long j17 = i17;
            long m70621x51e8b0a = c17983xb14a9c8d.m70621x51e8b0a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            long j18 = c17933xe8d1b226.f68891x29d1292e;
            if (c17933xe8d1b226.m70377x3172ed()) {
                b1Var.s(c17933xe8d1b226.f68891x29d1292e);
                b1Var.v(c17933xe8d1b226.f68891x29d1292e, j17);
                if (!b1Var.m(j18)) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    b1Var.w(j18, android.os.SystemClock.elapsedRealtime());
                    b1Var.x(j18, (int) (m70621x51e8b0a / 1000), true);
                    b1Var.d(j18, j18);
                    ca4.z0.t0(j18);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.OnlineAdVideoCallback", "doOnlinePlayerPlaying, the info is not Ad, snsId=" + ca4.z0.t0(j18));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            }
        }
        b(z74.b.f552118e, 0, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo70662xa6db431b() {
        /*
            r8 = this;
            java.lang.String r0 = "onCompletion"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            int r2 = r8.f552126d
            d(r2)
            java.lang.ref.Reference r2 = r8.f552125c
            java.lang.Object r2 = r2.get()
            i64.b1 r2 = (i64.b1) r2
            java.lang.ref.Reference r3 = r8.f552124b
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r3
            java.lang.String r4 = "doOnlineVideoCompletion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f552123a
            if (r5 == 0) goto L52
            if (r2 == 0) goto L52
            long r6 = r5.f68891x29d1292e
            ca4.z0.t0(r6)
            boolean r5 = r5.m70377x3172ed()
            if (r5 != 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "online player completion, !isAd,  snsId="
            r2.<init>(r5)
            java.lang.String r5 = ca4.z0.t0(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "SnsAd.OnlineAdVideoCallback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            goto L55
        L4f:
            r2.b(r6)
        L52:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
        L55:
            r2 = 0
            if (r3 == 0) goto L74
            java.lang.String r4 = "shouldLoopPlay"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            z74.a r5 = r8.f552128f
            r6 = 1
            if (r5 != 0) goto L68
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            r5 = r6
            goto L6f
        L68:
            boolean r5 = r5.a()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
        L6f:
            if (r5 == 0) goto L74
            r3.M(r2, r6)
        L74:
            z74.b r3 = z74.b.f552120g
            r8.b(r3, r2, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z74.e.mo70662xa6db431b():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallbackEx
    /* renamed from: onPause */
    public void mo70663xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        i64.b1 b1Var = (i64.b1) this.f552125c.get();
        if (b1Var != null && (c17933xe8d1b226 = this.f552123a) != null) {
            b1Var.q(c17933xe8d1b226.f68891x29d1292e);
        }
        b(z74.b.f552119f, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }
}

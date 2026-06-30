package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gn implements cw2.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f103499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f103501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar f103502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f103503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f103504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103505g;

    public gn(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar, boolean z17, long j17, so2.u1 u1Var) {
        this.f103499a = ynVar;
        this.f103500b = s0Var;
        this.f103501c = finderVideoLayout;
        this.f103502d = finderVideoGreenSeekBar;
        this.f103503e = z17;
        this.f103504f = j17;
        this.f103505g = u1Var;
    }

    @Override // cw2.e4
    public void a(int i17) {
    }

    @Override // cw2.e4
    public void b(float f17) {
        int i17;
        if (f17 == 0.5f) {
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_0_5;
        } else {
            if (!(f17 == 1.0f)) {
                if (f17 == 1.5f) {
                    i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1_5;
                } else {
                    if (f17 == 2.0f) {
                        i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_2;
                    }
                }
            }
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f103500b.p(com.tencent.mm.R.id.iqj);
        if (weImageView != null) {
            weImageView.setImageResource(i17);
        }
    }

    @Override // cw2.e4
    public void c(long j17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f103501c;
        if (finderVideoLayout.J()) {
            this.f103502d.setIsPlay(true);
        }
        if (this.f103503e) {
            long j18 = this.f103504f;
            if (j18 <= 0) {
                cw2.da videoView = finderVideoLayout.getVideoView();
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                j18 = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getVideoDurationMs() : 0L;
            }
            if (j17 <= 0 || j18 <= 0) {
                return;
            }
            com.tencent.mm.plugin.finder.convert.yn ynVar = this.f103499a;
            long j19 = ynVar.E1;
            so2.u1 u1Var = this.f103505g;
            if (j19 != u1Var.getItemId()) {
                jz5.g gVar = com.tencent.mm.plugin.finder.feed.model.ea.f107833d;
                if (j18 - j17 <= ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.ea.f107833d).getValue()).longValue() * 1000) {
                    ynVar.E1 = u1Var.getItemId();
                    android.content.Context context = this.f103500b.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
                    if (poVar != null) {
                        com.tencent.mm.plugin.finder.feed.tl tlVar = poVar.f135572d;
                        tlVar.getClass();
                        com.tencent.mm.plugin.finder.feed.model.ea eaVar = tlVar.f109081s;
                        eaVar.getClass();
                        eaVar.a(u1Var.getItemId(), u1Var.getFeedObject().getObjectNonceId(), (i17 & 4) != 0 ? null : null, (i17 & 8) != 0 ? null : null, (i17 & 16) != 0 ? null : null, (i17 & 32) != 0 ? null : null);
                    }
                }
            }
        }
    }

    @Override // cw2.e4
    public void d() {
    }

    @Override // cw2.e4
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "onPlayStatusChange: isPlay=" + z17);
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f103499a;
        if (!z17) {
            java.lang.Runnable runnable = ynVar.D1;
            if (runnable != null) {
                ynVar.R1().removeCallbacks(runnable);
                ynVar.D1 = null;
                return;
            }
            return;
        }
        java.lang.Runnable runnable2 = ynVar.D1;
        if (runnable2 != null) {
            ynVar.R1().removeCallbacks(runnable2);
            ynVar.D1 = null;
        }
        ynVar.D1 = new com.tencent.mm.plugin.finder.convert.bn(this.f103500b, ynVar);
        ynVar.R1().postDelayed(ynVar.D1, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0291  */
    @Override // cw2.e4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVideoEnded() {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.gn.onVideoEnded():void");
    }
}

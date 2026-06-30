package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout */
/* loaded from: classes10.dex */
public final class C17855xdb509203 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17008x93d612ef {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f245527o = 0;

    /* renamed from: i, reason: collision with root package name */
    public final yt3.a f245528i;

    /* renamed from: m, reason: collision with root package name */
    public final y94.f0 f245529m;

    /* renamed from: n, reason: collision with root package name */
    public final y94.h0 f245530n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17855xdb509203(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a37, (android.view.ViewGroup) this, true);
        yt3.e eVar = new yt3.e(this, "close-plugin");
        eVar.z(com.p314xaae8f345.mm.R.id.ckq, ju3.c0.C);
        this.f245528i = eVar;
        this.f245529m = new y94.f0(this);
        new y94.i(this);
        this.f245530n = new y94.h0(this);
        new yt3.e(this, "finish-plugin").z(com.p314xaae8f345.mm.R.id.f565499cl0, ju3.c0.B1);
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverVideoEditPluginLayout", "statusChange :" + status);
        int ordinal = status.ordinal();
        if (ordinal != 32) {
            yt3.a aVar = this.f245528i;
            y94.f0 f0Var = this.f245529m;
            if (ordinal == 56) {
                ((yt3.e) aVar).mo9067x901b6914(4);
                f0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                int width = f0Var.A().getWidth();
                int height = f0Var.A().getHeight();
                int b17 = ((i65.a.b(f0Var.z(), 2) + i65.a.b(f0Var.z(), 110)) - i65.a.b(f0Var.z(), 44)) + i65.a.b(f0Var.z(), 2);
                if (com.p314xaae8f345.mm.ui.bl.f(f0Var.z())) {
                    b17 += com.p314xaae8f345.mm.ui.bl.c(f0Var.z());
                }
                int i17 = height - b17;
                if (f0Var.A().getBottom() < ai3.d.f(f0Var.z()).y) {
                    i17 = (int) ((width - (i65.a.b(f0Var.z(), 16) * 2)) / (width / height));
                }
                float f17 = width;
                float f18 = i17;
                float B = ((((int) ((f17 / r2) * f18)) / f17) * i65.a.B(f0Var.z())) / f17;
                android.view.ViewPropertyAnimator translationY = f0Var.A().animate().scaleX(B).scaleY(((f18 / height) * i65.a.B(f0Var.z())) / f17).translationY(-(java.lang.Math.abs(b17) / 2.0f));
                if (translationY != null && (duration = translationY.setDuration(300L)) != null) {
                    duration.setListener(new y94.e0(f0Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            } else if (ordinal != 58) {
                if (ordinal == 65) {
                    p3325xe03a0797.p3326xc267989b.l.d(this, null, null, new x94.e(this, null), 3, null);
                } else if (ordinal != 165) {
                    switch (ordinal) {
                        case 60:
                            f0Var.mo11000xb01dfb57();
                            break;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            f0Var.mo11001x57429eec();
                            break;
                        case 62:
                        case 63:
                            ((yt3.e) aVar).mo9067x901b6914(0);
                            f0Var.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                            f0Var.A().animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                            break;
                    }
                }
            } else if (bundle != null) {
                int i18 = bundle.getInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT");
                int i19 = bundle.getInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverVideoEditPluginLayout", "set crop range:[" + i18 + ' ' + i19 + ']');
                f0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                kk4.b player = f0Var.A().getPlayer();
                if (player != null) {
                    ((kk4.v) player).H(i18, i19);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                kk4.b player2 = f0Var.A().getPlayer();
                if (player2 != null) {
                    kk4.b.f(player2, i18, false, null, 6, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                long j17 = i18;
                long j18 = i19;
                y94.h0 h0Var = this.f245530n;
                h0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                og3.d dVar = h0Var.f541907f;
                if (dVar == null || h0Var.f541908g == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) dVar.f426692a.get(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46 c16503xf5608a46 = new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16503xf5608a46(j17, j18);
                    c16506x8e746ffa.getClass();
                    c16506x8e746ffa.f230144f = c16503xf5608a46;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) context).Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
    }
}

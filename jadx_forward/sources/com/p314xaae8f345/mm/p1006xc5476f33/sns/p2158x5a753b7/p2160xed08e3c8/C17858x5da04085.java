package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u001c\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Ljz5/f0;", "getSourceDecodeCallback", "callback", "setSourceDecodeCallback", "Lv94/i;", "getSnsCoverReporter", "reporter", "setSnsCoverReporter", ya.b.f77502x92235c1b, "setImageBitmapWithFade", "", "newMode", "setMode", "Lfe0/e4;", "f", "Lfe0/e4;", "getDelegate", "()Lfe0/e4;", "delegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sns-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView */
/* loaded from: classes4.dex */
public final class C17858x5da04085 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final fe0.e4 delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17858x5da04085(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aa4.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        if (((fe0.f4) i95.n0.c(fe0.f4.class)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsCoverFadeDelegate", "com.tencent.mm.feature.sns.SnsCoverFadeImageService");
            lVar = new aa4.l(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsCoverFadeDelegate", "com.tencent.mm.feature.sns.SnsCoverFadeImageService");
        } else {
            lVar = null;
        }
        this.delegate = lVar;
    }

    public static void r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 c17858x5da04085, java.lang.String userName, long j17, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        c17858x5da04085.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        c17858x5da04085.n(userName, j17, str, 0, z17);
    }

    public final fe0.e4 getDelegate() {
        return this.delegate;
    }

    /* renamed from: getSnsCoverReporter */
    public final v94.i m69728xc4dd7296() {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        v94.i iVar = ((aa4.l) e4Var).f84200g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return iVar;
    }

    /* renamed from: getSourceDecodeCallback */
    public final yz5.l m69729xe0686dc4() {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        yz5.l lVar = ((aa4.l) e4Var).f84198e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return lVar;
    }

    public final void n(java.lang.String userName, long j17, java.lang.String str, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        fe0.e4 e4Var = this.delegate;
        if (e4Var != null) {
            aa4.l lVar = (aa4.l) e4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverFadeImageView", "SnsCoverFadeImageView load cover,imagePath:" + str);
            lVar.f84203m = userName;
            lVar.f84204n = j17;
            lVar.f84205o = i17;
            lVar.f84206p = z17;
            if (str != null && r26.i0.y(str, "http", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                v94.i iVar = lVar.f84200g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                if (iVar != null) {
                    ((ba4.a) iVar).g(false);
                }
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2.f247453g.a(userName);
                pc4.d dVar = pc4.d.f434943a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableSnsCoverLoadByMars", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_cover_load_by_mars, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableSnsCoverLoadByMars", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                if (fj6) {
                    java.lang.String str2 = userName + '-' + j17;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().n(a17, str, str2, true, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k, "", "") == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().c(lVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                        return;
                    } else {
                        if (!com.p314xaae8f345.mm.vfs.w6.j(a17)) {
                            lVar.e(str2, a17);
                        }
                        lVar.f(a17, i17, z17);
                    }
                } else {
                    n11.a b17 = n11.a.b();
                    o11.f fVar = new o11.f();
                    fVar.f423615f = a17;
                    fVar.f423611b = true;
                    b17.d(str, fVar.a(), new aa4.i(userName, j17, a17, lVar, i17, z17, str));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                v94.i iVar2 = lVar.f84200g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                if (iVar2 != null) {
                    ((ba4.a) iVar2).g(true);
                }
                lVar.f(str, i17, z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
    }

    /* renamed from: setImageBitmapWithFade */
    public final void m69730xa362f52a(android.graphics.Bitmap bitmap) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var != null) {
            aa4.l lVar = (aa4.l) e4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (bitmap == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                return;
            }
            if ((bitmap.getHeight() * 1.0f) / bitmap.getWidth() < 1.7777778f) {
                aa4.l.b(lVar, bitmap, bitmap.getWidth(), (int) (bitmap.getWidth() * 1.7777778f), 0, false, 24, null);
            } else {
                pm0.v.X(new aa4.h(lVar, bitmap));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
    }

    /* renamed from: setMode */
    public final void m69731x764d6925(int i17) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f84201h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: setSnsCoverReporter */
    public final void m69732x68da07a2(v94.i iVar) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f84200g = iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: setSourceDecodeCallback */
    public final void m69733x5abb9cd0(yz5.l lVar) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f84198e = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }
}

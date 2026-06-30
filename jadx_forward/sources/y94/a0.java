package y94;

/* loaded from: classes10.dex */
public final class a0 extends yt3.a implements bn5.i {

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f541871f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f541872g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f541873h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f541874i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f541875m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f541876n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f541877o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f541878p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f541879q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f541880r;

    /* renamed from: s, reason: collision with root package name */
    public int f541881s;

    /* renamed from: t, reason: collision with root package name */
    public int f541882t;

    /* renamed from: u, reason: collision with root package name */
    public int f541883u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f541884v;

    /* renamed from: w, reason: collision with root package name */
    public bn5.f f541885w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f541886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f541871f = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f541872g = jz5.h.b(new y94.t(this));
        this.f541873h = jz5.h.b(new y94.j(this));
        this.f541874i = jz5.h.b(new y94.s(this));
        this.f541875m = jz5.h.b(new y94.l(this));
        this.f541876n = jz5.h.b(new y94.v(this));
        this.f541877o = jz5.h.b(y94.z.f541940d);
        this.f541878p = jz5.h.b(y94.u.f541930d);
        this.f541880r = jz5.h.b(new y94.m(this));
        this.f541884v = jz5.h.b(y94.n.f541921d);
    }

    public static final /* synthetic */ boolean A(y94.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        boolean F = a0Var.F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return F;
    }

    public static final /* synthetic */ android.view.View B(y94.a0 a0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.view.View y17 = a0Var.y(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return y17;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa C(y94.a0 a0Var, android.graphics.Bitmap bitmap, android.graphics.Rect rect, java.lang.String str, og3.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        a0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = null;
        if (bitmap != null) {
            try {
                int max = java.lang.Math.max(rect.left, 0);
                int max2 = java.lang.Math.max(rect.top, 0);
                int width = rect.width() + max >= bitmap.getWidth() ? bitmap.getWidth() - max : rect.width();
                int height = rect.height() + max2 >= bitmap.getHeight() ? bitmap.getHeight() - max2 : rect.height();
                zj0.a aVar2 = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar2.c(java.lang.Boolean.FALSE);
                aVar2.c(null);
                aVar2.c(java.lang.Integer.valueOf(height));
                aVar2.c(java.lang.Integer.valueOf(width));
                aVar2.c(java.lang.Integer.valueOf(max2));
                aVar2.c(java.lang.Integer.valueOf(max));
                aVar2.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar2.b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverEffectImagePlugin", "saveBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Ljava/lang/String;Lcom/tencent/mm/plugin/mediabasic/data/MediaBasicType;)Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverEffectImagePlugin", "saveBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Ljava/lang/String;Lcom/tencent/mm/plugin/mediabasic/data/MediaBasicType;)Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa(aVar, str, null, 4, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                c16506x8e746ffa = c16506x8e746ffa2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsCoverEffectImagePlugin", e17, "saveBitmapToImage error", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            return c16506x8e746ffa;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return c16506x8e746ffa;
    }

    public static final /* synthetic */ bn5.f z(y94.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        bn5.f fVar = a0Var.f541885w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return fVar;
    }

    public final android.widget.ImageView D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarImg", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f541873h.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarImg", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return imageView;
    }

    public final android.content.Context E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.content.Context context = (android.content.Context) this.f541880r.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return context;
    }

    public final boolean F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        boolean booleanValue = ((java.lang.Boolean) this.f541884v.mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return booleanValue;
    }

    public final android.widget.TextView G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.TextView textView = (android.widget.TextView) this.f541874i.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return textView;
    }

    public final android.view.ViewGroup H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f541872g.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return viewGroup;
    }

    public final java.lang.String I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f541877o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String str = (java.lang.String) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return str;
    }

    public final void J(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            return;
        }
        qk.l9 l9Var = new qk.l9();
        l9Var.f445765b = false;
        l9Var.f445766c = false;
        l9Var.f445769f = new android.graphics.Rect(H().getLeft(), H().getTop(), H().getRight(), H().getBottom());
        l9Var.f445764a = qk.n9.PHOTO;
        l9Var.f445770g = false;
        l9Var.f445774k = bitmap;
        if (F()) {
            l9Var.f445764a = qk.n9.SNS_COVER;
            l9Var.f445776m = 1.0f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        jz5.g gVar = this.f541878p;
        qk.o9 o9Var = (qk.o9) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        o9Var.d(l9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        qk.o9 o9Var2 = (qk.o9) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        qk.s c17 = o9Var2.c(E());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        ym5.x2 x2Var = (ym5.x2) c17;
        bn5.f m177310x5143ab24 = x2Var.m177310x5143ab24();
        this.f541885w = m177310x5143ab24;
        m177310x5143ab24.m10954xebd28962(android.widget.ImageView.ScaleType.CENTER_CROP);
        m177310x5143ab24.m10956x32f75245(rect);
        if (F()) {
            android.graphics.Bitmap bitmap2 = this.f541886x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (bitmap2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "setBlurBackground bitmap is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            } else {
                um5.d dVar = new um5.d();
                um5.p pVar = dVar.f510677e;
                pVar.f510742r.f510746b = 1;
                dVar.b(bitmap2);
                int width = bitmap2.getWidth();
                dVar.f510674b = width;
                dVar.f510675c = (int) (bitmap2.getWidth() * 1.7777778f);
                pVar.f510726b.b().d(50.0f);
                dVar.a(new y94.w(this, m177310x5143ab24));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            }
            if (rect != null && (m177310x5143ab24 instanceof bn5.l)) {
                ((bn5.l) m177310x5143ab24).m10959x712b8e27(this.f541886x);
            }
        }
        dn5.e eVar = (dn5.e) x2Var.m177311xc3ab3d87();
        if (eVar != null) {
            eVar.m125843x1adb0b7f(true);
        }
        this.f541879q = x2Var.m177317xc879b3f2();
        H().addView(x2Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (F()) {
            android.view.ViewGroup H = H();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBorderView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f541875m).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBorderView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            H.bringChildToFront(imageView);
            H().bringChildToFront(G());
            H().bringChildToFront(D());
            H().invalidate();
            H().requestLayout();
            bn5.f fVar = this.f541885w;
            bn5.l lVar = fVar instanceof bn5.l ? (bn5.l) fVar : null;
            if (lVar != null) {
                lVar.m10958xc9a4b727(this);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    public final void K(float f17, float f18, long j17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAlphaAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.ImageView D = D();
        if (D != null && (animate2 = D.animate()) != null && (alpha2 = animate2.alpha(f18)) != null && (duration2 = alpha2.setDuration(j17)) != null && (listener2 = duration2.setListener(new y94.x(f17, this, f18))) != null) {
            listener2.start();
        }
        android.widget.TextView G = G();
        if (G != null && (animate = G.animate()) != null && (alpha = animate.alpha(f18)) != null && (duration = alpha.setDuration(j17)) != null && (listener = duration.setListener(new y94.y(f17, this, f18))) != null) {
            listener.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAlphaAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    public final void L(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateResetBtnState", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        jz5.g gVar = this.f541876n;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (textView != null) {
            textView.setEnabled(z17);
        }
        int color = z17 ? -1 : E().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateResetBtnState", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        l45.q qVar = this.f541879q;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
        p3325xe03a0797.p3326xc267989b.z0.d(this.f541871f, this + " onRelease", null, 2, null);
        bn5.f fVar = this.f541885w;
        bn5.l lVar = fVar instanceof bn5.l ? (bn5.l) fVar : null;
        if (lVar != null) {
            lVar.m10958xc9a4b727(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (r10.getHeight() > r8) goto L18;
     */
    @Override // yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r18) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y94.a0.t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }
}

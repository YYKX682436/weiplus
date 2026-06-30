package u34;

/* loaded from: classes4.dex */
public class g implements t34.a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f505955a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18404x4fbee7be f505956b;

    /* renamed from: c, reason: collision with root package name */
    public s34.u f505957c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f505958d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f505959e = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // t34.a
    public void a(android.content.Context context, s34.x xVar, android.view.ViewGroup viewGroup, android.animation.Animator.AnimatorListener animatorListener) {
        java.lang.String c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        this.f505958d = animatorListener;
        this.f505957c = xVar.f76726x352a9be7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18404x4fbee7be c18404x4fbee7be = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18404x4fbee7be(context);
        this.f505956b = c18404x4fbee7be;
        viewGroup.addView(c18404x4fbee7be, new android.view.ViewGroup.LayoutParams(-1, -1));
        s34.u uVar = this.f505957c;
        if (uVar == null) {
            d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return;
        }
        java.lang.String str = uVar.f76719x4fc233f9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "loadSpriteImage:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        } else {
            try {
                c17 = c(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, exp=" + th6.toString());
            }
            if (android.text.TextUtils.isEmpty(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, !fileExists, start download");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                za4.t0.b("adId", str, true, 0, 0, new u34.f(this, str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            } else {
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(c17, null);
                if (J2 != null) {
                    this.f505955a = J2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "loadLongSpriteImage succ");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, bitmap==null");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 19);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                }
            }
        }
        android.graphics.Bitmap bitmap = this.f505955a;
        if (bitmap == null) {
            d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18404x4fbee7be c18404x4fbee7be2 = this.f505956b;
            s34.u uVar2 = this.f505957c;
            c18404x4fbee7be2.j(bitmap, uVar2.f484315a, uVar2.f484317c, uVar2.f484316b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        }
    }

    @Override // t34.a
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18404x4fbee7be c18404x4fbee7be = this.f505956b;
        if (c18404x4fbee7be != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdSphereAnimView", "start");
            c18404x4fbee7be.invalidate();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            this.f505959e.postDelayed(new u34.e(this), this.f505957c.f484317c + 50);
        } else {
            d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }

    public final java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "url empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return "";
        }
        java.lang.String e17 = a84.m.e(str);
        if (com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "pathForImgMM exists");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return e17;
        }
        java.lang.String k17 = za4.t0.k(str);
        if (com.p314xaae8f345.mm.vfs.w6.j(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "pathForImg exists");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return k17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomSpriteAnimScene", "no local imgFile");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        return "";
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyAnimEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = this.f505958d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyAnimEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }

    @Override // t34.a
    /* renamed from: onDestroy */
    public void mo165846xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        this.f505956b.g();
        this.f505959e.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }
}

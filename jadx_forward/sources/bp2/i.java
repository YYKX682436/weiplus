package bp2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f104584a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f104585b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f104586c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f104587d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.AnimatorSet f104588e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f104589f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f104590g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f104591h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f104592i;

    /* renamed from: j, reason: collision with root package name */
    public int f104593j;

    /* renamed from: k, reason: collision with root package name */
    public final float f104594k;

    /* renamed from: l, reason: collision with root package name */
    public final long f104595l;

    /* renamed from: m, reason: collision with root package name */
    public long f104596m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f104597n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f104598o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f104599p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f104600q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f104601r;

    public i(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f104584a = context;
        this.f104585b = recyclerView;
        this.f104587d = new int[2];
        this.f104593j = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9d);
        this.f104594k = 1.077f;
        this.f104595l = 500L;
        this.f104598o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f104600q = c92.g.f121271a.b();
    }

    public static final void a(bp2.i iVar) {
        if (iVar.f104601r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardPreViewAnimationHelper", "stop return for hasStop:" + iVar.f104601r);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardPreViewAnimationHelper", "stop hasStop:" + iVar.f104601r);
        java.lang.Runnable runnable = iVar.f104599p;
        jz5.f0 f0Var = null;
        if (runnable != null) {
            iVar.f104598o.mo50300x3fa464aa(runnable);
            iVar.f104599p = null;
        }
        android.animation.AnimatorSet animatorSet = iVar.f104588e;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        android.view.View view = iVar.f104586c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View rootView = view.getRootView();
        android.view.View findViewWithTag = rootView.findViewWithTag("FinderLiveCardPreViewAnimationHelper");
        if (findViewWithTag != null) {
            findViewWithTag.setOnTouchListener(null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardPreViewAnimationHelper", "detachFloatView view:" + findViewWithTag);
        android.view.TextureView textureView = iVar.f104589f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardPreViewAnimationHelper", "detachMaskView videoView:" + textureView + " surfaceTexture:" + textureView.getSurfaceTexture());
        android.view.View view2 = iVar.f104586c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        textureView.setSurfaceTextureListener(new bp2.g());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) view2.findViewWithTag("nearby-live-preview-view-tag");
        if (c14522x8ffd8962 != null) {
            android.view.ViewParent parent = c14522x8ffd8962.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            viewGroup.removeView(c14522x8ffd8962);
            if (textureView.getSurfaceTexture() != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14522x8ffd8962.m58380x356ded51().mo46536x4ee17f0a().getSurfaceTexture(), textureView.getSurfaceTexture())) {
                android.view.TextureView mo46536x4ee17f0a = c14522x8ffd8962.m58380x356ded51().mo46536x4ee17f0a();
                android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
                mo46536x4ee17f0a.setSurfaceTexture(surfaceTexture);
            }
            viewGroup.addView(c14522x8ffd8962);
            c14522x8ffd8962.m58380x356ded51().mo46536x4ee17f0a().setSurfaceTextureListener(iVar.f104597n);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveCardPreViewAnimationHelper", "liveView is null.");
        }
        android.view.TextureView textureView2 = iVar.f104589f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureView2);
        android.view.ViewParent parent2 = textureView2.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent2;
        android.view.TextureView textureView3 = iVar.f104589f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureView3);
        viewGroup2.removeView(textureView3);
        android.view.TextureView textureView4 = iVar.f104589f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureView4);
        viewGroup2.addView(textureView4);
        ((android.view.ViewGroup) rootView).removeView(findViewWithTag);
        iVar.f104601r = true;
    }
}

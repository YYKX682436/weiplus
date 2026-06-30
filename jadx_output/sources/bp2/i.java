package bp2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f23051a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f23052b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f23053c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f23054d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.AnimatorSet f23055e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f23056f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f23057g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f23058h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f23059i;

    /* renamed from: j, reason: collision with root package name */
    public int f23060j;

    /* renamed from: k, reason: collision with root package name */
    public final float f23061k;

    /* renamed from: l, reason: collision with root package name */
    public final long f23062l;

    /* renamed from: m, reason: collision with root package name */
    public long f23063m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f23064n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f23065o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f23066p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23067q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23068r;

    public i(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f23051a = context;
        this.f23052b = recyclerView;
        this.f23054d = new int[2];
        this.f23060j = context.getResources().getColor(com.tencent.mm.R.color.a9d);
        this.f23061k = 1.077f;
        this.f23062l = 500L;
        this.f23065o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f23067q = c92.g.f39738a.b();
    }

    public static final void a(bp2.i iVar) {
        if (iVar.f23068r) {
            com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "stop return for hasStop:" + iVar.f23068r);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "stop hasStop:" + iVar.f23068r);
        java.lang.Runnable runnable = iVar.f23066p;
        jz5.f0 f0Var = null;
        if (runnable != null) {
            iVar.f23065o.removeCallbacks(runnable);
            iVar.f23066p = null;
        }
        android.animation.AnimatorSet animatorSet = iVar.f23055e;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        android.view.View view = iVar.f23053c;
        kotlin.jvm.internal.o.d(view);
        android.view.View rootView = view.getRootView();
        android.view.View findViewWithTag = rootView.findViewWithTag("FinderLiveCardPreViewAnimationHelper");
        if (findViewWithTag != null) {
            findViewWithTag.setOnTouchListener(null);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "detachFloatView view:" + findViewWithTag);
        android.view.TextureView textureView = iVar.f23056f;
        kotlin.jvm.internal.o.d(textureView);
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "detachMaskView videoView:" + textureView + " surfaceTexture:" + textureView.getSurfaceTexture());
        android.view.View view2 = iVar.f23053c;
        kotlin.jvm.internal.o.d(view2);
        textureView.setSurfaceTextureListener(new bp2.g());
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) view2.findViewWithTag("nearby-live-preview-view-tag");
        if (nearbyLivePreviewView != null) {
            android.view.ViewParent parent = nearbyLivePreviewView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            viewGroup.removeView(nearbyLivePreviewView);
            if (textureView.getSurfaceTexture() != null && !kotlin.jvm.internal.o.b(nearbyLivePreviewView.getRenderView().getVideoView().getSurfaceTexture(), textureView.getSurfaceTexture())) {
                android.view.TextureView videoView = nearbyLivePreviewView.getRenderView().getVideoView();
                android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                kotlin.jvm.internal.o.d(surfaceTexture);
                videoView.setSurfaceTexture(surfaceTexture);
            }
            viewGroup.addView(nearbyLivePreviewView);
            nearbyLivePreviewView.getRenderView().getVideoView().setSurfaceTextureListener(iVar.f23064n);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveCardPreViewAnimationHelper", "liveView is null.");
        }
        android.view.TextureView textureView2 = iVar.f23056f;
        kotlin.jvm.internal.o.d(textureView2);
        android.view.ViewParent parent2 = textureView2.getParent();
        kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent2;
        android.view.TextureView textureView3 = iVar.f23056f;
        kotlin.jvm.internal.o.d(textureView3);
        viewGroup2.removeView(textureView3);
        android.view.TextureView textureView4 = iVar.f23056f;
        kotlin.jvm.internal.o.d(textureView4);
        viewGroup2.addView(textureView4);
        ((android.view.ViewGroup) rootView).removeView(findViewWithTag);
        iVar.f23068r = true;
    }
}

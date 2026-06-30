package cj2;

/* loaded from: classes10.dex */
public final class h extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f41865d;

    /* renamed from: e, reason: collision with root package name */
    public final zh2.c f41866e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LivePreviewView f41867f;

    /* renamed from: g, reason: collision with root package name */
    public final fg2.z0 f41868g;

    /* renamed from: h, reason: collision with root package name */
    public km2.q f41869h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f41870i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f41871m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f41872n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41873o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, int i17, zh2.c pluginAbility, com.tencent.mm.live.core.view.LivePreviewView previewView) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(previewView, "previewView");
        this.f41865d = i17;
        this.f41866e = pluginAbility;
        this.f41867f = previewView;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.av_, (android.view.ViewGroup) this, false);
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
        int i18 = com.tencent.mm.R.id.gxq;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) x4.b.a(inflate, com.tencent.mm.R.id.gxq);
        if (guideline != null) {
            i18 = com.tencent.mm.R.id.ilu;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.ilu);
            if (imageView != null) {
                i18 = com.tencent.mm.R.id.imn;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.tencent.mm.R.id.imn);
                if (progressBar != null) {
                    i18 = com.tencent.mm.R.id.jis;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.jis);
                    if (imageView2 != null) {
                        i18 = com.tencent.mm.R.id.f485919jj2;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f485919jj2);
                        if (imageView3 != null) {
                            i18 = com.tencent.mm.R.id.jj8;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.jj8);
                            if (textView != null) {
                                i18 = com.tencent.mm.R.id.jjk;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.jjk);
                                if (textView2 != null) {
                                    i18 = com.tencent.mm.R.id.jjl;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.jjl);
                                    if (textView3 != null) {
                                        i18 = com.tencent.mm.R.id.jjm;
                                        android.view.TextureView textureView = (android.view.TextureView) x4.b.a(inflate, com.tencent.mm.R.id.jjm);
                                        if (textureView != null) {
                                            i18 = com.tencent.mm.R.id.jjn;
                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.jjn);
                                            if (frameLayout != null) {
                                                i18 = com.tencent.mm.R.id.n0d;
                                                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.n0d);
                                                if (a17 != null) {
                                                    i18 = com.tencent.mm.R.id.n0l;
                                                    android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.n0l);
                                                    if (a18 != null) {
                                                        this.f41868g = new fg2.z0(roundCornerConstraintLayout, roundCornerConstraintLayout, guideline, imageView, progressBar, imageView2, imageView3, textView, textView2, textView3, textureView, frameLayout, a17, a18);
                                                        cj2.f fVar = new cj2.f(this);
                                                        addView(roundCornerConstraintLayout);
                                                        textureView.setOpaque(false);
                                                        textureView.setSurfaceTextureListener(fVar);
                                                        imageView.setVisibility(8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    private final java.lang.String getAnchorSdkUserId() {
        java.lang.String str = ((mm2.e1) this.f41866e.g().a(mm2.e1.class)).f328987q.f380301n;
        return str == null ? "" : str;
    }

    public final void a(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f41872n;
        if (imageView != null) {
            viewGroup.removeView(imageView);
        }
        android.widget.ImageView imageView2 = this.f41872n;
        if (imageView2 == null) {
            imageView2 = new android.widget.ImageView(com.tencent.mm.sdk.platformtools.x2.f193071a);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageView2.setTag("video_thumb_image");
        }
        this.f41872n = imageView2;
        imageView2.setImageBitmap(bitmap);
        android.widget.ImageView imageView3 = this.f41872n;
        android.view.ViewParent parent = imageView3 != null ? imageView3.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f41872n);
        }
        viewGroup.addView(this.f41872n, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMicPreviewWidget_");
        sb6.append(this.f41865d);
        sb6.append('_');
        km2.q qVar = this.f41869h;
        sb6.append(qVar != null ? qVar.f309170a : null);
        com.tencent.mars.xlog.Log.i(sb6.toString(), str);
    }

    public final void c() {
        android.view.TextureView videoView;
        km2.q qVar = this.f41869h;
        if (qVar != null) {
            b("onPanelDismiss userId: " + qVar.f309170a);
            fg2.z0 z0Var = this.f41868g;
            if (z0Var.f262415i.getVisibility() == 0 && this.f41870i != null) {
                boolean b17 = kotlin.jvm.internal.o.b(qVar.f309170a, getAnchorSdkUserId());
                android.view.TextureView textureView = z0Var.f262415i;
                android.widget.FrameLayout frameLayout = z0Var.f262416j;
                com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f41867f;
                if (b17) {
                    android.view.TextureView cameraView = livePreviewView.getCameraView();
                    if (cameraView != null) {
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        android.graphics.SurfaceTexture surfaceTexture = this.f41870i;
                        if (surfaceTexture != null) {
                            cameraView.setSurfaceTexture(surfaceTexture);
                            android.view.ViewParent parent = cameraView.getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(cameraView);
                                viewGroup.addView(cameraView);
                            }
                        }
                        cameraView.setSurfaceTextureListener(this.f41871m);
                    }
                } else {
                    java.lang.String str = qVar.f309170a;
                    com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.renderRatioLayout;
                    if (str == null) {
                        str = "";
                    }
                    com.tencent.rtmp.ui.TXCloudVideoView videoView2 = tRTCVideoRatioLayout.a(str, 0).getVideoView();
                    if (videoView2 != null && (videoView = videoView2.getVideoView()) != null) {
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        android.graphics.SurfaceTexture surfaceTexture2 = this.f41870i;
                        if (surfaceTexture2 != null) {
                            b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + qVar.f309170a);
                            videoView.setSurfaceTexture(surfaceTexture2);
                            videoView2.removeVideoView();
                            videoView2.addVideoView(videoView);
                        }
                        videoView.setSurfaceTextureListener(this.f41871m);
                        android.widget.ImageView imageView = this.f41872n;
                        if (imageView != null) {
                            videoView2.removeView(imageView);
                        }
                    }
                }
            }
        }
        this.f41870i = null;
        this.f41871m = null;
    }

    public final void d(km2.q qVar, android.widget.ImageView imageView) {
        if (this.f41868g.f262408b.getVisibility() == 0) {
            b("showBlurImage same");
            return;
        }
        this.f41868g.f262408b.setVisibility(0);
        java.lang.String str = qVar.f309171b;
        if (!(str == null || str.length() == 0)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.c().c(new mn2.e0(qVar.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329957h));
            return;
        }
        android.graphics.Bitmap decodeResource = bp.b.decodeResource(getContext().getResources(), com.tencent.mm.R.raw.default_avatar, null);
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4);
        ((ku5.t0) ku5.t0.f312615d).g(new po0.d(decodeResource, new cj2.g(imageView), (4 & 4) != 0 ? 20.0f : 0.0f, (4 & 2) == 0 ? color : 0));
    }

    public final void e() {
        km2.q qVar = this.f41869h;
        if (qVar != null) {
            fg2.z0 z0Var = this.f41868g;
            z0Var.f262408b.setVisibility(0);
            z0Var.f262409c.setVisibility(0);
            android.widget.ImageView loadingBgView = z0Var.f262408b;
            kotlin.jvm.internal.o.f(loadingBgView, "loadingBgView");
            d(qVar, loadingBgView);
        }
    }

    public final void f() {
        km2.q qVar = this.f41869h;
        fg2.z0 z0Var = this.f41868g;
        if (qVar != null) {
            z0Var.f262414h.setVisibility(0);
            int i17 = this.f41865d;
            android.widget.TextView textView = z0Var.f262414h;
            if (i17 == 3) {
                textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.d5o));
            } else {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.widget.TextView textView2 = z0Var.f262412f;
                android.content.Context context = textView2.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.text.TextPaint paint = textView2.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                textView.setText(c61.yb.nf(ybVar, context, paint, zl2.r4.D0(zl2.r4.f473950a, qVar.f309172c, qVar.f309173d, false, 4, null), 0, 8, null));
            }
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f41870i;
        if (surfaceTexture != null) {
            b("showVideoView same restart setSurfaceTexture return");
            if (kotlin.jvm.internal.o.b(z0Var.f262415i.getSurfaceTexture(), surfaceTexture)) {
                return;
            }
            z0Var.f262415i.setSurfaceTexture(surfaceTexture);
            return;
        }
        b("showVideoView");
        km2.q qVar2 = this.f41869h;
        if (qVar2 != null) {
            boolean b17 = kotlin.jvm.internal.o.b(qVar2.f309170a, getAnchorSdkUserId());
            com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f41867f;
            if (b17) {
                android.view.TextureView cameraView = livePreviewView.getCameraView();
                if (cameraView != null) {
                    this.f41871m = cameraView.getSurfaceTextureListener();
                    android.graphics.SurfaceTexture surfaceTexture2 = cameraView.getSurfaceTexture();
                    if (surfaceTexture2 != null) {
                        b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + qVar2.f309170a);
                        cameraView.setSurfaceTextureListener(new ig2.p("FinderLiveMicPreviewWidget_Ori", false));
                        this.f41870i = surfaceTexture2;
                        android.graphics.Bitmap bitmap = cameraView.getBitmap();
                        z0Var.f262415i.setSurfaceTexture(surfaceTexture2);
                        android.view.ViewParent parent = cameraView.getParent();
                        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(cameraView);
                            viewGroup.addView(cameraView);
                            a(viewGroup, bitmap);
                        }
                        android.widget.FrameLayout frameLayout = z0Var.f262416j;
                        android.view.TextureView textureView = z0Var.f262415i;
                        frameLayout.removeView(textureView);
                        frameLayout.addView(textureView);
                        textureView.getViewTreeObserver().addOnPreDrawListener(new cj2.e(this, surfaceTexture2));
                        return;
                    }
                    return;
                }
                return;
            }
            java.lang.String str = qVar2.f309170a;
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.renderRatioLayout;
            if (str == null) {
                str = "";
            }
            com.tencent.rtmp.ui.TXCloudVideoView videoView = tRTCVideoRatioLayout.a(str, 0).getVideoView();
            if (videoView == null || videoView.getVideoView() == null) {
                return;
            }
            this.f41871m = videoView.getVideoView().getSurfaceTextureListener();
            android.view.TextureView videoView2 = videoView.getVideoView();
            android.graphics.Bitmap bitmap2 = videoView2.getBitmap();
            android.graphics.SurfaceTexture surfaceTexture3 = videoView2.getSurfaceTexture();
            if (surfaceTexture3 != null) {
                b("showVideoView setSurfaceTexture: " + surfaceTexture3 + " userId: " + qVar2.f309170a);
                videoView2.setSurfaceTextureListener(new ig2.p("FinderLiveMicPreviewWidget_Ori", false));
                this.f41870i = surfaceTexture3;
                z0Var.f262415i.setSurfaceTexture(surfaceTexture3);
                videoView.removeVideoView();
                videoView.addVideoView(videoView2);
                a(videoView, bitmap2);
            }
            android.widget.FrameLayout frameLayout2 = z0Var.f262416j;
            android.view.TextureView textureView2 = z0Var.f262415i;
            frameLayout2.removeView(textureView2);
            z0Var.f262416j.addView(textureView2);
        }
    }

    public final int getMicType() {
        return this.f41865d;
    }

    public final zh2.c getPluginAbility() {
        return this.f41866e;
    }

    public final com.tencent.mm.live.core.view.LivePreviewView getPreviewView() {
        return this.f41867f;
    }

    public final void setCorner(int i17) {
        this.f41868g.f262407a.setRadius(i17);
    }
}

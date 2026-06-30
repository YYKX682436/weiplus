package com.tencent.mm.plugin.ball.appbrand;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/ball/appbrand/FloatBallVideoPanelView;", "Landroid/widget/FrameLayout;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnCoverClickListener", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "n", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "getBallInfo", "()Lcom/tencent/mm/plugin/ball/model/BallInfo;", "setBallInfo", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "ballInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FloatBallVideoPanelView extends android.widget.FrameLayout implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f92977o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f92978d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f92979e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f92980f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.TextureView f92981g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnClickListener f92982h;

    /* renamed from: i, reason: collision with root package name */
    public int f92983i;

    /* renamed from: m, reason: collision with root package name */
    public int f92984m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.ball.model.BallInfo ballInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallVideoPanelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int a(int i17) {
        return bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ting.RepairerConfigCustomFloatBallFixedSize()) == 1 ? (int) (((i17 * 1.0f) * j65.f.g()) / 400) : i17;
    }

    public final void b() {
        android.widget.ImageView imageView = this.f92978d;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.drawable.cvi);
        }
        android.widget.ImageView imageView2 = this.f92979e;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        android.widget.ImageView imageView3 = this.f92979e;
        if (imageView3 != null) {
            imageView3.setColorFilter(getContext().getResources().getColor(com.tencent.mm.R.color.abx));
        }
    }

    public final void c(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "updateCover  %s", str);
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallVideoPanelView", "onLoadCoverFailed");
            pm0.v.X(new hp1.d(this));
            return;
        }
        if (i17 != 0 && i18 != 0) {
            this.f92984m = i17;
            this.f92983i = i18;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            b();
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new hp1.c(str, this));
        }
    }

    public final void d(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "updateViewSize  width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 || i18 == 0) {
            return;
        }
        this.f92984m = i17;
        this.f92983i = i18;
        android.widget.ImageView imageView = this.f92978d;
        android.view.ViewGroup.LayoutParams layoutParams3 = null;
        if (imageView != null) {
            if (imageView == null || (layoutParams2 = imageView.getLayoutParams()) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2.width = i17;
                layoutParams2.height = i18;
            }
            imageView.setLayoutParams(layoutParams2);
        }
        android.view.TextureView textureView = this.f92981g;
        if (textureView == null) {
            return;
        }
        if (textureView != null && (layoutParams = textureView.getLayoutParams()) != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
            layoutParams3 = layoutParams;
        }
        textureView.setLayoutParams(layoutParams3);
    }

    public final com.tencent.mm.plugin.ball.model.BallInfo getBallInfo() {
        return this.ballInfo;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        this.f92980f = new android.view.Surface(surfaceTexture);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("surface", this.f92980f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.Surface surface = this.f92980f;
        objArr[0] = java.lang.Integer.valueOf(surface != null ? surface.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd onSurfaceTextureAvailable holder.surface:%d", objArr);
        bundle.putInt("width", i17);
        bundle.putInt("height", i18);
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.ballInfo;
        kotlin.jvm.internal.o.d(ballInfo);
        H0.T0(ballInfo, 9, 1, bundle);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.Surface surface2 = this.f92980f;
        objArr[0] = java.lang.Integer.valueOf(surface2 != null ? surface2.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceDestroyed holder.surface:%d", objArr);
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.ballInfo;
        kotlin.jvm.internal.o.d(ballInfo);
        H0.T0(ballInfo, 9, 2, new android.os.Bundle());
        android.view.Surface surface3 = this.f92980f;
        if (surface3 != null) {
            surface3.release();
        }
        this.f92980f = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        java.lang.Object[] objArr = new java.lang.Object[3];
        android.view.Surface surface = this.f92980f;
        objArr[0] = java.lang.Integer.valueOf(surface != null ? surface.hashCode() : 0);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd onSurfaceTextureSizeChanged holder.surface:%d, width:%d, height:%d", objArr);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    public final void setBallInfo(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.ballInfo = ballInfo;
    }

    public final void setOnCoverClickListener(android.view.View.OnClickListener onClickListener) {
        this.f92982h = onClickListener;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f92980f = holder.getSurface();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("surface", holder.getSurface());
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceChanged holder.surface:%d", java.lang.Integer.valueOf(holder.getSurface().hashCode()));
        bundle.putInt("width", i18);
        bundle.putInt("height", i19);
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.ballInfo;
        kotlin.jvm.internal.o.d(ballInfo);
        H0.T0(ballInfo, 9, 1, bundle);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceDestroyed holder.surface:%d", java.lang.Integer.valueOf(holder.getSurface().hashCode()));
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.ballInfo;
        kotlin.jvm.internal.o.d(ballInfo);
        H0.T0(ballInfo, 9, 2, new android.os.Bundle());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallVideoPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.duz, this);
        this.f92978d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.rpq);
        this.f92979e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.rpp);
        android.view.TextureView textureView = (android.view.TextureView) inflate.findViewById(com.tencent.mm.R.id.txk);
        this.f92981g = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this);
        }
        android.widget.ImageView imageView = this.f92978d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f92978d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new hp1.a(this));
        }
        int a17 = a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr));
        int a18 = a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr));
        android.widget.ImageView imageView3 = this.f92978d;
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a17;
                layoutParams.height = a18;
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    com.tencent.mm.ui.kk.d(this, a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479705d0)));
                }
            } else {
                layoutParams = null;
            }
            imageView3.setLayoutParams(layoutParams);
        }
        this.f92984m = a17;
        this.f92983i = a18;
        b();
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.rpr);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.ball.appbrand.FloatBallRadiusLayout");
        ((com.tencent.mm.plugin.ball.appbrand.FloatBallRadiusLayout) findViewById).setRadius(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
    }
}

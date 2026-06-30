package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/ball/appbrand/FloatBallVideoPanelView;", "Landroid/widget/FrameLayout;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnCoverClickListener", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "n", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "getBallInfo", "()Lcom/tencent/mm/plugin/ball/model/BallInfo;", "setBallInfo", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "ballInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView */
/* loaded from: classes14.dex */
public final class SurfaceHolderCallbackC12878x44b43bc9 extends android.widget.FrameLayout implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f174510o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f174511d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f174512e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f174513f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.TextureView f174514g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnClickListener f174515h;

    /* renamed from: i, reason: collision with root package name */
    public int f174516i;

    /* renamed from: m, reason: collision with root package name */
    public int f174517m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurfaceHolderCallbackC12878x44b43bc9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int a(int i17) {
        return bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20752x27f0bfc7()) == 1 ? (int) (((i17 * 1.0f) * j65.f.g()) / 400) : i17;
    }

    public final void b() {
        android.widget.ImageView imageView = this.f174511d;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cvi);
        }
        android.widget.ImageView imageView2 = this.f174512e;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        android.widget.ImageView imageView3 = this.f174512e;
        if (imageView3 != null) {
            imageView3.setColorFilter(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abx));
        }
    }

    public final void c(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "updateCover  %s", str);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallVideoPanelView", "onLoadCoverFailed");
            pm0.v.X(new hp1.d(this));
            return;
        }
        if (i17 != 0 && i18 != 0) {
            this.f174517m = i17;
            this.f174516i = i18;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            b();
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new hp1.c(str, this));
        }
    }

    public final void d(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "updateViewSize  width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 || i18 == 0) {
            return;
        }
        this.f174517m = i17;
        this.f174516i = i18;
        android.widget.ImageView imageView = this.f174511d;
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
        android.view.TextureView textureView = this.f174514g;
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

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d getBallInfo() {
        return this.ballInfo;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        this.f174513f = new android.view.Surface(surfaceTexture);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("surface", this.f174513f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.Surface surface = this.f174513f;
        objArr[0] = java.lang.Integer.valueOf(surface != null ? surface.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd onSurfaceTextureAvailable holder.surface:%d", objArr);
        bundle.putInt("width", i17);
        bundle.putInt("height", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.ballInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12886x91aa2b6d);
        H0.T0(c12886x91aa2b6d, 9, 1, bundle);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.Surface surface2 = this.f174513f;
        objArr[0] = java.lang.Integer.valueOf(surface2 != null ? surface2.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceDestroyed holder.surface:%d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.ballInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12886x91aa2b6d);
        H0.T0(c12886x91aa2b6d, 9, 2, new android.os.Bundle());
        android.view.Surface surface3 = this.f174513f;
        if (surface3 != null) {
            surface3.release();
        }
        this.f174513f = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        java.lang.Object[] objArr = new java.lang.Object[3];
        android.view.Surface surface = this.f174513f;
        objArr[0] = java.lang.Integer.valueOf(surface != null ? surface.hashCode() : 0);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd onSurfaceTextureSizeChanged holder.surface:%d, width:%d, height:%d", objArr);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    /* renamed from: setBallInfo */
    public final void m54025x46265cf(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.ballInfo = c12886x91aa2b6d;
    }

    /* renamed from: setOnCoverClickListener */
    public final void m54026xe6095fa6(android.view.View.OnClickListener onClickListener) {
        this.f174515h = onClickListener;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f174513f = holder.getSurface();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("surface", holder.getSurface());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceChanged holder.surface:%d", java.lang.Integer.valueOf(holder.getSurface().hashCode()));
        bundle.putInt("width", i18);
        bundle.putInt("height", i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.ballInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12886x91aa2b6d);
        H0.T0(c12886x91aa2b6d, 9, 1, bundle);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVideoPanelView", "ljd surfaceDestroyed holder.surface:%d", java.lang.Integer.valueOf(holder.getSurface().hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.ballInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12886x91aa2b6d);
        H0.T0(c12886x91aa2b6d, 9, 2, new android.os.Bundle());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceHolderCallbackC12878x44b43bc9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.duz, this);
        this.f174511d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rpq);
        this.f174512e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rpp);
        android.view.TextureView textureView = (android.view.TextureView) inflate.findViewById(com.p314xaae8f345.mm.R.id.txk);
        this.f174514g = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this);
        }
        android.widget.ImageView imageView = this.f174511d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f174511d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new hp1.a(this));
        }
        int a17 = a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
        int a18 = a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
        android.widget.ImageView imageView3 = this.f174511d;
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a17;
                layoutParams.height = a18;
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    com.p314xaae8f345.mm.ui.kk.d(this, a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561238d0)));
                }
            } else {
                layoutParams = null;
            }
            imageView3.setLayoutParams(layoutParams);
        }
        this.f174517m = a17;
        this.f174516i = a18;
        b();
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.rpr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.ball.appbrand.FloatBallRadiusLayout");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.C12877x5eb5f057) findViewById).m54023x205ac394(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
    }
}
